// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.fluent.BareMetalMachineKeySetsClient;
import com.azure.resourcemanager.networkcloud.fluent.models.BareMetalMachineKeySetInner;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineKeySet;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineKeySets;

public final class BareMetalMachineKeySetsImpl implements BareMetalMachineKeySets {
    private static final ClientLogger LOGGER = new ClientLogger(BareMetalMachineKeySetsImpl.class);

    private final BareMetalMachineKeySetsClient innerClient;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public BareMetalMachineKeySetsImpl(
        BareMetalMachineKeySetsClient innerClient,
        com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BareMetalMachineKeySet> listByResourceGroup(String resourceGroupName, String clusterName) {
        PagedIterable<BareMetalMachineKeySetInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineKeySetImpl(inner1, this.manager()));
    }

    public PagedIterable<BareMetalMachineKeySet> listByResourceGroup(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<BareMetalMachineKeySetInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new BareMetalMachineKeySetImpl(inner1, this.manager()));
    }

    public Response<BareMetalMachineKeySet> getWithResponse(
        String resourceGroupName, String clusterName, String bareMetalMachineKeySetName, Context context) {
        Response<BareMetalMachineKeySetInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterName, bareMetalMachineKeySetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BareMetalMachineKeySetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BareMetalMachineKeySet get(String resourceGroupName, String clusterName, String bareMetalMachineKeySetName) {
        BareMetalMachineKeySetInner inner =
            this.serviceClient().get(resourceGroupName, clusterName, bareMetalMachineKeySetName);
        if (inner != null) {
            return new BareMetalMachineKeySetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String bareMetalMachineKeySetName) {
        this.serviceClient().delete(resourceGroupName, clusterName, bareMetalMachineKeySetName);
    }

    public void delete(
        String resourceGroupName, String clusterName, String bareMetalMachineKeySetName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, bareMetalMachineKeySetName, context);
    }

    public BareMetalMachineKeySet getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String bareMetalMachineKeySetName = Utils.getValueFromIdByName(id, "bareMetalMachineKeySets");
        if (bareMetalMachineKeySetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachineKeySets'.",
                                id)));
        }
        return this
            .getWithResponse(resourceGroupName, clusterName, bareMetalMachineKeySetName, Context.NONE)
            .getValue();
    }

    public Response<BareMetalMachineKeySet> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String bareMetalMachineKeySetName = Utils.getValueFromIdByName(id, "bareMetalMachineKeySets");
        if (bareMetalMachineKeySetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachineKeySets'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, bareMetalMachineKeySetName, context);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String bareMetalMachineKeySetName = Utils.getValueFromIdByName(id, "bareMetalMachineKeySets");
        if (bareMetalMachineKeySetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachineKeySets'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, bareMetalMachineKeySetName, Context.NONE);
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
        String clusterName = Utils.getValueFromIdByName(id, "clusters");
        if (clusterName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'clusters'.", id)));
        }
        String bareMetalMachineKeySetName = Utils.getValueFromIdByName(id, "bareMetalMachineKeySets");
        if (bareMetalMachineKeySetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bareMetalMachineKeySets'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, bareMetalMachineKeySetName, context);
    }

    private BareMetalMachineKeySetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    public BareMetalMachineKeySetImpl define(String name) {
        return new BareMetalMachineKeySetImpl(name, this.manager());
    }
}
