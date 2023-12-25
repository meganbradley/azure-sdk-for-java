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
import com.azure.resourcemanager.sql.fluent.models.FirewallRuleInner;
import com.azure.resourcemanager.sql.models.FirewallRuleList;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in FirewallRulesClient.
 */
public interface FirewallRulesClient {
    /**
     * Gets a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<FirewallRuleInner>> getWithResponseAsync(String resourceGroupName, String serverName,
        String firewallRuleName);

    /**
     * Gets a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<FirewallRuleInner> getAsync(String resourceGroupName, String serverName, String firewallRuleName);

    /**
     * Gets a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FirewallRuleInner> getWithResponse(String resourceGroupName, String serverName, String firewallRuleName,
        Context context);

    /**
     * Gets a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallRuleInner get(String resourceGroupName, String serverName, String firewallRuleName);

    /**
     * Creates or updates a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server firewall rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<FirewallRuleInner>> createOrUpdateWithResponseAsync(String resourceGroupName, String serverName,
        String firewallRuleName, FirewallRuleInner parameters);

    /**
     * Creates or updates a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server firewall rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<FirewallRuleInner> createOrUpdateAsync(String resourceGroupName, String serverName, String firewallRuleName,
        FirewallRuleInner parameters);

    /**
     * Creates or updates a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server firewall rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FirewallRuleInner> createOrUpdateWithResponse(String resourceGroupName, String serverName,
        String firewallRuleName, FirewallRuleInner parameters, Context context);

    /**
     * Creates or updates a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param parameters The required parameters for creating or updating a firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallRuleInner createOrUpdate(String resourceGroupName, String serverName, String firewallRuleName,
        FirewallRuleInner parameters);

    /**
     * Deletes a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String serverName, String firewallRuleName);

    /**
     * Deletes a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serverName, String firewallRuleName);

    /**
     * Deletes a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String serverName, String firewallRuleName,
        Context context);

    /**
     * Deletes a firewall rule.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param firewallRuleName The name of the firewall rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String firewallRuleName);

    /**
     * Gets a list of firewall rules.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of firewall rules as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<FirewallRuleInner> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Gets a list of firewall rules.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of firewall rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallRuleInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Gets a list of firewall rules.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of firewall rules as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<FirewallRuleInner> listByServer(String resourceGroupName, String serverName, Context context);

    /**
     * Replaces all firewall rules on the server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters A list of server firewall rules.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server firewall rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<FirewallRuleInner>> replaceWithResponseAsync(String resourceGroupName, String serverName,
        FirewallRuleList parameters);

    /**
     * Replaces all firewall rules on the server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters A list of server firewall rules.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server firewall rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<FirewallRuleInner> replaceAsync(String resourceGroupName, String serverName, FirewallRuleList parameters);

    /**
     * Replaces all firewall rules on the server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters A list of server firewall rules.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server firewall rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<FirewallRuleInner> replaceWithResponse(String resourceGroupName, String serverName,
        FirewallRuleList parameters, Context context);

    /**
     * Replaces all firewall rules on the server.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param parameters A list of server firewall rules.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server firewall rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    FirewallRuleInner replace(String resourceGroupName, String serverName, FirewallRuleList parameters);
}
