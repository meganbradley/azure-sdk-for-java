// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container App container resource requirements.
 */
@Fluent
public final class ContainerResources {
    /*
     * Required CPU in cores, e.g. 0.5
     */
    @JsonProperty(value = "cpu")
    private Double cpu;

    /*
     * Required memory, e.g. "250Mb"
     */
    @JsonProperty(value = "memory")
    private String memory;

    /**
     * Creates an instance of ContainerResources class.
     */
    public ContainerResources() {
    }

    /**
     * Get the cpu property: Required CPU in cores, e.g. 0.5.
     * 
     * @return the cpu value.
     */
    public Double cpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: Required CPU in cores, e.g. 0.5.
     * 
     * @param cpu the cpu value to set.
     * @return the ContainerResources object itself.
     */
    public ContainerResources withCpu(Double cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Get the memory property: Required memory, e.g. "250Mb".
     * 
     * @return the memory value.
     */
    public String memory() {
        return this.memory;
    }

    /**
     * Set the memory property: Required memory, e.g. "250Mb".
     * 
     * @param memory the memory value to set.
     * @return the ContainerResources object itself.
     */
    public ContainerResources withMemory(String memory) {
        this.memory = memory;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
