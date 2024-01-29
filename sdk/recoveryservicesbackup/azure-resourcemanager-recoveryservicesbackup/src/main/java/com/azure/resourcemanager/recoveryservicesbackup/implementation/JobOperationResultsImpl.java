// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.JobOperationResultsClient;
import com.azure.resourcemanager.recoveryservicesbackup.models.JobOperationResults;

public final class JobOperationResultsImpl implements JobOperationResults {
    private static final ClientLogger LOGGER = new ClientLogger(JobOperationResultsImpl.class);

    private final JobOperationResultsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public JobOperationResultsImpl(JobOperationResultsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<Void> getWithResponse(String vaultName, String resourceGroupName, String jobName,
        String operationId, Context context) {
        return this.serviceClient().getWithResponse(vaultName, resourceGroupName, jobName, operationId, context);
    }

    public void get(String vaultName, String resourceGroupName, String jobName, String operationId) {
        this.serviceClient().get(vaultName, resourceGroupName, jobName, operationId);
    }

    private JobOperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
