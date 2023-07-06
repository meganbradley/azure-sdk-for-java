// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The disk encryption configuration applied on compute nodes in the pool. Disk encryption configuration is not
 * supported on Linux pool created with Shared Image Gallery Image.
 */
@Fluent
public final class DiskEncryptionConfiguration {

    /*
     * If omitted, no disks on the compute nodes in the pool will be encrypted. On
     * Linux pool, only "TemporaryDisk" is supported; on Windows pool, "OsDisk"
     * and "TemporaryDisk" must be specified.
     */
    @JsonProperty(value = "targets")
    private List<DiskEncryptionTarget> targets;

    /** Creates an instance of DiskEncryptionConfiguration class. */
    public DiskEncryptionConfiguration() {}

    /**
     * Get the targets property: If omitted, no disks on the compute nodes in the pool will be encrypted. On Linux pool,
     * only "TemporaryDisk" is supported; on Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     *
     * @return the targets value.
     */
    public List<DiskEncryptionTarget> getTargets() {
        return this.targets;
    }

    /**
     * Set the targets property: If omitted, no disks on the compute nodes in the pool will be encrypted. On Linux pool,
     * only "TemporaryDisk" is supported; on Windows pool, "OsDisk" and "TemporaryDisk" must be specified.
     *
     * @param targets the targets value to set.
     * @return the DiskEncryptionConfiguration object itself.
     */
    public DiskEncryptionConfiguration setTargets(List<DiskEncryptionTarget> targets) {
        this.targets = targets;
        return this;
    }
}
