// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.ValidateOperationsResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.ValidateOperationRequestResource;

/**
 * An instance of this class provides access to all the operations defined in OperationOperationsClient.
 */
public interface OperationOperationsClient {
    /**
     * Validate operation for specified backed up item. This is a synchronous operation.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters resource validate operation request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ValidateOperationsResponseInner> validateWithResponse(String vaultName, String resourceGroupName,
        ValidateOperationRequestResource parameters, Context context);

    /**
     * Validate operation for specified backed up item. This is a synchronous operation.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param parameters resource validate operation request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ValidateOperationsResponseInner validate(String vaultName, String resourceGroupName,
        ValidateOperationRequestResource parameters);
}
