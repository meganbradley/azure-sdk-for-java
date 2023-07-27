// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Endpoint resource, which contains information about file sources and targets. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "endpointType",
    defaultImpl = EndpointBaseUpdateProperties.class)
@JsonTypeName("EndpointBaseUpdateProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "AzureStorageBlobContainer",
        value = AzureStorageBlobContainerEndpointUpdateProperties.class),
    @JsonSubTypes.Type(name = "NfsMount", value = NfsMountEndpointUpdateProperties.class),
    @JsonSubTypes.Type(
        name = "AzureStorageSmbFileShare",
        value = AzureStorageSmbFileShareEndpointUpdateProperties.class),
    @JsonSubTypes.Type(name = "SmbMount", value = SmbMountEndpointUpdateProperties.class)
})
@Fluent
public class EndpointBaseUpdateProperties {
    /*
     * A description for the Endpoint.
     */
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of EndpointBaseUpdateProperties class. */
    public EndpointBaseUpdateProperties() {
    }

    /**
     * Get the description property: A description for the Endpoint.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for the Endpoint.
     *
     * @param description the description value to set.
     * @return the EndpointBaseUpdateProperties object itself.
     */
    public EndpointBaseUpdateProperties withDescription(String description) {
        this.description = description;
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
