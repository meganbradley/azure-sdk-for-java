// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The location of azure blobFS dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = AzureBlobFSLocation.class, visible = true)
@JsonTypeName("AzureBlobFSLocation")
@Fluent
public final class AzureBlobFSLocation extends DatasetLocation {
    /*
     * Type of dataset storage location.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "AzureBlobFSLocation";

    /*
     * Specify the fileSystem of azure blobFS. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "fileSystem")
    private Object fileSystem;

    /**
     * Creates an instance of AzureBlobFSLocation class.
     */
    public AzureBlobFSLocation() {
    }

    /**
     * Get the type property: Type of dataset storage location.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the fileSystem property: Specify the fileSystem of azure blobFS. Type: string (or Expression with resultType
     * string).
     * 
     * @return the fileSystem value.
     */
    public Object fileSystem() {
        return this.fileSystem;
    }

    /**
     * Set the fileSystem property: Specify the fileSystem of azure blobFS. Type: string (or Expression with resultType
     * string).
     * 
     * @param fileSystem the fileSystem value to set.
     * @return the AzureBlobFSLocation object itself.
     */
    public AzureBlobFSLocation withFileSystem(Object fileSystem) {
        this.fileSystem = fileSystem;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobFSLocation withFolderPath(Object folderPath) {
        super.withFolderPath(folderPath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBlobFSLocation withFileName(Object fileName) {
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
