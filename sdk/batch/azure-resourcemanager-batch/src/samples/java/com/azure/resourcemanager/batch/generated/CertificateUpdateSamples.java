// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.resourcemanager.batch.models.Certificate;

/** Samples for Certificate Update. */
public final class CertificateUpdateSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-05-01/examples/CertificateUpdate.json
     */
    /**
     * Sample code: UpdateCertificate.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void updateCertificate(com.azure.resourcemanager.batch.BatchManager manager) {
        Certificate resource =
            manager
                .certificates()
                .getWithResponse(
                    "default-azurebatch-japaneast",
                    "sampleacct",
                    "sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e",
                    com.azure.core.util.Context.NONE)
                .getValue();
        resource.update().withData("MIIJsgIBAzCCCW4GCSqGSIb3DQE...").withPassword("<ExamplePassword>").apply();
    }
}
