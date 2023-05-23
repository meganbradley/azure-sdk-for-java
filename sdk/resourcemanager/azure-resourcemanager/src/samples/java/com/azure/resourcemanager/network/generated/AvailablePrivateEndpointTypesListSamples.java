// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for AvailablePrivateEndpointTypes List. */
public final class AvailablePrivateEndpointTypesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/AvailablePrivateEndpointTypesGet.json
     */
    /**
     * Sample code: Get available PrivateEndpoint types.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailablePrivateEndpointTypes(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getAvailablePrivateEndpointTypes()
            .list("regionName", com.azure.core.util.Context.NONE);
    }
}
