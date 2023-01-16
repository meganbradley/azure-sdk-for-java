// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.NetworkSettingsInner;
import com.azure.resourcemanager.sdkreleaseplannertest.models.NetworkAdapter;
import com.azure.resourcemanager.sdkreleaseplannertest.models.NetworkSettings;
import java.util.Collections;
import java.util.List;

public final class NetworkSettingsImpl implements NetworkSettings {
    private NetworkSettingsInner innerObject;

    private final com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager serviceManager;

    NetworkSettingsImpl(
        NetworkSettingsInner innerObject,
        com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager serviceManager) {
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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<NetworkAdapter> networkAdapters() {
        List<NetworkAdapter> inner = this.innerModel().networkAdapters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public NetworkSettingsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
