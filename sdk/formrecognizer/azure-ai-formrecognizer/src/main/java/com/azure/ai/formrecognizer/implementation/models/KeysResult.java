// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Keys extracted by the custom model. */
@Fluent
public final class KeysResult {
    /*
     * Object mapping clusterIds to a list of keys.
     */
    @JsonProperty(value = "clusters", required = true)
    private Map<String, List<String>> clusters;

    /** Creates an instance of KeysResult class. */
    public KeysResult() {}

    /**
     * Get the clusters property: Object mapping clusterIds to a list of keys.
     *
     * @return the clusters value.
     */
    public Map<String, List<String>> getClusters() {
        return this.clusters;
    }

    /**
     * Set the clusters property: Object mapping clusterIds to a list of keys.
     *
     * @param clusters the clusters value to set.
     * @return the KeysResult object itself.
     */
    public KeysResult setClusters(Map<String, List<String>> clusters) {
        this.clusters = clusters;
        return this;
    }
}
