// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.devcenter.models.RecommendedMachineConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents an image. */
@Fluent
public final class ImageInner extends ProxyResource {
    /*
     * Image properties.
     */
    @JsonProperty(value = "properties")
    private ImageProperties innerProperties;

    /**
     * Get the innerProperties property: Image properties.
     *
     * @return the innerProperties value.
     */
    private ImageProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: The description of the image.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the publisher property: The publisher of the image.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.innerProperties() == null ? null : this.innerProperties().publisher();
    }

    /**
     * Get the offer property: The name of the image offer.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.innerProperties() == null ? null : this.innerProperties().offer();
    }

    /**
     * Get the sku property: The SKU name for the image.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Get the recommendedMachineConfiguration property: The recommended machine configuration to use with the image.
     *
     * @return the recommendedMachineConfiguration value.
     */
    public RecommendedMachineConfiguration recommendedMachineConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().recommendedMachineConfiguration();
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
