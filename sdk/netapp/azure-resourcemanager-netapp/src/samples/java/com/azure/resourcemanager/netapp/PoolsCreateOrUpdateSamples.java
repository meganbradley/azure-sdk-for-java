// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp;

import com.azure.resourcemanager.netapp.models.QosType;
import com.azure.resourcemanager.netapp.models.ServiceLevel;

/** Samples for Pools CreateOrUpdate. */
public final class PoolsCreateOrUpdateSamples {
    /*
     * operationId: Pools_CreateOrUpdate
     * api-version: 2021-06-01
     * x-ms-examples: Pools_CreateOrUpdate
     */
    /**
     * Sample code: Pools_CreateOrUpdate.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void poolsCreateOrUpdate(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager
            .pools()
            .define("pool1")
            .withRegion("eastus")
            .withExistingNetAppAccount("myRG", "account1")
            .withSize(4398046511104L)
            .withServiceLevel(ServiceLevel.PREMIUM)
            .withQosType(QosType.AUTO)
            .create();
    }
}
