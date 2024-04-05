// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * A Certificate that can be installed on Compute Nodes and can be used to
 * authenticate operations on the machine.
 */
@Fluent
public final class BatchCertificate {

    /*
     * The X.509 thumbprint of the Certificate. This is a sequence of up to 40 hex digits (it may include spaces but these are removed).
     */
    @Generated
    @JsonProperty(value = "thumbprint")
    private final String thumbprint;

    /*
     * The algorithm used to derive the thumbprint. This must be sha1.
     */
    @Generated
    @JsonProperty(value = "thumbprintAlgorithm")
    private final String thumbprintAlgorithm;

    /*
     * The URL of the Certificate.
     */
    @Generated
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * The state of the Certificate.
     */
    @Generated
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private BatchCertificateState state;

    /*
     * The time at which the Certificate entered its current state.
     */
    @Generated
    @JsonProperty(value = "stateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime stateTransitionTime;

    /*
     * The previous state of the Certificate. This property is not set if the Certificate is in its initial active state.
     */
    @Generated
    @JsonProperty(value = "previousState", access = JsonProperty.Access.WRITE_ONLY)
    private BatchCertificateState previousState;

    /*
     * The time at which the Certificate entered its previous state. This property is not set if the Certificate is in its initial Active state.
     */
    @Generated
    @JsonProperty(value = "previousStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime previousStateTransitionTime;

    /*
     * The public part of the Certificate as a base-64 encoded .cer file.
     */
    @Generated
    @JsonProperty(value = "publicData", access = JsonProperty.Access.WRITE_ONLY)
    private String publicData;

    /*
     * The error that occurred on the last attempt to delete this Certificate. This property is set only if the Certificate is in the DeleteFailed state.
     */
    @Generated
    @JsonProperty(value = "deleteCertificateError", access = JsonProperty.Access.WRITE_ONLY)
    private DeleteBatchCertificateError deleteCertificateError;

    /*
     * The base64-encoded contents of the Certificate. The maximum size is 10KB.
     */
    @Generated
    @JsonProperty(value = "data")
    private final String data;

    /*
     * The format of the Certificate data.
     */
    @Generated
    @JsonProperty(value = "certificateFormat")
    private BatchCertificateFormat certificateFormat;

    /*
     * The password to access the Certificate's private key. This must be omitted if the Certificate format is cer.
     */
    @Generated
    @JsonProperty(value = "password")
    private String password;

    /**
     * Creates an instance of BatchCertificate class.
     *
     * @param thumbprint the thumbprint value to set.
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set.
     * @param data the data value to set.
     */
    @Generated
    @JsonCreator
    public BatchCertificate(@JsonProperty(value = "thumbprint") String thumbprint,
        @JsonProperty(value = "thumbprintAlgorithm") String thumbprintAlgorithm,
        @JsonProperty(value = "data") String data) {
        this.thumbprint = thumbprint;
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        this.data = data;
    }

    /**
     * Get the thumbprint property: The X.509 thumbprint of the Certificate. This is a sequence of up to 40 hex digits
     * (it may include spaces but these are removed).
     *
     * @return the thumbprint value.
     */
    @Generated
    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the thumbprintAlgorithm property: The algorithm used to derive the thumbprint. This must be sha1.
     *
     * @return the thumbprintAlgorithm value.
     */
    @Generated
    public String getThumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    /**
     * Get the url property: The URL of the Certificate.
     *
     * @return the url value.
     */
    @Generated
    public String getUrl() {
        return this.url;
    }

    /**
     * Get the state property: The state of the Certificate.
     *
     * @return the state value.
     */
    @Generated
    public BatchCertificateState getState() {
        return this.state;
    }

    /**
     * Get the stateTransitionTime property: The time at which the Certificate entered its current state.
     *
     * @return the stateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getStateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Get the previousState property: The previous state of the Certificate. This property is not set if the
     * Certificate is in its initial active state.
     *
     * @return the previousState value.
     */
    @Generated
    public BatchCertificateState getPreviousState() {
        return this.previousState;
    }

    /**
     * Get the previousStateTransitionTime property: The time at which the Certificate entered its previous state. This
     * property is not set if the Certificate is in its initial Active state.
     *
     * @return the previousStateTransitionTime value.
     */
    @Generated
    public OffsetDateTime getPreviousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Get the publicData property: The public part of the Certificate as a base-64 encoded .cer file.
     *
     * @return the publicData value.
     */
    @Generated
    public String getPublicData() {
        return this.publicData;
    }

    /**
     * Get the deleteCertificateError property: The error that occurred on the last attempt to delete this Certificate.
     * This property is set only if the Certificate is in the DeleteFailed state.
     *
     * @return the deleteCertificateError value.
     */
    @Generated
    public DeleteBatchCertificateError getDeleteCertificateError() {
        return this.deleteCertificateError;
    }

    /**
     * Get the data property: The base64-encoded contents of the Certificate. The maximum size is 10KB.
     *
     * @return the data value.
     */
    @Generated
    public String getData() {
        return this.data;
    }

    /**
     * Get the certificateFormat property: The format of the Certificate data.
     *
     * @return the certificateFormat value.
     */
    @Generated
    public BatchCertificateFormat getCertificateFormat() {
        return this.certificateFormat;
    }

    /**
     * Set the certificateFormat property: The format of the Certificate data.
     *
     * @param certificateFormat the certificateFormat value to set.
     * @return the BatchCertificate object itself.
     */
    @Generated
    public BatchCertificate setCertificateFormat(BatchCertificateFormat certificateFormat) {
        this.certificateFormat = certificateFormat;
        return this;
    }

    /**
     * Get the password property: The password to access the Certificate's private key. This must be omitted if the
     * Certificate format is cer.
     *
     * @return the password value.
     */
    @Generated
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password to access the Certificate's private key. This must be omitted if the
     * Certificate format is cer.
     *
     * @param password the password value to set.
     * @return the BatchCertificate object itself.
     */
    @Generated
    public BatchCertificate setPassword(String password) {
        this.password = password;
        return this;
    }
}
