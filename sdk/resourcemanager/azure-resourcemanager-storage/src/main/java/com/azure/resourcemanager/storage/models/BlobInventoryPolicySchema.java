// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The storage account blob inventory policy rules. */
@Fluent
public final class BlobInventoryPolicySchema {
    /*
     * Policy is enabled if set to true.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * Deprecated Property from API version 2021-04-01 onwards, the required destination container name must be
     * specified at the rule level 'policy.rule.destination'
     */
    @JsonProperty(value = "destination", access = JsonProperty.Access.WRITE_ONLY)
    private String destination;

    /*
     * The valid value is Inventory
     */
    @JsonProperty(value = "type", required = true)
    private InventoryRuleType type;

    /*
     * The storage account blob inventory policy rules. The rule is applied when it is enabled.
     */
    @JsonProperty(value = "rules", required = true)
    private List<BlobInventoryPolicyRule> rules;

    /**
     * Get the enabled property: Policy is enabled if set to true.
     *
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Policy is enabled if set to true.
     *
     * @param enabled the enabled value to set.
     * @return the BlobInventoryPolicySchema object itself.
     */
    public BlobInventoryPolicySchema withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the destination property: Deprecated Property from API version 2021-04-01 onwards, the required destination
     * container name must be specified at the rule level 'policy.rule.destination'.
     *
     * @return the destination value.
     */
    public String destination() {
        return this.destination;
    }

    /**
     * Get the type property: The valid value is Inventory.
     *
     * @return the type value.
     */
    public InventoryRuleType type() {
        return this.type;
    }

    /**
     * Set the type property: The valid value is Inventory.
     *
     * @param type the type value to set.
     * @return the BlobInventoryPolicySchema object itself.
     */
    public BlobInventoryPolicySchema withType(InventoryRuleType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the rules property: The storage account blob inventory policy rules. The rule is applied when it is enabled.
     *
     * @return the rules value.
     */
    public List<BlobInventoryPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The storage account blob inventory policy rules. The rule is applied when it is enabled.
     *
     * @param rules the rules value to set.
     * @return the BlobInventoryPolicySchema object itself.
     */
    public BlobInventoryPolicySchema withRules(List<BlobInventoryPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model BlobInventoryPolicySchema"));
        }
        if (rules() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property rules in model BlobInventoryPolicySchema"));
        } else {
            rules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobInventoryPolicySchema.class);
}
