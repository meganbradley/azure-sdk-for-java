// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.openai.implementation;

import com.azure.ai.openai.OpenAIServiceVersion;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the OpenAIClient type. */
public final class OpenAIClientImpl {
    /** The proxy service used to perform REST calls. */
    private final OpenAIClientService service;

    /**
     * Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://westus.api.cognitive.microsoft.com).
     */
    private final String endpoint;

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example:
     * https://westus.api.cognitive.microsoft.com).
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Service version. */
    private final OpenAIServiceVersion serviceVersion;

    /**
     * Gets Service version.
     *
     * @return the serviceVersion value.
     */
    public OpenAIServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of OpenAIClient client.
     *
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     *     https://westus.api.cognitive.microsoft.com).
     * @param serviceVersion Service version.
     */
    public OpenAIClientImpl(String endpoint, OpenAIServiceVersion serviceVersion) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                endpoint,
                serviceVersion);
    }

    /**
     * Initializes an instance of OpenAIClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     *     https://westus.api.cognitive.microsoft.com).
     * @param serviceVersion Service version.
     */
    public OpenAIClientImpl(HttpPipeline httpPipeline, String endpoint, OpenAIServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of OpenAIClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint Supported Cognitive Services endpoints (protocol and hostname, for example:
     *     https://westus.api.cognitive.microsoft.com).
     * @param serviceVersion Service version.
     */
    public OpenAIClientImpl(
            HttpPipeline httpPipeline,
            SerializerAdapter serializerAdapter,
            String endpoint,
            OpenAIServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.service = RestProxy.create(OpenAIClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for OpenAIClient to be used by the proxy service to perform REST calls.
     */
    @Host("{endpoint}/openai")
    @ServiceInterface(name = "OpenAIClient")
    public interface OpenAIClientService {
        @Post("/deployments/{deploymentId}/embeddings")
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
        Mono<Response<BinaryData>> getEmbeddings(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("deploymentId") String deploymentId,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData embeddingsOptions,
                RequestOptions requestOptions,
                Context context);

        @Post("/deployments/{deploymentId}/completions")
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
        Mono<Response<BinaryData>> getCompletions(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("deploymentId") String deploymentId,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData completionsOptions,
                RequestOptions requestOptions,
                Context context);

        @Post("/deployments/{deploymentId}/chat/completions")
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
        Mono<Response<BinaryData>> getChatCompletions(
                @HostParam("endpoint") String endpoint,
                @QueryParam("api-version") String apiVersion,
                @PathParam("deploymentId") String deploymentId,
                @HeaderParam("accept") String accept,
                @BodyParam("application/json") BinaryData chatCompletionsOptions,
                RequestOptions requestOptions,
                Context context);
    }

    /**
     * Return the embeddings for a given prompt.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     user: String (Optional)
     *     model: String (Optional)
     *     input: InputModelBase (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     data (Required): [
     *          (Required){
     *             embedding (Required): [
     *                 double (Required)
     *             ]
     *             index: int (Required)
     *         }
     *     ]
     *     usage (Required): {
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param embeddingsOptions The configuration information for an embeddings request. Embeddings measure the
     *     relatedness of text strings and are commonly used for search, clustering, recommendations, and other similar
     *     scenarios.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return representation of the response data from an embeddings request. Embeddings measure the relatedness of
     *     text strings and are commonly used for search, clustering, recommendations, and other similar scenarios along
     *     with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getEmbeddingsWithResponseAsync(
            String deploymentId, BinaryData embeddingsOptions, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.getEmbeddings(
                                this.getEndpoint(),
                                this.getServiceVersion().getVersion(),
                                deploymentId,
                                accept,
                                embeddingsOptions,
                                requestOptions,
                                context));
    }

    /**
     * Return the embeddings for a given prompt.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     user: String (Optional)
     *     model: String (Optional)
     *     input: InputModelBase (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     data (Required): [
     *          (Required){
     *             embedding (Required): [
     *                 double (Required)
     *             ]
     *             index: int (Required)
     *         }
     *     ]
     *     usage (Required): {
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param embeddingsOptions The configuration information for an embeddings request. Embeddings measure the
     *     relatedness of text strings and are commonly used for search, clustering, recommendations, and other similar
     *     scenarios.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return representation of the response data from an embeddings request. Embeddings measure the relatedness of
     *     text strings and are commonly used for search, clustering, recommendations, and other similar scenarios along
     *     with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getEmbeddingsWithResponse(
            String deploymentId, BinaryData embeddingsOptions, RequestOptions requestOptions) {
        return getEmbeddingsWithResponseAsync(deploymentId, embeddingsOptions, requestOptions).block();
    }

    /**
     * Gets completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     * that continues from or "completes" provided prompt data.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     prompt (Required): [
     *         String (Required)
     *     ]
     *     max_tokens: Integer (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     logit_bias (Optional): {
     *         String: int (Optional)
     *     }
     *     user: String (Optional)
     *     n: Integer (Optional)
     *     logprobs: Integer (Optional)
     *     echo: Boolean (Optional)
     *     stop (Optional): [
     *         String (Optional)
     *     ]
     *     presence_penalty: Double (Optional)
     *     frequency_penalty: Double (Optional)
     *     best_of: Integer (Optional)
     *     stream: Boolean (Optional)
     *     model: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     created: int (Required)
     *     choices (Required): [
     *          (Required){
     *             text: String (Required)
     *             index: int (Required)
     *             logprobs (Required): {
     *                 tokens (Required): [
     *                     String (Required)
     *                 ]
     *                 token_logprobs (Required): [
     *                     double (Required)
     *                 ]
     *                 top_logprobs (Required): [
     *                      (Required){
     *                         String: double (Required)
     *                     }
     *                 ]
     *                 text_offset (Required): [
     *                     int (Required)
     *                 ]
     *             }
     *             finish_reason: String(stopped/tokenLimitReached/contentFiltered) (Required)
     *         }
     *     ]
     *     usage (Required): {
     *         completion_tokens: int (Required)
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param completionsOptions The configuration information for a completions request. Completions support a wide
     *     variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     *     that continues from or "completes" provided prompt data along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getCompletionsWithResponseAsync(
            String deploymentId, BinaryData completionsOptions, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.getCompletions(
                                this.getEndpoint(),
                                this.getServiceVersion().getVersion(),
                                deploymentId,
                                accept,
                                completionsOptions,
                                requestOptions,
                                context));
    }

    /**
     * Gets completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     * that continues from or "completes" provided prompt data.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     prompt (Required): [
     *         String (Required)
     *     ]
     *     max_tokens: Integer (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     logit_bias (Optional): {
     *         String: int (Optional)
     *     }
     *     user: String (Optional)
     *     n: Integer (Optional)
     *     logprobs: Integer (Optional)
     *     echo: Boolean (Optional)
     *     stop (Optional): [
     *         String (Optional)
     *     ]
     *     presence_penalty: Double (Optional)
     *     frequency_penalty: Double (Optional)
     *     best_of: Integer (Optional)
     *     stream: Boolean (Optional)
     *     model: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     created: int (Required)
     *     choices (Required): [
     *          (Required){
     *             text: String (Required)
     *             index: int (Required)
     *             logprobs (Required): {
     *                 tokens (Required): [
     *                     String (Required)
     *                 ]
     *                 token_logprobs (Required): [
     *                     double (Required)
     *                 ]
     *                 top_logprobs (Required): [
     *                      (Required){
     *                         String: double (Required)
     *                     }
     *                 ]
     *                 text_offset (Required): [
     *                     int (Required)
     *                 ]
     *             }
     *             finish_reason: String(stopped/tokenLimitReached/contentFiltered) (Required)
     *         }
     *     ]
     *     usage (Required): {
     *         completion_tokens: int (Required)
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param completionsOptions The configuration information for a completions request. Completions support a wide
     *     variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return completions for the provided input prompts. Completions support a wide variety of tasks and generate text
     *     that continues from or "completes" provided prompt data along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCompletionsWithResponse(
            String deploymentId, BinaryData completionsOptions, RequestOptions requestOptions) {
        return getCompletionsWithResponseAsync(deploymentId, completionsOptions, requestOptions).block();
    }

    /**
     * Gets chat completions for the provided chat messages. Completions support a wide variety of tasks and generate
     * text that continues from or "completes" provided prompt data.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     messages (Required): [
     *          (Required){
     *             role: String(system/assistant/user) (Required)
     *             content: String (Optional)
     *         }
     *     ]
     *     max_tokens: Integer (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     logit_bias (Optional): {
     *         String: int (Optional)
     *     }
     *     user: String (Optional)
     *     n: Integer (Optional)
     *     stop (Optional): [
     *         String (Optional)
     *     ]
     *     presence_penalty: Double (Optional)
     *     frequency_penalty: Double (Optional)
     *     stream: Boolean (Optional)
     *     model: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     created: int (Required)
     *     choices (Required): [
     *          (Required){
     *             message (Optional): {
     *                 role: String(system/assistant/user) (Required)
     *                 content: String (Optional)
     *             }
     *             index: int (Required)
     *             finish_reason: String(stopped/tokenLimitReached/contentFiltered) (Required)
     *             delta (Optional): (recursive schema, see delta above)
     *         }
     *     ]
     *     usage (Required): {
     *         completion_tokens: int (Required)
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param chatCompletionsOptions The configuration information for a chat completions request. Completions support a
     *     wide variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return chat completions for the provided chat messages. Completions support a wide variety of tasks and generate
     *     text that continues from or "completes" provided prompt data along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> getChatCompletionsWithResponseAsync(
            String deploymentId, BinaryData chatCompletionsOptions, RequestOptions requestOptions) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context ->
                        service.getChatCompletions(
                                this.getEndpoint(),
                                this.getServiceVersion().getVersion(),
                                deploymentId,
                                accept,
                                chatCompletionsOptions,
                                requestOptions,
                                context));
    }

    /**
     * Gets chat completions for the provided chat messages. Completions support a wide variety of tasks and generate
     * text that continues from or "completes" provided prompt data.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     messages (Required): [
     *          (Required){
     *             role: String(system/assistant/user) (Required)
     *             content: String (Optional)
     *         }
     *     ]
     *     max_tokens: Integer (Optional)
     *     temperature: Double (Optional)
     *     top_p: Double (Optional)
     *     logit_bias (Optional): {
     *         String: int (Optional)
     *     }
     *     user: String (Optional)
     *     n: Integer (Optional)
     *     stop (Optional): [
     *         String (Optional)
     *     ]
     *     presence_penalty: Double (Optional)
     *     frequency_penalty: Double (Optional)
     *     stream: Boolean (Optional)
     *     model: String (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     created: int (Required)
     *     choices (Required): [
     *          (Required){
     *             message (Optional): {
     *                 role: String(system/assistant/user) (Required)
     *                 content: String (Optional)
     *             }
     *             index: int (Required)
     *             finish_reason: String(stopped/tokenLimitReached/contentFiltered) (Required)
     *             delta (Optional): (recursive schema, see delta above)
     *         }
     *     ]
     *     usage (Required): {
     *         completion_tokens: int (Required)
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param chatCompletionsOptions The configuration information for a chat completions request. Completions support a
     *     wide variety of tasks and generate text that continues from or "completes" provided prompt data.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return chat completions for the provided chat messages. Completions support a wide variety of tasks and generate
     *     text that continues from or "completes" provided prompt data along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getChatCompletionsWithResponse(
            String deploymentId, BinaryData chatCompletionsOptions, RequestOptions requestOptions) {
        return getChatCompletionsWithResponseAsync(deploymentId, chatCompletionsOptions, requestOptions).block();
    }
}
