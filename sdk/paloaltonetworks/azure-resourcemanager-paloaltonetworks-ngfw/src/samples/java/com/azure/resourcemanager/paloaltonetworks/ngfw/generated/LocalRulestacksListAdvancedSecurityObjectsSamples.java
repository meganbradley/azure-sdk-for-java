// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.resourcemanager.paloaltonetworks.ngfw.models.AdvSecurityObjectTypeEnum;

/**
 * Samples for LocalRulestacks ListAdvancedSecurityObjects.
 */
public final class LocalRulestacksListAdvancedSecurityObjectsSamples {
    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * LocalRulestacks_listAdvancedSecurityObjects_MaximumSet_Gen.json
     */
    /**
     * Sample code: LocalRulestacks_listAdvancedSecurityObjects_MaximumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void localRulestacksListAdvancedSecurityObjectsMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.localRulestacks().listAdvancedSecurityObjectsWithResponse("rgopenapi", "lrs1",
            AdvSecurityObjectTypeEnum.fromString("localRulestacks"), "a6a321", 20, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2023-09-01/examples/
     * LocalRulestacks_listAdvancedSecurityObjects_MinimumSet_Gen.json
     */
    /**
     * Sample code: LocalRulestacks_listAdvancedSecurityObjects_MinimumSet_Gen.
     * 
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void localRulestacksListAdvancedSecurityObjectsMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.localRulestacks().listAdvancedSecurityObjectsWithResponse("rgopenapi", "lrs1",
            AdvSecurityObjectTypeEnum.fromString("localRulestacks"), null, null, com.azure.core.util.Context.NONE);
    }
}
