// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.JobResourceInner;

/**
 * An instance of this class provides access to all the operations defined in JobDetailsClient.
 */
public interface JobDetailsClient {
    /**
     * Gets extended information associated with the job.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param jobName Name of the job whose details are to be fetched.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extended information associated with the job along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobResourceInner> getWithResponse(String vaultName, String resourceGroupName, String jobName,
        Context context);

    /**
     * Gets extended information associated with the job.
     * 
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param jobName Name of the job whose details are to be fetched.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return extended information associated with the job.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobResourceInner get(String vaultName, String resourceGroupName, String jobName);
}
