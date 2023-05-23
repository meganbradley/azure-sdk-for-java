// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.elastic.fluent.OrganizationsClient;
import com.azure.resourcemanager.elastic.fluent.models.UserApiKeyResponseInner;
import com.azure.resourcemanager.elastic.models.UserEmailId;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in OrganizationsClient. */
public final class OrganizationsClientImpl implements OrganizationsClient {
    /** The proxy service used to perform REST calls. */
    private final OrganizationsService service;

    /** The service client containing this operation class. */
    private final MicrosoftElasticImpl client;

    /**
     * Initializes an instance of OrganizationsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    OrganizationsClientImpl(MicrosoftElasticImpl client) {
        this.service =
            RestProxy.create(OrganizationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftElasticOrganizations to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftElasticOrga")
    public interface OrganizationsService {
        @Headers({"Content-Type: application/json"})
        @Post("/subscriptions/{subscriptionId}/providers/Microsoft.Elastic/getOrganizationApiKey")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<UserApiKeyResponseInner>> getApiKey(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") UserEmailId body,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Fetch User API Key from internal database, if it was generated and stored while creating the Elasticsearch
     * Organization.
     *
     * @param body Email Id parameter of the User Organization, of which the API Key must be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the User Api Key created for the Organization associated with the User Email Id that was passed in the
     *     request along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<UserApiKeyResponseInner>> getApiKeyWithResponseAsync(UserEmailId body) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (body != null) {
            body.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getApiKey(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            body,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Fetch User API Key from internal database, if it was generated and stored while creating the Elasticsearch
     * Organization.
     *
     * @param body Email Id parameter of the User Organization, of which the API Key must be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the User Api Key created for the Organization associated with the User Email Id that was passed in the
     *     request along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<UserApiKeyResponseInner>> getApiKeyWithResponseAsync(UserEmailId body, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (body != null) {
            body.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getApiKey(
                this.client.getEndpoint(),
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                body,
                accept,
                context);
    }

    /**
     * Fetch User API Key from internal database, if it was generated and stored while creating the Elasticsearch
     * Organization.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the User Api Key created for the Organization associated with the User Email Id that was passed in the
     *     request on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<UserApiKeyResponseInner> getApiKeyAsync() {
        final UserEmailId body = null;
        return getApiKeyWithResponseAsync(body).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Fetch User API Key from internal database, if it was generated and stored while creating the Elasticsearch
     * Organization.
     *
     * @param body Email Id parameter of the User Organization, of which the API Key must be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the User Api Key created for the Organization associated with the User Email Id that was passed in the
     *     request along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<UserApiKeyResponseInner> getApiKeyWithResponse(UserEmailId body, Context context) {
        return getApiKeyWithResponseAsync(body, context).block();
    }

    /**
     * Fetch User API Key from internal database, if it was generated and stored while creating the Elasticsearch
     * Organization.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the User Api Key created for the Organization associated with the User Email Id that was passed in the
     *     request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UserApiKeyResponseInner getApiKey() {
        final UserEmailId body = null;
        return getApiKeyWithResponse(body, Context.NONE).getValue();
    }
}
