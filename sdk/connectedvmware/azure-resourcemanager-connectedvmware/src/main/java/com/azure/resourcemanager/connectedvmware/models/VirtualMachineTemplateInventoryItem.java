// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.connectedvmware.fluent.models.InventoryItemProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The VM Template inventory item. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "inventoryType")
@JsonTypeName("VirtualMachineTemplate")
@Fluent
public final class VirtualMachineTemplateInventoryItem extends InventoryItemProperties {
    /*
     * Gets or sets memory size in MBs for the template.
     */
    @JsonProperty(value = "memorySizeMB")
    private Integer memorySizeMB;

    /*
     * Gets or sets the number of vCPUs for the template.
     */
    @JsonProperty(value = "numCPUs")
    private Integer numCPUs;

    /*
     * Gets or sets the number of cores per socket for the template.
     * Defaults to 1 if unspecified.
     */
    @JsonProperty(value = "numCoresPerSocket")
    private Integer numCoresPerSocket;

    /*
     * Gets or sets the type of the os.
     */
    @JsonProperty(value = "osType")
    private OsType osType;

    /*
     * Gets or sets os name.
     */
    @JsonProperty(value = "osName")
    private String osName;

    /*
     * Gets or sets the folder path of the template.
     */
    @JsonProperty(value = "folderPath")
    private String folderPath;

    /**
     * Get the memorySizeMB property: Gets or sets memory size in MBs for the template.
     *
     * @return the memorySizeMB value.
     */
    public Integer memorySizeMB() {
        return this.memorySizeMB;
    }

    /**
     * Set the memorySizeMB property: Gets or sets memory size in MBs for the template.
     *
     * @param memorySizeMB the memorySizeMB value to set.
     * @return the VirtualMachineTemplateInventoryItem object itself.
     */
    public VirtualMachineTemplateInventoryItem withMemorySizeMB(Integer memorySizeMB) {
        this.memorySizeMB = memorySizeMB;
        return this;
    }

    /**
     * Get the numCPUs property: Gets or sets the number of vCPUs for the template.
     *
     * @return the numCPUs value.
     */
    public Integer numCPUs() {
        return this.numCPUs;
    }

    /**
     * Set the numCPUs property: Gets or sets the number of vCPUs for the template.
     *
     * @param numCPUs the numCPUs value to set.
     * @return the VirtualMachineTemplateInventoryItem object itself.
     */
    public VirtualMachineTemplateInventoryItem withNumCPUs(Integer numCPUs) {
        this.numCPUs = numCPUs;
        return this;
    }

    /**
     * Get the numCoresPerSocket property: Gets or sets the number of cores per socket for the template. Defaults to 1
     * if unspecified.
     *
     * @return the numCoresPerSocket value.
     */
    public Integer numCoresPerSocket() {
        return this.numCoresPerSocket;
    }

    /**
     * Set the numCoresPerSocket property: Gets or sets the number of cores per socket for the template. Defaults to 1
     * if unspecified.
     *
     * @param numCoresPerSocket the numCoresPerSocket value to set.
     * @return the VirtualMachineTemplateInventoryItem object itself.
     */
    public VirtualMachineTemplateInventoryItem withNumCoresPerSocket(Integer numCoresPerSocket) {
        this.numCoresPerSocket = numCoresPerSocket;
        return this;
    }

    /**
     * Get the osType property: Gets or sets the type of the os.
     *
     * @return the osType value.
     */
    public OsType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: Gets or sets the type of the os.
     *
     * @param osType the osType value to set.
     * @return the VirtualMachineTemplateInventoryItem object itself.
     */
    public VirtualMachineTemplateInventoryItem withOsType(OsType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the osName property: Gets or sets os name.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Set the osName property: Gets or sets os name.
     *
     * @param osName the osName value to set.
     * @return the VirtualMachineTemplateInventoryItem object itself.
     */
    public VirtualMachineTemplateInventoryItem withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * Get the folderPath property: Gets or sets the folder path of the template.
     *
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: Gets or sets the folder path of the template.
     *
     * @param folderPath the folderPath value to set.
     * @return the VirtualMachineTemplateInventoryItem object itself.
     */
    public VirtualMachineTemplateInventoryItem withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineTemplateInventoryItem withManagedResourceId(String managedResourceId) {
        super.withManagedResourceId(managedResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineTemplateInventoryItem withMoRefId(String moRefId) {
        super.withMoRefId(moRefId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineTemplateInventoryItem withMoName(String moName) {
        super.withMoName(moName);
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
    }
}
