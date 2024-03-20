// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/**
 * Samples for DiagnosticSettingsCategory Get.
 */
public final class DiagnosticSettingsCategoryGetSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/preview/2021-05-01-preview/examples/
     * getDiagnosticSettingsCategory.json
     */
    /**
     * Sample code: Gets the diagnostic setting.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsTheDiagnosticSetting(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings().manager().serviceClient().getDiagnosticSettingsCategories().getWithResponse(
            "subscriptions/1a66ce04-b633-4a0b-b2bc-a912ec8986a6/resourcegroups/viruela1/providers/microsoft.logic/workflows/viruela6",
            "WorkflowRuntime", com.azure.core.util.Context.NONE);
    }
}
