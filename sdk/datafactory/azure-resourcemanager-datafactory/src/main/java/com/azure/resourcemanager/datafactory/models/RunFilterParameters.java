// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Query parameters for listing runs.
 */
@Fluent
public final class RunFilterParameters {
    /*
     * The continuation token for getting the next page of results. Null for first page.
     */
    @JsonProperty(value = "continuationToken")
    private String continuationToken;

    /*
     * The time at or after which the run event was updated in 'ISO 8601' format.
     */
    @JsonProperty(value = "lastUpdatedAfter", required = true)
    private OffsetDateTime lastUpdatedAfter;

    /*
     * The time at or before which the run event was updated in 'ISO 8601' format.
     */
    @JsonProperty(value = "lastUpdatedBefore", required = true)
    private OffsetDateTime lastUpdatedBefore;

    /*
     * List of filters.
     */
    @JsonProperty(value = "filters")
    private List<RunQueryFilter> filters;

    /*
     * List of OrderBy option.
     */
    @JsonProperty(value = "orderBy")
    private List<RunQueryOrderBy> orderBy;

    /**
     * Creates an instance of RunFilterParameters class.
     */
    public RunFilterParameters() {
    }

    /**
     * Get the continuationToken property: The continuation token for getting the next page of results. Null for first
     * page.
     * 
     * @return the continuationToken value.
     */
    public String continuationToken() {
        return this.continuationToken;
    }

    /**
     * Set the continuationToken property: The continuation token for getting the next page of results. Null for first
     * page.
     * 
     * @param continuationToken the continuationToken value to set.
     * @return the RunFilterParameters object itself.
     */
    public RunFilterParameters withContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }

    /**
     * Get the lastUpdatedAfter property: The time at or after which the run event was updated in 'ISO 8601' format.
     * 
     * @return the lastUpdatedAfter value.
     */
    public OffsetDateTime lastUpdatedAfter() {
        return this.lastUpdatedAfter;
    }

    /**
     * Set the lastUpdatedAfter property: The time at or after which the run event was updated in 'ISO 8601' format.
     * 
     * @param lastUpdatedAfter the lastUpdatedAfter value to set.
     * @return the RunFilterParameters object itself.
     */
    public RunFilterParameters withLastUpdatedAfter(OffsetDateTime lastUpdatedAfter) {
        this.lastUpdatedAfter = lastUpdatedAfter;
        return this;
    }

    /**
     * Get the lastUpdatedBefore property: The time at or before which the run event was updated in 'ISO 8601' format.
     * 
     * @return the lastUpdatedBefore value.
     */
    public OffsetDateTime lastUpdatedBefore() {
        return this.lastUpdatedBefore;
    }

    /**
     * Set the lastUpdatedBefore property: The time at or before which the run event was updated in 'ISO 8601' format.
     * 
     * @param lastUpdatedBefore the lastUpdatedBefore value to set.
     * @return the RunFilterParameters object itself.
     */
    public RunFilterParameters withLastUpdatedBefore(OffsetDateTime lastUpdatedBefore) {
        this.lastUpdatedBefore = lastUpdatedBefore;
        return this;
    }

    /**
     * Get the filters property: List of filters.
     * 
     * @return the filters value.
     */
    public List<RunQueryFilter> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: List of filters.
     * 
     * @param filters the filters value to set.
     * @return the RunFilterParameters object itself.
     */
    public RunFilterParameters withFilters(List<RunQueryFilter> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the orderBy property: List of OrderBy option.
     * 
     * @return the orderBy value.
     */
    public List<RunQueryOrderBy> orderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: List of OrderBy option.
     * 
     * @param orderBy the orderBy value to set.
     * @return the RunFilterParameters object itself.
     */
    public RunFilterParameters withOrderBy(List<RunQueryOrderBy> orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (lastUpdatedAfter() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property lastUpdatedAfter in model RunFilterParameters"));
        }
        if (lastUpdatedBefore() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property lastUpdatedBefore in model RunFilterParameters"));
        }
        if (filters() != null) {
            filters().forEach(e -> e.validate());
        }
        if (orderBy() != null) {
            orderBy().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RunFilterParameters.class);
}
