// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The configuration for Compute Nodes in a Pool based on the Azure Virtual Machines infrastructure. */
@Fluent
public final class VirtualMachineConfiguration {

    /*
     * A reference to an Azure Virtual Machines Marketplace Image or a Shared Image
     * Gallery Image. To get the list of all Azure Marketplace Image references
     * verified by Azure Batch, see the 'List Supported Images' operation.
     */
    @JsonProperty(value = "imageReference", required = true)
    private ImageReference imageReference;

    /*
     * The Batch Compute Node agent is a program that runs on each Compute Node in the
     * Pool, and provides the command-and-control interface between the Compute Node
     * and the Batch service. There are different implementations of the Compute Node
     * agent, known as SKUs, for different operating systems. You must specify a
     * Compute Node agent SKU which matches the selected Image reference. To get the
     * list of supported Compute Node agent SKUs along with their list of verified
     * Image references, see the 'List supported Compute Node agent SKUs' operation.
     */
    @JsonProperty(value = "nodeAgentSKUId", required = true)
    private String nodeAgentSKUId;

    /*
     * This property must not be specified if the imageReference property specifies a
     * Linux OS Image.
     */
    @JsonProperty(value = "windowsConfiguration")
    private WindowsConfiguration windowsConfiguration;

    /*
     * This property must be specified if the Compute Nodes in the Pool need to have
     * empty data disks attached to them. This cannot be updated. Each Compute Node
     * gets its own disk (the disk is not a file share). Existing disks cannot be
     * attached, each attached disk is empty. When the Compute Node is removed from
     * the Pool, the disk and all data associated with it is also deleted. The disk is
     * not formatted after being attached, it must be formatted before use - for more
     * information see
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/classic/attach-disk#initialize-a-new-data-disk-in-linux
     * and
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/attach-disk-ps#add-an-empty-data-disk-to-a-virtual-machine.
     */
    @JsonProperty(value = "dataDisks")
    private List<DataDisk> dataDisks;

    /*
     * This only applies to Images that contain the Windows operating system, and
     * should only be used when you hold valid on-premises licenses for the Compute
     * Nodes which will be deployed. If omitted, no on-premises licensing discount is
     * applied. Values are:
     *
     * Windows_Server - The on-premises license is for Windows
     * Server.
     * Windows_Client - The on-premises license is for Windows Client.
     *
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /*
     * If specified, setup is performed on each Compute Node in the Pool to allow
     * Tasks to run in containers. All regular Tasks and Job manager Tasks run on this
     * Pool must specify the containerSettings property, and all other Tasks may
     * specify it.
     */
    @JsonProperty(value = "containerConfiguration")
    private ContainerConfiguration containerConfiguration;

    /*
     * If specified, encryption is performed on each node in the pool during node
     * provisioning.
     */
    @JsonProperty(value = "diskEncryptionConfiguration")
    private DiskEncryptionConfiguration diskEncryptionConfiguration;

    /*
     * This configuration will specify rules on how nodes in the pool will be
     * physically allocated.
     */
    @JsonProperty(value = "nodePlacementConfiguration")
    private NodePlacementConfiguration nodePlacementConfiguration;

    /*
     * If specified, the extensions mentioned in this configuration will be installed
     * on each node.
     */
    @JsonProperty(value = "extensions")
    private List<VMExtension> extensions;

    /*
     * Settings for the operating system disk of the compute node (VM).
     */
    @JsonProperty(value = "osDisk")
    private OSDisk osDisk;

    /**
     * Creates an instance of VirtualMachineConfiguration class.
     *
     * @param imageReference the imageReference value to set.
     * @param nodeAgentSKUId the nodeAgentSKUId value to set.
     */
    @JsonCreator
    public VirtualMachineConfiguration(
            @JsonProperty(value = "imageReference", required = true) ImageReference imageReference,
            @JsonProperty(value = "nodeAgentSKUId", required = true) String nodeAgentSKUId) {
        this.imageReference = imageReference;
        this.nodeAgentSKUId = nodeAgentSKUId;
    }

    /**
     * Get the imageReference property: A reference to an Azure Virtual Machines Marketplace Image or a Shared Image
     * Gallery Image. To get the list of all Azure Marketplace Image references verified by Azure Batch, see the 'List
     * Supported Images' operation.
     *
     * @return the imageReference value.
     */
    public ImageReference getImageReference() {
        return this.imageReference;
    }

    /**
     * Get the nodeAgentSKUId property: The Batch Compute Node agent is a program that runs on each Compute Node in the
     * Pool, and provides the command-and-control interface between the Compute Node and the Batch service. There are
     * different implementations of the Compute Node agent, known as SKUs, for different operating systems. You must
     * specify a Compute Node agent SKU which matches the selected Image reference. To get the list of supported Compute
     * Node agent SKUs along with their list of verified Image references, see the 'List supported Compute Node agent
     * SKUs' operation.
     *
     * @return the nodeAgentSKUId value.
     */
    public String getNodeAgentSKUId() {
        return this.nodeAgentSKUId;
    }

    /**
     * Get the windowsConfiguration property: This property must not be specified if the imageReference property
     * specifies a Linux OS Image.
     *
     * @return the windowsConfiguration value.
     */
    public WindowsConfiguration getWindowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * Set the windowsConfiguration property: This property must not be specified if the imageReference property
     * specifies a Linux OS Image.
     *
     * @param windowsConfiguration the windowsConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration setWindowsConfiguration(WindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * Get the dataDisks property: This property must be specified if the Compute Nodes in the Pool need to have empty
     * data disks attached to them. This cannot be updated. Each Compute Node gets its own disk (the disk is not a file
     * share). Existing disks cannot be attached, each attached disk is empty. When the Compute Node is removed from the
     * Pool, the disk and all data associated with it is also deleted. The disk is not formatted after being attached,
     * it must be formatted before use - for more information see
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/classic/attach-disk#initialize-a-new-data-disk-in-linux
     * and
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/attach-disk-ps#add-an-empty-data-disk-to-a-virtual-machine.
     *
     * @return the dataDisks value.
     */
    public List<DataDisk> getDataDisks() {
        return this.dataDisks;
    }

    /**
     * Set the dataDisks property: This property must be specified if the Compute Nodes in the Pool need to have empty
     * data disks attached to them. This cannot be updated. Each Compute Node gets its own disk (the disk is not a file
     * share). Existing disks cannot be attached, each attached disk is empty. When the Compute Node is removed from the
     * Pool, the disk and all data associated with it is also deleted. The disk is not formatted after being attached,
     * it must be formatted before use - for more information see
     * https://docs.microsoft.com/en-us/azure/virtual-machines/linux/classic/attach-disk#initialize-a-new-data-disk-in-linux
     * and
     * https://docs.microsoft.com/en-us/azure/virtual-machines/windows/attach-disk-ps#add-an-empty-data-disk-to-a-virtual-machine.
     *
     * @param dataDisks the dataDisks value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration setDataDisks(List<DataDisk> dataDisks) {
        this.dataDisks = dataDisks;
        return this;
    }

    /**
     * Get the licenseType property: This only applies to Images that contain the Windows operating system, and should
     * only be used when you hold valid on-premises licenses for the Compute Nodes which will be deployed. If omitted,
     * no on-premises licensing discount is applied. Values are:
     *
     * <p>Windows_Server - The on-premises license is for Windows Server. Windows_Client - The on-premises license is
     * for Windows Client.
     *
     * @return the licenseType value.
     */
    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: This only applies to Images that contain the Windows operating system, and should
     * only be used when you hold valid on-premises licenses for the Compute Nodes which will be deployed. If omitted,
     * no on-premises licensing discount is applied. Values are:
     *
     * <p>Windows_Server - The on-premises license is for Windows Server. Windows_Client - The on-premises license is
     * for Windows Client.
     *
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration setLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the containerConfiguration property: If specified, setup is performed on each Compute Node in the Pool to
     * allow Tasks to run in containers. All regular Tasks and Job manager Tasks run on this Pool must specify the
     * containerSettings property, and all other Tasks may specify it.
     *
     * @return the containerConfiguration value.
     */
    public ContainerConfiguration getContainerConfiguration() {
        return this.containerConfiguration;
    }

    /**
     * Set the containerConfiguration property: If specified, setup is performed on each Compute Node in the Pool to
     * allow Tasks to run in containers. All regular Tasks and Job manager Tasks run on this Pool must specify the
     * containerSettings property, and all other Tasks may specify it.
     *
     * @param containerConfiguration the containerConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration setContainerConfiguration(ContainerConfiguration containerConfiguration) {
        this.containerConfiguration = containerConfiguration;
        return this;
    }

    /**
     * Get the diskEncryptionConfiguration property: If specified, encryption is performed on each node in the pool
     * during node provisioning.
     *
     * @return the diskEncryptionConfiguration value.
     */
    public DiskEncryptionConfiguration getDiskEncryptionConfiguration() {
        return this.diskEncryptionConfiguration;
    }

    /**
     * Set the diskEncryptionConfiguration property: If specified, encryption is performed on each node in the pool
     * during node provisioning.
     *
     * @param diskEncryptionConfiguration the diskEncryptionConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration setDiskEncryptionConfiguration(
            DiskEncryptionConfiguration diskEncryptionConfiguration) {
        this.diskEncryptionConfiguration = diskEncryptionConfiguration;
        return this;
    }

    /**
     * Get the nodePlacementConfiguration property: This configuration will specify rules on how nodes in the pool will
     * be physically allocated.
     *
     * @return the nodePlacementConfiguration value.
     */
    public NodePlacementConfiguration getNodePlacementConfiguration() {
        return this.nodePlacementConfiguration;
    }

    /**
     * Set the nodePlacementConfiguration property: This configuration will specify rules on how nodes in the pool will
     * be physically allocated.
     *
     * @param nodePlacementConfiguration the nodePlacementConfiguration value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration setNodePlacementConfiguration(
            NodePlacementConfiguration nodePlacementConfiguration) {
        this.nodePlacementConfiguration = nodePlacementConfiguration;
        return this;
    }

    /**
     * Get the extensions property: If specified, the extensions mentioned in this configuration will be installed on
     * each node.
     *
     * @return the extensions value.
     */
    public List<VMExtension> getExtensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: If specified, the extensions mentioned in this configuration will be installed on
     * each node.
     *
     * @param extensions the extensions value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration setExtensions(List<VMExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the osDisk property: Settings for the operating system disk of the compute node (VM).
     *
     * @return the osDisk value.
     */
    public OSDisk getOsDisk() {
        return this.osDisk;
    }

    /**
     * Set the osDisk property: Settings for the operating system disk of the compute node (VM).
     *
     * @param osDisk the osDisk value to set.
     * @return the VirtualMachineConfiguration object itself.
     */
    public VirtualMachineConfiguration setOsDisk(OSDisk osDisk) {
        this.osDisk = osDisk;
        return this;
    }
}
