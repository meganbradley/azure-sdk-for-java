// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * A custom alert rule that checks if a value (depends on the custom alert type) is denied.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "ruleType")
@JsonTypeName("DenylistCustomAlertRule")
@Fluent
public final class DenylistCustomAlertRule extends ListCustomAlertRule {
    /*
     * The values to deny. The format of the values depends on the rule type.
     */
    @JsonProperty(value = "denylistValues", required = true)
    private List<String> denylistValues;

    /**
     * Creates an instance of DenylistCustomAlertRule class.
     */
    public DenylistCustomAlertRule() {
    }

    /**
     * Get the denylistValues property: The values to deny. The format of the values depends on the rule type.
     * 
     * @return the denylistValues value.
     */
    public List<String> denylistValues() {
        return this.denylistValues;
    }

    /**
     * Set the denylistValues property: The values to deny. The format of the values depends on the rule type.
     * 
     * @param denylistValues the denylistValues value to set.
     * @return the DenylistCustomAlertRule object itself.
     */
    public DenylistCustomAlertRule withDenylistValues(List<String> denylistValues) {
        this.denylistValues = denylistValues;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DenylistCustomAlertRule withIsEnabled(boolean isEnabled) {
        super.withIsEnabled(isEnabled);
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
        if (denylistValues() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property denylistValues in model DenylistCustomAlertRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DenylistCustomAlertRule.class);
}
