// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import com.azure.developer.devcenter.implementation.DevCenterClientImpl;
import com.azure.developer.devcenter.models.DevCenterProject;
import java.util.stream.Collectors;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.azure.developer.devcenter.implementation.DeploymentEnvironmentsClientImpl;
import com.azure.developer.devcenter.implementation.DevBoxesClientImpl;

/**
 * Initializes a new instance of the asynchronous DevCenterClient type.
 */
@ServiceClient(builder = DevCenterClientBuilder.class, isAsync = true)
public final class DevCenterAsyncClient {

    @Generated
    private final DevCenterClientImpl serviceClient;

    /**
     * Initializes an instance of DevCenterAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    DevCenterAsyncClient(DevCenterClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Initializes a new instance of DevBoxesAsyncClient from DevCenterAsyncClient.
     * 
     * @return Dev Boxes Async Client  
     */
    public DevBoxesAsyncClient getDevBoxesAsyncClient() {
        return new DevBoxesAsyncClient(new DevBoxesClientImpl(serviceClient.getHttpPipeline(),
            serviceClient.getSerializerAdapter(), serviceClient.getEndpoint(), serviceClient.getServiceVersion()));
    }

    /**
     * Initializes a new instance of DeploymentEnvironmentsAsyncClient from DevCenterAsyncClient.
     * 
     * @return Deployment Environments Async Client  
     */
    public DeploymentEnvironmentsAsyncClient getDeploymentEnvironmentsAsyncClient() {
        return new DeploymentEnvironmentsAsyncClient(
            new DeploymentEnvironmentsClientImpl(serviceClient.getHttpPipeline(), serviceClient.getSerializerAdapter(),
                serviceClient.getEndpoint(), serviceClient.getServiceVersion()));
    }

    /**
     * Lists all projects.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return paged collection of Project items as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<BinaryData> listProjects(RequestOptions requestOptions) {
        return this.serviceClient.listProjectsAsync(requestOptions);
    }

    /**
     * Gets a project.
     * <p><strong>Response Body Schema</strong></p>
     * 
     * <pre>{@code
     * {
     *     name: String (Required)
     *     description: String (Optional)
     *     maxDevBoxesPerUser: Integer (Optional)
     * }
     * }</pre>
     *
     * @param projectName Name of the project.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return a project along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getProjectWithResponse(String projectName, RequestOptions requestOptions) {
        return this.serviceClient.getProjectWithResponseAsync(projectName, requestOptions);
    }

    /**
     * Lists all projects.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged collection of Project items as paginated response with {@link PagedFlux}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<DevCenterProject> listProjects() {
        // Generated convenience method for listProjects
        RequestOptions requestOptions = new RequestOptions();
        PagedFlux<BinaryData> pagedFluxResponse = listProjects(requestOptions);
        return PagedFlux.create(() -> (continuationToken, pageSize) -> {
            Flux<PagedResponse<BinaryData>> flux = (continuationToken == null)
                ? pagedFluxResponse.byPage().take(1)
                : pagedFluxResponse.byPage(continuationToken).take(1);
            return flux.map(pagedResponse -> new PagedResponseBase<Void, DevCenterProject>(pagedResponse.getRequest(),
                pagedResponse.getStatusCode(), pagedResponse.getHeaders(),
                pagedResponse.getValue()
                    .stream()
                    .map(protocolMethodData -> protocolMethodData.toObject(DevCenterProject.class))
                    .collect(Collectors.toList()),
                pagedResponse.getContinuationToken(), null));
        });
    }

    /**
     * Gets a project.
     *
     * @param projectName Name of the project.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a project on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DevCenterProject> getProject(String projectName) {
        // Generated convenience method for getProjectWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getProjectWithResponse(projectName, requestOptions).flatMap(FluxUtil::toMono)
            .map(protocolMethodData -> protocolMethodData.toObject(DevCenterProject.class));
    }
}
