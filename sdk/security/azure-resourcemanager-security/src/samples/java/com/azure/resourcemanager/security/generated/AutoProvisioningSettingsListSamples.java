// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

/** Samples for AutoProvisioningSettings List. */
public final class AutoProvisioningSettingsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/preview/2017-08-01-preview/examples/AutoProvisioningSettings/GetAutoProvisioningSettingsSubscription_example.json
     */
    /**
     * Sample code: Get auto provisioning settings for subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getAutoProvisioningSettingsForSubscription(
        com.azure.resourcemanager.security.SecurityManager manager) {
        manager.autoProvisioningSettings().list(com.azure.core.util.Context.NONE);
    }
}
