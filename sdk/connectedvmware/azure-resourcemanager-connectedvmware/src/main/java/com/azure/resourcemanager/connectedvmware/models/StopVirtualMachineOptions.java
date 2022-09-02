// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the stop action properties. */
@Fluent
public final class StopVirtualMachineOptions {
    /*
     * Gets or sets a value indicating whether to request non-graceful VM shutdown. True value for this flag indicates
     * non-graceful shutdown whereas false indicates otherwise. Defaults to false.
     */
    @JsonProperty(value = "skipShutdown")
    private Boolean skipShutdown;

    /**
     * Get the skipShutdown property: Gets or sets a value indicating whether to request non-graceful VM shutdown. True
     * value for this flag indicates non-graceful shutdown whereas false indicates otherwise. Defaults to false.
     *
     * @return the skipShutdown value.
     */
    public Boolean skipShutdown() {
        return this.skipShutdown;
    }

    /**
     * Set the skipShutdown property: Gets or sets a value indicating whether to request non-graceful VM shutdown. True
     * value for this flag indicates non-graceful shutdown whereas false indicates otherwise. Defaults to false.
     *
     * @param skipShutdown the skipShutdown value to set.
     * @return the StopVirtualMachineOptions object itself.
     */
    public StopVirtualMachineOptions withSkipShutdown(Boolean skipShutdown) {
        this.skipShutdown = skipShutdown;
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
