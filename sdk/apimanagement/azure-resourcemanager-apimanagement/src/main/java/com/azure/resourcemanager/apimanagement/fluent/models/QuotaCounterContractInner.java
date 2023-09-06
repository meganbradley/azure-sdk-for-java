// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Quota counter details. */
@Fluent
public final class QuotaCounterContractInner {
    /*
     * The Key value of the Counter. Must not be empty.
     */
    @JsonProperty(value = "counterKey", required = true)
    private String counterKey;

    /*
     * Identifier of the Period for which the counter was collected. Must not be empty.
     */
    @JsonProperty(value = "periodKey", required = true)
    private String periodKey;

    /*
     * The date of the start of Counter Period. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as
     * specified by the ISO 8601 standard.
     *
     */
    @JsonProperty(value = "periodStartTime", required = true)
    private OffsetDateTime periodStartTime;

    /*
     * The date of the end of Counter Period. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as
     * specified by the ISO 8601 standard.
     *
     */
    @JsonProperty(value = "periodEndTime", required = true)
    private OffsetDateTime periodEndTime;

    /*
     * Quota Value Properties
     */
    @JsonProperty(value = "value")
    private QuotaCounterValueContractProperties value;

    /** Creates an instance of QuotaCounterContractInner class. */
    public QuotaCounterContractInner() {
    }

    /**
     * Get the counterKey property: The Key value of the Counter. Must not be empty.
     *
     * @return the counterKey value.
     */
    public String counterKey() {
        return this.counterKey;
    }

    /**
     * Set the counterKey property: The Key value of the Counter. Must not be empty.
     *
     * @param counterKey the counterKey value to set.
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withCounterKey(String counterKey) {
        this.counterKey = counterKey;
        return this;
    }

    /**
     * Get the periodKey property: Identifier of the Period for which the counter was collected. Must not be empty.
     *
     * @return the periodKey value.
     */
    public String periodKey() {
        return this.periodKey;
    }

    /**
     * Set the periodKey property: Identifier of the Period for which the counter was collected. Must not be empty.
     *
     * @param periodKey the periodKey value to set.
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withPeriodKey(String periodKey) {
        this.periodKey = periodKey;
        return this;
    }

    /**
     * Get the periodStartTime property: The date of the start of Counter Period. The date conforms to the following
     * format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the periodStartTime value.
     */
    public OffsetDateTime periodStartTime() {
        return this.periodStartTime;
    }

    /**
     * Set the periodStartTime property: The date of the start of Counter Period. The date conforms to the following
     * format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param periodStartTime the periodStartTime value to set.
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withPeriodStartTime(OffsetDateTime periodStartTime) {
        this.periodStartTime = periodStartTime;
        return this;
    }

    /**
     * Get the periodEndTime property: The date of the end of Counter Period. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the periodEndTime value.
     */
    public OffsetDateTime periodEndTime() {
        return this.periodEndTime;
    }

    /**
     * Set the periodEndTime property: The date of the end of Counter Period. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param periodEndTime the periodEndTime value to set.
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withPeriodEndTime(OffsetDateTime periodEndTime) {
        this.periodEndTime = periodEndTime;
        return this;
    }

    /**
     * Get the value property: Quota Value Properties.
     *
     * @return the value value.
     */
    public QuotaCounterValueContractProperties value() {
        return this.value;
    }

    /**
     * Set the value property: Quota Value Properties.
     *
     * @param value the value value to set.
     * @return the QuotaCounterContractInner object itself.
     */
    public QuotaCounterContractInner withValue(QuotaCounterValueContractProperties value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (counterKey() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property counterKey in model QuotaCounterContractInner"));
        }
        if (periodKey() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property periodKey in model QuotaCounterContractInner"));
        }
        if (periodStartTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property periodStartTime in model QuotaCounterContractInner"));
        }
        if (periodEndTime() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property periodEndTime in model QuotaCounterContractInner"));
        }
        if (value() != null) {
            value().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(QuotaCounterContractInner.class);
}
