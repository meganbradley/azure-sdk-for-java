// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about the Compute Node on which a Task ran. */
@Immutable
public final class BatchNodeInformation {

    /*
     * An identifier for the Node on which the Task ran, which can be passed when
     * adding a Task to request that the Task be scheduled on this Compute Node.
     */
    @Generated
    @JsonProperty(value = "affinityId")
    private String affinityId;

    /*
     * The URL of the Compute Node on which the Task ran.
     */
    @Generated
    @JsonProperty(value = "nodeUrl")
    private String nodeUrl;

    /*
     * The ID of the Pool on which the Task ran.
     */
    @Generated
    @JsonProperty(value = "poolId")
    private String poolId;

    /*
     * The ID of the Compute Node on which the Task ran.
     */
    @Generated
    @JsonProperty(value = "nodeId")
    private String nodeId;

    /*
     * The root directory of the Task on the Compute Node.
     */
    @Generated
    @JsonProperty(value = "taskRootDirectory")
    private String taskRootDirectory;

    /*
     * The URL to the root directory of the Task on the Compute Node.
     */
    @Generated
    @JsonProperty(value = "taskRootDirectoryUrl")
    private String taskRootDirectoryUrl;

    /** Creates an instance of BatchNodeInformation class. */
    @Generated
    private BatchNodeInformation() {}

    /**
     * Get the affinityId property: An identifier for the Node on which the Task ran, which can be passed when adding a
     * Task to request that the Task be scheduled on this Compute Node.
     *
     * @return the affinityId value.
     */
    @Generated
    public String getAffinityId() {
        return this.affinityId;
    }

    /**
     * Get the nodeUrl property: The URL of the Compute Node on which the Task ran.
     *
     * @return the nodeUrl value.
     */
    @Generated
    public String getNodeUrl() {
        return this.nodeUrl;
    }

    /**
     * Get the poolId property: The ID of the Pool on which the Task ran.
     *
     * @return the poolId value.
     */
    @Generated
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * Get the nodeId property: The ID of the Compute Node on which the Task ran.
     *
     * @return the nodeId value.
     */
    @Generated
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * Get the taskRootDirectory property: The root directory of the Task on the Compute Node.
     *
     * @return the taskRootDirectory value.
     */
    @Generated
    public String getTaskRootDirectory() {
        return this.taskRootDirectory;
    }

    /**
     * Get the taskRootDirectoryUrl property: The URL to the root directory of the Task on the Compute Node.
     *
     * @return the taskRootDirectoryUrl value.
     */
    @Generated
    public String getTaskRootDirectoryUrl() {
        return this.taskRootDirectoryUrl;
    }
}
