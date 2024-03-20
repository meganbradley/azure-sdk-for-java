// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ConnectedEnvironmentsDaprComponentsClient;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprComponentInner;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprSecretsCollectionInner;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentsDaprComponents;
import com.azure.resourcemanager.appcontainers.models.DaprComponent;
import com.azure.resourcemanager.appcontainers.models.DaprSecretsCollection;

public final class ConnectedEnvironmentsDaprComponentsImpl implements ConnectedEnvironmentsDaprComponents {
    private static final ClientLogger LOGGER = new ClientLogger(ConnectedEnvironmentsDaprComponentsImpl.class);

    private final ConnectedEnvironmentsDaprComponentsClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ConnectedEnvironmentsDaprComponentsImpl(ConnectedEnvironmentsDaprComponentsClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<DaprComponent> list(String resourceGroupName, String connectedEnvironmentName) {
        PagedIterable<DaprComponentInner> inner
            = this.serviceClient().list(resourceGroupName, connectedEnvironmentName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DaprComponentImpl(inner1, this.manager()));
    }

    public PagedIterable<DaprComponent> list(String resourceGroupName, String connectedEnvironmentName,
        Context context) {
        PagedIterable<DaprComponentInner> inner
            = this.serviceClient().list(resourceGroupName, connectedEnvironmentName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new DaprComponentImpl(inner1, this.manager()));
    }

    public Response<DaprComponent> getWithResponse(String resourceGroupName, String connectedEnvironmentName,
        String componentName, Context context) {
        Response<DaprComponentInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, connectedEnvironmentName, componentName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DaprComponentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DaprComponent get(String resourceGroupName, String connectedEnvironmentName, String componentName) {
        DaprComponentInner inner = this.serviceClient().get(resourceGroupName, connectedEnvironmentName, componentName);
        if (inner != null) {
            return new DaprComponentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String connectedEnvironmentName,
        String componentName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, connectedEnvironmentName, componentName,
            context);
    }

    public void delete(String resourceGroupName, String connectedEnvironmentName, String componentName) {
        this.serviceClient().delete(resourceGroupName, connectedEnvironmentName, componentName);
    }

    public Response<DaprSecretsCollection> listSecretsWithResponse(String resourceGroupName,
        String connectedEnvironmentName, String componentName, Context context) {
        Response<DaprSecretsCollectionInner> inner = this.serviceClient().listSecretsWithResponse(resourceGroupName,
            connectedEnvironmentName, componentName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DaprSecretsCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DaprSecretsCollection listSecrets(String resourceGroupName, String connectedEnvironmentName,
        String componentName) {
        DaprSecretsCollectionInner inner
            = this.serviceClient().listSecrets(resourceGroupName, connectedEnvironmentName, componentName);
        if (inner != null) {
            return new DaprSecretsCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DaprComponent getById(String id) {
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
        String componentName = ResourceManagerUtils.getValueFromIdByName(id, "daprComponents");
        if (componentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'daprComponents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, connectedEnvironmentName, componentName, Context.NONE)
            .getValue();
    }

    public Response<DaprComponent> getByIdWithResponse(String id, Context context) {
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
        String componentName = ResourceManagerUtils.getValueFromIdByName(id, "daprComponents");
        if (componentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'daprComponents'.", id)));
        }
        return this.getWithResponse(resourceGroupName, connectedEnvironmentName, componentName, context);
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
        String componentName = ResourceManagerUtils.getValueFromIdByName(id, "daprComponents");
        if (componentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'daprComponents'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, connectedEnvironmentName, componentName, Context.NONE);
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
        String componentName = ResourceManagerUtils.getValueFromIdByName(id, "daprComponents");
        if (componentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'daprComponents'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, connectedEnvironmentName, componentName, context);
    }

    private ConnectedEnvironmentsDaprComponentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    public DaprComponentImpl define(String name) {
        return new DaprComponentImpl(name, this.manager());
    }
}
