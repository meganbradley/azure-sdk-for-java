// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LinkConnectionTargetDatabaseTypeProperties model.
 */
@Fluent
public final class LinkConnectionTargetDatabaseTypeProperties {
    /*
     * Enable cross table transaction consistency on target database
     */
    @JsonProperty(value = "crossTableTransaction")
    private Boolean crossTableTransaction;

    /*
     * Drop and recreate same existing target table on link connection target database
     */
    @JsonProperty(value = "dropExistingTargetTableOnStart")
    private Boolean dropExistingTargetTableOnStart;

    /*
     * Action on existing target table. If not specified, 'FailOnNonEmptyTable' action is used.
     */
    @JsonProperty(value = "actionOnExistingTargetTable")
    private ActionOnExistingTargetTable actionOnExistingTargetTable;

    /**
     * Creates an instance of LinkConnectionTargetDatabaseTypeProperties class.
     */
    public LinkConnectionTargetDatabaseTypeProperties() {
    }

    /**
     * Get the crossTableTransaction property: Enable cross table transaction consistency on target database.
     * 
     * @return the crossTableTransaction value.
     */
    public Boolean isCrossTableTransaction() {
        return this.crossTableTransaction;
    }

    /**
     * Set the crossTableTransaction property: Enable cross table transaction consistency on target database.
     * 
     * @param crossTableTransaction the crossTableTransaction value to set.
     * @return the LinkConnectionTargetDatabaseTypeProperties object itself.
     */
    public LinkConnectionTargetDatabaseTypeProperties setCrossTableTransaction(Boolean crossTableTransaction) {
        this.crossTableTransaction = crossTableTransaction;
        return this;
    }

    /**
     * Get the dropExistingTargetTableOnStart property: Drop and recreate same existing target table on link connection
     * target database.
     * 
     * @return the dropExistingTargetTableOnStart value.
     */
    public Boolean isDropExistingTargetTableOnStart() {
        return this.dropExistingTargetTableOnStart;
    }

    /**
     * Set the dropExistingTargetTableOnStart property: Drop and recreate same existing target table on link connection
     * target database.
     * 
     * @param dropExistingTargetTableOnStart the dropExistingTargetTableOnStart value to set.
     * @return the LinkConnectionTargetDatabaseTypeProperties object itself.
     */
    public LinkConnectionTargetDatabaseTypeProperties
        setDropExistingTargetTableOnStart(Boolean dropExistingTargetTableOnStart) {
        this.dropExistingTargetTableOnStart = dropExistingTargetTableOnStart;
        return this;
    }

    /**
     * Get the actionOnExistingTargetTable property: Action on existing target table. If not specified,
     * 'FailOnNonEmptyTable' action is used.
     * 
     * @return the actionOnExistingTargetTable value.
     */
    public ActionOnExistingTargetTable getActionOnExistingTargetTable() {
        return this.actionOnExistingTargetTable;
    }

    /**
     * Set the actionOnExistingTargetTable property: Action on existing target table. If not specified,
     * 'FailOnNonEmptyTable' action is used.
     * 
     * @param actionOnExistingTargetTable the actionOnExistingTargetTable value to set.
     * @return the LinkConnectionTargetDatabaseTypeProperties object itself.
     */
    public LinkConnectionTargetDatabaseTypeProperties
        setActionOnExistingTargetTable(ActionOnExistingTargetTable actionOnExistingTargetTable) {
        this.actionOnExistingTargetTable = actionOnExistingTargetTable;
        return this;
    }
}
