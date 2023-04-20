// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.quota.models.QuotaRequestState;
import com.azure.resourcemanager.quota.models.ServiceErrorDetail;
import com.azure.resourcemanager.quota.models.SubRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Quota request properties. */
@Fluent
public final class QuotaRequestProperties {
    /*
     * The quota request status.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private QuotaRequestState provisioningState;

    /*
     * User-friendly status message.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /*
     * Error details of the quota request.
     */
    @JsonProperty(value = "error")
    private ServiceErrorDetail error;

    /*
     * The quota request submission time. The date conforms to the following format specified by the ISO 8601 standard:
     * yyyy-MM-ddTHH:mm:ssZ
     */
    @JsonProperty(value = "requestSubmitTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime requestSubmitTime;

    /*
     * Quota request details.
     */
    @JsonProperty(value = "value")
    private List<SubRequest> value;

    /** Creates an instance of QuotaRequestProperties class. */
    public QuotaRequestProperties() {
    }

    /**
     * Get the provisioningState property: The quota request status.
     *
     * @return the provisioningState value.
     */
    public QuotaRequestState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the message property: User-friendly status message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the error property: Error details of the quota request.
     *
     * @return the error value.
     */
    public ServiceErrorDetail error() {
        return this.error;
    }

    /**
     * Set the error property: Error details of the quota request.
     *
     * @param error the error value to set.
     * @return the QuotaRequestProperties object itself.
     */
    public QuotaRequestProperties withError(ServiceErrorDetail error) {
        this.error = error;
        return this;
    }

    /**
     * Get the requestSubmitTime property: The quota request submission time. The date conforms to the following format
     * specified by the ISO 8601 standard: yyyy-MM-ddTHH:mm:ssZ.
     *
     * @return the requestSubmitTime value.
     */
    public OffsetDateTime requestSubmitTime() {
        return this.requestSubmitTime;
    }

    /**
     * Get the value property: Quota request details.
     *
     * @return the value value.
     */
    public List<SubRequest> value() {
        return this.value;
    }

    /**
     * Set the value property: Quota request details.
     *
     * @param value the value value to set.
     * @return the QuotaRequestProperties object itself.
     */
    public QuotaRequestProperties withValue(List<SubRequest> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (error() != null) {
            error().validate();
        }
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
