// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.CustomRuleList;
import com.azure.resourcemanager.cdn.models.EndpointResource;
import com.azure.resourcemanager.cdn.models.ManagedRuleSetList;
import com.azure.resourcemanager.cdn.models.PolicyResourceState;
import com.azure.resourcemanager.cdn.models.PolicySettings;
import com.azure.resourcemanager.cdn.models.ProvisioningState;
import com.azure.resourcemanager.cdn.models.RateLimitRuleList;
import com.azure.resourcemanager.cdn.models.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Defines web application firewall policy for Azure CDN. */
@Fluent
public final class CdnWebApplicationFirewallPolicyInner extends Resource {
    /*
     * Properties of the web application firewall policy.
     */
    @JsonProperty(value = "properties")
    private CdnWebApplicationFirewallPolicyProperties innerProperties;

    /*
     * Gets a unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The pricing tier (defines a CDN provider, feature list and rate) of the CdnWebApplicationFirewallPolicy.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Read only system data
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of CdnWebApplicationFirewallPolicyInner class. */
    public CdnWebApplicationFirewallPolicyInner() {
    }

    /**
     * Get the innerProperties property: Properties of the web application firewall policy.
     *
     * @return the innerProperties value.
     */
    private CdnWebApplicationFirewallPolicyProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Gets a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the CdnWebApplicationFirewallPolicyInner object itself.
     */
    public CdnWebApplicationFirewallPolicyInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The pricing tier (defines a CDN provider, feature list and rate) of the
     * CdnWebApplicationFirewallPolicy.
     *
     * @param sku the sku value to set.
     * @return the CdnWebApplicationFirewallPolicyInner object itself.
     */
    public CdnWebApplicationFirewallPolicyInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Read only system data.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public CdnWebApplicationFirewallPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CdnWebApplicationFirewallPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the policySettings property: Describes policySettings for policy.
     *
     * @return the policySettings value.
     */
    public PolicySettings policySettings() {
        return this.innerProperties() == null ? null : this.innerProperties().policySettings();
    }

    /**
     * Set the policySettings property: Describes policySettings for policy.
     *
     * @param policySettings the policySettings value to set.
     * @return the CdnWebApplicationFirewallPolicyInner object itself.
     */
    public CdnWebApplicationFirewallPolicyInner withPolicySettings(PolicySettings policySettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CdnWebApplicationFirewallPolicyProperties();
        }
        this.innerProperties().withPolicySettings(policySettings);
        return this;
    }

    /**
     * Get the rateLimitRules property: Describes rate limit rules inside the policy.
     *
     * @return the rateLimitRules value.
     */
    public RateLimitRuleList rateLimitRules() {
        return this.innerProperties() == null ? null : this.innerProperties().rateLimitRules();
    }

    /**
     * Set the rateLimitRules property: Describes rate limit rules inside the policy.
     *
     * @param rateLimitRules the rateLimitRules value to set.
     * @return the CdnWebApplicationFirewallPolicyInner object itself.
     */
    public CdnWebApplicationFirewallPolicyInner withRateLimitRules(RateLimitRuleList rateLimitRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CdnWebApplicationFirewallPolicyProperties();
        }
        this.innerProperties().withRateLimitRules(rateLimitRules);
        return this;
    }

    /**
     * Get the customRules property: Describes custom rules inside the policy.
     *
     * @return the customRules value.
     */
    public CustomRuleList customRules() {
        return this.innerProperties() == null ? null : this.innerProperties().customRules();
    }

    /**
     * Set the customRules property: Describes custom rules inside the policy.
     *
     * @param customRules the customRules value to set.
     * @return the CdnWebApplicationFirewallPolicyInner object itself.
     */
    public CdnWebApplicationFirewallPolicyInner withCustomRules(CustomRuleList customRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CdnWebApplicationFirewallPolicyProperties();
        }
        this.innerProperties().withCustomRules(customRules);
        return this;
    }

    /**
     * Get the managedRules property: Describes managed rules inside the policy.
     *
     * @return the managedRules value.
     */
    public ManagedRuleSetList managedRules() {
        return this.innerProperties() == null ? null : this.innerProperties().managedRules();
    }

    /**
     * Set the managedRules property: Describes managed rules inside the policy.
     *
     * @param managedRules the managedRules value to set.
     * @return the CdnWebApplicationFirewallPolicyInner object itself.
     */
    public CdnWebApplicationFirewallPolicyInner withManagedRules(ManagedRuleSetList managedRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CdnWebApplicationFirewallPolicyProperties();
        }
        this.innerProperties().withManagedRules(managedRules);
        return this;
    }

    /**
     * Get the endpointLinks property: Describes Azure CDN endpoints associated with this Web Application Firewall
     * policy.
     *
     * @return the endpointLinks value.
     */
    public List<EndpointResource> endpointLinks() {
        return this.innerProperties() == null ? null : this.innerProperties().endpointLinks();
    }

    /**
     * Get the extendedProperties property: Key-Value pair representing additional properties for Web Application
     * Firewall policy.
     *
     * @return the extendedProperties value.
     */
    public Map<String, String> extendedProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedProperties();
    }

    /**
     * Set the extendedProperties property: Key-Value pair representing additional properties for Web Application
     * Firewall policy.
     *
     * @param extendedProperties the extendedProperties value to set.
     * @return the CdnWebApplicationFirewallPolicyInner object itself.
     */
    public CdnWebApplicationFirewallPolicyInner withExtendedProperties(Map<String, String> extendedProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CdnWebApplicationFirewallPolicyProperties();
        }
        this.innerProperties().withExtendedProperties(extendedProperties);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the WebApplicationFirewallPolicy.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceState property: Resource status of the policy.
     *
     * @return the resourceState value.
     */
    public PolicyResourceState resourceState() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceState();
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
        if (sku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sku in model CdnWebApplicationFirewallPolicyInner"));
        } else {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CdnWebApplicationFirewallPolicyInner.class);
}
