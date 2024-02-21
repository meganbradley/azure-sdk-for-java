// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the client certificate details using common name.
 */
@Fluent
public final class ClientCertificateCommonName {
    /*
     * Indicates if the client certificate has admin access to the cluster. Non admin clients can perform only read
     * only operations on the cluster.
     */
    @JsonProperty(value = "isAdmin", required = true)
    private boolean isAdmin;

    /*
     * The common name of the client certificate.
     */
    @JsonProperty(value = "certificateCommonName", required = true)
    private String certificateCommonName;

    /*
     * The issuer thumbprint of the client certificate.
     */
    @JsonProperty(value = "certificateIssuerThumbprint", required = true)
    private String certificateIssuerThumbprint;

    /**
     * Creates an instance of ClientCertificateCommonName class.
     */
    public ClientCertificateCommonName() {
    }

    /**
     * Get the isAdmin property: Indicates if the client certificate has admin access to the cluster. Non admin clients
     * can perform only read only operations on the cluster.
     * 
     * @return the isAdmin value.
     */
    public boolean isAdmin() {
        return this.isAdmin;
    }

    /**
     * Set the isAdmin property: Indicates if the client certificate has admin access to the cluster. Non admin clients
     * can perform only read only operations on the cluster.
     * 
     * @param isAdmin the isAdmin value to set.
     * @return the ClientCertificateCommonName object itself.
     */
    public ClientCertificateCommonName withIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * Get the certificateCommonName property: The common name of the client certificate.
     * 
     * @return the certificateCommonName value.
     */
    public String certificateCommonName() {
        return this.certificateCommonName;
    }

    /**
     * Set the certificateCommonName property: The common name of the client certificate.
     * 
     * @param certificateCommonName the certificateCommonName value to set.
     * @return the ClientCertificateCommonName object itself.
     */
    public ClientCertificateCommonName withCertificateCommonName(String certificateCommonName) {
        this.certificateCommonName = certificateCommonName;
        return this;
    }

    /**
     * Get the certificateIssuerThumbprint property: The issuer thumbprint of the client certificate.
     * 
     * @return the certificateIssuerThumbprint value.
     */
    public String certificateIssuerThumbprint() {
        return this.certificateIssuerThumbprint;
    }

    /**
     * Set the certificateIssuerThumbprint property: The issuer thumbprint of the client certificate.
     * 
     * @param certificateIssuerThumbprint the certificateIssuerThumbprint value to set.
     * @return the ClientCertificateCommonName object itself.
     */
    public ClientCertificateCommonName withCertificateIssuerThumbprint(String certificateIssuerThumbprint) {
        this.certificateIssuerThumbprint = certificateIssuerThumbprint;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (certificateCommonName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property certificateCommonName in model ClientCertificateCommonName"));
        }
        if (certificateIssuerThumbprint() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property certificateIssuerThumbprint in model ClientCertificateCommonName"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClientCertificateCommonName.class);
}
