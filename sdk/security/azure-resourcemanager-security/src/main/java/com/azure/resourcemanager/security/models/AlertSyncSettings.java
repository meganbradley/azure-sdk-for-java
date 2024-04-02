// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.security.fluent.models.AlertSyncSettingProperties;
import com.azure.resourcemanager.security.fluent.models.SettingInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents an alert sync setting.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AlertSyncSettings")
@Fluent
public final class AlertSyncSettings extends SettingInner {
    /*
     * Alert sync setting data
     */
    @JsonProperty(value = "properties")
    private AlertSyncSettingProperties innerProperties;

    /**
     * Creates an instance of AlertSyncSettings class.
     */
    public AlertSyncSettings() {
    }

    /**
     * Get the innerProperties property: Alert sync setting data.
     * 
     * @return the innerProperties value.
     */
    private AlertSyncSettingProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the enabled property: Is the alert sync setting enabled.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Is the alert sync setting enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the AlertSyncSettings object itself.
     */
    public AlertSyncSettings withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AlertSyncSettingProperties();
        }
        this.innerProperties().withEnabled(enabled);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
