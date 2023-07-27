// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

/** Samples for Application List. */
public final class ApplicationListSamples {
    /*
     * x-ms-original-file: specification/batch/resource-manager/Microsoft.Batch/stable/2023-05-01/examples/ApplicationList.json
     */
    /**
     * Sample code: ApplicationList.
     *
     * @param manager Entry point to BatchManager.
     */
    public static void applicationList(com.azure.resourcemanager.batch.BatchManager manager) {
        manager
            .applications()
            .list("default-azurebatch-japaneast", "sampleacct", null, com.azure.core.util.Context.NONE);
    }
}
