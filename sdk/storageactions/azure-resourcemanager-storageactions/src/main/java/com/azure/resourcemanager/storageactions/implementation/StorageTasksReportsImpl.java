// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storageactions.fluent.StorageTasksReportsClient;
import com.azure.resourcemanager.storageactions.fluent.models.StorageTaskReportInstanceInner;
import com.azure.resourcemanager.storageactions.models.StorageTaskReportInstance;
import com.azure.resourcemanager.storageactions.models.StorageTasksReports;

public final class StorageTasksReportsImpl implements StorageTasksReports {
    private static final ClientLogger LOGGER = new ClientLogger(StorageTasksReportsImpl.class);

    private final StorageTasksReportsClient innerClient;

    private final com.azure.resourcemanager.storageactions.StorageActionsManager serviceManager;

    public StorageTasksReportsImpl(StorageTasksReportsClient innerClient,
        com.azure.resourcemanager.storageactions.StorageActionsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<StorageTaskReportInstance> list(String resourceGroupName, String storageTaskName) {
        PagedIterable<StorageTaskReportInstanceInner> inner
            = this.serviceClient().list(resourceGroupName, storageTaskName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new StorageTaskReportInstanceImpl(inner1, this.manager()));
    }

    public PagedIterable<StorageTaskReportInstance> list(String resourceGroupName, String storageTaskName,
        String maxpagesize, String filter, Context context) {
        PagedIterable<StorageTaskReportInstanceInner> inner
            = this.serviceClient().list(resourceGroupName, storageTaskName, maxpagesize, filter, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new StorageTaskReportInstanceImpl(inner1, this.manager()));
    }

    private StorageTasksReportsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.storageactions.StorageActionsManager manager() {
        return this.serviceManager;
    }
}
