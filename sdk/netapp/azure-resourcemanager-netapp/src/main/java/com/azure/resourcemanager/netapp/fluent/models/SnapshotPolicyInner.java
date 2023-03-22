// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.models.DailySchedule;
import com.azure.resourcemanager.netapp.models.HourlySchedule;
import com.azure.resourcemanager.netapp.models.MonthlySchedule;
import com.azure.resourcemanager.netapp.models.WeeklySchedule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Snapshot policy information. */
@Fluent
public final class SnapshotPolicyInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Snapshot policy Properties
     */
    @JsonProperty(value = "properties", required = true)
    private SnapshotPolicyProperties innerProperties = new SnapshotPolicyProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of SnapshotPolicyInner class. */
    public SnapshotPolicyInner() {
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the innerProperties property: Snapshot policy Properties.
     *
     * @return the innerProperties value.
     */
    private SnapshotPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public SnapshotPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SnapshotPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the hourlySchedule property: Schedule for hourly snapshots.
     *
     * @return the hourlySchedule value.
     */
    public HourlySchedule hourlySchedule() {
        return this.innerProperties() == null ? null : this.innerProperties().hourlySchedule();
    }

    /**
     * Set the hourlySchedule property: Schedule for hourly snapshots.
     *
     * @param hourlySchedule the hourlySchedule value to set.
     * @return the SnapshotPolicyInner object itself.
     */
    public SnapshotPolicyInner withHourlySchedule(HourlySchedule hourlySchedule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotPolicyProperties();
        }
        this.innerProperties().withHourlySchedule(hourlySchedule);
        return this;
    }

    /**
     * Get the dailySchedule property: Schedule for daily snapshots.
     *
     * @return the dailySchedule value.
     */
    public DailySchedule dailySchedule() {
        return this.innerProperties() == null ? null : this.innerProperties().dailySchedule();
    }

    /**
     * Set the dailySchedule property: Schedule for daily snapshots.
     *
     * @param dailySchedule the dailySchedule value to set.
     * @return the SnapshotPolicyInner object itself.
     */
    public SnapshotPolicyInner withDailySchedule(DailySchedule dailySchedule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotPolicyProperties();
        }
        this.innerProperties().withDailySchedule(dailySchedule);
        return this;
    }

    /**
     * Get the weeklySchedule property: Schedule for weekly snapshots.
     *
     * @return the weeklySchedule value.
     */
    public WeeklySchedule weeklySchedule() {
        return this.innerProperties() == null ? null : this.innerProperties().weeklySchedule();
    }

    /**
     * Set the weeklySchedule property: Schedule for weekly snapshots.
     *
     * @param weeklySchedule the weeklySchedule value to set.
     * @return the SnapshotPolicyInner object itself.
     */
    public SnapshotPolicyInner withWeeklySchedule(WeeklySchedule weeklySchedule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotPolicyProperties();
        }
        this.innerProperties().withWeeklySchedule(weeklySchedule);
        return this;
    }

    /**
     * Get the monthlySchedule property: Schedule for monthly snapshots.
     *
     * @return the monthlySchedule value.
     */
    public MonthlySchedule monthlySchedule() {
        return this.innerProperties() == null ? null : this.innerProperties().monthlySchedule();
    }

    /**
     * Set the monthlySchedule property: Schedule for monthly snapshots.
     *
     * @param monthlySchedule the monthlySchedule value to set.
     * @return the SnapshotPolicyInner object itself.
     */
    public SnapshotPolicyInner withMonthlySchedule(MonthlySchedule monthlySchedule) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotPolicyProperties();
        }
        this.innerProperties().withMonthlySchedule(monthlySchedule);
        return this;
    }

    /**
     * Get the enabled property: The property to decide policy is enabled or not.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: The property to decide policy is enabled or not.
     *
     * @param enabled the enabled value to set.
     * @return the SnapshotPolicyInner object itself.
     */
    public SnapshotPolicyInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SnapshotPolicyProperties();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model SnapshotPolicyInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnapshotPolicyInner.class);
}
