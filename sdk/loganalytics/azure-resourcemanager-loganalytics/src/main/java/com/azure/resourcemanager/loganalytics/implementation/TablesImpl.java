// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loganalytics.fluent.TablesClient;
import com.azure.resourcemanager.loganalytics.fluent.models.TableInner;
import com.azure.resourcemanager.loganalytics.models.Table;
import com.azure.resourcemanager.loganalytics.models.Tables;

public final class TablesImpl implements Tables {
    private static final ClientLogger LOGGER = new ClientLogger(TablesImpl.class);

    private final TablesClient innerClient;

    private final com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager;

    public TablesImpl(
        TablesClient innerClient, com.azure.resourcemanager.loganalytics.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Table> listByWorkspace(String resourceGroupName, String workspaceName) {
        PagedIterable<TableInner> inner = this.serviceClient().listByWorkspace(resourceGroupName, workspaceName);
        return Utils.mapPage(inner, inner1 -> new TableImpl(inner1, this.manager()));
    }

    public PagedIterable<Table> listByWorkspace(String resourceGroupName, String workspaceName, Context context) {
        PagedIterable<TableInner> inner =
            this.serviceClient().listByWorkspace(resourceGroupName, workspaceName, context);
        return Utils.mapPage(inner, inner1 -> new TableImpl(inner1, this.manager()));
    }

    public Response<Table> getWithResponse(
        String resourceGroupName, String workspaceName, String tableName, Context context) {
        Response<TableInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, workspaceName, tableName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TableImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Table get(String resourceGroupName, String workspaceName, String tableName) {
        TableInner inner = this.serviceClient().get(resourceGroupName, workspaceName, tableName);
        if (inner != null) {
            return new TableImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String workspaceName, String tableName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, tableName);
    }

    public void delete(String resourceGroupName, String workspaceName, String tableName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, tableName, context);
    }

    public Response<Void> migrateWithResponse(
        String resourceGroupName, String workspaceName, String tableName, Context context) {
        return this.serviceClient().migrateWithResponse(resourceGroupName, workspaceName, tableName, context);
    }

    public void migrate(String resourceGroupName, String workspaceName, String tableName) {
        this.serviceClient().migrate(resourceGroupName, workspaceName, tableName);
    }

    public Response<Void> cancelSearchWithResponse(
        String resourceGroupName, String workspaceName, String tableName, Context context) {
        return this.serviceClient().cancelSearchWithResponse(resourceGroupName, workspaceName, tableName, context);
    }

    public void cancelSearch(String resourceGroupName, String workspaceName, String tableName) {
        this.serviceClient().cancelSearch(resourceGroupName, workspaceName, tableName);
    }

    public Table getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, tableName, Context.NONE).getValue();
    }

    public Response<Table> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, tableName, context);
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
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, tableName, Context.NONE);
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
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String tableName = Utils.getValueFromIdByName(id, "tables");
        if (tableName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tables'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, tableName, context);
    }

    private TablesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    public TableImpl define(String name) {
        return new TableImpl(name, this.manager());
    }
}
