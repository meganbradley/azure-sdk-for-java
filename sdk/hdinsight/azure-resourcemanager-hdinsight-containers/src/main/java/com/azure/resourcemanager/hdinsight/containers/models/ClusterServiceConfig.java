// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Cluster configs per component.
 */
@Fluent
public final class ClusterServiceConfig {
    /*
     * Name of the component the config files should apply to.
     */
    @JsonProperty(value = "component", required = true)
    private String component;

    /*
     * List of Config Files.
     */
    @JsonProperty(value = "files", required = true)
    private List<ClusterConfigFile> files;

    /**
     * Creates an instance of ClusterServiceConfig class.
     */
    public ClusterServiceConfig() {
    }

    /**
     * Get the component property: Name of the component the config files should apply to.
     * 
     * @return the component value.
     */
    public String component() {
        return this.component;
    }

    /**
     * Set the component property: Name of the component the config files should apply to.
     * 
     * @param component the component value to set.
     * @return the ClusterServiceConfig object itself.
     */
    public ClusterServiceConfig withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * Get the files property: List of Config Files.
     * 
     * @return the files value.
     */
    public List<ClusterConfigFile> files() {
        return this.files;
    }

    /**
     * Set the files property: List of Config Files.
     * 
     * @param files the files value to set.
     * @return the ClusterServiceConfig object itself.
     */
    public ClusterServiceConfig withFiles(List<ClusterConfigFile> files) {
        this.files = files;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (component() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property component in model ClusterServiceConfig"));
        }
        if (files() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property files in model ClusterServiceConfig"));
        } else {
            files().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterServiceConfig.class);
}
