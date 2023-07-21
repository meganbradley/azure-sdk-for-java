// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.appplatform.models.CustomizedAcceleratorProperties;
import com.azure.resourcemanager.appplatform.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Customized accelerator resource. */
@Fluent
public final class CustomizedAcceleratorResourceInner extends ProxyResource {
    /*
     * Customized accelerator properties payload
     */
    @JsonProperty(value = "properties")
    private CustomizedAcceleratorProperties properties;

    /*
     * Sku of the customized accelerator resource
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /** Creates an instance of CustomizedAcceleratorResourceInner class. */
    public CustomizedAcceleratorResourceInner() {
    }

    /**
     * Get the properties property: Customized accelerator properties payload.
     *
     * @return the properties value.
     */
    public CustomizedAcceleratorProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Customized accelerator properties payload.
     *
     * @param properties the properties value to set.
     * @return the CustomizedAcceleratorResourceInner object itself.
     */
    public CustomizedAcceleratorResourceInner withProperties(CustomizedAcceleratorProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Sku of the customized accelerator resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku of the customized accelerator resource.
     *
     * @param sku the sku value to set.
     * @return the CustomizedAcceleratorResourceInner object itself.
     */
    public CustomizedAcceleratorResourceInner withSku(Sku sku) {
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
