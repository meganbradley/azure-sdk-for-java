// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.BandwidthSchedulesClient;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.BandwidthScheduleInner;
import com.azure.resourcemanager.sdkreleaseplannertest.models.BandwidthSchedule;
import com.azure.resourcemanager.sdkreleaseplannertest.models.BandwidthSchedules;

public final class BandwidthSchedulesImpl implements BandwidthSchedules {
    private static final ClientLogger LOGGER = new ClientLogger(BandwidthSchedulesImpl.class);

    private final BandwidthSchedulesClient innerClient;

    private final com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager serviceManager;

    public BandwidthSchedulesImpl(
        BandwidthSchedulesClient innerClient,
        com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BandwidthSchedule> listByDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        PagedIterable<BandwidthScheduleInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new BandwidthScheduleImpl(inner1, this.manager()));
    }

    public PagedIterable<BandwidthSchedule> listByDataBoxEdgeDevice(
        String deviceName, String resourceGroupName, Context context) {
        PagedIterable<BandwidthScheduleInner> inner =
            this.serviceClient().listByDataBoxEdgeDevice(deviceName, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new BandwidthScheduleImpl(inner1, this.manager()));
    }

    public Response<BandwidthSchedule> getWithResponse(
        String deviceName, String name, String resourceGroupName, Context context) {
        Response<BandwidthScheduleInner> inner =
            this.serviceClient().getWithResponse(deviceName, name, resourceGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BandwidthScheduleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public BandwidthSchedule get(String deviceName, String name, String resourceGroupName) {
        BandwidthScheduleInner inner = this.serviceClient().get(deviceName, name, resourceGroupName);
        if (inner != null) {
            return new BandwidthScheduleImpl(inner, this.manager());
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

    public BandwidthSchedule getById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "bandwidthSchedules");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bandwidthSchedules'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, name, resourceGroupName, Context.NONE).getValue();
    }

    public Response<BandwidthSchedule> getByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "bandwidthSchedules");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bandwidthSchedules'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        return this.getWithResponse(deviceName, name, resourceGroupName, context);
    }

    public void deleteById(String id) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "bandwidthSchedules");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bandwidthSchedules'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, name, resourceGroupName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String deviceName = Utils.getValueFromIdByName(id, "dataBoxEdgeDevices");
        if (deviceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dataBoxEdgeDevices'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "bandwidthSchedules");
        if (name == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'bandwidthSchedules'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        this.delete(deviceName, name, resourceGroupName, context);
    }

    private BandwidthSchedulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.sdkreleaseplannertest.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    public BandwidthScheduleImpl define(String name) {
        return new BandwidthScheduleImpl(name, this.manager());
    }
}
