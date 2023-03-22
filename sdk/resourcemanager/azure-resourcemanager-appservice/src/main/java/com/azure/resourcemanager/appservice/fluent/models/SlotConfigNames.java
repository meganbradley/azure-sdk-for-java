// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Names for connection strings, application settings, and external Azure storage account configuration identifiers to
 * be marked as sticky to the deployment slot and not moved during a swap operation. This is valid for all deployment
 * slots in an app.
 */
@Fluent
public final class SlotConfigNames {
    /*
     * List of connection string names.
     */
    @JsonProperty(value = "connectionStringNames")
    private List<String> connectionStringNames;

    /*
     * List of application settings names.
     */
    @JsonProperty(value = "appSettingNames")
    private List<String> appSettingNames;

    /*
     * List of external Azure storage account identifiers.
     */
    @JsonProperty(value = "azureStorageConfigNames")
    private List<String> azureStorageConfigNames;

    /** Creates an instance of SlotConfigNames class. */
    public SlotConfigNames() {
    }

    /**
     * Get the connectionStringNames property: List of connection string names.
     *
     * @return the connectionStringNames value.
     */
    public List<String> connectionStringNames() {
        return this.connectionStringNames;
    }

    /**
     * Set the connectionStringNames property: List of connection string names.
     *
     * @param connectionStringNames the connectionStringNames value to set.
     * @return the SlotConfigNames object itself.
     */
    public SlotConfigNames withConnectionStringNames(List<String> connectionStringNames) {
        this.connectionStringNames = connectionStringNames;
        return this;
    }

    /**
     * Get the appSettingNames property: List of application settings names.
     *
     * @return the appSettingNames value.
     */
    public List<String> appSettingNames() {
        return this.appSettingNames;
    }

    /**
     * Set the appSettingNames property: List of application settings names.
     *
     * @param appSettingNames the appSettingNames value to set.
     * @return the SlotConfigNames object itself.
     */
    public SlotConfigNames withAppSettingNames(List<String> appSettingNames) {
        this.appSettingNames = appSettingNames;
        return this;
    }

    /**
     * Get the azureStorageConfigNames property: List of external Azure storage account identifiers.
     *
     * @return the azureStorageConfigNames value.
     */
    public List<String> azureStorageConfigNames() {
        return this.azureStorageConfigNames;
    }

    /**
     * Set the azureStorageConfigNames property: List of external Azure storage account identifiers.
     *
     * @param azureStorageConfigNames the azureStorageConfigNames value to set.
     * @return the SlotConfigNames object itself.
     */
    public SlotConfigNames withAzureStorageConfigNames(List<String> azureStorageConfigNames) {
        this.azureStorageConfigNames = azureStorageConfigNames;
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
