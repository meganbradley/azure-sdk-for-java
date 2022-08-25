// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Defines the os update properties. */
@Fluent
public final class OsProfileUpdate {
    /*
     * Specifies the windows configuration for update management.
     */
    @JsonProperty(value = "windowsConfiguration")
    private OsProfileUpdateWindowsConfiguration windowsConfiguration;

    /*
     * Specifies the linux configuration for update management.
     */
    @JsonProperty(value = "linuxConfiguration")
    private OsProfileUpdateLinuxConfiguration linuxConfiguration;

    /**
     * Get the windowsConfiguration property: Specifies the windows configuration for update management.
     *
     * @return the windowsConfiguration value.
     */
    public OsProfileUpdateWindowsConfiguration windowsConfiguration() {
        return this.windowsConfiguration;
    }

    /**
     * Set the windowsConfiguration property: Specifies the windows configuration for update management.
     *
     * @param windowsConfiguration the windowsConfiguration value to set.
     * @return the OsProfileUpdate object itself.
     */
    public OsProfileUpdate withWindowsConfiguration(OsProfileUpdateWindowsConfiguration windowsConfiguration) {
        this.windowsConfiguration = windowsConfiguration;
        return this;
    }

    /**
     * Get the linuxConfiguration property: Specifies the linux configuration for update management.
     *
     * @return the linuxConfiguration value.
     */
    public OsProfileUpdateLinuxConfiguration linuxConfiguration() {
        return this.linuxConfiguration;
    }

    /**
     * Set the linuxConfiguration property: Specifies the linux configuration for update management.
     *
     * @param linuxConfiguration the linuxConfiguration value to set.
     * @return the OsProfileUpdate object itself.
     */
    public OsProfileUpdate withLinuxConfiguration(OsProfileUpdateLinuxConfiguration linuxConfiguration) {
        this.linuxConfiguration = linuxConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (windowsConfiguration() != null) {
            windowsConfiguration().validate();
        }
        if (linuxConfiguration() != null) {
            linuxConfiguration().validate();
        }
    }
}
