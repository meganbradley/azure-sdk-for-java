// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.quantum.fluent.OfferingsClient;
import com.azure.resourcemanager.quantum.fluent.models.ProviderDescriptionInner;
import com.azure.resourcemanager.quantum.models.Offerings;
import com.azure.resourcemanager.quantum.models.ProviderDescription;

public final class OfferingsImpl implements Offerings {
    private static final ClientLogger LOGGER = new ClientLogger(OfferingsImpl.class);

    private final OfferingsClient innerClient;

    private final com.azure.resourcemanager.quantum.AzureQuantumManager serviceManager;

    public OfferingsImpl(OfferingsClient innerClient,
        com.azure.resourcemanager.quantum.AzureQuantumManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProviderDescription> list(String locationName) {
        PagedIterable<ProviderDescriptionInner> inner = this.serviceClient().list(locationName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProviderDescriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<ProviderDescription> list(String locationName, Context context) {
        PagedIterable<ProviderDescriptionInner> inner = this.serviceClient().list(locationName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProviderDescriptionImpl(inner1, this.manager()));
    }

    private OfferingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.quantum.AzureQuantumManager manager() {
        return this.serviceManager;
    }
}
