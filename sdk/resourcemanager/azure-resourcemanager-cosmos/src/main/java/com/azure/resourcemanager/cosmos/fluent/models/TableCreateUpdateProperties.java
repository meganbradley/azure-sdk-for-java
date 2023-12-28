// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.CreateUpdateOptions;
import com.azure.resourcemanager.cosmos.models.TableResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties to create and update Azure Cosmos DB Table.
 */
@Fluent
public final class TableCreateUpdateProperties {
    /*
     * The standard JSON format of a Table
     */
    @JsonProperty(value = "resource", required = true)
    private TableResource resource;

    /*
     * A key-value pair of options to be applied for the request. This corresponds to the headers sent with the
     * request.
     */
    @JsonProperty(value = "options")
    private CreateUpdateOptions options;

    /**
     * Creates an instance of TableCreateUpdateProperties class.
     */
    public TableCreateUpdateProperties() {
    }

    /**
     * Get the resource property: The standard JSON format of a Table.
     * 
     * @return the resource value.
     */
    public TableResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a Table.
     * 
     * @param resource the resource value to set.
     * @return the TableCreateUpdateProperties object itself.
     */
    public TableCreateUpdateProperties withResource(TableResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @return the options value.
     */
    public CreateUpdateOptions options() {
        return this.options;
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     * 
     * @param options the options value to set.
     * @return the TableCreateUpdateProperties object itself.
     */
    public TableCreateUpdateProperties withOptions(CreateUpdateOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resource() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property resource in model TableCreateUpdateProperties"));
        } else {
            resource().validate();
        }
        if (options() != null) {
            options().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TableCreateUpdateProperties.class);
}
