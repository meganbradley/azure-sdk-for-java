// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.util.Context;

/** Resource collection API of SupportPackages. */
public interface SupportPackages {
    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerSupportPackage(
        String deviceName, String resourceGroupName, TriggerSupportPackageRequest triggerSupportPackageRequest);

    /**
     * Triggers support package on the device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param triggerSupportPackageRequest The trigger support package request object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void triggerSupportPackage(
        String deviceName,
        String resourceGroupName,
        TriggerSupportPackageRequest triggerSupportPackageRequest,
        Context context);
}
