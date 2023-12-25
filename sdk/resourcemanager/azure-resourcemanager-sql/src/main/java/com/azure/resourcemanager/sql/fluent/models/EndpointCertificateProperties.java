// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of an endpoint certificate.
 */
@Fluent
public final class EndpointCertificateProperties {
    /*
     * The certificate public blob
     */
    @JsonProperty(value = "publicBlob")
    private String publicBlob;

    /**
     * Creates an instance of EndpointCertificateProperties class.
     */
    public EndpointCertificateProperties() {
    }

    /**
     * Get the publicBlob property: The certificate public blob.
     * 
     * @return the publicBlob value.
     */
    public String publicBlob() {
        return this.publicBlob;
    }

    /**
     * Set the publicBlob property: The certificate public blob.
     * 
     * @param publicBlob the publicBlob value to set.
     * @return the EndpointCertificateProperties object itself.
     */
    public EndpointCertificateProperties withPublicBlob(String publicBlob) {
        this.publicBlob = publicBlob;
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
