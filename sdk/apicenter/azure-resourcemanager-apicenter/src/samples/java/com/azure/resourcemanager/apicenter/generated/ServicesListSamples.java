// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

/** Samples for Services List. */
public final class ServicesListSamples {
    /*
     * x-ms-original-file: specification/apicenter/resource-manager/Microsoft.ApiCenter/preview/2023-07-01-preview/examples/Services_ListBySubscription.json
     */
    /**
     * Sample code: Services_ListBySubscription.
     *
     * @param manager Entry point to ApiCenterManager.
     */
    public static void servicesListBySubscription(com.azure.resourcemanager.apicenter.ApiCenterManager manager) {
        manager.services().list(com.azure.core.util.Context.NONE);
    }
}
