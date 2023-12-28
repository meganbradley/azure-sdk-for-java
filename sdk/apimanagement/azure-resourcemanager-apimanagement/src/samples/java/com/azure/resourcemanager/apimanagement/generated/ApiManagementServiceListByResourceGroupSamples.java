// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for ApiManagementService ListByResourceGroup. */
public final class ApiManagementServiceListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementListServiceBySubscriptionAndResourceGroup.json
     */
    /**
     * Sample code: ApiManagementListServiceBySubscriptionAndResourceGroup.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListServiceBySubscriptionAndResourceGroup(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apiManagementServices().listByResourceGroup("rg1", com.azure.core.util.Context.NONE);
    }
}
