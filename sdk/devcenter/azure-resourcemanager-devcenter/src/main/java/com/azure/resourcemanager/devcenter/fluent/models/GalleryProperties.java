// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a gallery. */
@Fluent
public final class GalleryProperties {
    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The resource ID of the backing Azure Compute Gallery.
     */
    @JsonProperty(value = "galleryResourceId", required = true)
    private String galleryResourceId;

    /** Creates an instance of GalleryProperties class. */
    public GalleryProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the galleryResourceId property: The resource ID of the backing Azure Compute Gallery.
     *
     * @return the galleryResourceId value.
     */
    public String galleryResourceId() {
        return this.galleryResourceId;
    }

    /**
     * Set the galleryResourceId property: The resource ID of the backing Azure Compute Gallery.
     *
     * @param galleryResourceId the galleryResourceId value to set.
     * @return the GalleryProperties object itself.
     */
    public GalleryProperties withGalleryResourceId(String galleryResourceId) {
        this.galleryResourceId = galleryResourceId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (galleryResourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property galleryResourceId in model GalleryProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GalleryProperties.class);
}
