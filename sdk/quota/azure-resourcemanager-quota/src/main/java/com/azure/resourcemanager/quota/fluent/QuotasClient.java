// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.quota.fluent.models.CurrentQuotaLimitBaseInner;
import com.azure.resourcemanager.quota.models.QuotasGetResponse;

/** An instance of this class provides access to all the operations defined in QuotasClient. */
public interface QuotasClient {
    /**
     * Get the quota limit of a resource. The response can be used to determine the remaining quota to calculate a new
     * quota limit that can be submitted with a PUT request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota limit of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner get(String resourceName, String scope);

    /**
     * Get the quota limit of a resource. The response can be used to determine the remaining quota to calculate a new
     * quota limit that can be submitted with a PUT request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the quota limit of a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QuotasGetResponse getWithResponse(String resourceName, String scope, Context context);

    /**
     * Create or update the quota limit for the specified resource with the requested value. To update the quota, follow
     * these steps: 1. Use the GET operation for quotas and usages to determine how much quota remains for the specific
     * resource and to calculate the new quota limit. These steps are detailed in [this
     * example](https://techcommunity.microsoft.com/t5/azure-governance-and-management/using-the-new-quota-rest-api/ba-p/2183670).
     * 2. Use this PUT operation to update the quota limit. Please check the URI in location header for the detailed
     * status of the request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param createQuotaRequest Quota request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CurrentQuotaLimitBaseInner>, CurrentQuotaLimitBaseInner> beginCreateOrUpdate(
        String resourceName, String scope, CurrentQuotaLimitBaseInner createQuotaRequest);

    /**
     * Create or update the quota limit for the specified resource with the requested value. To update the quota, follow
     * these steps: 1. Use the GET operation for quotas and usages to determine how much quota remains for the specific
     * resource and to calculate the new quota limit. These steps are detailed in [this
     * example](https://techcommunity.microsoft.com/t5/azure-governance-and-management/using-the-new-quota-rest-api/ba-p/2183670).
     * 2. Use this PUT operation to update the quota limit. Please check the URI in location header for the detailed
     * status of the request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param createQuotaRequest Quota request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CurrentQuotaLimitBaseInner>, CurrentQuotaLimitBaseInner> beginCreateOrUpdate(
        String resourceName, String scope, CurrentQuotaLimitBaseInner createQuotaRequest, Context context);

    /**
     * Create or update the quota limit for the specified resource with the requested value. To update the quota, follow
     * these steps: 1. Use the GET operation for quotas and usages to determine how much quota remains for the specific
     * resource and to calculate the new quota limit. These steps are detailed in [this
     * example](https://techcommunity.microsoft.com/t5/azure-governance-and-management/using-the-new-quota-rest-api/ba-p/2183670).
     * 2. Use this PUT operation to update the quota limit. Please check the URI in location header for the detailed
     * status of the request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param createQuotaRequest Quota request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner createOrUpdate(
        String resourceName, String scope, CurrentQuotaLimitBaseInner createQuotaRequest);

    /**
     * Create or update the quota limit for the specified resource with the requested value. To update the quota, follow
     * these steps: 1. Use the GET operation for quotas and usages to determine how much quota remains for the specific
     * resource and to calculate the new quota limit. These steps are detailed in [this
     * example](https://techcommunity.microsoft.com/t5/azure-governance-and-management/using-the-new-quota-rest-api/ba-p/2183670).
     * 2. Use this PUT operation to update the quota limit. Please check the URI in location header for the detailed
     * status of the request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param createQuotaRequest Quota request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner createOrUpdate(
        String resourceName, String scope, CurrentQuotaLimitBaseInner createQuotaRequest, Context context);

    /**
     * Update the quota limit for a specific resource to the specified value: 1. Use the Usages-GET and Quota-GET
     * operations to determine the remaining quota for the specific resource and to calculate the new quota limit. These
     * steps are detailed in [this
     * example](https://techcommunity.microsoft.com/t5/azure-governance-and-management/using-the-new-quota-rest-api/ba-p/2183670).
     * 2. Use this PUT operation to update the quota limit. Please check the URI in location header for the detailed
     * status of the request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param createQuotaRequest Quota requests payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CurrentQuotaLimitBaseInner>, CurrentQuotaLimitBaseInner> beginUpdate(
        String resourceName, String scope, CurrentQuotaLimitBaseInner createQuotaRequest);

    /**
     * Update the quota limit for a specific resource to the specified value: 1. Use the Usages-GET and Quota-GET
     * operations to determine the remaining quota for the specific resource and to calculate the new quota limit. These
     * steps are detailed in [this
     * example](https://techcommunity.microsoft.com/t5/azure-governance-and-management/using-the-new-quota-rest-api/ba-p/2183670).
     * 2. Use this PUT operation to update the quota limit. Please check the URI in location header for the detailed
     * status of the request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param createQuotaRequest Quota requests payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limit.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<CurrentQuotaLimitBaseInner>, CurrentQuotaLimitBaseInner> beginUpdate(
        String resourceName, String scope, CurrentQuotaLimitBaseInner createQuotaRequest, Context context);

    /**
     * Update the quota limit for a specific resource to the specified value: 1. Use the Usages-GET and Quota-GET
     * operations to determine the remaining quota for the specific resource and to calculate the new quota limit. These
     * steps are detailed in [this
     * example](https://techcommunity.microsoft.com/t5/azure-governance-and-management/using-the-new-quota-rest-api/ba-p/2183670).
     * 2. Use this PUT operation to update the quota limit. Please check the URI in location header for the detailed
     * status of the request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param createQuotaRequest Quota requests payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner update(String resourceName, String scope, CurrentQuotaLimitBaseInner createQuotaRequest);

    /**
     * Update the quota limit for a specific resource to the specified value: 1. Use the Usages-GET and Quota-GET
     * operations to determine the remaining quota for the specific resource and to calculate the new quota limit. These
     * steps are detailed in [this
     * example](https://techcommunity.microsoft.com/t5/azure-governance-and-management/using-the-new-quota-rest-api/ba-p/2183670).
     * 2. Use this PUT operation to update the quota limit. Please check the URI in location header for the detailed
     * status of the request.
     *
     * @param resourceName Resource name for a given resource provider. For example: - SKU name for Microsoft.Compute -
     *     SKU or TotalLowPriorityCores for Microsoft.MachineLearningServices For Microsoft.Network PublicIPAddresses.
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param createQuotaRequest Quota requests payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota limit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CurrentQuotaLimitBaseInner update(
        String resourceName, String scope, CurrentQuotaLimitBaseInner createQuotaRequest, Context context);

    /**
     * Get a list of current quota limits of all resources for the specified scope. The response from this GET operation
     * can be leveraged to submit requests to update a quota.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current quota limits of all resources for the specified scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CurrentQuotaLimitBaseInner> list(String scope);

    /**
     * Get a list of current quota limits of all resources for the specified scope. The response from this GET operation
     * can be leveraged to submit requests to update a quota.
     *
     * @param scope The target Azure resource URI. For example,
     *     `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/qms-test/providers/Microsoft.Batch/batchAccounts/testAccount/`.
     *     This is the target Azure resource URI for the List GET operation. If a `{resourceName}` is added after
     *     `/quotas`, then it's the target Azure resource URI in the GET operation for the specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of current quota limits of all resources for the specified scope.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CurrentQuotaLimitBaseInner> list(String scope, Context context);
}
