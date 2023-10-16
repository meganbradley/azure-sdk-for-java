// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings which will be used by the data disks associated to Compute Nodes in the Pool. When using attached data
 * disks, you need to mount and format the disks from within a VM to use them.
 */
@Fluent
public final class DataDisk {

    /*
     * The logical unit number. The lun is used to uniquely identify each data disk. If attaching multiple disks, each
     * should have a distinct lun. The value must be between 0 and 63, inclusive.
     */
    @Generated
    @JsonProperty(value = "lun")
    private int lun;

    /*
     * The type of caching to be enabled for the data disks. The default value for caching is readwrite. For
     * information about the caching options see:
     * https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     */
    @Generated
    @JsonProperty(value = "caching")
    private CachingType caching;

    /*
     * The initial disk size in gigabytes.
     */
    @Generated
    @JsonProperty(value = "diskSizeGB")
    private int diskSizeGb;

    /*
     * The storage Account type to be used for the data disk. If omitted, the default is "standard_lrs".
     */
    @Generated
    @JsonProperty(value = "storageAccountType")
    private StorageAccountType storageAccountType;

    /**
     * Creates an instance of DataDisk class.
     *
     * @param lun the lun value to set.
     * @param diskSizeGb the diskSizeGb value to set.
     */
    @Generated
    @JsonCreator
    public DataDisk(@JsonProperty(value = "lun") int lun, @JsonProperty(value = "diskSizeGB") int diskSizeGb) {
        this.lun = lun;
        this.diskSizeGb = diskSizeGb;
    }

    /**
     * Get the lun property: The logical unit number. The lun is used to uniquely identify each data disk. If attaching
     * multiple disks, each should have a distinct lun. The value must be between 0 and 63, inclusive.
     *
     * @return the lun value.
     */
    @Generated
    public int getLun() {
        return this.lun;
    }

    /**
     * Get the caching property: The type of caching to be enabled for the data disks. The default value for caching is
     * readwrite. For information about the caching options see:
     * https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     *
     * @return the caching value.
     */
    @Generated
    public CachingType getCaching() {
        return this.caching;
    }

    /**
     * Set the caching property: The type of caching to be enabled for the data disks. The default value for caching is
     * readwrite. For information about the caching options see:
     * https://blogs.msdn.microsoft.com/windowsazurestorage/2012/06/27/exploring-windows-azure-drives-disks-and-images/.
     *
     * @param caching the caching value to set.
     * @return the DataDisk object itself.
     */
    @Generated
    public DataDisk setCaching(CachingType caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the diskSizeGb property: The initial disk size in gigabytes.
     *
     * @return the diskSizeGb value.
     */
    @Generated
    public int getDiskSizeGb() {
        return this.diskSizeGb;
    }

    /**
     * Get the storageAccountType property: The storage Account type to be used for the data disk. If omitted, the
     * default is "standard_lrs".
     *
     * @return the storageAccountType value.
     */
    @Generated
    public StorageAccountType getStorageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: The storage Account type to be used for the data disk. If omitted, the
     * default is "standard_lrs".
     *
     * @param storageAccountType the storageAccountType value to set.
     * @return the DataDisk object itself.
     */
    @Generated
    public DataDisk setStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }
}
