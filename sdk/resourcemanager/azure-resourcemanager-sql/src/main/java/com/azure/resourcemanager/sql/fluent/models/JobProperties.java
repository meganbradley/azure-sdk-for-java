// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.sql.models.JobSchedule;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a job.
 */
@Fluent
public final class JobProperties {
    /*
     * User-defined description of the job.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The job version number.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private Integer version;

    /*
     * Schedule properties of the job.
     */
    @JsonProperty(value = "schedule")
    private JobSchedule schedule;

    /**
     * Creates an instance of JobProperties class.
     */
    public JobProperties() {
    }

    /**
     * Get the description property: User-defined description of the job.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: User-defined description of the job.
     * 
     * @param description the description value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the version property: The job version number.
     * 
     * @return the version value.
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Get the schedule property: Schedule properties of the job.
     * 
     * @return the schedule value.
     */
    public JobSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: Schedule properties of the job.
     * 
     * @param schedule the schedule value to set.
     * @return the JobProperties object itself.
     */
    public JobProperties withSchedule(JobSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schedule() != null) {
            schedule().validate();
        }
    }
}
