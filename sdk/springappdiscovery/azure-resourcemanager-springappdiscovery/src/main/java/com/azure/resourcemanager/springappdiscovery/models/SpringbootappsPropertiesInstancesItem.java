// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SpringbootappsPropertiesInstancesItem model.
 */
@Fluent
public final class SpringbootappsPropertiesInstancesItem {
    /*
     * The machine ARM resource Id of this app instance
     */
    @JsonProperty(value = "machineArmId", required = true)
    private String machineArmId;

    /*
     * The instance count of this app instance
     */
    @JsonProperty(value = "instanceCount")
    private Integer instanceCount;

    /*
     * The jvm heap memory allocated of this app instance
     */
    @JsonProperty(value = "jvmMemoryInMB")
    private Integer jvmMemoryInMB;

    /**
     * Creates an instance of SpringbootappsPropertiesInstancesItem class.
     */
    public SpringbootappsPropertiesInstancesItem() {
    }

    /**
     * Get the machineArmId property: The machine ARM resource Id of this app instance.
     * 
     * @return the machineArmId value.
     */
    public String machineArmId() {
        return this.machineArmId;
    }

    /**
     * Set the machineArmId property: The machine ARM resource Id of this app instance.
     * 
     * @param machineArmId the machineArmId value to set.
     * @return the SpringbootappsPropertiesInstancesItem object itself.
     */
    public SpringbootappsPropertiesInstancesItem withMachineArmId(String machineArmId) {
        this.machineArmId = machineArmId;
        return this;
    }

    /**
     * Get the instanceCount property: The instance count of this app instance.
     * 
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instanceCount property: The instance count of this app instance.
     * 
     * @param instanceCount the instanceCount value to set.
     * @return the SpringbootappsPropertiesInstancesItem object itself.
     */
    public SpringbootappsPropertiesInstancesItem withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * Get the jvmMemoryInMB property: The jvm heap memory allocated of this app instance.
     * 
     * @return the jvmMemoryInMB value.
     */
    public Integer jvmMemoryInMB() {
        return this.jvmMemoryInMB;
    }

    /**
     * Set the jvmMemoryInMB property: The jvm heap memory allocated of this app instance.
     * 
     * @param jvmMemoryInMB the jvmMemoryInMB value to set.
     * @return the SpringbootappsPropertiesInstancesItem object itself.
     */
    public SpringbootappsPropertiesInstancesItem withJvmMemoryInMB(Integer jvmMemoryInMB) {
        this.jvmMemoryInMB = jvmMemoryInMB;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (machineArmId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property machineArmId in model SpringbootappsPropertiesInstancesItem"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SpringbootappsPropertiesInstancesItem.class);
}
