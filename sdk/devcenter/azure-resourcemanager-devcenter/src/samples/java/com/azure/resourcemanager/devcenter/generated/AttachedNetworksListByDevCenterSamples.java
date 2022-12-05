// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.Context;

/** Samples for AttachedNetworks ListByDevCenter. */
public final class AttachedNetworksListByDevCenterSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2022-11-11-preview/examples/AttachedNetworks_ListByDevCenter.json
     */
    /**
     * Sample code: AttachedNetworks_ListByDevCenter.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void attachedNetworksListByDevCenter(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        manager.attachedNetworks().listByDevCenter("rg1", "Contoso", null, Context.NONE);
    }
}
