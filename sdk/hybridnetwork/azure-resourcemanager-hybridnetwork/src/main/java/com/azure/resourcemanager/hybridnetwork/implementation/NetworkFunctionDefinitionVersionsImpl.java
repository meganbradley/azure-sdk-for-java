// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.fluent.NetworkFunctionDefinitionVersionsClient;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionDefinitionVersionInner;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionDefinitionVersionUpdateStateInner;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionDefinitionVersion;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionDefinitionVersionUpdateState;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionDefinitionVersions;

public final class NetworkFunctionDefinitionVersionsImpl implements NetworkFunctionDefinitionVersions {
    private static final ClientLogger LOGGER = new ClientLogger(NetworkFunctionDefinitionVersionsImpl.class);

    private final NetworkFunctionDefinitionVersionsClient innerClient;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

    public NetworkFunctionDefinitionVersionsImpl(NetworkFunctionDefinitionVersionsClient innerClient,
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String publisherName, String networkFunctionDefinitionGroupName,
        String networkFunctionDefinitionVersionName) {
        this.serviceClient().delete(resourceGroupName, publisherName, networkFunctionDefinitionGroupName,
            networkFunctionDefinitionVersionName);
    }

    public void delete(String resourceGroupName, String publisherName, String networkFunctionDefinitionGroupName,
        String networkFunctionDefinitionVersionName, Context context) {
        this.serviceClient().delete(resourceGroupName, publisherName, networkFunctionDefinitionGroupName,
            networkFunctionDefinitionVersionName, context);
    }

    public Response<NetworkFunctionDefinitionVersion> getWithResponse(String resourceGroupName, String publisherName,
        String networkFunctionDefinitionGroupName, String networkFunctionDefinitionVersionName, Context context) {
        Response<NetworkFunctionDefinitionVersionInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            publisherName, networkFunctionDefinitionGroupName, networkFunctionDefinitionVersionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NetworkFunctionDefinitionVersionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkFunctionDefinitionVersion get(String resourceGroupName, String publisherName,
        String networkFunctionDefinitionGroupName, String networkFunctionDefinitionVersionName) {
        NetworkFunctionDefinitionVersionInner inner = this.serviceClient().get(resourceGroupName, publisherName,
            networkFunctionDefinitionGroupName, networkFunctionDefinitionVersionName);
        if (inner != null) {
            return new NetworkFunctionDefinitionVersionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkFunctionDefinitionVersion> listByNetworkFunctionDefinitionGroup(
        String resourceGroupName, String publisherName, String networkFunctionDefinitionGroupName) {
        PagedIterable<NetworkFunctionDefinitionVersionInner> inner = this.serviceClient()
            .listByNetworkFunctionDefinitionGroup(resourceGroupName, publisherName, networkFunctionDefinitionGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkFunctionDefinitionVersionImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkFunctionDefinitionVersion> listByNetworkFunctionDefinitionGroup(
        String resourceGroupName, String publisherName, String networkFunctionDefinitionGroupName, Context context) {
        PagedIterable<NetworkFunctionDefinitionVersionInner> inner
            = this.serviceClient().listByNetworkFunctionDefinitionGroup(resourceGroupName, publisherName,
                networkFunctionDefinitionGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkFunctionDefinitionVersionImpl(inner1, this.manager()));
    }

    public NetworkFunctionDefinitionVersionUpdateState updateState(String resourceGroupName, String publisherName,
        String networkFunctionDefinitionGroupName, String networkFunctionDefinitionVersionName,
        NetworkFunctionDefinitionVersionUpdateStateInner parameters) {
        NetworkFunctionDefinitionVersionUpdateStateInner inner = this.serviceClient().updateState(resourceGroupName,
            publisherName, networkFunctionDefinitionGroupName, networkFunctionDefinitionVersionName, parameters);
        if (inner != null) {
            return new NetworkFunctionDefinitionVersionUpdateStateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkFunctionDefinitionVersionUpdateState updateState(String resourceGroupName, String publisherName,
        String networkFunctionDefinitionGroupName, String networkFunctionDefinitionVersionName,
        NetworkFunctionDefinitionVersionUpdateStateInner parameters, Context context) {
        NetworkFunctionDefinitionVersionUpdateStateInner inner
            = this.serviceClient().updateState(resourceGroupName, publisherName, networkFunctionDefinitionGroupName,
                networkFunctionDefinitionVersionName, parameters, context);
        if (inner != null) {
            return new NetworkFunctionDefinitionVersionUpdateStateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkFunctionDefinitionVersion getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publisherName = Utils.getValueFromIdByName(id, "publishers");
        if (publisherName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'publishers'.", id)));
        }
        String networkFunctionDefinitionGroupName = Utils.getValueFromIdByName(id, "networkFunctionDefinitionGroups");
        if (networkFunctionDefinitionGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'networkFunctionDefinitionGroups'.", id)));
        }
        String networkFunctionDefinitionVersionName
            = Utils.getValueFromIdByName(id, "networkFunctionDefinitionVersions");
        if (networkFunctionDefinitionVersionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'networkFunctionDefinitionVersions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, publisherName, networkFunctionDefinitionGroupName,
            networkFunctionDefinitionVersionName, Context.NONE).getValue();
    }

    public Response<NetworkFunctionDefinitionVersion> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publisherName = Utils.getValueFromIdByName(id, "publishers");
        if (publisherName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'publishers'.", id)));
        }
        String networkFunctionDefinitionGroupName = Utils.getValueFromIdByName(id, "networkFunctionDefinitionGroups");
        if (networkFunctionDefinitionGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'networkFunctionDefinitionGroups'.", id)));
        }
        String networkFunctionDefinitionVersionName
            = Utils.getValueFromIdByName(id, "networkFunctionDefinitionVersions");
        if (networkFunctionDefinitionVersionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'networkFunctionDefinitionVersions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, publisherName, networkFunctionDefinitionGroupName,
            networkFunctionDefinitionVersionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publisherName = Utils.getValueFromIdByName(id, "publishers");
        if (publisherName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'publishers'.", id)));
        }
        String networkFunctionDefinitionGroupName = Utils.getValueFromIdByName(id, "networkFunctionDefinitionGroups");
        if (networkFunctionDefinitionGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'networkFunctionDefinitionGroups'.", id)));
        }
        String networkFunctionDefinitionVersionName
            = Utils.getValueFromIdByName(id, "networkFunctionDefinitionVersions");
        if (networkFunctionDefinitionVersionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'networkFunctionDefinitionVersions'.", id)));
        }
        this.delete(resourceGroupName, publisherName, networkFunctionDefinitionGroupName,
            networkFunctionDefinitionVersionName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String publisherName = Utils.getValueFromIdByName(id, "publishers");
        if (publisherName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'publishers'.", id)));
        }
        String networkFunctionDefinitionGroupName = Utils.getValueFromIdByName(id, "networkFunctionDefinitionGroups");
        if (networkFunctionDefinitionGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'networkFunctionDefinitionGroups'.", id)));
        }
        String networkFunctionDefinitionVersionName
            = Utils.getValueFromIdByName(id, "networkFunctionDefinitionVersions");
        if (networkFunctionDefinitionVersionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'networkFunctionDefinitionVersions'.", id)));
        }
        this.delete(resourceGroupName, publisherName, networkFunctionDefinitionGroupName,
            networkFunctionDefinitionVersionName, context);
    }

    private NetworkFunctionDefinitionVersionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkFunctionDefinitionVersionImpl define(String name) {
        return new NetworkFunctionDefinitionVersionImpl(name, this.manager());
    }
}
