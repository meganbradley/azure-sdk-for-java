// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

/** Samples for WebPubSubCustomDomains List. */
public final class WebPubSubCustomDomainsListSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/preview/2023-06-01-preview/examples/WebPubSubCustomDomains_List.json
     */
    /**
     * Sample code: WebPubSubCustomDomains_List.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubCustomDomainsList(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager
            .webPubSubCustomDomains()
            .list("myResourceGroup", "myWebPubSubService", com.azure.core.util.Context.NONE);
    }
}
