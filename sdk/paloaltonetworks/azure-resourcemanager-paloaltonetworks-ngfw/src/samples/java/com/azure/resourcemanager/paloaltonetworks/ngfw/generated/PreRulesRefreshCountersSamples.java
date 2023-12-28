// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/**
 * Samples for PreRules RefreshCounters.
 */
public final class PreRulesRefreshCountersSamples {
    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * PreRules_refreshCounters_MaximumSet_Gen.json
     */
    /**
     * Sample code: PreRules_refreshCounters_MaximumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void preRulesRefreshCountersMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.preRules().refreshCountersWithResponse("lrs1", "1", "firewall1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * PreRules_refreshCounters_MinimumSet_Gen.json
     */
    /**
     * Sample code: PreRules_refreshCounters_MinimumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void preRulesRefreshCountersMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.preRules().refreshCountersWithResponse("lrs1", "1", null, com.azure.core.util.Context.NONE);
    }
}
