// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.netapp.fluent.models.PoolPatchProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Capacity pool patch resource.
 */
@Fluent
public final class CapacityPoolPatch extends Resource {
    /*
     * Capacity pool properties
     */
    @JsonProperty(value = "properties")
    private PoolPatchProperties innerProperties;

    /**
     * Creates an instance of CapacityPoolPatch class.
     */
    public CapacityPoolPatch() {
    }

    /**
     * Get the innerProperties property: Capacity pool properties.
     * 
     * @return the innerProperties value.
     */
    private PoolPatchProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CapacityPoolPatch withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CapacityPoolPatch withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the size property: size
     * 
     * Provisioned size of the pool (in bytes). Allowed values are in 1TiB chunks (value must be multiply of
     * 4398046511104).
     * 
     * @return the size value.
     */
    public Long size() {
        return this.innerProperties() == null ? null : this.innerProperties().size();
    }

    /**
     * Set the size property: size
     * 
     * Provisioned size of the pool (in bytes). Allowed values are in 1TiB chunks (value must be multiply of
     * 4398046511104).
     * 
     * @param size the size value to set.
     * @return the CapacityPoolPatch object itself.
     */
    public CapacityPoolPatch withSize(Long size) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolPatchProperties();
        }
        this.innerProperties().withSize(size);
        return this;
    }

    /**
     * Get the qosType property: The qos type of the pool.
     * 
     * @return the qosType value.
     */
    public QosType qosType() {
        return this.innerProperties() == null ? null : this.innerProperties().qosType();
    }

    /**
     * Set the qosType property: The qos type of the pool.
     * 
     * @param qosType the qosType value to set.
     * @return the CapacityPoolPatch object itself.
     */
    public CapacityPoolPatch withQosType(QosType qosType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolPatchProperties();
        }
        this.innerProperties().withQosType(qosType);
        return this;
    }

    /**
     * Get the coolAccess property: If enabled (true) the pool can contain cool Access enabled volumes.
     * 
     * @return the coolAccess value.
     */
    public Boolean coolAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().coolAccess();
    }

    /**
     * Set the coolAccess property: If enabled (true) the pool can contain cool Access enabled volumes.
     * 
     * @param coolAccess the coolAccess value to set.
     * @return the CapacityPoolPatch object itself.
     */
    public CapacityPoolPatch withCoolAccess(Boolean coolAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PoolPatchProperties();
        }
        this.innerProperties().withCoolAccess(coolAccess);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
