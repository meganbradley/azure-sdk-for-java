// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.CertificateObjectGlobalRulestackResourceInner;

/**
 * An instance of this class provides access to all the operations defined in CertificateObjectGlobalRulestacksClient.
 */
public interface CertificateObjectGlobalRulestacksClient {
    /**
     * List CertificateObjectGlobalRulestackResource resources by Tenant.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CertificateObjectGlobalRulestackResource list operation as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CertificateObjectGlobalRulestackResourceInner> list(String globalRulestackName);

    /**
     * List CertificateObjectGlobalRulestackResource resources by Tenant.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a CertificateObjectGlobalRulestackResource list operation as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CertificateObjectGlobalRulestackResourceInner> list(String globalRulestackName, Context context);

    /**
     * Get a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CertificateObjectGlobalRulestackResource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CertificateObjectGlobalRulestackResourceInner> getWithResponse(
        String globalRulestackName, String name, Context context);

    /**
     * Get a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a CertificateObjectGlobalRulestackResource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateObjectGlobalRulestackResourceInner get(String globalRulestackName, String name);

    /**
     * Create a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of globalRulestack Certificate Object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CertificateObjectGlobalRulestackResourceInner>, CertificateObjectGlobalRulestackResourceInner>
        beginCreateOrUpdate(
            String globalRulestackName, String name, CertificateObjectGlobalRulestackResourceInner resource);

    /**
     * Create a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of globalRulestack Certificate Object.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CertificateObjectGlobalRulestackResourceInner>, CertificateObjectGlobalRulestackResourceInner>
        beginCreateOrUpdate(
            String globalRulestackName,
            String name,
            CertificateObjectGlobalRulestackResourceInner resource,
            Context context);

    /**
     * Create a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return globalRulestack Certificate Object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateObjectGlobalRulestackResourceInner createOrUpdate(
        String globalRulestackName, String name, CertificateObjectGlobalRulestackResourceInner resource);

    /**
     * Create a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return globalRulestack Certificate Object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CertificateObjectGlobalRulestackResourceInner createOrUpdate(
        String globalRulestackName,
        String name,
        CertificateObjectGlobalRulestackResourceInner resource,
        Context context);

    /**
     * Delete a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String globalRulestackName, String name);

    /**
     * Delete a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String globalRulestackName, String name, Context context);

    /**
     * Delete a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String globalRulestackName, String name);

    /**
     * Delete a CertificateObjectGlobalRulestackResource.
     *
     * @param globalRulestackName GlobalRulestack resource name.
     * @param name certificate name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String globalRulestackName, String name, Context context);
}
