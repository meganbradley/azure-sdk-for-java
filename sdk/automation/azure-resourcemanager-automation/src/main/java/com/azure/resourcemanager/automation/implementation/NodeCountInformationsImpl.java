// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.NodeCountInformationsClient;
import com.azure.resourcemanager.automation.fluent.models.NodeCountsInner;
import com.azure.resourcemanager.automation.models.CountType;
import com.azure.resourcemanager.automation.models.NodeCountInformations;
import com.azure.resourcemanager.automation.models.NodeCounts;

public final class NodeCountInformationsImpl implements NodeCountInformations {
    private static final ClientLogger LOGGER = new ClientLogger(NodeCountInformationsImpl.class);

    private final NodeCountInformationsClient innerClient;

    private final com.azure.resourcemanager.automation.AutomationManager serviceManager;

    public NodeCountInformationsImpl(
        NodeCountInformationsClient innerClient,
        com.azure.resourcemanager.automation.AutomationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NodeCounts get(String resourceGroupName, String automationAccountName, CountType countType) {
        NodeCountsInner inner = this.serviceClient().get(resourceGroupName, automationAccountName, countType);
        if (inner != null) {
            return new NodeCountsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NodeCounts> getWithResponse(
        String resourceGroupName, String automationAccountName, CountType countType, Context context) {
        Response<NodeCountsInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, automationAccountName, countType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NodeCountsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private NodeCountInformationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.automation.AutomationManager manager() {
        return this.serviceManager;
    }
}
