// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Managed Certificate used for https. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ManagedCertificate")
@Immutable
public final class ManagedCertificateParameters extends SecretParameters {
    /*
     * Subject name in the certificate.
     */
    @JsonProperty(value = "subject", access = JsonProperty.Access.WRITE_ONLY)
    private String subject;

    /*
     * Certificate expiration date.
     */
    @JsonProperty(value = "expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private String expirationDate;

    /**
     * Get the subject property: Subject name in the certificate.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     *
     * @return the expirationDate value.
     */
    public String expirationDate() {
        return this.expirationDate;
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
