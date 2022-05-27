// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Reference to an asset via its ARM resource ID. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "referenceType")
@JsonTypeName("Id")
@Fluent
public final class PartialIdAssetReference extends PartialAssetReferenceBase {
    /*
     * ARM resource ID of the asset.
     */
    @JsonProperty(value = "assetId")
    private String assetId;

    /**
     * Get the assetId property: ARM resource ID of the asset.
     *
     * @return the assetId value.
     */
    public String assetId() {
        return this.assetId;
    }

    /**
     * Set the assetId property: ARM resource ID of the asset.
     *
     * @param assetId the assetId value to set.
     * @return the PartialIdAssetReference object itself.
     */
    public PartialIdAssetReference withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
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
