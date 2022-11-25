// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings for the operating system disk of the virtual machine. */
@Fluent
public final class OSDisk {
    /*
     * Specifies the ephemeral Disk Settings for the operating system disk used by the virtual machine.
     */
    @JsonProperty(value = "ephemeralOSDiskSettings")
    private DiffDiskSettings ephemeralOSDiskSettings;

    /** Creates an instance of OSDisk class. */
    public OSDisk() {
    }

    /**
     * Get the ephemeralOSDiskSettings property: Specifies the ephemeral Disk Settings for the operating system disk
     * used by the virtual machine.
     *
     * @return the ephemeralOSDiskSettings value.
     */
    public DiffDiskSettings ephemeralOSDiskSettings() {
        return this.ephemeralOSDiskSettings;
    }

    /**
     * Set the ephemeralOSDiskSettings property: Specifies the ephemeral Disk Settings for the operating system disk
     * used by the virtual machine.
     *
     * @param ephemeralOSDiskSettings the ephemeralOSDiskSettings value to set.
     * @return the OSDisk object itself.
     */
    public OSDisk withEphemeralOSDiskSettings(DiffDiskSettings ephemeralOSDiskSettings) {
        this.ephemeralOSDiskSettings = ephemeralOSDiskSettings;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ephemeralOSDiskSettings() != null) {
            ephemeralOSDiskSettings().validate();
        }
    }
}
