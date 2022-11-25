// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.generated;

/** Samples for SignalRCustomCertificates CreateOrUpdate. */
public final class SignalRCustomCertificatesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/signalr/resource-manager/Microsoft.SignalRService/preview/2022-08-01-preview/examples/SignalRCustomCertificates_CreateOrUpdate.json
     */
    /**
     * Sample code: SignalRCustomCertificates_CreateOrUpdate.
     *
     * @param manager Entry point to SignalRManager.
     */
    public static void signalRCustomCertificatesCreateOrUpdate(
        com.azure.resourcemanager.signalr.SignalRManager manager) {
        manager
            .signalRCustomCertificates()
            .define("myCert")
            .withExistingSignalR("myResourceGroup", "mySignalRService")
            .withKeyVaultBaseUri("https://myvault.keyvault.azure.net/")
            .withKeyVaultSecretName("mycert")
            .withKeyVaultSecretVersion("bb6a44b2743f47f68dad0d6cc9756432")
            .create();
    }
}
