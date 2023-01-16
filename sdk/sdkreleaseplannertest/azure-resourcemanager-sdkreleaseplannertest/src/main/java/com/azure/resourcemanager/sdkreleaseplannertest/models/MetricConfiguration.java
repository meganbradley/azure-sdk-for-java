// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Metric configuration. */
@Fluent
public final class MetricConfiguration {
    /*
     * The Resource ID on which the metrics should be pushed.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * The MDM account to which the counters should be pushed.
     */
    @JsonProperty(value = "mdmAccount")
    private String mdmAccount;

    /*
     * The MDM namespace to which the counters should be pushed. This is required if MDMAccount is specified
     */
    @JsonProperty(value = "metricNameSpace")
    private String metricNameSpace;

    /*
     * Host name for the IoT hub associated to the device.
     */
    @JsonProperty(value = "counterSets", required = true)
    private List<MetricCounterSet> counterSets;

    /** Creates an instance of MetricConfiguration class. */
    public MetricConfiguration() {
    }

    /**
     * Get the resourceId property: The Resource ID on which the metrics should be pushed.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The Resource ID on which the metrics should be pushed.
     *
     * @param resourceId the resourceId value to set.
     * @return the MetricConfiguration object itself.
     */
    public MetricConfiguration withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the mdmAccount property: The MDM account to which the counters should be pushed.
     *
     * @return the mdmAccount value.
     */
    public String mdmAccount() {
        return this.mdmAccount;
    }

    /**
     * Set the mdmAccount property: The MDM account to which the counters should be pushed.
     *
     * @param mdmAccount the mdmAccount value to set.
     * @return the MetricConfiguration object itself.
     */
    public MetricConfiguration withMdmAccount(String mdmAccount) {
        this.mdmAccount = mdmAccount;
        return this;
    }

    /**
     * Get the metricNameSpace property: The MDM namespace to which the counters should be pushed. This is required if
     * MDMAccount is specified.
     *
     * @return the metricNameSpace value.
     */
    public String metricNameSpace() {
        return this.metricNameSpace;
    }

    /**
     * Set the metricNameSpace property: The MDM namespace to which the counters should be pushed. This is required if
     * MDMAccount is specified.
     *
     * @param metricNameSpace the metricNameSpace value to set.
     * @return the MetricConfiguration object itself.
     */
    public MetricConfiguration withMetricNameSpace(String metricNameSpace) {
        this.metricNameSpace = metricNameSpace;
        return this;
    }

    /**
     * Get the counterSets property: Host name for the IoT hub associated to the device.
     *
     * @return the counterSets value.
     */
    public List<MetricCounterSet> counterSets() {
        return this.counterSets;
    }

    /**
     * Set the counterSets property: Host name for the IoT hub associated to the device.
     *
     * @param counterSets the counterSets value to set.
     * @return the MetricConfiguration object itself.
     */
    public MetricConfiguration withCounterSets(List<MetricCounterSet> counterSets) {
        this.counterSets = counterSets;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property resourceId in model MetricConfiguration"));
        }
        if (counterSets() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property counterSets in model MetricConfiguration"));
        } else {
            counterSets().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricConfiguration.class);
}
