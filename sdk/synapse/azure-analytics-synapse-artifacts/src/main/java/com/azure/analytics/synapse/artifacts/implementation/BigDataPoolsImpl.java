// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.implementation;

import com.azure.analytics.synapse.artifacts.models.BigDataPoolResourceInfo;
import com.azure.analytics.synapse.artifacts.models.BigDataPoolResourceInfoListResult;
import com.azure.analytics.synapse.artifacts.models.ErrorContractException;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in BigDataPools.
 */
public final class BigDataPoolsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final BigDataPoolsService service;

    /**
     * The service client containing this operation class.
     */
    private final ArtifactsClientImpl client;

    /**
     * Initializes an instance of BigDataPoolsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    BigDataPoolsImpl(ArtifactsClientImpl client) {
        this.service
            = RestProxy.create(BigDataPoolsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ArtifactsClientBigDataPools to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "ArtifactsClientBigDa")
    public interface BigDataPoolsService {
        @Get("/bigDataPools")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorContractException.class)
        Mono<Response<BigDataPoolResourceInfoListResult>> list(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Get("/bigDataPools/{bigDataPoolName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ErrorContractException.class)
        Mono<Response<BigDataPoolResourceInfo>> get(@HostParam("endpoint") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("bigDataPoolName") String bigDataPoolName,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List Big Data Pools.
     * 
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BigDataPoolResourceInfoListResult>> listWithResponseAsync() {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.list(this.client.getEndpoint(), apiVersion, accept, context));
    }

    /**
     * List Big Data Pools.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BigDataPoolResourceInfoListResult>> listWithResponseAsync(Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.list(this.client.getEndpoint(), apiVersion, accept, context);
    }

    /**
     * List Big Data Pools.
     * 
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BigDataPoolResourceInfoListResult> listAsync() {
        return listWithResponseAsync().flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Big Data Pools.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BigDataPoolResourceInfoListResult> listAsync(Context context) {
        return listWithResponseAsync(context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List Big Data Pools.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BigDataPoolResourceInfoListResult> listWithResponse(Context context) {
        return listWithResponseAsync(context).block();
    }

    /**
     * List Big Data Pools.
     * 
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Big Data pools.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BigDataPoolResourceInfoListResult list() {
        return listWithResponse(Context.NONE).getValue();
    }

    /**
     * Get Big Data Pool.
     * 
     * @param bigDataPoolName The Big Data Pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BigDataPoolResourceInfo>> getWithResponseAsync(String bigDataPoolName) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return FluxUtil.withContext(
            context -> service.get(this.client.getEndpoint(), apiVersion, bigDataPoolName, accept, context));
    }

    /**
     * Get Big Data Pool.
     * 
     * @param bigDataPoolName The Big Data Pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BigDataPoolResourceInfo>> getWithResponseAsync(String bigDataPoolName, Context context) {
        final String apiVersion = "2020-12-01";
        final String accept = "application/json";
        return service.get(this.client.getEndpoint(), apiVersion, bigDataPoolName, accept, context);
    }

    /**
     * Get Big Data Pool.
     * 
     * @param bigDataPoolName The Big Data Pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BigDataPoolResourceInfo> getAsync(String bigDataPoolName) {
        return getWithResponseAsync(bigDataPoolName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Big Data Pool.
     * 
     * @param bigDataPoolName The Big Data Pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BigDataPoolResourceInfo> getAsync(String bigDataPoolName, Context context) {
        return getWithResponseAsync(bigDataPoolName, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get Big Data Pool.
     * 
     * @param bigDataPoolName The Big Data Pool name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BigDataPoolResourceInfo> getWithResponse(String bigDataPoolName, Context context) {
        return getWithResponseAsync(bigDataPoolName, context).block();
    }

    /**
     * Get Big Data Pool.
     * 
     * @param bigDataPoolName The Big Data Pool name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorContractException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return big Data Pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BigDataPoolResourceInfo get(String bigDataPoolName) {
        return getWithResponse(bigDataPoolName, Context.NONE).getValue();
    }
}
