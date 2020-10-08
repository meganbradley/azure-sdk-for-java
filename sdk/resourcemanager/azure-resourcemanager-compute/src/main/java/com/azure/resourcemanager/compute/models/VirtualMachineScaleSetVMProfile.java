// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a virtual machine scale set virtual machine profile. */
@Fluent
public final class VirtualMachineScaleSetVMProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineScaleSetVMProfile.class);

    /*
     * Specifies the operating system settings for the virtual machines in the
     * scale set.
     */
    @JsonProperty(value = "osProfile")
    private VirtualMachineScaleSetOSProfile osProfile;

    /*
     * Specifies the storage settings for the virtual machine disks.
     */
    @JsonProperty(value = "storageProfile")
    private VirtualMachineScaleSetStorageProfile storageProfile;

    /*
     * Specifies properties of the network interfaces of the virtual machines
     * in the scale set.
     */
    @JsonProperty(value = "networkProfile")
    private VirtualMachineScaleSetNetworkProfile networkProfile;

    /*
     * Specifies the boot diagnostic settings state. <br><br>Minimum
     * api-version: 2015-06-15.
     */
    @JsonProperty(value = "diagnosticsProfile")
    private DiagnosticsProfile diagnosticsProfile;

    /*
     * Specifies a collection of settings for extensions installed on virtual
     * machines in the scale set.
     */
    @JsonProperty(value = "extensionProfile")
    private VirtualMachineScaleSetExtensionProfile extensionProfile;

    /*
     * Specifies that the image or disk that is being used was licensed
     * on-premises. This element is only used for images that contain the
     * Windows Server operating system. <br><br> Possible values are: <br><br>
     * Windows_Client <br><br> Windows_Server <br><br> If this element is
     * included in a request for an update, the value must match the initial
     * value. This value cannot be updated. <br><br> For more information, see
     * [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * <br><br> Minimum api-version: 2015-06-15
     */
    @JsonProperty(value = "licenseType")
    private String licenseType;

    /*
     * Specifies the priority for the virtual machines in the scale set.
     * <br><br>Minimum api-version: 2017-10-30-preview
     */
    @JsonProperty(value = "priority")
    private VirtualMachinePriorityTypes priority;

    /*
     * Specifies the eviction policy for the Azure Spot virtual machine and
     * Azure Spot scale set. <br><br>For Azure Spot virtual machines, both
     * 'Deallocate' and 'Delete' are supported and the minimum api-version is
     * 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and
     * 'Delete' are supported and the minimum api-version is
     * 2017-10-30-preview.
     */
    @JsonProperty(value = "evictionPolicy")
    private VirtualMachineEvictionPolicyTypes evictionPolicy;

    /*
     * Specifies the billing related details of a Azure Spot VMSS.
     * <br><br>Minimum api-version: 2019-03-01.
     */
    @JsonProperty(value = "billingProfile")
    private BillingProfile billingProfile;

    /*
     * Specifies Scheduled Event related configurations.
     */
    @JsonProperty(value = "scheduledEventsProfile")
    private ScheduledEventsProfile scheduledEventsProfile;

    /**
     * Get the osProfile property: Specifies the operating system settings for the virtual machines in the scale set.
     *
     * @return the osProfile value.
     */
    public VirtualMachineScaleSetOSProfile osProfile() {
        return this.osProfile;
    }

    /**
     * Set the osProfile property: Specifies the operating system settings for the virtual machines in the scale set.
     *
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withOsProfile(VirtualMachineScaleSetOSProfile osProfile) {
        this.osProfile = osProfile;
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    public VirtualMachineScaleSetStorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withStorageProfile(VirtualMachineScaleSetStorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the networkProfile property: Specifies properties of the network interfaces of the virtual machines in the
     * scale set.
     *
     * @return the networkProfile value.
     */
    public VirtualMachineScaleSetNetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Specifies properties of the network interfaces of the virtual machines in the
     * scale set.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withNetworkProfile(VirtualMachineScaleSetNetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.diagnosticsProfile;
    }

    /**
     * Set the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        this.diagnosticsProfile = diagnosticsProfile;
        return this;
    }

    /**
     * Get the extensionProfile property: Specifies a collection of settings for extensions installed on virtual
     * machines in the scale set.
     *
     * @return the extensionProfile value.
     */
    public VirtualMachineScaleSetExtensionProfile extensionProfile() {
        return this.extensionProfile;
    }

    /**
     * Set the extensionProfile property: Specifies a collection of settings for extensions installed on virtual
     * machines in the scale set.
     *
     * @param extensionProfile the extensionProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withExtensionProfile(
        VirtualMachineScaleSetExtensionProfile extensionProfile) {
        this.extensionProfile = extensionProfile;
        return this;
    }

    /**
     * Get the licenseType property: Specifies that the image or disk that is being used was licensed on-premises. This
     * element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible
     * values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this
     * element is included in a request for an update, the value must match the initial value. This value cannot be
     * updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies that the image or disk that is being used was licensed on-premises. This
     * element is only used for images that contain the Windows Server operating system. &lt;br&gt;&lt;br&gt; Possible
     * values are: &lt;br&gt;&lt;br&gt; Windows_Client &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; If this
     * element is included in a request for an update, the value must match the initial value. This value cannot be
     * updated. &lt;br&gt;&lt;br&gt; For more information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/virtual-machines-windows-hybrid-use-benefit-licensing?toc=%2fazure%2fvirtual-machines%2fwindows%2ftoc.json)
     * &lt;br&gt;&lt;br&gt; Minimum api-version: 2015-06-15.
     *
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withLicenseType(String licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the priority property: Specifies the priority for the virtual machines in the scale set.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2017-10-30-preview.
     *
     * @return the priority value.
     */
    public VirtualMachinePriorityTypes priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Specifies the priority for the virtual machines in the scale set.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2017-10-30-preview.
     *
     * @param priority the priority value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withPriority(VirtualMachinePriorityTypes priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot
     * scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and
     * the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both 'Deallocate' and
     * 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     *
     * @return the evictionPolicy value.
     */
    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.evictionPolicy;
    }

    /**
     * Set the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot
     * scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and
     * the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both 'Deallocate' and
     * 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     *
     * @param evictionPolicy the evictionPolicy value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy) {
        this.evictionPolicy = evictionPolicy;
        return this;
    }

    /**
     * Get the billingProfile property: Specifies the billing related details of a Azure Spot VMSS.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @return the billingProfile value.
     */
    public BillingProfile billingProfile() {
        return this.billingProfile;
    }

    /**
     * Set the billingProfile property: Specifies the billing related details of a Azure Spot VMSS.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @param billingProfile the billingProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withBillingProfile(BillingProfile billingProfile) {
        this.billingProfile = billingProfile;
        return this;
    }

    /**
     * Get the scheduledEventsProfile property: Specifies Scheduled Event related configurations.
     *
     * @return the scheduledEventsProfile value.
     */
    public ScheduledEventsProfile scheduledEventsProfile() {
        return this.scheduledEventsProfile;
    }

    /**
     * Set the scheduledEventsProfile property: Specifies Scheduled Event related configurations.
     *
     * @param scheduledEventsProfile the scheduledEventsProfile value to set.
     * @return the VirtualMachineScaleSetVMProfile object itself.
     */
    public VirtualMachineScaleSetVMProfile withScheduledEventsProfile(ScheduledEventsProfile scheduledEventsProfile) {
        this.scheduledEventsProfile = scheduledEventsProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osProfile() != null) {
            osProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (networkProfile() != null) {
            networkProfile().validate();
        }
        if (diagnosticsProfile() != null) {
            diagnosticsProfile().validate();
        }
        if (extensionProfile() != null) {
            extensionProfile().validate();
        }
        if (billingProfile() != null) {
            billingProfile().validate();
        }
        if (scheduledEventsProfile() != null) {
            scheduledEventsProfile().validate();
        }
    }
}
