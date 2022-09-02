// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.automation.fluent.models.ScheduleUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters supplied to the update schedule operation. */
@Fluent
public final class ScheduleUpdateParameters {
    /*
     * Gets or sets the name of the Schedule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Gets or sets the list of schedule properties.
     */
    @JsonProperty(value = "properties")
    private ScheduleUpdateProperties innerProperties;

    /**
     * Get the name property: Gets or sets the name of the Schedule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the Schedule.
     *
     * @param name the name value to set.
     * @return the ScheduleUpdateParameters object itself.
     */
    public ScheduleUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Gets or sets the list of schedule properties.
     *
     * @return the innerProperties value.
     */
    private ScheduleUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: Gets or sets the description of the schedule.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Gets or sets the description of the schedule.
     *
     * @param description the description value to set.
     * @return the ScheduleUpdateParameters object itself.
     */
    public ScheduleUpdateParameters withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleUpdateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the isEnabled property: Gets or sets a value indicating whether this schedule is enabled.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isEnabled();
    }

    /**
     * Set the isEnabled property: Gets or sets a value indicating whether this schedule is enabled.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the ScheduleUpdateParameters object itself.
     */
    public ScheduleUpdateParameters withIsEnabled(Boolean isEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleUpdateProperties();
        }
        this.innerProperties().withIsEnabled(isEnabled);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
