// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** A Certificate that can be installed on Compute Nodes and can be used to authenticate operations on the machine. */
@Fluent
public final class Certificate {

    /*
     * The X.509 thumbprint of the Certificate. This is a sequence of up to 40 hex
     * digits.
     */
    @Generated
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /*
     * The algorithm used to derive the thumbprint.
     */
    @Generated
    @JsonProperty(value = "thumbprintAlgorithm")
    private String thumbprintAlgorithm;

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
    private CertificateState state;

    /*
     * The time at which the Certificate entered its current state.
     */
    @Generated
    @JsonProperty(value = "stateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime stateTransitionTime;

    /*
     * This property is not set if the Certificate is in its initial active state.
     */
    @Generated
    @JsonProperty(value = "previousState", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateState previousState;

    /*
     * This property is not set if the Certificate is in its initial Active state.
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
     * This property is set only if the Certificate is in the DeleteFailed state.
     */
    @Generated
    @JsonProperty(value = "deleteCertificateError", access = JsonProperty.Access.WRITE_ONLY)
    private DeleteCertificateError deleteCertificateError;

    /*
     * The base64-encoded contents of the Certificate. The maximum size is 10KB.
     */
    @Generated
    @JsonProperty(value = "data")
    private String data;

    /*
     * The format of the Certificate data.
     */
    @Generated
    @JsonProperty(value = "certificateFormat")
    private CertificateFormat certificateFormat;

    /*
     * This must be omitted if the Certificate format is cer.
     */
    @Generated
    @JsonProperty(value = "password")
    private String password;

    /**
     * Creates an instance of Certificate class.
     *
     * @param thumbprint the thumbprint value to set.
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set.
     * @param data the data value to set.
     */
    @Generated
    @JsonCreator
    public Certificate(
            @JsonProperty(value = "thumbprint") String thumbprint,
            @JsonProperty(value = "thumbprintAlgorithm") String thumbprintAlgorithm,
            @JsonProperty(value = "data") String data) {
        this.thumbprint = thumbprint;
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        this.data = data;
    }

    /**
     * Get the thumbprint property: The X.509 thumbprint of the Certificate. This is a sequence of up to 40 hex digits.
     *
     * @return the thumbprint value.
     */
    @Generated
    public String getThumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the thumbprintAlgorithm property: The algorithm used to derive the thumbprint.
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
    public CertificateState getState() {
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
     * Get the previousState property: This property is not set if the Certificate is in its initial active state.
     *
     * @return the previousState value.
     */
    @Generated
    public CertificateState getPreviousState() {
        return this.previousState;
    }

    /**
     * Get the previousStateTransitionTime property: This property is not set if the Certificate is in its initial
     * Active state.
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
     * Get the deleteCertificateError property: This property is set only if the Certificate is in the DeleteFailed
     * state.
     *
     * @return the deleteCertificateError value.
     */
    @Generated
    public DeleteCertificateError getDeleteCertificateError() {
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
    public CertificateFormat getCertificateFormat() {
        return this.certificateFormat;
    }

    /**
     * Set the certificateFormat property: The format of the Certificate data.
     *
     * @param certificateFormat the certificateFormat value to set.
     * @return the Certificate object itself.
     */
    @Generated
    public Certificate setCertificateFormat(CertificateFormat certificateFormat) {
        this.certificateFormat = certificateFormat;
        return this;
    }

    /**
     * Get the password property: This must be omitted if the Certificate format is cer.
     *
     * @return the password value.
     */
    @Generated
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: This must be omitted if the Certificate format is cer.
     *
     * @param password the password value to set.
     * @return the Certificate object itself.
     */
    @Generated
    public Certificate setPassword(String password) {
        this.password = password;
        return this;
    }
}
