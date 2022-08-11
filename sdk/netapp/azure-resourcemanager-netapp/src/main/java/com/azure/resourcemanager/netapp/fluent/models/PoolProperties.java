// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.models.EncryptionType;
import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Pool properties. */
@Fluent
public final class PoolProperties {
    /*
     * poolId UUID v4 used to identify the Pool
     */
    @JsonProperty(value = "poolId", access = JsonProperty.Access.WRITE_ONLY)
    private String poolId;

    /*
     * size Provisioned size of the pool (in bytes). Allowed values are in 1TiB
     * chunks (value must be multiply of 4398046511104).
     */
    @JsonProperty(value = "size", required = true)
    private long size;

    /*
     * serviceLevel The service level of the file system
     */
    @JsonProperty(value = "serviceLevel", required = true)
    private ServiceLevel serviceLevel;

    /*
     * Azure lifecycle management
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Total throughput of pool in MiB/s
     */
    @JsonProperty(value = "totalThroughputMibps", access = JsonProperty.Access.WRITE_ONLY)
    private Float totalThroughputMibps;

    /*
     * Utilized throughput of pool in MiB/s
     */
    @JsonProperty(value = "utilizedThroughputMibps", access = JsonProperty.Access.WRITE_ONLY)
    private Float utilizedThroughputMibps;

    /*
     * The qos type of the pool
     */
    @JsonProperty(value = "qosType")
    private QosType qosType;

    /*
     * If enabled (true) the pool can contain cool Access enabled volumes.
     */
    @JsonProperty(value = "coolAccess")
    private Boolean coolAccess;

    /*
     * encryptionType Encryption type of the capacity pool, set encryption type
     * for data at rest for this pool and all volumes in it. This value can
     * only be set when creating new pool.
     */
    @JsonProperty(value = "encryptionType")
    private EncryptionType encryptionType;

    /**
     * Get the poolId property: poolId UUID v4 used to identify the Pool.
     *
     * @return the poolId value.
     */
    public String poolId() {
        return this.poolId;
    }

    /**
     * Get the size property: size Provisioned size of the pool (in bytes). Allowed values are in 1TiB chunks (value
     * must be multiply of 4398046511104).
     *
     * @return the size value.
     */
    public long size() {
        return this.size;
    }

    /**
     * Set the size property: size Provisioned size of the pool (in bytes). Allowed values are in 1TiB chunks (value
     * must be multiply of 4398046511104).
     *
     * @param size the size value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withSize(long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the serviceLevel property: serviceLevel The service level of the file system.
     *
     * @return the serviceLevel value.
     */
    public ServiceLevel serviceLevel() {
        return this.serviceLevel;
    }

    /**
     * Set the serviceLevel property: serviceLevel The service level of the file system.
     *
     * @param serviceLevel the serviceLevel value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the totalThroughputMibps property: Total throughput of pool in MiB/s.
     *
     * @return the totalThroughputMibps value.
     */
    public Float totalThroughputMibps() {
        return this.totalThroughputMibps;
    }

    /**
     * Get the utilizedThroughputMibps property: Utilized throughput of pool in MiB/s.
     *
     * @return the utilizedThroughputMibps value.
     */
    public Float utilizedThroughputMibps() {
        return this.utilizedThroughputMibps;
    }

    /**
     * Get the qosType property: The qos type of the pool.
     *
     * @return the qosType value.
     */
    public QosType qosType() {
        return this.qosType;
    }

    /**
     * Set the qosType property: The qos type of the pool.
     *
     * @param qosType the qosType value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withQosType(QosType qosType) {
        this.qosType = qosType;
        return this;
    }

    /**
     * Get the coolAccess property: If enabled (true) the pool can contain cool Access enabled volumes.
     *
     * @return the coolAccess value.
     */
    public Boolean coolAccess() {
        return this.coolAccess;
    }

    /**
     * Set the coolAccess property: If enabled (true) the pool can contain cool Access enabled volumes.
     *
     * @param coolAccess the coolAccess value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withCoolAccess(Boolean coolAccess) {
        this.coolAccess = coolAccess;
        return this;
    }

    /**
     * Get the encryptionType property: encryptionType Encryption type of the capacity pool, set encryption type for
     * data at rest for this pool and all volumes in it. This value can only be set when creating new pool.
     *
     * @return the encryptionType value.
     */
    public EncryptionType encryptionType() {
        return this.encryptionType;
    }

    /**
     * Set the encryptionType property: encryptionType Encryption type of the capacity pool, set encryption type for
     * data at rest for this pool and all volumes in it. This value can only be set when creating new pool.
     *
     * @param encryptionType the encryptionType value to set.
     * @return the PoolProperties object itself.
     */
    public PoolProperties withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceLevel() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property serviceLevel in model PoolProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PoolProperties.class);
}
