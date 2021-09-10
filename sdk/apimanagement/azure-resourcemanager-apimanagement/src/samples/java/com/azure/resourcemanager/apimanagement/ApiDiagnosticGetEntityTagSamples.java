// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ApiDiagnostic GetEntityTag. */
public final class ApiDiagnosticGetEntityTagSamples {
    /*
     * operationId: ApiDiagnostic_GetEntityTag
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementHeadApiDiagnostic
     */
    /**
     * Sample code: ApiManagementHeadApiDiagnostic.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadApiDiagnostic(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiDiagnostics()
            .getEntityTagWithResponse(
                "rg1", "apimService1", "57d1f7558aa04f15146d9d8a", "applicationinsights", Context.NONE);
    }
}
