// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.models.StreamType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Definition of the source control sync job stream by id. */
@Fluent
public final class SourceControlSyncJobStreamByIdInner {
    /*
     * Resource id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The properties of the source control sync job stream.
     */
    @JsonProperty(value = "properties")
    private SourceControlSyncJobStreamByIdProperties innerProperties;

    /**
     * Get the id property: Resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the innerProperties property: The properties of the source control sync job stream.
     *
     * @return the innerProperties value.
     */
    private SourceControlSyncJobStreamByIdProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sourceControlSyncJobStreamId property: The sync job stream id.
     *
     * @return the sourceControlSyncJobStreamId value.
     */
    public String sourceControlSyncJobStreamId() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceControlSyncJobStreamId();
    }

    /**
     * Set the sourceControlSyncJobStreamId property: The sync job stream id.
     *
     * @param sourceControlSyncJobStreamId the sourceControlSyncJobStreamId value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withSourceControlSyncJobStreamId(String sourceControlSyncJobStreamId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlSyncJobStreamByIdProperties();
        }
        this.innerProperties().withSourceControlSyncJobStreamId(sourceControlSyncJobStreamId);
        return this;
    }

    /**
     * Get the summary property: The summary of the sync job stream.
     *
     * @return the summary value.
     */
    public String summary() {
        return this.innerProperties() == null ? null : this.innerProperties().summary();
    }

    /**
     * Set the summary property: The summary of the sync job stream.
     *
     * @param summary the summary value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withSummary(String summary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlSyncJobStreamByIdProperties();
        }
        this.innerProperties().withSummary(summary);
        return this;
    }

    /**
     * Get the time property: The time of the sync job stream.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.innerProperties() == null ? null : this.innerProperties().time();
    }

    /**
     * Get the streamType property: The type of the sync job stream.
     *
     * @return the streamType value.
     */
    public StreamType streamType() {
        return this.innerProperties() == null ? null : this.innerProperties().streamType();
    }

    /**
     * Set the streamType property: The type of the sync job stream.
     *
     * @param streamType the streamType value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withStreamType(StreamType streamType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlSyncJobStreamByIdProperties();
        }
        this.innerProperties().withStreamType(streamType);
        return this;
    }

    /**
     * Get the streamText property: The text of the sync job stream.
     *
     * @return the streamText value.
     */
    public String streamText() {
        return this.innerProperties() == null ? null : this.innerProperties().streamText();
    }

    /**
     * Set the streamText property: The text of the sync job stream.
     *
     * @param streamText the streamText value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withStreamText(String streamText) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlSyncJobStreamByIdProperties();
        }
        this.innerProperties().withStreamText(streamText);
        return this;
    }

    /**
     * Get the value property: The values of the job stream.
     *
     * @return the value value.
     */
    public Map<String, Object> value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: The values of the job stream.
     *
     * @param value the value value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withValue(Map<String, Object> value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SourceControlSyncJobStreamByIdProperties();
        }
        this.innerProperties().withValue(value);
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
