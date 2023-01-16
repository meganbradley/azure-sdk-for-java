// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.DiagnosticProactiveLogCollectionSettingsInner;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.DiagnosticRemoteSupportSettingsInner;

/** An instance of this class provides access to all the operations defined in DiagnosticSettingsClient. */
public interface DiagnosticSettingsClient {
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticProactiveLogCollectionSettingsInner> getDiagnosticProactiveLogCollectionSettingsWithResponse(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticProactiveLogCollectionSettingsInner getDiagnosticProactiveLogCollectionSettings(
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
     * @return the {@link SyncPoller} for polling of the diagnostic proactive log collection settings of a device.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnosticProactiveLogCollectionSettingsInner>, DiagnosticProactiveLogCollectionSettingsInner>
        beginUpdateDiagnosticProactiveLogCollectionSettings(
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
     * @return the {@link SyncPoller} for polling of the diagnostic proactive log collection settings of a device.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnosticProactiveLogCollectionSettingsInner>, DiagnosticProactiveLogCollectionSettingsInner>
        beginUpdateDiagnosticProactiveLogCollectionSettings(
            String deviceName,
            String resourceGroupName,
            DiagnosticProactiveLogCollectionSettingsInner proactiveLogCollectionSettings,
            Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticProactiveLogCollectionSettingsInner updateDiagnosticProactiveLogCollectionSettings(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticProactiveLogCollectionSettingsInner updateDiagnosticProactiveLogCollectionSettings(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DiagnosticRemoteSupportSettingsInner> getDiagnosticRemoteSupportSettingsWithResponse(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticRemoteSupportSettingsInner getDiagnosticRemoteSupportSettings(
        String deviceName, String resourceGroupName);

    /**
     * Updates the diagnostic remote support settings on a Data Box Edge/Data Box Gateway device.
     *
     * @param deviceName The device name.
     * @param resourceGroupName The resource group name.
     * @param diagnosticRemoteSupportSettings The diagnostic remote support settings.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the remote support settings of a device.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnosticRemoteSupportSettingsInner>, DiagnosticRemoteSupportSettingsInner>
        beginUpdateDiagnosticRemoteSupportSettings(
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
     * @return the {@link SyncPoller} for polling of the remote support settings of a device.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<DiagnosticRemoteSupportSettingsInner>, DiagnosticRemoteSupportSettingsInner>
        beginUpdateDiagnosticRemoteSupportSettings(
            String deviceName,
            String resourceGroupName,
            DiagnosticRemoteSupportSettingsInner diagnosticRemoteSupportSettings,
            Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticRemoteSupportSettingsInner updateDiagnosticRemoteSupportSettings(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    DiagnosticRemoteSupportSettingsInner updateDiagnosticRemoteSupportSettings(
        String deviceName,
        String resourceGroupName,
        DiagnosticRemoteSupportSettingsInner diagnosticRemoteSupportSettings,
        Context context);
}
