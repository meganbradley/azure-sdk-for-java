// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.Context;

/** Samples for WebPubSubSharedPrivateLinkResources List. */
public final class WebPubSubSharedPrivateLinkResourcesListSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/stable/2021-10-01/examples/WebPubSubSharedPrivateLinkResources_List.json
     */
    /**
     * Sample code: WebPubSubSharedPrivateLinkResources_List.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubSharedPrivateLinkResourcesList(
        com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager.webPubSubSharedPrivateLinkResources().list("myResourceGroup", "myWebPubSubService", Context.NONE);
    }
}
