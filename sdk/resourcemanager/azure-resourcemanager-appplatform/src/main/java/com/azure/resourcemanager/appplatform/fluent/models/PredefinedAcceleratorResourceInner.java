// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.appplatform.models.PredefinedAcceleratorProperties;
import com.azure.resourcemanager.appplatform.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Predefined accelerator resource. */
@Fluent
public final class PredefinedAcceleratorResourceInner extends ProxyResource {
    /*
     * Predefined accelerator properties payload
     */
    @JsonProperty(value = "properties")
    private PredefinedAcceleratorProperties properties;

    /*
     * Sku of the predefined accelerator resource
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /** Creates an instance of PredefinedAcceleratorResourceInner class. */
    public PredefinedAcceleratorResourceInner() {
    }

    /**
     * Get the properties property: Predefined accelerator properties payload.
     *
     * @return the properties value.
     */
    public PredefinedAcceleratorProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Predefined accelerator properties payload.
     *
     * @param properties the properties value to set.
     * @return the PredefinedAcceleratorResourceInner object itself.
     */
    public PredefinedAcceleratorResourceInner withProperties(PredefinedAcceleratorProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Sku of the predefined accelerator resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku of the predefined accelerator resource.
     *
     * @param sku the sku value to set.
     * @return the PredefinedAcceleratorResourceInner object itself.
     */
    public PredefinedAcceleratorResourceInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
