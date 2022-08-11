/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Analytics query. Learn more about the [Analytics query
 * syntax](https://azure.microsoft.com/documentation/articles/app-insights-analytics-reference/).
 */
public class QueryBody {
    /**
     * The query to execute.
     */
    @JsonProperty(value = "query", required = true)
    private String query;

    /**
     * Optional. The timespan over which to query data. This is an ISO8601 time
     * period value.  This timespan is applied in addition to any that are
     * specified in the query expression.
     */
    @JsonProperty(value = "timespan")
    private String timespan;

    /**
     * A list of Application IDs for cross-application queries.
     */
    @JsonProperty(value = "applications")
    private List<String> applications;

    /**
     * Get the query to execute.
     *
     * @return the query value
     */
    public String query() {
        return this.query;
    }

    /**
     * Set the query to execute.
     *
     * @param query the query value to set
     * @return the QueryBody object itself.
     */
    public QueryBody withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get optional. The timespan over which to query data. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the query expression.
     *
     * @return the timespan value
     */
    public String timespan() {
        return this.timespan;
    }

    /**
     * Set optional. The timespan over which to query data. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the query expression.
     *
     * @param timespan the timespan value to set
     * @return the QueryBody object itself.
     */
    public QueryBody withTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }

    /**
     * Get a list of Application IDs for cross-application queries.
     *
     * @return the applications value
     */
    public List<String> applications() {
        return this.applications;
    }

    /**
     * Set a list of Application IDs for cross-application queries.
     *
     * @param applications the applications value to set
     * @return the QueryBody object itself.
     */
    public QueryBody withApplications(List<String> applications) {
        this.applications = applications;
        return this;
    }

}
