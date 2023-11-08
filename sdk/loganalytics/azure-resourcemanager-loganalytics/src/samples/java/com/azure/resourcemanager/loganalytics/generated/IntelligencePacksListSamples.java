// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

/** Samples for IntelligencePacks List. */
public final class IntelligencePacksListSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2020-08-01/examples/WorkspacesListIntelligencePacks.json
     */
    /**
     * Sample code: IntelligencePacksList.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void intelligencePacksList(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.intelligencePacks().listWithResponse("rg1", "TestLinkWS", com.azure.core.util.Context.NONE);
    }
}
