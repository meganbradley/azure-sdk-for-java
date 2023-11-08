// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** VMware To AzStackHCI Policy model custom properties. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "instanceType")
@JsonTypeName("VMwareToAzStackHCI")
@Fluent
public final class VMwareToAzStackHciPolicyModelCustomProperties extends PolicyModelCustomProperties {
    /*
     * Gets or sets the duration in minutes until which the recovery points need to be
     * stored.
     */
    @JsonProperty(value = "recoveryPointHistoryInMinutes", required = true)
    private int recoveryPointHistoryInMinutes;

    /*
     * Gets or sets the crash consistent snapshot frequency (in minutes).
     */
    @JsonProperty(value = "crashConsistentFrequencyInMinutes", required = true)
    private int crashConsistentFrequencyInMinutes;

    /*
     * Gets or sets the app consistent snapshot frequency (in minutes).
     */
    @JsonProperty(value = "appConsistentFrequencyInMinutes", required = true)
    private int appConsistentFrequencyInMinutes;

    /** Creates an instance of VMwareToAzStackHciPolicyModelCustomProperties class. */
    public VMwareToAzStackHciPolicyModelCustomProperties() {
    }

    /**
     * Get the recoveryPointHistoryInMinutes property: Gets or sets the duration in minutes until which the recovery
     * points need to be stored.
     *
     * @return the recoveryPointHistoryInMinutes value.
     */
    public int recoveryPointHistoryInMinutes() {
        return this.recoveryPointHistoryInMinutes;
    }

    /**
     * Set the recoveryPointHistoryInMinutes property: Gets or sets the duration in minutes until which the recovery
     * points need to be stored.
     *
     * @param recoveryPointHistoryInMinutes the recoveryPointHistoryInMinutes value to set.
     * @return the VMwareToAzStackHciPolicyModelCustomProperties object itself.
     */
    public VMwareToAzStackHciPolicyModelCustomProperties withRecoveryPointHistoryInMinutes(
        int recoveryPointHistoryInMinutes) {
        this.recoveryPointHistoryInMinutes = recoveryPointHistoryInMinutes;
        return this;
    }

    /**
     * Get the crashConsistentFrequencyInMinutes property: Gets or sets the crash consistent snapshot frequency (in
     * minutes).
     *
     * @return the crashConsistentFrequencyInMinutes value.
     */
    public int crashConsistentFrequencyInMinutes() {
        return this.crashConsistentFrequencyInMinutes;
    }

    /**
     * Set the crashConsistentFrequencyInMinutes property: Gets or sets the crash consistent snapshot frequency (in
     * minutes).
     *
     * @param crashConsistentFrequencyInMinutes the crashConsistentFrequencyInMinutes value to set.
     * @return the VMwareToAzStackHciPolicyModelCustomProperties object itself.
     */
    public VMwareToAzStackHciPolicyModelCustomProperties withCrashConsistentFrequencyInMinutes(
        int crashConsistentFrequencyInMinutes) {
        this.crashConsistentFrequencyInMinutes = crashConsistentFrequencyInMinutes;
        return this;
    }

    /**
     * Get the appConsistentFrequencyInMinutes property: Gets or sets the app consistent snapshot frequency (in
     * minutes).
     *
     * @return the appConsistentFrequencyInMinutes value.
     */
    public int appConsistentFrequencyInMinutes() {
        return this.appConsistentFrequencyInMinutes;
    }

    /**
     * Set the appConsistentFrequencyInMinutes property: Gets or sets the app consistent snapshot frequency (in
     * minutes).
     *
     * @param appConsistentFrequencyInMinutes the appConsistentFrequencyInMinutes value to set.
     * @return the VMwareToAzStackHciPolicyModelCustomProperties object itself.
     */
    public VMwareToAzStackHciPolicyModelCustomProperties withAppConsistentFrequencyInMinutes(
        int appConsistentFrequencyInMinutes) {
        this.appConsistentFrequencyInMinutes = appConsistentFrequencyInMinutes;
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
