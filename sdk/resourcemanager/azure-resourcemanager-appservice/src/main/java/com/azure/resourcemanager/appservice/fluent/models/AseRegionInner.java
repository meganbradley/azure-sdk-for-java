// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * ASE region.
 */
@Fluent
public final class AseRegionInner extends ProxyOnlyResource {
    /*
     * ASE region resource specific properties
     */
    @JsonProperty(value = "properties")
    private AseRegionProperties innerProperties;

    /**
     * Creates an instance of AseRegionInner class.
     */
    public AseRegionInner() {
    }

    /**
     * Get the innerProperties property: ASE region resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private AseRegionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AseRegionInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the displayName property: Display name for region.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Get the standard property: Is region standard.
     * 
     * @return the standard value.
     */
    public Boolean standard() {
        return this.innerProperties() == null ? null : this.innerProperties().standard();
    }

    /**
     * Get the dedicatedHost property: Dedicated host enabled.
     * 
     * @return the dedicatedHost value.
     */
    public Boolean dedicatedHost() {
        return this.innerProperties() == null ? null : this.innerProperties().dedicatedHost();
    }

    /**
     * Get the zoneRedundant property: Zone redundant deployment enabled.
     * 
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.innerProperties() == null ? null : this.innerProperties().zoneRedundant();
    }

    /**
     * Get the availableSku property: Available Skus in region.
     * 
     * @return the availableSku value.
     */
    public List<String> availableSku() {
        return this.innerProperties() == null ? null : this.innerProperties().availableSku();
    }

    /**
     * Set the availableSku property: Available Skus in region.
     * 
     * @param availableSku the availableSku value to set.
     * @return the AseRegionInner object itself.
     */
    public AseRegionInner withAvailableSku(List<String> availableSku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AseRegionProperties();
        }
        this.innerProperties().withAvailableSku(availableSku);
        return this;
    }

    /**
     * Get the availableOS property: Available OSs in region.
     * 
     * @return the availableOS value.
     */
    public List<String> availableOS() {
        return this.innerProperties() == null ? null : this.innerProperties().availableOS();
    }

    /**
     * Set the availableOS property: Available OSs in region.
     * 
     * @param availableOS the availableOS value to set.
     * @return the AseRegionInner object itself.
     */
    public AseRegionInner withAvailableOS(List<String> availableOS) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AseRegionProperties();
        }
        this.innerProperties().withAvailableOS(availableOS);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
