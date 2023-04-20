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

/** List of quota requests with details. */
@Fluent
public final class QuotaRequestDetailsInner {
    /*
     * Quota request ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Quota request name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Resource type. "Microsoft.Quota/quotas".
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Quota request details.
     */
    @JsonProperty(value = "properties")
    private QuotaRequestProperties innerProperties;

    /** Creates an instance of QuotaRequestDetailsInner class. */
    public QuotaRequestDetailsInner() {
    }

    /**
     * Get the id property: Quota request ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Quota request name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Resource type. "Microsoft.Quota/quotas".
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Quota request details.
     *
     * @return the innerProperties value.
     */
    private QuotaRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: The quota request status.
     *
     * @return the provisioningState value.
     */
    public QuotaRequestState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the message property: User-friendly status message.
     *
     * @return the message value.
     */
    public String message() {
        return this.innerProperties() == null ? null : this.innerProperties().message();
    }

    /**
     * Get the error property: Error details of the quota request.
     *
     * @return the error value.
     */
    public ServiceErrorDetail error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Set the error property: Error details of the quota request.
     *
     * @param error the error value to set.
     * @return the QuotaRequestDetailsInner object itself.
     */
    public QuotaRequestDetailsInner withError(ServiceErrorDetail error) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaRequestProperties();
        }
        this.innerProperties().withError(error);
        return this;
    }

    /**
     * Get the requestSubmitTime property: The quota request submission time. The date conforms to the following format
     * specified by the ISO 8601 standard: yyyy-MM-ddTHH:mm:ssZ.
     *
     * @return the requestSubmitTime value.
     */
    public OffsetDateTime requestSubmitTime() {
        return this.innerProperties() == null ? null : this.innerProperties().requestSubmitTime();
    }

    /**
     * Get the value property: Quota request details.
     *
     * @return the value value.
     */
    public List<SubRequest> value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: Quota request details.
     *
     * @param value the value value to set.
     * @return the QuotaRequestDetailsInner object itself.
     */
    public QuotaRequestDetailsInner withValue(List<SubRequest> value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new QuotaRequestProperties();
        }
        this.innerProperties().withValue(value);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
