// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/** Samples for UserConfirmationPassword Send. */
public final class UserConfirmationPasswordSendSamples {
    /*
     * x-ms-original-file: specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2022-08-01/examples/ApiManagementUserConfirmationPasswordSend.json
     */
    /**
     * Sample code: ApiManagementUserConfirmationPasswordSend.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementUserConfirmationPasswordSend(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .userConfirmationPasswords()
            .sendWithResponse(
                "rg1", "apimService1", "57127d485157a511ace86ae7", null, com.azure.core.util.Context.NONE);
    }
}
