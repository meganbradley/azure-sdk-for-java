// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The build result triggered by a build. */
@Fluent
public final class TriggeredBuildResult {
    /*
     * The unique build id of this build result
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of TriggeredBuildResult class. */
    public TriggeredBuildResult() {
    }

    /**
     * Get the id property: The unique build id of this build result.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The unique build id of this build result.
     *
     * @param id the id value to set.
     * @return the TriggeredBuildResult object itself.
     */
    public TriggeredBuildResult withId(String id) {
        this.id = id;
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
