// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.fluent.models.DeepCreatedOriginGroupProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The origin group for CDN content which is added when creating a CDN endpoint. Traffic is sent to the origins within
 * the origin group based on origin health.
 */
@Fluent
public final class DeepCreatedOriginGroup {
    /*
     * Origin group name which must be unique within the endpoint.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Properties of the origin group created on the CDN endpoint.
     */
    @JsonProperty(value = "properties")
    private DeepCreatedOriginGroupProperties innerProperties;

    /**
     * Get the name property: Origin group name which must be unique within the endpoint.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Origin group name which must be unique within the endpoint.
     *
     * @param name the name value to set.
     * @return the DeepCreatedOriginGroup object itself.
     */
    public DeepCreatedOriginGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the origin group created on the CDN endpoint.
     *
     * @return the innerProperties value.
     */
    private DeepCreatedOriginGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @return the healthProbeSettings value.
     */
    public HealthProbeParameters healthProbeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().healthProbeSettings();
    }

    /**
     * Set the healthProbeSettings property: Health probe settings to the origin that is used to determine the health of
     * the origin.
     *
     * @param healthProbeSettings the healthProbeSettings value to set.
     * @return the DeepCreatedOriginGroup object itself.
     */
    public DeepCreatedOriginGroup withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeepCreatedOriginGroupProperties();
        }
        this.innerProperties().withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /**
     * Get the origins property: The source of the content being delivered via CDN within given origin group.
     *
     * @return the origins value.
     */
    public List<ResourceReference> origins() {
        return this.innerProperties() == null ? null : this.innerProperties().origins();
    }

    /**
     * Set the origins property: The source of the content being delivered via CDN within given origin group.
     *
     * @param origins the origins value to set.
     * @return the DeepCreatedOriginGroup object itself.
     */
    public DeepCreatedOriginGroup withOrigins(List<ResourceReference> origins) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeepCreatedOriginGroupProperties();
        }
        this.innerProperties().withOrigins(origins);
        return this;
    }

    /**
     * Get the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @return the trafficRestorationTimeToHealedOrNewEndpointsInMinutes value.
     */
    public Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().trafficRestorationTimeToHealedOrNewEndpointsInMinutes();
    }

    /**
     * Set the trafficRestorationTimeToHealedOrNewEndpointsInMinutes property: Time in minutes to shift the traffic to
     * the endpoint gradually when an unhealthy endpoint comes healthy or a new endpoint is added. Default is 10 mins.
     * This property is currently not supported.
     *
     * @param trafficRestorationTimeToHealedOrNewEndpointsInMinutes the
     *     trafficRestorationTimeToHealedOrNewEndpointsInMinutes value to set.
     * @return the DeepCreatedOriginGroup object itself.
     */
    public DeepCreatedOriginGroup withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeepCreatedOriginGroupProperties();
        }
        this
            .innerProperties()
            .withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
                trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        return this;
    }

    /**
     * Get the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses.This property is currently not supported.
     *
     * @return the responseBasedOriginErrorDetectionSettings value.
     */
    public ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().responseBasedOriginErrorDetectionSettings();
    }

    /**
     * Set the responseBasedOriginErrorDetectionSettings property: The JSON object that contains the properties to
     * determine origin health using real requests/responses.This property is currently not supported.
     *
     * @param responseBasedOriginErrorDetectionSettings the responseBasedOriginErrorDetectionSettings value to set.
     * @return the DeepCreatedOriginGroup object itself.
     */
    public DeepCreatedOriginGroup withResponseBasedOriginErrorDetectionSettings(
        ResponseBasedOriginErrorDetectionParameters responseBasedOriginErrorDetectionSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeepCreatedOriginGroupProperties();
        }
        this.innerProperties().withResponseBasedOriginErrorDetectionSettings(responseBasedOriginErrorDetectionSettings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model DeepCreatedOriginGroup"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeepCreatedOriginGroup.class);
}
