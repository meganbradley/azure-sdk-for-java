// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/**
 * Samples for NetworkFunctionDefinitionGroups ListByPublisher.
 */
public final class NetworkFunctionDefinitionGroupsListByPublisherSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * NetworkFunctionDefinitionGroupsListByPublisherName.json
     */
    /**
     * Sample code: Get networkFunctionDefinition groups under publisher resource.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void getNetworkFunctionDefinitionGroupsUnderPublisherResource(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctionDefinitionGroups().listByPublisher("rg", "TestPublisher",
            com.azure.core.util.Context.NONE);
    }
}
