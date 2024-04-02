// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.security.models.AzureDevOpsOrgProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure DevOps Organization resource.
 */
@Fluent
public final class AzureDevOpsOrgInner extends ProxyResource {
    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Azure DevOps Organization properties.
     */
    @JsonProperty(value = "properties")
    private AzureDevOpsOrgProperties properties;

    /**
     * Creates an instance of AzureDevOpsOrgInner class.
     */
    public AzureDevOpsOrgInner() {
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the properties property: Azure DevOps Organization properties.
     * 
     * @return the properties value.
     */
    public AzureDevOpsOrgProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Azure DevOps Organization properties.
     * 
     * @param properties the properties value to set.
     * @return the AzureDevOpsOrgInner object itself.
     */
    public AzureDevOpsOrgInner withProperties(AzureDevOpsOrgProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
