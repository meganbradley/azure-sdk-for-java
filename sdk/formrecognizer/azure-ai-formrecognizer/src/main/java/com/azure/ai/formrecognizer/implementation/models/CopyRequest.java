// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameter to copy an existing custom model from the source resource to a target resource referenced by the
 * resource ID.
 */
@Fluent
public final class CopyRequest {
    /*
     * Azure Resource Id of the target Form Recognizer resource where the model is copied to.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /*
     * Location of the target Azure resource. A valid Azure region name supported by Cognitive Services.
     */
    @JsonProperty(value = "targetResourceRegion", required = true)
    private String targetResourceRegion;

    /*
     * Entity that encodes claims to authorize the copy request.
     */
    @JsonProperty(value = "copyAuthorization", required = true)
    private CopyAuthorizationResult copyAuthorization;

    /** Creates an instance of CopyRequest class. */
    public CopyRequest() {}

    /**
     * Get the targetResourceId property: Azure Resource Id of the target Form Recognizer resource where the model is
     * copied to.
     *
     * @return the targetResourceId value.
     */
    public String getTargetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: Azure Resource Id of the target Form Recognizer resource where the model is
     * copied to.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the CopyRequest object itself.
     */
    public CopyRequest setTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the targetResourceRegion property: Location of the target Azure resource. A valid Azure region name supported
     * by Cognitive Services.
     *
     * @return the targetResourceRegion value.
     */
    public String getTargetResourceRegion() {
        return this.targetResourceRegion;
    }

    /**
     * Set the targetResourceRegion property: Location of the target Azure resource. A valid Azure region name supported
     * by Cognitive Services.
     *
     * @param targetResourceRegion the targetResourceRegion value to set.
     * @return the CopyRequest object itself.
     */
    public CopyRequest setTargetResourceRegion(String targetResourceRegion) {
        this.targetResourceRegion = targetResourceRegion;
        return this;
    }

    /**
     * Get the copyAuthorization property: Entity that encodes claims to authorize the copy request.
     *
     * @return the copyAuthorization value.
     */
    public CopyAuthorizationResult getCopyAuthorization() {
        return this.copyAuthorization;
    }

    /**
     * Set the copyAuthorization property: Entity that encodes claims to authorize the copy request.
     *
     * @param copyAuthorization the copyAuthorization value to set.
     * @return the CopyRequest object itself.
     */
    public CopyRequest setCopyAuthorization(CopyAuthorizationResult copyAuthorization) {
        this.copyAuthorization = copyAuthorization;
        return this;
    }
}
