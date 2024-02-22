// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.models.ActionList;
import com.azure.resourcemanager.monitor.models.ActivityLogAlertAllOfCondition;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * An Azure Activity Log Alert rule.
 */
@Fluent
public final class AlertRuleProperties {
    /*
     * A list of resource IDs that will be used as prefixes. The alert will only apply to Activity Log events with
     * resource IDs that fall under one of these prefixes. This list must include at least one item.
     */
    @JsonProperty(value = "scopes", required = true)
    private List<String> scopes;

    /*
     * The condition that will cause this alert to activate.
     */
    @JsonProperty(value = "condition", required = true)
    private ActivityLogAlertAllOfCondition condition;

    /*
     * The actions that will activate when the condition is met.
     */
    @JsonProperty(value = "actions", required = true)
    private ActionList actions;

    /*
     * Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert rule is not enabled, then
     * none of its actions will be activated.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * A description of this Activity Log Alert rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Creates an instance of AlertRuleProperties class.
     */
    public AlertRuleProperties() {
    }

    /**
     * Get the scopes property: A list of resource IDs that will be used as prefixes. The alert will only apply to
     * Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one
     * item.
     * 
     * @return the scopes value.
     */
    public List<String> scopes() {
        return this.scopes;
    }

    /**
     * Set the scopes property: A list of resource IDs that will be used as prefixes. The alert will only apply to
     * Activity Log events with resource IDs that fall under one of these prefixes. This list must include at least one
     * item.
     * 
     * @param scopes the scopes value to set.
     * @return the AlertRuleProperties object itself.
     */
    public AlertRuleProperties withScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    /**
     * Get the condition property: The condition that will cause this alert to activate.
     * 
     * @return the condition value.
     */
    public ActivityLogAlertAllOfCondition condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The condition that will cause this alert to activate.
     * 
     * @param condition the condition value to set.
     * @return the AlertRuleProperties object itself.
     */
    public AlertRuleProperties withCondition(ActivityLogAlertAllOfCondition condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the actions property: The actions that will activate when the condition is met.
     * 
     * @return the actions value.
     */
    public ActionList actions() {
        return this.actions;
    }

    /**
     * Set the actions property: The actions that will activate when the condition is met.
     * 
     * @param actions the actions value to set.
     * @return the AlertRuleProperties object itself.
     */
    public AlertRuleProperties withActions(ActionList actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert
     * rule is not enabled, then none of its actions will be activated.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether this Activity Log Alert rule is enabled. If an Activity Log Alert
     * rule is not enabled, then none of its actions will be activated.
     * 
     * @param enabled the enabled value to set.
     * @return the AlertRuleProperties object itself.
     */
    public AlertRuleProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the description property: A description of this Activity Log Alert rule.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description of this Activity Log Alert rule.
     * 
     * @param description the description value to set.
     * @return the AlertRuleProperties object itself.
     */
    public AlertRuleProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scopes() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property scopes in model AlertRuleProperties"));
        }
        if (condition() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property condition in model AlertRuleProperties"));
        } else {
            condition().validate();
        }
        if (actions() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property actions in model AlertRuleProperties"));
        } else {
            actions().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AlertRuleProperties.class);
}
