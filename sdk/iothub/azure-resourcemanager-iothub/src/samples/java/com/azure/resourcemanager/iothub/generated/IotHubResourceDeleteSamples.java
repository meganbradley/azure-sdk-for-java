// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

/** Samples for IotHubResource Delete. */
public final class IotHubResourceDeleteSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/preview/2022-11-15-preview/examples/iothub_delete.json
     */
    /**
     * Sample code: IotHubResource_Delete.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void iotHubResourceDelete(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager.iotHubResources().delete("myResourceGroup", "testHub", com.azure.core.util.Context.NONE);
    }
}
