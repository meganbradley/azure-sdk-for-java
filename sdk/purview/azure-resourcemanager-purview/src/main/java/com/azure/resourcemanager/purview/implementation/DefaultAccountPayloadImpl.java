// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.purview.implementation;

import com.azure.resourcemanager.purview.fluent.models.DefaultAccountPayloadInner;
import com.azure.resourcemanager.purview.models.DefaultAccountPayload;
import com.azure.resourcemanager.purview.models.ScopeType;

public final class DefaultAccountPayloadImpl implements DefaultAccountPayload {
    private DefaultAccountPayloadInner innerObject;

    private final com.azure.resourcemanager.purview.PurviewManager serviceManager;

    DefaultAccountPayloadImpl(
        DefaultAccountPayloadInner innerObject, com.azure.resourcemanager.purview.PurviewManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String accountName() {
        return this.innerModel().accountName();
    }

    public String resourceGroupName() {
        return this.innerModel().resourceGroupName();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public String scopeTenantId() {
        return this.innerModel().scopeTenantId();
    }

    public ScopeType scopeType() {
        return this.innerModel().scopeType();
    }

    public String subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public DefaultAccountPayloadInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.purview.PurviewManager manager() {
        return this.serviceManager;
    }
}
