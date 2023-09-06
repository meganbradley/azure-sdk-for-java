// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for DelegationSettings Get. */
public final class DelegationSettingsGetSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementPortalSettingsGetDelegation.json
     */
    /**
     * Sample code: ApiManagementPortalSettingsGetDelegation.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementPortalSettingsGetDelegation(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.delegationSettings().getWithResponse("rg1", "apimService1", com.azure.core.util.Context.NONE);
    }
}
