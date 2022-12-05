// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The call rate limit Cognitive Services account. */
@Fluent
public final class CallRateLimit {
    /*
     * The count value of Call Rate Limit.
     */
    @JsonProperty(value = "count")
    private Float count;

    /*
     * The renewal period in seconds of Call Rate Limit.
     */
    @JsonProperty(value = "renewalPeriod")
    private Float renewalPeriod;

    /*
     * The rules property.
     */
    @JsonProperty(value = "rules")
    private List<ThrottlingRule> rules;

    /** Creates an instance of CallRateLimit class. */
    public CallRateLimit() {
    }

    /**
     * Get the count property: The count value of Call Rate Limit.
     *
     * @return the count value.
     */
    public Float count() {
        return this.count;
    }

    /**
     * Set the count property: The count value of Call Rate Limit.
     *
     * @param count the count value to set.
     * @return the CallRateLimit object itself.
     */
    public CallRateLimit withCount(Float count) {
        this.count = count;
        return this;
    }

    /**
     * Get the renewalPeriod property: The renewal period in seconds of Call Rate Limit.
     *
     * @return the renewalPeriod value.
     */
    public Float renewalPeriod() {
        return this.renewalPeriod;
    }

    /**
     * Set the renewalPeriod property: The renewal period in seconds of Call Rate Limit.
     *
     * @param renewalPeriod the renewalPeriod value to set.
     * @return the CallRateLimit object itself.
     */
    public CallRateLimit withRenewalPeriod(Float renewalPeriod) {
        this.renewalPeriod = renewalPeriod;
        return this;
    }

    /**
     * Get the rules property: The rules property.
     *
     * @return the rules value.
     */
    public List<ThrottlingRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The rules property.
     *
     * @param rules the rules value to set.
     * @return the CallRateLimit object itself.
     */
    public CallRateLimit withRules(List<ThrottlingRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }
}
