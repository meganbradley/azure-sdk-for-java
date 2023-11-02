// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ComponentQuotaStatus. */
public interface ComponentQuotaStatus {
    /**
     * Returns daily data volume cap (quota) status for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component daily data volume cap status along with {@link Response}.
     */
    Response<ApplicationInsightsComponentQuotaStatus> getWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Returns daily data volume cap (quota) status for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component daily data volume cap status.
     */
    ApplicationInsightsComponentQuotaStatus get(String resourceGroupName, String resourceName);
}
