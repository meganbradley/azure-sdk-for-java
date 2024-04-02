// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

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
import com.azure.resourcemanager.security.fluent.GitHubReposClient;
import com.azure.resourcemanager.security.fluent.models.GitHubRepositoryInner;
import com.azure.resourcemanager.security.models.GitHubRepositoryListResponse;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in GitHubReposClient.
 */
public final class GitHubReposClientImpl implements GitHubReposClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final GitHubReposService service;

    /**
     * The service client containing this operation class.
     */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of GitHubReposClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    GitHubReposClientImpl(SecurityCenterImpl client) {
        this.service
            = RestProxy.create(GitHubReposService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterGitHubRepos to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterGitHub")
    public interface GitHubReposService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName}/devops/default/gitHubOwners/{ownerName}/repos")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GitHubRepositoryListResponse>> list(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("securityConnectorName") String securityConnectorName, @PathParam("ownerName") String ownerName,
            @QueryParam("api-version") String apiVersion, @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Security/securityConnectors/{securityConnectorName}/devops/default/gitHubOwners/{ownerName}/repos/{repoName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GitHubRepositoryInner>> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("securityConnectorName") String securityConnectorName, @PathParam("ownerName") String ownerName,
            @PathParam("repoName") String repoName, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);

        @Headers({ "Content-Type: application/json" })
        @Get("{nextLink}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<GitHubRepositoryListResponse>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Returns a list of GitHub repositories onboarded to the connector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RP resources which supports pagination along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<GitHubRepositoryInner>> listSinglePageAsync(String resourceGroupName,
        String securityConnectorName, String ownerName) {
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
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ownerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ownerName is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, securityConnectorName, ownerName, apiVersion, accept, context))
            .<PagedResponse<GitHubRepositoryInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
                res.getStatusCode(), res.getHeaders(), res.getValue().value(), res.getValue().nextLink(), null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns a list of GitHub repositories onboarded to the connector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RP resources which supports pagination along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<GitHubRepositoryInner>> listSinglePageAsync(String resourceGroupName,
        String securityConnectorName, String ownerName, Context context) {
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
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ownerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ownerName is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName, securityConnectorName,
                ownerName, apiVersion, accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }

    /**
     * Returns a list of GitHub repositories onboarded to the connector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RP resources which supports pagination as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<GitHubRepositoryInner> listAsync(String resourceGroupName, String securityConnectorName,
        String ownerName) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, securityConnectorName, ownerName),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Returns a list of GitHub repositories onboarded to the connector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RP resources which supports pagination as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<GitHubRepositoryInner> listAsync(String resourceGroupName, String securityConnectorName,
        String ownerName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(resourceGroupName, securityConnectorName, ownerName, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Returns a list of GitHub repositories onboarded to the connector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RP resources which supports pagination as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GitHubRepositoryInner> list(String resourceGroupName, String securityConnectorName,
        String ownerName) {
        return new PagedIterable<>(listAsync(resourceGroupName, securityConnectorName, ownerName));
    }

    /**
     * Returns a list of GitHub repositories onboarded to the connector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RP resources which supports pagination as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<GitHubRepositoryInner> list(String resourceGroupName, String securityConnectorName,
        String ownerName, Context context) {
        return new PagedIterable<>(listAsync(resourceGroupName, securityConnectorName, ownerName, context));
    }

    /**
     * Returns a monitored GitHub repository.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @param repoName The repository name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub Repository resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GitHubRepositoryInner>> getWithResponseAsync(String resourceGroupName,
        String securityConnectorName, String ownerName, String repoName) {
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
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ownerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ownerName is required and cannot be null."));
        }
        if (repoName == null) {
            return Mono.error(new IllegalArgumentException("Parameter repoName is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(),
                resourceGroupName, securityConnectorName, ownerName, repoName, apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns a monitored GitHub repository.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @param repoName The repository name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub Repository resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<GitHubRepositoryInner>> getWithResponseAsync(String resourceGroupName,
        String securityConnectorName, String ownerName, String repoName, Context context) {
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
        if (securityConnectorName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter securityConnectorName is required and cannot be null."));
        }
        if (ownerName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ownerName is required and cannot be null."));
        }
        if (repoName == null) {
            return Mono.error(new IllegalArgumentException("Parameter repoName is required and cannot be null."));
        }
        final String apiVersion = "2023-09-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), resourceGroupName,
            securityConnectorName, ownerName, repoName, apiVersion, accept, context);
    }

    /**
     * Returns a monitored GitHub repository.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @param repoName The repository name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub Repository resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<GitHubRepositoryInner> getAsync(String resourceGroupName, String securityConnectorName,
        String ownerName, String repoName) {
        return getWithResponseAsync(resourceGroupName, securityConnectorName, ownerName, repoName)
            .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Returns a monitored GitHub repository.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @param repoName The repository name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub Repository resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<GitHubRepositoryInner> getWithResponse(String resourceGroupName, String securityConnectorName,
        String ownerName, String repoName, Context context) {
        return getWithResponseAsync(resourceGroupName, securityConnectorName, ownerName, repoName, context).block();
    }

    /**
     * Returns a monitored GitHub repository.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param ownerName The GitHub owner name.
     * @param repoName The repository name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitHub Repository resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GitHubRepositoryInner get(String resourceGroupName, String securityConnectorName, String ownerName,
        String repoName) {
        return getWithResponse(resourceGroupName, securityConnectorName, ownerName, repoName, Context.NONE).getValue();
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
     * @return list of RP resources which supports pagination along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<GitHubRepositoryInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<GitHubRepositoryInner>>map(res -> new PagedResponseBase<>(res.getRequest(),
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
     * @return list of RP resources which supports pagination along with {@link PagedResponse} on successful completion
     * of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<GitHubRepositoryInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(res -> new PagedResponseBase<>(res.getRequest(), res.getStatusCode(), res.getHeaders(),
                res.getValue().value(), res.getValue().nextLink(), null));
    }
}
