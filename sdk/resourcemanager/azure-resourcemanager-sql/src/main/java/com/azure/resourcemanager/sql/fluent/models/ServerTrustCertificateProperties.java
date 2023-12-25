// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a server trust certificate.
 */
@Fluent
public final class ServerTrustCertificateProperties {
    /*
     * The certificate public blob
     */
    @JsonProperty(value = "publicBlob")
    private String publicBlob;

    /*
     * The certificate thumbprint
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * The certificate name
     */
    @JsonProperty(value = "certificateName", access = JsonProperty.Access.WRITE_ONLY)
    private String certificateName;

    /**
     * Creates an instance of ServerTrustCertificateProperties class.
     */
    public ServerTrustCertificateProperties() {
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
     * @return the ServerTrustCertificateProperties object itself.
     */
    public ServerTrustCertificateProperties withPublicBlob(String publicBlob) {
        this.publicBlob = publicBlob;
        return this;
    }

    /**
     * Get the thumbprint property: The certificate thumbprint.
     * 
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the certificateName property: The certificate name.
     * 
     * @return the certificateName value.
     */
    public String certificateName() {
        return this.certificateName;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
