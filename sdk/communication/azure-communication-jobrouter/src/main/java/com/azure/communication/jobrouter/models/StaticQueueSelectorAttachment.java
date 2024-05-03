// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Describes a queue selector that will be attached to the job. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("static")
@Immutable
public final class StaticQueueSelectorAttachment extends QueueSelectorAttachment {

    /*
     * Describes a condition that must be met against a set of labels for queue
     * selection
     */
    @JsonProperty(value = "queueSelector")
    private RouterQueueSelector queueSelector;

    /**
     * Creates an instance of StaticQueueSelectorAttachment class.
     *
     * @param queueSelector the queueSelector value to set.
     */
    @JsonCreator
    public StaticQueueSelectorAttachment(@JsonProperty(value = "queueSelector") RouterQueueSelector queueSelector) {
        this.queueSelector = queueSelector;
    }

    /**
     * Returns kind discriminator.
     * @return kind.
     */
    public QueueSelectorAttachmentKind getKind() {
        return QueueSelectorAttachmentKind.STATIC;
    }

    /**
     * Get the queueSelector property: Describes a condition that must be met against a set of labels for queue
     * selection.
     *
     * @return the queueSelector value.
     */
    public RouterQueueSelector getQueueSelector() {
        return this.queueSelector;
    }
}
