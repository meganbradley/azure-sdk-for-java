// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

/**
 * Samples for AppServicePlans GetByResourceGroup.
 */
public final class AppServicePlansGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/web/resource-manager/Microsoft.Web/stable/2023-01-01/examples/GetAppServicePlan.json
     */
    /**
     * Sample code: Get App Service plan.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAppServicePlan(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.webApps().manager().serviceClient().getAppServicePlans().getByResourceGroupWithResponse("testrg123",
            "testsf6141", com.azure.core.util.Context.NONE);
    }
}
