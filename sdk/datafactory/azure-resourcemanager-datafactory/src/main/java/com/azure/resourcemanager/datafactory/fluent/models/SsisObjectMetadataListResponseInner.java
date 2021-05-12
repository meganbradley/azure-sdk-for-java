// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SsisObjectMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of SSIS object metadata. */
@Fluent
public final class SsisObjectMetadataListResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SsisObjectMetadataListResponseInner.class);

    /*
     * List of SSIS object metadata.
     */
    @JsonProperty(value = "value")
    private List<SsisObjectMetadata> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of SSIS object metadata.
     *
     * @return the value value.
     */
    public List<SsisObjectMetadata> value() {
        return this.value;
    }

    /**
     * Set the value property: List of SSIS object metadata.
     *
     * @param value the value value to set.
     * @return the SsisObjectMetadataListResponseInner object itself.
     */
    public SsisObjectMetadataListResponseInner withValue(List<SsisObjectMetadata> value) {
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
     * @return the SsisObjectMetadataListResponseInner object itself.
     */
    public SsisObjectMetadataListResponseInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
