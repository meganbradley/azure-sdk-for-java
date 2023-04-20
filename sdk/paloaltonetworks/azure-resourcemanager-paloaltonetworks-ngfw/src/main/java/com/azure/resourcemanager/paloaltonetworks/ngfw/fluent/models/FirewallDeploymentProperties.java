// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.BooleanEnum;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.DnsSettings;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.FrontendSetting;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.MarketplaceDetails;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.NetworkProfile;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PanoramaConfig;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PlanData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.RulestackDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties specific to the Firewall resource deployment. */
@Fluent
public final class FirewallDeploymentProperties {
    /*
     * panEtag info
     */
    @JsonProperty(value = "panEtag")
    private String panEtag;

    /*
     * Network settings
     */
    @JsonProperty(value = "networkProfile", required = true)
    private NetworkProfile networkProfile;

    /*
     * Panorama Managed: Default is False. Default will be CloudSec managed
     */
    @JsonProperty(value = "isPanoramaManaged")
    private BooleanEnum isPanoramaManaged;

    /*
     * Panorama Configuration
     */
    @JsonProperty(value = "panoramaConfig")
    private PanoramaConfig panoramaConfig;

    /*
     * Associated Rulestack
     */
    @JsonProperty(value = "associatedRulestack")
    private RulestackDetails associatedRulestack;

    /*
     * DNS settings for Firewall
     */
    @JsonProperty(value = "dnsSettings", required = true)
    private DnsSettings dnsSettings;

    /*
     * Frontend settings for Firewall
     */
    @JsonProperty(value = "frontEndSettings")
    private List<FrontendSetting> frontEndSettings;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Billing plan information.
     */
    @JsonProperty(value = "planData", required = true)
    private PlanData planData;

    /*
     * Marketplace details
     */
    @JsonProperty(value = "marketplaceDetails", required = true)
    private MarketplaceDetails marketplaceDetails;

    /** Creates an instance of FirewallDeploymentProperties class. */
    public FirewallDeploymentProperties() {
    }

    /**
     * Get the panEtag property: panEtag info.
     *
     * @return the panEtag value.
     */
    public String panEtag() {
        return this.panEtag;
    }

    /**
     * Set the panEtag property: panEtag info.
     *
     * @param panEtag the panEtag value to set.
     * @return the FirewallDeploymentProperties object itself.
     */
    public FirewallDeploymentProperties withPanEtag(String panEtag) {
        this.panEtag = panEtag;
        return this;
    }

    /**
     * Get the networkProfile property: Network settings.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set the networkProfile property: Network settings.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the FirewallDeploymentProperties object itself.
     */
    public FirewallDeploymentProperties withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get the isPanoramaManaged property: Panorama Managed: Default is False. Default will be CloudSec managed.
     *
     * @return the isPanoramaManaged value.
     */
    public BooleanEnum isPanoramaManaged() {
        return this.isPanoramaManaged;
    }

    /**
     * Set the isPanoramaManaged property: Panorama Managed: Default is False. Default will be CloudSec managed.
     *
     * @param isPanoramaManaged the isPanoramaManaged value to set.
     * @return the FirewallDeploymentProperties object itself.
     */
    public FirewallDeploymentProperties withIsPanoramaManaged(BooleanEnum isPanoramaManaged) {
        this.isPanoramaManaged = isPanoramaManaged;
        return this;
    }

    /**
     * Get the panoramaConfig property: Panorama Configuration.
     *
     * @return the panoramaConfig value.
     */
    public PanoramaConfig panoramaConfig() {
        return this.panoramaConfig;
    }

    /**
     * Set the panoramaConfig property: Panorama Configuration.
     *
     * @param panoramaConfig the panoramaConfig value to set.
     * @return the FirewallDeploymentProperties object itself.
     */
    public FirewallDeploymentProperties withPanoramaConfig(PanoramaConfig panoramaConfig) {
        this.panoramaConfig = panoramaConfig;
        return this;
    }

    /**
     * Get the associatedRulestack property: Associated Rulestack.
     *
     * @return the associatedRulestack value.
     */
    public RulestackDetails associatedRulestack() {
        return this.associatedRulestack;
    }

    /**
     * Set the associatedRulestack property: Associated Rulestack.
     *
     * @param associatedRulestack the associatedRulestack value to set.
     * @return the FirewallDeploymentProperties object itself.
     */
    public FirewallDeploymentProperties withAssociatedRulestack(RulestackDetails associatedRulestack) {
        this.associatedRulestack = associatedRulestack;
        return this;
    }

    /**
     * Get the dnsSettings property: DNS settings for Firewall.
     *
     * @return the dnsSettings value.
     */
    public DnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings property: DNS settings for Firewall.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the FirewallDeploymentProperties object itself.
     */
    public FirewallDeploymentProperties withDnsSettings(DnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the frontEndSettings property: Frontend settings for Firewall.
     *
     * @return the frontEndSettings value.
     */
    public List<FrontendSetting> frontEndSettings() {
        return this.frontEndSettings;
    }

    /**
     * Set the frontEndSettings property: Frontend settings for Firewall.
     *
     * @param frontEndSettings the frontEndSettings value to set.
     * @return the FirewallDeploymentProperties object itself.
     */
    public FirewallDeploymentProperties withFrontEndSettings(List<FrontendSetting> frontEndSettings) {
        this.frontEndSettings = frontEndSettings;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the planData property: Billing plan information.
     *
     * @return the planData value.
     */
    public PlanData planData() {
        return this.planData;
    }

    /**
     * Set the planData property: Billing plan information.
     *
     * @param planData the planData value to set.
     * @return the FirewallDeploymentProperties object itself.
     */
    public FirewallDeploymentProperties withPlanData(PlanData planData) {
        this.planData = planData;
        return this;
    }

    /**
     * Get the marketplaceDetails property: Marketplace details.
     *
     * @return the marketplaceDetails value.
     */
    public MarketplaceDetails marketplaceDetails() {
        return this.marketplaceDetails;
    }

    /**
     * Set the marketplaceDetails property: Marketplace details.
     *
     * @param marketplaceDetails the marketplaceDetails value to set.
     * @return the FirewallDeploymentProperties object itself.
     */
    public FirewallDeploymentProperties withMarketplaceDetails(MarketplaceDetails marketplaceDetails) {
        this.marketplaceDetails = marketplaceDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkProfile() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property networkProfile in model FirewallDeploymentProperties"));
        } else {
            networkProfile().validate();
        }
        if (panoramaConfig() != null) {
            panoramaConfig().validate();
        }
        if (associatedRulestack() != null) {
            associatedRulestack().validate();
        }
        if (dnsSettings() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dnsSettings in model FirewallDeploymentProperties"));
        } else {
            dnsSettings().validate();
        }
        if (frontEndSettings() != null) {
            frontEndSettings().forEach(e -> e.validate());
        }
        if (planData() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property planData in model FirewallDeploymentProperties"));
        } else {
            planData().validate();
        }
        if (marketplaceDetails() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property marketplaceDetails in model FirewallDeploymentProperties"));
        } else {
            marketplaceDetails().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FirewallDeploymentProperties.class);
}
