// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.fluent.models.EnvironmentTypeUpdateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The environment type for partial update. Properties not provided in the update request will not be changed.
 */
@Fluent
public final class EnvironmentTypeUpdate {
    /*
     * Properties of an environment type to be updated.
     */
    @JsonProperty(value = "properties")
    private EnvironmentTypeUpdateProperties innerProperties;

    /*
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Creates an instance of EnvironmentTypeUpdate class.
     */
    public EnvironmentTypeUpdate() {
    }

    /**
     * Get the innerProperties property: Properties of an environment type to be updated.
     * 
     * @return the innerProperties value.
     */
    private EnvironmentTypeUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the EnvironmentTypeUpdate object itself.
     */
    public EnvironmentTypeUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the displayName property: The display name of the environment type.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the environment type.
     * 
     * @param displayName the displayName value to set.
     * @return the EnvironmentTypeUpdate object itself.
     */
    public EnvironmentTypeUpdate withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EnvironmentTypeUpdateProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
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
