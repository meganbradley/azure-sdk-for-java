// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Mesh revision profile properties for a mesh.
 */
@Fluent
public final class MeshRevisionProfileProperties {
    /*
     * The meshRevisions property.
     */
    @JsonProperty(value = "meshRevisions")
    private List<MeshRevision> meshRevisions;

    /**
     * Creates an instance of MeshRevisionProfileProperties class.
     */
    public MeshRevisionProfileProperties() {
    }

    /**
     * Get the meshRevisions property: The meshRevisions property.
     *
     * @return the meshRevisions value.
     */
    public List<MeshRevision> meshRevisions() {
        return this.meshRevisions;
    }

    /**
     * Set the meshRevisions property: The meshRevisions property.
     *
     * @param meshRevisions the meshRevisions value to set.
     * @return the MeshRevisionProfileProperties object itself.
     */
    public MeshRevisionProfileProperties withMeshRevisions(List<MeshRevision> meshRevisions) {
        this.meshRevisions = meshRevisions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (meshRevisions() != null) {
            meshRevisions().forEach(e -> e.validate());
        }
    }
}
