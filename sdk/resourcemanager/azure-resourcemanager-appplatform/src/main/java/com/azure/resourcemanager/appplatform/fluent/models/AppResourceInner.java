// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.appplatform.models.AppResourceProperties;
import com.azure.resourcemanager.appplatform.models.ManagedIdentityProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** App resource payload. */
@Fluent
public final class AppResourceInner extends ProxyResource {
    /*
     * Properties of the App resource
     */
    @JsonProperty(value = "properties")
    private AppResourceProperties properties;

    /*
     * The Managed Identity type of the app resource
     */
    @JsonProperty(value = "identity")
    private ManagedIdentityProperties identity;

    /*
     * The GEO location of the application, always the same with its parent resource
     */
    @JsonProperty(value = "location")
    private String location;

    /** Creates an instance of AppResourceInner class. */
    public AppResourceInner() {
    }

    /**
     * Get the properties property: Properties of the App resource.
     *
     * @return the properties value.
     */
    public AppResourceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the App resource.
     *
     * @param properties the properties value to set.
     * @return the AppResourceInner object itself.
     */
    public AppResourceInner withProperties(AppResourceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the identity property: The Managed Identity type of the app resource.
     *
     * @return the identity value.
     */
    public ManagedIdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The Managed Identity type of the app resource.
     *
     * @param identity the identity value to set.
     * @return the AppResourceInner object itself.
     */
    public AppResourceInner withIdentity(ManagedIdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the location property: The GEO location of the application, always the same with its parent resource.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The GEO location of the application, always the same with its parent resource.
     *
     * @param location the location value to set.
     * @return the AppResourceInner object itself.
     */
    public AppResourceInner withLocation(String location) {
        this.location = location;
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
