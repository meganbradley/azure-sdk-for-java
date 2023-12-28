// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.support.fluent.FileWorkspacesNoSubscriptionsClient;
import com.azure.resourcemanager.support.fluent.models.FileWorkspaceDetailsInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in FileWorkspacesNoSubscriptionsClient. */
public final class FileWorkspacesNoSubscriptionsClientImpl implements FileWorkspacesNoSubscriptionsClient {
    /** The proxy service used to perform REST calls. */
    private final FileWorkspacesNoSubscriptionsService service;

    /** The service client containing this operation class. */
    private final MicrosoftSupportImpl client;

    /**
     * Initializes an instance of FileWorkspacesNoSubscriptionsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    FileWorkspacesNoSubscriptionsClientImpl(MicrosoftSupportImpl client) {
        this.service =
            RestProxy
                .create(
                    FileWorkspacesNoSubscriptionsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MicrosoftSupportFileWorkspacesNoSubscriptions to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MicrosoftSupportFile")
    public interface FileWorkspacesNoSubscriptionsService {
        @Headers({"Content-Type: application/json"})
        @Get("/providers/Microsoft.Support/fileWorkspaces/{fileWorkspaceName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<FileWorkspaceDetailsInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("fileWorkspaceName") String fileWorkspaceName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Put("/providers/Microsoft.Support/fileWorkspaces/{fileWorkspaceName}")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<FileWorkspaceDetailsInner>> create(
            @HostParam("$host") String endpoint,
            @PathParam("fileWorkspaceName") String fileWorkspaceName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets details for a specific file workspace.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details for a specific file workspace along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<FileWorkspaceDetailsInner>> getWithResponseAsync(String fileWorkspaceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (fileWorkspaceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fileWorkspaceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(), fileWorkspaceName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets details for a specific file workspace.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details for a specific file workspace along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<FileWorkspaceDetailsInner>> getWithResponseAsync(String fileWorkspaceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (fileWorkspaceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fileWorkspaceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), fileWorkspaceName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Gets details for a specific file workspace.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details for a specific file workspace on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<FileWorkspaceDetailsInner> getAsync(String fileWorkspaceName) {
        return getWithResponseAsync(fileWorkspaceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets details for a specific file workspace.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details for a specific file workspace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<FileWorkspaceDetailsInner> getWithResponse(String fileWorkspaceName, Context context) {
        return getWithResponseAsync(fileWorkspaceName, context).block();
    }

    /**
     * Gets details for a specific file workspace.
     *
     * @param fileWorkspaceName File Workspace Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details for a specific file workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileWorkspaceDetailsInner get(String fileWorkspaceName) {
        return getWithResponse(fileWorkspaceName, Context.NONE).getValue();
    }

    /**
     * Creates a new file workspace.
     *
     * @param fileWorkspaceName File workspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents FileWorkspaceDetails resource along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<FileWorkspaceDetailsInner>> createWithResponseAsync(String fileWorkspaceName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (fileWorkspaceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fileWorkspaceName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .create(
                            this.client.getEndpoint(), fileWorkspaceName, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Creates a new file workspace.
     *
     * @param fileWorkspaceName File workspace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents FileWorkspaceDetails resource along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<FileWorkspaceDetailsInner>> createWithResponseAsync(
        String fileWorkspaceName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (fileWorkspaceName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter fileWorkspaceName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .create(this.client.getEndpoint(), fileWorkspaceName, this.client.getApiVersion(), accept, context);
    }

    /**
     * Creates a new file workspace.
     *
     * @param fileWorkspaceName File workspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents FileWorkspaceDetails resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<FileWorkspaceDetailsInner> createAsync(String fileWorkspaceName) {
        return createWithResponseAsync(fileWorkspaceName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Creates a new file workspace.
     *
     * @param fileWorkspaceName File workspace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents FileWorkspaceDetails resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<FileWorkspaceDetailsInner> createWithResponse(String fileWorkspaceName, Context context) {
        return createWithResponseAsync(fileWorkspaceName, context).block();
    }

    /**
     * Creates a new file workspace.
     *
     * @param fileWorkspaceName File workspace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return object that represents FileWorkspaceDetails resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public FileWorkspaceDetailsInner create(String fileWorkspaceName) {
        return createWithResponse(fileWorkspaceName, Context.NONE).getValue();
    }
}
