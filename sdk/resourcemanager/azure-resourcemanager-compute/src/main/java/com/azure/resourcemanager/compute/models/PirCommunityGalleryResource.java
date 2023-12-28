// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.compute.fluent.models.CommunityGalleryIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Base information about the community gallery resource in azure compute gallery.
 */
@Fluent
public class PirCommunityGalleryResource {
    /*
     * Resource name
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource location
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The identifier information of community gallery.
     */
    @JsonProperty(value = "identifier")
    private CommunityGalleryIdentifier innerIdentifier;

    /**
     * Creates an instance of PirCommunityGalleryResource class.
     */
    public PirCommunityGalleryResource() {
    }

    /**
     * Get the name property: Resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the location property: Resource location.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the type property: Resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerIdentifier property: The identifier information of community gallery.
     * 
     * @return the innerIdentifier value.
     */
    private CommunityGalleryIdentifier innerIdentifier() {
        return this.innerIdentifier;
    }

    /**
     * Get the uniqueId property: The unique id of this community gallery.
     * 
     * @return the uniqueId value.
     */
    public String uniqueId() {
        return this.innerIdentifier() == null ? null : this.innerIdentifier().uniqueId();
    }

    /**
     * Set the uniqueId property: The unique id of this community gallery.
     * 
     * @param uniqueId the uniqueId value to set.
     * @return the PirCommunityGalleryResource object itself.
     */
    public PirCommunityGalleryResource withUniqueId(String uniqueId) {
        if (this.innerIdentifier() == null) {
            this.innerIdentifier = new CommunityGalleryIdentifier();
        }
        this.innerIdentifier().withUniqueId(uniqueId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerIdentifier() != null) {
            innerIdentifier().validate();
        }
    }
}
