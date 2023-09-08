// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

/** Samples for WebPubSub Restart. */
public final class WebPubSubRestartSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/preview/2023-06-01-preview/examples/WebPubSub_Restart.json
     */
    /**
     * Sample code: WebPubSub_Restart.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubRestart(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager.webPubSubs().restart("myResourceGroup", "myWebPubSubService", com.azure.core.util.Context.NONE);
    }
}
