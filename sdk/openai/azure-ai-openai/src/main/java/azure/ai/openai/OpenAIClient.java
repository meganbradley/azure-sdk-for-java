// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package azure.ai.openai;

import azure.ai.openai.models.Completions;
import azure.ai.openai.models.CompletionsOptions;
import azure.ai.openai.models.Embeddings;
import azure.ai.openai.models.EmbeddingsOptions;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/** Initializes a new instance of the synchronous OpenAIClient type. */
@ServiceClient(builder = OpenAIClientBuilder.class)
public final class OpenAIClient {
    @Generated private final OpenAIAsyncClient client;

    /**
     * Initializes an instance of OpenAIClient class.
     *
     * @param client the async client.
     */
    @Generated
    OpenAIClient(OpenAIAsyncClient client) {
        this.client = client;
    }

    /**
     * Return the embeddings for a given prompt.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     user: String (Optional)
     *     input_type: String (Optional)
     *     model: String (Optional)
     *     input: InputModelBase (Required)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     object: String (Required)
     *     data (Required): [
     *          (Required){
     *             object: String (Required)
     *             embedding (Required): [
     *                 double (Required)
     *             ]
     *             index: int (Required)
     *         }
     *     ]
     *     model: String (Optional)
     *     usage (Required): {
     *         prompt_tokens: int (Required)
     *         total_tokens: int (Required)
     *     }
     * }
     * }</pre>
     *
     * @param deploymentId deployment id of the deployed model.
     * @param embeddingsOptions Schema to create a prompt completion from a deployment.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return expected response schema to embeddings request along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getEmbeddingsWithResponse(
            String deploymentId, BinaryData embeddingsOptions, RequestOptions requestOptions) {
        return this.client.getEmbeddingsWithResponse(deploymentId, embeddingsOptions, requestOptions).block();
    }

    /**
     * Return the completions for a given prompt.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     prompt (Optional): [
     *         String (Optional)
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
     *     model: String (Optional)
     *     echo: Boolean (Optional)
     *     stop (Optional): [
     *         String (Optional)
     *     ]
     *     completion_config: String (Optional)
     *     cache_level: Integer (Optional)
     *     presence_penalty: Double (Optional)
     *     frequency_penalty: Double (Optional)
     *     best_of: Integer (Optional)
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Optional)
     *     object: String (Required)
     *     created: Integer (Optional)
     *     model: String (Optional)
     *     choices (Optional): [
     *          (Optional){
     *             text: String (Optional)
     *             index: Integer (Optional)
     *             logprobs (Optional): {
     *                 tokens (Optional): [
     *                     String (Optional)
     *                 ]
     *                 token_logprobs (Optional): [
     *                     double (Optional)
     *                 ]
     *                 top_logprobs (Optional): [
     *                      (Optional){
     *                         String: double (Optional)
     *                     }
     *                 ]
     *                 text_offset (Optional): [
     *                     int (Optional)
     *                 ]
     *             }
     *             finish_reason: String (Optional)
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
     * @param completionsOptions Post body schema to create a prompt completion from a deployment.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return expected response schema to completion request along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getCompletionsWithResponse(
            String deploymentId, BinaryData completionsOptions, RequestOptions requestOptions) {
        return this.client.getCompletionsWithResponse(deploymentId, completionsOptions, requestOptions).block();
    }

    /**
     * Return the embeddings for a given prompt.
     *
     * @param deploymentId deployment id of the deployed model.
     * @param embeddingsOptions Schema to create a prompt completion from a deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expected response schema to embeddings request.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Embeddings getEmbeddings(String deploymentId, EmbeddingsOptions embeddingsOptions) {
        // Generated convenience method for getEmbeddingsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getEmbeddingsWithResponse(deploymentId, BinaryData.fromObject(embeddingsOptions), requestOptions)
                .getValue()
                .toObject(Embeddings.class);
    }

    /**
     * Return the completions for a given prompt.
     *
     * @param deploymentId deployment id of the deployed model.
     * @param completionsOptions Post body schema to create a prompt completion from a deployment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expected response schema to completion request.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Completions getCompletions(String deploymentId, CompletionsOptions completionsOptions) {
        // Generated convenience method for getCompletionsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getCompletionsWithResponse(deploymentId, BinaryData.fromObject(completionsOptions), requestOptions)
                .getValue()
                .toObject(Completions.class);
    }
}
