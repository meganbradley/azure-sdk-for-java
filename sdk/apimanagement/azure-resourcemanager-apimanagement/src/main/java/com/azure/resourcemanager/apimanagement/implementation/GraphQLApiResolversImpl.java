// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.GraphQLApiResolversClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ResolverContractInner;
import com.azure.resourcemanager.apimanagement.models.GraphQLApiResolvers;
import com.azure.resourcemanager.apimanagement.models.GraphQLApiResolversGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.GraphQLApiResolversGetResponse;
import com.azure.resourcemanager.apimanagement.models.ResolverContract;

public final class GraphQLApiResolversImpl implements GraphQLApiResolvers {
    private static final ClientLogger LOGGER = new ClientLogger(GraphQLApiResolversImpl.class);

    private final GraphQLApiResolversClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public GraphQLApiResolversImpl(
        GraphQLApiResolversClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResolverContract> listByApi(String resourceGroupName, String serviceName, String apiId) {
        PagedIterable<ResolverContractInner> inner =
            this.serviceClient().listByApi(resourceGroupName, serviceName, apiId);
        return Utils.mapPage(inner, inner1 -> new ResolverContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ResolverContract> listByApi(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<ResolverContractInner> inner =
            this.serviceClient().listByApi(resourceGroupName, serviceName, apiId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new ResolverContractImpl(inner1, this.manager()));
    }

    public GraphQLApiResolversGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String apiId, String resolverId, Context context) {
        return this
            .serviceClient()
            .getEntityTagWithResponse(resourceGroupName, serviceName, apiId, resolverId, context);
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String apiId, String resolverId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, apiId, resolverId);
    }

    public Response<ResolverContract> getWithResponse(
        String resourceGroupName, String serviceName, String apiId, String resolverId, Context context) {
        GraphQLApiResolversGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, apiId, resolverId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ResolverContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ResolverContract get(String resourceGroupName, String serviceName, String apiId, String resolverId) {
        ResolverContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, apiId, resolverId);
        if (inner != null) {
            return new ResolverContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String resolverId,
        String ifMatch,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, serviceName, apiId, resolverId, ifMatch, context);
    }

    public void delete(String resourceGroupName, String serviceName, String apiId, String resolverId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, apiId, resolverId, ifMatch);
    }

    public ResolverContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String resolverId = Utils.getValueFromIdByName(id, "resolvers");
        if (resolverId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resolvers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, apiId, resolverId, Context.NONE).getValue();
    }

    public Response<ResolverContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String resolverId = Utils.getValueFromIdByName(id, "resolvers");
        if (resolverId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resolvers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, apiId, resolverId, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String resolverId = Utils.getValueFromIdByName(id, "resolvers");
        if (resolverId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resolvers'.", id)));
        }
        String localIfMatch = null;
        this.deleteWithResponse(resourceGroupName, serviceName, apiId, resolverId, localIfMatch, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String apiId = Utils.getValueFromIdByName(id, "apis");
        if (apiId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'apis'.", id)));
        }
        String resolverId = Utils.getValueFromIdByName(id, "resolvers");
        if (resolverId == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'resolvers'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceName, apiId, resolverId, ifMatch, context);
    }

    private GraphQLApiResolversClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public ResolverContractImpl define(String name) {
        return new ResolverContractImpl(name, this.manager());
    }
}
