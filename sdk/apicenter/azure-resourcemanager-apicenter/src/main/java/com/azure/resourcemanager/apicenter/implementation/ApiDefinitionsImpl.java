// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apicenter.fluent.ApiDefinitionsClient;
import com.azure.resourcemanager.apicenter.fluent.models.ApiDefinitionInner;
import com.azure.resourcemanager.apicenter.fluent.models.ApiSpecExportResultInner;
import com.azure.resourcemanager.apicenter.models.ApiDefinition;
import com.azure.resourcemanager.apicenter.models.ApiDefinitions;
import com.azure.resourcemanager.apicenter.models.ApiDefinitionsGetResponse;
import com.azure.resourcemanager.apicenter.models.ApiSpecExportResult;
import com.azure.resourcemanager.apicenter.models.ApiSpecImportRequest;

public final class ApiDefinitionsImpl implements ApiDefinitions {
    private static final ClientLogger LOGGER = new ClientLogger(ApiDefinitionsImpl.class);

    private final ApiDefinitionsClient innerClient;

    private final com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager;

    public ApiDefinitionsImpl(ApiDefinitionsClient innerClient,
        com.azure.resourcemanager.apicenter.ApiCenterManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ApiDefinition> list(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName) {
        PagedIterable<ApiDefinitionInner> inner
            = this.serviceClient().list(resourceGroupName, serviceName, workspaceName, apiName, versionName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApiDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ApiDefinition> list(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String filter, Context context) {
        PagedIterable<ApiDefinitionInner> inner = this.serviceClient().list(resourceGroupName, serviceName,
            workspaceName, apiName, versionName, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ApiDefinitionImpl(inner1, this.manager()));
    }

    public Response<ApiDefinition> getWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName, Context context) {
        ApiDefinitionsGetResponse inner = this.serviceClient().getWithResponse(resourceGroupName, serviceName,
            workspaceName, apiName, versionName, definitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ApiDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ApiDefinition get(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String versionName, String definitionName) {
        ApiDefinitionInner inner = this.serviceClient().get(resourceGroupName, serviceName, workspaceName, apiName,
            versionName, definitionName);
        if (inner != null) {
            return new ApiDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, workspaceName, apiName,
            versionName, definitionName, context);
    }

    public void delete(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String versionName, String definitionName) {
        this.serviceClient().delete(resourceGroupName, serviceName, workspaceName, apiName, versionName,
            definitionName);
    }

    public Response<Void> headWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName, Context context) {
        return this.serviceClient().headWithResponse(resourceGroupName, serviceName, workspaceName, apiName,
            versionName, definitionName, context);
    }

    public void head(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String versionName, String definitionName) {
        this.serviceClient().head(resourceGroupName, serviceName, workspaceName, apiName, versionName, definitionName);
    }

    public ApiSpecExportResult exportSpecification(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName) {
        ApiSpecExportResultInner inner = this.serviceClient().exportSpecification(resourceGroupName, serviceName,
            workspaceName, apiName, versionName, definitionName);
        if (inner != null) {
            return new ApiSpecExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ApiSpecExportResult exportSpecification(String resourceGroupName, String serviceName, String workspaceName,
        String apiName, String versionName, String definitionName, Context context) {
        ApiSpecExportResultInner inner = this.serviceClient().exportSpecification(resourceGroupName, serviceName,
            workspaceName, apiName, versionName, definitionName, context);
        if (inner != null) {
            return new ApiSpecExportResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void importSpecification(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String versionName, String definitionName, ApiSpecImportRequest body) {
        this.serviceClient().importSpecification(resourceGroupName, serviceName, workspaceName, apiName, versionName,
            definitionName, body);
    }

    public void importSpecification(String resourceGroupName, String serviceName, String workspaceName, String apiName,
        String versionName, String definitionName, ApiSpecImportRequest body, Context context) {
        this.serviceClient().importSpecification(resourceGroupName, serviceName, workspaceName, apiName, versionName,
            definitionName, body, context);
    }

    public ApiDefinition getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String apiName = ResourceManagerUtils.getValueFromIdByName(id, "apis");
        if (apiName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String versionName = ResourceManagerUtils.getValueFromIdByName(id, "versions");
        if (versionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        String definitionName = ResourceManagerUtils.getValueFromIdByName(id, "definitions");
        if (definitionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'definitions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, workspaceName, apiName, versionName, definitionName,
            Context.NONE).getValue();
    }

    public Response<ApiDefinition> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String apiName = ResourceManagerUtils.getValueFromIdByName(id, "apis");
        if (apiName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String versionName = ResourceManagerUtils.getValueFromIdByName(id, "versions");
        if (versionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        String definitionName = ResourceManagerUtils.getValueFromIdByName(id, "definitions");
        if (definitionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'definitions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, workspaceName, apiName, versionName, definitionName,
            context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String apiName = ResourceManagerUtils.getValueFromIdByName(id, "apis");
        if (apiName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String versionName = ResourceManagerUtils.getValueFromIdByName(id, "versions");
        if (versionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        String definitionName = ResourceManagerUtils.getValueFromIdByName(id, "definitions");
        if (definitionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'definitions'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, serviceName, workspaceName, apiName, versionName, definitionName,
            Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = ResourceManagerUtils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String workspaceName = ResourceManagerUtils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String apiName = ResourceManagerUtils.getValueFromIdByName(id, "apis");
        if (apiName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String versionName = ResourceManagerUtils.getValueFromIdByName(id, "versions");
        if (versionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'versions'.", id)));
        }
        String definitionName = ResourceManagerUtils.getValueFromIdByName(id, "definitions");
        if (definitionName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'definitions'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, workspaceName, apiName, versionName,
            definitionName, context);
    }

    private ApiDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apicenter.ApiCenterManager manager() {
        return this.serviceManager;
    }

    public ApiDefinitionImpl define(String name) {
        return new ApiDefinitionImpl(name, this.manager());
    }
}
