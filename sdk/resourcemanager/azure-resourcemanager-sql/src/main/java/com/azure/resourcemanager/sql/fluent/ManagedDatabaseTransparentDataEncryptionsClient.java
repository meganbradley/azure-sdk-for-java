// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.ManagedTransparentDataEncryptionInner;
import com.azure.resourcemanager.sql.models.TransparentDataEncryptionName;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * ManagedDatabaseTransparentDataEncryptionsClient.
 */
public interface ManagedDatabaseTransparentDataEncryptionsClient {
    /**
     * Gets a managed database's transparent data encryption.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the transparent data encryption is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's transparent data encryption along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ManagedTransparentDataEncryptionInner>> getWithResponseAsync(String resourceGroupName,
        String managedInstanceName, String databaseName, TransparentDataEncryptionName tdeName);

    /**
     * Gets a managed database's transparent data encryption.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the transparent data encryption is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's transparent data encryption on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedTransparentDataEncryptionInner> getAsync(String resourceGroupName, String managedInstanceName,
        String databaseName, TransparentDataEncryptionName tdeName);

    /**
     * Gets a managed database's transparent data encryption.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the transparent data encryption is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's transparent data encryption along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedTransparentDataEncryptionInner> getWithResponse(String resourceGroupName,
        String managedInstanceName, String databaseName, TransparentDataEncryptionName tdeName, Context context);

    /**
     * Gets a managed database's transparent data encryption.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the transparent data encryption is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database's transparent data encryption.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedTransparentDataEncryptionInner get(String resourceGroupName, String managedInstanceName, String databaseName,
        TransparentDataEncryptionName tdeName);

    /**
     * Updates a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @param parameters The database transparent data encryption.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database transparent data encryption state along with {@link Response} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ManagedTransparentDataEncryptionInner>> createOrUpdateWithResponseAsync(String resourceGroupName,
        String managedInstanceName, String databaseName, TransparentDataEncryptionName tdeName,
        ManagedTransparentDataEncryptionInner parameters);

    /**
     * Updates a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @param parameters The database transparent data encryption.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database transparent data encryption state on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ManagedTransparentDataEncryptionInner> createOrUpdateAsync(String resourceGroupName,
        String managedInstanceName, String databaseName, TransparentDataEncryptionName tdeName,
        ManagedTransparentDataEncryptionInner parameters);

    /**
     * Updates a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @param parameters The database transparent data encryption.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database transparent data encryption state along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedTransparentDataEncryptionInner> createOrUpdateWithResponse(String resourceGroupName,
        String managedInstanceName, String databaseName, TransparentDataEncryptionName tdeName,
        ManagedTransparentDataEncryptionInner parameters, Context context);

    /**
     * Updates a database's transparent data encryption configuration.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the security alert policy is defined.
     * @param tdeName The name of the transparent data encryption configuration.
     * @param parameters The database transparent data encryption.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed database transparent data encryption state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedTransparentDataEncryptionInner createOrUpdate(String resourceGroupName, String managedInstanceName,
        String databaseName, TransparentDataEncryptionName tdeName, ManagedTransparentDataEncryptionInner parameters);

    /**
     * Gets a list of managed database's transparent data encryptions.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the transparent data encryption is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed database's transparent data encryptions as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ManagedTransparentDataEncryptionInner> listByDatabaseAsync(String resourceGroupName,
        String managedInstanceName, String databaseName);

    /**
     * Gets a list of managed database's transparent data encryptions.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the transparent data encryption is defined.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed database's transparent data encryptions as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedTransparentDataEncryptionInner> listByDatabase(String resourceGroupName,
        String managedInstanceName, String databaseName);

    /**
     * Gets a list of managed database's transparent data encryptions.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param managedInstanceName The name of the managed instance.
     * @param databaseName The name of the managed database for which the transparent data encryption is defined.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of managed database's transparent data encryptions as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedTransparentDataEncryptionInner> listByDatabase(String resourceGroupName,
        String managedInstanceName, String databaseName, Context context);
}
