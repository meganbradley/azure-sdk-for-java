// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for VpnSiteLinks Get.
 */
public final class VpnSiteLinksGetSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-09-01/examples/VpnSiteLinkGet.json
     */
    /**
     * Sample code: VpnSiteGet.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void vpnSiteGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getVpnSiteLinks().getWithResponse("rg1", "vpnSite1", "vpnSiteLink1",
            com.azure.core.util.Context.NONE);
    }
}
