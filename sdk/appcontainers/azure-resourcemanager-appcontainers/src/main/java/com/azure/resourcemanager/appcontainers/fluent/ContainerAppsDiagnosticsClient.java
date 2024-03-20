// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.ContainerAppInner;
import com.azure.resourcemanager.appcontainers.fluent.models.DiagnosticsInner;
import com.azure.resourcemanager.appcontainers.fluent.models.RevisionInner;

/**
 * An instance of this class provides access to all the operations defined in ContainerAppsDiagnosticsClient.
 */
public interface ContainerAppsDiagnosticsClient {
    /**
     * Get the list of diagnostics for a given Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App for which detector info is needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of diagnostics for a given Container App as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiagnosticsInner> listDetectors(String resourceGroupName, String containerAppName);

    /**
     * Get the list of diagnostics for a given Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App for which detector info is needed.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of diagnostics for a given Container App as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DiagnosticsInner> listDetectors(String resourceGroupName, String containerAppName, Context context);

    /**
     * Get a diagnostics result of a Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param detectorName Name of the Container App Detector.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a diagnostics result of a Container App along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticsInner> getDetectorWithResponse(String resourceGroupName, String containerAppName,
        String detectorName, Context context);

    /**
     * Get a diagnostics result of a Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param detectorName Name of the Container App Detector.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a diagnostics result of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticsInner getDetector(String resourceGroupName, String containerAppName, String detectorName);

    /**
     * Get the Revisions for a given Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App for which Revisions are needed.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Revisions for a given Container App as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RevisionInner> listRevisions(String resourceGroupName, String containerAppName);

    /**
     * Get the Revisions for a given Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App for which Revisions are needed.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Revisions for a given Container App as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RevisionInner> listRevisions(String resourceGroupName, String containerAppName, String filter,
        Context context);

    /**
     * Get a revision of a Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a revision of a Container App along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RevisionInner> getRevisionWithResponse(String resourceGroupName, String containerAppName,
        String revisionName, Context context);

    /**
     * Get a revision of a Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param revisionName Name of the Container App Revision.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a revision of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RevisionInner getRevision(String resourceGroupName, String containerAppName, String revisionName);

    /**
     * Get the properties of a Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on
     * status code 404.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerAppInner> getRootWithResponse(String resourceGroupName, String containerAppName, Context context);

    /**
     * Get the properties of a Container App.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param containerAppName Name of the Container App.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appcontainers.models.DefaultErrorResponseErrorException thrown if the request
     * is rejected by server.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server on
     * status code 404.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of a Container App.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerAppInner getRoot(String resourceGroupName, String containerAppName);
}
