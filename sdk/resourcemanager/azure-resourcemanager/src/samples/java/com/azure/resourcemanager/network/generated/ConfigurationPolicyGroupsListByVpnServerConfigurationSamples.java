// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/** Samples for ConfigurationPolicyGroups ListByVpnServerConfiguration. */
public final class ConfigurationPolicyGroupsListByVpnServerConfigurationSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2022-11-01/examples/ConfigurationPolicyGroupListByVpnServerConfiguration.json
     */
    /**
     * Sample code: ConfigurationPolicyGroupListByVpnServerConfiguration.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void configurationPolicyGroupListByVpnServerConfiguration(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .networks()
            .manager()
            .serviceClient()
            .getConfigurationPolicyGroups()
            .listByVpnServerConfiguration("rg1", "vpnServerConfiguration1", com.azure.core.util.Context.NONE);
    }
}
