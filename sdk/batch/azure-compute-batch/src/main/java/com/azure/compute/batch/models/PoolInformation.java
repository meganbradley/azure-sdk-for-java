// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies how a Job should be assigned to a Pool. */
@Fluent
public final class PoolInformation {
    /*
     * You must ensure that the Pool referenced by this property exists. If the Pool
     * does not exist at the time the Batch service tries to schedule a Job, no Tasks
     * for the Job will run until you create a Pool with that id. Note that the Batch
     * service will not reject the Job request; it will simply not run Tasks until the
     * Pool exists. You must specify either the Pool ID or the auto Pool
     * specification, but not both.
     */
    @JsonProperty(value = "poolId")
    private String poolId;

    /*
     * If auto Pool creation fails, the Batch service moves the Job to a completed
     * state, and the Pool creation error is set in the Job's scheduling error
     * property. The Batch service manages the lifetime (both creation and, unless
     * keepAlive is specified, deletion) of the auto Pool. Any user actions that
     * affect the lifetime of the auto Pool while the Job is active will result in
     * unexpected behavior. You must specify either the Pool ID or the auto Pool
     * specification, but not both.
     */
    @JsonProperty(value = "autoPoolSpecification")
    private AutoPoolSpecification autoPoolSpecification;

    /** Creates an instance of PoolInformation class. */
    public PoolInformation() {}

    /**
     * Get the poolId property: You must ensure that the Pool referenced by this property exists. If the Pool does not
     * exist at the time the Batch service tries to schedule a Job, no Tasks for the Job will run until you create a
     * Pool with that id. Note that the Batch service will not reject the Job request; it will simply not run Tasks
     * until the Pool exists. You must specify either the Pool ID or the auto Pool specification, but not both.
     *
     * @return the poolId value.
     */
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * Set the poolId property: You must ensure that the Pool referenced by this property exists. If the Pool does not
     * exist at the time the Batch service tries to schedule a Job, no Tasks for the Job will run until you create a
     * Pool with that id. Note that the Batch service will not reject the Job request; it will simply not run Tasks
     * until the Pool exists. You must specify either the Pool ID or the auto Pool specification, but not both.
     *
     * @param poolId the poolId value to set.
     * @return the PoolInformation object itself.
     */
    public PoolInformation setPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * Get the autoPoolSpecification property: If auto Pool creation fails, the Batch service moves the Job to a
     * completed state, and the Pool creation error is set in the Job's scheduling error property. The Batch service
     * manages the lifetime (both creation and, unless keepAlive is specified, deletion) of the auto Pool. Any user
     * actions that affect the lifetime of the auto Pool while the Job is active will result in unexpected behavior. You
     * must specify either the Pool ID or the auto Pool specification, but not both.
     *
     * @return the autoPoolSpecification value.
     */
    public AutoPoolSpecification getAutoPoolSpecification() {
        return this.autoPoolSpecification;
    }

    /**
     * Set the autoPoolSpecification property: If auto Pool creation fails, the Batch service moves the Job to a
     * completed state, and the Pool creation error is set in the Job's scheduling error property. The Batch service
     * manages the lifetime (both creation and, unless keepAlive is specified, deletion) of the auto Pool. Any user
     * actions that affect the lifetime of the auto Pool while the Job is active will result in unexpected behavior. You
     * must specify either the Pool ID or the auto Pool specification, but not both.
     *
     * @param autoPoolSpecification the autoPoolSpecification value to set.
     * @return the PoolInformation object itself.
     */
    public PoolInformation setAutoPoolSpecification(AutoPoolSpecification autoPoolSpecification) {
        this.autoPoolSpecification = autoPoolSpecification;
        return this;
    }
}
