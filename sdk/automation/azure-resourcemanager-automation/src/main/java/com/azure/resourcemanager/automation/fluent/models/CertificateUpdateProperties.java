// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of the update certificate operation. */
@Fluent
public final class CertificateUpdateProperties {
    /*
     * Gets or sets the description of the certificate.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the description property: Gets or sets the description of the certificate.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description of the certificate.
     *
     * @param description the description value to set.
     * @return the CertificateUpdateProperties object itself.
     */
    public CertificateUpdateProperties withDescription(String description) {
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
