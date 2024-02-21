// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayRewriteRuleSetPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Rewrite rule set of an application gateway.
 */
@Fluent
public final class ApplicationGatewayRewriteRuleSet extends SubResource {
    /*
     * Properties of the application gateway rewrite rule set.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayRewriteRuleSetPropertiesFormat innerProperties;

    /*
     * Name of the rewrite rule set that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of ApplicationGatewayRewriteRuleSet class.
     */
    public ApplicationGatewayRewriteRuleSet() {
    }

    /**
     * Get the innerProperties property: Properties of the application gateway rewrite rule set.
     * 
     * @return the innerProperties value.
     */
    private ApplicationGatewayRewriteRuleSetPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the rewrite rule set that is unique within an Application Gateway.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the rewrite rule set that is unique within an Application Gateway.
     * 
     * @param name the name value to set.
     * @return the ApplicationGatewayRewriteRuleSet object itself.
     */
    public ApplicationGatewayRewriteRuleSet withName(String name) {
        this.name = name;
        return this;
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
     * {@inheritDoc}
     */
    @Override
    public ApplicationGatewayRewriteRuleSet withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the rewriteRules property: Rewrite rules in the rewrite rule set.
     * 
     * @return the rewriteRules value.
     */
    public List<ApplicationGatewayRewriteRule> rewriteRules() {
        return this.innerProperties() == null ? null : this.innerProperties().rewriteRules();
    }

    /**
     * Set the rewriteRules property: Rewrite rules in the rewrite rule set.
     * 
     * @param rewriteRules the rewriteRules value to set.
     * @return the ApplicationGatewayRewriteRuleSet object itself.
     */
    public ApplicationGatewayRewriteRuleSet withRewriteRules(List<ApplicationGatewayRewriteRule> rewriteRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayRewriteRuleSetPropertiesFormat();
        }
        this.innerProperties().withRewriteRules(rewriteRules);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the rewrite rule set resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
    }
}
