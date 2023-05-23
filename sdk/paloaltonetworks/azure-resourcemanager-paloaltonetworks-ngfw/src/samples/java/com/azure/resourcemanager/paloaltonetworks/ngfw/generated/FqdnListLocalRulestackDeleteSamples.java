// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for FqdnListLocalRulestack Delete. */
public final class FqdnListLocalRulestackDeleteSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/FqdnListLocalRulestack_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: FqdnListLocalRulestack_Delete_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void fqdnListLocalRulestackDeleteMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.fqdnListLocalRulestacks().delete("rgopenapi", "lrs1", "armid1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/preview/2022-08-29-preview/examples/FqdnListLocalRulestack_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: FqdnListLocalRulestack_Delete_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void fqdnListLocalRulestackDeleteMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager.fqdnListLocalRulestacks().delete("rgopenapi", "lrs1", "armid1", com.azure.core.util.Context.NONE);
    }
}
