// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ApplicationGateways ListAvailableRequestHeaders.
 */
public final class ApplicationGatewaysListAvailableRequestHeadersSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * ApplicationGatewayAvailableRequestHeadersGet.json
     */
    /**
     * Sample code: Get Available Request Headers.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableRequestHeaders(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getApplicationGateways()
            .listAvailableRequestHeadersWithResponse(com.azure.core.util.Context.NONE);
    }
}
