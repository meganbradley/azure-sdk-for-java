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
import com.azure.resourcemanager.sql.fluent.models.DataMaskingRuleInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DataMaskingRulesClient. */
public interface DataMaskingRulesClient {
    /**
     * Creates or updates a database data masking rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a database data masking rule along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DataMaskingRuleInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String dataMaskingRuleName,
        DataMaskingRuleInner parameters);

    /**
     * Creates or updates a database data masking rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a database data masking rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DataMaskingRuleInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String dataMaskingRuleName,
        DataMaskingRuleInner parameters);

    /**
     * Creates or updates a database data masking rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a database data masking rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataMaskingRuleInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String dataMaskingRuleName,
        DataMaskingRuleInner parameters);

    /**
     * Creates or updates a database data masking rule.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param dataMaskingRuleName The name of the data masking rule.
     * @param parameters The required parameters for creating or updating a data masking rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a database data masking rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataMaskingRuleInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String serverName,
        String databaseName,
        String dataMaskingRuleName,
        DataMaskingRuleInner parameters,
        Context context);

    /**
     * Gets a list of database data masking rules.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database data masking rules as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<DataMaskingRuleInner> listByDatabaseAsync(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a list of database data masking rules.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database data masking rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataMaskingRuleInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName);

    /**
     * Gets a list of database data masking rules.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database data masking rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataMaskingRuleInner> listByDatabase(
        String resourceGroupName, String serverName, String databaseName, Context context);
}
