// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.baremetalinfrastructure.fluent.AzureBareMetalInstancesClient;
import com.azure.resourcemanager.baremetalinfrastructure.fluent.models.AzureBareMetalInstanceInner;
import com.azure.resourcemanager.baremetalinfrastructure.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.baremetalinfrastructure.models.AzureBareMetalInstance;
import com.azure.resourcemanager.baremetalinfrastructure.models.AzureBareMetalInstances;
import com.azure.resourcemanager.baremetalinfrastructure.models.ForceState;
import com.azure.resourcemanager.baremetalinfrastructure.models.OperationStatus;
import com.azure.resourcemanager.baremetalinfrastructure.models.Tags;

public final class AzureBareMetalInstancesImpl implements AzureBareMetalInstances {
    private static final ClientLogger LOGGER = new ClientLogger(AzureBareMetalInstancesImpl.class);

    private final AzureBareMetalInstancesClient innerClient;

    private final com.azure.resourcemanager.baremetalinfrastructure.BareMetalInfrastructureManager serviceManager;

    public AzureBareMetalInstancesImpl(
        AzureBareMetalInstancesClient innerClient,
        com.azure.resourcemanager.baremetalinfrastructure.BareMetalInfrastructureManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationStatus start(String resourceGroupName, String azureBareMetalInstanceName) {
        OperationStatusInner inner = this.serviceClient().start(resourceGroupName, azureBareMetalInstanceName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus start(String resourceGroupName, String azureBareMetalInstanceName, Context context) {
        OperationStatusInner inner = this.serviceClient().start(resourceGroupName, azureBareMetalInstanceName, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus restart(String resourceGroupName, String azureBareMetalInstanceName) {
        OperationStatusInner inner = this.serviceClient().restart(resourceGroupName, azureBareMetalInstanceName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus restart(
        String resourceGroupName, String azureBareMetalInstanceName, ForceState forceParameter, Context context) {
        OperationStatusInner inner =
            this.serviceClient().restart(resourceGroupName, azureBareMetalInstanceName, forceParameter, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus shutdown(String resourceGroupName, String azureBareMetalInstanceName) {
        OperationStatusInner inner = this.serviceClient().shutdown(resourceGroupName, azureBareMetalInstanceName);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public OperationStatus shutdown(String resourceGroupName, String azureBareMetalInstanceName, Context context) {
        OperationStatusInner inner =
            this.serviceClient().shutdown(resourceGroupName, azureBareMetalInstanceName, context);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<AzureBareMetalInstance> list() {
        PagedIterable<AzureBareMetalInstanceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new AzureBareMetalInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureBareMetalInstance> list(Context context) {
        PagedIterable<AzureBareMetalInstanceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new AzureBareMetalInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureBareMetalInstance> listByResourceGroup(String resourceGroupName) {
        PagedIterable<AzureBareMetalInstanceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AzureBareMetalInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<AzureBareMetalInstance> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<AzureBareMetalInstanceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AzureBareMetalInstanceImpl(inner1, this.manager()));
    }

    public Response<AzureBareMetalInstance> getByResourceGroupWithResponse(
        String resourceGroupName, String azureBareMetalInstanceName, Context context) {
        Response<AzureBareMetalInstanceInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, azureBareMetalInstanceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureBareMetalInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureBareMetalInstance getByResourceGroup(String resourceGroupName, String azureBareMetalInstanceName) {
        AzureBareMetalInstanceInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, azureBareMetalInstanceName);
        if (inner != null) {
            return new AzureBareMetalInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AzureBareMetalInstance> updateWithResponse(
        String resourceGroupName, String azureBareMetalInstanceName, Tags tagsParameter, Context context) {
        Response<AzureBareMetalInstanceInner> inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, azureBareMetalInstanceName, tagsParameter, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AzureBareMetalInstanceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AzureBareMetalInstance update(
        String resourceGroupName, String azureBareMetalInstanceName, Tags tagsParameter) {
        AzureBareMetalInstanceInner inner =
            this.serviceClient().update(resourceGroupName, azureBareMetalInstanceName, tagsParameter);
        if (inner != null) {
            return new AzureBareMetalInstanceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private AzureBareMetalInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.baremetalinfrastructure.BareMetalInfrastructureManager manager() {
        return this.serviceManager;
    }
}
