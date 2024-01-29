// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.OperationOperationsClient;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ValidateOperationsResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.OperationOperations;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationRequestResource;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationsResponse;

public final class OperationOperationsImpl implements OperationOperations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationOperationsImpl.class);

    private final OperationOperationsClient innerClient;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    public OperationOperationsImpl(OperationOperationsClient innerClient,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ValidateOperationsResponse> validateWithResponse(String vaultName, String resourceGroupName,
        ValidateOperationRequestResource parameters, Context context) {
        Response<ValidateOperationsResponseInner> inner
            = this.serviceClient().validateWithResponse(vaultName, resourceGroupName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ValidateOperationsResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ValidateOperationsResponse validate(String vaultName, String resourceGroupName,
        ValidateOperationRequestResource parameters) {
        ValidateOperationsResponseInner inner = this.serviceClient().validate(vaultName, resourceGroupName, parameters);
        if (inner != null) {
            return new ValidateOperationsResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
