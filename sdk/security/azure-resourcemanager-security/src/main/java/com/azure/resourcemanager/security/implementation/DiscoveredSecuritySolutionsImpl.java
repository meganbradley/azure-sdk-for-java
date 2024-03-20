// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.DiscoveredSecuritySolutionsClient;
import com.azure.resourcemanager.security.fluent.models.DiscoveredSecuritySolutionInner;
import com.azure.resourcemanager.security.models.DiscoveredSecuritySolution;
import com.azure.resourcemanager.security.models.DiscoveredSecuritySolutions;

public final class DiscoveredSecuritySolutionsImpl implements DiscoveredSecuritySolutions {
    private static final ClientLogger LOGGER = new ClientLogger(DiscoveredSecuritySolutionsImpl.class);

    private final DiscoveredSecuritySolutionsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public DiscoveredSecuritySolutionsImpl(DiscoveredSecuritySolutionsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DiscoveredSecuritySolution> list() {
        PagedIterable<DiscoveredSecuritySolutionInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new DiscoveredSecuritySolutionImpl(inner1, this.manager()));
    }

    public PagedIterable<DiscoveredSecuritySolution> list(Context context) {
        PagedIterable<DiscoveredSecuritySolutionInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new DiscoveredSecuritySolutionImpl(inner1, this.manager()));
    }

    public PagedIterable<DiscoveredSecuritySolution> listByHomeRegion(String ascLocation) {
        PagedIterable<DiscoveredSecuritySolutionInner> inner = this.serviceClient().listByHomeRegion(ascLocation);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new DiscoveredSecuritySolutionImpl(inner1, this.manager()));
    }

    public PagedIterable<DiscoveredSecuritySolution> listByHomeRegion(String ascLocation, Context context) {
        PagedIterable<DiscoveredSecuritySolutionInner> inner
            = this.serviceClient().listByHomeRegion(ascLocation, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new DiscoveredSecuritySolutionImpl(inner1, this.manager()));
    }

    public Response<DiscoveredSecuritySolution> getWithResponse(String resourceGroupName, String ascLocation,
        String discoveredSecuritySolutionName, Context context) {
        Response<DiscoveredSecuritySolutionInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            ascLocation, discoveredSecuritySolutionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DiscoveredSecuritySolutionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DiscoveredSecuritySolution get(String resourceGroupName, String ascLocation,
        String discoveredSecuritySolutionName) {
        DiscoveredSecuritySolutionInner inner
            = this.serviceClient().get(resourceGroupName, ascLocation, discoveredSecuritySolutionName);
        if (inner != null) {
            return new DiscoveredSecuritySolutionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private DiscoveredSecuritySolutionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
