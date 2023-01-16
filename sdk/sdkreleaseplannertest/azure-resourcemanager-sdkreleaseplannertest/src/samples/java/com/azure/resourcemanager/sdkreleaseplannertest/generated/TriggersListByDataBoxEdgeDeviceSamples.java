// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.generated;

/** Samples for Triggers ListByDataBoxEdgeDevice. */
public final class TriggersListByDataBoxEdgeDeviceSamples {
    /*
     * x-ms-original-file: specification/sdkreleaseplannertest/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/TriggerGetAllInDevice.json
     */
    /**
     * Sample code: TriggerGetAllInDevice.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void triggerGetAllInDevice(
        com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager manager) {
        manager
            .triggers()
            .listByDataBoxEdgeDevice(
                "testedgedevice", "GroupForEdgeAutomation", null, com.azure.core.util.Context.NONE);
    }
}
