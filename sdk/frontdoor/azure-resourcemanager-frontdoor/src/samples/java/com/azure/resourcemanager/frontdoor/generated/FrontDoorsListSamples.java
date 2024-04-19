// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

/**
 * Samples for FrontDoors List.
 */
public final class FrontDoorsListSamples {
    /*
     * x-ms-original-file: specification/frontdoor/resource-manager/Microsoft.Network/stable/2021-06-01/examples/FrontdoorListAll.json
     */
    /**
     * Sample code: List all Front Doors.
     * 
     * @param manager Entry point to FrontDoorManager.
     */
    public static void listAllFrontDoors(com.azure.resourcemanager.frontdoor.FrontDoorManager manager) {
        manager.frontDoors().list(com.azure.core.util.Context.NONE);
    }
}
