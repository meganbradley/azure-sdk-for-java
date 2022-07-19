// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.Context;

/** Samples for IntelligencePacks Enable. */
public final class IntelligencePacksEnableSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2020-08-01/examples/WorkspacesEnableIntelligencePack.json
     */
    /**
     * Sample code: IntelligencePacksEnable.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void intelligencePacksEnable(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager.intelligencePacks().enableWithResponse("rg1", "TestLinkWS", "ChangeTracking", Context.NONE);
    }
}
