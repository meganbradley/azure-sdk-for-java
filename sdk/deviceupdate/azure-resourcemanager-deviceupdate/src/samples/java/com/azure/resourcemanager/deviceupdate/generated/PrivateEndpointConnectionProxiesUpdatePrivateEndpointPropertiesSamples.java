// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.deviceupdate.models.PrivateEndpointUpdate;

/** Samples for PrivateEndpointConnectionProxies UpdatePrivateEndpointProperties. */
public final class PrivateEndpointConnectionProxiesUpdatePrivateEndpointPropertiesSamples {
    /*
     * x-ms-original-file: specification/deviceupdate/resource-manager/Microsoft.DeviceUpdate/stable/2022-10-01/examples/PrivateEndpointConnectionProxies/PrivateEndpointConnectionProxy_PrivateEndpointUpdate.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxyPrivateEndpointUpdate.
     *
     * @param manager Entry point to DeviceUpdateManager.
     */
    public static void privateEndpointConnectionProxyPrivateEndpointUpdate(
        com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager) {
        manager
            .privateEndpointConnectionProxies()
            .updatePrivateEndpointPropertiesWithResponse(
                "test-rg",
                "contoso",
                "peexample01",
                new PrivateEndpointUpdate()
                    .withId(
                        "/subscriptions/11111111-1111-1111-1111-111111111111/resourceGroups/test-rg/providers/Microsoft.Network/privateEndpoints/{peName}")
                    .withLocation("westus2")
                    .withImmutableSubscriptionId("00000000-0000-0000-0000-000000000000")
                    .withImmutableResourceId(
                        "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/test-rg/providers/Microsoft.Network/privateEndpoints/{peName}")
                    .withVnetTrafficTag("12345678"),
                Context.NONE);
    }
}
