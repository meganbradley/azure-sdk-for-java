// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentBillingFeaturesInner;

/** An instance of this class provides access to all the operations defined in ComponentCurrentBillingFeaturesClient. */
public interface ComponentCurrentBillingFeaturesClient {
    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInsightsComponentBillingFeaturesInner get(String resourceGroupName, String resourceName);

    /**
     * Returns current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInsightsComponentBillingFeaturesInner> getWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an
     *     Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationInsightsComponentBillingFeaturesInner update(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties);

    /**
     * Update current billing features for an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param billingFeaturesProperties Properties that need to be specified to update billing features for an
     *     Application Insights component.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Application Insights component billing features.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationInsightsComponentBillingFeaturesInner> updateWithResponse(
        String resourceGroupName,
        String resourceName,
        ApplicationInsightsComponentBillingFeaturesInner billingFeaturesProperties,
        Context context);
}
