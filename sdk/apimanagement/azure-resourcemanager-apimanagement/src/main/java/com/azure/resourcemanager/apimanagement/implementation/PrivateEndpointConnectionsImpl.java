// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.apimanagement.models.PrivateEndpointConnection;
import com.azure.resourcemanager.apimanagement.models.PrivateEndpointConnections;
import com.azure.resourcemanager.apimanagement.models.PrivateLinkResource;
import com.azure.resourcemanager.apimanagement.models.PrivateLinkResourceListResult;

public final class PrivateEndpointConnectionsImpl implements PrivateEndpointConnections {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateEndpointConnectionsImpl.class);

    private final PrivateEndpointConnectionsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public PrivateEndpointConnectionsImpl(
        PrivateEndpointConnectionsClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PrivateEndpointConnection> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> listByService(
        String resourceGroupName, String serviceName, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public Response<PrivateEndpointConnection> getByNameWithResponse(
        String resourceGroupName, String serviceName, String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getByNameWithResponse(resourceGroupName, serviceName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection getByName(
        String resourceGroupName, String serviceName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this.serviceClient().getByName(resourceGroupName, serviceName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String privateEndpointConnectionName) {
        this.serviceClient().delete(resourceGroupName, serviceName, privateEndpointConnectionName);
    }

    public void delete(
        String resourceGroupName, String serviceName, String privateEndpointConnectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, serviceName, privateEndpointConnectionName, context);
    }

    public Response<PrivateLinkResourceListResult> listPrivateLinkResourcesWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        Response<PrivateLinkResourceListResultInner> inner =
            this.serviceClient().listPrivateLinkResourcesWithResponse(resourceGroupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResourceListResult listPrivateLinkResources(String resourceGroupName, String serviceName) {
        PrivateLinkResourceListResultInner inner =
            this.serviceClient().listPrivateLinkResources(resourceGroupName, serviceName);
        if (inner != null) {
            return new PrivateLinkResourceListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResource> getPrivateLinkResourceWithResponse(
        String resourceGroupName, String serviceName, String privateLinkSubResourceName, Context context) {
        Response<PrivateLinkResourceInner> inner =
            this
                .serviceClient()
                .getPrivateLinkResourceWithResponse(
                    resourceGroupName, serviceName, privateLinkSubResourceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateLinkResource getPrivateLinkResource(
        String resourceGroupName, String serviceName, String privateLinkSubResourceName) {
        PrivateLinkResourceInner inner =
            this.serviceClient().getPrivateLinkResource(resourceGroupName, serviceName, privateLinkSubResourceName);
        if (inner != null) {
            return new PrivateLinkResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this
            .getByNameWithResponse(resourceGroupName, serviceName, privateEndpointConnectionName, Context.NONE)
            .getValue();
    }

    public Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        return this.getByNameWithResponse(resourceGroupName, serviceName, privateEndpointConnectionName, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        this.delete(resourceGroupName, serviceName, privateEndpointConnectionName, Context.NONE);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String privateEndpointConnectionName = Utils.getValueFromIdByName(id, "privateEndpointConnections");
        if (privateEndpointConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'privateEndpointConnections'.",
                                id)));
        }
        this.delete(resourceGroupName, serviceName, privateEndpointConnectionName, context);
    }

    private PrivateEndpointConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public PrivateEndpointConnectionImpl define(String name) {
        return new PrivateEndpointConnectionImpl(name, this.manager());
    }
}
