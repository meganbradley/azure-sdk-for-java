// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Request of get metrics status Operation.
 */
@Fluent
public final class MetricsStatusRequest {
    /*
     * Azure resource IDs
     */
    @JsonProperty(value = "azureResourceIds")
    private List<String> azureResourceIds;

    /*
     * User Email
     */
    @JsonProperty(value = "userEmail", required = true)
    private String userEmail;

    /**
     * Creates an instance of MetricsStatusRequest class.
     */
    public MetricsStatusRequest() {
    }

    /**
     * Get the azureResourceIds property: Azure resource IDs.
     * 
     * @return the azureResourceIds value.
     */
    public List<String> azureResourceIds() {
        return this.azureResourceIds;
    }

    /**
     * Set the azureResourceIds property: Azure resource IDs.
     * 
     * @param azureResourceIds the azureResourceIds value to set.
     * @return the MetricsStatusRequest object itself.
     */
    public MetricsStatusRequest withAzureResourceIds(List<String> azureResourceIds) {
        this.azureResourceIds = azureResourceIds;
        return this;
    }

    /**
     * Get the userEmail property: User Email.
     * 
     * @return the userEmail value.
     */
    public String userEmail() {
        return this.userEmail;
    }

    /**
     * Set the userEmail property: User Email.
     * 
     * @param userEmail the userEmail value to set.
     * @return the MetricsStatusRequest object itself.
     */
    public MetricsStatusRequest withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userEmail() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property userEmail in model MetricsStatusRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricsStatusRequest.class);
}
