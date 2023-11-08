// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Fabric model for update. */
@Fluent
public final class FabricModelUpdate extends ProxyResource {
    /*
     * Gets or sets the resource tags.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Fabric model properties.
     */
    @JsonProperty(value = "properties")
    private FabricModelProperties properties;

    /*
     * The systemData property.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private FabricModelUpdateSystemData systemData;

    /** Creates an instance of FabricModelUpdate class. */
    public FabricModelUpdate() {
    }

    /**
     * Get the tags property: Gets or sets the resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets the resource tags.
     *
     * @param tags the tags value to set.
     * @return the FabricModelUpdate object itself.
     */
    public FabricModelUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: Fabric model properties.
     *
     * @return the properties value.
     */
    public FabricModelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Fabric model properties.
     *
     * @param properties the properties value to set.
     * @return the FabricModelUpdate object itself.
     */
    public FabricModelUpdate withProperties(FabricModelProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: The systemData property.
     *
     * @return the systemData value.
     */
    public FabricModelUpdateSystemData systemData() {
        return this.systemData;
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
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
