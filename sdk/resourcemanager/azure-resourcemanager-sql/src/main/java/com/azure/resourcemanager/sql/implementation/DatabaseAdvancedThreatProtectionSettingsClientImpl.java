// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
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
import com.azure.resourcemanager.sql.fluent.DatabaseAdvancedThreatProtectionSettingsClient;
import com.azure.resourcemanager.sql.fluent.models.DatabaseAdvancedThreatProtectionInner;
import com.azure.resourcemanager.sql.models.AdvancedThreatProtectionName;
import com.azure.resourcemanager.sql.models.DatabaseAdvancedThreatProtectionListResult;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * DatabaseAdvancedThreatProtectionSettingsClient.
 */
public final class DatabaseAdvancedThreatProtectionSettingsClientImpl
    implements DatabaseAdvancedThreatProtectionSettingsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final DatabaseAdvancedThreatProtectionSettingsService service;

    /**
     * The service client containing this operation class.
     */
    private final SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseAdvancedThreatProtectionSettingsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    DatabaseAdvancedThreatProtectionSettingsClientImpl(SqlManagementClientImpl client) {
        this.service = RestProxy.create(DatabaseAdvancedThreatProtectionSettingsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientDatabaseAdvancedThreatProtectionSettings to be
     * used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientD")
    public interface DatabaseAdvancedThreatProtectionSettingsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/advancedThreatProtectionSettings")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseAdvancedThreatProtectionListResult>> listByDatabase(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName, @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/advancedThreatProtectionSettings/{advancedThreatProtectionName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseAdvancedThreatProtectionInner>> get(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advancedThreatProtectionName") AdvancedThreatProtectionName advancedThreatProtectionName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/advancedThreatProtectionSettings/{advancedThreatProtectionName}")
        @ExpectedResponses({ 200, 201 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseAdvancedThreatProtectionInner>> createOrUpdate(@HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName, @PathParam("serverName") String serverName,
            @PathParam("databaseName") String databaseName,
            @PathParam("advancedThreatProtectionName") AdvancedThreatProtectionName advancedThreatProtectionName,
            @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") DatabaseAdvancedThreatProtectionInner parameters,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DatabaseAdvancedThreatProtectionListResult>> listByDatabaseNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Gets a list of database's Advanced Threat Protection states.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database's Advanced Threat Protection states along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseAdvancedThreatProtectionInner>>
        listByDatabaseSinglePageAsync(String resourceGroupName, String serverName, String databaseName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByDatabase(this.client.getEndpoint(), resourceGroupName, serverName,
                databaseName, this.client.getSubscriptionId(), apiVersion, accept, context))
            .<PagedResponse<DatabaseAdvancedThreatProtectionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a list of database's Advanced Threat Protection states.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database's Advanced Threat Protection states along with {@link PagedResponse} on successful
     * completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseAdvancedThreatProtectionInner>> listByDatabaseSinglePageAsync(
        String resourceGroupName, String serverName, String databaseName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listByDatabase(this.client.getEndpoint(), resourceGroupName, serverName, databaseName,
                this.client.getSubscriptionId(), apiVersion, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Gets a list of database's Advanced Threat Protection states.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database's Advanced Threat Protection states as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DatabaseAdvancedThreatProtectionInner> listByDatabaseAsync(String resourceGroupName,
        String serverName, String databaseName) {
        return new PagedFlux<>(() -> listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of database's Advanced Threat Protection states.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database's Advanced Threat Protection states as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DatabaseAdvancedThreatProtectionInner> listByDatabaseAsync(String resourceGroupName,
        String serverName, String databaseName, Context context) {
        return new PagedFlux<>(
            () -> listByDatabaseSinglePageAsync(resourceGroupName, serverName, databaseName, context),
            nextLink -> listByDatabaseNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of database's Advanced Threat Protection states.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database's Advanced Threat Protection states as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DatabaseAdvancedThreatProtectionInner> listByDatabase(String resourceGroupName,
        String serverName, String databaseName) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, serverName, databaseName));
    }

    /**
     * Gets a list of database's Advanced Threat Protection states.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of database's Advanced Threat Protection states as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DatabaseAdvancedThreatProtectionInner> listByDatabase(String resourceGroupName,
        String serverName, String databaseName, Context context) {
        return new PagedIterable<>(listByDatabaseAsync(resourceGroupName, serverName, databaseName, context));
    }

    /**
     * Gets a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's Advanced Threat Protection state along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatabaseAdvancedThreatProtectionInner>> getWithResponseAsync(String resourceGroupName,
        String serverName, String databaseName, AdvancedThreatProtectionName advancedThreatProtectionName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advancedThreatProtectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter advancedThreatProtectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), resourceGroupName, serverName, databaseName,
                advancedThreatProtectionName, this.client.getSubscriptionId(), apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's Advanced Threat Protection state along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DatabaseAdvancedThreatProtectionInner>> getWithResponseAsync(String resourceGroupName,
        String serverName, String databaseName, AdvancedThreatProtectionName advancedThreatProtectionName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advancedThreatProtectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter advancedThreatProtectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2021-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), resourceGroupName, serverName, databaseName,
            advancedThreatProtectionName, this.client.getSubscriptionId(), apiVersion, accept, context);
    }

    /**
     * Gets a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's Advanced Threat Protection state on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseAdvancedThreatProtectionInner> getAsync(String resourceGroupName, String serverName,
        String databaseName, AdvancedThreatProtectionName advancedThreatProtectionName) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, advancedThreatProtectionName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's Advanced Threat Protection state along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DatabaseAdvancedThreatProtectionInner> getWithResponse(String resourceGroupName, String serverName,
        String databaseName, AdvancedThreatProtectionName advancedThreatProtectionName, Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, databaseName, advancedThreatProtectionName, context)
            .block();
    }

    /**
     * Gets a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database's Advanced Threat Protection state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseAdvancedThreatProtectionInner get(String resourceGroupName, String serverName, String databaseName,
        AdvancedThreatProtectionName advancedThreatProtectionName) {
        return getWithResponse(resourceGroupName, serverName, databaseName, advancedThreatProtectionName, Context.NONE)
            .getValue();
    }

    /**
     * Creates or updates a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param parameters The database Advanced Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database Advanced Threat Protection along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DatabaseAdvancedThreatProtectionInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName,
        AdvancedThreatProtectionName advancedThreatProtectionName, DatabaseAdvancedThreatProtectionInner parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advancedThreatProtectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter advancedThreatProtectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2021-11-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.createOrUpdate(this.client.getEndpoint(), resourceGroupName, serverName,
                databaseName, advancedThreatProtectionName, this.client.getSubscriptionId(), apiVersion, parameters,
                accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates or updates a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param parameters The database Advanced Threat Protection state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database Advanced Threat Protection along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<DatabaseAdvancedThreatProtectionInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String serverName, String databaseName,
        AdvancedThreatProtectionName advancedThreatProtectionName, DatabaseAdvancedThreatProtectionInner parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (databaseName == null) {
            return Mono.error(new IllegalArgumentException("Parameter databaseName is required and cannot be null."));
        }
        if (advancedThreatProtectionName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter advancedThreatProtectionName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String apiVersion = "2021-11-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.createOrUpdate(this.client.getEndpoint(), resourceGroupName, serverName, databaseName,
            advancedThreatProtectionName, this.client.getSubscriptionId(), apiVersion, parameters, accept, context);
    }

    /**
     * Creates or updates a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param parameters The database Advanced Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database Advanced Threat Protection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DatabaseAdvancedThreatProtectionInner> createOrUpdateAsync(String resourceGroupName, String serverName,
        String databaseName, AdvancedThreatProtectionName advancedThreatProtectionName,
        DatabaseAdvancedThreatProtectionInner parameters) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName,
            advancedThreatProtectionName, parameters).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates or updates a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param parameters The database Advanced Threat Protection state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database Advanced Threat Protection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DatabaseAdvancedThreatProtectionInner> createOrUpdateWithResponse(String resourceGroupName,
        String serverName, String databaseName, AdvancedThreatProtectionName advancedThreatProtectionName,
        DatabaseAdvancedThreatProtectionInner parameters, Context context) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, databaseName,
            advancedThreatProtectionName, parameters, context).block();
    }

    /**
     * Creates or updates a database's Advanced Threat Protection state.
     * 
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     * from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advancedThreatProtectionName The name of the Advanced Threat Protection state.
     * @param parameters The database Advanced Threat Protection state.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a database Advanced Threat Protection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DatabaseAdvancedThreatProtectionInner createOrUpdate(String resourceGroupName, String serverName,
        String databaseName, AdvancedThreatProtectionName advancedThreatProtectionName,
        DatabaseAdvancedThreatProtectionInner parameters) {
        return createOrUpdateWithResponse(resourceGroupName, serverName, databaseName, advancedThreatProtectionName,
            parameters, Context.NONE).getValue();
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
     * @return a list of the database's Advanced Threat Protection configurations along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseAdvancedThreatProtectionInner>>
        listByDatabaseNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listByDatabaseNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DatabaseAdvancedThreatProtectionInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
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
     * @return a list of the database's Advanced Threat Protection configurations along with {@link PagedResponse} on
     * successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DatabaseAdvancedThreatProtectionInner>>
        listByDatabaseNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listByDatabaseNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
