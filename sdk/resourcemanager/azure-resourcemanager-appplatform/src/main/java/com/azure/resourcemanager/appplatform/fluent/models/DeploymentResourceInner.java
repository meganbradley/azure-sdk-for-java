// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.appplatform.models.DeploymentResourceProperties;
import com.azure.resourcemanager.appplatform.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deployment resource payload. */
@Fluent
public final class DeploymentResourceInner extends ProxyResource {
    /*
     * Properties of the Deployment resource
     */
    @JsonProperty(value = "properties")
    private DeploymentResourceProperties properties;

    /*
     * Sku of the Deployment resource
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /** Creates an instance of DeploymentResourceInner class. */
    public DeploymentResourceInner() {
    }

    /**
     * Get the properties property: Properties of the Deployment resource.
     *
     * @return the properties value.
     */
    public DeploymentResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the Deployment resource.
     *
     * @param properties the properties value to set.
     * @return the DeploymentResourceInner object itself.
     */
    public DeploymentResourceInner withProperties(DeploymentResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the sku property: Sku of the Deployment resource.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku of the Deployment resource.
     *
     * @param sku the sku value to set.
     * @return the DeploymentResourceInner object itself.
     */
    public DeploymentResourceInner withSku(Sku sku) {
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
