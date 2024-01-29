// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.contentsafety;

import com.azure.ai.contentsafety.implementation.BlocklistClientImpl;
import com.azure.ai.contentsafety.models.AddOrUpdateTextBlocklistItemsOptions;
import com.azure.ai.contentsafety.models.AddOrUpdateTextBlocklistItemsResult;
import com.azure.ai.contentsafety.models.RemoveTextBlocklistItemsOptions;
import com.azure.ai.contentsafety.models.TextBlocklist;
import com.azure.ai.contentsafety.models.TextBlocklistItem;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;

/**
 * Initializes a new instance of the synchronous BlocklistClient type.
 */
@ServiceClient(builder = BlocklistClientBuilder.class)
public final class BlocklistClient {

    @Generated
    private final BlocklistClientImpl serviceClient;

    /**
     * Initializes an instance of BlocklistClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    BlocklistClient(BlocklistClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Add or update BlocklistItems To Text Blocklist
     *
     * Add or update blocklistItems to a text blocklist. You can add or update at most 100 blocklistItems in one
     * request.
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistItems (Required): [
     *          (Required){
     *             blocklistItemId: String (Required)
     *             description: String (Optional)
     *             text: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistItems (Required): [
     *          (Required){
     *             blocklistItemId: String (Required)
     *             description: String (Optional)
     *             text: String (Required)
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param name Text blocklist name.
     * @param options Options for adding or updating blocklist items.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the response of adding blocklistItems to the text blocklist along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> addOrUpdateBlocklistItemsWithResponse(String name, BinaryData options,
        RequestOptions requestOptions) {
        return this.serviceClient.addOrUpdateBlocklistItemsWithResponse(name, options, requestOptions);
    }

    /**
     * Create Or Update Text Blocklist
     *
     * Updates a text blocklist. If the blocklistName does not exist, a new blocklist will be created.
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistName: String (Required)
     *     description: String (Optional)
     * }
     * }</pre>
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistName: String (Required)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * @param name Text blocklist name.
     * @param options The resource instance.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return text Blocklist along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> createOrUpdateTextBlocklistWithResponse(String name, BinaryData options,
        RequestOptions requestOptions) {
        // Convenience API is not generated, as operation 'createOrUpdateTextBlocklist' is
        // 'application/merge-patch+json' and stream-style-serialization is not enabled
        return this.serviceClient.createOrUpdateTextBlocklistWithResponse(name, options, requestOptions);
    }

    /**
     * Delete Text Blocklist By blocklistName
     *
     * Deletes a text blocklist.
     *
     * @param name Text blocklist name.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteTextBlocklistWithResponse(String name, RequestOptions requestOptions) {
        return this.serviceClient.deleteTextBlocklistWithResponse(name, requestOptions);
    }

    /**
     * Get Text Blocklist By blocklistName
     *
     * Returns text blocklist details.
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistName: String (Required)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * @param name Text blocklist name.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return text Blocklist along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getTextBlocklistWithResponse(String name, RequestOptions requestOptions) {
        return this.serviceClient.getTextBlocklistWithResponse(name, requestOptions);
    }

    /**
     * Get BlocklistItem By blocklistName And blocklistItemId
     *
     * Get blocklistItem by blocklistName and blocklistItemId from a text blocklist.
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistItemId: String (Required)
     *     description: String (Optional)
     *     text: String (Required)
     * }
     * }</pre>
     *
     * @param name Text blocklist name.
     * @param blocklistItemId The service will generate a BlocklistItemId, which will be a UUID.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return blocklistItem by blocklistName and blocklistItemId from a text blocklist along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getTextBlocklistItemWithResponse(String name, String blocklistItemId,
        RequestOptions requestOptions) {
        return this.serviceClient.getTextBlocklistItemWithResponse(name, blocklistItemId, requestOptions);
    }

    /**
     * Get All BlocklistItems By blocklistName
     *
     * Get all blocklistItems in a text blocklist.
     * <p>
     * <strong>Query Parameters</strong>
     * </p>
     * <table border="1">
     * <caption>Query Parameters</caption>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * </tr>
     * <tr>
     * <td>top</td>
     * <td>Integer</td>
     * <td>No</td>
     * <td>The number of result items to return.</td>
     * </tr>
     * <tr>
     * <td>skip</td>
     * <td>Integer</td>
     * <td>No</td>
     * <td>The number of result items to skip.</td>
     * </tr>
     * <tr>
     * <td>maxpagesize</td>
     * <td>Integer</td>
     * <td>No</td>
     * <td>The maximum number of result items per page.</td>
     * </tr>
     * </table>
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistItemId: String (Required)
     *     description: String (Optional)
     *     text: String (Required)
     * }
     * }</pre>
     *
     * @param name Text blocklist name.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return all blocklistItems in a text blocklist as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listTextBlocklistItems(String name, RequestOptions requestOptions) {
        return this.serviceClient.listTextBlocklistItems(name, requestOptions);
    }

    /**
     * Get All Text Blocklists
     *
     * Get all text blocklists details.
     * <p>
     * <strong>Response Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistName: String (Required)
     *     description: String (Optional)
     * }
     * }</pre>
     *
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return all text blocklists details as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> listTextBlocklists(RequestOptions requestOptions) {
        return this.serviceClient.listTextBlocklists(requestOptions);
    }

    /**
     * Remove BlocklistItems From Text Blocklist
     *
     * Remove blocklistItems from a text blocklist. You can remove at most 100 BlocklistItems in one request.
     * <p>
     * <strong>Request Body Schema</strong>
     * </p>
     * <pre>{@code
     * {
     *     blocklistItemIds (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param name Text blocklist name.
     * @param options Options for removing blocklist items.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> removeBlocklistItemsWithResponse(String name, BinaryData options,
        RequestOptions requestOptions) {
        return this.serviceClient.removeBlocklistItemsWithResponse(name, options, requestOptions);
    }

    /**
     * Add or update BlocklistItems To Text Blocklist
     *
     * Add or update blocklistItems to a text blocklist. You can add or update at most 100 blocklistItems in one
     * request.
     *
     * @param name Text blocklist name.
     * @param options Options for adding or updating blocklist items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of adding blocklistItems to the text blocklist.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AddOrUpdateTextBlocklistItemsResult addOrUpdateBlocklistItems(String name,
        AddOrUpdateTextBlocklistItemsOptions options) {
        // Generated convenience method for addOrUpdateBlocklistItemsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return addOrUpdateBlocklistItemsWithResponse(name, BinaryData.fromObject(options), requestOptions).getValue()
            .toObject(AddOrUpdateTextBlocklistItemsResult.class);
    }

    /**
     * Delete Text Blocklist By blocklistName
     *
     * Deletes a text blocklist.
     *
     * @param name Text blocklist name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteTextBlocklist(String name) {
        // Generated convenience method for deleteTextBlocklistWithResponse
        RequestOptions requestOptions = new RequestOptions();
        deleteTextBlocklistWithResponse(name, requestOptions).getValue();
    }

    /**
     * Get Text Blocklist By blocklistName
     *
     * Returns text blocklist details.
     *
     * @param name Text blocklist name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return text Blocklist.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TextBlocklist getTextBlocklist(String name) {
        // Generated convenience method for getTextBlocklistWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getTextBlocklistWithResponse(name, requestOptions).getValue().toObject(TextBlocklist.class);
    }

    /**
     * Get BlocklistItem By blocklistName And blocklistItemId
     *
     * Get blocklistItem by blocklistName and blocklistItemId from a text blocklist.
     *
     * @param name Text blocklist name.
     * @param blocklistItemId The service will generate a BlocklistItemId, which will be a UUID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return blocklistItem by blocklistName and blocklistItemId from a text blocklist.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TextBlocklistItem getTextBlocklistItem(String name, String blocklistItemId) {
        // Generated convenience method for getTextBlocklistItemWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getTextBlocklistItemWithResponse(name, blocklistItemId, requestOptions).getValue()
            .toObject(TextBlocklistItem.class);
    }

    /**
     * Get All BlocklistItems By blocklistName
     *
     * Get all blocklistItems in a text blocklist.
     *
     * @param name Text blocklist name.
     * @param top The number of result items to return.
     * @param skip The number of result items to skip.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all blocklistItems in a text blocklist as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TextBlocklistItem> listTextBlocklistItems(String name, Integer top, Integer skip) {
        // Generated convenience method for listTextBlocklistItems
        RequestOptions requestOptions = new RequestOptions();
        if (top != null) {
            requestOptions.addQueryParam("top", String.valueOf(top), false);
        }
        if (skip != null) {
            requestOptions.addQueryParam("skip", String.valueOf(skip), false);
        }
        return serviceClient.listTextBlocklistItems(name, requestOptions)
            .mapPage(bodyItemValue -> bodyItemValue.toObject(TextBlocklistItem.class));
    }

    /**
     * Get All BlocklistItems By blocklistName
     *
     * Get all blocklistItems in a text blocklist.
     *
     * @param name Text blocklist name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all blocklistItems in a text blocklist as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TextBlocklistItem> listTextBlocklistItems(String name) {
        // Generated convenience method for listTextBlocklistItems
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.listTextBlocklistItems(name, requestOptions)
            .mapPage(bodyItemValue -> bodyItemValue.toObject(TextBlocklistItem.class));
    }

    /**
     * Get All Text Blocklists
     *
     * Get all text blocklists details.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all text blocklists details as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<TextBlocklist> listTextBlocklists() {
        // Generated convenience method for listTextBlocklists
        RequestOptions requestOptions = new RequestOptions();
        return serviceClient.listTextBlocklists(requestOptions)
            .mapPage(bodyItemValue -> bodyItemValue.toObject(TextBlocklist.class));
    }

    /**
     * Remove BlocklistItems From Text Blocklist
     *
     * Remove blocklistItems from a text blocklist. You can remove at most 100 BlocklistItems in one request.
     *
     * @param name Text blocklist name.
     * @param options Options for removing blocklist items.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void removeBlocklistItems(String name, RemoveTextBlocklistItemsOptions options) {
        // Generated convenience method for removeBlocklistItemsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        removeBlocklistItemsWithResponse(name, BinaryData.fromObject(options), requestOptions).getValue();
    }
}
