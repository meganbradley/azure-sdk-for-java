// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.fluent.InternetGatewaysClient;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayInner;
import com.azure.resourcemanager.managednetworkfabric.models.InternetGateway;
import com.azure.resourcemanager.managednetworkfabric.models.InternetGateways;

public final class InternetGatewaysImpl implements InternetGateways {
    private static final ClientLogger LOGGER = new ClientLogger(InternetGatewaysImpl.class);

    private final InternetGatewaysClient innerClient;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public InternetGatewaysImpl(
        InternetGatewaysClient innerClient,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<InternetGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String internetGatewayName, Context context) {
        Response<InternetGatewayInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, internetGatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new InternetGatewayImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public InternetGateway getByResourceGroup(String resourceGroupName, String internetGatewayName) {
        InternetGatewayInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, internetGatewayName);
        if (inner != null) {
            return new InternetGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String internetGatewayName) {
        this.serviceClient().delete(resourceGroupName, internetGatewayName);
    }

    public void delete(String resourceGroupName, String internetGatewayName, Context context) {
        this.serviceClient().delete(resourceGroupName, internetGatewayName, context);
    }

    public PagedIterable<InternetGateway> listByResourceGroup(String resourceGroupName) {
        PagedIterable<InternetGatewayInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new InternetGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<InternetGateway> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<InternetGatewayInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new InternetGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<InternetGateway> list() {
        PagedIterable<InternetGatewayInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new InternetGatewayImpl(inner1, this.manager()));
    }

    public PagedIterable<InternetGateway> list(Context context) {
        PagedIterable<InternetGatewayInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new InternetGatewayImpl(inner1, this.manager()));
    }

    public InternetGateway getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String internetGatewayName = Utils.getValueFromIdByName(id, "internetGateways");
        if (internetGatewayName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'internetGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, internetGatewayName, Context.NONE).getValue();
    }

    public Response<InternetGateway> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String internetGatewayName = Utils.getValueFromIdByName(id, "internetGateways");
        if (internetGatewayName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'internetGateways'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, internetGatewayName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String internetGatewayName = Utils.getValueFromIdByName(id, "internetGateways");
        if (internetGatewayName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'internetGateways'.", id)));
        }
        this.delete(resourceGroupName, internetGatewayName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String internetGatewayName = Utils.getValueFromIdByName(id, "internetGateways");
        if (internetGatewayName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'internetGateways'.", id)));
        }
        this.delete(resourceGroupName, internetGatewayName, context);
    }

    private InternetGatewaysClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    public InternetGatewayImpl define(String name) {
        return new InternetGatewayImpl(name, this.manager());
    }
}
