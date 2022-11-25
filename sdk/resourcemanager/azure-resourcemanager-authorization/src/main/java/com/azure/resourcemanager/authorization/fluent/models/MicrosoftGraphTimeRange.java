// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** timeRange. */
@Fluent
public final class MicrosoftGraphTimeRange {
    /*
     * End time for the time range.
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /*
     * Start time for the time range.
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /*
     * timeRange
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphTimeRange class. */
    public MicrosoftGraphTimeRange() {
    }

    /**
     * Get the endTime property: End time for the time range.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time for the time range.
     *
     * @param endTime the endTime value to set.
     * @return the MicrosoftGraphTimeRange object itself.
     */
    public MicrosoftGraphTimeRange withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the startTime property: Start time for the time range.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time for the time range.
     *
     * @param startTime the startTime value to set.
     * @return the MicrosoftGraphTimeRange object itself.
     */
    public MicrosoftGraphTimeRange withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the additionalProperties property: timeRange.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: timeRange.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTimeRange object itself.
     */
    public MicrosoftGraphTimeRange withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
