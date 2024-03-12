// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

/**
 * Samples for ReplicationNetworkMappings Get.
 */
public final class ReplicationNetworkMappingsGetSamples {
    /*
     * x-ms-original-file:
     * specification/recoveryservicessiterecovery/resource-manager/Microsoft.RecoveryServices/stable/2023-08-01/examples
     * /ReplicationNetworkMappings_Get.json
     */
    /**
     * Sample code: Gets network mapping by name.
     * 
     * @param manager Entry point to SiteRecoveryManager.
     */
    public static void
        getsNetworkMappingByName(com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager) {
        manager.replicationNetworkMappings().getWithResponse("srce2avaultbvtaC27", "srcBvte2a14C27",
            "b0cef6e9a4437b81803d0b55ada4f700ab66caae59c35d62723a1589c0cd13ac", "e2267b5c-2650-49bd-ab3f-d66aae694c06",
            "corpe2amap", com.azure.core.util.Context.NONE);
    }
}
