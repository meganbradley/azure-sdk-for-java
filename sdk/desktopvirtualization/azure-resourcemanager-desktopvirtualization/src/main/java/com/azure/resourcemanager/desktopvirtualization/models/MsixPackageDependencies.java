// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema for MSIX Package Dependencies properties. */
@Fluent
public final class MsixPackageDependencies {
    /*
     * Name of package dependency.
     */
    @JsonProperty(value = "dependencyName")
    private String dependencyName;

    /*
     * Name of dependency publisher.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * Dependency version required.
     */
    @JsonProperty(value = "minVersion")
    private String minVersion;

    /** Creates an instance of MsixPackageDependencies class. */
    public MsixPackageDependencies() {
    }

    /**
     * Get the dependencyName property: Name of package dependency.
     *
     * @return the dependencyName value.
     */
    public String dependencyName() {
        return this.dependencyName;
    }

    /**
     * Set the dependencyName property: Name of package dependency.
     *
     * @param dependencyName the dependencyName value to set.
     * @return the MsixPackageDependencies object itself.
     */
    public MsixPackageDependencies withDependencyName(String dependencyName) {
        this.dependencyName = dependencyName;
        return this;
    }

    /**
     * Get the publisher property: Name of dependency publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: Name of dependency publisher.
     *
     * @param publisher the publisher value to set.
     * @return the MsixPackageDependencies object itself.
     */
    public MsixPackageDependencies withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the minVersion property: Dependency version required.
     *
     * @return the minVersion value.
     */
    public String minVersion() {
        return this.minVersion;
    }

    /**
     * Set the minVersion property: Dependency version required.
     *
     * @param minVersion the minVersion value to set.
     * @return the MsixPackageDependencies object itself.
     */
    public MsixPackageDependencies withMinVersion(String minVersion) {
        this.minVersion = minVersion;
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
