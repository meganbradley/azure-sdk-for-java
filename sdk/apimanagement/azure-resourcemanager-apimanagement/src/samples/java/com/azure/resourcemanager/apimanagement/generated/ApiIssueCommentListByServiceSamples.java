// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for ApiIssueComment ListByService. */
public final class ApiIssueCommentListByServiceSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementListApiIssueComments.json
     */
    /**
     * Sample code: ApiManagementListApiIssueComments.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListApiIssueComments(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiIssueComments()
            .listByService(
                "rg1",
                "apimService1",
                "57d1f7558aa04f15146d9d8a",
                "57d2ef278aa04f0ad01d6cdc",
                null,
                null,
                null,
                com.azure.core.util.Context.NONE);
    }
}
