// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.fluent.SimsClient;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimInner;
import com.azure.resourcemanager.mobilenetwork.models.Sim;
import com.azure.resourcemanager.mobilenetwork.models.Sims;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SimsImpl implements Sims {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SimsImpl.class);

    private final SimsClient innerClient;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    public SimsImpl(
        SimsClient innerClient, com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void deleteByResourceGroup(String resourceGroupName, String simName) {
        this.serviceClient().delete(resourceGroupName, simName);
    }

    public void delete(String resourceGroupName, String simName, Context context) {
        this.serviceClient().delete(resourceGroupName, simName, context);
    }

    public Sim getByResourceGroup(String resourceGroupName, String simName) {
        SimInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, simName);
        if (inner != null) {
            return new SimImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Sim> getByResourceGroupWithResponse(String resourceGroupName, String simName, Context context) {
        Response<SimInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, simName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SimImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<Sim> list() {
        PagedIterable<SimInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new SimImpl(inner1, this.manager()));
    }

    public PagedIterable<Sim> list(Context context) {
        PagedIterable<SimInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new SimImpl(inner1, this.manager()));
    }

    public PagedIterable<Sim> listByResourceGroup(String resourceGroupName) {
        PagedIterable<SimInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new SimImpl(inner1, this.manager()));
    }

    public PagedIterable<Sim> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<SimInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new SimImpl(inner1, this.manager()));
    }

    public Sim getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simName = Utils.getValueFromIdByName(id, "sims");
        if (simName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sims'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, simName, Context.NONE).getValue();
    }

    public Response<Sim> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simName = Utils.getValueFromIdByName(id, "sims");
        if (simName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sims'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, simName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simName = Utils.getValueFromIdByName(id, "sims");
        if (simName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sims'.", id)));
        }
        this.delete(resourceGroupName, simName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String simName = Utils.getValueFromIdByName(id, "sims");
        if (simName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'sims'.", id)));
        }
        this.delete(resourceGroupName, simName, context);
    }

    private SimsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }

    public SimImpl define(String name) {
        return new SimImpl(name, this.manager());
    }
}
