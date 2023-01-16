// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.DiagnosticProactiveLogCollectionSettingsInner;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.DiagnosticRemoteSupportSettingsInner;

/** Resource collection API of DiagnosticSettings. */
public interface DiagnosticSettings {
    /**
     * Gets the proactive log collection settings of the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the proactive log collection settings of the specified Data Box Edge/Data Box Gateway device along with
     *     {@link Response}.
     */
    Response<DiagnosticProactiveLogCollectionSettings> getDiagnosticProactiveLogCollectionSettingsWithResponse(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Gets the proactive log collection settings of the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the proactive log collection settings of the specified Data Box Edge/Data Box Gateway device.
     */
    DiagnosticProactiveLogCollectionSettings getDiagnosticProactiveLogCollectionSettings(
        String deviceName, String resourceGroupName);

    /**
     * Updates the proactive log collection settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param proactiveLogCollectionSettings The proactive log collection settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic proactive log collection settings of a device.
     */
    DiagnosticProactiveLogCollectionSettings updateDiagnosticProactiveLogCollectionSettings(
        String deviceName,
        String resourceGroupName,
        DiagnosticProactiveLogCollectionSettingsInner proactiveLogCollectionSettings);

    /**
     * Updates the proactive log collection settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param proactiveLogCollectionSettings The proactive log collection settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic proactive log collection settings of a device.
     */
    DiagnosticProactiveLogCollectionSettings updateDiagnosticProactiveLogCollectionSettings(
        String deviceName,
        String resourceGroupName,
        DiagnosticProactiveLogCollectionSettingsInner proactiveLogCollectionSettings,
        Context context);

    /**
     * Gets the diagnostic remote support settings of the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic remote support settings of the specified Data Box Edge/Data Box Gateway device along with
     *     {@link Response}.
     */
    Response<DiagnosticRemoteSupportSettings> getDiagnosticRemoteSupportSettingsWithResponse(
        String deviceName, String resourceGroupName, Context context);

    /**
     * Gets the diagnostic remote support settings of the specified Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the diagnostic remote support settings of the specified Data Box Edge/Data Box Gateway device.
     */
    DiagnosticRemoteSupportSettings getDiagnosticRemoteSupportSettings(String deviceName, String resourceGroupName);

    /**
     * Updates the diagnostic remote support settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param diagnosticRemoteSupportSettings The diagnostic remote support settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remote support settings of a device.
     */
    DiagnosticRemoteSupportSettings updateDiagnosticRemoteSupportSettings(
        String deviceName,
        String resourceGroupName,
        DiagnosticRemoteSupportSettingsInner diagnosticRemoteSupportSettings);

    /**
     * Updates the diagnostic remote support settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param diagnosticRemoteSupportSettings The diagnostic remote support settings.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the remote support settings of a device.
     */
    DiagnosticRemoteSupportSettings updateDiagnosticRemoteSupportSettings(
        String deviceName,
        String resourceGroupName,
        DiagnosticRemoteSupportSettingsInner diagnosticRemoteSupportSettings,
        Context context);
}
