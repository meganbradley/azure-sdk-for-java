package com.azure.compute.batch.models;

import java.time.OffsetDateTime;

public class ListBatchPoolUsageMetricsOptions extends BatchBaseOptions{
    private OffsetDateTime endtime;
    private String filter;
    private Integer maxresults;
    private OffsetDateTime starttime;

    /**
     * Gets the latest time from which to include metrics.
     *
     * <p>This property represents the end time for including metrics in an operation.
     * It must be at least two hours before the current time.
     * If not specified, it defaults to the end time of the last aggregation interval currently available.
     *
     * @return The latest time from which to include metrics.
     */
    public OffsetDateTime getEndTime() {
        return endtime;
    }

    /**
     * Sets the latest time from which to include metrics.
     *
     * <p>This property represents the end time for including metrics in an operation.
     * It must be at least two hours before the current time.
     * If not specified, it defaults to the end time of the last aggregation interval currently available.
     *
     * @param endtime The latest time from which to include metrics.
     */
    public void setEndTime(OffsetDateTime endtime) {
        this.endtime = endtime;
    }

    /**
     * Gets the OData $filter clause used for filtering results.
     *
     * @return The OData $filter clause.
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Sets the OData $filter clause used for filtering results.
     *
     * @param filter The OData $filter clause.
     */
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * Gets the maximum number of items to return in the response. A maximum of 1000 applications can be returned.
     *
     * @return The maximum number of items to return in the response.
     */
    public Integer getMaxresults() {
        return maxresults;
    }

    /**
     * Sets the maximum number of items to return in the response. A maximum of 1000 applications can be returned.
     *
     * @param maxresults The maximum number of items to return in the response.
     */
    public void setMaxresults(Integer maxresults) {
        this.maxresults = maxresults;
    }

    /**
     * Gets the earliest time from which to include metrics.
     *
     * This property represents the start time for including metrics in an operation.
     * It must be at least two and a half hours before the current time.
     * If not specified, it defaults to the start time of the last aggregation interval currently available.
     *
     * @return The earliest time from which to include metrics.
     */
    public OffsetDateTime getStartTime() {
        return starttime;
    }

    /**
     * Sets the earliest time from which to include metrics.
     *
     * This property represents the start time for including metrics in an operation.
     * It must be at least two and a half hours before the current time.
     * If not specified, it defaults to the start time of the last aggregation interval currently available.
     *
     * @param starttime The earliest time from which to include metrics.
     */
    public void setStartTime(OffsetDateTime starttime) {
        this.starttime = starttime;
    }

}
