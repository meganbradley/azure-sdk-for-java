// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The artifact update state properties.
 */
@Fluent
public final class ArtifactChangeStateProperties {
    /*
     * The artifact state
     */
    @JsonProperty(value = "artifactState")
    private ArtifactState artifactState;

    /**
     * Creates an instance of ArtifactChangeStateProperties class.
     */
    public ArtifactChangeStateProperties() {
    }

    /**
     * Get the artifactState property: The artifact state.
     * 
     * @return the artifactState value.
     */
    public ArtifactState artifactState() {
        return this.artifactState;
    }

    /**
     * Set the artifactState property: The artifact state.
     * 
     * @param artifactState the artifactState value to set.
     * @return the ArtifactChangeStateProperties object itself.
     */
    public ArtifactChangeStateProperties withArtifactState(ArtifactState artifactState) {
        this.artifactState = artifactState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
