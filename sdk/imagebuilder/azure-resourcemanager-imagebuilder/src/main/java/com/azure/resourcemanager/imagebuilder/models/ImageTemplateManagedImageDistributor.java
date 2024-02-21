// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/**
 * Distribute as a Managed Disk Image.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("ManagedImage")
@Fluent
public final class ImageTemplateManagedImageDistributor extends ImageTemplateDistributor {
    /*
     * Resource Id of the Managed Disk Image
     */
    @JsonProperty(value = "imageId", required = true)
    private String imageId;

    /*
     * Azure location for the image, should match if image already exists
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Creates an instance of ImageTemplateManagedImageDistributor class.
     */
    public ImageTemplateManagedImageDistributor() {
    }

    /**
     * Get the imageId property: Resource Id of the Managed Disk Image.
     * 
     * @return the imageId value.
     */
    public String imageId() {
        return this.imageId;
    }

    /**
     * Set the imageId property: Resource Id of the Managed Disk Image.
     * 
     * @param imageId the imageId value to set.
     * @return the ImageTemplateManagedImageDistributor object itself.
     */
    public ImageTemplateManagedImageDistributor withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * Get the location property: Azure location for the image, should match if image already exists.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Azure location for the image, should match if image already exists.
     * 
     * @param location the location value to set.
     * @return the ImageTemplateManagedImageDistributor object itself.
     */
    public ImageTemplateManagedImageDistributor withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageTemplateManagedImageDistributor withRunOutputName(String runOutputName) {
        super.withRunOutputName(runOutputName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageTemplateManagedImageDistributor withArtifactTags(Map<String, String> artifactTags) {
        super.withArtifactTags(artifactTags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (imageId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property imageId in model ImageTemplateManagedImageDistributor"));
        }
        if (location() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property location in model ImageTemplateManagedImageDistributor"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ImageTemplateManagedImageDistributor.class);
}
