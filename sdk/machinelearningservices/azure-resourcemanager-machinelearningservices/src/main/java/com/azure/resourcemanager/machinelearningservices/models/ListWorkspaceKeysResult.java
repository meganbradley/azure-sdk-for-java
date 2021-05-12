// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.resourcemanager.machinelearningservices.fluent.models.ListWorkspaceKeysResultInner;

/** An immutable client-side representation of ListWorkspaceKeysResult. */
public interface ListWorkspaceKeysResult {
    /**
     * Gets the userStorageKey property: The userStorageKey property.
     *
     * @return the userStorageKey value.
     */
    String userStorageKey();

    /**
     * Gets the userStorageResourceId property: The userStorageResourceId property.
     *
     * @return the userStorageResourceId value.
     */
    String userStorageResourceId();

    /**
     * Gets the appInsightsInstrumentationKey property: The appInsightsInstrumentationKey property.
     *
     * @return the appInsightsInstrumentationKey value.
     */
    String appInsightsInstrumentationKey();

    /**
     * Gets the containerRegistryCredentials property: The containerRegistryCredentials property.
     *
     * @return the containerRegistryCredentials value.
     */
    RegistryListCredentialsResult containerRegistryCredentials();

    /**
     * Gets the notebookAccessKeys property: The notebookAccessKeys property.
     *
     * @return the notebookAccessKeys value.
     */
    ListNotebookKeysResult notebookAccessKeys();

    /**
     * Gets the inner com.azure.resourcemanager.machinelearningservices.fluent.models.ListWorkspaceKeysResultInner
     * object.
     *
     * @return the inner object.
     */
    ListWorkspaceKeysResultInner innerModel();
}
