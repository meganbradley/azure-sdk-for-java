// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for PartnerDestinations GetByResourceGroup.
 */
public final class PartnerDestinationsGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * PartnerDestinations_Get.json
     */
    /**
     * Sample code: PartnerDestinations_Get.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void partnerDestinationsGet(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.partnerDestinations().getByResourceGroupWithResponse("examplerg", "examplePartnerDestinationName1",
            com.azure.core.util.Context.NONE);
    }
}
