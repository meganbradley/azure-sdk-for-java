// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity Azure Data Explorer (Kusto) source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataExplorerSource")
@Fluent
public final class AzureDataExplorerSource extends CopySource {
    /*
     * Database query. Should be a Kusto Query Language (KQL) query. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "query", required = true)
    private Object query;

    /*
     * The name of the Boolean option that controls whether truncation is applied to result-sets that go beyond a
     * certain row-count limit.
     */
    @JsonProperty(value = "noTruncation")
    private Object noTruncation;

    /*
     * Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..
     */
    @JsonProperty(value = "queryTimeout")
    private Object queryTimeout;

    /*
     * Specifies the additional columns to be added to source data. Type: array of objects(AdditionalColumns) (or
     * Expression with resultType array of objects).
     */
    @JsonProperty(value = "additionalColumns")
    private Object additionalColumns;

    /**
     * Creates an instance of AzureDataExplorerSource class.
     */
    public AzureDataExplorerSource() {
    }

    /**
     * Get the query property: Database query. Should be a Kusto Query Language (KQL) query. Type: string (or
     * Expression with resultType string).
     * 
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: Database query. Should be a Kusto Query Language (KQL) query. Type: string (or
     * Expression with resultType string).
     * 
     * @param query the query value to set.
     * @return the AzureDataExplorerSource object itself.
     */
    public AzureDataExplorerSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the noTruncation property: The name of the Boolean option that controls whether truncation is applied to
     * result-sets that go beyond a certain row-count limit.
     * 
     * @return the noTruncation value.
     */
    public Object getNoTruncation() {
        return this.noTruncation;
    }

    /**
     * Set the noTruncation property: The name of the Boolean option that controls whether truncation is applied to
     * result-sets that go beyond a certain row-count limit.
     * 
     * @param noTruncation the noTruncation value to set.
     * @return the AzureDataExplorerSource object itself.
     */
    public AzureDataExplorerSource setNoTruncation(Object noTruncation) {
        this.noTruncation = noTruncation;
        return this;
    }

    /**
     * Get the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..
     * 
     * @return the queryTimeout value.
     */
    public Object getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set the queryTimeout property: Query timeout. Type: string (or Expression with resultType string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..
     * 
     * @param queryTimeout the queryTimeout value to set.
     * @return the AzureDataExplorerSource object itself.
     */
    public AzureDataExplorerSource setQueryTimeout(Object queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

    /**
     * Get the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @return the additionalColumns value.
     */
    public Object getAdditionalColumns() {
        return this.additionalColumns;
    }

    /**
     * Set the additionalColumns property: Specifies the additional columns to be added to source data. Type: array of
     * objects(AdditionalColumns) (or Expression with resultType array of objects).
     * 
     * @param additionalColumns the additionalColumns value to set.
     * @return the AzureDataExplorerSource object itself.
     */
    public AzureDataExplorerSource setAdditionalColumns(Object additionalColumns) {
        this.additionalColumns = additionalColumns;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataExplorerSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
