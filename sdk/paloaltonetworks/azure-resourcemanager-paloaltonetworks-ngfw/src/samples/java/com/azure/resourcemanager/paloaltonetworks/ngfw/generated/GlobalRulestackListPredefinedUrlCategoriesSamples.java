// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

/** Samples for GlobalRulestack ListPredefinedUrlCategories. */
public final class GlobalRulestackListPredefinedUrlCategoriesSamples {
    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2022-08-29/examples/GlobalRulestack_listPredefinedUrlCategories_MaximumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_listPredefinedUrlCategories_MaximumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackListPredefinedUrlCategoriesMaximumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .globalRulestacks()
            .listPredefinedUrlCategoriesWithResponse("praval", "a6a321", 20, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/paloaltonetworks/resource-manager/PaloAltoNetworks.Cloudngfw/stable/2022-08-29/examples/GlobalRulestack_listPredefinedUrlCategories_MinimumSet_Gen.json
     */
    /**
     * Sample code: GlobalRulestack_listPredefinedUrlCategories_MinimumSet_Gen.
     *
     * @param manager Entry point to PaloAltoNetworksNgfwManager.
     */
    public static void globalRulestackListPredefinedUrlCategoriesMinimumSetGen(
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager) {
        manager
            .globalRulestacks()
            .listPredefinedUrlCategoriesWithResponse("praval", null, null, com.azure.core.util.Context.NONE);
    }
}
