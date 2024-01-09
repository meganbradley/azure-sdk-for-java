// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The reference to a user assigned identity associated with the Batch pool which
 * a compute node will use.
 */
@Fluent
public final class BatchNodeIdentityReference {

    /*
     * The ARM resource id of the user assigned identity.
     */
    @Generated
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * Creates an instance of BatchNodeIdentityReference class.
     */
    @Generated
    public BatchNodeIdentityReference() {
    }

    /**
     * Get the resourceId property: The ARM resource id of the user assigned identity.
     *
     * @return the resourceId value.
     */
    @Generated
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ARM resource id of the user assigned identity.
     *
     * @param resourceId the resourceId value to set.
     * @return the BatchNodeIdentityReference object itself.
     */
    @Generated
    public BatchNodeIdentityReference setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
}
