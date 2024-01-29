// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Storage profile for the container service cluster.
 */
@Fluent
public final class ManagedClusterStorageProfile {
    /*
     * AzureDisk CSI Driver settings for the storage profile.
     */
    @JsonProperty(value = "diskCSIDriver")
    private ManagedClusterStorageProfileDiskCsiDriver diskCsiDriver;

    /*
     * AzureFile CSI Driver settings for the storage profile.
     */
    @JsonProperty(value = "fileCSIDriver")
    private ManagedClusterStorageProfileFileCsiDriver fileCsiDriver;

    /*
     * Snapshot Controller settings for the storage profile.
     */
    @JsonProperty(value = "snapshotController")
    private ManagedClusterStorageProfileSnapshotController snapshotController;

    /*
     * AzureBlob CSI Driver settings for the storage profile.
     */
    @JsonProperty(value = "blobCSIDriver")
    private ManagedClusterStorageProfileBlobCsiDriver blobCsiDriver;

    /**
     * Creates an instance of ManagedClusterStorageProfile class.
     */
    public ManagedClusterStorageProfile() {
    }

    /**
     * Get the diskCsiDriver property: AzureDisk CSI Driver settings for the storage profile.
     * 
     * @return the diskCsiDriver value.
     */
    public ManagedClusterStorageProfileDiskCsiDriver diskCsiDriver() {
        return this.diskCsiDriver;
    }

    /**
     * Set the diskCsiDriver property: AzureDisk CSI Driver settings for the storage profile.
     * 
     * @param diskCsiDriver the diskCsiDriver value to set.
     * @return the ManagedClusterStorageProfile object itself.
     */
    public ManagedClusterStorageProfile withDiskCsiDriver(ManagedClusterStorageProfileDiskCsiDriver diskCsiDriver) {
        this.diskCsiDriver = diskCsiDriver;
        return this;
    }

    /**
     * Get the fileCsiDriver property: AzureFile CSI Driver settings for the storage profile.
     * 
     * @return the fileCsiDriver value.
     */
    public ManagedClusterStorageProfileFileCsiDriver fileCsiDriver() {
        return this.fileCsiDriver;
    }

    /**
     * Set the fileCsiDriver property: AzureFile CSI Driver settings for the storage profile.
     * 
     * @param fileCsiDriver the fileCsiDriver value to set.
     * @return the ManagedClusterStorageProfile object itself.
     */
    public ManagedClusterStorageProfile withFileCsiDriver(ManagedClusterStorageProfileFileCsiDriver fileCsiDriver) {
        this.fileCsiDriver = fileCsiDriver;
        return this;
    }

    /**
     * Get the snapshotController property: Snapshot Controller settings for the storage profile.
     * 
     * @return the snapshotController value.
     */
    public ManagedClusterStorageProfileSnapshotController snapshotController() {
        return this.snapshotController;
    }

    /**
     * Set the snapshotController property: Snapshot Controller settings for the storage profile.
     * 
     * @param snapshotController the snapshotController value to set.
     * @return the ManagedClusterStorageProfile object itself.
     */
    public ManagedClusterStorageProfile
        withSnapshotController(ManagedClusterStorageProfileSnapshotController snapshotController) {
        this.snapshotController = snapshotController;
        return this;
    }

    /**
     * Get the blobCsiDriver property: AzureBlob CSI Driver settings for the storage profile.
     * 
     * @return the blobCsiDriver value.
     */
    public ManagedClusterStorageProfileBlobCsiDriver blobCsiDriver() {
        return this.blobCsiDriver;
    }

    /**
     * Set the blobCsiDriver property: AzureBlob CSI Driver settings for the storage profile.
     * 
     * @param blobCsiDriver the blobCsiDriver value to set.
     * @return the ManagedClusterStorageProfile object itself.
     */
    public ManagedClusterStorageProfile withBlobCsiDriver(ManagedClusterStorageProfileBlobCsiDriver blobCsiDriver) {
        this.blobCsiDriver = blobCsiDriver;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (diskCsiDriver() != null) {
            diskCsiDriver().validate();
        }
        if (fileCsiDriver() != null) {
            fileCsiDriver().validate();
        }
        if (snapshotController() != null) {
            snapshotController().validate();
        }
        if (blobCsiDriver() != null) {
            blobCsiDriver().validate();
        }
    }
}
