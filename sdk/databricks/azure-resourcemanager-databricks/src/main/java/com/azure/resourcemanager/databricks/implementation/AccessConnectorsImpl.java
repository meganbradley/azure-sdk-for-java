// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databricks.fluent.AccessConnectorsClient;
import com.azure.resourcemanager.databricks.fluent.models.AccessConnectorInner;
import com.azure.resourcemanager.databricks.models.AccessConnector;
import com.azure.resourcemanager.databricks.models.AccessConnectors;

public final class AccessConnectorsImpl implements AccessConnectors {
    private static final ClientLogger LOGGER = new ClientLogger(AccessConnectorsImpl.class);

    private final AccessConnectorsClient innerClient;

    private final com.azure.resourcemanager.databricks.AzureDatabricksManager serviceManager;

    public AccessConnectorsImpl(
        AccessConnectorsClient innerClient,
        com.azure.resourcemanager.databricks.AzureDatabricksManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<AccessConnector> getByResourceGroupWithResponse(
        String resourceGroupName, String connectorName, Context context) {
        Response<AccessConnectorInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, connectorName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AccessConnectorImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AccessConnector getByResourceGroup(String resourceGroupName, String connectorName) {
        AccessConnectorInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, connectorName);
        if (inner != null) {
            return new AccessConnectorImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String connectorName) {
        this.serviceClient().delete(resourceGroupName, connectorName);
    }

    public void delete(String resourceGroupName, String connectorName, Context context) {
        this.serviceClient().delete(resourceGroupName, connectorName, context);
    }

    public PagedIterable<AccessConnector> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AccessConnectorInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AccessConnectorImpl(inner1, this.manager()));
    }

    public PagedIterable<AccessConnector> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AccessConnectorInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AccessConnectorImpl(inner1, this.manager()));
    }

    public PagedIterable<AccessConnector> list() {
        PagedIterable<AccessConnectorInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AccessConnectorImpl(inner1, this.manager()));
    }

    public PagedIterable<AccessConnector> list(Context context) {
        PagedIterable<AccessConnectorInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AccessConnectorImpl(inner1, this.manager()));
    }

    public AccessConnector getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String connectorName = Utils.getValueFromIdByName(id, "accessConnectors");
        if (connectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'accessConnectors'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, connectorName, Context.NONE).getValue();
    }

    public Response<AccessConnector> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String connectorName = Utils.getValueFromIdByName(id, "accessConnectors");
        if (connectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'accessConnectors'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, connectorName, context);
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
        String connectorName = Utils.getValueFromIdByName(id, "accessConnectors");
        if (connectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'accessConnectors'.", id)));
        }
        this.delete(resourceGroupName, connectorName, Context.NONE);
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
        String connectorName = Utils.getValueFromIdByName(id, "accessConnectors");
        if (connectorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'accessConnectors'.", id)));
        }
        this.delete(resourceGroupName, connectorName, context);
    }

    private AccessConnectorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.databricks.AzureDatabricksManager manager() {
        return this.serviceManager;
    }

    public AccessConnectorImpl define(String name) {
        return new AccessConnectorImpl(name, this.manager());
    }
}