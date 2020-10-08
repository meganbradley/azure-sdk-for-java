// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a container with data for a given resource. */
@Fluent
public final class DataContainer {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataContainer.class);

    /*
     * Log Analytics workspace information.
     */
    @JsonProperty(value = "workspace", required = true)
    private WorkspaceInfo workspace;

    /**
     * Get the workspace property: Log Analytics workspace information.
     *
     * @return the workspace value.
     */
    public WorkspaceInfo workspace() {
        return this.workspace;
    }

    /**
     * Set the workspace property: Log Analytics workspace information.
     *
     * @param workspace the workspace value to set.
     * @return the DataContainer object itself.
     */
    public DataContainer withWorkspace(WorkspaceInfo workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (workspace() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property workspace in model DataContainer"));
        } else {
            workspace().validate();
        }
    }
}
