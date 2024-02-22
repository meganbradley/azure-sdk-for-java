// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Disk details for E2A provider.
 */
@Fluent
public final class AzureVmDiskDetails {
    /*
     * VHD type.
     */
    @JsonProperty(value = "vhdType")
    private String vhdType;

    /*
     * The VHD id.
     */
    @JsonProperty(value = "vhdId")
    private String vhdId;

    /*
     * The disk resource id.
     */
    @JsonProperty(value = "diskId")
    private String diskId;

    /*
     * VHD name.
     */
    @JsonProperty(value = "vhdName")
    private String vhdName;

    /*
     * Max side in MB.
     */
    @JsonProperty(value = "maxSizeMB")
    private String maxSizeMB;

    /*
     * Blob uri of the Azure disk.
     */
    @JsonProperty(value = "targetDiskLocation")
    private String targetDiskLocation;

    /*
     * The target Azure disk name.
     */
    @JsonProperty(value = "targetDiskName")
    private String targetDiskName;

    /*
     * Ordinal\LunId of the disk for the Azure VM.
     */
    @JsonProperty(value = "lunId")
    private String lunId;

    /*
     * The DiskEncryptionSet ARM ID.
     */
    @JsonProperty(value = "diskEncryptionSetId")
    private String diskEncryptionSetId;

    /*
     * The custom target Azure disk name.
     */
    @JsonProperty(value = "customTargetDiskName")
    private String customTargetDiskName;

    /**
     * Creates an instance of AzureVmDiskDetails class.
     */
    public AzureVmDiskDetails() {
    }

    /**
     * Get the vhdType property: VHD type.
     * 
     * @return the vhdType value.
     */
    public String vhdType() {
        return this.vhdType;
    }

    /**
     * Set the vhdType property: VHD type.
     * 
     * @param vhdType the vhdType value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withVhdType(String vhdType) {
        this.vhdType = vhdType;
        return this;
    }

    /**
     * Get the vhdId property: The VHD id.
     * 
     * @return the vhdId value.
     */
    public String vhdId() {
        return this.vhdId;
    }

    /**
     * Set the vhdId property: The VHD id.
     * 
     * @param vhdId the vhdId value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withVhdId(String vhdId) {
        this.vhdId = vhdId;
        return this;
    }

    /**
     * Get the diskId property: The disk resource id.
     * 
     * @return the diskId value.
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the diskId property: The disk resource id.
     * 
     * @param diskId the diskId value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get the vhdName property: VHD name.
     * 
     * @return the vhdName value.
     */
    public String vhdName() {
        return this.vhdName;
    }

    /**
     * Set the vhdName property: VHD name.
     * 
     * @param vhdName the vhdName value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withVhdName(String vhdName) {
        this.vhdName = vhdName;
        return this;
    }

    /**
     * Get the maxSizeMB property: Max side in MB.
     * 
     * @return the maxSizeMB value.
     */
    public String maxSizeMB() {
        return this.maxSizeMB;
    }

    /**
     * Set the maxSizeMB property: Max side in MB.
     * 
     * @param maxSizeMB the maxSizeMB value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withMaxSizeMB(String maxSizeMB) {
        this.maxSizeMB = maxSizeMB;
        return this;
    }

    /**
     * Get the targetDiskLocation property: Blob uri of the Azure disk.
     * 
     * @return the targetDiskLocation value.
     */
    public String targetDiskLocation() {
        return this.targetDiskLocation;
    }

    /**
     * Set the targetDiskLocation property: Blob uri of the Azure disk.
     * 
     * @param targetDiskLocation the targetDiskLocation value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withTargetDiskLocation(String targetDiskLocation) {
        this.targetDiskLocation = targetDiskLocation;
        return this;
    }

    /**
     * Get the targetDiskName property: The target Azure disk name.
     * 
     * @return the targetDiskName value.
     */
    public String targetDiskName() {
        return this.targetDiskName;
    }

    /**
     * Set the targetDiskName property: The target Azure disk name.
     * 
     * @param targetDiskName the targetDiskName value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withTargetDiskName(String targetDiskName) {
        this.targetDiskName = targetDiskName;
        return this;
    }

    /**
     * Get the lunId property: Ordinal\LunId of the disk for the Azure VM.
     * 
     * @return the lunId value.
     */
    public String lunId() {
        return this.lunId;
    }

    /**
     * Set the lunId property: Ordinal\LunId of the disk for the Azure VM.
     * 
     * @param lunId the lunId value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withLunId(String lunId) {
        this.lunId = lunId;
        return this;
    }

    /**
     * Get the diskEncryptionSetId property: The DiskEncryptionSet ARM ID.
     * 
     * @return the diskEncryptionSetId value.
     */
    public String diskEncryptionSetId() {
        return this.diskEncryptionSetId;
    }

    /**
     * Set the diskEncryptionSetId property: The DiskEncryptionSet ARM ID.
     * 
     * @param diskEncryptionSetId the diskEncryptionSetId value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withDiskEncryptionSetId(String diskEncryptionSetId) {
        this.diskEncryptionSetId = diskEncryptionSetId;
        return this;
    }

    /**
     * Get the customTargetDiskName property: The custom target Azure disk name.
     * 
     * @return the customTargetDiskName value.
     */
    public String customTargetDiskName() {
        return this.customTargetDiskName;
    }

    /**
     * Set the customTargetDiskName property: The custom target Azure disk name.
     * 
     * @param customTargetDiskName the customTargetDiskName value to set.
     * @return the AzureVmDiskDetails object itself.
     */
    public AzureVmDiskDetails withCustomTargetDiskName(String customTargetDiskName) {
        this.customTargetDiskName = customTargetDiskName;
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
