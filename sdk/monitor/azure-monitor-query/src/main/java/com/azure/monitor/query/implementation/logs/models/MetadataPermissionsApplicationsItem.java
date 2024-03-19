// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MetadataPermissionsApplicationsItem model. */
@Immutable
public final class MetadataPermissionsApplicationsItem {
    /*
     * The resource ID on the permission indication.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /**
     * Creates an instance of MetadataPermissionsApplicationsItem class.
     *
     * @param resourceId the resourceId value to set.
     */
    @JsonCreator
    public MetadataPermissionsApplicationsItem(@JsonProperty(value = "resourceId", required = true) String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Get the resourceId property: The resource ID on the permission indication.
     *
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getResourceId() == null) {
            throw new IllegalArgumentException(
                    "Missing required property resourceId in model MetadataPermissionsApplicationsItem");
        }
    }
}
