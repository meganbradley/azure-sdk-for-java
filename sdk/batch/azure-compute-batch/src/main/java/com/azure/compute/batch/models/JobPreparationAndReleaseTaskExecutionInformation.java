// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The status of the Job Preparation and Job Release Tasks on a Compute Node. */
@Immutable
public final class JobPreparationAndReleaseTaskExecutionInformation {
    /*
     * The ID of the Pool containing the Compute Node to which this entry refers.
     */
    @JsonProperty(value = "poolId")
    private String poolId;

    /*
     * The ID of the Compute Node to which this entry refers.
     */
    @JsonProperty(value = "nodeId")
    private String nodeId;

    /*
     * The URL of the Compute Node to which this entry refers.
     */
    @JsonProperty(value = "nodeUrl")
    private String nodeUrl;

    /*
     * Contains information about the execution of a Job Preparation Task on a Compute
     * Node.
     */
    @JsonProperty(value = "jobPreparationTaskExecutionInfo")
    private JobPreparationTaskExecutionInformation jobPreparationTaskExecutionInfo;

    /*
     * This property is set only if the Job Release Task has run on the Compute Node.
     */
    @JsonProperty(value = "jobReleaseTaskExecutionInfo")
    private JobReleaseTaskExecutionInformation jobReleaseTaskExecutionInfo;

    /** Creates an instance of JobPreparationAndReleaseTaskExecutionInformation class. */
    private JobPreparationAndReleaseTaskExecutionInformation() {}

    /**
     * Get the poolId property: The ID of the Pool containing the Compute Node to which this entry refers.
     *
     * @return the poolId value.
     */
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * Get the nodeId property: The ID of the Compute Node to which this entry refers.
     *
     * @return the nodeId value.
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * Get the nodeUrl property: The URL of the Compute Node to which this entry refers.
     *
     * @return the nodeUrl value.
     */
    public String getNodeUrl() {
        return this.nodeUrl;
    }

    /**
     * Get the jobPreparationTaskExecutionInfo property: Contains information about the execution of a Job Preparation
     * Task on a Compute Node.
     *
     * @return the jobPreparationTaskExecutionInfo value.
     */
    public JobPreparationTaskExecutionInformation getJobPreparationTaskExecutionInfo() {
        return this.jobPreparationTaskExecutionInfo;
    }

    /**
     * Get the jobReleaseTaskExecutionInfo property: This property is set only if the Job Release Task has run on the
     * Compute Node.
     *
     * @return the jobReleaseTaskExecutionInfo value.
     */
    public JobReleaseTaskExecutionInformation getJobReleaseTaskExecutionInfo() {
        return this.jobReleaseTaskExecutionInfo;
    }
}
