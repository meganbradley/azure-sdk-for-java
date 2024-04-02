// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The alert sync setting properties.
 */
@Fluent
public final class AlertSyncSettingProperties {
    /*
     * Is the alert sync setting enabled
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /**
     * Creates an instance of AlertSyncSettingProperties class.
     */
    public AlertSyncSettingProperties() {
    }

    /**
     * Get the enabled property: Is the alert sync setting enabled.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Is the alert sync setting enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the AlertSyncSettingProperties object itself.
     */
    public AlertSyncSettingProperties withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
