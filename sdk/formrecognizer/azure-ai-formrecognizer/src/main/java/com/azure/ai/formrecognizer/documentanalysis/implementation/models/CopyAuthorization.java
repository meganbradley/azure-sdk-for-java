// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Authorization to copy a document model to the specified target resource and modelId. */
@Fluent
public final class CopyAuthorization {
    /*
     * ID of the target Azure resource where the document model should be copied to.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * Location of the target Azure resource where the document model should be copied to.
     */
    @JsonProperty(value = "targetResourceRegion", required = true)
    private String targetResourceRegion;

    /*
     * Identifier of the target document model.
     */
    @JsonProperty(value = "targetModelId", required = true)
    private String targetModelId;

    /*
     * URL of the copied document model in the target account.
     */
    @JsonProperty(value = "targetModelLocation", required = true)
    private String targetModelLocation;

    /*
     * Token used to authorize the request.
     */
    @JsonProperty(value = "accessToken", required = true)
    private String accessToken;

    /*
     * Date/time when the access token expires.
     */
    @JsonProperty(value = "expirationDateTime", required = true)
    private OffsetDateTime expirationDateTime;

    /** Creates an instance of CopyAuthorization class. */
    public CopyAuthorization() {}

    /**
     * Get the targetResourceId property: ID of the target Azure resource where the document model should be copied to.
     *
     * @return the targetResourceId value.
     */
    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: ID of the target Azure resource where the document model should be copied to.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the CopyAuthorization object itself.
     */
    public CopyAuthorization setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the targetResourceRegion property: Location of the target Azure resource where the document model should be
     * copied to.
     *
     * @return the targetResourceRegion value.
     */
    public String getTargetResourceRegion() {
        return this.targetResourceRegion;
    }

    /**
     * Set the targetResourceRegion property: Location of the target Azure resource where the document model should be
     * copied to.
     *
     * @param targetResourceRegion the targetResourceRegion value to set.
     * @return the CopyAuthorization object itself.
     */
    public CopyAuthorization setTargetResourceRegion(String targetResourceRegion) {
        this.targetResourceRegion = targetResourceRegion;
        return this;
    }

    /**
     * Get the targetModelId property: Identifier of the target document model.
     *
     * @return the targetModelId value.
     */
    public String getTargetModelId() {
        return this.targetModelId;
    }

    /**
     * Set the targetModelId property: Identifier of the target document model.
     *
     * @param targetModelId the targetModelId value to set.
     * @return the CopyAuthorization object itself.
     */
    public CopyAuthorization setTargetModelId(String targetModelId) {
        this.targetModelId = targetModelId;
        return this;
    }

    /**
     * Get the targetModelLocation property: URL of the copied document model in the target account.
     *
     * @return the targetModelLocation value.
     */
    public String getTargetModelLocation() {
        return this.targetModelLocation;
    }

    /**
     * Set the targetModelLocation property: URL of the copied document model in the target account.
     *
     * @param targetModelLocation the targetModelLocation value to set.
     * @return the CopyAuthorization object itself.
     */
    public CopyAuthorization setTargetModelLocation(String targetModelLocation) {
        this.targetModelLocation = targetModelLocation;
        return this;
    }

    /**
     * Get the accessToken property: Token used to authorize the request.
     *
     * @return the accessToken value.
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * Set the accessToken property: Token used to authorize the request.
     *
     * @param accessToken the accessToken value to set.
     * @return the CopyAuthorization object itself.
     */
    public CopyAuthorization setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get the expirationDateTime property: Date/time when the access token expires.
     *
     * @return the expirationDateTime value.
     */
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }

    /**
     * Set the expirationDateTime property: Date/time when the access token expires.
     *
     * @param expirationDateTime the expirationDateTime value to set.
     * @return the CopyAuthorization object itself.
     */
    public CopyAuthorization setExpirationDateTime(OffsetDateTime expirationDateTime) {
        this.expirationDateTime = expirationDateTime;
        return this;
    }
}
