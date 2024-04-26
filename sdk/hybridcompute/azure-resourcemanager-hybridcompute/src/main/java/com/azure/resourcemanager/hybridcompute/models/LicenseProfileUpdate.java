// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcompute.fluent.models.LicenseProfileUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Describes a License Profile Update.
 */
@Fluent
public final class LicenseProfileUpdate extends ResourceUpdate {
    /*
     * Describe the Update properties of a license profile.
     */
    @JsonProperty(value = "properties")
    private LicenseProfileUpdateProperties innerProperties;

    /**
     * Creates an instance of LicenseProfileUpdate class.
     */
    public LicenseProfileUpdate() {
    }

    /**
     * Get the innerProperties property: Describe the Update properties of a license profile.
     * 
     * @return the innerProperties value.
     */
    private LicenseProfileUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LicenseProfileUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the softwareAssuranceCustomer property: Specifies if this machine is licensed as part of a Software Assurance
     * agreement.
     * 
     * @return the softwareAssuranceCustomer value.
     */
    public Boolean softwareAssuranceCustomer() {
        return this.innerProperties() == null ? null : this.innerProperties().softwareAssuranceCustomer();
    }

    /**
     * Set the softwareAssuranceCustomer property: Specifies if this machine is licensed as part of a Software Assurance
     * agreement.
     * 
     * @param softwareAssuranceCustomer the softwareAssuranceCustomer value to set.
     * @return the LicenseProfileUpdate object itself.
     */
    public LicenseProfileUpdate withSoftwareAssuranceCustomer(Boolean softwareAssuranceCustomer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileUpdateProperties();
        }
        this.innerProperties().withSoftwareAssuranceCustomer(softwareAssuranceCustomer);
        return this;
    }

    /**
     * Get the assignedLicense property: The resource id of the license.
     * 
     * @return the assignedLicense value.
     */
    public String assignedLicense() {
        return this.innerProperties() == null ? null : this.innerProperties().assignedLicense();
    }

    /**
     * Set the assignedLicense property: The resource id of the license.
     * 
     * @param assignedLicense the assignedLicense value to set.
     * @return the LicenseProfileUpdate object itself.
     */
    public LicenseProfileUpdate withAssignedLicense(String assignedLicense) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileUpdateProperties();
        }
        this.innerProperties().withAssignedLicense(assignedLicense);
        return this;
    }

    /**
     * Get the subscriptionStatus property: Indicates the subscription status of the product.
     * 
     * @return the subscriptionStatus value.
     */
    public LicenseProfileSubscriptionStatusUpdate subscriptionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().subscriptionStatus();
    }

    /**
     * Set the subscriptionStatus property: Indicates the subscription status of the product.
     * 
     * @param subscriptionStatus the subscriptionStatus value to set.
     * @return the LicenseProfileUpdate object itself.
     */
    public LicenseProfileUpdate withSubscriptionStatus(LicenseProfileSubscriptionStatusUpdate subscriptionStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileUpdateProperties();
        }
        this.innerProperties().withSubscriptionStatus(subscriptionStatus);
        return this;
    }

    /**
     * Get the productType property: Indicates the product type of the license.
     * 
     * @return the productType value.
     */
    public LicenseProfileProductType productType() {
        return this.innerProperties() == null ? null : this.innerProperties().productType();
    }

    /**
     * Set the productType property: Indicates the product type of the license.
     * 
     * @param productType the productType value to set.
     * @return the LicenseProfileUpdate object itself.
     */
    public LicenseProfileUpdate withProductType(LicenseProfileProductType productType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileUpdateProperties();
        }
        this.innerProperties().withProductType(productType);
        return this;
    }

    /**
     * Get the productFeatures property: The list of product feature updates.
     * 
     * @return the productFeatures value.
     */
    public List<ProductFeatureUpdate> productFeatures() {
        return this.innerProperties() == null ? null : this.innerProperties().productFeatures();
    }

    /**
     * Set the productFeatures property: The list of product feature updates.
     * 
     * @param productFeatures the productFeatures value to set.
     * @return the LicenseProfileUpdate object itself.
     */
    public LicenseProfileUpdate withProductFeatures(List<ProductFeatureUpdate> productFeatures) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LicenseProfileUpdateProperties();
        }
        this.innerProperties().withProductFeatures(productFeatures);
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
