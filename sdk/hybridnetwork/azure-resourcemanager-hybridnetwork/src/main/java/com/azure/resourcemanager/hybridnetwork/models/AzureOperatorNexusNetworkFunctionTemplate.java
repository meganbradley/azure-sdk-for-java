// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Azure Operator Distributed Services network function template.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "nfviType")
@JsonTypeName("AzureOperatorNexus")
@Fluent
public final class AzureOperatorNexusNetworkFunctionTemplate extends VirtualNetworkFunctionTemplate {
    /*
     * Network function applications.
     */
    @JsonProperty(value = "networkFunctionApplications")
    private List<AzureOperatorNexusNetworkFunctionApplication> networkFunctionApplications;

    /**
     * Creates an instance of AzureOperatorNexusNetworkFunctionTemplate class.
     */
    public AzureOperatorNexusNetworkFunctionTemplate() {
    }

    /**
     * Get the networkFunctionApplications property: Network function applications.
     * 
     * @return the networkFunctionApplications value.
     */
    public List<AzureOperatorNexusNetworkFunctionApplication> networkFunctionApplications() {
        return this.networkFunctionApplications;
    }

    /**
     * Set the networkFunctionApplications property: Network function applications.
     * 
     * @param networkFunctionApplications the networkFunctionApplications value to set.
     * @return the AzureOperatorNexusNetworkFunctionTemplate object itself.
     */
    public AzureOperatorNexusNetworkFunctionTemplate withNetworkFunctionApplications(
        List<AzureOperatorNexusNetworkFunctionApplication> networkFunctionApplications) {
        this.networkFunctionApplications = networkFunctionApplications;
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
        if (networkFunctionApplications() != null) {
            networkFunctionApplications().forEach(e -> e.validate());
        }
    }
}
