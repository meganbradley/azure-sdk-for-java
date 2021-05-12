// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.implementation;

import com.azure.resourcemanager.devtestlabs.fluent.models.LabVhdInner;
import com.azure.resourcemanager.devtestlabs.models.LabVhd;

public final class LabVhdImpl implements LabVhd {
    private LabVhdInner innerObject;

    private final com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager;

    LabVhdImpl(LabVhdInner innerObject, com.azure.resourcemanager.devtestlabs.DevTestLabsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public LabVhdInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.devtestlabs.DevTestLabsManager manager() {
        return this.serviceManager;
    }
}
