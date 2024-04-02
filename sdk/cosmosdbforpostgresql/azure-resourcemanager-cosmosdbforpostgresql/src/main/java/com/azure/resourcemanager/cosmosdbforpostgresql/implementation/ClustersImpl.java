// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.ClustersClient;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.ClusterInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.NameAvailabilityInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.Cluster;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.Clusters;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.NameAvailability;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.NameAvailabilityRequest;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.PromoteRequest;

public final class ClustersImpl implements Clusters {
    private static final ClientLogger LOGGER = new ClientLogger(ClustersImpl.class);

    private final ClustersClient innerClient;

    private final com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager;

    public ClustersImpl(ClustersClient innerClient,
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Cluster> list() {
        PagedIterable<ClusterInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> list(Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public PagedIterable<Cluster> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ClusterInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ClusterImpl(inner1, this.manager()));
    }

    public Response<Cluster> getByResourceGroupWithResponse(String resourceGroupName, String clusterName,
        Context context) {
        Response<ClusterInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ClusterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Cluster getByResourceGroup(String resourceGroupName, String clusterName) {
        ClusterInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, clusterName);
        if (inner != null) {
            return new ClusterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String clusterName) {
        this.serviceClient().delete(resourceGroupName, clusterName);
    }

    public void delete(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, context);
    }

    public void restart(String resourceGroupName, String clusterName) {
        this.serviceClient().restart(resourceGroupName, clusterName);
    }

    public void restart(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().restart(resourceGroupName, clusterName, context);
    }

    public void start(String resourceGroupName, String clusterName) {
        this.serviceClient().start(resourceGroupName, clusterName);
    }

    public void start(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().start(resourceGroupName, clusterName, context);
    }

    public void stop(String resourceGroupName, String clusterName) {
        this.serviceClient().stop(resourceGroupName, clusterName);
    }

    public void stop(String resourceGroupName, String clusterName, Context context) {
        this.serviceClient().stop(resourceGroupName, clusterName, context);
    }

    public void promoteReadReplica(String resourceGroupName, String clusterName) {
        this.serviceClient().promoteReadReplica(resourceGroupName, clusterName);
    }

    public void promoteReadReplica(String resourceGroupName, String clusterName, PromoteRequest promoteRequest,
        Context context) {
        this.serviceClient().promoteReadReplica(resourceGroupName, clusterName, promoteRequest, context);
    }

    public Response<NameAvailability> checkNameAvailabilityWithResponse(NameAvailabilityRequest nameAvailabilityRequest,
        Context context) {
        Response<NameAvailabilityInner> inner
            = this.serviceClient().checkNameAvailabilityWithResponse(nameAvailabilityRequest, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new NameAvailabilityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NameAvailability checkNameAvailability(NameAvailabilityRequest nameAvailabilityRequest) {
        NameAvailabilityInner inner = this.serviceClient().checkNameAvailability(nameAvailabilityRequest);
        if (inner != null) {
            return new NameAvailabilityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Cluster getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "serverGroupsv2");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'serverGroupsv2'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE).getValue();
    }

    public Response<Cluster> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "serverGroupsv2");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'serverGroupsv2'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, clusterName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "serverGroupsv2");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'serverGroupsv2'.", id)));
        }
        this.delete(resourceGroupName, clusterName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String clusterName = ResourceManagerUtils.getValueFromIdByName(id, "serverGroupsv2");
        if (clusterName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'serverGroupsv2'.", id)));
        }
        this.delete(resourceGroupName, clusterName, context);
    }

    private ClustersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager() {
        return this.serviceManager;
    }

    public ClusterImpl define(String name) {
        return new ClusterImpl(name, this.manager());
    }
}
