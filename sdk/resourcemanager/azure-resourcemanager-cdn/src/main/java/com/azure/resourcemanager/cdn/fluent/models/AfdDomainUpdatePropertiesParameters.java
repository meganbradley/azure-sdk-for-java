// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.models.AfdDomainHttpsParameters;
import com.azure.resourcemanager.cdn.models.ResourceReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON object that contains the properties of the domain to create.
 */
@Fluent
public class AfdDomainUpdatePropertiesParameters {
    /*
     * The name of the profile which holds the domain.
     */
    @JsonProperty(value = "profileName", access = JsonProperty.Access.WRITE_ONLY)
    private String profileName;

    /*
     * The configuration specifying how to enable HTTPS for the domain - using AzureFrontDoor managed certificate or
     * user's own certificate. If not specified, enabling ssl uses AzureFrontDoor managed certificate by default.
     */
    @JsonProperty(value = "tlsSettings")
    private AfdDomainHttpsParameters tlsSettings;

    /*
     * Resource reference to the Azure DNS zone
     */
    @JsonProperty(value = "azureDnsZone")
    private ResourceReference azureDnsZone;

    /*
     * Resource reference to the Azure resource where custom domain ownership was prevalidated
     */
    @JsonProperty(value = "preValidatedCustomDomainResourceId")
    private ResourceReference preValidatedCustomDomainResourceId;

    /**
     * Creates an instance of AfdDomainUpdatePropertiesParameters class.
     */
    public AfdDomainUpdatePropertiesParameters() {
    }

    /**
     * Get the profileName property: The name of the profile which holds the domain.
     * 
     * @return the profileName value.
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Get the tlsSettings property: The configuration specifying how to enable HTTPS for the domain - using
     * AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor
     * managed certificate by default.
     * 
     * @return the tlsSettings value.
     */
    public AfdDomainHttpsParameters tlsSettings() {
        return this.tlsSettings;
    }

    /**
     * Set the tlsSettings property: The configuration specifying how to enable HTTPS for the domain - using
     * AzureFrontDoor managed certificate or user's own certificate. If not specified, enabling ssl uses AzureFrontDoor
     * managed certificate by default.
     * 
     * @param tlsSettings the tlsSettings value to set.
     * @return the AfdDomainUpdatePropertiesParameters object itself.
     */
    public AfdDomainUpdatePropertiesParameters withTlsSettings(AfdDomainHttpsParameters tlsSettings) {
        this.tlsSettings = tlsSettings;
        return this;
    }

    /**
     * Get the azureDnsZone property: Resource reference to the Azure DNS zone.
     * 
     * @return the azureDnsZone value.
     */
    public ResourceReference azureDnsZone() {
        return this.azureDnsZone;
    }

    /**
     * Set the azureDnsZone property: Resource reference to the Azure DNS zone.
     * 
     * @param azureDnsZone the azureDnsZone value to set.
     * @return the AfdDomainUpdatePropertiesParameters object itself.
     */
    public AfdDomainUpdatePropertiesParameters withAzureDnsZone(ResourceReference azureDnsZone) {
        this.azureDnsZone = azureDnsZone;
        return this;
    }

    /**
     * Get the preValidatedCustomDomainResourceId property: Resource reference to the Azure resource where custom
     * domain ownership was prevalidated.
     * 
     * @return the preValidatedCustomDomainResourceId value.
     */
    public ResourceReference preValidatedCustomDomainResourceId() {
        return this.preValidatedCustomDomainResourceId;
    }

    /**
     * Set the preValidatedCustomDomainResourceId property: Resource reference to the Azure resource where custom
     * domain ownership was prevalidated.
     * 
     * @param preValidatedCustomDomainResourceId the preValidatedCustomDomainResourceId value to set.
     * @return the AfdDomainUpdatePropertiesParameters object itself.
     */
    public AfdDomainUpdatePropertiesParameters
        withPreValidatedCustomDomainResourceId(ResourceReference preValidatedCustomDomainResourceId) {
        this.preValidatedCustomDomainResourceId = preValidatedCustomDomainResourceId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tlsSettings() != null) {
            tlsSettings().validate();
        }
        if (azureDnsZone() != null) {
            azureDnsZone().validate();
        }
        if (preValidatedCustomDomainResourceId() != null) {
            preValidatedCustomDomainResourceId().validate();
        }
    }
}
