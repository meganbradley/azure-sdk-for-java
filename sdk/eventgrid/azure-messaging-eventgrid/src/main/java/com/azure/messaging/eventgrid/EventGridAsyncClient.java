// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid;

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
import com.azure.core.models.CloudEvent;
import com.azure.core.util.BinaryData;
import com.azure.core.util.FluxUtil;
import com.azure.messaging.eventgrid.implementation.EventGridClientImpl;
import com.azure.messaging.eventgrid.models.AcknowledgeOptions;
import com.azure.messaging.eventgrid.models.AcknowledgeResult;
import com.azure.messaging.eventgrid.models.PublishResult;
import com.azure.messaging.eventgrid.models.ReceiveResult;
import com.azure.messaging.eventgrid.models.RejectOptions;
import com.azure.messaging.eventgrid.models.RejectResult;
import com.azure.messaging.eventgrid.models.ReleaseOptions;
import com.azure.messaging.eventgrid.models.ReleaseResult;
import java.time.Duration;
import java.util.List;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous EventGridClient type. */
@ServiceClient(builder = EventGridClientBuilder.class, isAsync = true)
public final class EventGridAsyncClient {

    @Generated private final EventGridClientImpl serviceClient;

    /**
     * Initializes an instance of EventGridAsyncClient class.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    EventGridAsyncClient(EventGridClientImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Publish Single Cloud Event to namespace topic. In case of success, the server responds with an HTTP 200 status
     * code with an empty JSON object in response. Otherwise, the server can return various error codes. For example,
     * 401: which indicates authorization failure, 403: which indicates quota exceeded or message is too large, 410:
     * which indicates that specific topic is not found, 400: for bad request, and 500: for internal server error.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     id: String (Required)
     *     source: String (Required)
     *     data: Object (Optional)
     *     data_base64: byte[] (Optional)
     *     type: String (Required)
     *     time: OffsetDateTime (Optional)
     *     specversion: String (Required)
     *     dataschema: String (Optional)
     *     datacontenttype: String (Optional)
     *     subject: String (Optional)
     *      (Optional): {
     *         String: Object (Optional)
     *     }
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     result: String (Required)
     * }
     * }</pre>
     *
     * @param topicName Topic Name.
     * @param event Single Cloud Event being published.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of the Publish operation along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> publishCloudEventWithResponse(
            String topicName, BinaryData event, RequestOptions requestOptions) {
        return this.serviceClient.publishCloudEventWithResponseAsync(topicName, event, requestOptions);
    }

    /**
     * Publish Batch Cloud Event to namespace topic. In case of success, the server responds with an HTTP 200 status
     * code with an empty JSON object in response. Otherwise, the server can return various error codes. For example,
     * 401: which indicates authorization failure, 403: which indicates quota exceeded or message is too large, 410:
     * which indicates that specific topic is not found, 400: for bad request, and 500: for internal server error.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * [
     *      (Required){
     *         id: String (Required)
     *         source: String (Required)
     *         data: Object (Optional)
     *         data_base64: byte[] (Optional)
     *         type: String (Required)
     *         time: OffsetDateTime (Optional)
     *         specversion: String (Required)
     *         dataschema: String (Optional)
     *         datacontenttype: String (Optional)
     *         subject: String (Optional)
     *          (Optional): {
     *             String: Object (Optional)
     *         }
     *     }
     * ]
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     result: String (Required)
     * }
     * }</pre>
     *
     * @param topicName Topic Name.
     * @param events Array of Cloud Events being published.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of the Publish operation along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> publishCloudEventsWithResponse(
            String topicName, BinaryData events, RequestOptions requestOptions) {
        return this.serviceClient.publishCloudEventsWithResponseAsync(topicName, events, requestOptions);
    }

    /**
     * Receive Batch of Cloud Events from the Event Subscription.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>maxEvents</td><td>Integer</td><td>No</td><td>Max Events count to be received. Minimum value is 1, while maximum value is 100 events. If not specified, the default value is 1.</td></tr>
     *     <tr><td>maxWaitTime</td><td>Duration</td><td>No</td><td>Max wait time value for receive operation in Seconds. It is the time in seconds that the server approximately waits for the availability of an event and responds to the request. If an event is available, the broker responds immediately to the client. Minimum value is 10 seconds, while maximum value is 120 seconds. If not specified, the default value is 60 seconds.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     value (Required): [
     *          (Required){
     *             brokerProperties (Required): {
     *                 lockToken: String (Required)
     *                 deliveryCount: int (Required)
     *             }
     *             event (Required): {
     *                 id: String (Required)
     *                 source: String (Required)
     *                 data: Object (Optional)
     *                 data_base64: byte[] (Optional)
     *                 type: String (Required)
     *                 time: OffsetDateTime (Optional)
     *                 specversion: String (Required)
     *                 dataschema: String (Optional)
     *                 datacontenttype: String (Optional)
     *                 subject: String (Optional)
     *                  (Optional): {
     *                     String: Object (Optional)
     *                 }
     *             }
     *         }
     *     ]
     * }
     * }</pre>
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return details of the Receive operation response along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> receiveCloudEventsWithResponse(
            String topicName, String eventSubscriptionName, RequestOptions requestOptions) {
        return this.serviceClient.receiveCloudEventsWithResponseAsync(topicName, eventSubscriptionName, requestOptions);
    }

    /**
     * Acknowledge batch of Cloud Events. The server responds with an HTTP 200 status code if at least one event is
     * successfully acknowledged. The response body will include the set of successfully acknowledged lockTokens, along
     * with other failed lockTokens with their corresponding error information. Successfully acknowledged events will no
     * longer be available to any consumer.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     lockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     failedLockTokens (Required): [
     *          (Required){
     *             lockToken: String (Required)
     *             errorCode: String (Required)
     *             errorDescription: String (Required)
     *         }
     *     ]
     *     succeededLockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param lockTokens AcknowledgeOptions.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of the Acknowledge operation along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> acknowledgeCloudEventsWithResponse(
            String topicName, String eventSubscriptionName, BinaryData lockTokens, RequestOptions requestOptions) {
        return this.serviceClient.acknowledgeCloudEventsWithResponseAsync(
                topicName, eventSubscriptionName, lockTokens, requestOptions);
    }

    /**
     * Release batch of Cloud Events. The server responds with an HTTP 200 status code if at least one event is
     * successfully released. The response body will include the set of successfully released lockTokens, along with
     * other failed lockTokens with their corresponding error information.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     lockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     failedLockTokens (Required): [
     *          (Required){
     *             lockToken: String (Required)
     *             errorCode: String (Required)
     *             errorDescription: String (Required)
     *         }
     *     ]
     *     succeededLockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param lockTokens ReleaseOptions.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of the Release operation along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> releaseCloudEventsWithResponse(
            String topicName, String eventSubscriptionName, BinaryData lockTokens, RequestOptions requestOptions) {
        return this.serviceClient.releaseCloudEventsWithResponseAsync(
                topicName, eventSubscriptionName, lockTokens, requestOptions);
    }

    /**
     * Reject batch of Cloud Events.
     *
     * <p><strong>Request Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     lockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     failedLockTokens (Required): [
     *          (Required){
     *             lockToken: String (Required)
     *             errorCode: String (Required)
     *             errorDescription: String (Required)
     *         }
     *     ]
     *     succeededLockTokens (Required): [
     *         String (Required)
     *     ]
     * }
     * }</pre>
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param lockTokens RejectOptions.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of the Reject operation along with {@link Response} on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BinaryData>> rejectCloudEventsWithResponse(
            String topicName, String eventSubscriptionName, BinaryData lockTokens, RequestOptions requestOptions) {
        return this.serviceClient.rejectCloudEventsWithResponseAsync(
                topicName, eventSubscriptionName, lockTokens, requestOptions);
    }

    /**
     * Publish Single Cloud Event to namespace topic. In case of success, the server responds with an HTTP 200 status
     * code with an empty JSON object in response. Otherwise, the server can return various error codes. For example,
     * 401: which indicates authorization failure, 403: which indicates quota exceeded or message is too large, 410:
     * which indicates that specific topic is not found, 400: for bad request, and 500: for internal server error.
     *
     * @param topicName Topic Name.
     * @param event Single Cloud Event being published.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Publish operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublishResult> publishCloudEvent(String topicName, CloudEvent event) {
        // Generated convenience method for publishCloudEventWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return publishCloudEventWithResponse(topicName, BinaryData.fromObject(event), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(PublishResult.class));
    }

    /**
     * Publish Batch Cloud Event to namespace topic. In case of success, the server responds with an HTTP 200 status
     * code with an empty JSON object in response. Otherwise, the server can return various error codes. For example,
     * 401: which indicates authorization failure, 403: which indicates quota exceeded or message is too large, 410:
     * which indicates that specific topic is not found, 400: for bad request, and 500: for internal server error.
     *
     * @param topicName Topic Name.
     * @param events Array of Cloud Events being published.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Publish operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PublishResult> publishCloudEvents(String topicName, List<CloudEvent> events) {
        // Generated convenience method for publishCloudEventsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return publishCloudEventsWithResponse(topicName, BinaryData.fromObject(events), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(PublishResult.class));
    }

    /**
     * Receive Batch of Cloud Events from the Event Subscription.
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param maxEvents Max Events count to be received. Minimum value is 1, while maximum value is 100 events. If not
     *     specified, the default value is 1.
     * @param maxWaitTime Max wait time value for receive operation in Seconds. It is the time in seconds that the
     *     server approximately waits for the availability of an event and responds to the request. If an event is
     *     available, the broker responds immediately to the client. Minimum value is 10 seconds, while maximum value is
     *     120 seconds. If not specified, the default value is 60 seconds.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the Receive operation response on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReceiveResult> receiveCloudEvents(
            String topicName, String eventSubscriptionName, Integer maxEvents, Duration maxWaitTime) {
        // Generated convenience method for receiveCloudEventsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (maxEvents != null) {
            requestOptions.addQueryParam("maxEvents", String.valueOf(maxEvents), false);
        }
        if (maxWaitTime != null) {
            requestOptions.addQueryParam("maxWaitTime", String.valueOf(maxWaitTime.getSeconds()), false);
        }
        return receiveCloudEventsWithResponse(topicName, eventSubscriptionName, requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(ReceiveResult.class));
    }

    /**
     * Receive Batch of Cloud Events from the Event Subscription.
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the Receive operation response on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReceiveResult> receiveCloudEvents(String topicName, String eventSubscriptionName) {
        // Generated convenience method for receiveCloudEventsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return receiveCloudEventsWithResponse(topicName, eventSubscriptionName, requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(ReceiveResult.class));
    }

    /**
     * Acknowledge batch of Cloud Events. The server responds with an HTTP 200 status code if at least one event is
     * successfully acknowledged. The response body will include the set of successfully acknowledged lockTokens, along
     * with other failed lockTokens with their corresponding error information. Successfully acknowledged events will no
     * longer be available to any consumer.
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param lockTokens AcknowledgeOptions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Acknowledge operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<AcknowledgeResult> acknowledgeCloudEvents(
            String topicName, String eventSubscriptionName, AcknowledgeOptions lockTokens) {
        // Generated convenience method for acknowledgeCloudEventsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return acknowledgeCloudEventsWithResponse(
                        topicName, eventSubscriptionName, BinaryData.fromObject(lockTokens), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(AcknowledgeResult.class));
    }

    /**
     * Release batch of Cloud Events. The server responds with an HTTP 200 status code if at least one event is
     * successfully released. The response body will include the set of successfully released lockTokens, along with
     * other failed lockTokens with their corresponding error information.
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param lockTokens ReleaseOptions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Release operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReleaseResult> releaseCloudEvents(
            String topicName, String eventSubscriptionName, ReleaseOptions lockTokens) {
        // Generated convenience method for releaseCloudEventsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return releaseCloudEventsWithResponse(
                        topicName, eventSubscriptionName, BinaryData.fromObject(lockTokens), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(ReleaseResult.class));
    }

    /**
     * Reject batch of Cloud Events.
     *
     * @param topicName Topic Name.
     * @param eventSubscriptionName Event Subscription Name.
     * @param lockTokens RejectOptions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of the Reject operation on successful completion of {@link Mono}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RejectResult> rejectCloudEvents(
            String topicName, String eventSubscriptionName, RejectOptions lockTokens) {
        // Generated convenience method for rejectCloudEventsWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return rejectCloudEventsWithResponse(
                        topicName, eventSubscriptionName, BinaryData.fromObject(lockTokens), requestOptions)
                .flatMap(FluxUtil::toMono)
                .map(protocolMethodData -> protocolMethodData.toObject(RejectResult.class));
    }
}
