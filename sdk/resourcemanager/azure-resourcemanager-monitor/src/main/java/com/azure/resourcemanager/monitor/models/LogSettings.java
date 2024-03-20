// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Part of MultiTenantDiagnosticSettings. Specifies the settings for a particular log.
 */
@Fluent
public final class LogSettings {
    /*
     * Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of
     * Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * Name of a Diagnostic Log category group for a resource type this setting is applied to. To obtain the list of
     * Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     */
    @JsonProperty(value = "categoryGroup")
    private String categoryGroup;

    /*
     * a value indicating whether this log is enabled.
     */
    @JsonProperty(value = "enabled", required = true)
    private boolean enabled;

    /*
     * the retention policy for this log.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicy retentionPolicy;

    /**
     * Creates an instance of LogSettings class.
     */
    public LogSettings() {
    }

    /**
     * Get the category property: Name of a Diagnostic Log category for a resource type this setting is applied to. To
     * obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
     * @return the category value.
     */
    public String category() {
        return this.category;
    }

    /**
     * Set the category property: Name of a Diagnostic Log category for a resource type this setting is applied to. To
     * obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
     * @param category the category value to set.
     * @return the LogSettings object itself.
     */
    public LogSettings withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the categoryGroup property: Name of a Diagnostic Log category group for a resource type this setting is
     * applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic
     * settings operation.
     * 
     * @return the categoryGroup value.
     */
    public String categoryGroup() {
        return this.categoryGroup;
    }

    /**
     * Set the categoryGroup property: Name of a Diagnostic Log category group for a resource type this setting is
     * applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic
     * settings operation.
     * 
     * @param categoryGroup the categoryGroup value to set.
     * @return the LogSettings object itself.
     */
    public LogSettings withCategoryGroup(String categoryGroup) {
        this.categoryGroup = categoryGroup;
        return this;
    }

    /**
     * Get the enabled property: a value indicating whether this log is enabled.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: a value indicating whether this log is enabled.
     * 
     * @param enabled the enabled value to set.
     * @return the LogSettings object itself.
     */
    public LogSettings withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the retentionPolicy property: the retention policy for this log.
     * 
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: the retention policy for this log.
     * 
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the LogSettings object itself.
     */
    public LogSettings withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
    }
}
