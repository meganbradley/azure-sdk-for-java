// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcontainerservice.models.ExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The provisionedClusterInstances resource definition.
 */
@Fluent
public final class ProvisionedClustersInner extends ProxyResource {
    /*
     * All properties of the provisioned cluster
     */
    @JsonProperty(value = "properties")
    private ProvisionedClusterProperties properties;

    /*
     * Extended Location definition
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ProvisionedClustersInner class.
     */
    public ProvisionedClustersInner() {
    }

    /**
     * Get the properties property: All properties of the provisioned cluster.
     * 
     * @return the properties value.
     */
    public ProvisionedClusterProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: All properties of the provisioned cluster.
     * 
     * @param properties the properties value to set.
     * @return the ProvisionedClustersInner object itself.
     */
    public ProvisionedClustersInner withProperties(ProvisionedClusterProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the extendedLocation property: Extended Location definition.
     * 
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: Extended Location definition.
     * 
     * @param extendedLocation the extendedLocation value to set.
     * @return the ProvisionedClustersInner object itself.
     */
    public ProvisionedClustersInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
