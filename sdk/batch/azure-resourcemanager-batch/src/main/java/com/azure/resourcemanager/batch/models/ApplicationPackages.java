// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ApplicationPackages.
 */
public interface ApplicationPackages {
    /**
     * Activates the specified application package. This should be done after the `ApplicationPackage` was created and
     * uploaded. This needs to be done before an `ApplicationPackage` can be used on Pools or Tasks.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param versionName The version of the application.
     * @param parameters The parameters for the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application package which represents a particular version of an application along with
     * {@link Response}.
     */
    Response<ApplicationPackage> activateWithResponse(String resourceGroupName, String accountName,
        String applicationName, String versionName, ActivateApplicationPackageParameters parameters, Context context);

    /**
     * Activates the specified application package. This should be done after the `ApplicationPackage` was created and
     * uploaded. This needs to be done before an `ApplicationPackage` can be used on Pools or Tasks.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param versionName The version of the application.
     * @param parameters The parameters for the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application package which represents a particular version of an application.
     */
    ApplicationPackage activate(String resourceGroupName, String accountName, String applicationName,
        String versionName, ActivateApplicationPackageParameters parameters);

    /**
     * Deletes an application package record and its associated binary file.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param versionName The version of the application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String applicationName,
        String versionName, Context context);

    /**
     * Deletes an application package record and its associated binary file.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param versionName The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String accountName, String applicationName, String versionName);

    /**
     * Gets information about the specified application package.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param versionName The version of the application.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application package along with {@link Response}.
     */
    Response<ApplicationPackage> getWithResponse(String resourceGroupName, String accountName, String applicationName,
        String versionName, Context context);

    /**
     * Gets information about the specified application package.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param versionName The version of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application package.
     */
    ApplicationPackage get(String resourceGroupName, String accountName, String applicationName, String versionName);

    /**
     * Lists all of the application packages in the specified application.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of performing list application packages as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApplicationPackage> list(String resourceGroupName, String accountName, String applicationName);

    /**
     * Lists all of the application packages in the specified application.
     * 
     * @param resourceGroupName The name of the resource group that contains the Batch account.
     * @param accountName The name of the Batch account.
     * @param applicationName The name of the application. This must be unique within the account.
     * @param maxresults The maximum number of items to return in the response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of performing list application packages as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApplicationPackage> list(String resourceGroupName, String accountName, String applicationName,
        Integer maxresults, Context context);

    /**
     * Gets information about the specified application package.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application package along with {@link Response}.
     */
    ApplicationPackage getById(String id);

    /**
     * Gets information about the specified application package.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified application package along with {@link Response}.
     */
    Response<ApplicationPackage> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an application package record and its associated binary file.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an application package record and its associated binary file.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ApplicationPackage resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ApplicationPackage definition.
     */
    ApplicationPackage.DefinitionStages.Blank define(String name);
}
