// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ServiceTagInformation List. */
public final class ServiceTagInformationListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/ServiceTagInformationListResultWithNoAddressPrefixes.json
     */
    /**
     * Sample code: Get list of service tags with no address prefixes.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getListOfServiceTagsWithNoAddressPrefixes(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getServiceTagInformations()
            .list("westeurope", true, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/ServiceTagInformationListResult.json
     */
    /**
     * Sample code: Get list of service tags.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getListOfServiceTags(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getServiceTagInformations()
            .list("westeurope", null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/ServiceTagInformationListResultWithTagname.json
     */
    /**
     * Sample code: Get list of service tags with tag name.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getListOfServiceTagsWithTagName(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getServiceTagInformations()
            .list("westeurope", null, "ApiManagement", com.azure.core.util.Context.NONE);
    }
}
