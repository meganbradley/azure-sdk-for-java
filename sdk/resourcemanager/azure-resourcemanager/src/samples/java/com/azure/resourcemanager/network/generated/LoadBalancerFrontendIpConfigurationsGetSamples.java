// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for LoadBalancerFrontendIpConfigurations Get. */
public final class LoadBalancerFrontendIpConfigurationsGetSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-05-01/examples/LoadBalancerFrontendIPConfigurationGet.json
     */
    /**
     * Sample code: LoadBalancerFrontendIPConfigurationGet.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void loadBalancerFrontendIPConfigurationGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getLoadBalancerFrontendIpConfigurations()
            .getWithResponse("testrg", "lb", "frontend", com.azure.core.util.Context.NONE);
    }
}
