// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The schedule property associated with the entity. */
@Fluent
public final class ScheduleAssociationProperty {
    /*
     * Gets or sets the name of the Schedule.
     */
    @JsonProperty(value = "name")
    private String name;

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
     * @return the ScheduleAssociationProperty object itself.
     */
    public ScheduleAssociationProperty withName(String name) {
        this.name = name;
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
