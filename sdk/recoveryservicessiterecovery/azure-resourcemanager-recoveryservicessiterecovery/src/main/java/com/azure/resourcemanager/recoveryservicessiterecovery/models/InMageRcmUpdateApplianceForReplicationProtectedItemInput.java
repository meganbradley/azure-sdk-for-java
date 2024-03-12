// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * InMageRcm provider specific input to update appliance for replication protected item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageRcm")
@Fluent
public final class InMageRcmUpdateApplianceForReplicationProtectedItemInput
    extends UpdateReplicationProtectedItemProviderSpecificInput {
    /*
     * The run as account Id.
     */
    @JsonProperty(value = "runAsAccountId")
    private String runAsAccountId;

    /**
     * Creates an instance of InMageRcmUpdateApplianceForReplicationProtectedItemInput class.
     */
    public InMageRcmUpdateApplianceForReplicationProtectedItemInput() {
    }

    /**
     * Get the runAsAccountId property: The run as account Id.
     * 
     * @return the runAsAccountId value.
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the runAsAccountId property: The run as account Id.
     * 
     * @param runAsAccountId the runAsAccountId value to set.
     * @return the InMageRcmUpdateApplianceForReplicationProtectedItemInput object itself.
     */
    public InMageRcmUpdateApplianceForReplicationProtectedItemInput withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
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
