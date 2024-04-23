// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.PipelineResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of pipeline resources.
 */
@Fluent
public final class PipelineListResponse {
    /*
     * List of pipelines.
     */
    @JsonProperty(value = "value", required = true)
    private List<PipelineResourceInner> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of PipelineListResponse class.
     */
    public PipelineListResponse() {
    }

    /**
     * Get the value property: List of pipelines.
     * 
     * @return the value value.
     */
    public List<PipelineResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of pipelines.
     * 
     * @param value the value value to set.
     * @return the PipelineListResponse object itself.
     */
    public PipelineListResponse withValue(List<PipelineResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @param nextLink the nextLink value to set.
     * @return the PipelineListResponse object itself.
     */
    public PipelineListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model PipelineListResponse"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PipelineListResponse.class);
}
