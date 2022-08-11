// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.P2SConnectionConfiguration;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VpnClientConnectionHealth;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Parameters for P2SVpnGateway. */
@Fluent
public final class P2SVpnGatewayProperties {
    /*
     * The VirtualHub to which the gateway belongs.
     */
    @JsonProperty(value = "virtualHub")
    private SubResource virtualHub;

    /*
     * List of all p2s connection configurations of the gateway.
     */
    @JsonProperty(value = "p2SConnectionConfigurations")
    private List<P2SConnectionConfiguration> p2SConnectionConfigurations;

    /*
     * The provisioning state of the P2S VPN gateway resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The scale unit for this p2s vpn gateway.
     */
    @JsonProperty(value = "vpnGatewayScaleUnit")
    private Integer vpnGatewayScaleUnit;

    /*
     * The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     */
    @JsonProperty(value = "vpnServerConfiguration")
    private SubResource vpnServerConfiguration;

    /*
     * All P2S VPN clients' connection health status.
     */
    @JsonProperty(value = "vpnClientConnectionHealth", access = JsonProperty.Access.WRITE_ONLY)
    private VpnClientConnectionHealth vpnClientConnectionHealth;

    /*
     * List of all customer specified DNS servers IP addresses.
     */
    @JsonProperty(value = "customDnsServers")
    private List<String> customDnsServers;

    /*
     * Enable Routing Preference property for the Public IP Interface of the P2SVpnGateway.
     */
    @JsonProperty(value = "isRoutingPreferenceInternet")
    private Boolean isRoutingPreferenceInternet;

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the p2SConnectionConfigurations property: List of all p2s connection configurations of the gateway.
     *
     * @return the p2SConnectionConfigurations value.
     */
    public List<P2SConnectionConfiguration> p2SConnectionConfigurations() {
        return this.p2SConnectionConfigurations;
    }

    /**
     * Set the p2SConnectionConfigurations property: List of all p2s connection configurations of the gateway.
     *
     * @param p2SConnectionConfigurations the p2SConnectionConfigurations value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withP2SConnectionConfigurations(
        List<P2SConnectionConfiguration> p2SConnectionConfigurations) {
        this.p2SConnectionConfigurations = p2SConnectionConfigurations;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the P2S VPN gateway resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     *
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this p2s vpn gateway.
     *
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        return this;
    }

    /**
     * Get the vpnServerConfiguration property: The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     *
     * @return the vpnServerConfiguration value.
     */
    public SubResource vpnServerConfiguration() {
        return this.vpnServerConfiguration;
    }

    /**
     * Set the vpnServerConfiguration property: The VpnServerConfiguration to which the p2sVpnGateway is attached to.
     *
     * @param vpnServerConfiguration the vpnServerConfiguration value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withVpnServerConfiguration(SubResource vpnServerConfiguration) {
        this.vpnServerConfiguration = vpnServerConfiguration;
        return this;
    }

    /**
     * Get the vpnClientConnectionHealth property: All P2S VPN clients' connection health status.
     *
     * @return the vpnClientConnectionHealth value.
     */
    public VpnClientConnectionHealth vpnClientConnectionHealth() {
        return this.vpnClientConnectionHealth;
    }

    /**
     * Get the customDnsServers property: List of all customer specified DNS servers IP addresses.
     *
     * @return the customDnsServers value.
     */
    public List<String> customDnsServers() {
        return this.customDnsServers;
    }

    /**
     * Set the customDnsServers property: List of all customer specified DNS servers IP addresses.
     *
     * @param customDnsServers the customDnsServers value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withCustomDnsServers(List<String> customDnsServers) {
        this.customDnsServers = customDnsServers;
        return this;
    }

    /**
     * Get the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the P2SVpnGateway.
     *
     * @return the isRoutingPreferenceInternet value.
     */
    public Boolean isRoutingPreferenceInternet() {
        return this.isRoutingPreferenceInternet;
    }

    /**
     * Set the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the P2SVpnGateway.
     *
     * @param isRoutingPreferenceInternet the isRoutingPreferenceInternet value to set.
     * @return the P2SVpnGatewayProperties object itself.
     */
    public P2SVpnGatewayProperties withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet) {
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (p2SConnectionConfigurations() != null) {
            p2SConnectionConfigurations().forEach(e -> e.validate());
        }
        if (vpnClientConnectionHealth() != null) {
            vpnClientConnectionHealth().validate();
        }
    }
}
