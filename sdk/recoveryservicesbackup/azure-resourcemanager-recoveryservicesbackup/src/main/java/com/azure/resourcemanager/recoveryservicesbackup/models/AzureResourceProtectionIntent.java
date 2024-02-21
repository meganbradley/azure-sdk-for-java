// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * IaaS VM specific backup protection intent item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectionIntentItemType")
@JsonTypeName("AzureResourceItem")
@Fluent
public final class AzureResourceProtectionIntent extends ProtectionIntent {
    /*
     * Friendly name of the VM represented by this backup item.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * Creates an instance of AzureResourceProtectionIntent class.
     */
    public AzureResourceProtectionIntent() {
    }

    /**
     * Get the friendlyName property: Friendly name of the VM represented by this backup item.
     * 
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: Friendly name of the VM represented by this backup item.
     * 
     * @param friendlyName the friendlyName value to set.
     * @return the AzureResourceProtectionIntent object itself.
     */
    public AzureResourceProtectionIntent withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureResourceProtectionIntent withBackupManagementType(BackupManagementType backupManagementType) {
        super.withBackupManagementType(backupManagementType);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureResourceProtectionIntent withSourceResourceId(String sourceResourceId) {
        super.withSourceResourceId(sourceResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureResourceProtectionIntent withItemId(String itemId) {
        super.withItemId(itemId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureResourceProtectionIntent withPolicyId(String policyId) {
        super.withPolicyId(policyId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureResourceProtectionIntent withProtectionState(ProtectionStatus protectionState) {
        super.withProtectionState(protectionState);
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
