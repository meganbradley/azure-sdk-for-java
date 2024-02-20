// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for ApplicationGateways ListAvailableResponseHeaders.
 */
public final class ApplicationGatewaysListAvailableResponseHeadersSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * ApplicationGatewayAvailableResponseHeadersGet.json
     */
    /**
     * Sample code: Get Available Response Headers.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAvailableResponseHeaders(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getApplicationGateways()
            .listAvailableResponseHeadersWithResponse(com.azure.core.util.Context.NONE);
    }
}
