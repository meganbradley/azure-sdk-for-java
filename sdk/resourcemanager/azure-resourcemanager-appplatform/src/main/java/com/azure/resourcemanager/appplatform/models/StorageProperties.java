// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Storage resource payload.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "storageType",
    defaultImpl = StorageProperties.class)
@JsonTypeName("StorageProperties")
@JsonSubTypes({ @JsonSubTypes.Type(name = "StorageAccount", value = StorageAccount.class) })
@Immutable
public class StorageProperties {
    /**
     * Creates an instance of StorageProperties class.
     */
    public StorageProperties() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
