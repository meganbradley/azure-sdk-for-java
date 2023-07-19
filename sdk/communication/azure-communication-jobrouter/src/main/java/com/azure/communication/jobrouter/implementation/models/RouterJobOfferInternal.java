// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An offer of a job to a worker. */
@Fluent
public final class RouterJobOfferInternal {
    /*
     * The Id of the offer.
     */
    @JsonProperty(value = "offerId", required = true)
    private String offerId;

    /*
     * The Id of the job.
     */
    @JsonProperty(value = "jobId", required = true)
    private String jobId;

    /*
     * The capacity cost consumed by the job offer.
     */
    @JsonProperty(value = "capacityCost", required = true)
    private int capacityCost;

    /*
     * The time the offer was created in UTC.
     */
    @JsonProperty(value = "offeredAt")
    private OffsetDateTime offeredAt;

    /*
     * The time that the offer will expire in UTC.
     */
    @JsonProperty(value = "expiresAt")
    private OffsetDateTime expiresAt;

    /** Creates an instance of RouterJobOfferInternal class. */
    public RouterJobOfferInternal() {}

    /**
     * Get the offerId property: The Id of the offer.
     *
     * @return the offerId value.
     */
    public String getOfferId() {
        return this.offerId;
    }

    /**
     * Set the offerId property: The Id of the offer.
     *
     * @param offerId the offerId value to set.
     * @return the RouterJobOfferInternal object itself.
     */
    public RouterJobOfferInternal setOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * Get the jobId property: The Id of the job.
     *
     * @return the jobId value.
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: The Id of the job.
     *
     * @param jobId the jobId value to set.
     * @return the RouterJobOfferInternal object itself.
     */
    public RouterJobOfferInternal setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get the capacityCost property: The capacity cost consumed by the job offer.
     *
     * @return the capacityCost value.
     */
    public int getCapacityCost() {
        return this.capacityCost;
    }

    /**
     * Set the capacityCost property: The capacity cost consumed by the job offer.
     *
     * @param capacityCost the capacityCost value to set.
     * @return the RouterJobOfferInternal object itself.
     */
    public RouterJobOfferInternal setCapacityCost(int capacityCost) {
        this.capacityCost = capacityCost;
        return this;
    }

    /**
     * Get the offeredAt property: The time the offer was created in UTC.
     *
     * @return the offeredAt value.
     */
    public OffsetDateTime getOfferedAt() {
        return this.offeredAt;
    }

    /**
     * Set the offeredAt property: The time the offer was created in UTC.
     *
     * @param offeredAt the offeredAt value to set.
     * @return the RouterJobOfferInternal object itself.
     */
    public RouterJobOfferInternal setOfferedAt(OffsetDateTime offeredAt) {
        this.offeredAt = offeredAt;
        return this;
    }

    /**
     * Get the expiresAt property: The time that the offer will expire in UTC.
     *
     * @return the expiresAt value.
     */
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Set the expiresAt property: The time that the offer will expire in UTC.
     *
     * @param expiresAt the expiresAt value to set.
     * @return the RouterJobOfferInternal object itself.
     */
    public RouterJobOfferInternal setExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
}
