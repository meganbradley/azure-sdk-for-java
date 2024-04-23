// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.UUID;

/** The AnomalyFeedback model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "feedbackType")
@JsonTypeName("Anomaly")
@Fluent
public final class AnomalyFeedback extends MetricFeedback {
    /*
     * the start timestamp of feedback time range
     */
    @JsonProperty(value = "startTime", required = true)
    private OffsetDateTime startTime;

    /*
     * the end timestamp of feedback time range, when equals to startTime means only one timestamp
     */
    @JsonProperty(value = "endTime", required = true)
    private OffsetDateTime endTime;

    /*
     * The value property.
     */
    @JsonProperty(value = "value", required = true)
    private AnomalyFeedbackValue value;

    /*
     * the corresponding anomaly detection configuration of this feedback
     */
    @JsonProperty(value = "anomalyDetectionConfigurationId")
    private UUID anomalyDetectionConfigurationId;

    /*
     * The anomalyDetectionConfigurationSnapshot property.
     */
    @JsonProperty(value = "anomalyDetectionConfigurationSnapshot")
    private AnomalyDetectionConfiguration anomalyDetectionConfigurationSnapshot;

    /** Creates an instance of AnomalyFeedback class. */
    public AnomalyFeedback() {}

    /**
     * Get the startTime property: the start timestamp of feedback time range.
     *
     * @return the startTime value.
     */
    public OffsetDateTime getStartTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: the start timestamp of feedback time range.
     *
     * @param startTime the startTime value to set.
     * @return the AnomalyFeedback object itself.
     */
    public AnomalyFeedback setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: the end timestamp of feedback time range, when equals to startTime means only one
     * timestamp.
     *
     * @return the endTime value.
     */
    public OffsetDateTime getEndTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: the end timestamp of feedback time range, when equals to startTime means only one
     * timestamp.
     *
     * @param endTime the endTime value to set.
     * @return the AnomalyFeedback object itself.
     */
    public AnomalyFeedback setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public AnomalyFeedbackValue getValue() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the AnomalyFeedback object itself.
     */
    public AnomalyFeedback setValue(AnomalyFeedbackValue value) {
        this.value = value;
        return this;
    }

    /**
     * Get the anomalyDetectionConfigurationId property: the corresponding anomaly detection configuration of this
     * feedback.
     *
     * @return the anomalyDetectionConfigurationId value.
     */
    public UUID getAnomalyDetectionConfigurationId() {
        return this.anomalyDetectionConfigurationId;
    }

    /**
     * Set the anomalyDetectionConfigurationId property: the corresponding anomaly detection configuration of this
     * feedback.
     *
     * @param anomalyDetectionConfigurationId the anomalyDetectionConfigurationId value to set.
     * @return the AnomalyFeedback object itself.
     */
    public AnomalyFeedback setAnomalyDetectionConfigurationId(UUID anomalyDetectionConfigurationId) {
        this.anomalyDetectionConfigurationId = anomalyDetectionConfigurationId;
        return this;
    }

    /**
     * Get the anomalyDetectionConfigurationSnapshot property: The anomalyDetectionConfigurationSnapshot property.
     *
     * @return the anomalyDetectionConfigurationSnapshot value.
     */
    public AnomalyDetectionConfiguration getAnomalyDetectionConfigurationSnapshot() {
        return this.anomalyDetectionConfigurationSnapshot;
    }

    /**
     * Set the anomalyDetectionConfigurationSnapshot property: The anomalyDetectionConfigurationSnapshot property.
     *
     * @param anomalyDetectionConfigurationSnapshot the anomalyDetectionConfigurationSnapshot value to set.
     * @return the AnomalyFeedback object itself.
     */
    public AnomalyFeedback setAnomalyDetectionConfigurationSnapshot(
            AnomalyDetectionConfiguration anomalyDetectionConfigurationSnapshot) {
        this.anomalyDetectionConfigurationSnapshot = anomalyDetectionConfigurationSnapshot;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnomalyFeedback setMetricId(UUID metricId) {
        super.setMetricId(metricId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AnomalyFeedback setDimensionFilter(FeedbackDimensionFilter dimensionFilter) {
        super.setDimensionFilter(dimensionFilter);
        return this;
    }
}
