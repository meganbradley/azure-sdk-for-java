// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.baremetalinfrastructure.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.baremetalinfrastructure.fluent.models.AzureBareMetalInstanceInner;
import java.util.Map;

/** An immutable client-side representation of AzureBareMetalInstance. */
public interface AzureBareMetalInstance {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the hardwareProfile property: Specifies the hardware settings for the Azure Bare Metal Instance.
     *
     * @return the hardwareProfile value.
     */
    HardwareProfile hardwareProfile();

    /**
     * Gets the storageProfile property: Specifies the storage settings for the Azure Bare Metal Instance disks.
     *
     * @return the storageProfile value.
     */
    StorageProfile storageProfile();

    /**
     * Gets the osProfile property: Specifies the operating system settings for the Azure Bare Metal Instance.
     *
     * @return the osProfile value.
     */
    OSProfile osProfile();

    /**
     * Gets the networkProfile property: Specifies the network settings for the Azure Bare Metal Instance.
     *
     * @return the networkProfile value.
     */
    NetworkProfile networkProfile();

    /**
     * Gets the azureBareMetalInstanceId property: Specifies the Azure Bare Metal Instance unique ID.
     *
     * @return the azureBareMetalInstanceId value.
     */
    String azureBareMetalInstanceId();

    /**
     * Gets the powerState property: Resource power state.
     *
     * @return the powerState value.
     */
    AzureBareMetalInstancePowerStateEnum powerState();

    /**
     * Gets the proximityPlacementGroup property: Resource proximity placement group.
     *
     * @return the proximityPlacementGroup value.
     */
    String proximityPlacementGroup();

    /**
     * Gets the hwRevision property: Hardware revision of an Azure Bare Metal Instance.
     *
     * @return the hwRevision value.
     */
    String hwRevision();

    /**
     * Gets the partnerNodeId property: ARM ID of another AzureBareMetalInstance that will share a network with this
     * AzureBareMetalInstance.
     *
     * @return the partnerNodeId value.
     */
    String partnerNodeId();

    /**
     * Gets the provisioningState property: State of provisioning of the AzureBareMetalInstance.
     *
     * @return the provisioningState value.
     */
    AzureBareMetalProvisioningStatesEnum provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.baremetalinfrastructure.fluent.models.AzureBareMetalInstanceInner
     * object.
     *
     * @return the inner object.
     */
    AzureBareMetalInstanceInner innerModel();
}
