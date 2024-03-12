// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of SapApplicationServerInstances.
 */
public interface SapApplicationServerInstances {
    /**
     * Gets the SAP Application Server Instance corresponding to the Virtual Instance for SAP solutions resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param applicationInstanceName The name of SAP Application Server instance resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Application Server Instance corresponding to the Virtual Instance for SAP solutions resource
     * along with {@link Response}.
     */
    Response<SapApplicationServerInstance> getWithResponse(String resourceGroupName, String sapVirtualInstanceName,
        String applicationInstanceName, Context context);

    /**
     * Gets the SAP Application Server Instance corresponding to the Virtual Instance for SAP solutions resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param applicationInstanceName The name of SAP Application Server instance resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Application Server Instance corresponding to the Virtual Instance for SAP solutions resource.
     */
    SapApplicationServerInstance get(String resourceGroupName, String sapVirtualInstanceName,
        String applicationInstanceName);

    /**
     * Deletes the SAP Application Server Instance resource. &lt;br&gt;&lt;br&gt;This operation will be used by service
     * only. Delete by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param applicationInstanceName The name of SAP Application Server instance resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String sapVirtualInstanceName, String applicationInstanceName);

    /**
     * Deletes the SAP Application Server Instance resource. &lt;br&gt;&lt;br&gt;This operation will be used by service
     * only. Delete by end user will return a Bad Request error.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param applicationInstanceName The name of SAP Application Server instance resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String sapVirtualInstanceName, String applicationInstanceName,
        Context context);

    /**
     * Lists the SAP Application Server Instance resources for a given Virtual Instance for SAP solutions resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the collection of SAP Application Server Instance resources as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<SapApplicationServerInstance> list(String resourceGroupName, String sapVirtualInstanceName);

    /**
     * Lists the SAP Application Server Instance resources for a given Virtual Instance for SAP solutions resource.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return defines the collection of SAP Application Server Instance resources as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<SapApplicationServerInstance> list(String resourceGroupName, String sapVirtualInstanceName,
        Context context);

    /**
     * Starts the SAP Application Server Instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param applicationInstanceName The name of SAP Application Server instance resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult startInstance(String resourceGroupName, String sapVirtualInstanceName,
        String applicationInstanceName);

    /**
     * Starts the SAP Application Server Instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param applicationInstanceName The name of SAP Application Server instance resource.
     * @param body SAP Application server instance start request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult startInstance(String resourceGroupName, String sapVirtualInstanceName,
        String applicationInstanceName, StartRequest body, Context context);

    /**
     * Stops the SAP Application Server Instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param applicationInstanceName The name of SAP Application Server instance resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult stopInstance(String resourceGroupName, String sapVirtualInstanceName,
        String applicationInstanceName);

    /**
     * Stops the SAP Application Server Instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param sapVirtualInstanceName The name of the Virtual Instances for SAP solutions resource.
     * @param applicationInstanceName The name of SAP Application Server instance resource.
     * @param body SAP Application server instance stop request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current status of an async operation.
     */
    OperationStatusResult stopInstance(String resourceGroupName, String sapVirtualInstanceName,
        String applicationInstanceName, StopRequest body, Context context);

    /**
     * Gets the SAP Application Server Instance corresponding to the Virtual Instance for SAP solutions resource.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Application Server Instance corresponding to the Virtual Instance for SAP solutions resource
     * along with {@link Response}.
     */
    SapApplicationServerInstance getById(String id);

    /**
     * Gets the SAP Application Server Instance corresponding to the Virtual Instance for SAP solutions resource.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SAP Application Server Instance corresponding to the Virtual Instance for SAP solutions resource
     * along with {@link Response}.
     */
    Response<SapApplicationServerInstance> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the SAP Application Server Instance resource. &lt;br&gt;&lt;br&gt;This operation will be used by service
     * only. Delete by end user will return a Bad Request error.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the SAP Application Server Instance resource. &lt;br&gt;&lt;br&gt;This operation will be used by service
     * only. Delete by end user will return a Bad Request error.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SapApplicationServerInstance resource.
     * 
     * @param name resource name.
     * @return the first stage of the new SapApplicationServerInstance definition.
     */
    SapApplicationServerInstance.DefinitionStages.Blank define(String name);
}
