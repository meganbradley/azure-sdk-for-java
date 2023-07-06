// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch;

import com.azure.compute.batch.models.NodeVMExtension;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;

/** Initializes a new instance of the synchronous BatchServiceClient type. */
@ServiceClient(builder = BatchServiceClientBuilder.class)
public final class ComputeNodeExtensionsClient {

    @Generated private final ComputeNodeExtensionsAsyncClient client;

    /**
     * Initializes an instance of ComputeNodeExtensionsClient class.
     *
     * @param client the async client.
     */
    @Generated
    ComputeNodeExtensionsClient(ComputeNodeExtensionsAsyncClient client) {
        this.client = client;
    }

    /**
     * Gets information about the specified Compute Node Extension.
     *
     * <p><strong>Query Parameters</strong>
     *
     * <table border="1">
     *     <caption>Query Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>timeOut</td><td>Integer</td><td>No</td><td>The maximum number of items to return in the response. A maximum of 1000
     * applications can be returned.</td></tr>
     *     <tr><td>$select</td><td>String</td><td>No</td><td>An OData $select clause.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addQueryParam}
     *
     * <p><strong>Header Parameters</strong>
     *
     * <table border="1">
     *     <caption>Header Parameters</caption>
     *     <tr><th>Name</th><th>Type</th><th>Required</th><th>Description</th></tr>
     *     <tr><td>client-request-id</td><td>String</td><td>No</td><td>The caller-generated request identity, in the form of a GUID with no decoration
     * such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.</td></tr>
     *     <tr><td>return-client-request-id</td><td>Boolean</td><td>No</td><td>Whether the server should return the client-request-id in the response.</td></tr>
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
     *     provisioningState: String (Optional)
     *     vmExtension (Optional): {
     *         name: String (Required)
     *         publisher: String (Required)
     *         type: String (Required)
     *         typeHandlerVersion: String (Optional)
     *         autoUpgradeMinorVersion: Boolean (Optional)
     *         settings (Optional): {
     *         }
     *         protectedSettings (Optional): (recursive schema, see protectedSettings above)
     *         provisionAfterExtensions (Optional): [
     *             String (Optional)
     *         ]
     *     }
     *     instanceView (Optional): {
     *         name: String (Optional)
     *         statuses (Optional): [
     *              (Optional){
     *                 code: String (Optional)
     *                 displayStatus: String (Optional)
     *                 level: String(Error/Info/Warning) (Optional)
     *                 message: String (Optional)
     *                 time: String (Optional)
     *             }
     *         ]
     *         subStatuses (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return information about the specified Compute Node Extension along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BinaryData> getWithResponse(
            String poolId, String nodeId, String extensionName, RequestOptions requestOptions) {
        return this.client.getWithResponse(poolId, nodeId, extensionName, requestOptions).block();
    }

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
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
     *     <tr><td>$select</td><td>String</td><td>No</td><td>An OData $select clause.</td></tr>
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
     *     <tr><td>client-request-id</td><td>String</td><td>No</td><td>The caller-generated request identity, in the form of a GUID with no decoration
     * such as curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.</td></tr>
     *     <tr><td>return-client-request-id</td><td>Boolean</td><td>No</td><td>Whether the server should return the client-request-id in the response.</td></tr>
     * </table>
     *
     * You can add these to a request with {@link RequestOptions#addHeader}
     *
     * <p><strong>Response Body Schema</strong>
     *
     * <pre>{@code
     * {
     *     provisioningState: String (Optional)
     *     vmExtension (Optional): {
     *         name: String (Required)
     *         publisher: String (Required)
     *         type: String (Required)
     *         typeHandlerVersion: String (Optional)
     *         autoUpgradeMinorVersion: Boolean (Optional)
     *         settings (Optional): {
     *         }
     *         protectedSettings (Optional): (recursive schema, see protectedSettings above)
     *         provisionAfterExtensions (Optional): [
     *             String (Optional)
     *         ]
     *     }
     *     instanceView (Optional): {
     *         name: String (Optional)
     *         statuses (Optional): [
     *              (Optional){
     *                 code: String (Optional)
     *                 displayStatus: String (Optional)
     *                 level: String(Error/Info/Warning) (Optional)
     *                 message: String (Optional)
     *                 time: String (Optional)
     *             }
     *         ]
     *         subStatuses (Optional): [
     *             (recursive schema, see above)
     *         ]
     *     }
     * }
     * }</pre>
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the result of listing the Compute Node extensions in a Node as paginated response with {@link
     *     PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<BinaryData> list(String poolId, String nodeId, RequestOptions requestOptions) {
        return new PagedIterable<>(this.client.list(poolId, nodeId, requestOptions));
    }

    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified Compute Node Extension.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NodeVMExtension get(String poolId, String nodeId, String extensionName) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        return getWithResponse(poolId, nodeId, extensionName, requestOptions)
                .getValue()
                .toObject(NodeVMExtension.class);
    }

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of listing the Compute Node extensions in a Node as paginated response with {@link
     *     PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NodeVMExtension> list(String poolId, String nodeId) {
        // Generated convenience method for list
        return new PagedIterable<>(client.list(poolId, nodeId));
    }

    /**
     * Gets information about the specified Compute Node Extension.
     *
     * @param poolId The ID of the Pool that contains the Compute Node.
     * @param nodeId The ID of the Compute Node that contains the extensions.
     * @param extensionName The name of the of the Compute Node Extension that you want to get information about.
     * @param timeOut The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param clientRequestId The caller-generated request identity, in the form of a GUID with no decoration such as
     *     curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     * @param returnClientRequestId Whether the server should return the client-request-id in the response.
     * @param ocpDate The time the request was issued. Client libraries typically set this to the current system clock
     *     time; set it explicitly if you are calling the REST API directly.
     * @param select An OData $select clause.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified Compute Node Extension.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NodeVMExtension get(
            String poolId,
            String nodeId,
            String extensionName,
            Integer timeOut,
            String clientRequestId,
            Boolean returnClientRequestId,
            OffsetDateTime ocpDate,
            String select) {
        // Generated convenience method for getWithResponse
        RequestOptions requestOptions = new RequestOptions();
        if (timeOut != null) {
            requestOptions.addQueryParam("timeOut", String.valueOf(timeOut), false);
        }
        if (clientRequestId != null) {
            requestOptions.setHeader(HttpHeaderName.fromString("client-request-id"), clientRequestId);
        }
        if (returnClientRequestId != null) {
            requestOptions.setHeader(
                    HttpHeaderName.fromString("return-client-request-id"), String.valueOf(returnClientRequestId));
        }
        if (ocpDate != null) {
            requestOptions.setHeader(
                    HttpHeaderName.fromString("ocp-date"), String.valueOf(new DateTimeRfc1123(ocpDate)));
        }
        if (select != null) {
            requestOptions.addQueryParam("$select", select, false);
        }
        return getWithResponse(poolId, nodeId, extensionName, requestOptions)
                .getValue()
                .toObject(NodeVMExtension.class);
    }

    /**
     * Lists the Compute Nodes Extensions in the specified Pool.
     *
     * @param poolId The ID of the Pool that contains Compute Node.
     * @param nodeId The ID of the Compute Node that you want to list extensions.
     * @param maxresults The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param ocpDate The time the request was issued. Client libraries typically set this to the current system clock
     *     time; set it explicitly if you are calling the REST API directly.
     * @param timeOut The maximum number of items to return in the response. A maximum of 1000 applications can be
     *     returned.
     * @param clientRequestId The caller-generated request identity, in the form of a GUID with no decoration such as
     *     curly braces, e.g. 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
     * @param returnClientRequestId Whether the server should return the client-request-id in the response.
     * @param select An OData $select clause.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of listing the Compute Node extensions in a Node as paginated response with {@link
     *     PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NodeVMExtension> list(
            String poolId,
            String nodeId,
            Integer maxresults,
            OffsetDateTime ocpDate,
            Integer timeOut,
            String clientRequestId,
            Boolean returnClientRequestId,
            String select) {
        // Generated convenience method for list
        return new PagedIterable<>(
                client.list(
                        poolId, nodeId, maxresults, ocpDate, timeOut, clientRequestId, returnClientRequestId, select));
    }
}
