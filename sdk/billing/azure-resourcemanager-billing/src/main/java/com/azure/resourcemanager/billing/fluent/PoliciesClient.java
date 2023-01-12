// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.billing.fluent.models.CustomerPolicyInner;
import com.azure.resourcemanager.billing.fluent.models.PolicyInner;

/** An instance of this class provides access to all the operations defined in PoliciesClient. */
public interface PoliciesClient {
    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyInner> getByBillingProfileWithResponse(
        String billingAccountName, String billingProfileName, Context context);

    /**
     * Lists the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyInner getByBillingProfile(String billingAccountName, String billingProfileName);

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyInner> updateWithResponse(
        String billingAccountName, String billingProfileName, PolicyInner parameters, Context context);

    /**
     * Updates the policies for a billing profile. This operation is supported only for billing accounts with agreement
     * type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyInner update(String billingAccountName, String billingProfileName, PolicyInner parameters);

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomerPolicyInner> getByCustomerWithResponse(
        String billingAccountName, String customerName, Context context);

    /**
     * Lists the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomerPolicyInner getByCustomer(String billingAccountName, String customerName);

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CustomerPolicyInner> updateCustomerWithResponse(
        String billingAccountName, String customerName, CustomerPolicyInner parameters, Context context);

    /**
     * Updates the policies for a customer. This operation is supported only for billing accounts with agreement type
     * Microsoft Partner Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param parameters Request parameters that are provided to the update policies operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the customer's Policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CustomerPolicyInner updateCustomer(String billingAccountName, String customerName, CustomerPolicyInner parameters);
}
