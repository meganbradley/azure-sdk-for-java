// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for Operations List.
 */
public final class OperationsListSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/OperationList.json
     */
    /**
     * Sample code: Get a list of operations for a resource provider.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAListOfOperationsForAResourceProvider(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getOperations().list(com.azure.core.util.Context.NONE);
    }
}
