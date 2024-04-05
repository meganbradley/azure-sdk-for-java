// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Parameters for creating an Azure Batch Job Schedule.
 */
@Fluent
public final class BatchJobScheduleCreateContent {

    /*
     * A string that uniquely identifies the schedule within the Account. The ID can contain any combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64 characters. The ID is case-preserving and case-insensitive (that is, you may not have two IDs within an Account that differ only by case).
     */
    @Generated
    @JsonProperty(value = "id")
    private final String id;

    /*
     * The display name for the schedule. The display name need not be unique and can contain any Unicode characters up to a maximum length of 1024.
     */
    @Generated
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The schedule according to which Jobs will be created. All times are fixed respective to UTC and are not impacted by daylight saving time.
     */
    @Generated
    @JsonProperty(value = "schedule")
    private final BatchJobScheduleConfiguration schedule;

    /*
     * The details of the Jobs to be created on this schedule.
     */
    @Generated
    @JsonProperty(value = "jobSpecification")
    private final BatchJobSpecification jobSpecification;

    /*
     * A list of name-value pairs associated with the schedule as metadata. The Batch service does not assign any meaning to metadata; it is solely for the use of user code.
     */
    @Generated
    @JsonProperty(value = "metadata")
    private List<MetadataItem> metadata;

    /**
     * Creates an instance of BatchJobScheduleCreateContent class.
     *
     * @param id the id value to set.
     * @param schedule the schedule value to set.
     * @param jobSpecification the jobSpecification value to set.
     */
    @Generated
    @JsonCreator
    public BatchJobScheduleCreateContent(@JsonProperty(value = "id") String id,
        @JsonProperty(value = "schedule") BatchJobScheduleConfiguration schedule,
        @JsonProperty(value = "jobSpecification") BatchJobSpecification jobSpecification) {
        this.id = id;
        this.schedule = schedule;
        this.jobSpecification = jobSpecification;
    }

    /**
     * Get the id property: A string that uniquely identifies the schedule within the Account. The ID can contain any
     * combination of alphanumeric characters including hyphens and underscores, and cannot contain more than 64
     * characters. The ID is case-preserving and case-insensitive (that is, you may not have two IDs within an Account
     * that differ only by case).
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the displayName property: The display name for the schedule. The display name need not be unique and can
     * contain any Unicode characters up to a maximum length of 1024.
     *
     * @return the displayName value.
     */
    @Generated
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the schedule. The display name need not be unique and can
     * contain any Unicode characters up to a maximum length of 1024.
     *
     * @param displayName the displayName value to set.
     * @return the BatchJobScheduleCreateContent object itself.
     */
    @Generated
    public BatchJobScheduleCreateContent setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the schedule property: The schedule according to which Jobs will be created. All times are fixed respective
     * to UTC and are not impacted by daylight saving time.
     *
     * @return the schedule value.
     */
    @Generated
    public BatchJobScheduleConfiguration getSchedule() {
        return this.schedule;
    }

    /**
     * Get the jobSpecification property: The details of the Jobs to be created on this schedule.
     *
     * @return the jobSpecification value.
     */
    @Generated
    public BatchJobSpecification getJobSpecification() {
        return this.jobSpecification;
    }

    /**
     * Get the metadata property: A list of name-value pairs associated with the schedule as metadata. The Batch service
     * does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @return the metadata value.
     */
    @Generated
    public List<MetadataItem> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: A list of name-value pairs associated with the schedule as metadata. The Batch service
     * does not assign any meaning to metadata; it is solely for the use of user code.
     *
     * @param metadata the metadata value to set.
     * @return the BatchJobScheduleCreateContent object itself.
     */
    @Generated
    public BatchJobScheduleCreateContent setMetadata(List<MetadataItem> metadata) {
        this.metadata = metadata;
        return this;
    }
}
