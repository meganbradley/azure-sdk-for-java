// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.resourcemanager.recoveryservicesdatareplication.models.PolicyModelCustomProperties;
import com.azure.resourcemanager.recoveryservicesdatareplication.models.PolicyModelProperties;

/** Samples for Policy Create. */
public final class PolicyCreateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesdatareplication/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/Policy_Create.json
     */
    /**
     * Sample code: Policy_Create.
     *
     * @param manager Entry point to RecoveryServicesDataReplicationManager.
     */
    public static void policyCreate(
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager) {
        manager
            .policies()
            .define("fafqwc")
            .withExistingReplicationVault("rgrecoveryservicesdatareplication", "4")
            .withProperties(new PolicyModelProperties().withCustomProperties(new PolicyModelCustomProperties()))
            .create();
    }
}
