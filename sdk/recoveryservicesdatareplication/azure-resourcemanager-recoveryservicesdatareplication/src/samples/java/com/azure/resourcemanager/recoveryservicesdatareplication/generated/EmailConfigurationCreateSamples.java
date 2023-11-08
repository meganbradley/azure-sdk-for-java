// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.generated;

import com.azure.resourcemanager.recoveryservicesdatareplication.models.EmailConfigurationModelProperties;
import java.util.Arrays;

/** Samples for EmailConfiguration Create. */
public final class EmailConfigurationCreateSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesdatareplication/resource-manager/Microsoft.DataReplication/preview/2021-02-16-preview/examples/EmailConfiguration_Create.json
     */
    /**
     * Sample code: EmailConfiguration_Create.
     *
     * @param manager Entry point to RecoveryServicesDataReplicationManager.
     */
    public static void emailConfigurationCreate(
        com.azure.resourcemanager.recoveryservicesdatareplication.RecoveryServicesDataReplicationManager manager) {
        manager
            .emailConfigurations()
            .define("0")
            .withExistingReplicationVault("rgrecoveryservicesdatareplication", "4")
            .withProperties(
                new EmailConfigurationModelProperties()
                    .withSendToOwners(true)
                    .withCustomEmailAddresses(Arrays.asList("ketvbducyailcny"))
                    .withLocale("vpnjxjvdqtebnucyxiyrjiko"))
            .create();
    }
}
