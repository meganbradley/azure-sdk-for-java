// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The configuration of service URI and custom headers for the webhook. */
@Fluent
public final class CallbackConfigInner {
    /*
     * The service URI for the webhook to post notifications.
     */
    @JsonProperty(value = "serviceUri", required = true)
    private String serviceUri;

    /*
     * Custom headers that will be added to the webhook notifications.
     */
    @JsonProperty(value = "customHeaders")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> customHeaders;

    /**
     * Get the serviceUri property: The service URI for the webhook to post notifications.
     *
     * @return the serviceUri value.
     */
    public String serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the serviceUri property: The service URI for the webhook to post notifications.
     *
     * @param serviceUri the serviceUri value to set.
     * @return the CallbackConfigInner object itself.
     */
    public CallbackConfigInner withServiceUri(String serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the customHeaders property: Custom headers that will be added to the webhook notifications.
     *
     * @return the customHeaders value.
     */
    public Map<String, String> customHeaders() {
        return this.customHeaders;
    }

    /**
     * Set the customHeaders property: Custom headers that will be added to the webhook notifications.
     *
     * @param customHeaders the customHeaders value to set.
     * @return the CallbackConfigInner object itself.
     */
    public CallbackConfigInner withCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serviceUri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property serviceUri in model CallbackConfigInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CallbackConfigInner.class);
}
