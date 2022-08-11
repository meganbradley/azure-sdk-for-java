// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for Diagnostics GetHostingEnvironmentDetectorResponse. */
public final class DiagnosticsGetHostingEnvironmentDetectorResponseSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/Diagnostics_GetHostingEnvironmentDetectorResponse.json
     */
    /**
     * Sample code: Get App Service Environment Detector Responses.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppServiceEnvironmentDetectorResponses(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getDiagnostics()
            .getHostingEnvironmentDetectorResponseWithResponse(
                "Sample-WestUSResourceGroup",
                "SampleAppServiceEnvironment",
                "runtimeavailability",
                null,
                null,
                null,
                Context.NONE);
    }
}
