// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration values for periodic mode backup. */
@Fluent
public final class PeriodicModeProperties {
    /*
     * An integer representing the interval in minutes between two backups
     */
    @JsonProperty(value = "backupIntervalInMinutes")
    private Integer backupIntervalInMinutes;

    /*
     * An integer representing the time (in hours) that each backup is retained
     */
    @JsonProperty(value = "backupRetentionIntervalInHours")
    private Integer backupRetentionIntervalInHours;

    /*
     * Enum to indicate type of backup residency
     */
    @JsonProperty(value = "backupStorageRedundancy")
    private BackupStorageRedundancy backupStorageRedundancy;

    /**
     * Get the backupIntervalInMinutes property: An integer representing the interval in minutes between two backups.
     *
     * @return the backupIntervalInMinutes value.
     */
    public Integer backupIntervalInMinutes() {
        return this.backupIntervalInMinutes;
    }

    /**
     * Set the backupIntervalInMinutes property: An integer representing the interval in minutes between two backups.
     *
     * @param backupIntervalInMinutes the backupIntervalInMinutes value to set.
     * @return the PeriodicModeProperties object itself.
     */
    public PeriodicModeProperties withBackupIntervalInMinutes(Integer backupIntervalInMinutes) {
        this.backupIntervalInMinutes = backupIntervalInMinutes;
        return this;
    }

    /**
     * Get the backupRetentionIntervalInHours property: An integer representing the time (in hours) that each backup is
     * retained.
     *
     * @return the backupRetentionIntervalInHours value.
     */
    public Integer backupRetentionIntervalInHours() {
        return this.backupRetentionIntervalInHours;
    }

    /**
     * Set the backupRetentionIntervalInHours property: An integer representing the time (in hours) that each backup is
     * retained.
     *
     * @param backupRetentionIntervalInHours the backupRetentionIntervalInHours value to set.
     * @return the PeriodicModeProperties object itself.
     */
    public PeriodicModeProperties withBackupRetentionIntervalInHours(Integer backupRetentionIntervalInHours) {
        this.backupRetentionIntervalInHours = backupRetentionIntervalInHours;
        return this;
    }

    /**
     * Get the backupStorageRedundancy property: Enum to indicate type of backup residency.
     *
     * @return the backupStorageRedundancy value.
     */
    public BackupStorageRedundancy backupStorageRedundancy() {
        return this.backupStorageRedundancy;
    }

    /**
     * Set the backupStorageRedundancy property: Enum to indicate type of backup residency.
     *
     * @param backupStorageRedundancy the backupStorageRedundancy value to set.
     * @return the PeriodicModeProperties object itself.
     */
    public PeriodicModeProperties withBackupStorageRedundancy(BackupStorageRedundancy backupStorageRedundancy) {
        this.backupStorageRedundancy = backupStorageRedundancy;
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
