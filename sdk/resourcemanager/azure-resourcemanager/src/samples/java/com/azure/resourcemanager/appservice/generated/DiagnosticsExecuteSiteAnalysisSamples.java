// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for Diagnostics ExecuteSiteAnalysis.
 */
public final class DiagnosticsExecuteSiteAnalysisSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/Diagnostics_ExecuteSiteAnalysis.json
     */
    /**
     * Sample code: Execute site analysis.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void executeSiteAnalysis(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getDiagnostics().executeSiteAnalysisWithResponse(
            "Sample-WestUSResourceGroup", "SampleApp", "availability", "apprestartanalyses", null, null, null,
            com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/Diagnostics_ExecuteSiteAnalysisSlot.
     * json
     */
    /**
     * Sample code: Execute site slot analysis.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void executeSiteSlotAnalysis(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getDiagnostics().executeSiteAnalysisWithResponse(
            "Sample-WestUSResourceGroup", "SampleApp", "availability", "apprestartanalyses", null, null, null,
            com.azure.core.util.Context.NONE);
    }
}
