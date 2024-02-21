// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for PublicIpAddresses ListCloudServiceRoleInstancePublicIpAddresses.
 */
public final class PublicIpAddressesListCloudServiceRoleInstancePublicIpAddressesSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/
     * CloudServiceRoleInstancePublicIpList.json
     */
    /**
     * Sample code: ListVMSSVMPublicIP.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listVMSSVMPublicIP(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getPublicIpAddresses().listCloudServiceRoleInstancePublicIpAddresses(
            "cs-tester", "cs1", "Test_VM_0", "nic1", "ip1", com.azure.core.util.Context.NONE);
    }
}
