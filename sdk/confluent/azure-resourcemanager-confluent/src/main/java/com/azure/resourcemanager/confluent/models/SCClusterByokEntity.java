// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The network associated with this object.
 */
@Fluent
public final class SCClusterByokEntity {
    /*
     * ID of the referred resource
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * API URL for accessing or modifying the referred object
     */
    @JsonProperty(value = "related")
    private String related;

    /*
     * CRN reference to the referred resource
     */
    @JsonProperty(value = "resourceName")
    private String resourceName;

    /**
     * Creates an instance of SCClusterByokEntity class.
     */
    public SCClusterByokEntity() {
    }

    /**
     * Get the id property: ID of the referred resource.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: ID of the referred resource.
     * 
     * @param id the id value to set.
     * @return the SCClusterByokEntity object itself.
     */
    public SCClusterByokEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the related property: API URL for accessing or modifying the referred object.
     * 
     * @return the related value.
     */
    public String related() {
        return this.related;
    }

    /**
     * Set the related property: API URL for accessing or modifying the referred object.
     * 
     * @param related the related value to set.
     * @return the SCClusterByokEntity object itself.
     */
    public SCClusterByokEntity withRelated(String related) {
        this.related = related;
        return this;
    }

    /**
     * Get the resourceName property: CRN reference to the referred resource.
     * 
     * @return the resourceName value.
     */
    public String resourceName() {
        return this.resourceName;
    }

    /**
     * Set the resourceName property: CRN reference to the referred resource.
     * 
     * @param resourceName the resourceName value to set.
     * @return the SCClusterByokEntity object itself.
     */
    public SCClusterByokEntity withResourceName(String resourceName) {
        this.resourceName = resourceName;
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
