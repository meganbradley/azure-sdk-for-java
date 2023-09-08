// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.NetworkDeviceSkusClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkDeviceSkuInner;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDeviceSku;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkDeviceSkus;

public final class NetworkDeviceSkusImpl implements NetworkDeviceSkus {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkDeviceSkusImpl.class);

    private final NetworkDeviceSkusClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public NetworkDeviceSkusImpl(
        NetworkDeviceSkusClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<NetworkDeviceSku> getWithResponse(String networkDeviceSkuName, Context context) {
        Response<NetworkDeviceSkuInner> inner = this.serviceClient().getWithResponse(networkDeviceSkuName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkDeviceSkuImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkDeviceSku get(String networkDeviceSkuName) {
        NetworkDeviceSkuInner inner = this.serviceClient().get(networkDeviceSkuName);
        if (inner != null) {
            return new NetworkDeviceSkuImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkDeviceSku> list() {
        PagedIterable<NetworkDeviceSkuInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkDeviceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkDeviceSku> list(Context context) {
        PagedIterable<NetworkDeviceSkuInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetworkDeviceSkuImpl(inner1, this.manager()));
    }

    private NetworkDeviceSkusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }
}
