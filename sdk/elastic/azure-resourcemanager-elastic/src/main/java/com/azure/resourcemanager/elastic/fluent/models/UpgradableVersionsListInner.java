// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Stack Versions that this version can upgrade to. */
@Fluent
public final class UpgradableVersionsListInner {
    /*
     * Current version of the elastic monitor
     */
    @JsonProperty(value = "currentVersion")
    private String currentVersion;

    /*
     * Stack Versions that this version can upgrade to
     */
    @JsonProperty(value = "upgradableVersions")
    private List<String> upgradableVersions;

    /** Creates an instance of UpgradableVersionsListInner class. */
    public UpgradableVersionsListInner() {
    }

    /**
     * Get the currentVersion property: Current version of the elastic monitor.
     *
     * @return the currentVersion value.
     */
    public String currentVersion() {
        return this.currentVersion;
    }

    /**
     * Set the currentVersion property: Current version of the elastic monitor.
     *
     * @param currentVersion the currentVersion value to set.
     * @return the UpgradableVersionsListInner object itself.
     */
    public UpgradableVersionsListInner withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * Get the upgradableVersions property: Stack Versions that this version can upgrade to.
     *
     * @return the upgradableVersions value.
     */
    public List<String> upgradableVersions() {
        return this.upgradableVersions;
    }

    /**
     * Set the upgradableVersions property: Stack Versions that this version can upgrade to.
     *
     * @param upgradableVersions the upgradableVersions value to set.
     * @return the UpgradableVersionsListInner object itself.
     */
    public UpgradableVersionsListInner withUpgradableVersions(List<String> upgradableVersions) {
        this.upgradableVersions = upgradableVersions;
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
