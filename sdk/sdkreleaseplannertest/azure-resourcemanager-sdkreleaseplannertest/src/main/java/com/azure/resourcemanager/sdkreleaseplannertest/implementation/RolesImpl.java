// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.RolesClient;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.RoleInner;
import com.azure.resourcemanager.sdkreleaseplannertest.models.Role;
import com.azure.resourcemanager.sdkreleaseplannertest.models.Roles;

public final class RolesImpl implements Roles {
    private static final ClientLogger LOGGER = new ClientLogger(RolesImpl.class);

    private final RolesClient innerClient;

    private final com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager serviceManager;

    public RolesImpl(
        RolesClient innerClient, com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Role> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<RoleInner> inner = this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new RoleImpl(inner1, this.manager()));
    }

    public PagedIterable<Role> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName, Context context) {
        PagedIterable<RoleInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new RoleImpl(inner1, this.manager()));
    }

    public Response<Role> getWithResponse(String deviceName, String name, String resourceGroupName, Context context) {
        Response<RoleInner> inner = this.serviceClient().getWithResponse(deviceName, name, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RoleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Role get(String deviceName, String name, String resourceGroupName) {
        RoleInner inner = this.serviceClient().get(deviceName, name, resourceGroupName);
        if (inner != null) {
            return new RoleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Role createOrUpdate(String deviceName, String name, String resourceGroupName, RoleInner role) {
        RoleInner inner = this.serviceClient().createOrUpdate(deviceName, name, resourceGroupName, role);
        if (inner != null) {
            return new RoleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Role createOrUpdate(
        String deviceName, String name, String resourceGroupName, RoleInner role, Context context) {
        RoleInner inner = this.serviceClient().createOrUpdate(deviceName, name, resourceGroupName, role, context);
        if (inner != null) {
            return new RoleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String deviceName, String name, String resourceGroupName) {
        this.serviceClient().delete(deviceName, name, resourceGroupName);
    }

    public void delete(String deviceName, String name, String resourceGroupName, Context context) {
        this.serviceClient().delete(deviceName, name, resourceGroupName, context);
    }

    private RolesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }
}
