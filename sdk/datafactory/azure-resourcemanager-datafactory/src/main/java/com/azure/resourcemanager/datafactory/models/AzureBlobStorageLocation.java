// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The location of azure blob dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobStorageLocation")
@Fluent
public final class AzureBlobStorageLocation extends DatasetLocation {
    /*
     * Specify the container of azure blob. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "container")
    private Object container;

    /**
     * Creates an instance of AzureBlobStorageLocation class.
     */
    public AzureBlobStorageLocation() {
    }

    /**
     * Get the container property: Specify the container of azure blob. Type: string (or Expression with resultType
     * string).
     * 
     * @return the container value.
     */
    public Object container() {
        return this.container;
    }

    /**
     * Set the container property: Specify the container of azure blob. Type: string (or Expression with resultType
     * string).
     * 
     * @param container the container value to set.
     * @return the AzureBlobStorageLocation object itself.
     */
    public AzureBlobStorageLocation withContainer(Object container) {
        this.container = container;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobStorageLocation withFolderPath(Object folderPath) {
        super.withFolderPath(folderPath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobStorageLocation withFileName(Object fileName) {
        super.withFileName(fileName);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
