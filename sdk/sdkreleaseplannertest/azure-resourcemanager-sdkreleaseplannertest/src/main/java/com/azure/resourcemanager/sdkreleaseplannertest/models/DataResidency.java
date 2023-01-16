// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Wraps data-residency related information for edge-resource and this should be used with ARM layer. */
@Fluent
public final class DataResidency {
    /*
     * DataResidencyType enum
     */
    @JsonProperty(value = "type")
    private DataResidencyType type;

    /** Creates an instance of DataResidency class. */
    public DataResidency() {
    }

    /**
     * Get the type property: DataResidencyType enum.
     *
     * @return the type value.
     */
    public DataResidencyType type() {
        return this.type;
    }

    /**
     * Set the type property: DataResidencyType enum.
     *
     * @param type the type value to set.
     * @return the DataResidency object itself.
     */
    public DataResidency withType(DataResidencyType type) {
        this.type = type;
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
