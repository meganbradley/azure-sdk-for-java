// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Parameters for updating an Azure Batch Job Schedule.
 */
@Fluent
public final class BatchJobScheduleUpdateContent {

    /*
     * The schedule according to which Jobs will be created. All times are fixed respective to UTC and are not impacted by daylight saving time. If you do not specify this element, the existing schedule is left unchanged.
     */
    @Generated
    @JsonProperty(value = "schedule")
    private BatchJobScheduleConfiguration schedule;

    /*
     * The details of the Jobs to be created on this schedule. Updates affect only Jobs that are started after the update has taken place. Any currently active Job continues with the older specification.
     */
    @Generated
    @JsonProperty(value = "jobSpecification")
    private BatchJobSpecification jobSpecification;

    /*
     * A list of name-value pairs associated with the Job Schedule as metadata. If you do not specify this element, existing metadata is left unchanged.
     */
    @Generated
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Creates an instance of BatchJobScheduleUpdateContent class.
     */
    @Generated
    public BatchJobScheduleUpdateContent() {
    }

    /**
     * Get the schedule property: The schedule according to which Jobs will be created. All times are fixed respective
     * to UTC and are not impacted by daylight saving time. If you do not specify this element, the existing schedule is
     * left unchanged.
     *
     * @return the schedule value.
     */
    @Generated
    public BatchJobScheduleConfiguration getSchedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: The schedule according to which Jobs will be created. All times are fixed respective
     * to UTC and are not impacted by daylight saving time. If you do not specify this element, the existing schedule is
     * left unchanged.
     *
     * @param schedule the schedule value to set.
     * @return the BatchJobScheduleUpdateContent object itself.
     */
    @Generated
    public BatchJobScheduleUpdateContent setSchedule(BatchJobScheduleConfiguration schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the jobSpecification property: The details of the Jobs to be created on this schedule. Updates affect only
     * Jobs that are started after the update has taken place. Any currently active Job continues with the older
     * specification.
     *
     * @return the jobSpecification value.
     */
    @Generated
    public BatchJobSpecification getJobSpecification() {
        return this.jobSpecification;
    }

    /**
     * Set the jobSpecification property: The details of the Jobs to be created on this schedule. Updates affect only
     * Jobs that are started after the update has taken place. Any currently active Job continues with the older
     * specification.
     *
     * @param jobSpecification the jobSpecification value to set.
     * @return the BatchJobScheduleUpdateContent object itself.
     */
    @Generated
    public BatchJobScheduleUpdateContent setJobSpecification(BatchJobSpecification jobSpecification) {
        this.jobSpecification = jobSpecification;
        return this;
    }

    /**
     * Get the metadata property: A list of name-value pairs associated with the Job Schedule as metadata. If you do not
     * specify this element, existing metadata is left unchanged.
     *
     * @return the metadata value.
     */
    @Generated
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A list of name-value pairs associated with the Job Schedule as metadata. If you do not
     * specify this element, existing metadata is left unchanged.
     *
     * @param metadata the metadata value to set.
     * @return the BatchJobScheduleUpdateContent object itself.
     */
    @Generated
    public BatchJobScheduleUpdateContent setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }
}
