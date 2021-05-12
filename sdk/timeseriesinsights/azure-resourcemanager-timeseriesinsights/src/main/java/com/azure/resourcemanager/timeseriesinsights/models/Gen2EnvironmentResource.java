// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.timeseriesinsights.fluent.models.EnvironmentResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * An environment is a set of time-series data available for query, and is the top level Azure Time Series Insights
 * resource. Gen2 environments do not have set data retention limits.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Gen2")
@JsonFlatten
@Fluent
public class Gen2EnvironmentResource extends EnvironmentResourceInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Gen2EnvironmentResource.class);

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The time the resource was created.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * An id used to access the environment data, e.g. to query the
     * environment's events or upload reference data for the environment.
     */
    @JsonProperty(value = "properties.dataAccessId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID dataAccessId;

    /*
     * The fully qualified domain name used to access the environment data,
     * e.g. to query the environment's events or upload reference data for the
     * environment.
     */
    @JsonProperty(value = "properties.dataAccessFqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String dataAccessFqdn;

    /*
     * An object that represents the status of the environment, and its
     * internal state in the Time Series Insights service.
     */
    @JsonProperty(value = "properties.status", access = JsonProperty.Access.WRITE_ONLY)
    private EnvironmentStatus status;

    /*
     * The list of event properties which will be used to define the
     * environment's time series id.
     */
    @JsonProperty(value = "properties.timeSeriesIdProperties", required = true)
    private List<TimeSeriesIdProperty> timeSeriesIdProperties;

    /*
     * The storage configuration provides the connection details that allows
     * the Time Series Insights service to connect to the customer storage
     * account that is used to store the environment's data.
     */
    @JsonProperty(value = "properties.storageConfiguration", required = true)
    private Gen2StorageConfigurationOutput storageConfiguration;

    /*
     * The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for
     * faster query.
     */
    @JsonProperty(value = "properties.warmStoreConfiguration")
    private WarmStoreConfigurationProperties warmStoreConfiguration;

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the creationTime property: The time the resource was created.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the dataAccessId property: An id used to access the environment data, e.g. to query the environment's events
     * or upload reference data for the environment.
     *
     * @return the dataAccessId value.
     */
    public UUID dataAccessId() {
        return this.dataAccessId;
    }

    /**
     * Get the dataAccessFqdn property: The fully qualified domain name used to access the environment data, e.g. to
     * query the environment's events or upload reference data for the environment.
     *
     * @return the dataAccessFqdn value.
     */
    public String dataAccessFqdn() {
        return this.dataAccessFqdn;
    }

    /**
     * Get the status property: An object that represents the status of the environment, and its internal state in the
     * Time Series Insights service.
     *
     * @return the status value.
     */
    public EnvironmentStatus status() {
        return this.status;
    }

    /**
     * Get the timeSeriesIdProperties property: The list of event properties which will be used to define the
     * environment's time series id.
     *
     * @return the timeSeriesIdProperties value.
     */
    public List<TimeSeriesIdProperty> timeSeriesIdProperties() {
        return this.timeSeriesIdProperties;
    }

    /**
     * Set the timeSeriesIdProperties property: The list of event properties which will be used to define the
     * environment's time series id.
     *
     * @param timeSeriesIdProperties the timeSeriesIdProperties value to set.
     * @return the Gen2EnvironmentResource object itself.
     */
    public Gen2EnvironmentResource withTimeSeriesIdProperties(List<TimeSeriesIdProperty> timeSeriesIdProperties) {
        this.timeSeriesIdProperties = timeSeriesIdProperties;
        return this;
    }

    /**
     * Get the storageConfiguration property: The storage configuration provides the connection details that allows the
     * Time Series Insights service to connect to the customer storage account that is used to store the environment's
     * data.
     *
     * @return the storageConfiguration value.
     */
    public Gen2StorageConfigurationOutput storageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * Set the storageConfiguration property: The storage configuration provides the connection details that allows the
     * Time Series Insights service to connect to the customer storage account that is used to store the environment's
     * data.
     *
     * @param storageConfiguration the storageConfiguration value to set.
     * @return the Gen2EnvironmentResource object itself.
     */
    public Gen2EnvironmentResource withStorageConfiguration(Gen2StorageConfigurationOutput storageConfiguration) {
        this.storageConfiguration = storageConfiguration;
        return this;
    }

    /**
     * Get the warmStoreConfiguration property: The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for faster query.
     *
     * @return the warmStoreConfiguration value.
     */
    public WarmStoreConfigurationProperties warmStoreConfiguration() {
        return this.warmStoreConfiguration;
    }

    /**
     * Set the warmStoreConfiguration property: The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for faster query.
     *
     * @param warmStoreConfiguration the warmStoreConfiguration value to set.
     * @return the Gen2EnvironmentResource object itself.
     */
    public Gen2EnvironmentResource withWarmStoreConfiguration(WarmStoreConfigurationProperties warmStoreConfiguration) {
        this.warmStoreConfiguration = warmStoreConfiguration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Gen2EnvironmentResource withSku(Sku sku) {
        super.withSku(sku);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Gen2EnvironmentResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Gen2EnvironmentResource withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (status() != null) {
            status().validate();
        }
        if (timeSeriesIdProperties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property timeSeriesIdProperties in model Gen2EnvironmentResource"));
        } else {
            timeSeriesIdProperties().forEach(e -> e.validate());
        }
        if (storageConfiguration() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property storageConfiguration in model Gen2EnvironmentResource"));
        } else {
            storageConfiguration().validate();
        }
        if (warmStoreConfiguration() != null) {
            warmStoreConfiguration().validate();
        }
    }
}
