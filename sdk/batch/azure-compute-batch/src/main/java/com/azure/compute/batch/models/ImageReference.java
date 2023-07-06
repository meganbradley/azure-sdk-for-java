// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A reference to an Azure Virtual Machines Marketplace Image or a Shared Image Gallery Image. To get the list of all
 * Azure Marketplace Image references verified by Azure Batch, see the 'List Supported Images' operation.
 */
@Fluent
public final class ImageReference {

    /*
     * For example, Canonical or MicrosoftWindowsServer.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * For example, UbuntuServer or WindowsServer.
     */
    @JsonProperty(value = "offer")
    private String offer;

    /*
     * For example, 18.04-LTS or 2019-Datacenter.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * A value of 'latest' can be specified to select the latest version of an Image.
     * If omitted, the default is 'latest'.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * This property is mutually exclusive with other ImageReference properties. The
     * Shared Image Gallery Image must have replicas in the same region and must be in
     * the same subscription as the Azure Batch account. If the image version is not
     * specified in the imageId, the latest version will be used. For information
     * about the firewall settings for the Batch Compute Node agent to communicate
     * with the Batch service see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     */
    @JsonProperty(value = "virtualMachineImageId")
    private String virtualMachineImageId;

    /*
     * The specific version of the platform image or marketplace image used to create
     * the node. This read-only field differs from 'version' only if the value
     * specified for 'version' when the pool was created was 'latest'.
     */
    @JsonProperty(value = "exactVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String exactVersion;

    /** Creates an instance of ImageReference class. */
    public ImageReference() {}

    /**
     * Get the publisher property: For example, Canonical or MicrosoftWindowsServer.
     *
     * @return the publisher value.
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: For example, Canonical or MicrosoftWindowsServer.
     *
     * @param publisher the publisher value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference setPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the offer property: For example, UbuntuServer or WindowsServer.
     *
     * @return the offer value.
     */
    public String getOffer() {
        return this.offer;
    }

    /**
     * Set the offer property: For example, UbuntuServer or WindowsServer.
     *
     * @param offer the offer value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference setOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the sku property: For example, 18.04-LTS or 2019-Datacenter.
     *
     * @return the sku value.
     */
    public String getSku() {
        return this.sku;
    }

    /**
     * Set the sku property: For example, 18.04-LTS or 2019-Datacenter.
     *
     * @param sku the sku value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference setSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the version property: A value of 'latest' can be specified to select the latest version of an Image. If
     * omitted, the default is 'latest'.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: A value of 'latest' can be specified to select the latest version of an Image. If
     * omitted, the default is 'latest'.
     *
     * @param version the version value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the virtualMachineImageId property: This property is mutually exclusive with other ImageReference properties.
     * The Shared Image Gallery Image must have replicas in the same region and must be in the same subscription as the
     * Azure Batch account. If the image version is not specified in the imageId, the latest version will be used. For
     * information about the firewall settings for the Batch Compute Node agent to communicate with the Batch service
     * see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     *
     * @return the virtualMachineImageId value.
     */
    public String getVirtualMachineImageId() {
        return this.virtualMachineImageId;
    }

    /**
     * Set the virtualMachineImageId property: This property is mutually exclusive with other ImageReference properties.
     * The Shared Image Gallery Image must have replicas in the same region and must be in the same subscription as the
     * Azure Batch account. If the image version is not specified in the imageId, the latest version will be used. For
     * information about the firewall settings for the Batch Compute Node agent to communicate with the Batch service
     * see
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     *
     * @param virtualMachineImageId the virtualMachineImageId value to set.
     * @return the ImageReference object itself.
     */
    public ImageReference setVirtualMachineImageId(String virtualMachineImageId) {
        this.virtualMachineImageId = virtualMachineImageId;
        return this;
    }

    /**
     * Get the exactVersion property: The specific version of the platform image or marketplace image used to create the
     * node. This read-only field differs from 'version' only if the value specified for 'version' when the pool was
     * created was 'latest'.
     *
     * @return the exactVersion value.
     */
    public String getExactVersion() {
        return this.exactVersion;
    }
}
