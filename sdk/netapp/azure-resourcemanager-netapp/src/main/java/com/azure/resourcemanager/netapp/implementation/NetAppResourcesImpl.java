// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.NetAppResourcesClient;
import com.azure.resourcemanager.netapp.fluent.models.CheckAvailabilityResponseInner;
import com.azure.resourcemanager.netapp.fluent.models.NetworkSiblingSetInner;
import com.azure.resourcemanager.netapp.fluent.models.RegionInfoInner;
import com.azure.resourcemanager.netapp.models.CheckAvailabilityResponse;
import com.azure.resourcemanager.netapp.models.FilePathAvailabilityRequest;
import com.azure.resourcemanager.netapp.models.NetAppResources;
import com.azure.resourcemanager.netapp.models.NetworkSiblingSet;
import com.azure.resourcemanager.netapp.models.QueryNetworkSiblingSetRequest;
import com.azure.resourcemanager.netapp.models.QuotaAvailabilityRequest;
import com.azure.resourcemanager.netapp.models.RegionInfo;
import com.azure.resourcemanager.netapp.models.ResourceNameAvailabilityRequest;
import com.azure.resourcemanager.netapp.models.UpdateNetworkSiblingSetRequest;

public final class NetAppResourcesImpl implements NetAppResources {
    private static final ClientLogger LOGGER = new ClientLogger(NetAppResourcesImpl.class);

    private final NetAppResourcesClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public NetAppResourcesImpl(
        NetAppResourcesClient innerClient, com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<CheckAvailabilityResponse> checkNameAvailabilityWithResponse(
        String location, ResourceNameAvailabilityRequest body, Context context) {
        Response<CheckAvailabilityResponseInner> inner =
            this.serviceClient().checkNameAvailabilityWithResponse(location, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckAvailabilityResponse checkNameAvailability(String location, ResourceNameAvailabilityRequest body) {
        CheckAvailabilityResponseInner inner = this.serviceClient().checkNameAvailability(location, body);
        if (inner != null) {
            return new CheckAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckAvailabilityResponse> checkFilePathAvailabilityWithResponse(
        String location, FilePathAvailabilityRequest body, Context context) {
        Response<CheckAvailabilityResponseInner> inner =
            this.serviceClient().checkFilePathAvailabilityWithResponse(location, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckAvailabilityResponse checkFilePathAvailability(String location, FilePathAvailabilityRequest body) {
        CheckAvailabilityResponseInner inner = this.serviceClient().checkFilePathAvailability(location, body);
        if (inner != null) {
            return new CheckAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CheckAvailabilityResponse> checkQuotaAvailabilityWithResponse(
        String location, QuotaAvailabilityRequest body, Context context) {
        Response<CheckAvailabilityResponseInner> inner =
            this.serviceClient().checkQuotaAvailabilityWithResponse(location, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CheckAvailabilityResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CheckAvailabilityResponse checkQuotaAvailability(String location, QuotaAvailabilityRequest body) {
        CheckAvailabilityResponseInner inner = this.serviceClient().checkQuotaAvailability(location, body);
        if (inner != null) {
            return new CheckAvailabilityResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<RegionInfo> queryRegionInfoWithResponse(String location, Context context) {
        Response<RegionInfoInner> inner = this.serviceClient().queryRegionInfoWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new RegionInfoImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public RegionInfo queryRegionInfo(String location) {
        RegionInfoInner inner = this.serviceClient().queryRegionInfo(location);
        if (inner != null) {
            return new RegionInfoImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkSiblingSet> queryNetworkSiblingSetWithResponse(
        String location, QueryNetworkSiblingSetRequest body, Context context) {
        Response<NetworkSiblingSetInner> inner =
            this.serviceClient().queryNetworkSiblingSetWithResponse(location, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkSiblingSetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkSiblingSet queryNetworkSiblingSet(String location, QueryNetworkSiblingSetRequest body) {
        NetworkSiblingSetInner inner = this.serviceClient().queryNetworkSiblingSet(location, body);
        if (inner != null) {
            return new NetworkSiblingSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkSiblingSet updateNetworkSiblingSet(String location, UpdateNetworkSiblingSetRequest body) {
        NetworkSiblingSetInner inner = this.serviceClient().updateNetworkSiblingSet(location, body);
        if (inner != null) {
            return new NetworkSiblingSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NetworkSiblingSet updateNetworkSiblingSet(
        String location, UpdateNetworkSiblingSetRequest body, Context context) {
        NetworkSiblingSetInner inner = this.serviceClient().updateNetworkSiblingSet(location, body, context);
        if (inner != null) {
            return new NetworkSiblingSetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private NetAppResourcesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }
}
