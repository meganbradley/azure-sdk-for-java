// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.generated;

/** Samples for Orders Delete. */
public final class OrdersDeleteSamples {
    /*
     * x-ms-original-file: specification/sdkreleaseplannertest/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/OrderDelete.json
     */
    /**
     * Sample code: OrderDelete.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void orderDelete(com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager manager) {
        manager.orders().delete("testedgedevice", "GroupForEdgeAutomation", com.azure.core.util.Context.NONE);
    }
}
