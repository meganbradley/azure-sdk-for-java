// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a long term retention policy.
 */
@Fluent
public final class BaseLongTermRetentionPolicyProperties {
    /*
     * The weekly retention policy for an LTR backup in an ISO 8601 format.
     */
    @JsonProperty(value = "weeklyRetention")
    private String weeklyRetention;

    /*
     * The monthly retention policy for an LTR backup in an ISO 8601 format.
     */
    @JsonProperty(value = "monthlyRetention")
    private String monthlyRetention;

    /*
     * The yearly retention policy for an LTR backup in an ISO 8601 format.
     */
    @JsonProperty(value = "yearlyRetention")
    private String yearlyRetention;

    /*
     * The week of year to take the yearly backup in an ISO 8601 format.
     */
    @JsonProperty(value = "weekOfYear")
    private Integer weekOfYear;

    /**
     * Creates an instance of BaseLongTermRetentionPolicyProperties class.
     */
    public BaseLongTermRetentionPolicyProperties() {
    }

    /**
     * Get the weeklyRetention property: The weekly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @return the weeklyRetention value.
     */
    public String weeklyRetention() {
        return this.weeklyRetention;
    }

    /**
     * Set the weeklyRetention property: The weekly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @param weeklyRetention the weeklyRetention value to set.
     * @return the BaseLongTermRetentionPolicyProperties object itself.
     */
    public BaseLongTermRetentionPolicyProperties withWeeklyRetention(String weeklyRetention) {
        this.weeklyRetention = weeklyRetention;
        return this;
    }

    /**
     * Get the monthlyRetention property: The monthly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @return the monthlyRetention value.
     */
    public String monthlyRetention() {
        return this.monthlyRetention;
    }

    /**
     * Set the monthlyRetention property: The monthly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @param monthlyRetention the monthlyRetention value to set.
     * @return the BaseLongTermRetentionPolicyProperties object itself.
     */
    public BaseLongTermRetentionPolicyProperties withMonthlyRetention(String monthlyRetention) {
        this.monthlyRetention = monthlyRetention;
        return this;
    }

    /**
     * Get the yearlyRetention property: The yearly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @return the yearlyRetention value.
     */
    public String yearlyRetention() {
        return this.yearlyRetention;
    }

    /**
     * Set the yearlyRetention property: The yearly retention policy for an LTR backup in an ISO 8601 format.
     * 
     * @param yearlyRetention the yearlyRetention value to set.
     * @return the BaseLongTermRetentionPolicyProperties object itself.
     */
    public BaseLongTermRetentionPolicyProperties withYearlyRetention(String yearlyRetention) {
        this.yearlyRetention = yearlyRetention;
        return this;
    }

    /**
     * Get the weekOfYear property: The week of year to take the yearly backup in an ISO 8601 format.
     * 
     * @return the weekOfYear value.
     */
    public Integer weekOfYear() {
        return this.weekOfYear;
    }

    /**
     * Set the weekOfYear property: The week of year to take the yearly backup in an ISO 8601 format.
     * 
     * @param weekOfYear the weekOfYear value to set.
     * @return the BaseLongTermRetentionPolicyProperties object itself.
     */
    public BaseLongTermRetentionPolicyProperties withWeekOfYear(Integer weekOfYear) {
        this.weekOfYear = weekOfYear;
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
