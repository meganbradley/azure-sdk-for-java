// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.loganalytics.fluent.models.ManagementGroupInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list workspace management groups operation response. */
@Fluent
public final class WorkspaceListManagementGroupsResult {
    /*
     * Gets or sets a list of management groups attached to the workspace.
     */
    @JsonProperty(value = "value")
    private List<ManagementGroupInner> value;

    /** Creates an instance of WorkspaceListManagementGroupsResult class. */
    public WorkspaceListManagementGroupsResult() {
    }

    /**
     * Get the value property: Gets or sets a list of management groups attached to the workspace.
     *
     * @return the value value.
     */
    public List<ManagementGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets a list of management groups attached to the workspace.
     *
     * @param value the value value to set.
     * @return the WorkspaceListManagementGroupsResult object itself.
     */
    public WorkspaceListManagementGroupsResult withValue(List<ManagementGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
