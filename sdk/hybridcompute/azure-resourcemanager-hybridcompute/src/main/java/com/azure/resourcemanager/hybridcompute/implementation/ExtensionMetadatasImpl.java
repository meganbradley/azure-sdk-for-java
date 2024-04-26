// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcompute.fluent.ExtensionMetadatasClient;
import com.azure.resourcemanager.hybridcompute.fluent.models.ExtensionValueInner;
import com.azure.resourcemanager.hybridcompute.models.ExtensionMetadatas;
import com.azure.resourcemanager.hybridcompute.models.ExtensionValue;

public final class ExtensionMetadatasImpl implements ExtensionMetadatas {
    private static final ClientLogger LOGGER = new ClientLogger(ExtensionMetadatasImpl.class);

    private final ExtensionMetadatasClient innerClient;

    private final com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager;

    public ExtensionMetadatasImpl(ExtensionMetadatasClient innerClient,
        com.azure.resourcemanager.hybridcompute.HybridComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ExtensionValue> getWithResponse(String location, String publisher, String extensionType,
        String version, Context context) {
        Response<ExtensionValueInner> inner
            = this.serviceClient().getWithResponse(location, publisher, extensionType, version, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExtensionValueImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExtensionValue get(String location, String publisher, String extensionType, String version) {
        ExtensionValueInner inner = this.serviceClient().get(location, publisher, extensionType, version);
        if (inner != null) {
            return new ExtensionValueImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ExtensionValue> list(String location, String publisher, String extensionType) {
        PagedIterable<ExtensionValueInner> inner = this.serviceClient().list(location, publisher, extensionType);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExtensionValueImpl(inner1, this.manager()));
    }

    public PagedIterable<ExtensionValue> list(String location, String publisher, String extensionType,
        Context context) {
        PagedIterable<ExtensionValueInner> inner
            = this.serviceClient().list(location, publisher, extensionType, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExtensionValueImpl(inner1, this.manager()));
    }

    private ExtensionMetadatasClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridcompute.HybridComputeManager manager() {
        return this.serviceManager;
    }
}
