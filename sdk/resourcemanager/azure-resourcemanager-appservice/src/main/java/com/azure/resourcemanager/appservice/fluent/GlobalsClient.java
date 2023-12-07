// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.fluent.models.DeletedSiteInner;
import com.azure.resourcemanager.appservice.fluent.models.SnapshotInner;
import java.util.List;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in GlobalsClient.
 */
public interface GlobalsClient {
    /**
     * Get deleted app for a subscription.
     * 
     * Description for Get deleted app for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<DeletedSiteInner>> getDeletedWebAppWithResponseAsync(String deletedSiteId);

    /**
     * Get deleted app for a subscription.
     * 
     * Description for Get deleted app for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<DeletedSiteInner> getDeletedWebAppAsync(String deletedSiteId);

    /**
     * Get deleted app for a subscription.
     * 
     * Description for Get deleted app for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeletedSiteInner> getDeletedWebAppWithResponse(String deletedSiteId, Context context);

    /**
     * Get deleted app for a subscription.
     * 
     * Description for Get deleted app for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a deleted app.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeletedSiteInner getDeletedWebApp(String deletedSiteId);

    /**
     * Get all deleted apps for a subscription.
     * 
     * Description for Get all deleted apps for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Snapshot along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<List<SnapshotInner>>> getDeletedWebAppSnapshotsWithResponseAsync(String deletedSiteId);

    /**
     * Get all deleted apps for a subscription.
     * 
     * Description for Get all deleted apps for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Snapshot on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<List<SnapshotInner>> getDeletedWebAppSnapshotsAsync(String deletedSiteId);

    /**
     * Get all deleted apps for a subscription.
     * 
     * Description for Get all deleted apps for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Snapshot along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<List<SnapshotInner>> getDeletedWebAppSnapshotsWithResponse(String deletedSiteId, Context context);

    /**
     * Get all deleted apps for a subscription.
     * 
     * Description for Get all deleted apps for a subscription.
     * 
     * @param deletedSiteId The numeric ID of the deleted app, e.g. 12345.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Snapshot.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    List<SnapshotInner> getDeletedWebAppSnapshots(String deletedSiteId);

    /**
     * Gets an operation in a subscription and given region
     * 
     * Description for Gets an operation in a subscription and given region.
     * 
     * @param location Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> getSubscriptionOperationWithAsyncResponseWithResponseAsync(String location,
        String operationId);

    /**
     * Gets an operation in a subscription and given region
     * 
     * Description for Gets an operation in a subscription and given region.
     * 
     * @param location Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> getSubscriptionOperationWithAsyncResponseAsync(String location, String operationId);

    /**
     * Gets an operation in a subscription and given region
     * 
     * Description for Gets an operation in a subscription and given region.
     * 
     * @param location Location name.
     * @param operationId Operation Id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> getSubscriptionOperationWithAsyncResponseWithResponse(String location, String operationId,
        Context context);

    /**
     * Gets an operation in a subscription and given region
     * 
     * Description for Gets an operation in a subscription and given region.
     * 
     * @param location Location name.
     * @param operationId Operation Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     * rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getSubscriptionOperationWithAsyncResponse(String location, String operationId);
}
