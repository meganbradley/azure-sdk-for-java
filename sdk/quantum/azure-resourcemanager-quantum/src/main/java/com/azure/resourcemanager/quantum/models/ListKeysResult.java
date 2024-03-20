// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.models;

import com.azure.resourcemanager.quantum.fluent.models.ListKeysResultInner;

/**
 * An immutable client-side representation of ListKeysResult.
 */
public interface ListKeysResult {
    /**
     * Gets the apiKeyEnabled property: Indicator of enablement of the Quantum workspace Api keys.
     * 
     * @return the apiKeyEnabled value.
     */
    Boolean apiKeyEnabled();

    /**
     * Gets the primaryKey property: The quantum workspace primary api key.
     * 
     * @return the primaryKey value.
     */
    ApiKey primaryKey();

    /**
     * Gets the secondaryKey property: The quantum workspace secondary api key.
     * 
     * @return the secondaryKey value.
     */
    ApiKey secondaryKey();

    /**
     * Gets the primaryConnectionString property: The connection string of the primary api key.
     * 
     * @return the primaryConnectionString value.
     */
    String primaryConnectionString();

    /**
     * Gets the secondaryConnectionString property: The connection string of the secondary api key.
     * 
     * @return the secondaryConnectionString value.
     */
    String secondaryConnectionString();

    /**
     * Gets the inner com.azure.resourcemanager.quantum.fluent.models.ListKeysResultInner object.
     * 
     * @return the inner object.
     */
    ListKeysResultInner innerModel();
}
