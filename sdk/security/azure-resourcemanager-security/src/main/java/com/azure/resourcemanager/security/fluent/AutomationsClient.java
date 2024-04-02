// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.AutomationInner;
import com.azure.resourcemanager.security.fluent.models.AutomationValidationStatusInner;
import com.azure.resourcemanager.security.models.AutomationUpdateModel;

/**
 * An instance of this class provides access to all the operations defined in AutomationsClient.
 */
public interface AutomationsClient {
    /**
     * Lists all the security automations in the specified subscription. Use the 'nextLink' property in the response to
     * get the next page of security automations for the specified subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security automations response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutomationInner> list();

    /**
     * Lists all the security automations in the specified subscription. Use the 'nextLink' property in the response to
     * get the next page of security automations for the specified subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security automations response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutomationInner> list(Context context);

    /**
     * Lists all the security automations in the specified resource group. Use the 'nextLink' property in the response
     * to get the next page of security automations for the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security automations response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutomationInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the security automations in the specified resource group. Use the 'nextLink' property in the response
     * to get the next page of security automations for the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of security automations response as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutomationInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieves information about the model of a security automation.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutomationInner> getByResourceGroupWithResponse(String resourceGroupName, String automationName,
        Context context);

    /**
     * Retrieves information about the model of a security automation.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutomationInner getByResourceGroup(String resourceGroupName, String automationName);

    /**
     * Creates or updates a security automation. If a security automation is already created and a subsequent request is
     * issued for the same automation id, then it will be updated.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @param automation The security automation resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutomationInner> createOrUpdateWithResponse(String resourceGroupName, String automationName,
        AutomationInner automation, Context context);

    /**
     * Creates or updates a security automation. If a security automation is already created and a subsequent request is
     * issued for the same automation id, then it will be updated.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @param automation The security automation resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutomationInner createOrUpdate(String resourceGroupName, String automationName, AutomationInner automation);

    /**
     * Updates a security automation.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @param automation The update model of security automation resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutomationInner> updateWithResponse(String resourceGroupName, String automationName,
        AutomationUpdateModel automation, Context context);

    /**
     * Updates a security automation.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @param automation The update model of security automation resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutomationInner update(String resourceGroupName, String automationName, AutomationUpdateModel automation);

    /**
     * Deletes a security automation.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String automationName, Context context);

    /**
     * Deletes a security automation.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String automationName);

    /**
     * Validates the security automation model before create or update. Any validation errors are returned to the
     * client.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @param automation The security automation resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation model state property bag along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AutomationValidationStatusInner> validateWithResponse(String resourceGroupName, String automationName,
        AutomationInner automation, Context context);

    /**
     * Validates the security automation model before create or update. Any validation errors are returned to the
     * client.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case
     * insensitive.
     * @param automationName The security automation name.
     * @param automation The security automation resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the security automation model state property bag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AutomationValidationStatusInner validate(String resourceGroupName, String automationName,
        AutomationInner automation);
}
