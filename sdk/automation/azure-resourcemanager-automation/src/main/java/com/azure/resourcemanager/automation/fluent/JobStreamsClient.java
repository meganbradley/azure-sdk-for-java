// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.JobStreamInner;

/** An instance of this class provides access to all the operations defined in JobStreamsClient. */
public interface JobStreamsClient {
    /**
     * Retrieve the job stream identified by job stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @param jobStreamId The job stream id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job stream.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobStreamInner get(String resourceGroupName, String automationAccountName, String jobName, String jobStreamId);

    /**
     * Retrieve the job stream identified by job stream id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @param jobStreamId The job stream id.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the job stream along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobStreamInner> getWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String jobStreamId,
        String clientRequestId,
        Context context);

    /**
     * Retrieve a list of jobs streams identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobStreamInner> listByJob(String resourceGroupName, String automationAccountName, String jobName);

    /**
     * Retrieve a list of jobs streams identified by job name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param jobName The job name.
     * @param filter The filter to apply on the operation.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list job stream operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobStreamInner> listByJob(
        String resourceGroupName,
        String automationAccountName,
        String jobName,
        String filter,
        String clientRequestId,
        Context context);
}
