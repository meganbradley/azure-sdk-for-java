// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/** Samples for AppServicePlans List. */
public final class AppServicePlansListSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-09-01/examples/ListAppServicePlans.json
     */
    /**
     * Sample code: List App Service plans.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listAppServicePlans(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getAppServicePlans().list(null, com.azure.core.util.Context.NONE);
    }
}
