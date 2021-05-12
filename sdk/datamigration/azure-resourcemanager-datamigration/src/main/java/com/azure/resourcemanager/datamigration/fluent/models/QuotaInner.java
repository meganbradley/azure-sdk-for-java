// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datamigration.models.QuotaName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a quota for or usage details about a resource. */
@Fluent
public final class QuotaInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QuotaInner.class);

    /*
     * The current value of the quota. If null or missing, the current value
     * cannot be determined in the context of the request.
     */
    @JsonProperty(value = "currentValue")
    private Double currentValue;

    /*
     * The resource ID of the quota object
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The maximum value of the quota. If null or missing, the quota has no
     * maximum, in which case it merely tracks usage.
     */
    @JsonProperty(value = "limit")
    private Double limit;

    /*
     * The name of the quota
     */
    @JsonProperty(value = "name")
    private QuotaName name;

    /*
     * The unit for the quota, such as Count, Bytes, BytesPerSecond, etc.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * Get the currentValue property: The current value of the quota. If null or missing, the current value cannot be
     * determined in the context of the request.
     *
     * @return the currentValue value.
     */
    public Double currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue property: The current value of the quota. If null or missing, the current value cannot be
     * determined in the context of the request.
     *
     * @param currentValue the currentValue value to set.
     * @return the QuotaInner object itself.
     */
    public QuotaInner withCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the id property: The resource ID of the quota object.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The resource ID of the quota object.
     *
     * @param id the id value to set.
     * @return the QuotaInner object itself.
     */
    public QuotaInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the limit property: The maximum value of the quota. If null or missing, the quota has no maximum, in which
     * case it merely tracks usage.
     *
     * @return the limit value.
     */
    public Double limit() {
        return this.limit;
    }

    /**
     * Set the limit property: The maximum value of the quota. If null or missing, the quota has no maximum, in which
     * case it merely tracks usage.
     *
     * @param limit the limit value to set.
     * @return the QuotaInner object itself.
     */
    public QuotaInner withLimit(Double limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get the name property: The name of the quota.
     *
     * @return the name value.
     */
    public QuotaName name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the quota.
     *
     * @param name the name value to set.
     * @return the QuotaInner object itself.
     */
    public QuotaInner withName(QuotaName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the unit property: The unit for the quota, such as Count, Bytes, BytesPerSecond, etc.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit for the quota, such as Count, Bytes, BytesPerSecond, etc.
     *
     * @param unit the unit value to set.
     * @return the QuotaInner object itself.
     */
    public QuotaInner withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() != null) {
            name().validate();
        }
    }
}
