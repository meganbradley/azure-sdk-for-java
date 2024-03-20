// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

/**
 * Samples for DaprSubscriptions Delete.
 */
public final class DaprSubscriptionsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/app/resource-manager/Microsoft.App/preview/2023-11-02-preview/examples/DaprSubscriptions_Delete.
     * json
     */
    /**
     * Sample code: Delete dapr subscription.
     * 
     * @param manager Entry point to ContainerAppsApiManager.
     */
    public static void deleteDaprSubscription(com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager) {
        manager.daprSubscriptions().deleteWithResponse("examplerg", "myenvironment", "mysubscription",
            com.azure.core.util.Context.NONE);
    }
}
