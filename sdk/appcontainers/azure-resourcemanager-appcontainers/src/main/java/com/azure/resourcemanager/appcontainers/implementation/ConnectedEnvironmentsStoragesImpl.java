// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ConnectedEnvironmentsStoragesClient;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentStorageInner;
import com.azure.resourcemanager.appcontainers.fluent.models.ConnectedEnvironmentStoragesCollectionInner;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentStorage;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentStoragesCollection;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentsStorages;

public final class ConnectedEnvironmentsStoragesImpl implements ConnectedEnvironmentsStorages {
    private static final ClientLogger LOGGER = new ClientLogger(ConnectedEnvironmentsStoragesImpl.class);

    private final ConnectedEnvironmentsStoragesClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ConnectedEnvironmentsStoragesImpl(ConnectedEnvironmentsStoragesClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ConnectedEnvironmentStoragesCollection> listWithResponse(String resourceGroupName,
        String connectedEnvironmentName, Context context) {
        Response<ConnectedEnvironmentStoragesCollectionInner> inner
            = this.serviceClient().listWithResponse(resourceGroupName, connectedEnvironmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ConnectedEnvironmentStoragesCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConnectedEnvironmentStoragesCollection list(String resourceGroupName, String connectedEnvironmentName) {
        ConnectedEnvironmentStoragesCollectionInner inner
            = this.serviceClient().list(resourceGroupName, connectedEnvironmentName);
        if (inner != null) {
            return new ConnectedEnvironmentStoragesCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConnectedEnvironmentStorage> getWithResponse(String resourceGroupName,
        String connectedEnvironmentName, String storageName, Context context) {
        Response<ConnectedEnvironmentStorageInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, connectedEnvironmentName, storageName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ConnectedEnvironmentStorageImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ConnectedEnvironmentStorage get(String resourceGroupName, String connectedEnvironmentName,
        String storageName) {
        ConnectedEnvironmentStorageInner inner
            = this.serviceClient().get(resourceGroupName, connectedEnvironmentName, storageName);
        if (inner != null) {
            return new ConnectedEnvironmentStorageImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String connectedEnvironmentName,
        String storageName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, connectedEnvironmentName, storageName,
            context);
    }

    public void delete(String resourceGroupName, String connectedEnvironmentName, String storageName) {
        this.serviceClient().delete(resourceGroupName, connectedEnvironmentName, storageName);
    }

    public ConnectedEnvironmentStorage getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String connectedEnvironmentName = ResourceManagerUtils.getValueFromIdByName(id, "connectedEnvironments");
        if (connectedEnvironmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connectedEnvironments'.", id)));
        }
        String storageName = ResourceManagerUtils.getValueFromIdByName(id, "storages");
        if (storageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storages'.", id)));
        }
        return this.getWithResponse(resourceGroupName, connectedEnvironmentName, storageName, Context.NONE).getValue();
    }

    public Response<ConnectedEnvironmentStorage> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String connectedEnvironmentName = ResourceManagerUtils.getValueFromIdByName(id, "connectedEnvironments");
        if (connectedEnvironmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connectedEnvironments'.", id)));
        }
        String storageName = ResourceManagerUtils.getValueFromIdByName(id, "storages");
        if (storageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storages'.", id)));
        }
        return this.getWithResponse(resourceGroupName, connectedEnvironmentName, storageName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String connectedEnvironmentName = ResourceManagerUtils.getValueFromIdByName(id, "connectedEnvironments");
        if (connectedEnvironmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connectedEnvironments'.", id)));
        }
        String storageName = ResourceManagerUtils.getValueFromIdByName(id, "storages");
        if (storageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storages'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, connectedEnvironmentName, storageName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String connectedEnvironmentName = ResourceManagerUtils.getValueFromIdByName(id, "connectedEnvironments");
        if (connectedEnvironmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'connectedEnvironments'.", id)));
        }
        String storageName = ResourceManagerUtils.getValueFromIdByName(id, "storages");
        if (storageName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'storages'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, connectedEnvironmentName, storageName, context);
    }

    private ConnectedEnvironmentsStoragesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    public ConnectedEnvironmentStorageImpl define(String name) {
        return new ConnectedEnvironmentStorageImpl(name, this.manager());
    }
}
