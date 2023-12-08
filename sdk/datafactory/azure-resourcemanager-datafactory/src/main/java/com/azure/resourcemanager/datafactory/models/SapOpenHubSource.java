// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for SAP Business Warehouse Open Hub Destination source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapOpenHubSource")
@Fluent
public final class SapOpenHubSource extends TabularSource {
    /*
     * Whether to exclude the records of the last request. The default value is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "excludeLastRequest")
    private Object excludeLastRequest;

    /*
     * The ID of request for delta loading. Once it is set, only data with requestId larger than the value of this
     * property will be retrieved. The default value is 0. Type: integer (or Expression with resultType integer ).
     */
    @JsonProperty(value = "baseRequestId")
    private Object baseRequestId;

    /*
     * Specifies the custom RFC function module that will be used to read data from SAP Table. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "customRfcReadTableFunctionModule")
    private Object customRfcReadTableFunctionModule;

    /*
     * The single character that will be used as delimiter passed to SAP RFC as well as splitting the output data
     * retrieved. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sapDataColumnDelimiter")
    private Object sapDataColumnDelimiter;

    /**
     * Creates an instance of SapOpenHubSource class.
     */
    public SapOpenHubSource() {
    }

    /**
     * Get the excludeLastRequest property: Whether to exclude the records of the last request. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the excludeLastRequest value.
     */
    public Object excludeLastRequest() {
        return this.excludeLastRequest;
    }

    /**
     * Set the excludeLastRequest property: Whether to exclude the records of the last request. The default value is
     * true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param excludeLastRequest the excludeLastRequest value to set.
     * @return the SapOpenHubSource object itself.
     */
    public SapOpenHubSource withExcludeLastRequest(Object excludeLastRequest) {
        this.excludeLastRequest = excludeLastRequest;
        return this;
    }

    /**
     * Get the baseRequestId property: The ID of request for delta loading. Once it is set, only data with requestId
     * larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression
     * with resultType integer ).
     * 
     * @return the baseRequestId value.
     */
    public Object baseRequestId() {
        return this.baseRequestId;
    }

    /**
     * Set the baseRequestId property: The ID of request for delta loading. Once it is set, only data with requestId
     * larger than the value of this property will be retrieved. The default value is 0. Type: integer (or Expression
     * with resultType integer ).
     * 
     * @param baseRequestId the baseRequestId value to set.
     * @return the SapOpenHubSource object itself.
     */
    public SapOpenHubSource withBaseRequestId(Object baseRequestId) {
        this.baseRequestId = baseRequestId;
        return this;
    }

    /**
     * Get the customRfcReadTableFunctionModule property: Specifies the custom RFC function module that will be used to
     * read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     * @return the customRfcReadTableFunctionModule value.
     */
    public Object customRfcReadTableFunctionModule() {
        return this.customRfcReadTableFunctionModule;
    }

    /**
     * Set the customRfcReadTableFunctionModule property: Specifies the custom RFC function module that will be used to
     * read data from SAP Table. Type: string (or Expression with resultType string).
     * 
     * @param customRfcReadTableFunctionModule the customRfcReadTableFunctionModule value to set.
     * @return the SapOpenHubSource object itself.
     */
    public SapOpenHubSource withCustomRfcReadTableFunctionModule(Object customRfcReadTableFunctionModule) {
        this.customRfcReadTableFunctionModule = customRfcReadTableFunctionModule;
        return this;
    }

    /**
     * Get the sapDataColumnDelimiter property: The single character that will be used as delimiter passed to SAP RFC
     * as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     * @return the sapDataColumnDelimiter value.
     */
    public Object sapDataColumnDelimiter() {
        return this.sapDataColumnDelimiter;
    }

    /**
     * Set the sapDataColumnDelimiter property: The single character that will be used as delimiter passed to SAP RFC
     * as well as splitting the output data retrieved. Type: string (or Expression with resultType string).
     * 
     * @param sapDataColumnDelimiter the sapDataColumnDelimiter value to set.
     * @return the SapOpenHubSource object itself.
     */
    public SapOpenHubSource withSapDataColumnDelimiter(Object sapDataColumnDelimiter) {
        this.sapDataColumnDelimiter = sapDataColumnDelimiter;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOpenHubSource withQueryTimeout(Object queryTimeout) {
        super.withQueryTimeout(queryTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOpenHubSource withAdditionalColumns(Object additionalColumns) {
        super.withAdditionalColumns(additionalColumns);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOpenHubSource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOpenHubSource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOpenHubSource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SapOpenHubSource withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
    }
}
