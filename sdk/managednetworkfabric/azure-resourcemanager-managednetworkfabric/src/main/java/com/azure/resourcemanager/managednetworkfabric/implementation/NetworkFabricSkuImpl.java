// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkFabricSkuInner;
import com.azure.resourcemanager.managednetworkfabric.models.FabricSkuType;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkFabricSku;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class NetworkFabricSkuImpl implements NetworkFabricSku {
    private NetworkFabricSkuInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    NetworkFabricSkuImpl(
        NetworkFabricSkuInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public FabricSkuType typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public Integer maxComputeRacks() {
        return this.innerModel().maxComputeRacks();
    }

    public Integer maximumServerCount() {
        return this.innerModel().maximumServerCount();
    }

    public List<String> supportedVersions() {
        List<String> inner = this.innerModel().supportedVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String details() {
        return this.innerModel().details();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NetworkFabricSkuInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }
}
