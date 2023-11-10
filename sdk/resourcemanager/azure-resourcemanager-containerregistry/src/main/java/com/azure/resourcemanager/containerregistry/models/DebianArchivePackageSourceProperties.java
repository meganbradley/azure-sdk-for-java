// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the archive package source.
 */
@Fluent
public final class DebianArchivePackageSourceProperties extends ArchivePackageSourceProperties {
    /*
     * Upstream Debian distribution Name.
     */
    @JsonProperty(value = "distributionName")
    private String distributionName;

    /**
     * Creates an instance of DebianArchivePackageSourceProperties class.
     */
    public DebianArchivePackageSourceProperties() {
    }

    /**
     * Get the distributionName property: Upstream Debian distribution Name.
     * 
     * @return the distributionName value.
     */
    public String distributionName() {
        return this.distributionName;
    }

    /**
     * Set the distributionName property: Upstream Debian distribution Name.
     * 
     * @param distributionName the distributionName value to set.
     * @return the DebianArchivePackageSourceProperties object itself.
     */
    public DebianArchivePackageSourceProperties withDistributionName(String distributionName) {
        this.distributionName = distributionName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DebianArchivePackageSourceProperties withType(PackageSourceType type) {
        super.withType(type);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DebianArchivePackageSourceProperties withUrl(String url) {
        super.withUrl(url);
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
    }
}
