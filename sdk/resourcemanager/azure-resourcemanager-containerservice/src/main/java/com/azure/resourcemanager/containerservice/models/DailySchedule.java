// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** For schedules like: 'recur every day' or 'recur every 3 days'. */
@Fluent
public final class DailySchedule {
    /*
     * Specifies the number of days between each set of occurrences.
     */
    @JsonProperty(value = "intervalDays", required = true)
    private int intervalDays;

    /** Creates an instance of DailySchedule class. */
    public DailySchedule() {
    }

    /**
     * Get the intervalDays property: Specifies the number of days between each set of occurrences.
     *
     * @return the intervalDays value.
     */
    public int intervalDays() {
        return this.intervalDays;
    }

    /**
     * Set the intervalDays property: Specifies the number of days between each set of occurrences.
     *
     * @param intervalDays the intervalDays value to set.
     * @return the DailySchedule object itself.
     */
    public DailySchedule withIntervalDays(int intervalDays) {
        this.intervalDays = intervalDays;
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
