// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.implementation;

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
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in Applications. */
public final class ApplicationsImpl {
    /** The proxy service used to perform REST calls. */
    private final ApplicationsService service;

    /** The service client containing this operation class. */
    private final BatchServiceClientImpl client;

    /**
     * Initializes an instance of ApplicationsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ApplicationsImpl(BatchServiceClientImpl client) {
        this.service =
                RestProxy.create(ApplicationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for BatchServiceClientApplications to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "BatchServiceClientAp")
    public interface ApplicationsService {
        @Get("/applications")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> list(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/applications")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listSync(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/applications/{applicationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> get(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("applicationId") String applicationId,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("/applications/{applicationId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> getSync(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("applicationId") String applicationId,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<BinaryData>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = ClientAuthenticationException.class,
                code = {401})
        @UnexpectedResponseExceptionType(
                value = ResourceNotFoundException.class,
                code = {404})
        @UnexpectedResponseExceptionType(
                value = ResourceModifiedException.class,
                code = {409})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<BinaryData> listNextSync(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("endpoint") String endpoint,
                @HeaderParam("accept") String accept,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Lists all of the applications available in the specified Account.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>maxresults</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>OffsetDateTime</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of listing the applications available in an Account along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listSinglePageAsync(RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.list(
                                        this.client.getEndpoint(),
                                        this.client.getServiceVersion().getVersion(),
                                        accept,
                                        requestOptions,
                                        context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * Lists all of the applications available in the specified Account.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>maxresults</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>OffsetDateTime</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of listing the applications available in an Account as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listAsync(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
                requestOptions != null && requestOptions.getContext() != null
                        ? requestOptions.getContext()
                        : Context.NONE);
        return new PagedFlux<>(
                () -> listSinglePageAsync(requestOptions),
                nextLink -> listNextSinglePageAsync(nextLink, requestOptionsForNextPage));
    }

    /**
     * Lists all of the applications available in the specified Account.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>maxresults</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>OffsetDateTime</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of listing the applications available in an Account along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listSinglePage(RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res =
                service.listSync(
                        this.client.getEndpoint(),
                        this.client.getServiceVersion().getVersion(),
                        accept,
                        requestOptions,
                        Context.NONE);
        return new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                getValues(res.getValue(), "value"),
                getNextLink(res.getValue(), "odata.nextLink"),
                null);
    }

    /**
     * Lists all of the applications available in the specified Account.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>maxresults</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>OffsetDateTime</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of listing the applications available in an Account as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(RequestOptions requestOptions) {
        RequestOptions requestOptionsForNextPage = new RequestOptions();
        requestOptionsForNextPage.setContext(
                requestOptions != null && requestOptions.getContext() != null
                        ? requestOptions.getContext()
                        : Context.NONE);
        return new PagedIterable<>(
                () -> listSinglePage(requestOptions),
                nextLink -> listNextSinglePage(nextLink, requestOptionsForNextPage));
    }

    /**
     * Gets information about the specified Application.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about Applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>OffsetDateTime</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param applicationId The ID of the Application.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return contains information about an application in an Azure Batch Account along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getWithResponseAsync(String applicationId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.get(
                                this.client.getEndpoint(),
                                this.client.getServiceVersion().getVersion(),
                                applicationId,
                                accept,
                                requestOptions,
                                context));
    }

    /**
     * Gets information about the specified Application.
     *
     * <p>This operation returns only Applications and versions that are available for use on Compute Nodes; that is,
     * that can be used in an Package reference. For administrator information about Applications and versions that are
     * not yet available to Compute Nodes, use the Azure portal or the Azure Resource Manager API.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>OffsetDateTime</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param applicationId The ID of the Application.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return contains information about an application in an Azure Batch Account along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(String applicationId, RequestOptions requestOptions) {
        final String accept = "application/json";
        return service.getSync(
                this.client.getEndpoint(),
                this.client.getServiceVersion().getVersion(),
                applicationId,
                accept,
                requestOptions,
                Context.NONE);
    }

    /**
     * Lists all of the applications available in the specified Account.
     *
     * <p>Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>OffsetDateTime</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of listing the applications available in an Account along with {@link PagedResponse} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<BinaryData>> listNextSinglePageAsync(String nextLink, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.listNext(nextLink, this.client.getEndpoint(), accept, requestOptions, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        getValues(res.getValue(), "value"),
                                        getNextLink(res.getValue(), "odata.nextLink"),
                                        null));
    }

    /**
     * Lists all of the applications available in the specified Account.
     *
     * <p>Get the next page of items.
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>ocp-date</td><td>OffsetDateTime</td><td>No</td><td>The time the request was issued. Client libraries typically set this to the
     * current system clock time; set it explicitly if you are calling the REST API
     * directly.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     displayName: String (Required)
     *     versions (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param nextLink The URL to get the next list of items
     *     <p>The nextLink parameter.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of listing the applications available in an Account along with {@link PagedResponse}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private PagedResponse<BinaryData> listNextSinglePage(String nextLink, RequestOptions requestOptions) {
        final String accept = "application/json";
        Response<BinaryData> res =
                service.listNextSync(nextLink, this.client.getEndpoint(), accept, requestOptions, Context.NONE);
        return new PagedResponseBase<>(
                res.getRequest(),
                res.getStatusCode(),
                res.getHeaders(),
                getValues(res.getValue(), "value"),
                getNextLink(res.getValue(), "odata.nextLink"),
                null);
    }

    private List<BinaryData> getValues(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            List<?> values = (List<?>) obj.get(path);
            return values.stream().map(BinaryData::fromObject).collect(Collectors.toList());
        } catch (RuntimeException e) {
            return null;
        }
    }

    private String getNextLink(BinaryData binaryData, String path) {
        try {
            Map<?, ?> obj = binaryData.toObject(Map.class);
            return (String) obj.get(path);
        } catch (RuntimeException e) {
            return null;
        }
    }
}
