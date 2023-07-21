// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Resource request payload of Build Resource. */
@Fluent
public final class BuildResourceRequests {
    /*
     * Optional Cpu allocated to the build resource. 1 core can be represented by 1 or 1000m.
     * The default value is 1, this should not exceed build service agent pool cpu size.
     */
    @JsonProperty(value = "cpu")
    private String cpu;

    /*
     * Optional Memory allocated to the build resource. 1 GB can be represented by 1Gi or 1024Mi.
     * The default value is 2Gi, this should not exceed build service agent pool memory size.
     */
    @JsonProperty(value = "memory")
    private String memory;

    /** Creates an instance of BuildResourceRequests class. */
    public BuildResourceRequests() {
    }

    /**
     * Get the cpu property: Optional Cpu allocated to the build resource. 1 core can be represented by 1 or 1000m. The
     * default value is 1, this should not exceed build service agent pool cpu size.
     *
     * @return the cpu value.
     */
    public String cpu() {
        return this.cpu;
    }

    /**
     * Set the cpu property: Optional Cpu allocated to the build resource. 1 core can be represented by 1 or 1000m. The
     * default value is 1, this should not exceed build service agent pool cpu size.
     *
     * @param cpu the cpu value to set.
     * @return the BuildResourceRequests object itself.
     */
    public BuildResourceRequests withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Get the memory property: Optional Memory allocated to the build resource. 1 GB can be represented by 1Gi or
     * 1024Mi. The default value is 2Gi, this should not exceed build service agent pool memory size.
     *
     * @return the memory value.
     */
    public String memory() {
        return this.memory;
    }

    /**
     * Set the memory property: Optional Memory allocated to the build resource. 1 GB can be represented by 1Gi or
     * 1024Mi. The default value is 2Gi, this should not exceed build service agent pool memory size.
     *
     * @param memory the memory value to set.
     * @return the BuildResourceRequests object itself.
     */
    public BuildResourceRequests withMemory(String memory) {
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
