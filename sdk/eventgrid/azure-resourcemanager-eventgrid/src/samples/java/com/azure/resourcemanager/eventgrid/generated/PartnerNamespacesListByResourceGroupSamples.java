// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

/**
 * Samples for PartnerNamespaces ListByResourceGroup.
 */
public final class PartnerNamespacesListByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/eventgrid/resource-manager/Microsoft.EventGrid/preview/2023-12-15-preview/examples/
     * PartnerNamespaces_ListByResourceGroup.json
     */
    /**
     * Sample code: PartnerNamespaces_ListByResourceGroup.
     * 
     * @param manager Entry point to EventGridManager.
     */
    public static void
        partnerNamespacesListByResourceGroup(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.partnerNamespaces().listByResourceGroup("examplerg", null, null, com.azure.core.util.Context.NONE);
    }
}
