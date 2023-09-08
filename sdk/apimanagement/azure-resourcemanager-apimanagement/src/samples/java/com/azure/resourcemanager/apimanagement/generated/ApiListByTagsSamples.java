// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for Api ListByTags. */
public final class ApiListByTagsSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementListApisByTags.json
     */
    /**
     * Sample code: ApiManagementListApisByTags.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListApisByTags(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.apis().listByTags("rg1", "apimService1", null, null, null, null, com.azure.core.util.Context.NONE);
    }
}
