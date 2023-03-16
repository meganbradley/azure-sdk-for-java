// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.schemaregistry.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Array received from the registry containing the list of schema groups. */
@Fluent
public final class SchemaGroups {
    /*
     * Array of schema groups.
     */
    @JsonProperty(value = "schemaGroups")
    private List<String> schemaGroups;

    /**
     * Get the schemaGroups property: Array of schema groups.
     *
     * @return the schemaGroups value.
     */
    public List<String> getSchemaGroups() {
        return this.schemaGroups;
    }

    /**
     * Set the schemaGroups property: Array of schema groups.
     *
     * @param schemaGroups the schemaGroups value to set.
     * @return the SchemaGroups object itself.
     */
    public SchemaGroups setSchemaGroups(List<String> schemaGroups) {
        this.schemaGroups = schemaGroups;
        return this;
    }
}
