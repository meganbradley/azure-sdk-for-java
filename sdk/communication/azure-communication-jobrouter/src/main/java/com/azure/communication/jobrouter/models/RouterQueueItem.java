// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Paged instance of RouterQueue. */
@Immutable
public final class RouterQueueItem {
    /*
     * A queue that can contain jobs to be routed.
     */
    @Generated
    @JsonProperty(value = "queue")
    private RouterQueue queue;

    /*
     * (Optional) The Concurrency Token.
     */
    @Generated
    @JsonProperty(value = "etag")
    private String etag;

    /** Creates an instance of RouterQueueItem class. */
    @Generated
    private RouterQueueItem() {}

    /**
     * Get the queue property: A queue that can contain jobs to be routed.
     *
     * @return the queue value.
     */
    @Generated
    public RouterQueue getQueue() {
        return this.queue;
    }

    /**
     * Get the etag property: (Optional) The Concurrency Token.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }
}
