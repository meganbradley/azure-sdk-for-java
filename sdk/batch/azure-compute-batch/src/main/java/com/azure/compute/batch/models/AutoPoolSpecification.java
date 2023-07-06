// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies characteristics for a temporary 'auto pool'. The Batch service will create this auto Pool when the Job is
 * submitted.
 */
@Fluent
public final class AutoPoolSpecification {

    /*
     * The Batch service assigns each auto Pool a unique identifier on creation. To
     * distinguish between Pools created for different purposes, you can specify this
     * element to add a prefix to the ID that is assigned. The prefix can be up to 20
     * characters long.
     */
    @JsonProperty(value = "autoPoolIdPrefix")
    private String autoPoolIdPrefix;

    /*
     * The minimum lifetime of created auto Pools, and how multiple Jobs on a schedule
     * are assigned to Pools.
     */
    @JsonProperty(value = "poolLifetimeOption", required = true)
    private PoolLifetimeOption poolLifetimeOption;

    /*
     * If false, the Batch service deletes the Pool once its lifetime (as determined
     * by the poolLifetimeOption setting) expires; that is, when the Job or Job
     * Schedule completes. If true, the Batch service does not delete the Pool
     * automatically. It is up to the user to delete auto Pools created with this
     * option.
     */
    @JsonProperty(value = "keepAlive")
    private Boolean keepAlive;

    /*
     * Specification for creating a new Pool.
     */
    @JsonProperty(value = "pool")
    private PoolSpecification pool;

    /**
     * Creates an instance of AutoPoolSpecification class.
     *
     * @param poolLifetimeOption the poolLifetimeOption value to set.
     */
    @JsonCreator
    public AutoPoolSpecification(
            @JsonProperty(value = "poolLifetimeOption", required = true) PoolLifetimeOption poolLifetimeOption) {
        this.poolLifetimeOption = poolLifetimeOption;
    }

    /**
     * Get the autoPoolIdPrefix property: The Batch service assigns each auto Pool a unique identifier on creation. To
     * distinguish between Pools created for different purposes, you can specify this element to add a prefix to the ID
     * that is assigned. The prefix can be up to 20 characters long.
     *
     * @return the autoPoolIdPrefix value.
     */
    public String getAutoPoolIdPrefix() {
        return this.autoPoolIdPrefix;
    }

    /**
     * Set the autoPoolIdPrefix property: The Batch service assigns each auto Pool a unique identifier on creation. To
     * distinguish between Pools created for different purposes, you can specify this element to add a prefix to the ID
     * that is assigned. The prefix can be up to 20 characters long.
     *
     * @param autoPoolIdPrefix the autoPoolIdPrefix value to set.
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification setAutoPoolIdPrefix(String autoPoolIdPrefix) {
        this.autoPoolIdPrefix = autoPoolIdPrefix;
        return this;
    }

    /**
     * Get the poolLifetimeOption property: The minimum lifetime of created auto Pools, and how multiple Jobs on a
     * schedule are assigned to Pools.
     *
     * @return the poolLifetimeOption value.
     */
    public PoolLifetimeOption getPoolLifetimeOption() {
        return this.poolLifetimeOption;
    }

    /**
     * Get the keepAlive property: If false, the Batch service deletes the Pool once its lifetime (as determined by the
     * poolLifetimeOption setting) expires; that is, when the Job or Job Schedule completes. If true, the Batch service
     * does not delete the Pool automatically. It is up to the user to delete auto Pools created with this option.
     *
     * @return the keepAlive value.
     */
    public Boolean isKeepAlive() {
        return this.keepAlive;
    }

    /**
     * Set the keepAlive property: If false, the Batch service deletes the Pool once its lifetime (as determined by the
     * poolLifetimeOption setting) expires; that is, when the Job or Job Schedule completes. If true, the Batch service
     * does not delete the Pool automatically. It is up to the user to delete auto Pools created with this option.
     *
     * @param keepAlive the keepAlive value to set.
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
        return this;
    }

    /**
     * Get the pool property: Specification for creating a new Pool.
     *
     * @return the pool value.
     */
    public PoolSpecification getPool() {
        return this.pool;
    }

    /**
     * Set the pool property: Specification for creating a new Pool.
     *
     * @param pool the pool value to set.
     * @return the AutoPoolSpecification object itself.
     */
    public AutoPoolSpecification setPool(PoolSpecification pool) {
        this.pool = pool;
        return this;
    }
}
