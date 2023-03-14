// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.resourcemanager.storagecache.models.PrimingJob;

/** Samples for Caches StartPrimingJob. */
public final class CachesStartPrimingJobSamples {
    /*
     * x-ms-original-file: specification/storagecache/resource-manager/Microsoft.StorageCache/preview/2023-03-01-preview/examples/StartPrimingJob.json
     */
    /**
     * Sample code: StartPrimingJob.
     *
     * @param manager Entry point to StorageCacheManager.
     */
    public static void startPrimingJob(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager
            .caches()
            .startPrimingJob(
                "scgroup",
                "sc1",
                new PrimingJob()
                    .withPrimingJobName("contosoJob")
                    .withPrimingManifestUrl(
                        "https://contosostorage.blob.core.windows.net/contosoblob/00000000_00000000000000000000000000000000.00000000000.FFFFFFFF.00000000?sp=r&st=2021-08-11T19:33:35Z&se=2021-08-12T03:33:35Z&spr=https&sv=2020-08-04&sr=b&sig=<secret-value-from-key>"),
                com.azure.core.util.Context.NONE);
    }
}
