// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.models.DataProviderMetadata;
import com.azure.resourcemanager.appservice.models.DetectorInfo;
import com.azure.resourcemanager.appservice.models.DiagnosticData;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.azure.resourcemanager.appservice.models.QueryUtterancesResults;
import com.azure.resourcemanager.appservice.models.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Class representing Response from Detector. */
@Fluent
public final class DetectorResponseInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DetectorResponseInner.class);

    /*
     * DetectorResponse resource specific properties
     */
    @JsonProperty(value = "properties")
    private DetectorResponseProperties innerProperties;

    /**
     * Get the innerProperties property: DetectorResponse resource specific properties.
     *
     * @return the innerProperties value.
     */
    private DetectorResponseProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DetectorResponseInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the metadata property: metadata for the detector.
     *
     * @return the metadata value.
     */
    public DetectorInfo metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: metadata for the detector.
     *
     * @param metadata the metadata value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withMetadata(DetectorInfo metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DetectorResponseProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the dataset property: Data Set.
     *
     * @return the dataset value.
     */
    public List<DiagnosticData> dataset() {
        return this.innerProperties() == null ? null : this.innerProperties().dataset();
    }

    /**
     * Set the dataset property: Data Set.
     *
     * @param dataset the dataset value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withDataset(List<DiagnosticData> dataset) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DetectorResponseProperties();
        }
        this.innerProperties().withDataset(dataset);
        return this;
    }

    /**
     * Get the status property: Indicates status of the most severe insight.
     *
     * @return the status value.
     */
    public Status status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: Indicates status of the most severe insight.
     *
     * @param status the status value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withStatus(Status status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DetectorResponseProperties();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the dataProvidersMetadata property: Additional configuration for different data providers to be used by the
     * UI.
     *
     * @return the dataProvidersMetadata value.
     */
    public List<DataProviderMetadata> dataProvidersMetadata() {
        return this.innerProperties() == null ? null : this.innerProperties().dataProvidersMetadata();
    }

    /**
     * Set the dataProvidersMetadata property: Additional configuration for different data providers to be used by the
     * UI.
     *
     * @param dataProvidersMetadata the dataProvidersMetadata value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withDataProvidersMetadata(List<DataProviderMetadata> dataProvidersMetadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DetectorResponseProperties();
        }
        this.innerProperties().withDataProvidersMetadata(dataProvidersMetadata);
        return this;
    }

    /**
     * Get the suggestedUtterances property: Suggested utterances where the detector can be applicable.
     *
     * @return the suggestedUtterances value.
     */
    public QueryUtterancesResults suggestedUtterances() {
        return this.innerProperties() == null ? null : this.innerProperties().suggestedUtterances();
    }

    /**
     * Set the suggestedUtterances property: Suggested utterances where the detector can be applicable.
     *
     * @param suggestedUtterances the suggestedUtterances value to set.
     * @return the DetectorResponseInner object itself.
     */
    public DetectorResponseInner withSuggestedUtterances(QueryUtterancesResults suggestedUtterances) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DetectorResponseProperties();
        }
        this.innerProperties().withSuggestedUtterances(suggestedUtterances);
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
