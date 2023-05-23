// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.network.models.BastionHostIpConfiguration;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Bastion Host resource. */
@Fluent
public final class BastionHostInner extends Resource {
    /*
     * Represents the bastion host resource.
     */
    @JsonProperty(value = "properties")
    private BastionHostPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The sku of this Bastion Host.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /** Creates an instance of BastionHostInner class. */
    public BastionHostInner() {
    }

    /**
     * Get the innerProperties property: Represents the bastion host resource.
     *
     * @return the innerProperties value.
     */
    private BastionHostPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the sku property: The sku of this Bastion Host.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku of this Bastion Host.
     *
     * @param sku the sku value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BastionHostInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BastionHostInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configuration of the Bastion Host resource.
     *
     * @return the ipConfigurations value.
     */
    public List<BastionHostIpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Set the ipConfigurations property: IP configuration of the Bastion Host resource.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withIpConfigurations(List<BastionHostIpConfiguration> ipConfigurations) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withIpConfigurations(ipConfigurations);
        return this;
    }

    /**
     * Get the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     *
     * @return the dnsName value.
     */
    public String dnsName() {
        return this.innerProperties() == null ? null : this.innerProperties().dnsName();
    }

    /**
     * Set the dnsName property: FQDN for the endpoint on which bastion host is accessible.
     *
     * @param dnsName the dnsName value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withDnsName(String dnsName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withDnsName(dnsName);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the bastion host resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the scaleUnits property: The scale units for the Bastion Host resource.
     *
     * @return the scaleUnits value.
     */
    public Integer scaleUnits() {
        return this.innerProperties() == null ? null : this.innerProperties().scaleUnits();
    }

    /**
     * Set the scaleUnits property: The scale units for the Bastion Host resource.
     *
     * @param scaleUnits the scaleUnits value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withScaleUnits(Integer scaleUnits) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withScaleUnits(scaleUnits);
        return this;
    }

    /**
     * Get the disableCopyPaste property: Enable/Disable Copy/Paste feature of the Bastion Host resource.
     *
     * @return the disableCopyPaste value.
     */
    public Boolean disableCopyPaste() {
        return this.innerProperties() == null ? null : this.innerProperties().disableCopyPaste();
    }

    /**
     * Set the disableCopyPaste property: Enable/Disable Copy/Paste feature of the Bastion Host resource.
     *
     * @param disableCopyPaste the disableCopyPaste value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withDisableCopyPaste(Boolean disableCopyPaste) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withDisableCopyPaste(disableCopyPaste);
        return this;
    }

    /**
     * Get the enableFileCopy property: Enable/Disable File Copy feature of the Bastion Host resource.
     *
     * @return the enableFileCopy value.
     */
    public Boolean enableFileCopy() {
        return this.innerProperties() == null ? null : this.innerProperties().enableFileCopy();
    }

    /**
     * Set the enableFileCopy property: Enable/Disable File Copy feature of the Bastion Host resource.
     *
     * @param enableFileCopy the enableFileCopy value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableFileCopy(Boolean enableFileCopy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableFileCopy(enableFileCopy);
        return this;
    }

    /**
     * Get the enableIpConnect property: Enable/Disable IP Connect feature of the Bastion Host resource.
     *
     * @return the enableIpConnect value.
     */
    public Boolean enableIpConnect() {
        return this.innerProperties() == null ? null : this.innerProperties().enableIpConnect();
    }

    /**
     * Set the enableIpConnect property: Enable/Disable IP Connect feature of the Bastion Host resource.
     *
     * @param enableIpConnect the enableIpConnect value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableIpConnect(Boolean enableIpConnect) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableIpConnect(enableIpConnect);
        return this;
    }

    /**
     * Get the enableShareableLink property: Enable/Disable Shareable Link of the Bastion Host resource.
     *
     * @return the enableShareableLink value.
     */
    public Boolean enableShareableLink() {
        return this.innerProperties() == null ? null : this.innerProperties().enableShareableLink();
    }

    /**
     * Set the enableShareableLink property: Enable/Disable Shareable Link of the Bastion Host resource.
     *
     * @param enableShareableLink the enableShareableLink value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableShareableLink(Boolean enableShareableLink) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableShareableLink(enableShareableLink);
        return this;
    }

    /**
     * Get the enableTunneling property: Enable/Disable Tunneling feature of the Bastion Host resource.
     *
     * @return the enableTunneling value.
     */
    public Boolean enableTunneling() {
        return this.innerProperties() == null ? null : this.innerProperties().enableTunneling();
    }

    /**
     * Set the enableTunneling property: Enable/Disable Tunneling feature of the Bastion Host resource.
     *
     * @param enableTunneling the enableTunneling value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableTunneling(Boolean enableTunneling) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableTunneling(enableTunneling);
        return this;
    }

    /**
     * Get the enableKerberos property: Enable/Disable Kerberos feature of the Bastion Host resource.
     *
     * @return the enableKerberos value.
     */
    public Boolean enableKerberos() {
        return this.innerProperties() == null ? null : this.innerProperties().enableKerberos();
    }

    /**
     * Set the enableKerberos property: Enable/Disable Kerberos feature of the Bastion Host resource.
     *
     * @param enableKerberos the enableKerberos value to set.
     * @return the BastionHostInner object itself.
     */
    public BastionHostInner withEnableKerberos(Boolean enableKerberos) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostPropertiesFormat();
        }
        this.innerProperties().withEnableKerberos(enableKerberos);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
