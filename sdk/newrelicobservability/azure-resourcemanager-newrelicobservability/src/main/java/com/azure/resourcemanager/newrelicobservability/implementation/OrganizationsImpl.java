// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.newrelicobservability.fluent.OrganizationsClient;
import com.azure.resourcemanager.newrelicobservability.fluent.models.OrganizationResourceInner;
import com.azure.resourcemanager.newrelicobservability.models.OrganizationResource;
import com.azure.resourcemanager.newrelicobservability.models.Organizations;

public final class OrganizationsImpl implements Organizations {
    private static final ClientLogger LOGGER = new ClientLogger(OrganizationsImpl.class);

    private final OrganizationsClient innerClient;

    private final com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager;

    public OrganizationsImpl(OrganizationsClient innerClient,
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OrganizationResource> list(String userEmail, String location) {
        PagedIterable<OrganizationResourceInner> inner = this.serviceClient().list(userEmail, location);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OrganizationResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<OrganizationResource> list(String userEmail, String location, Context context) {
        PagedIterable<OrganizationResourceInner> inner = this.serviceClient().list(userEmail, location, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new OrganizationResourceImpl(inner1, this.manager()));
    }

    private OrganizationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager() {
        return this.serviceManager;
    }
}
