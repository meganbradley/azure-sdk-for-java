// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

/** Samples for RecoveryPoints Get. */
public final class RecoveryPointsGetSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesdatareplication/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/RecoveryPoints_Get.json
     */
    /**
     * Sample code: RecoveryPoints_Get.
     *
     * @param manager Entry point to RecoveryServicesDataReplicationManager.
     */
    public static void recoveryPointsGet(
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager) {
        manager
            .recoveryPoints()
            .getWithResponse("rgrecoveryservicesdatareplication", "4", "d", "1X", com.azure.core.util.Context.NONE);
    }
}
