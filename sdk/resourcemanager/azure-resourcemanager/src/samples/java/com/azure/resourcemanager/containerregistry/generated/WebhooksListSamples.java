// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated;

/**
 * Samples for Webhooks List.
 */
public final class WebhooksListSamples {
    /*
     * x-ms-original-file:
     * specification/containerregistry/resource-manager/Microsoft.ContainerRegistry/preview/2023-11-01-preview/examples/
     * WebhookList.json
     */
    /**
     * Sample code: WebhookList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void webhookList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.containerRegistries().manager().serviceClient().getWebhooks().list("myResourceGroup", "myRegistry",
            com.azure.core.util.Context.NONE);
    }
}
