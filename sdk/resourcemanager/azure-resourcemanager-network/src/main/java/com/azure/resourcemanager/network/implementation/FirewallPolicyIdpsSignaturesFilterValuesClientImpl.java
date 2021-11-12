// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.FirewallPolicyIdpsSignaturesFilterValuesClient;
import com.azure.resourcemanager.network.fluent.models.SignatureOverridesFilterValuesResponseInner;
import com.azure.resourcemanager.network.models.SignatureOverridesFilterValuesQuery;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * FirewallPolicyIdpsSignaturesFilterValuesClient.
 */
public final class FirewallPolicyIdpsSignaturesFilterValuesClientImpl
    implements FirewallPolicyIdpsSignaturesFilterValuesClient {
    private final ClientLogger logger = new ClientLogger(FirewallPolicyIdpsSignaturesFilterValuesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final FirewallPolicyIdpsSignaturesFilterValuesService service;

    /** The service client containing this operation class. */
    private final NetworkManagementClientImpl client;

    /**
     * Initializes an instance of FirewallPolicyIdpsSignaturesFilterValuesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    FirewallPolicyIdpsSignaturesFilterValuesClientImpl(NetworkManagementClientImpl client) {
        this.service =
            RestProxy
                .create(
                    FirewallPolicyIdpsSignaturesFilterValuesService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for NetworkManagementClientFirewallPolicyIdpsSignaturesFilterValues to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementCli")
    private interface FirewallPolicyIdpsSignaturesFilterValuesService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network"
                + "/firewallPolicies/{firewallPolicyName}/listIdpsFilterOptions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<SignatureOverridesFilterValuesResponseInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("firewallPolicyName") String firewallPolicyName,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") SignatureOverridesFilterValuesQuery parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Retrieves the current filter values for the signatures overrides.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Describes the filter values possibles for a given column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the list of all possible values for a specific filter value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SignatureOverridesFilterValuesResponseInner>> listWithResponseAsync(
        String resourceGroupName, String firewallPolicyName, SignatureOverridesFilterValuesQuery parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            firewallPolicyName,
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Retrieves the current filter values for the signatures overrides.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Describes the filter values possibles for a given column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the list of all possible values for a specific filter value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<SignatureOverridesFilterValuesResponseInner>> listWithResponseAsync(
        String resourceGroupName,
        String firewallPolicyName,
        SignatureOverridesFilterValuesQuery parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (firewallPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter firewallPolicyName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                resourceGroupName,
                firewallPolicyName,
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Retrieves the current filter values for the signatures overrides.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Describes the filter values possibles for a given column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the list of all possible values for a specific filter value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SignatureOverridesFilterValuesResponseInner> listAsync(
        String resourceGroupName, String firewallPolicyName, SignatureOverridesFilterValuesQuery parameters) {
        return listWithResponseAsync(resourceGroupName, firewallPolicyName, parameters)
            .flatMap(
                (Response<SignatureOverridesFilterValuesResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieves the current filter values for the signatures overrides.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Describes the filter values possibles for a given column.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the list of all possible values for a specific filter value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SignatureOverridesFilterValuesResponseInner list(
        String resourceGroupName, String firewallPolicyName, SignatureOverridesFilterValuesQuery parameters) {
        return listAsync(resourceGroupName, firewallPolicyName, parameters).block();
    }

    /**
     * Retrieves the current filter values for the signatures overrides.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param parameters Describes the filter values possibles for a given column.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the list of all possible values for a specific filter value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SignatureOverridesFilterValuesResponseInner> listWithResponse(
        String resourceGroupName,
        String firewallPolicyName,
        SignatureOverridesFilterValuesQuery parameters,
        Context context) {
        return listWithResponseAsync(resourceGroupName, firewallPolicyName, parameters, context).block();
    }
}
