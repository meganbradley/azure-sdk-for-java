// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.fluent.MetricsConfigurationsClient;
import com.azure.resourcemanager.networkcloud.fluent.models.ClusterMetricsConfigurationInner;
import com.azure.resourcemanager.networkcloud.models.ClusterMetricsConfiguration;
import com.azure.resourcemanager.networkcloud.models.MetricsConfigurations;

public final class MetricsConfigurationsImpl implements MetricsConfigurations {
    private static final ClientLogger LOGGER = new ClientLogger(MetricsConfigurationsImpl.class);

    private final MetricsConfigurationsClient innerClient;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public MetricsConfigurationsImpl(
        MetricsConfigurationsClient innerClient,
        com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ClusterMetricsConfiguration> listByResourceGroup(
        String resourceGroupName, String clusterName) {
        PagedIterable<ClusterMetricsConfigurationInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, clusterName);
        return Utils.mapPage(inner, inner1 -> new ClusterMetricsConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<ClusterMetricsConfiguration> listByResourceGroup(
        String resourceGroupName, String clusterName, Context context) {
        PagedIterable<ClusterMetricsConfigurationInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, clusterName, context);
        return Utils.mapPage(inner, inner1 -> new ClusterMetricsConfigurationImpl(inner1, this.manager()));
    }

    public Response<ClusterMetricsConfiguration> getWithResponse(
        String resourceGroupName, String clusterName, String metricsConfigurationName, Context context) {
        Response<ClusterMetricsConfigurationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, clusterName, metricsConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ClusterMetricsConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ClusterMetricsConfiguration get(
        String resourceGroupName, String clusterName, String metricsConfigurationName) {
        ClusterMetricsConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, clusterName, metricsConfigurationName);
        if (inner != null) {
            return new ClusterMetricsConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String clusterName, String metricsConfigurationName) {
        this.serviceClient().delete(resourceGroupName, clusterName, metricsConfigurationName);
    }

    public void delete(String resourceGroupName, String clusterName, String metricsConfigurationName, Context context) {
        this.serviceClient().delete(resourceGroupName, clusterName, metricsConfigurationName, context);
    }

    public ClusterMetricsConfiguration getById(String id) {
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
        String metricsConfigurationName = Utils.getValueFromIdByName(id, "metricsConfigurations");
        if (metricsConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'metricsConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, metricsConfigurationName, Context.NONE).getValue();
    }

    public Response<ClusterMetricsConfiguration> getByIdWithResponse(String id, Context context) {
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
        String metricsConfigurationName = Utils.getValueFromIdByName(id, "metricsConfigurations");
        if (metricsConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'metricsConfigurations'.",
                                id)));
        }
        return this.getWithResponse(resourceGroupName, clusterName, metricsConfigurationName, context);
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
        String metricsConfigurationName = Utils.getValueFromIdByName(id, "metricsConfigurations");
        if (metricsConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'metricsConfigurations'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, metricsConfigurationName, Context.NONE);
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
        String metricsConfigurationName = Utils.getValueFromIdByName(id, "metricsConfigurations");
        if (metricsConfigurationName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'metricsConfigurations'.",
                                id)));
        }
        this.delete(resourceGroupName, clusterName, metricsConfigurationName, context);
    }

    private MetricsConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    public ClusterMetricsConfigurationImpl define(String name) {
        return new ClusterMetricsConfigurationImpl(name, this.manager());
    }
}
