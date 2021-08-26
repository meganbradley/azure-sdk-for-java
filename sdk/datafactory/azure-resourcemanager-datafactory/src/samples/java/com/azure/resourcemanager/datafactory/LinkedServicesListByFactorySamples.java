// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for LinkedServices ListByFactory. */
public final class LinkedServicesListByFactorySamples {
    /*
     * operationId: LinkedServices_ListByFactory
     * api-version: 2018-06-01
     * x-ms-examples: LinkedServices_ListByFactory
     */
    /**
     * Sample code: LinkedServices_ListByFactory.
     *
     * @param manager Entry point to DataFactoryManager.
     */
    public static void linkedServicesListByFactory(com.azure.resourcemanager.datafactory.DataFactoryManager manager) {
        manager.linkedServices().listByFactory("exampleResourceGroup", "exampleFactoryName", Context.NONE);
    }
}
