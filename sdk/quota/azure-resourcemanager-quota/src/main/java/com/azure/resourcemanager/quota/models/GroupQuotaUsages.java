// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of GroupQuotaUsages.
 */
public interface GroupQuotaUsages {
    /**
     * Gets the GroupQuotas usages and limits(quota) for the resourceProvider/location.
     * 
     * Gets the GroupQuotas usages and limits(quota). Location is required paramter.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuotas usages and limits(quota) as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ResourceUsages> list(String managementGroupId, String groupQuotaName, String resourceProviderName,
        String location);

    /**
     * Gets the GroupQuotas usages and limits(quota) for the resourceProvider/location.
     * 
     * Gets the GroupQuotas usages and limits(quota). Location is required paramter.
     * 
     * @param managementGroupId Management Group Id.
     * @param groupQuotaName The GroupQuota name. The name should be unique for the provided context tenantId/MgId.
     * @param resourceProviderName The resource provider name, such as - Microsoft.Compute. Currently only
     * Microsoft.Compute resource provider supports this API.
     * @param location The name of the Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the GroupQuotas usages and limits(quota) as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ResourceUsages> list(String managementGroupId, String groupQuotaName, String resourceProviderName,
        String location, Context context);
}
