// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.resourcemanager.datafactory.fluent.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse;
import java.util.Collections;
import java.util.List;

public final class IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseImpl
    implements IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponse {
    private IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner innerObject;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseImpl(
        IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner innerObject,
        com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint> value() {
        List<IntegrationRuntimeOutboundNetworkDependenciesCategoryEndpoint> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public IntegrationRuntimeOutboundNetworkDependenciesEndpointsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }
}
