// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

/**
 * Samples for StorageTargets DnsRefresh.
 */
public final class StorageTargetsDnsRefreshSamples {
    /*
     * x-ms-original-file:
     * specification/storagecache/resource-manager/Microsoft.StorageCache/preview/2023-11-01-preview/examples/
     * StorageTargets_DnsRefresh.json
     */
    /**
     * Sample code: Caches_DnsRefresh.
     * 
     * @param manager Entry point to StorageCacheManager.
     */
    public static void cachesDnsRefresh(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.storageTargets().dnsRefresh("scgroup", "sc", "st1", com.azure.core.util.Context.NONE);
    }
}
