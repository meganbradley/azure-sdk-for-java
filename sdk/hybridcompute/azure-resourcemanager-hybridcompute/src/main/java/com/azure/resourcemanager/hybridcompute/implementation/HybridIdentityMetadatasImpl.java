// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcompute.fluent.HybridIdentityMetadatasClient;
import com.azure.resourcemanager.hybridcompute.fluent.models.HybridIdentityMetadataInner;
import com.azure.resourcemanager.hybridcompute.models.HybridIdentityMetadata;
import com.azure.resourcemanager.hybridcompute.models.HybridIdentityMetadatas;

public final class HybridIdentityMetadatasImpl implements HybridIdentityMetadatas {
    private static final ClientLogger LOGGER = new ClientLogger(HybridIdentityMetadatasImpl.class);

    private final HybridIdentityMetadatasClient innerClient;

    private final com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager;

    public HybridIdentityMetadatasImpl(
        HybridIdentityMetadatasClient innerClient,
        com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<HybridIdentityMetadata> getWithResponse(
        String resourceGroupName, String machineName, String metadataName, Context context) {
        Response<HybridIdentityMetadataInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, machineName, metadataName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HybridIdentityMetadataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public HybridIdentityMetadata get(String resourceGroupName, String machineName, String metadataName) {
        HybridIdentityMetadataInner inner = this.serviceClient().get(resourceGroupName, machineName, metadataName);
        if (inner != null) {
            return new HybridIdentityMetadataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<HybridIdentityMetadata> listByMachines(String resourceGroupName, String machineName) {
        PagedIterable<HybridIdentityMetadataInner> inner =
            this.serviceClient().listByMachines(resourceGroupName, machineName);
        return Utils.mapPage(inner, inner1 -> new HybridIdentityMetadataImpl(inner1, this.manager()));
    }

    public PagedIterable<HybridIdentityMetadata> listByMachines(
        String resourceGroupName, String machineName, Context context) {
        PagedIterable<HybridIdentityMetadataInner> inner =
            this.serviceClient().listByMachines(resourceGroupName, machineName, context);
        return Utils.mapPage(inner, inner1 -> new HybridIdentityMetadataImpl(inner1, this.manager()));
    }

    private HybridIdentityMetadatasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridcompute.HybridComputeManager manager() {
        return this.serviceManager;
    }
}
