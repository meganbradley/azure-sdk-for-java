// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Confluent Offer detail. */
@Fluent
public final class OfferDetail {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OfferDetail.class);

    /*
     * Publisher Id
     */
    @JsonProperty(value = "publisherId", required = true)
    private String publisherId;

    /*
     * Offer Id
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * Offer Plan Id
     */
    @JsonProperty(value = "planId", required = true)
    private String planId;

    /*
     * Offer Plan Name
     */
    @JsonProperty(value = "planName", required = true)
    private String planName;

    /*
     * Offer Plan Term unit
     */
    @JsonProperty(value = "termUnit", required = true)
    private String termUnit;

    /*
     * SaaSOfferStatus SaaS Offer Status
     */
    @JsonProperty(value = "status")
    private SaaSOfferStatus status;

    /**
     * Get the publisherId property: Publisher Id.
     *
     * @return the publisherId value.
     */
    public String publisherId() {
        return this.publisherId;
    }

    /**
     * Set the publisherId property: Publisher Id.
     *
     * @param publisherId the publisherId value to set.
     * @return the OfferDetail object itself.
     */
    public OfferDetail withPublisherId(String publisherId) {
        this.publisherId = publisherId;
        return this;
    }

    /**
     * Get the id property: Offer Id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Offer Id.
     *
     * @param id the id value to set.
     * @return the OfferDetail object itself.
     */
    public OfferDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the planId property: Offer Plan Id.
     *
     * @return the planId value.
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the planId property: Offer Plan Id.
     *
     * @param planId the planId value to set.
     * @return the OfferDetail object itself.
     */
    public OfferDetail withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the planName property: Offer Plan Name.
     *
     * @return the planName value.
     */
    public String planName() {
        return this.planName;
    }

    /**
     * Set the planName property: Offer Plan Name.
     *
     * @param planName the planName value to set.
     * @return the OfferDetail object itself.
     */
    public OfferDetail withPlanName(String planName) {
        this.planName = planName;
        return this;
    }

    /**
     * Get the termUnit property: Offer Plan Term unit.
     *
     * @return the termUnit value.
     */
    public String termUnit() {
        return this.termUnit;
    }

    /**
     * Set the termUnit property: Offer Plan Term unit.
     *
     * @param termUnit the termUnit value to set.
     * @return the OfferDetail object itself.
     */
    public OfferDetail withTermUnit(String termUnit) {
        this.termUnit = termUnit;
        return this;
    }

    /**
     * Get the status property: SaaSOfferStatus SaaS Offer Status.
     *
     * @return the status value.
     */
    public SaaSOfferStatus status() {
        return this.status;
    }

    /**
     * Set the status property: SaaSOfferStatus SaaS Offer Status.
     *
     * @param status the status value to set.
     * @return the OfferDetail object itself.
     */
    public OfferDetail withStatus(SaaSOfferStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publisherId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property publisherId in model OfferDetail"));
        }
        if (id() == null) {
            throw logger
                .logExceptionAsError(new IllegalArgumentException("Missing required property id in model OfferDetail"));
        }
        if (planId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property planId in model OfferDetail"));
        }
        if (planName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property planName in model OfferDetail"));
        }
        if (termUnit() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property termUnit in model OfferDetail"));
        }
    }
}
