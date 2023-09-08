// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

/** Samples for InternetGatewayRules GetByResourceGroup. */
public final class InternetGatewayRulesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/managednetworkfabric/resource-manager/Microsoft.ManagedNetworkFabric/stable/2023-06-15/examples/InternetGatewayRules_Get_MaximumSet_Gen.json
     */
    /**
     * Sample code: InternetGatewayRules_Get_MaximumSet_Gen.
     *
     * @param manager Entry point to ManagedNetworkFabricManager.
     */
    public static void internetGatewayRulesGetMaximumSetGen(
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager) {
        manager
            .internetGatewayRules()
            .getByResourceGroupWithResponse(
                "example-rg", "example-internetGatewayRule", com.azure.core.util.Context.NONE);
    }
}
