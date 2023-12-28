// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The update to be applied to the ManagedClusters. */
@Fluent
public final class ManagedClusterUpdate {
    /*
     * The upgrade to apply to the ManagedClusters.
     */
    @JsonProperty(value = "upgrade", required = true)
    private ManagedClusterUpgradeSpec upgrade;

    /*
     * The node image upgrade to be applied to the target nodes in update run.
     */
    @JsonProperty(value = "nodeImageSelection")
    private NodeImageSelection nodeImageSelection;

    /** Creates an instance of ManagedClusterUpdate class. */
    public ManagedClusterUpdate() {
    }

    /**
     * Get the upgrade property: The upgrade to apply to the ManagedClusters.
     *
     * @return the upgrade value.
     */
    public ManagedClusterUpgradeSpec upgrade() {
        return this.upgrade;
    }

    /**
     * Set the upgrade property: The upgrade to apply to the ManagedClusters.
     *
     * @param upgrade the upgrade value to set.
     * @return the ManagedClusterUpdate object itself.
     */
    public ManagedClusterUpdate withUpgrade(ManagedClusterUpgradeSpec upgrade) {
        this.upgrade = upgrade;
        return this;
    }

    /**
     * Get the nodeImageSelection property: The node image upgrade to be applied to the target nodes in update run.
     *
     * @return the nodeImageSelection value.
     */
    public NodeImageSelection nodeImageSelection() {
        return this.nodeImageSelection;
    }

    /**
     * Set the nodeImageSelection property: The node image upgrade to be applied to the target nodes in update run.
     *
     * @param nodeImageSelection the nodeImageSelection value to set.
     * @return the ManagedClusterUpdate object itself.
     */
    public ManagedClusterUpdate withNodeImageSelection(NodeImageSelection nodeImageSelection) {
        this.nodeImageSelection = nodeImageSelection;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (upgrade() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property upgrade in model ManagedClusterUpdate"));
        } else {
            upgrade().validate();
        }
        if (nodeImageSelection() != null) {
            nodeImageSelection().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedClusterUpdate.class);
}
