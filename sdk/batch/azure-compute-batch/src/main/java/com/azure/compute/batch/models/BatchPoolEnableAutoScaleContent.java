// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/**
 * Parameters for enabling automatic scaling on an Azure Batch Pool.
 */
@Fluent
public final class BatchPoolEnableAutoScaleContent {

    /*
     * The formula for the desired number of Compute Nodes in the Pool. The formula is checked for validity before it is applied to the Pool. If the formula is not valid, the Batch service rejects the request with detailed error information. For more information about specifying this formula, see Automatically scale Compute Nodes in an Azure Batch Pool (https://azure.microsoft.com/en-us/documentation/articles/batch-automatic-scaling).
     */
    @Generated
    @JsonProperty(value = "autoScaleFormula")
    private String autoScaleFormula;

    /*
     * The time interval at which to automatically adjust the Pool size according to the autoscale formula. The default value is 15 minutes. The minimum and maximum value are 5 minutes and 168 hours respectively. If you specify a value less than 5 minutes or greater than 168 hours, the Batch service rejects the request with an invalid property value error; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). If you specify a new interval, then the existing autoscale evaluation schedule will be stopped and a new autoscale evaluation schedule will be started, with its starting time being the time when this request was issued.
     */
    @Generated
    @JsonProperty(value = "autoScaleEvaluationInterval")
    private Duration autoScaleEvaluationInterval;

    /**
     * Creates an instance of BatchPoolEnableAutoScaleContent class.
     */
    @Generated
    public BatchPoolEnableAutoScaleContent() {
    }

    /**
     * Get the autoScaleFormula property: The formula for the desired number of Compute Nodes in the Pool. The formula
     * is checked for validity before it is applied to the Pool. If the formula is not valid, the Batch service rejects
     * the request with detailed error information. For more information about specifying this formula, see
     * Automatically scale Compute Nodes in an Azure Batch Pool
     * (https://azure.microsoft.com/en-us/documentation/articles/batch-automatic-scaling).
     *
     * @return the autoScaleFormula value.
     */
    @Generated
    public String getAutoScaleFormula() {
        return this.autoScaleFormula;
    }

    /**
     * Set the autoScaleFormula property: The formula for the desired number of Compute Nodes in the Pool. The formula
     * is checked for validity before it is applied to the Pool. If the formula is not valid, the Batch service rejects
     * the request with detailed error information. For more information about specifying this formula, see
     * Automatically scale Compute Nodes in an Azure Batch Pool
     * (https://azure.microsoft.com/en-us/documentation/articles/batch-automatic-scaling).
     *
     * @param autoScaleFormula the autoScaleFormula value to set.
     * @return the BatchPoolEnableAutoScaleContent object itself.
     */
    @Generated
    public BatchPoolEnableAutoScaleContent setAutoScaleFormula(String autoScaleFormula) {
        this.autoScaleFormula = autoScaleFormula;
        return this;
    }

    /**
     * Get the autoScaleEvaluationInterval property: The time interval at which to automatically adjust the Pool size
     * according to the autoscale formula. The default value is 15 minutes. The minimum and maximum value are 5 minutes
     * and 168 hours respectively. If you specify a value less than 5 minutes or greater than 168 hours, the Batch
     * service rejects the request with an invalid property value error; if you are calling the REST API directly, the
     * HTTP status code is 400 (Bad Request). If you specify a new interval, then the existing autoscale evaluation
     * schedule will be stopped and a new autoscale evaluation schedule will be started, with its starting time being
     * the time when this request was issued.
     *
     * @return the autoScaleEvaluationInterval value.
     */
    @Generated
    public Duration getAutoScaleEvaluationInterval() {
        return this.autoScaleEvaluationInterval;
    }

    /**
     * Set the autoScaleEvaluationInterval property: The time interval at which to automatically adjust the Pool size
     * according to the autoscale formula. The default value is 15 minutes. The minimum and maximum value are 5 minutes
     * and 168 hours respectively. If you specify a value less than 5 minutes or greater than 168 hours, the Batch
     * service rejects the request with an invalid property value error; if you are calling the REST API directly, the
     * HTTP status code is 400 (Bad Request). If you specify a new interval, then the existing autoscale evaluation
     * schedule will be stopped and a new autoscale evaluation schedule will be started, with its starting time being
     * the time when this request was issued.
     *
     * @param autoScaleEvaluationInterval the autoScaleEvaluationInterval value to set.
     * @return the BatchPoolEnableAutoScaleContent object itself.
     */
    @Generated
    public BatchPoolEnableAutoScaleContent setAutoScaleEvaluationInterval(Duration autoScaleEvaluationInterval) {
        this.autoScaleEvaluationInterval = autoScaleEvaluationInterval;
        return this;
    }
}
