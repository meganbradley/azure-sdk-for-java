// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.WebhookPartnerDestinationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Information about the WebHook of the partner destination.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "endpointType")
@JsonTypeName("WebHook")
@Fluent
public final class WebhookPartnerDestinationInfo extends PartnerDestinationInfo {
    /*
     * WebHook Properties of the partner destination.
     */
    @JsonProperty(value = "properties")
    private WebhookPartnerDestinationProperties innerProperties;

    /**
     * Creates an instance of WebhookPartnerDestinationInfo class.
     */
    public WebhookPartnerDestinationInfo() {
    }

    /**
     * Get the innerProperties property: WebHook Properties of the partner destination.
     * 
     * @return the innerProperties value.
     */
    private WebhookPartnerDestinationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebhookPartnerDestinationInfo withAzureSubscriptionId(String azureSubscriptionId) {
        super.withAzureSubscriptionId(azureSubscriptionId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebhookPartnerDestinationInfo withResourceGroupName(String resourceGroupName) {
        super.withResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebhookPartnerDestinationInfo withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebhookPartnerDestinationInfo withEndpointServiceContext(String endpointServiceContext) {
        super.withEndpointServiceContext(endpointServiceContext);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebhookPartnerDestinationInfo
        withResourceMoveChangeHistory(List<ResourceMoveChangeHistory> resourceMoveChangeHistory) {
        super.withResourceMoveChangeHistory(resourceMoveChangeHistory);
        return this;
    }

    /**
     * Get the endpointUrl property: The URL that represents the endpoint of the partner destination.
     * 
     * @return the endpointUrl value.
     */
    public String endpointUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointUrl();
    }

    /**
     * Set the endpointUrl property: The URL that represents the endpoint of the partner destination.
     * 
     * @param endpointUrl the endpointUrl value to set.
     * @return the WebhookPartnerDestinationInfo object itself.
     */
    public WebhookPartnerDestinationInfo withEndpointUrl(String endpointUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookPartnerDestinationProperties();
        }
        this.innerProperties().withEndpointUrl(endpointUrl);
        return this;
    }

    /**
     * Get the endpointBaseUrl property: The base URL that represents the endpoint of the partner destination.
     * 
     * @return the endpointBaseUrl value.
     */
    public String endpointBaseUrl() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointBaseUrl();
    }

    /**
     * Set the endpointBaseUrl property: The base URL that represents the endpoint of the partner destination.
     * 
     * @param endpointBaseUrl the endpointBaseUrl value to set.
     * @return the WebhookPartnerDestinationInfo object itself.
     */
    public WebhookPartnerDestinationInfo withEndpointBaseUrl(String endpointBaseUrl) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookPartnerDestinationProperties();
        }
        this.innerProperties().withEndpointBaseUrl(endpointBaseUrl);
        return this;
    }

    /**
     * Get the clientAuthentication property: Partner client authentication.
     * 
     * @return the clientAuthentication value.
     */
    public PartnerClientAuthentication clientAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().clientAuthentication();
    }

    /**
     * Set the clientAuthentication property: Partner client authentication.
     * 
     * @param clientAuthentication the clientAuthentication value to set.
     * @return the WebhookPartnerDestinationInfo object itself.
     */
    public WebhookPartnerDestinationInfo withClientAuthentication(PartnerClientAuthentication clientAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebhookPartnerDestinationProperties();
        }
        this.innerProperties().withClientAuthentication(clientAuthentication);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
