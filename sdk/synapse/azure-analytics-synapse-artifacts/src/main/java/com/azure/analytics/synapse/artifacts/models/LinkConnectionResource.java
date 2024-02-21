// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LinkConnectionResource model.
 */
@Fluent
public final class LinkConnectionResource {
    /*
     * Link connection id
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Link connection name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Link connection type
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Properties of link connection
     */
    @JsonProperty(value = "properties", required = true)
    private LinkConnection properties;

    /*
     * Link connection description
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of LinkConnectionResource class.
     */
    public LinkConnectionResource() {
    }

    /**
     * Get the id property: Link connection id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Link connection id.
     * 
     * @param id the id value to set.
     * @return the LinkConnectionResource object itself.
     */
    public LinkConnectionResource setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: Link connection name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Link connection name.
     * 
     * @param name the name value to set.
     * @return the LinkConnectionResource object itself.
     */
    public LinkConnectionResource setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Link connection type.
     * 
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: Link connection type.
     * 
     * @param type the type value to set.
     * @return the LinkConnectionResource object itself.
     */
    public LinkConnectionResource setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the properties property: Properties of link connection.
     * 
     * @return the properties value.
     */
    public LinkConnection getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of link connection.
     * 
     * @param properties the properties value to set.
     * @return the LinkConnectionResource object itself.
     */
    public LinkConnectionResource setProperties(LinkConnection properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the description property: Link connection description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Link connection description.
     * 
     * @param description the description value to set.
     * @return the LinkConnectionResource object itself.
     */
    public LinkConnectionResource setDescription(String description) {
        this.description = description;
        return this;
    }
}
