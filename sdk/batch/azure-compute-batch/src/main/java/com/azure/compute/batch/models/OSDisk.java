// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings for the operating system disk of the compute node (VM).
 */
@Fluent
public final class OSDisk {

    /*
     * Specifies the ephemeral Disk Settings for the operating system disk used by the compute node (VM).
     */
    @Generated
    @JsonProperty(value = "ephemeralOSDiskSettings")
    private DiffDiskSettings ephemeralOSDiskSettings;

    /**
     * Creates an instance of OSDisk class.
     */
    @Generated
    public OSDisk() {
    }

    /**
     * Get the ephemeralOSDiskSettings property: Specifies the ephemeral Disk Settings for the operating system disk
     * used by the compute node (VM).
     *
     * @return the ephemeralOSDiskSettings value.
     */
    @Generated
    public DiffDiskSettings getEphemeralOSDiskSettings() {
        return this.ephemeralOSDiskSettings;
    }

    /**
     * Set the ephemeralOSDiskSettings property: Specifies the ephemeral Disk Settings for the operating system disk
     * used by the compute node (VM).
     *
     * @param ephemeralOSDiskSettings the ephemeralOSDiskSettings value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setEphemeralOSDiskSettings(DiffDiskSettings ephemeralOSDiskSettings) {
        this.ephemeralOSDiskSettings = ephemeralOSDiskSettings;
        return this;
    }

    /*
     * Specifies the caching requirements. Possible values are: None, ReadOnly, ReadWrite. The default values are: None for Standard storage. ReadOnly for Premium storage.
     */
    @Generated
    @JsonProperty(value = "caching")
    private CachingType caching;

    /*
     * The initial disk size in GB when creating new OS disk.
     */
    @Generated
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The managed disk parameters.
     */
    @Generated
    @JsonProperty(value = "managedDisk")
    private ManagedDisk managedDisk;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     */
    @Generated
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /**
     * Get the caching property: Specifies the caching requirements. Possible values are: None, ReadOnly, ReadWrite. The
     * default values are: None for Standard storage. ReadOnly for Premium storage.
     *
     * @return the caching value.
     */
    @Generated
    public CachingType getCaching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements. Possible values are: None, ReadOnly, ReadWrite. The
     * default values are: None for Standard storage. ReadOnly for Premium storage.
     *
     * @param caching the caching value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setCaching(CachingType caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the diskSizeGB property: The initial disk size in GB when creating new OS disk.
     *
     * @return the diskSizeGB value.
     */
    @Generated
    public Integer getDiskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: The initial disk size in GB when creating new OS disk.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk property: The managed disk parameters.
     *
     * @return the managedDisk value.
     */
    @Generated
    public ManagedDisk getManagedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managed disk parameters.
     *
     * @param managedDisk the managedDisk value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setManagedDisk(ManagedDisk managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @return the writeAcceleratorEnabled value.
     */
    @Generated
    public Boolean isWriteAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the OSDisk object itself.
     */
    @Generated
    public OSDisk setWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }
}
