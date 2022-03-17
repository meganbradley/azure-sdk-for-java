// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a private link resource. */
@Immutable
public final class PrivateLinkResourceProperties {
    /*
     * GroupId of a private link resource
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /*
     * RequiredMembers of a private link resource
     */
    @JsonProperty(value = "requiredMembers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredMembers;

    /*
     * RequiredZoneNames of a private link resource
     */
    @JsonProperty(value = "requiredZoneNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredZoneNames;

    /**
     * Get the groupId property: GroupId of a private link resource.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMembers property: RequiredMembers of a private link resource.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Get the requiredZoneNames property: RequiredZoneNames of a private link resource.
     *
     * @return the requiredZoneNames value.
     */
    public List<String> requiredZoneNames() {
        return this.requiredZoneNames;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
