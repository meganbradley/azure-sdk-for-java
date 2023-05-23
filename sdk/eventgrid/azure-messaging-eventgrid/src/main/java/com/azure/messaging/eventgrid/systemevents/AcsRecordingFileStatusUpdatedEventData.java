// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;

/** Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RecordingFileStatusUpdated event. */
@Fluent
public final class AcsRecordingFileStatusUpdatedEventData {
    /*
     * The details of recording storage information
     */
    @JsonProperty(value = "recordingStorageInfo")
    private AcsRecordingStorageInfoProperties recordingStorageInfo;

    /*
     * The time at which the recording started
     */
    @JsonProperty(value = "recordingStartTime")
    private OffsetDateTime recordingStartTime;

    /*
     * The recording duration in milliseconds
     */
    @JsonProperty(value = "recordingDurationMs")
    private Long recordingDurationMs;

    /*
     * The recording content type- AudioVideo, or Audio
     */
    @JsonProperty(value = "recordingContentType")
    private RecordingContentType recordingContentType;

    /*
     * The recording  channel type - Mixed, Unmixed
     */
    @JsonProperty(value = "recordingChannelType")
    private RecordingChannelType recordingChannelType;

    /*
     * The recording format type - Mp4, Mp3, Wav
     */
    @JsonProperty(value = "recordingFormatType")
    private RecordingFormatType recordingFormatType;

    /*
     * The reason for ending recording session
     */
    @JsonProperty(value = "sessionEndReason")
    private String sessionEndReason;

    /** Creates an instance of AcsRecordingFileStatusUpdatedEventData class. */
    public AcsRecordingFileStatusUpdatedEventData() {}

    /**
     * Get the recordingStorageInfo property: The details of recording storage information.
     *
     * @return the recordingStorageInfo value.
     */
    public AcsRecordingStorageInfoProperties getRecordingStorageInfo() {
        return this.recordingStorageInfo;
    }

    /**
     * Set the recordingStorageInfo property: The details of recording storage information.
     *
     * @param recordingStorageInfo the recordingStorageInfo value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setRecordingStorageInfo(
            AcsRecordingStorageInfoProperties recordingStorageInfo) {
        this.recordingStorageInfo = recordingStorageInfo;
        return this;
    }

    /**
     * Get the recordingStartTime property: The time at which the recording started.
     *
     * @return the recordingStartTime value.
     */
    public OffsetDateTime getRecordingStartTime() {
        return this.recordingStartTime;
    }

    /**
     * Set the recordingStartTime property: The time at which the recording started.
     *
     * @param recordingStartTime the recordingStartTime value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setRecordingStartTime(OffsetDateTime recordingStartTime) {
        this.recordingStartTime = recordingStartTime;
        return this;
    }

    /**
     * Get the recordingDuration property: The recording duration.
     *
     * @return the recordingDuration value.
     */
    public Duration getRecordingDuration() {
        if (this.recordingDurationMs != null) {
            return Duration.ofMillis(this.recordingDurationMs);
        }
        return null;
    }

    /**
     * Set the recordingDuration property: The recording duration.
     *
     * @param recordingDuration the recordingDuration value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setRecordingDuration(Duration recordingDuration) {
        if (recordingDuration != null) {
            this.recordingDurationMs = recordingDuration.toMillis();
        } else {
            this.recordingDurationMs = null;
        }
        return this;
    }

    /**
     * Get the recordingContentType property: The recording content type- AudioVideo, or Audio.
     *
     * @return the recordingContentType value.
     */
    public RecordingContentType getRecordingContentType() {
        return this.recordingContentType;
    }

    /**
     * Set the recordingContentType property: The recording content type- AudioVideo, or Audio.
     *
     * @param recordingContentType the recordingContentType value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setRecordingContentType(RecordingContentType recordingContentType) {
        this.recordingContentType = recordingContentType;
        return this;
    }

    /**
     * Get the recordingChannelType property: The recording channel type - Mixed, Unmixed.
     *
     * @return the recordingChannelType value.
     */
    public RecordingChannelType getRecordingChannelType() {
        return this.recordingChannelType;
    }

    /**
     * Set the recordingChannelType property: The recording channel type - Mixed, Unmixed.
     *
     * @param recordingChannelType the recordingChannelType value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setRecordingChannelType(RecordingChannelType recordingChannelType) {
        this.recordingChannelType = recordingChannelType;
        return this;
    }

    /**
     * Get the recordingFormatType property: The recording format type - Mp4, Mp3, Wav.
     *
     * @return the recordingFormatType value.
     */
    public RecordingFormatType getRecordingFormatType() {
        return this.recordingFormatType;
    }

    /**
     * Set the recordingFormatType property: The recording format type - Mp4, Mp3, Wav.
     *
     * @param recordingFormatType the recordingFormatType value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setRecordingFormatType(RecordingFormatType recordingFormatType) {
        this.recordingFormatType = recordingFormatType;
        return this;
    }

    /**
     * Get the sessionEndReason property: The reason for ending recording session.
     *
     * @return the sessionEndReason value.
     */
    public String getSessionEndReason() {
        return this.sessionEndReason;
    }

    /**
     * Set the sessionEndReason property: The reason for ending recording session.
     *
     * @param sessionEndReason the sessionEndReason value to set.
     * @return the AcsRecordingFileStatusUpdatedEventData object itself.
     */
    public AcsRecordingFileStatusUpdatedEventData setSessionEndReason(String sessionEndReason) {
        this.sessionEndReason = sessionEndReason;
        return this;
    }
}
