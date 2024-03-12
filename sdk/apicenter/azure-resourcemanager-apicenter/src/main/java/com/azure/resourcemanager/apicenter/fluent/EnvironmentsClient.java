// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apicenter.fluent.models.EnvironmentInner;
import com.azure.resourcemanager.apicenter.models.EnvironmentsCreateOrUpdateResponse;
import com.azure.resourcemanager.apicenter.models.EnvironmentsGetResponse;

/**
 * An instance of this class provides access to all the operations defined in EnvironmentsClient.
 */
public interface EnvironmentsClient {
    /**
     * Returns a collection of environments.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Environment list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnvironmentInner> list(String resourceGroupName, String serviceName, String workspaceName);

    /**
     * Returns a collection of environments.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param filter OData filter parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a Environment list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EnvironmentInner> list(String resourceGroupName, String serviceName, String workspaceName,
        String filter, Context context);

    /**
     * Returns details of the environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param environmentName The name of the environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentsGetResponse getWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String environmentName, Context context);

    /**
     * Returns details of the environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param environmentName The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentInner get(String resourceGroupName, String serviceName, String workspaceName, String environmentName);

    /**
     * Creates new or updates existing environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param environmentName The name of the environment.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentsCreateOrUpdateResponse createOrUpdateWithResponse(String resourceGroupName, String serviceName,
        String workspaceName, String environmentName, EnvironmentInner resource, Context context);

    /**
     * Creates new or updates existing environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param environmentName The name of the environment.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return environment entity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EnvironmentInner createOrUpdate(String resourceGroupName, String serviceName, String workspaceName,
        String environmentName, EnvironmentInner resource);

    /**
     * Deletes the environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param environmentName The name of the environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String environmentName, Context context);

    /**
     * Deletes the environment.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param environmentName The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String workspaceName, String environmentName);

    /**
     * Checks if specified environment exists.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param environmentName The name of the environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> headWithResponse(String resourceGroupName, String serviceName, String workspaceName,
        String environmentName, Context context);

    /**
     * Checks if specified environment exists.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of Azure API Center service.
     * @param workspaceName The name of the workspace.
     * @param environmentName The name of the environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void head(String resourceGroupName, String serviceName, String workspaceName, String environmentName);
}
