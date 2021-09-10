// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionTemplate;
import com.azure.resourcemanager.hybridnetwork.models.NetworkFunctionType;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.azure.resourcemanager.hybridnetwork.models.SkuDeploymentMode;
import com.azure.resourcemanager.hybridnetwork.models.SkuType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sku sub resource. */
@Fluent
public final class VendorSkuInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VendorSkuInner.class);

    /*
     * Vendor sku details.
     */
    @JsonProperty(value = "properties")
    private VendorSkuPropertiesFormat innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Vendor sku details.
     *
     * @return the innerProperties value.
     */
    private VendorSkuPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the vendor sku sub resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the skuType property: The sku type.
     *
     * @return the skuType value.
     */
    public SkuType skuType() {
        return this.innerProperties() == null ? null : this.innerProperties().skuType();
    }

    /**
     * Set the skuType property: The sku type.
     *
     * @param skuType the skuType value to set.
     * @return the VendorSkuInner object itself.
     */
    public VendorSkuInner withSkuType(SkuType skuType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VendorSkuPropertiesFormat();
        }
        this.innerProperties().withSkuType(skuType);
        return this;
    }

    /**
     * Get the deploymentMode property: The sku deployment mode.
     *
     * @return the deploymentMode value.
     */
    public SkuDeploymentMode deploymentMode() {
        return this.innerProperties() == null ? null : this.innerProperties().deploymentMode();
    }

    /**
     * Set the deploymentMode property: The sku deployment mode.
     *
     * @param deploymentMode the deploymentMode value to set.
     * @return the VendorSkuInner object itself.
     */
    public VendorSkuInner withDeploymentMode(SkuDeploymentMode deploymentMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VendorSkuPropertiesFormat();
        }
        this.innerProperties().withDeploymentMode(deploymentMode);
        return this;
    }

    /**
     * Get the networkFunctionType property: The network function type.
     *
     * @return the networkFunctionType value.
     */
    public NetworkFunctionType networkFunctionType() {
        return this.innerProperties() == null ? null : this.innerProperties().networkFunctionType();
    }

    /**
     * Set the networkFunctionType property: The network function type.
     *
     * @param networkFunctionType the networkFunctionType value to set.
     * @return the VendorSkuInner object itself.
     */
    public VendorSkuInner withNetworkFunctionType(NetworkFunctionType networkFunctionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VendorSkuPropertiesFormat();
        }
        this.innerProperties().withNetworkFunctionType(networkFunctionType);
        return this;
    }

    /**
     * Get the preview property: Indicates if the vendor sku is in preview mode.
     *
     * @return the preview value.
     */
    public Boolean preview() {
        return this.innerProperties() == null ? null : this.innerProperties().preview();
    }

    /**
     * Set the preview property: Indicates if the vendor sku is in preview mode.
     *
     * @param preview the preview value to set.
     * @return the VendorSkuInner object itself.
     */
    public VendorSkuInner withPreview(Boolean preview) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VendorSkuPropertiesFormat();
        }
        this.innerProperties().withPreview(preview);
        return this;
    }

    /**
     * Get the managedApplicationParameters property: The parameters for the managed application to be supplied by the
     * vendor.
     *
     * @return the managedApplicationParameters value.
     */
    public Object managedApplicationParameters() {
        return this.innerProperties() == null ? null : this.innerProperties().managedApplicationParameters();
    }

    /**
     * Set the managedApplicationParameters property: The parameters for the managed application to be supplied by the
     * vendor.
     *
     * @param managedApplicationParameters the managedApplicationParameters value to set.
     * @return the VendorSkuInner object itself.
     */
    public VendorSkuInner withManagedApplicationParameters(Object managedApplicationParameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VendorSkuPropertiesFormat();
        }
        this.innerProperties().withManagedApplicationParameters(managedApplicationParameters);
        return this;
    }

    /**
     * Get the managedApplicationTemplate property: The template for the managed application deployment.
     *
     * @return the managedApplicationTemplate value.
     */
    public Object managedApplicationTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().managedApplicationTemplate();
    }

    /**
     * Set the managedApplicationTemplate property: The template for the managed application deployment.
     *
     * @param managedApplicationTemplate the managedApplicationTemplate value to set.
     * @return the VendorSkuInner object itself.
     */
    public VendorSkuInner withManagedApplicationTemplate(Object managedApplicationTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VendorSkuPropertiesFormat();
        }
        this.innerProperties().withManagedApplicationTemplate(managedApplicationTemplate);
        return this;
    }

    /**
     * Get the networkFunctionTemplate property: The template definition of the network function.
     *
     * @return the networkFunctionTemplate value.
     */
    public NetworkFunctionTemplate networkFunctionTemplate() {
        return this.innerProperties() == null ? null : this.innerProperties().networkFunctionTemplate();
    }

    /**
     * Set the networkFunctionTemplate property: The template definition of the network function.
     *
     * @param networkFunctionTemplate the networkFunctionTemplate value to set.
     * @return the VendorSkuInner object itself.
     */
    public VendorSkuInner withNetworkFunctionTemplate(NetworkFunctionTemplate networkFunctionTemplate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VendorSkuPropertiesFormat();
        }
        this.innerProperties().withNetworkFunctionTemplate(networkFunctionTemplate);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
