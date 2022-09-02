// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicebus.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.servicebus.models.EntityStatus;
import com.azure.resourcemanager.servicebus.models.MessageCountDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** Description of queue Resource. */
@Fluent
public final class SBQueueInner extends Resource {
    /*
     * Queue Properties
     */
    @JsonProperty(value = "properties")
    private SBQueueProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /**
     * Get the innerProperties property: Queue Properties.
     *
     * @return the innerProperties value.
     */
    private SBQueueProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the countDetails property: Message Count Details.
     *
     * @return the countDetails value.
     */
    public MessageCountDetails countDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().countDetails();
    }

    /**
     * Get the createdAt property: The exact time the message was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.innerProperties() == null ? null : this.innerProperties().createdAt();
    }

    /**
     * Get the updatedAt property: The exact time the message was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedAt();
    }

    /**
     * Get the accessedAt property: Last time a message was sent, or the last time there was a receive request to this
     * queue.
     *
     * @return the accessedAt value.
     */
    public OffsetDateTime accessedAt() {
        return this.innerProperties() == null ? null : this.innerProperties().accessedAt();
    }

    /**
     * Get the sizeInBytes property: The size of the queue, in bytes.
     *
     * @return the sizeInBytes value.
     */
    public Long sizeInBytes() {
        return this.innerProperties() == null ? null : this.innerProperties().sizeInBytes();
    }

    /**
     * Get the messageCount property: The number of messages in the queue.
     *
     * @return the messageCount value.
     */
    public Long messageCount() {
        return this.innerProperties() == null ? null : this.innerProperties().messageCount();
    }

    /**
     * Get the lockDuration property: ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the
     * message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1
     * minute.
     *
     * @return the lockDuration value.
     */
    public Duration lockDuration() {
        return this.innerProperties() == null ? null : this.innerProperties().lockDuration();
    }

    /**
     * Set the lockDuration property: ISO 8601 timespan duration of a peek-lock; that is, the amount of time that the
     * message is locked for other receivers. The maximum value for LockDuration is 5 minutes; the default value is 1
     * minute.
     *
     * @param lockDuration the lockDuration value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withLockDuration(Duration lockDuration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withLockDuration(lockDuration);
        return this;
    }

    /**
     * Get the maxSizeInMegabytes property: The maximum size of the queue in megabytes, which is the size of memory
     * allocated for the queue. Default is 1024.
     *
     * @return the maxSizeInMegabytes value.
     */
    public Integer maxSizeInMegabytes() {
        return this.innerProperties() == null ? null : this.innerProperties().maxSizeInMegabytes();
    }

    /**
     * Set the maxSizeInMegabytes property: The maximum size of the queue in megabytes, which is the size of memory
     * allocated for the queue. Default is 1024.
     *
     * @param maxSizeInMegabytes the maxSizeInMegabytes value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withMaxSizeInMegabytes(Integer maxSizeInMegabytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withMaxSizeInMegabytes(maxSizeInMegabytes);
        return this;
    }

    /**
     * Get the maxMessageSizeInKilobytes property: Maximum size (in KB) of the message payload that can be accepted by
     * the queue. This property is only used in Premium today and default is 1024.
     *
     * @return the maxMessageSizeInKilobytes value.
     */
    public Long maxMessageSizeInKilobytes() {
        return this.innerProperties() == null ? null : this.innerProperties().maxMessageSizeInKilobytes();
    }

    /**
     * Set the maxMessageSizeInKilobytes property: Maximum size (in KB) of the message payload that can be accepted by
     * the queue. This property is only used in Premium today and default is 1024.
     *
     * @param maxMessageSizeInKilobytes the maxMessageSizeInKilobytes value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withMaxMessageSizeInKilobytes(Long maxMessageSizeInKilobytes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withMaxMessageSizeInKilobytes(maxMessageSizeInKilobytes);
        return this;
    }

    /**
     * Get the requiresDuplicateDetection property: A value indicating if this queue requires duplicate detection.
     *
     * @return the requiresDuplicateDetection value.
     */
    public Boolean requiresDuplicateDetection() {
        return this.innerProperties() == null ? null : this.innerProperties().requiresDuplicateDetection();
    }

    /**
     * Set the requiresDuplicateDetection property: A value indicating if this queue requires duplicate detection.
     *
     * @param requiresDuplicateDetection the requiresDuplicateDetection value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withRequiresDuplicateDetection(Boolean requiresDuplicateDetection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withRequiresDuplicateDetection(requiresDuplicateDetection);
        return this;
    }

    /**
     * Get the requiresSession property: A value that indicates whether the queue supports the concept of sessions.
     *
     * @return the requiresSession value.
     */
    public Boolean requiresSession() {
        return this.innerProperties() == null ? null : this.innerProperties().requiresSession();
    }

    /**
     * Set the requiresSession property: A value that indicates whether the queue supports the concept of sessions.
     *
     * @param requiresSession the requiresSession value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withRequiresSession(Boolean requiresSession) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withRequiresSession(requiresSession);
        return this;
    }

    /**
     * Get the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @return the defaultMessageTimeToLive value.
     */
    public Duration defaultMessageTimeToLive() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultMessageTimeToLive();
    }

    /**
     * Set the defaultMessageTimeToLive property: ISO 8601 default message timespan to live value. This is the duration
     * after which the message expires, starting from when the message is sent to Service Bus. This is the default value
     * used when TimeToLive is not set on a message itself.
     *
     * @param defaultMessageTimeToLive the defaultMessageTimeToLive value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withDefaultMessageTimeToLive(Duration defaultMessageTimeToLive) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withDefaultMessageTimeToLive(defaultMessageTimeToLive);
        return this;
    }

    /**
     * Get the deadLetteringOnMessageExpiration property: A value that indicates whether this queue has dead letter
     * support when a message expires.
     *
     * @return the deadLetteringOnMessageExpiration value.
     */
    public Boolean deadLetteringOnMessageExpiration() {
        return this.innerProperties() == null ? null : this.innerProperties().deadLetteringOnMessageExpiration();
    }

    /**
     * Set the deadLetteringOnMessageExpiration property: A value that indicates whether this queue has dead letter
     * support when a message expires.
     *
     * @param deadLetteringOnMessageExpiration the deadLetteringOnMessageExpiration value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withDeadLetteringOnMessageExpiration(Boolean deadLetteringOnMessageExpiration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withDeadLetteringOnMessageExpiration(deadLetteringOnMessageExpiration);
        return this;
    }

    /**
     * Get the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @return the duplicateDetectionHistoryTimeWindow value.
     */
    public Duration duplicateDetectionHistoryTimeWindow() {
        return this.innerProperties() == null ? null : this.innerProperties().duplicateDetectionHistoryTimeWindow();
    }

    /**
     * Set the duplicateDetectionHistoryTimeWindow property: ISO 8601 timeSpan structure that defines the duration of
     * the duplicate detection history. The default value is 10 minutes.
     *
     * @param duplicateDetectionHistoryTimeWindow the duplicateDetectionHistoryTimeWindow value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withDuplicateDetectionHistoryTimeWindow(Duration duplicateDetectionHistoryTimeWindow) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withDuplicateDetectionHistoryTimeWindow(duplicateDetectionHistoryTimeWindow);
        return this;
    }

    /**
     * Get the maxDeliveryCount property: The maximum delivery count. A message is automatically deadlettered after this
     * number of deliveries. default value is 10.
     *
     * @return the maxDeliveryCount value.
     */
    public Integer maxDeliveryCount() {
        return this.innerProperties() == null ? null : this.innerProperties().maxDeliveryCount();
    }

    /**
     * Set the maxDeliveryCount property: The maximum delivery count. A message is automatically deadlettered after this
     * number of deliveries. default value is 10.
     *
     * @param maxDeliveryCount the maxDeliveryCount value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withMaxDeliveryCount(Integer maxDeliveryCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withMaxDeliveryCount(maxDeliveryCount);
        return this;
    }

    /**
     * Get the status property: Enumerates the possible values for the status of a messaging entity.
     *
     * @return the status value.
     */
    public EntityStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Enumerates the possible values for the status of a messaging entity.
     *
     * @param status the status value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withStatus(EntityStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @return the enableBatchedOperations value.
     */
    public Boolean enableBatchedOperations() {
        return this.innerProperties() == null ? null : this.innerProperties().enableBatchedOperations();
    }

    /**
     * Set the enableBatchedOperations property: Value that indicates whether server-side batched operations are
     * enabled.
     *
     * @param enableBatchedOperations the enableBatchedOperations value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withEnableBatchedOperations(Boolean enableBatchedOperations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withEnableBatchedOperations(enableBatchedOperations);
        return this;
    }

    /**
     * Get the autoDeleteOnIdle property: ISO 8061 timeSpan idle interval after which the queue is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @return the autoDeleteOnIdle value.
     */
    public Duration autoDeleteOnIdle() {
        return this.innerProperties() == null ? null : this.innerProperties().autoDeleteOnIdle();
    }

    /**
     * Set the autoDeleteOnIdle property: ISO 8061 timeSpan idle interval after which the queue is automatically
     * deleted. The minimum duration is 5 minutes.
     *
     * @param autoDeleteOnIdle the autoDeleteOnIdle value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withAutoDeleteOnIdle(Duration autoDeleteOnIdle) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withAutoDeleteOnIdle(autoDeleteOnIdle);
        return this;
    }

    /**
     * Get the enablePartitioning property: A value that indicates whether the queue is to be partitioned across
     * multiple message brokers.
     *
     * @return the enablePartitioning value.
     */
    public Boolean enablePartitioning() {
        return this.innerProperties() == null ? null : this.innerProperties().enablePartitioning();
    }

    /**
     * Set the enablePartitioning property: A value that indicates whether the queue is to be partitioned across
     * multiple message brokers.
     *
     * @param enablePartitioning the enablePartitioning value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withEnablePartitioning(Boolean enablePartitioning) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withEnablePartitioning(enablePartitioning);
        return this;
    }

    /**
     * Get the enableExpress property: A value that indicates whether Express Entities are enabled. An express queue
     * holds a message in memory temporarily before writing it to persistent storage.
     *
     * @return the enableExpress value.
     */
    public Boolean enableExpress() {
        return this.innerProperties() == null ? null : this.innerProperties().enableExpress();
    }

    /**
     * Set the enableExpress property: A value that indicates whether Express Entities are enabled. An express queue
     * holds a message in memory temporarily before writing it to persistent storage.
     *
     * @param enableExpress the enableExpress value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withEnableExpress(Boolean enableExpress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withEnableExpress(enableExpress);
        return this;
    }

    /**
     * Get the forwardTo property: Queue/Topic name to forward the messages.
     *
     * @return the forwardTo value.
     */
    public String forwardTo() {
        return this.innerProperties() == null ? null : this.innerProperties().forwardTo();
    }

    /**
     * Set the forwardTo property: Queue/Topic name to forward the messages.
     *
     * @param forwardTo the forwardTo value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withForwardTo(String forwardTo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withForwardTo(forwardTo);
        return this;
    }

    /**
     * Get the forwardDeadLetteredMessagesTo property: Queue/Topic name to forward the Dead Letter message.
     *
     * @return the forwardDeadLetteredMessagesTo value.
     */
    public String forwardDeadLetteredMessagesTo() {
        return this.innerProperties() == null ? null : this.innerProperties().forwardDeadLetteredMessagesTo();
    }

    /**
     * Set the forwardDeadLetteredMessagesTo property: Queue/Topic name to forward the Dead Letter message.
     *
     * @param forwardDeadLetteredMessagesTo the forwardDeadLetteredMessagesTo value to set.
     * @return the SBQueueInner object itself.
     */
    public SBQueueInner withForwardDeadLetteredMessagesTo(String forwardDeadLetteredMessagesTo) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SBQueueProperties();
        }
        this.innerProperties().withForwardDeadLetteredMessagesTo(forwardDeadLetteredMessagesTo);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
