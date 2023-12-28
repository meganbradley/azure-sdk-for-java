// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.DefaultAdminPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Network default admin rule.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Default")
@Fluent
public final class ActiveDefaultSecurityAdminRule extends ActiveBaseSecurityAdminRule {
    /*
     * Indicates the properties of the default security admin rule
     */
    @JsonProperty(value = "properties")
    private DefaultAdminPropertiesFormat innerProperties;

    /**
     * Creates an instance of ActiveDefaultSecurityAdminRule class.
     */
    public ActiveDefaultSecurityAdminRule() {
    }

    /**
     * Get the innerProperties property: Indicates the properties of the default security admin rule.
     * 
     * @return the innerProperties value.
     */
    private DefaultAdminPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withCommitTime(OffsetDateTime commitTime) {
        super.withCommitTime(commitTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withRegion(String region) {
        super.withRegion(region);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withConfigurationDescription(String configurationDescription) {
        super.withConfigurationDescription(configurationDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withRuleCollectionDescription(String ruleCollectionDescription) {
        super.withRuleCollectionDescription(ruleCollectionDescription);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule
        withRuleCollectionAppliesToGroups(List<NetworkManagerSecurityGroupItem> ruleCollectionAppliesToGroups) {
        super.withRuleCollectionAppliesToGroups(ruleCollectionAppliesToGroups);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActiveDefaultSecurityAdminRule withRuleGroups(List<ConfigurationGroup> ruleGroups) {
        super.withRuleGroups(ruleGroups);
        return this;
    }

    /**
     * Get the description property: A description for this rule. Restricted to 140 chars.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Get the flag property: Default rule flag.
     * 
     * @return the flag value.
     */
    public String flag() {
        return this.innerProperties() == null ? null : this.innerProperties().flag();
    }

    /**
     * Set the flag property: Default rule flag.
     * 
     * @param flag the flag value to set.
     * @return the ActiveDefaultSecurityAdminRule object itself.
     */
    public ActiveDefaultSecurityAdminRule withFlag(String flag) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DefaultAdminPropertiesFormat();
        }
        this.innerProperties().withFlag(flag);
        return this;
    }

    /**
     * Get the protocol property: Network protocol this rule applies to.
     * 
     * @return the protocol value.
     */
    public SecurityConfigurationRuleProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Get the sources property: The CIDR or source IP ranges.
     * 
     * @return the sources value.
     */
    public List<AddressPrefixItem> sources() {
        return this.innerProperties() == null ? null : this.innerProperties().sources();
    }

    /**
     * Get the destinations property: The destination address prefixes. CIDR or destination IP ranges.
     * 
     * @return the destinations value.
     */
    public List<AddressPrefixItem> destinations() {
        return this.innerProperties() == null ? null : this.innerProperties().destinations();
    }

    /**
     * Get the sourcePortRanges property: The source port ranges.
     * 
     * @return the sourcePortRanges value.
     */
    public List<String> sourcePortRanges() {
        return this.innerProperties() == null ? null : this.innerProperties().sourcePortRanges();
    }

    /**
     * Get the destinationPortRanges property: The destination port ranges.
     * 
     * @return the destinationPortRanges value.
     */
    public List<String> destinationPortRanges() {
        return this.innerProperties() == null ? null : this.innerProperties().destinationPortRanges();
    }

    /**
     * Get the access property: Indicates the access allowed for this particular rule.
     * 
     * @return the access value.
     */
    public SecurityConfigurationRuleAccess access() {
        return this.innerProperties() == null ? null : this.innerProperties().access();
    }

    /**
     * Get the priority property: The priority of the rule. The value can be between 1 and 4096. The priority number
     * must be unique for each rule in the collection. The lower the priority number, the higher the priority of the
     * rule.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Get the direction property: Indicates if the traffic matched against the rule in inbound or outbound.
     * 
     * @return the direction value.
     */
    public SecurityConfigurationRuleDirection direction() {
        return this.innerProperties() == null ? null : this.innerProperties().direction();
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
