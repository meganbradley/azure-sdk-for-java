// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The file system to mount on each node. */
@Fluent
public final class MountConfiguration {

    /*
     * This property is mutually exclusive with all other properties.
     */
    @JsonProperty(value = "azureBlobFileSystemConfiguration")
    private AzureBlobFileSystemConfiguration azureBlobFileSystemConfiguration;

    /*
     * This property is mutually exclusive with all other properties.
     */
    @JsonProperty(value = "nfsMountConfiguration")
    private NFSMountConfiguration nfsMountConfiguration;

    /*
     * This property is mutually exclusive with all other properties.
     */
    @JsonProperty(value = "cifsMountConfiguration")
    private CifsMountConfiguration cifsMountConfiguration;

    /*
     * This property is mutually exclusive with all other properties.
     */
    @JsonProperty(value = "azureFileShareConfiguration")
    private AzureFileShareConfiguration azureFileShareConfiguration;

    /** Creates an instance of MountConfiguration class. */
    public MountConfiguration() {}

    /**
     * Get the azureBlobFileSystemConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @return the azureBlobFileSystemConfiguration value.
     */
    public AzureBlobFileSystemConfiguration getAzureBlobFileSystemConfiguration() {
        return this.azureBlobFileSystemConfiguration;
    }

    /**
     * Set the azureBlobFileSystemConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @param azureBlobFileSystemConfiguration the azureBlobFileSystemConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    public MountConfiguration setAzureBlobFileSystemConfiguration(
            AzureBlobFileSystemConfiguration azureBlobFileSystemConfiguration) {
        this.azureBlobFileSystemConfiguration = azureBlobFileSystemConfiguration;
        return this;
    }

    /**
     * Get the nfsMountConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @return the nfsMountConfiguration value.
     */
    public NFSMountConfiguration getNfsMountConfiguration() {
        return this.nfsMountConfiguration;
    }

    /**
     * Set the nfsMountConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @param nfsMountConfiguration the nfsMountConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    public MountConfiguration setNfsMountConfiguration(NFSMountConfiguration nfsMountConfiguration) {
        this.nfsMountConfiguration = nfsMountConfiguration;
        return this;
    }

    /**
     * Get the cifsMountConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @return the cifsMountConfiguration value.
     */
    public CifsMountConfiguration getCifsMountConfiguration() {
        return this.cifsMountConfiguration;
    }

    /**
     * Set the cifsMountConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @param cifsMountConfiguration the cifsMountConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    public MountConfiguration setCifsMountConfiguration(CifsMountConfiguration cifsMountConfiguration) {
        this.cifsMountConfiguration = cifsMountConfiguration;
        return this;
    }

    /**
     * Get the azureFileShareConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @return the azureFileShareConfiguration value.
     */
    public AzureFileShareConfiguration getAzureFileShareConfiguration() {
        return this.azureFileShareConfiguration;
    }

    /**
     * Set the azureFileShareConfiguration property: This property is mutually exclusive with all other properties.
     *
     * @param azureFileShareConfiguration the azureFileShareConfiguration value to set.
     * @return the MountConfiguration object itself.
     */
    public MountConfiguration setAzureFileShareConfiguration(AzureFileShareConfiguration azureFileShareConfiguration) {
        this.azureFileShareConfiguration = azureFileShareConfiguration;
        return this;
    }
}
