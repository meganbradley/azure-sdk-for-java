// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** storage resource of type Azure Storage Account. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "storageType")
@JsonTypeName("StorageAccount")
@Fluent
public final class StorageAccount extends StorageProperties {
    /*
     * The account name of the Azure Storage Account.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /*
     * The account key of the Azure Storage Account.
     */
    @JsonProperty(value = "accountKey")
    private String accountKey;

    /** Creates an instance of StorageAccount class. */
    public StorageAccount() {
    }

    /**
     * Get the accountName property: The account name of the Azure Storage Account.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: The account name of the Azure Storage Account.
     *
     * @param accountName the accountName value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the accountKey property: The account key of the Azure Storage Account.
     *
     * @return the accountKey value.
     */
    public String accountKey() {
        return this.accountKey;
    }

    /**
     * Set the accountKey property: The account key of the Azure Storage Account.
     *
     * @param accountKey the accountKey value to set.
     * @return the StorageAccount object itself.
     */
    public StorageAccount withAccountKey(String accountKey) {
        this.accountKey = accountKey;
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
        if (accountName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property accountName in model StorageAccount"));
        }
        if (accountKey() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property accountKey in model StorageAccount"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageAccount.class);
}
