// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for DelegationSettings GetEntityTag. */
public final class DelegationSettingsGetEntityTagSamples {
    /*
     * operationId: DelegationSettings_GetEntityTag
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementHeadDelegationSettings
     */
    /**
     * Sample code: ApiManagementHeadDelegationSettings.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementHeadDelegationSettings(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.delegationSettings().getEntityTagWithResponse("rg1", "apimService1", Context.NONE);
    }
}
