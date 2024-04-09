// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.spark

import com.azure.cosmos.spark.diagnostics.BasicLoggingTrait
import org.apache.spark.sql.Row
import org.apache.spark.sql.catalyst.encoders.ExpressionEncoder
import org.apache.spark.sql.types.StructType

import java.time.Instant
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.{ConcurrentLinkedQueue, Executors, TimeUnit}
import scala.collection.concurrent.TrieMap
import scala.util.control.NonFatal

/**
 * Spark serializers are not thread-safe - and expensive to create (dynamic code generation)
 * So we will use this object pool to allow reusing serializers based on the targeted schema.
 * The main purpose for pooling serializers (vs. creating new ones in each PartitionReader) is for Structured
 * Streaming scenarios where PartitionReaders for the same schema could be created every couple of 100
 * milliseconds
 * A clean-up task is used to purge serializers for schemas which weren't used anymore
 * For each schema we have an object pool that will use a soft-limit to limit the memory footprint
 */
abstract class RowSerializerPoolBase[A <: RowSerializerQueueBase] extends BasicLoggingTrait {
  private[this] val cleanUpIntervalInSeconds = 300
  private[this] val expirationIntervalInSeconds = 1800
  protected val schemaScopedSerializerMap =
    new TrieMap[StructType, A]
  private[this] val executorService = Executors.newSingleThreadScheduledExecutor(SparkUtils.daemonThreadFactory())

  executorService.scheduleWithFixedDelay(
    () => this.onCleanUp(),
    cleanUpIntervalInSeconds,
    cleanUpIntervalInSeconds,
    TimeUnit.SECONDS)

  def getOrCreateSerializer(schema: StructType): ExpressionEncoder.Serializer[Row]

  def returnSerializerToPool(schema: StructType, serializer: ExpressionEncoder.Serializer[Row]): Boolean

  private[this] def onCleanUp(): Unit = {
    try {
      val expirationThreshold: Long = Instant.now.minusSeconds(expirationIntervalInSeconds).toEpochMilli

      schemaScopedSerializerMap
        .readOnlySnapshot()
        .foreach(keyValuePair => {
          if (keyValuePair._2.getLastBorrowedAny < expirationThreshold) {
            schemaScopedSerializerMap.remove(keyValuePair._1, keyValuePair._2)
          }
        })
    } catch {
      case NonFatal(e) => logError("Callback onCleanup invocation failed.", e)
    }
  }
}

/**
 * A slim wrapper around ConcurrentLinkedQueue with the purpose of
 * - having a soft-limit on how many serializers can be pooled - there is no need to have an
 *   exact limit - best effort is acceptable. When we exceed the max size we don't offer
 *   returned serializers to the pool anymore to have a limited memory footprint.
 * - keeping track of when any serializer for a certain schema was used last to allow the owner
 *   to purge serializers for schemas not used anymore.
 */
protected abstract class RowSerializerQueueBase() {
  private val MaxPooledSerializerCount = 256
  protected[this] val objectPool = new ConcurrentLinkedQueue[ExpressionEncoder.Serializer[Row]]()
  protected[this] val estimatedSize = new AtomicLong(0)
  protected[this] val lastBorrowedAny = new AtomicLong(Instant.now.toEpochMilli)

  def borrowSerializer(schema: StructType): ExpressionEncoder.Serializer[Row]

  def returnSerializer(serializer: ExpressionEncoder.Serializer[Row]): Boolean = {
    if (estimatedSize.incrementAndGet() > MaxPooledSerializerCount) {
      estimatedSize.decrementAndGet()
      false
    } else {
      objectPool.offer(serializer)
      true
    }
  }

  def getLastBorrowedAny: Long = lastBorrowedAny.get()
}
