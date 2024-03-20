// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.support.fluent.FileWorkspacesNoSubscriptionsClient;
import com.azure.resourcemanager.support.fluent.models.FileWorkspaceDetailsInner;
import com.azure.resourcemanager.support.models.FileWorkspaceDetails;
import com.azure.resourcemanager.support.models.FileWorkspacesNoSubscriptions;

public final class FileWorkspacesNoSubscriptionsImpl implements FileWorkspacesNoSubscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(FileWorkspacesNoSubscriptionsImpl.class);

    private final FileWorkspacesNoSubscriptionsClient innerClient;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    public FileWorkspacesNoSubscriptionsImpl(FileWorkspacesNoSubscriptionsClient innerClient,
        com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<FileWorkspaceDetails> getWithResponse(String fileWorkspaceName, Context context) {
        Response<FileWorkspaceDetailsInner> inner = this.serviceClient().getWithResponse(fileWorkspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FileWorkspaceDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FileWorkspaceDetails get(String fileWorkspaceName) {
        FileWorkspaceDetailsInner inner = this.serviceClient().get(fileWorkspaceName);
        if (inner != null) {
            return new FileWorkspaceDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FileWorkspaceDetails> createWithResponse(String fileWorkspaceName, Context context) {
        Response<FileWorkspaceDetailsInner> inner = this.serviceClient().createWithResponse(fileWorkspaceName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new FileWorkspaceDetailsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public FileWorkspaceDetails create(String fileWorkspaceName) {
        FileWorkspaceDetailsInner inner = this.serviceClient().create(fileWorkspaceName);
        if (inner != null) {
            return new FileWorkspaceDetailsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private FileWorkspacesNoSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }
}
