// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a queue selector that will be attached to the job. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("static")
@Immutable
public final class StaticQueueSelectorAttachmentInternal extends QueueSelectorAttachmentInternal {

    /*
     * The queue selector to attach.
     */
    @Generated
    @JsonProperty(value = "queueSelector")
    private RouterQueueSelectorInternal queueSelector;

    /**
     * Creates an instance of StaticQueueSelectorAttachmentInternal class.
     *
     * @param queueSelector the queueSelector value to set.
     */
    @Generated
    @JsonCreator
    public StaticQueueSelectorAttachmentInternal(
            @JsonProperty(value = "queueSelector") RouterQueueSelectorInternal queueSelector) {
        this.queueSelector = queueSelector;
    }

    /**
     * Get the queueSelector property: The queue selector to attach.
     *
     * @return the queueSelector value.
     */
    @Generated
    public RouterQueueSelectorInternal getQueueSelector() {
        return this.queueSelector;
    }
}
