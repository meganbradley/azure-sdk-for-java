// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

/**
 * Samples for PrivateEndpointConnections Get.
 */
public final class PrivateEndpointConnectionsGetSamples {
    /*
     * x-ms-original-file:
     * specification/notificationhubs/resource-manager/Microsoft.NotificationHubs/preview/2023-10-01-preview/examples/
     * Namespaces/PrivateEndpointConnectionGet.json
     */
    /**
     * Sample code: PrivateEndpointConnections_Get.
     * 
     * @param manager Entry point to NotificationHubsManager.
     */
    public static void
        privateEndpointConnectionsGet(com.azure.resourcemanager.notificationhubs.NotificationHubsManager manager) {
        manager.privateEndpointConnections().getWithResponse("5ktrial", "nh-sdk-ns",
            "nh-sdk-ns.1fa229cd-bf3f-47f0-8c49-afb36723997e", com.azure.core.util.Context.NONE);
    }
}
