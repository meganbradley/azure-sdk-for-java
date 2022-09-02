// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes a Virtual Machine Scale Set. */
@Fluent
public final class VirtualMachineScaleSetUpdate extends UpdateResource {
    /*
     * The virtual machine scale set sku.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * The purchase plan when deploying a virtual machine scale set from VM Marketplace images.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /*
     * Describes the properties of a Virtual Machine Scale Set.
     */
    @JsonProperty(value = "properties")
    private VirtualMachineScaleSetUpdateProperties innerProperties;

    /*
     * The identity of the virtual machine scale set, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineScaleSetIdentity identity;

    /**
     * Get the sku property: The virtual machine scale set sku.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The virtual machine scale set sku.
     *
     * @param sku the sku value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the plan property: The purchase plan when deploying a virtual machine scale set from VM Marketplace images.
     *
     * @return the plan value.
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: The purchase plan when deploying a virtual machine scale set from VM Marketplace images.
     *
     * @param plan the plan value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the innerProperties property: Describes the properties of a Virtual Machine Scale Set.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineScaleSetUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity of the virtual machine scale set, if configured.
     *
     * @return the identity value.
     */
    public VirtualMachineScaleSetIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the virtual machine scale set, if configured.
     *
     * @param identity the identity value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withIdentity(VirtualMachineScaleSetIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineScaleSetUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the upgradePolicy property: The upgrade policy.
     *
     * @return the upgradePolicy value.
     */
    public UpgradePolicy upgradePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradePolicy();
    }

    /**
     * Set the upgradePolicy property: The upgrade policy.
     *
     * @param upgradePolicy the upgradePolicy value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withUpgradePolicy(UpgradePolicy upgradePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateProperties();
        }
        this.innerProperties().withUpgradePolicy(upgradePolicy);
        return this;
    }

    /**
     * Get the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @return the automaticRepairsPolicy value.
     */
    public AutomaticRepairsPolicy automaticRepairsPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().automaticRepairsPolicy();
    }

    /**
     * Set the automaticRepairsPolicy property: Policy for automatic repairs.
     *
     * @param automaticRepairsPolicy the automaticRepairsPolicy value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withAutomaticRepairsPolicy(AutomaticRepairsPolicy automaticRepairsPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateProperties();
        }
        this.innerProperties().withAutomaticRepairsPolicy(automaticRepairsPolicy);
        return this;
    }

    /**
     * Get the virtualMachineProfile property: The virtual machine profile.
     *
     * @return the virtualMachineProfile value.
     */
    public VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachineProfile();
    }

    /**
     * Set the virtualMachineProfile property: The virtual machine profile.
     *
     * @param virtualMachineProfile the virtualMachineProfile value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withVirtualMachineProfile(
        VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateProperties();
        }
        this.innerProperties().withVirtualMachineProfile(virtualMachineProfile);
        return this;
    }

    /**
     * Get the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @return the overprovision value.
     */
    public Boolean overprovision() {
        return this.innerProperties() == null ? null : this.innerProperties().overprovision();
    }

    /**
     * Set the overprovision property: Specifies whether the Virtual Machine Scale Set should be overprovisioned.
     *
     * @param overprovision the overprovision value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withOverprovision(Boolean overprovision) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateProperties();
        }
        this.innerProperties().withOverprovision(overprovision);
        return this;
    }

    /**
     * Get the doNotRunExtensionsOnOverprovisionedVMs property: When Overprovision is enabled, extensions are launched
     * only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions
     * do not run on the extra overprovisioned VMs.
     *
     * @return the doNotRunExtensionsOnOverprovisionedVMs value.
     */
    public Boolean doNotRunExtensionsOnOverprovisionedVMs() {
        return this.innerProperties() == null ? null : this.innerProperties().doNotRunExtensionsOnOverprovisionedVMs();
    }

    /**
     * Set the doNotRunExtensionsOnOverprovisionedVMs property: When Overprovision is enabled, extensions are launched
     * only on the requested number of VMs which are finally kept. This property will hence ensure that the extensions
     * do not run on the extra overprovisioned VMs.
     *
     * @param doNotRunExtensionsOnOverprovisionedVMs the doNotRunExtensionsOnOverprovisionedVMs value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withDoNotRunExtensionsOnOverprovisionedVMs(
        Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateProperties();
        }
        this.innerProperties().withDoNotRunExtensionsOnOverprovisionedVMs(doNotRunExtensionsOnOverprovisionedVMs);
        return this;
    }

    /**
     * Get the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @return the singlePlacementGroup value.
     */
    public Boolean singlePlacementGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().singlePlacementGroup();
    }

    /**
     * Set the singlePlacementGroup property: When true this limits the scale set to a single placement group, of max
     * size 100 virtual machines. NOTE: If singlePlacementGroup is true, it may be modified to false. However, if
     * singlePlacementGroup is false, it may not be modified to true.
     *
     * @param singlePlacementGroup the singlePlacementGroup value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withSinglePlacementGroup(Boolean singlePlacementGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateProperties();
        }
        this.innerProperties().withSinglePlacementGroup(singlePlacementGroup);
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to
     * support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalCapabilities();
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the Virtual
     * Machines in the Virtual Machine Scale Set. For instance: whether the Virtual Machines have the capability to
     * support attaching managed data disks with UltraSSD_LRS storage account type.
     *
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateProperties();
        }
        this.innerProperties().withAdditionalCapabilities(additionalCapabilities);
        return this;
    }

    /**
     * Get the scaleInPolicy property: Specifies the policies applied when scaling in Virtual Machines in the Virtual
     * Machine Scale Set.
     *
     * @return the scaleInPolicy value.
     */
    public ScaleInPolicy scaleInPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().scaleInPolicy();
    }

    /**
     * Set the scaleInPolicy property: Specifies the policies applied when scaling in Virtual Machines in the Virtual
     * Machine Scale Set.
     *
     * @param scaleInPolicy the scaleInPolicy value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateProperties();
        }
        this.innerProperties().withScaleInPolicy(scaleInPolicy);
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().proximityPlacementGroup();
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine scale set should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the VirtualMachineScaleSetUpdate object itself.
     */
    public VirtualMachineScaleSetUpdate withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineScaleSetUpdateProperties();
        }
        this.innerProperties().withProximityPlacementGroup(proximityPlacementGroup);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sku() != null) {
            sku().validate();
        }
        if (plan() != null) {
            plan().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
