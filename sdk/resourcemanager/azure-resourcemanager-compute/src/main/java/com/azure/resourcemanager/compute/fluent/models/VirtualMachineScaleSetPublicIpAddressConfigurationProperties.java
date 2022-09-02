// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.compute.models.DeleteOptions;
import com.azure.resourcemanager.compute.models.IpVersion;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetIpTag;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes a virtual machines scale set IP Configuration's PublicIPAddress configuration. */
@Fluent
public final class VirtualMachineScaleSetPublicIpAddressConfigurationProperties {
    /*
     * The idle timeout of the public IP address.
     */
    @JsonProperty(value = "idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /*
     * The dns settings to be applied on the publicIP addresses .
     */
    @JsonProperty(value = "dnsSettings")
    private VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings;

    /*
     * The list of IP tags associated with the public IP address.
     */
    @JsonProperty(value = "ipTags")
    private List<VirtualMachineScaleSetIpTag> ipTags;

    /*
     * The PublicIPPrefix from which to allocate publicIP addresses.
     */
    @JsonProperty(value = "publicIPPrefix")
    private SubResource publicIpPrefix;

    /*
     * Available from Api-Version 2019-07-01 onwards, it represents whether the specific ipconfiguration is IPv4 or
     * IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     */
    @JsonProperty(value = "publicIPAddressVersion")
    private IpVersion publicIpAddressVersion;

    /*
     * Specify what happens to the public IP when the VM is deleted
     */
    @JsonProperty(value = "deleteOption")
    private DeleteOptions deleteOption;

    /**
     * Get the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value.
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idleTimeoutInMinutes property: The idle timeout of the public IP address.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationProperties withIdleTimeoutInMinutes(
        Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     *
     * @return the dnsSettings value.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: The dns settings to be applied on the publicIP addresses .
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationProperties withDnsSettings(
        VirtualMachineScaleSetPublicIpAddressConfigurationDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ipTags property: The list of IP tags associated with the public IP address.
     *
     * @return the ipTags value.
     */
    public List<VirtualMachineScaleSetIpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the ipTags property: The list of IP tags associated with the public IP address.
     *
     * @param ipTags the ipTags value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationProperties withIpTags(
        List<VirtualMachineScaleSetIpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     *
     * @return the publicIpPrefix value.
     */
    public SubResource publicIpPrefix() {
        return this.publicIpPrefix;
    }

    /**
     * Set the publicIpPrefix property: The PublicIPPrefix from which to allocate publicIP addresses.
     *
     * @param publicIpPrefix the publicIpPrefix value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationProperties withPublicIpPrefix(SubResource publicIpPrefix) {
        this.publicIpPrefix = publicIpPrefix;
        return this;
    }

    /**
     * Get the publicIpAddressVersion property: Available from Api-Version 2019-07-01 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the publicIpAddressVersion value.
     */
    public IpVersion publicIpAddressVersion() {
        return this.publicIpAddressVersion;
    }

    /**
     * Set the publicIpAddressVersion property: Available from Api-Version 2019-07-01 onwards, it represents whether the
     * specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @param publicIpAddressVersion the publicIpAddressVersion value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationProperties withPublicIpAddressVersion(
        IpVersion publicIpAddressVersion) {
        this.publicIpAddressVersion = publicIpAddressVersion;
        return this;
    }

    /**
     * Get the deleteOption property: Specify what happens to the public IP when the VM is deleted.
     *
     * @return the deleteOption value.
     */
    public DeleteOptions deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specify what happens to the public IP when the VM is deleted.
     *
     * @param deleteOption the deleteOption value to set.
     * @return the VirtualMachineScaleSetPublicIpAddressConfigurationProperties object itself.
     */
    public VirtualMachineScaleSetPublicIpAddressConfigurationProperties withDeleteOption(DeleteOptions deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsSettings() != null) {
            dnsSettings().validate();
        }
        if (ipTags() != null) {
            ipTags().forEach(e -> e.validate());
        }
    }
}
