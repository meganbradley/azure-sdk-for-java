// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.resourcemanager.iothub.models.EndpointHealthStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The health data for an endpoint. */
@Fluent
public final class EndpointHealthDataInner {
    /*
     * Id of the endpoint
     */
    @JsonProperty(value = "endpointId")
    private String endpointId;

    /*
     * Health statuses have following meanings. The 'healthy' status shows that the endpoint is accepting messages as
     * expected. The 'unhealthy' status shows that the endpoint is not accepting messages as expected and IoT Hub is
     * retrying to send data to this endpoint. The status of an unhealthy endpoint will be updated to healthy when IoT
     * Hub has established an eventually consistent state of health. The 'dead' status shows that the endpoint is not
     * accepting messages, after IoT Hub retried sending messages for the retrial period. See IoT Hub metrics to
     * identify errors and monitor issues with endpoints. The 'unknown' status shows that the IoT Hub has not
     * established a connection with the endpoint. No messages have been delivered to or rejected from this endpoint
     */
    @JsonProperty(value = "healthStatus")
    private EndpointHealthStatus healthStatus;

    /*
     * Last error obtained when a message failed to be delivered to iot hub
     */
    @JsonProperty(value = "lastKnownError")
    private String lastKnownError;

    /*
     * Time at which the last known error occurred
     */
    @JsonProperty(value = "lastKnownErrorTime")
    private DateTimeRfc1123 lastKnownErrorTime;

    /*
     * Last time iot hub successfully sent a message to the endpoint
     */
    @JsonProperty(value = "lastSuccessfulSendAttemptTime")
    private DateTimeRfc1123 lastSuccessfulSendAttemptTime;

    /*
     * Last time iot hub tried to send a message to the endpoint
     */
    @JsonProperty(value = "lastSendAttemptTime")
    private DateTimeRfc1123 lastSendAttemptTime;

    /**
     * Get the endpointId property: Id of the endpoint.
     *
     * @return the endpointId value.
     */
    public String endpointId() {
        return this.endpointId;
    }

    /**
     * Set the endpointId property: Id of the endpoint.
     *
     * @param endpointId the endpointId value to set.
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * Get the healthStatus property: Health statuses have following meanings. The 'healthy' status shows that the
     * endpoint is accepting messages as expected. The 'unhealthy' status shows that the endpoint is not accepting
     * messages as expected and IoT Hub is retrying to send data to this endpoint. The status of an unhealthy endpoint
     * will be updated to healthy when IoT Hub has established an eventually consistent state of health. The 'dead'
     * status shows that the endpoint is not accepting messages, after IoT Hub retried sending messages for the retrial
     * period. See IoT Hub metrics to identify errors and monitor issues with endpoints. The 'unknown' status shows that
     * the IoT Hub has not established a connection with the endpoint. No messages have been delivered to or rejected
     * from this endpoint.
     *
     * @return the healthStatus value.
     */
    public EndpointHealthStatus healthStatus() {
        return this.healthStatus;
    }

    /**
     * Set the healthStatus property: Health statuses have following meanings. The 'healthy' status shows that the
     * endpoint is accepting messages as expected. The 'unhealthy' status shows that the endpoint is not accepting
     * messages as expected and IoT Hub is retrying to send data to this endpoint. The status of an unhealthy endpoint
     * will be updated to healthy when IoT Hub has established an eventually consistent state of health. The 'dead'
     * status shows that the endpoint is not accepting messages, after IoT Hub retried sending messages for the retrial
     * period. See IoT Hub metrics to identify errors and monitor issues with endpoints. The 'unknown' status shows that
     * the IoT Hub has not established a connection with the endpoint. No messages have been delivered to or rejected
     * from this endpoint.
     *
     * @param healthStatus the healthStatus value to set.
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withHealthStatus(EndpointHealthStatus healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * Get the lastKnownError property: Last error obtained when a message failed to be delivered to iot hub.
     *
     * @return the lastKnownError value.
     */
    public String lastKnownError() {
        return this.lastKnownError;
    }

    /**
     * Set the lastKnownError property: Last error obtained when a message failed to be delivered to iot hub.
     *
     * @param lastKnownError the lastKnownError value to set.
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withLastKnownError(String lastKnownError) {
        this.lastKnownError = lastKnownError;
        return this;
    }

    /**
     * Get the lastKnownErrorTime property: Time at which the last known error occurred.
     *
     * @return the lastKnownErrorTime value.
     */
    public OffsetDateTime lastKnownErrorTime() {
        if (this.lastKnownErrorTime == null) {
            return null;
        }
        return this.lastKnownErrorTime.getDateTime();
    }

    /**
     * Set the lastKnownErrorTime property: Time at which the last known error occurred.
     *
     * @param lastKnownErrorTime the lastKnownErrorTime value to set.
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withLastKnownErrorTime(OffsetDateTime lastKnownErrorTime) {
        if (lastKnownErrorTime == null) {
            this.lastKnownErrorTime = null;
        } else {
            this.lastKnownErrorTime = new DateTimeRfc1123(lastKnownErrorTime);
        }
        return this;
    }

    /**
     * Get the lastSuccessfulSendAttemptTime property: Last time iot hub successfully sent a message to the endpoint.
     *
     * @return the lastSuccessfulSendAttemptTime value.
     */
    public OffsetDateTime lastSuccessfulSendAttemptTime() {
        if (this.lastSuccessfulSendAttemptTime == null) {
            return null;
        }
        return this.lastSuccessfulSendAttemptTime.getDateTime();
    }

    /**
     * Set the lastSuccessfulSendAttemptTime property: Last time iot hub successfully sent a message to the endpoint.
     *
     * @param lastSuccessfulSendAttemptTime the lastSuccessfulSendAttemptTime value to set.
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withLastSuccessfulSendAttemptTime(OffsetDateTime lastSuccessfulSendAttemptTime) {
        if (lastSuccessfulSendAttemptTime == null) {
            this.lastSuccessfulSendAttemptTime = null;
        } else {
            this.lastSuccessfulSendAttemptTime = new DateTimeRfc1123(lastSuccessfulSendAttemptTime);
        }
        return this;
    }

    /**
     * Get the lastSendAttemptTime property: Last time iot hub tried to send a message to the endpoint.
     *
     * @return the lastSendAttemptTime value.
     */
    public OffsetDateTime lastSendAttemptTime() {
        if (this.lastSendAttemptTime == null) {
            return null;
        }
        return this.lastSendAttemptTime.getDateTime();
    }

    /**
     * Set the lastSendAttemptTime property: Last time iot hub tried to send a message to the endpoint.
     *
     * @param lastSendAttemptTime the lastSendAttemptTime value to set.
     * @return the EndpointHealthDataInner object itself.
     */
    public EndpointHealthDataInner withLastSendAttemptTime(OffsetDateTime lastSendAttemptTime) {
        if (lastSendAttemptTime == null) {
            this.lastSendAttemptTime = null;
        } else {
            this.lastSendAttemptTime = new DateTimeRfc1123(lastSendAttemptTime);
        }
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
