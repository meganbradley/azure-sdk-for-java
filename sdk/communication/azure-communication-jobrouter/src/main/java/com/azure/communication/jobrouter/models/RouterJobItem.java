// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.ETag;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Paged instance of RouterJob. */
@Fluent
public final class RouterJobItem {
    /*
     * A unit of work to be routed
     */
    @JsonProperty(value = "job")
    private RouterJob job;

    /*
     * (Optional) The Concurrency Token.
     */
    @JsonProperty(value = "etag")
    private ETag etag;

    /**
     * Get the job property: A unit of work to be routed.
     *
     * @return the job value.
     */
    public RouterJob getJob() {
        return this.job;
    }

    /**
     * Set the job property: A unit of work to be routed.
     *
     * @param job the job value to set.
     * @return the RouterJobItem object itself.
     */
    public RouterJobItem setJob(RouterJob job) {
        this.job = job;
        return this;
    }

    /**
     * Get the etag property: (Optional) The Concurrency Token.
     *
     * @return the etag value.
     */
    public ETag getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: (Optional) The Concurrency Token.
     *
     * @param etag the etag value to set.
     * @return the RouterJobItem object itself.
     */
    public RouterJobItem setEtag(ETag etag) {
        this.etag = etag;
        return this;
    }
}
