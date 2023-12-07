// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.DetectorAbnormalTimePeriod;
import com.azure.resourcemanager.appservice.models.DiagnosticMetricSet;
import com.azure.resourcemanager.appservice.models.NameValuePair;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.ResponseMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Class representing Response from Diagnostic Detectors.
 */
@Fluent
public final class DiagnosticDetectorResponseInner extends ProxyOnlyResource {
    /*
     * DiagnosticDetectorResponse resource specific properties
     */
    @JsonProperty(value = "properties")
    private DiagnosticDetectorResponseProperties innerProperties;

    /**
     * Creates an instance of DiagnosticDetectorResponseInner class.
     */
    public DiagnosticDetectorResponseInner() {
    }

    /**
     * Get the innerProperties property: DiagnosticDetectorResponse resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private DiagnosticDetectorResponseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiagnosticDetectorResponseInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the startTime property: Start time of the period.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.innerProperties() == null ? null : this.innerProperties().startTime();
    }

    /**
     * Set the startTime property: Start time of the period.
     * 
     * @param startTime the startTime value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withStartTime(OffsetDateTime startTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticDetectorResponseProperties();
        }
        this.innerProperties().withStartTime(startTime);
        return this;
    }

    /**
     * Get the endTime property: End time of the period.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.innerProperties() == null ? null : this.innerProperties().endTime();
    }

    /**
     * Set the endTime property: End time of the period.
     * 
     * @param endTime the endTime value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withEndTime(OffsetDateTime endTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticDetectorResponseProperties();
        }
        this.innerProperties().withEndTime(endTime);
        return this;
    }

    /**
     * Get the issueDetected property: Flag representing Issue was detected.
     * 
     * @return the issueDetected value.
     */
    public Boolean issueDetected() {
        return this.innerProperties() == null ? null : this.innerProperties().issueDetected();
    }

    /**
     * Set the issueDetected property: Flag representing Issue was detected.
     * 
     * @param issueDetected the issueDetected value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withIssueDetected(Boolean issueDetected) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticDetectorResponseProperties();
        }
        this.innerProperties().withIssueDetected(issueDetected);
        return this;
    }

    /**
     * Get the detectorDefinition property: Detector's definition.
     * 
     * @return the detectorDefinition value.
     */
    public DetectorDefinition detectorDefinition() {
        return this.innerProperties() == null ? null : this.innerProperties().detectorDefinition();
    }

    /**
     * Set the detectorDefinition property: Detector's definition.
     * 
     * @param detectorDefinition the detectorDefinition value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withDetectorDefinition(DetectorDefinition detectorDefinition) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticDetectorResponseProperties();
        }
        this.innerProperties().withDetectorDefinition(detectorDefinition);
        return this;
    }

    /**
     * Get the metrics property: Metrics provided by the detector.
     * 
     * @return the metrics value.
     */
    public List<DiagnosticMetricSet> metrics() {
        return this.innerProperties() == null ? null : this.innerProperties().metrics();
    }

    /**
     * Set the metrics property: Metrics provided by the detector.
     * 
     * @param metrics the metrics value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withMetrics(List<DiagnosticMetricSet> metrics) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticDetectorResponseProperties();
        }
        this.innerProperties().withMetrics(metrics);
        return this;
    }

    /**
     * Get the abnormalTimePeriods property: List of Correlated events found by the detector.
     * 
     * @return the abnormalTimePeriods value.
     */
    public List<DetectorAbnormalTimePeriod> abnormalTimePeriods() {
        return this.innerProperties() == null ? null : this.innerProperties().abnormalTimePeriods();
    }

    /**
     * Set the abnormalTimePeriods property: List of Correlated events found by the detector.
     * 
     * @param abnormalTimePeriods the abnormalTimePeriods value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner
        withAbnormalTimePeriods(List<DetectorAbnormalTimePeriod> abnormalTimePeriods) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticDetectorResponseProperties();
        }
        this.innerProperties().withAbnormalTimePeriods(abnormalTimePeriods);
        return this;
    }

    /**
     * Get the data property: Additional Data that detector wants to send.
     * 
     * @return the data value.
     */
    public List<List<NameValuePair>> data() {
        return this.innerProperties() == null ? null : this.innerProperties().data();
    }

    /**
     * Set the data property: Additional Data that detector wants to send.
     * 
     * @param data the data value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withData(List<List<NameValuePair>> data) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticDetectorResponseProperties();
        }
        this.innerProperties().withData(data);
        return this;
    }

    /**
     * Get the responseMetadata property: Meta Data.
     * 
     * @return the responseMetadata value.
     */
    public ResponseMetadata responseMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().responseMetadata();
    }

    /**
     * Set the responseMetadata property: Meta Data.
     * 
     * @param responseMetadata the responseMetadata value to set.
     * @return the DiagnosticDetectorResponseInner object itself.
     */
    public DiagnosticDetectorResponseInner withResponseMetadata(ResponseMetadata responseMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DiagnosticDetectorResponseProperties();
        }
        this.innerProperties().withResponseMetadata(responseMetadata);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
