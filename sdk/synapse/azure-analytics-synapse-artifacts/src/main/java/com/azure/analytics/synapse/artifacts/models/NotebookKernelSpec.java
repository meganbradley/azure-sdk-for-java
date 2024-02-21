// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * Kernel information.
 */
@Fluent
public final class NotebookKernelSpec {
    /*
     * Name of the kernel specification.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Name to display in UI.
     */
    @JsonProperty(value = "display_name", required = true)
    private String displayName;

    /*
     * Kernel information.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of NotebookKernelSpec class.
     */
    public NotebookKernelSpec() {
    }

    /**
     * Get the name property: Name of the kernel specification.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the kernel specification.
     * 
     * @param name the name value to set.
     * @return the NotebookKernelSpec object itself.
     */
    public NotebookKernelSpec setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName property: Name to display in UI.
     * 
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Name to display in UI.
     * 
     * @param displayName the displayName value to set.
     * @return the NotebookKernelSpec object itself.
     */
    public NotebookKernelSpec setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the additionalProperties property: Kernel information.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Kernel information.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the NotebookKernelSpec object itself.
     */
    public NotebookKernelSpec setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
