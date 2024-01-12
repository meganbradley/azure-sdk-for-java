// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A private link resource.
 */
@Fluent
public final class PrivateLinkResourceInner {
    /*
     * The ID of the private link resource.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The name of the private link resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The group ID of the resource.
     */
    @JsonProperty(value = "groupId")
    private String groupId;

    /*
     * The RequiredMembers of the resource
     */
    @JsonProperty(value = "requiredMembers")
    private List<String> requiredMembers;

    /*
     * The private link service ID of the resource, this field is exposed only to NRP internally.
     */
    @JsonProperty(value = "privateLinkServiceID", access = JsonProperty.Access.WRITE_ONLY)
    private String privateLinkServiceId;

    /**
     * Creates an instance of PrivateLinkResourceInner class.
     */
    public PrivateLinkResourceInner() {
    }

    /**
     * Get the id property: The ID of the private link resource.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ID of the private link resource.
     *
     * @param id the id value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the private link resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the private link resource.
     *
     * @param name the name value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type.
     *
     * @param type the type value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the groupId property: The group ID of the resource.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Set the groupId property: The group ID of the resource.
     *
     * @param groupId the groupId value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get the requiredMembers property: The RequiredMembers of the resource.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Set the requiredMembers property: The RequiredMembers of the resource.
     *
     * @param requiredMembers the requiredMembers value to set.
     * @return the PrivateLinkResourceInner object itself.
     */
    public PrivateLinkResourceInner withRequiredMembers(List<String> requiredMembers) {
        this.requiredMembers = requiredMembers;
        return this;
    }

    /**
     * Get the privateLinkServiceId property: The private link service ID of the resource, this field is exposed only
     * to NRP internally.
     *
     * @return the privateLinkServiceId value.
     */
    public String privateLinkServiceId() {
        return this.privateLinkServiceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
