// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Usage metrics for a Pool across an aggregation interval. */
@Immutable
public final class PoolUsageMetrics {

    /*
     * The ID of the Pool whose metrics are aggregated in this entry.
     */
    @Generated
    @JsonProperty(value = "poolId")
    private String poolId;

    /*
     * The start time of the aggregation interval covered by this entry.
     */
    @Generated
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * The end time of the aggregation interval covered by this entry.
     */
    @Generated
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * For information about available sizes of virtual machines in Pools, see Choose
     * a VM size for Compute Nodes in an Azure Batch Pool
     * (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     */
    @Generated
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /*
     * The total core hours used in the Pool during this aggregation interval.
     */
    @Generated
    @JsonProperty(value = "totalCoreHours")
    private double totalCoreHours;

    /**
     * Creates an instance of PoolUsageMetrics class.
     *
     * @param poolId the poolId value to set.
     * @param startTime the startTime value to set.
     * @param endTime the endTime value to set.
     * @param vmSize the vmSize value to set.
     * @param totalCoreHours the totalCoreHours value to set.
     */
    @Generated
    @JsonCreator
    private PoolUsageMetrics(
            @JsonProperty(value = "poolId") String poolId,
            @JsonProperty(value = "startTime") OffsetDateTime startTime,
            @JsonProperty(value = "endTime") OffsetDateTime endTime,
            @JsonProperty(value = "vmSize") String vmSize,
            @JsonProperty(value = "totalCoreHours") double totalCoreHours) {
        this.poolId = poolId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.vmSize = vmSize;
        this.totalCoreHours = totalCoreHours;
    }

    /**
     * Get the poolId property: The ID of the Pool whose metrics are aggregated in this entry.
     *
     * @return the poolId value.
     */
    @Generated
    public String getPoolId() {
        return this.poolId;
    }

    /**
     * Get the startTime property: The start time of the aggregation interval covered by this entry.
     *
     * @return the startTime value.
     */
    @Generated
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of the aggregation interval covered by this entry.
     *
     * @return the endTime value.
     */
    @Generated
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Get the vmSize property: For information about available sizes of virtual machines in Pools, see Choose a VM size
     * for Compute Nodes in an Azure Batch Pool (https://docs.microsoft.com/azure/batch/batch-pool-vm-sizes).
     *
     * @return the vmSize value.
     */
    @Generated
    public String getVmSize() {
        return this.vmSize;
    }

    /**
     * Get the totalCoreHours property: The total core hours used in the Pool during this aggregation interval.
     *
     * @return the totalCoreHours value.
     */
    @Generated
    public double getTotalCoreHours() {
        return this.totalCoreHours;
    }
}
