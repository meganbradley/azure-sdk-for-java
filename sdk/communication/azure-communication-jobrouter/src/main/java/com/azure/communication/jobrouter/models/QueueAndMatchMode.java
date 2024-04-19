// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes a matching mode where matching worker to a job is automatically started after job is queued successfully.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("queueAndMatch")
@Immutable
public final class QueueAndMatchMode extends JobMatchingMode {

    /**
     * Creates an instance of QueueAndMatchMode class.
     */
    public QueueAndMatchMode() {
        this.kind = JobMatchingModeKind.QUEUE_AND_MATCH;
    }
}
