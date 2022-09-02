// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.devcenter.fluent.ProjectsClient;
import com.azure.resourcemanager.devcenter.fluent.models.ProjectInner;
import com.azure.resourcemanager.devcenter.models.Project;
import com.azure.resourcemanager.devcenter.models.Projects;

public final class ProjectsImpl implements Projects {
    private static final ClientLogger LOGGER = new ClientLogger(ProjectsImpl.class);

    private final ProjectsClient innerClient;

    private final com.azure.resourcemanager.devcenter.DevCenterManager serviceManager;

    public ProjectsImpl(
        ProjectsClient innerClient, com.azure.resourcemanager.devcenter.DevCenterManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Project> list() {
        PagedIterable<ProjectInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ProjectImpl(inner1, this.manager()));
    }

    public PagedIterable<Project> list(Integer top, Context context) {
        PagedIterable<ProjectInner> inner = this.serviceClient().list(top, context);
        return Utils.mapPage(inner, inner1 -> new ProjectImpl(inner1, this.manager()));
    }

    public PagedIterable<Project> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ProjectInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ProjectImpl(inner1, this.manager()));
    }

    public PagedIterable<Project> listByResourceGroup(String resourceGroupName, Integer top, Context context) {
        PagedIterable<ProjectInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, top, context);
        return Utils.mapPage(inner, inner1 -> new ProjectImpl(inner1, this.manager()));
    }

    public Project getByResourceGroup(String resourceGroupName, String projectName) {
        ProjectInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, projectName);
        if (inner != null) {
            return new ProjectImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Project> getByResourceGroupWithResponse(
        String resourceGroupName, String projectName, Context context) {
        Response<ProjectInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, projectName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProjectImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String projectName) {
        this.serviceClient().delete(resourceGroupName, projectName);
    }

    public void delete(String resourceGroupName, String projectName, Context context) {
        this.serviceClient().delete(resourceGroupName, projectName, context);
    }

    public Project getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, projectName, Context.NONE).getValue();
    }

    public Response<Project> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, projectName, context);
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
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        this.delete(resourceGroupName, projectName, Context.NONE);
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
        String projectName = Utils.getValueFromIdByName(id, "projects");
        if (projectName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'projects'.", id)));
        }
        this.delete(resourceGroupName, projectName, context);
    }

    private ProjectsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.devcenter.DevCenterManager manager() {
        return this.serviceManager;
    }

    public ProjectImpl define(String name) {
        return new ProjectImpl(name, this.manager());
    }
}
