// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.BastionHostInner;
import com.azure.resourcemanager.network.models.BastionHostIpConfiguration;
import com.azure.resourcemanager.network.models.BastionHostPropertiesFormatNetworkAcls;
import com.azure.resourcemanager.network.models.IpRule;
import java.util.Arrays;

/**
 * Samples for BastionHosts CreateOrUpdate.
 */
public final class BastionHostsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/BastionHostDeveloperPut.json
     */
    /**
     * Sample code: Create Developer Bastion Host.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createDeveloperBastionHost(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getBastionHosts().createOrUpdate("rg2", "bastionhostdeveloper",
            new BastionHostInner().withIpConfigurations(Arrays.asList())
                .withVirtualNetwork(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Network/virtualNetworks/vnet2"))
                .withNetworkAcls(new BastionHostPropertiesFormatNetworkAcls()
                    .withIpRules(Arrays.asList(new IpRule().withAddressPrefix("1.1.1.1/16")))),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/BastionHostPut.json
     */
    /**
     * Sample code: Create Bastion Host.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createBastionHost(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getBastionHosts().createOrUpdate("rg1", "bastionhosttenant",
            new BastionHostInner().withIpConfigurations(Arrays.asList(new BastionHostIpConfiguration()
                .withName("bastionHostIpConfiguration")
                .withSubnet(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet2/subnets/BastionHostSubnet"))
                .withPublicIpAddress(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pipName")))),
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/BastionHostPutWithZones.json
     */
    /**
     * Sample code: Create Bastion Host With Zones.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createBastionHostWithZones(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getBastionHosts().createOrUpdate("rg1", "bastionhosttenant",
            new BastionHostInner().withIpConfigurations(Arrays.asList(new BastionHostIpConfiguration()
                .withName("bastionHostIpConfiguration")
                .withSubnet(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet2/subnets/BastionHostSubnet"))
                .withPublicIpAddress(new SubResource().withId(
                    "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pipName")))),
            com.azure.core.util.Context.NONE);
    }
}
