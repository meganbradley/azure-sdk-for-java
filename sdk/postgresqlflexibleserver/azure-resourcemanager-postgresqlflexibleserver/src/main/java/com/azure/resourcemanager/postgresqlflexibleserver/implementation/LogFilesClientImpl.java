// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.LogFilesClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.LogFileInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LogFileListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in LogFilesClient.
 */
public final class LogFilesClientImpl implements LogFilesClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final LogFilesService service;

    /**
     * The service client containing this operation class.
     */
    private final PostgreSqlManagementClientImpl client;

    /**
     * Initializes an instance of LogFilesClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    LogFilesClientImpl(PostgreSqlManagementClientImpl client) {
        this.service = RestProxy.create(LogFilesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for PostgreSqlManagementClientLogFiles to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "PostgreSqlManagement")
    public interface LogFilesService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DBforPostgreSQL/flexibleServers/{serverName}/logFiles")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LogFileListResult>> listByServer(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<LogFileListResult>> listByServerNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * List all the server log files in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of logFiles along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LogFileInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByServer(this.client.getEndpoint(), this.client.getApiVersion(),
                this.client.getSubscriptionId(), resourceGroupName, serverName, accept, context))
            .<PagedResponse<LogFileInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * List all the server log files in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of logFiles along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LogFileInner>> listByServerSinglePageAsync(String resourceGroupName, String serverName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByServer(this.client.getEndpoint(), this.client.getApiVersion(), this.client.getSubscriptionId(),
                resourceGroupName, serverName, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * List all the server log files in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of logFiles as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LogFileInner> listByServerAsync(String resourceGroupName, String serverName) {
        return new PagedFlux<>(() -> listByServerSinglePageAsync(resourceGroupName, serverName),
            nextLink -> listByServerNextSinglePageAsync(nextLink));
    }

    /**
     * List all the server log files in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of logFiles as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<LogFileInner> listByServerAsync(String resourceGroupName, String serverName, Context context) {
        return new PagedFlux<>(() -> listByServerSinglePageAsync(resourceGroupName, serverName, context),
            nextLink -> listByServerNextSinglePageAsync(nextLink, context));
    }

    /**
     * List all the server log files in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of logFiles as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LogFileInner> listByServer(String resourceGroupName, String serverName) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName));
    }

    /**
     * List all the server log files in a given server.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of logFiles as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LogFileInner> listByServer(String resourceGroupName, String serverName, Context context) {
        return new PagedIterable<>(listByServerAsync(resourceGroupName, serverName, context));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of logFiles along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LogFileInner>> listByServerNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByServerNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<LogFileInner>>map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(),
                res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink The URL to get the next list of items
     * 
     * The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a List of logFiles along with {@link PagedResponse} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<LogFileInner>> listByServerNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByServerNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
