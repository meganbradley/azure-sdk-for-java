// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import java.util.List;

/**
 * Mesh upgrade profile properties for a major.minor release.
 */
@Fluent
public final class MeshUpgradeProfileProperties extends MeshRevision {
    /**
     * Creates an instance of MeshUpgradeProfileProperties class.
     */
    public MeshUpgradeProfileProperties() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeshUpgradeProfileProperties withRevision(String revision) {
        super.withRevision(revision);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeshUpgradeProfileProperties withUpgrades(List<String> upgrades) {
        super.withUpgrades(upgrades);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MeshUpgradeProfileProperties withCompatibleWith(List<CompatibleVersions> compatibleWith) {
        super.withCompatibleWith(compatibleWith);
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
