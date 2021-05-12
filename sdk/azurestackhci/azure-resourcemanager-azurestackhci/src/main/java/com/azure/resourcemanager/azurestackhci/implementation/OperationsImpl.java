// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestackhci.fluent.OperationsClient;
import com.azure.resourcemanager.azurestackhci.fluent.models.AvailableOperationsInner;
import com.azure.resourcemanager.azurestackhci.models.AvailableOperations;
import com.azure.resourcemanager.azurestackhci.models.Operations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationsImpl implements Operations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager;

    public OperationsImpl(
        OperationsClient innerClient, com.azure.resourcemanager.azurestackhci.AzureStackHciManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AvailableOperations list() {
        AvailableOperationsInner inner = this.serviceClient().list();
        if (inner != null) {
            return new AvailableOperationsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AvailableOperations> listWithResponse(Context context) {
        Response<AvailableOperationsInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AvailableOperationsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurestackhci.AzureStackHciManager manager() {
        return this.serviceManager;
    }
}
