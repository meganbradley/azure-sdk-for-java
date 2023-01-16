// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.generated;

/** Samples for Addons Delete. */
public final class AddonsDeleteSamples {
    /*
     * x-ms-original-file: specification/sdkreleaseplannertest/resource-manager/Microsoft.DataBoxEdge/stable/2022-03-01/examples/DeleteAddons.json
     */
    /**
     * Sample code: DeleteAddOns.
     *
     * @param manager Entry point to DataBoxEdgeManager.
     */
    public static void deleteAddOns(com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager manager) {
        manager
            .addons()
            .delete(
                "testedgedevice",
                "KubernetesRole",
                "arcName",
                "GroupForEdgeAutomation",
                com.azure.core.util.Context.NONE);
    }
}
