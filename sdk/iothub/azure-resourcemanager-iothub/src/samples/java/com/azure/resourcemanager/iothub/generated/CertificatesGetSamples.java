// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

/** Samples for Certificates Get. */
public final class CertificatesGetSamples {
    /*
     * x-ms-original-file: specification/iothub/resource-manager/Microsoft.Devices/stable/2023-06-30/examples/iothub_getcertificate.json
     */
    /**
     * Sample code: Certificates_Get.
     *
     * @param manager Entry point to IotHubManager.
     */
    public static void certificatesGet(com.azure.resourcemanager.iothub.IotHubManager manager) {
        manager.certificates().getWithResponse("myResourceGroup", "testhub", "cert", com.azure.core.util.Context.NONE);
    }
}
