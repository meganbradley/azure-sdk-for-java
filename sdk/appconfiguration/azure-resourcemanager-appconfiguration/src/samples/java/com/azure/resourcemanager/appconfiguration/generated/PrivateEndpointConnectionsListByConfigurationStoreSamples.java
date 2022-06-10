// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections ListByConfigurationStore. */
public final class PrivateEndpointConnectionsListByConfigurationStoreSamples {
    /*
     * x-ms-original-file: specification/appconfiguration/resource-manager/Microsoft.AppConfiguration/stable/2022-05-01/examples/ConfigurationStoresListPrivateEndpointConnections.json
     */
    /**
     * Sample code: PrivateEndpointConnection_List.
     *
     * @param manager Entry point to AppConfigurationManager.
     */
    public static void privateEndpointConnectionList(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager manager) {
        manager.privateEndpointConnections().listByConfigurationStore("myResourceGroup", "contoso", Context.NONE);
    }
}
