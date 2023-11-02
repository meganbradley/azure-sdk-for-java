// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Trigger for an exception action on exceeding queue length. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("queue-length")
@Immutable
public final class QueueLengthExceptionTrigger extends ExceptionTrigger {

    /*
     * Threshold of number of jobs ahead in the queue to for this trigger to fire.
     */
    @Generated
    @JsonProperty(value = "threshold")
    private int threshold;

    /**
     * Creates an instance of QueueLengthExceptionTrigger class.
     *
     * @param threshold the threshold value to set.
     */
    @Generated
    @JsonCreator
    public QueueLengthExceptionTrigger(@JsonProperty(value = "threshold") int threshold) {
        this.threshold = threshold;
    }

    /**
     * Get the threshold property: Threshold of number of jobs ahead in the queue to for this trigger to fire.
     *
     * @return the threshold value.
     */
    @Generated
    public int getThreshold() {
        return this.threshold;
    }
}
