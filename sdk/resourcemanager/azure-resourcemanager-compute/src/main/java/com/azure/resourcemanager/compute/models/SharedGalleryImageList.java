// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.models.SharedGalleryImageInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List Shared Gallery Images operation response.
 */
@Fluent
public final class SharedGalleryImageList {
    /*
     * A list of shared gallery images.
     */
    @JsonProperty(value = "value", required = true)
    private List<SharedGalleryImageInner> value;

    /*
     * The uri to fetch the next page of shared gallery images. Call ListNext() with this to fetch the next page of
     * shared gallery images.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of SharedGalleryImageList class.
     */
    public SharedGalleryImageList() {
    }

    /**
     * Get the value property: A list of shared gallery images.
     * 
     * @return the value value.
     */
    public List<SharedGalleryImageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of shared gallery images.
     * 
     * @param value the value value to set.
     * @return the SharedGalleryImageList object itself.
     */
    public SharedGalleryImageList withValue(List<SharedGalleryImageInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of shared gallery images. Call ListNext() with this to
     * fetch the next page of shared gallery images.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of shared gallery images. Call ListNext() with this to
     * fetch the next page of shared gallery images.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SharedGalleryImageList object itself.
     */
    public SharedGalleryImageList withNextLink(String nextLink) {
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
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model SharedGalleryImageList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SharedGalleryImageList.class);
}
