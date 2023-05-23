// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.FirewallStatusClient;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FirewallStatusResourceInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FirewallStatus;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FirewallStatusResource;

public final class FirewallStatusImpl implements FirewallStatus {
    private static final ClientLogger LOGGER = new ClientLogger(FirewallStatusImpl.class);

    private final FirewallStatusClient innerClient;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    public FirewallStatusImpl(
        FirewallStatusClient innerClient,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FirewallStatusResource> listByFirewalls(String resourceGroupName, String firewallName) {
        PagedIterable<FirewallStatusResourceInner> inner =
            this.serviceClient().listByFirewalls(resourceGroupName, firewallName);
        return Utils.mapPage(inner, inner1 -> new FirewallStatusResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<FirewallStatusResource> listByFirewalls(
        String resourceGroupName, String firewallName, Context context) {
        PagedIterable<FirewallStatusResourceInner> inner =
            this.serviceClient().listByFirewalls(resourceGroupName, firewallName, context);
        return Utils.mapPage(inner, inner1 -> new FirewallStatusResourceImpl(inner1, this.manager()));
    }

    public Response<FirewallStatusResource> getWithResponse(
        String resourceGroupName, String firewallName, Context context) {
        Response<FirewallStatusResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, firewallName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FirewallStatusResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FirewallStatusResource get(String resourceGroupName, String firewallName) {
        FirewallStatusResourceInner inner = this.serviceClient().get(resourceGroupName, firewallName);
        if (inner != null) {
            return new FirewallStatusResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private FirewallStatusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }
}
