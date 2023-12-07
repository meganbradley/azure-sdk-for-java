// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

/**
 * Samples for NetworkFunctionDefinitionGroups CreateOrUpdate.
 */
public final class NetworkFunctionDefinitionGroupsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * NetworkFunctionDefinitionGroupCreate.json
     */
    /**
     * Sample code: Create or update the network function definition group.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void createOrUpdateTheNetworkFunctionDefinitionGroup(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.networkFunctionDefinitionGroups().define("TestNetworkFunctionDefinitionGroupName").withRegion("eastus")
            .withExistingPublisher("rg", "TestPublisher").create();
    }
}
