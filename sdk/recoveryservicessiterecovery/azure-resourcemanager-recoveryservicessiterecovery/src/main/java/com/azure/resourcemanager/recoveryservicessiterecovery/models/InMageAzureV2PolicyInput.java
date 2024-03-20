// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * VMWare Azure specific policy Input.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("InMageAzureV2")
@Fluent
public final class InMageAzureV2PolicyInput extends PolicyProviderSpecificInput {
    /*
     * The recovery point threshold in minutes.
     */
    @JsonProperty(value = "recoveryPointThresholdInMinutes")
    private Integer recoveryPointThresholdInMinutes;

    /*
     * The duration in minutes until which the recovery points need to be stored.
     */
    @JsonProperty(value = "recoveryPointHistory")
    private Integer recoveryPointHistory;

    /*
     * The crash consistent snapshot frequency (in minutes).
     */
    @JsonProperty(value = "crashConsistentFrequencyInMinutes")
    private Integer crashConsistentFrequencyInMinutes;

    /*
     * The app consistent snapshot frequency (in minutes).
     */
    @JsonProperty(value = "appConsistentFrequencyInMinutes")
    private Integer appConsistentFrequencyInMinutes;

    /*
     * A value indicating whether multi-VM sync has to be enabled. Value should be 'Enabled' or 'Disabled'.
     */
    @JsonProperty(value = "multiVmSyncStatus", required = true)
    private SetMultiVmSyncStatus multiVmSyncStatus;

    /**
     * Creates an instance of InMageAzureV2PolicyInput class.
     */
    public InMageAzureV2PolicyInput() {
    }

    /**
     * Get the recoveryPointThresholdInMinutes property: The recovery point threshold in minutes.
     * 
     * @return the recoveryPointThresholdInMinutes value.
     */
    public Integer recoveryPointThresholdInMinutes() {
        return this.recoveryPointThresholdInMinutes;
    }

    /**
     * Set the recoveryPointThresholdInMinutes property: The recovery point threshold in minutes.
     * 
     * @param recoveryPointThresholdInMinutes the recoveryPointThresholdInMinutes value to set.
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withRecoveryPointThresholdInMinutes(Integer recoveryPointThresholdInMinutes) {
        this.recoveryPointThresholdInMinutes = recoveryPointThresholdInMinutes;
        return this;
    }

    /**
     * Get the recoveryPointHistory property: The duration in minutes until which the recovery points need to be
     * stored.
     * 
     * @return the recoveryPointHistory value.
     */
    public Integer recoveryPointHistory() {
        return this.recoveryPointHistory;
    }

    /**
     * Set the recoveryPointHistory property: The duration in minutes until which the recovery points need to be
     * stored.
     * 
     * @param recoveryPointHistory the recoveryPointHistory value to set.
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withRecoveryPointHistory(Integer recoveryPointHistory) {
        this.recoveryPointHistory = recoveryPointHistory;
        return this;
    }

    /**
     * Get the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency (in minutes).
     * 
     * @return the crashConsistentFrequencyInMinutes value.
     */
    public Integer crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crashConsistentFrequencyInMinutes property: The crash consistent snapshot frequency (in minutes).
     * 
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set.
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withCrashConsistentFrequencyInMinutes(Integer crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency (in minutes).
     * 
     * @return the appConsistentFrequencyInMinutes value.
     */
    public Integer appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the appConsistentFrequencyInMinutes property: The app consistent snapshot frequency (in minutes).
     * 
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set.
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withAppConsistentFrequencyInMinutes(Integer appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the multiVmSyncStatus property: A value indicating whether multi-VM sync has to be enabled. Value should be
     * 'Enabled' or 'Disabled'.
     * 
     * @return the multiVmSyncStatus value.
     */
    public SetMultiVmSyncStatus multiVmSyncStatus() {
        return this.multiVmSyncStatus;
    }

    /**
     * Set the multiVmSyncStatus property: A value indicating whether multi-VM sync has to be enabled. Value should be
     * 'Enabled' or 'Disabled'.
     * 
     * @param multiVmSyncStatus the multiVmSyncStatus value to set.
     * @return the InMageAzureV2PolicyInput object itself.
     */
    public InMageAzureV2PolicyInput withMultiVmSyncStatus(SetMultiVmSyncStatus multiVmSyncStatus) {
        this.multiVmSyncStatus = multiVmSyncStatus;
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
        if (multiVmSyncStatus() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property multiVmSyncStatus in model InMageAzureV2PolicyInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(InMageAzureV2PolicyInput.class);
}
