// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of BareMetalMachines. */
public interface BareMetalMachines {
    /**
     * List bare metal machines in the subscription.
     *
     * <p>Get a list of bare metal machines in the provided subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of bare metal machines in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BareMetalMachine> list();

    /**
     * List bare metal machines in the subscription.
     *
     * <p>Get a list of bare metal machines in the provided subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of bare metal machines in the provided subscription as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BareMetalMachine> list(Context context);

    /**
     * List bare metal machines in the resource group.
     *
     * <p>Get a list of bare metal machines in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of bare metal machines in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BareMetalMachine> listByResourceGroup(String resourceGroupName);

    /**
     * List bare metal machines in the resource group.
     *
     * <p>Get a list of bare metal machines in the provided resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of bare metal machines in the provided resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<BareMetalMachine> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Retrieve the bare metal machine.
     *
     * <p>Get properties of the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided bare metal machine along with {@link Response}.
     */
    Response<BareMetalMachine> getByResourceGroupWithResponse(
        String resourceGroupName, String bareMetalMachineName, Context context);

    /**
     * Retrieve the bare metal machine.
     *
     * <p>Get properties of the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided bare metal machine.
     */
    BareMetalMachine getByResourceGroup(String resourceGroupName, String bareMetalMachineName);

    /**
     * Delete the bare metal machine.
     *
     * <p>Delete the provided bare metal machine. All customer initiated requests will be rejected as the life cycle of
     * this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String bareMetalMachineName);

    /**
     * Delete the bare metal machine.
     *
     * <p>Delete the provided bare metal machine. All customer initiated requests will be rejected as the life cycle of
     * this resource is managed by the system.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String bareMetalMachineName, Context context);

    /**
     * Cordon the bare metal machine.
     *
     * <p>Cordon the provided bare metal machine's Kubernetes node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cordon(String resourceGroupName, String bareMetalMachineName);

    /**
     * Cordon the bare metal machine.
     *
     * <p>Cordon the provided bare metal machine's Kubernetes node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineCordonParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cordon(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineCordonParameters bareMetalMachineCordonParameters,
        Context context);

    /**
     * Power off the bare metal machine.
     *
     * <p>Power off the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(String resourceGroupName, String bareMetalMachineName);

    /**
     * Power off the bare metal machine.
     *
     * <p>Power off the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachinePowerOffParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachinePowerOffParameters bareMetalMachinePowerOffParameters,
        Context context);

    /**
     * Reimage the bare metal machine.
     *
     * <p>Reimage the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String bareMetalMachineName);

    /**
     * Reimage the bare metal machine.
     *
     * <p>Reimage the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String bareMetalMachineName, Context context);

    /**
     * Replace (service) the bare metal machine.
     *
     * <p>Replace the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void replace(String resourceGroupName, String bareMetalMachineName);

    /**
     * Replace (service) the bare metal machine.
     *
     * <p>Replace the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineReplaceParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void replace(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineReplaceParameters bareMetalMachineReplaceParameters,
        Context context);

    /**
     * Restart the bare metal machine.
     *
     * <p>Restart the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String bareMetalMachineName);

    /**
     * Restart the bare metal machine.
     *
     * <p>Restart the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String bareMetalMachineName, Context context);

    /**
     * Run the command on the bare metal machine.
     *
     * <p>Run the command or the script on the provided bare metal machine. The URL to storage account with the command
     * execution results and the command exit code can be retrieved from the operation status API once available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineRunCommandParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void runCommand(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunCommandParameters bareMetalMachineRunCommandParameters);

    /**
     * Run the command on the bare metal machine.
     *
     * <p>Run the command or the script on the provided bare metal machine. The URL to storage account with the command
     * execution results and the command exit code can be retrieved from the operation status API once available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineRunCommandParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void runCommand(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunCommandParameters bareMetalMachineRunCommandParameters,
        Context context);

    /**
     * Run data extraction for a bare metal machine.
     *
     * <p>Run one or more data extractions on the provided bare metal machine. The URL to storage account with the
     * command execution results and the command exit code can be retrieved from the operation status API once
     * available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineRunDataExtractsParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void runDataExtracts(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunDataExtractsParameters bareMetalMachineRunDataExtractsParameters);

    /**
     * Run data extraction for a bare metal machine.
     *
     * <p>Run one or more data extractions on the provided bare metal machine. The URL to storage account with the
     * command execution results and the command exit code can be retrieved from the operation status API once
     * available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineRunDataExtractsParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void runDataExtracts(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunDataExtractsParameters bareMetalMachineRunDataExtractsParameters,
        Context context);

    /**
     * Run read-only commands against a bare metal machine.
     *
     * <p>Run one or more read-only commands on the provided bare metal machine. The URL to storage account with the
     * command execution results and the command exit code can be retrieved from the operation status API once
     * available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineRunReadCommandsParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void runReadCommands(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunReadCommandsParameters bareMetalMachineRunReadCommandsParameters);

    /**
     * Run read-only commands against a bare metal machine.
     *
     * <p>Run one or more read-only commands on the provided bare metal machine. The URL to storage account with the
     * command execution results and the command exit code can be retrieved from the operation status API once
     * available.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineRunReadCommandsParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void runReadCommands(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineRunReadCommandsParameters bareMetalMachineRunReadCommandsParameters,
        Context context);

    /**
     * Start the bare metal machine.
     *
     * <p>Start the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String bareMetalMachineName);

    /**
     * Start the bare metal machine.
     *
     * <p>Start the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String bareMetalMachineName, Context context);

    /**
     * Uncordon the bare metal machine.
     *
     * <p>Uncordon the provided bare metal machine's Kubernetes node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void uncordon(String resourceGroupName, String bareMetalMachineName);

    /**
     * Uncordon the bare metal machine.
     *
     * <p>Uncordon the provided bare metal machine's Kubernetes node.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void uncordon(String resourceGroupName, String bareMetalMachineName, Context context);

    /**
     * Trigger hardware validation of the bare metal machine.
     *
     * <p>Validate the hardware of the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineValidateHardwareParameters The request body.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateHardware(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineValidateHardwareParameters bareMetalMachineValidateHardwareParameters);

    /**
     * Trigger hardware validation of the bare metal machine.
     *
     * <p>Validate the hardware of the provided bare metal machine.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param bareMetalMachineName The name of the bare metal machine.
     * @param bareMetalMachineValidateHardwareParameters The request body.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void validateHardware(
        String resourceGroupName,
        String bareMetalMachineName,
        BareMetalMachineValidateHardwareParameters bareMetalMachineValidateHardwareParameters,
        Context context);

    /**
     * Retrieve the bare metal machine.
     *
     * <p>Get properties of the provided bare metal machine.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided bare metal machine along with {@link Response}.
     */
    BareMetalMachine getById(String id);

    /**
     * Retrieve the bare metal machine.
     *
     * <p>Get properties of the provided bare metal machine.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the provided bare metal machine along with {@link Response}.
     */
    Response<BareMetalMachine> getByIdWithResponse(String id, Context context);

    /**
     * Delete the bare metal machine.
     *
     * <p>Delete the provided bare metal machine. All customer initiated requests will be rejected as the life cycle of
     * this resource is managed by the system.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the bare metal machine.
     *
     * <p>Delete the provided bare metal machine. All customer initiated requests will be rejected as the life cycle of
     * this resource is managed by the system.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new BareMetalMachine resource.
     *
     * @param name resource name.
     * @return the first stage of the new BareMetalMachine definition.
     */
    BareMetalMachine.DefinitionStages.Blank define(String name);
}
