// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Provider, Resource and Operation values. */
@Fluent
public final class OperationDisplay {
    /*
     * Service provider: Microsoft.Automation
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * Resource on which the operation is performed: Runbooks, Jobs etc.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * Operation type: Read, write, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Get the provider property: Service provider: Microsoft.Automation.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: Service provider: Microsoft.Automation.
     *
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: Resource on which the operation is performed: Runbooks, Jobs etc.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: Resource on which the operation is performed: Runbooks, Jobs etc.
     *
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: Operation type: Read, write, delete, etc.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: Operation type: Read, write, delete, etc.
     *
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
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
