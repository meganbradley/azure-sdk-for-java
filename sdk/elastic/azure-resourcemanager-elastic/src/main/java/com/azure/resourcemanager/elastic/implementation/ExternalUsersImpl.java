// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.elastic.fluent.ExternalUsersClient;
import com.azure.resourcemanager.elastic.fluent.models.ExternalUserCreationResponseInner;
import com.azure.resourcemanager.elastic.models.ExternalUserCreationResponse;
import com.azure.resourcemanager.elastic.models.ExternalUserInfo;
import com.azure.resourcemanager.elastic.models.ExternalUsers;

public final class ExternalUsersImpl implements ExternalUsers {
    private static final ClientLogger LOGGER = new ClientLogger(ExternalUsersImpl.class);

    private final ExternalUsersClient innerClient;

    private final com.azure.resourcemanager.elastic.ElasticManager serviceManager;

    public ExternalUsersImpl(
        ExternalUsersClient innerClient, com.azure.resourcemanager.elastic.ElasticManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ExternalUserCreationResponse> createOrUpdateWithResponse(
        String resourceGroupName, String monitorName, ExternalUserInfo body, Context context) {
        Response<ExternalUserCreationResponseInner> inner =
            this.serviceClient().createOrUpdateWithResponse(resourceGroupName, monitorName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExternalUserCreationResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExternalUserCreationResponse createOrUpdate(String resourceGroupName, String monitorName) {
        ExternalUserCreationResponseInner inner = this.serviceClient().createOrUpdate(resourceGroupName, monitorName);
        if (inner != null) {
            return new ExternalUserCreationResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ExternalUsersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.elastic.ElasticManager manager() {
        return this.serviceManager;
    }
}
