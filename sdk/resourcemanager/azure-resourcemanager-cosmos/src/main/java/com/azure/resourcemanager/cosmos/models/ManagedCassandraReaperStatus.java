// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The ManagedCassandraReaperStatus model.
 */
@Fluent
public final class ManagedCassandraReaperStatus {
    /*
     * The healthy property.
     */
    @JsonProperty(value = "healthy")
    private Boolean healthy;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "repairRunIds")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> repairRunIds;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "repairSchedules")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> repairSchedules;

    /**
     * Creates an instance of ManagedCassandraReaperStatus class.
     */
    public ManagedCassandraReaperStatus() {
    }

    /**
     * Get the healthy property: The healthy property.
     * 
     * @return the healthy value.
     */
    public Boolean healthy() {
        return this.healthy;
    }

    /**
     * Set the healthy property: The healthy property.
     * 
     * @param healthy the healthy value to set.
     * @return the ManagedCassandraReaperStatus object itself.
     */
    public ManagedCassandraReaperStatus withHealthy(Boolean healthy) {
        this.healthy = healthy;
        return this;
    }

    /**
     * Get the repairRunIds property: Dictionary of &lt;string&gt;.
     * 
     * @return the repairRunIds value.
     */
    public Map<String, String> repairRunIds() {
        return this.repairRunIds;
    }

    /**
     * Set the repairRunIds property: Dictionary of &lt;string&gt;.
     * 
     * @param repairRunIds the repairRunIds value to set.
     * @return the ManagedCassandraReaperStatus object itself.
     */
    public ManagedCassandraReaperStatus withRepairRunIds(Map<String, String> repairRunIds) {
        this.repairRunIds = repairRunIds;
        return this;
    }

    /**
     * Get the repairSchedules property: Dictionary of &lt;string&gt;.
     * 
     * @return the repairSchedules value.
     */
    public Map<String, String> repairSchedules() {
        return this.repairSchedules;
    }

    /**
     * Set the repairSchedules property: Dictionary of &lt;string&gt;.
     * 
     * @param repairSchedules the repairSchedules value to set.
     * @return the ManagedCassandraReaperStatus object itself.
     */
    public ManagedCassandraReaperStatus withRepairSchedules(Map<String, String> repairSchedules) {
        this.repairSchedules = repairSchedules;
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
