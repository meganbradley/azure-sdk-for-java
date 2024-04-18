// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Resource usage statistics for a Task.
 */
@Immutable
public final class BatchTaskStatistics implements JsonSerializable<BatchTaskStatistics> {

    /*
     * The URL of the statistics.
     */
    @Generated
    private final String url;

    /*
     * The start time of the time range covered by the statistics.
     */
    @Generated
    private final OffsetDateTime startTime;

    /*
     * The time at which the statistics were last updated. All statistics are limited to the range between startTime and lastUpdateTime.
     */
    @Generated
    private final OffsetDateTime lastUpdateTime;

    /*
     * The total wall clock time of the Task. The wall clock time is the elapsed time from when the Task started running on a Compute Node to when it finished (or to the last time the statistics were updated, if the Task had not finished by then). If the Task was retried, this includes the wall clock time of all the Task retries.
     */
    @Generated
    private final Duration wallClockTime;

    /*
     * The total number of disk read operations made by the Task.
     */
    @Generated
    private final long readIOps;

    /*
     * The total number of disk write operations made by the Task.
     */
    @Generated
    private final long writeIOps;

    /*
     * The total gibibytes read from disk by the Task.
     */
    @Generated
    private final double readIOGiB;

    /*
     * The total gibibytes written to disk by the Task.
     */
    @Generated
    private final double writeIOGiB;

    /*
     * The total wait time of the Task. The wait time for a Task is defined as the elapsed time between the creation of the Task and the start of Task execution. (If the Task is retried due to failures, the wait time is the time to the most recent Task execution.).
     */
    @Generated
    private final Duration waitTime;

    /**
     * Get the url property: The URL of the statistics.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the startTime property: The start time of the time range covered by the statistics.
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the lastUpdateTime property: The time at which the statistics were last updated. All statistics are limited
     * to the range between startTime and lastUpdateTime.
     *
     * @return the lastUpdateTime value.
     */
    @Generated
    public OffsetDateTime getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Get the wallClockTime property: The total wall clock time of the Task. The wall clock time is the elapsed time
     * from when the Task started running on a Compute Node to when it finished (or to the last time the statistics were
     * updated, if the Task had not finished by then). If the Task was retried, this includes the wall clock time of all
     * the Task retries.
     *
     * @return the wallClockTime value.
     */
    @Generated
    public Duration getWallClockTime() {
        return this.wallClockTime;
    }

    /**
     * Get the readIOps property: The total number of disk read operations made by the Task.
     *
     * @return the readIOps value.
     */
    @Generated
    public long getReadIOps() {
        return this.readIOps;
    }

    /**
     * Get the writeIOps property: The total number of disk write operations made by the Task.
     *
     * @return the writeIOps value.
     */
    @Generated
    public long getWriteIOps() {
        return this.writeIOps;
    }

    /**
     * Get the readIOGiB property: The total gibibytes read from disk by the Task.
     *
     * @return the readIOGiB value.
     */
    @Generated
    public double getReadIOGiB() {
        return this.readIOGiB;
    }

    /**
     * Get the writeIOGiB property: The total gibibytes written to disk by the Task.
     *
     * @return the writeIOGiB value.
     */
    @Generated
    public double getWriteIOGiB() {
        return this.writeIOGiB;
    }

    /**
     * Get the waitTime property: The total wait time of the Task. The wait time for a Task is defined as the elapsed
     * time between the creation of the Task and the start of Task execution. (If the Task is retried due to failures,
     * the wait time is the time to the most recent Task execution.).
     *
     * @return the waitTime value.
     */
    @Generated
    public Duration getWaitTime() {
        return this.waitTime;
    }

    /*
     * The total kernel mode CPU time (summed across all cores and all Compute Nodes) consumed by the Task.
     */
    @Generated
    private final Duration kernelCpuTime;

    /**
     * Get the kernelCpuTime property: The total kernel mode CPU time (summed across all cores and all Compute Nodes)
     * consumed by the Task.
     *
     * @return the kernelCpuTime value.
     */
    @Generated
    public Duration getKernelCpuTime() {
        return this.kernelCpuTime;
    }

    /*
     * The total user mode CPU time (summed across all cores and all Compute Nodes) consumed by the Task.
     */
    @Generated
    private final Duration userCpuTime;

    /**
     * Get the userCpuTime property: The total user mode CPU time (summed across all cores and all Compute Nodes)
     * consumed by the Task.
     *
     * @return the userCpuTime value.
     */
    @Generated
    public Duration getUserCpuTime() {
        return this.userCpuTime;
    }

    /**
     * Creates an instance of BatchTaskStatistics class.
     *
     * @param url the url value to set.
     * @param startTime the startTime value to set.
     * @param lastUpdateTime the lastUpdateTime value to set.
     * @param userCpuTime the userCpuTime value to set.
     * @param kernelCpuTime the kernelCpuTime value to set.
     * @param wallClockTime the wallClockTime value to set.
     * @param readIOps the readIOps value to set.
     * @param writeIOps the writeIOps value to set.
     * @param readIOGiB the readIOGiB value to set.
     * @param writeIOGiB the writeIOGiB value to set.
     * @param waitTime the waitTime value to set.
     */
    @Generated
    private BatchTaskStatistics(String url, OffsetDateTime startTime, OffsetDateTime lastUpdateTime,
        Duration userCpuTime, Duration kernelCpuTime, Duration wallClockTime, long readIOps, long writeIOps,
        double readIOGiB, double writeIOGiB, Duration waitTime) {
        this.url = url;
        this.startTime = startTime;
        this.lastUpdateTime = lastUpdateTime;
        this.userCpuTime = userCpuTime;
        this.kernelCpuTime = kernelCpuTime;
        this.wallClockTime = wallClockTime;
        this.readIOps = readIOps;
        this.writeIOps = writeIOps;
        this.readIOGiB = readIOGiB;
        this.writeIOGiB = writeIOGiB;
        this.waitTime = waitTime;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("url", this.url);
        jsonWriter.writeStringField("startTime",
            this.startTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.startTime));
        jsonWriter.writeStringField("lastUpdateTime",
            this.lastUpdateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastUpdateTime));
        jsonWriter.writeStringField("userCPUTime", CoreUtils.durationToStringWithDays(this.userCpuTime));
        jsonWriter.writeStringField("kernelCPUTime", CoreUtils.durationToStringWithDays(this.kernelCpuTime));
        jsonWriter.writeStringField("wallClockTime", CoreUtils.durationToStringWithDays(this.wallClockTime));
        jsonWriter.writeLongField("readIOps", this.readIOps);
        jsonWriter.writeLongField("writeIOps", this.writeIOps);
        jsonWriter.writeDoubleField("readIOGiB", this.readIOGiB);
        jsonWriter.writeDoubleField("writeIOGiB", this.writeIOGiB);
        jsonWriter.writeStringField("waitTime", CoreUtils.durationToStringWithDays(this.waitTime));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchTaskStatistics from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchTaskStatistics if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchTaskStatistics.
     */
    @Generated
    public static BatchTaskStatistics fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String url = null;
            OffsetDateTime startTime = null;
            OffsetDateTime lastUpdateTime = null;
            Duration userCpuTime = null;
            Duration kernelCpuTime = null;
            Duration wallClockTime = null;
            long readIOps = 0L;
            long writeIOps = 0L;
            double readIOGiB = 0.0;
            double writeIOGiB = 0.0;
            Duration waitTime = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("url".equals(fieldName)) {
                    url = reader.getString();
                } else if ("startTime".equals(fieldName)) {
                    startTime = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("lastUpdateTime".equals(fieldName)) {
                    lastUpdateTime
                        = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                } else if ("userCPUTime".equals(fieldName)) {
                    userCpuTime = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("kernelCPUTime".equals(fieldName)) {
                    kernelCpuTime = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("wallClockTime".equals(fieldName)) {
                    wallClockTime = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("readIOps".equals(fieldName)) {
                    readIOps = reader.getLong();
                } else if ("writeIOps".equals(fieldName)) {
                    writeIOps = reader.getLong();
                } else if ("readIOGiB".equals(fieldName)) {
                    readIOGiB = reader.getDouble();
                } else if ("writeIOGiB".equals(fieldName)) {
                    writeIOGiB = reader.getDouble();
                } else if ("waitTime".equals(fieldName)) {
                    waitTime = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }
            return new BatchTaskStatistics(url, startTime, lastUpdateTime, userCpuTime, kernelCpuTime, wallClockTime,
                readIOps, writeIOps, readIOGiB, writeIOGiB, waitTime);
        });
    }
}
