// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains information about the soft deletion policy of the gallery. */
@Fluent
public final class SoftDeletePolicy {
    /*
     * Enables soft-deletion for resources in this gallery, allowing them to be recovered within retention time.
     */
    @JsonProperty(value = "isSoftDeleteEnabled")
    private Boolean isSoftDeleteEnabled;

    /**
     * Get the isSoftDeleteEnabled property: Enables soft-deletion for resources in this gallery, allowing them to be
     * recovered within retention time.
     *
     * @return the isSoftDeleteEnabled value.
     */
    public Boolean isSoftDeleteEnabled() {
        return this.isSoftDeleteEnabled;
    }

    /**
     * Set the isSoftDeleteEnabled property: Enables soft-deletion for resources in this gallery, allowing them to be
     * recovered within retention time.
     *
     * @param isSoftDeleteEnabled the isSoftDeleteEnabled value to set.
     * @return the SoftDeletePolicy object itself.
     */
    public SoftDeletePolicy withIsSoftDeleteEnabled(Boolean isSoftDeleteEnabled) {
        this.isSoftDeleteEnabled = isSoftDeleteEnabled;
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
