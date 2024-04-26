// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.quota.fluent.models.GroupQuotaRequestBaseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The new GroupQuota limit requested.
 */
@Fluent
public final class GroupQuotaRequestBase {
    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private GroupQuotaRequestBaseProperties innerProperties;

    /**
     * Creates an instance of GroupQuotaRequestBase class.
     */
    public GroupQuotaRequestBase() {
    }

    /**
     * Get the innerProperties property: The properties property.
     * 
     * @return the innerProperties value.
     */
    private GroupQuotaRequestBaseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the limit property: The new quota limit for the subscription. The incremental quota will be allocated from
     * pre-approved group quota.
     * 
     * @return the limit value.
     */
    public Long limit() {
        return this.innerProperties() == null ? null : this.innerProperties().limit();
    }

    /**
     * Set the limit property: The new quota limit for the subscription. The incremental quota will be allocated from
     * pre-approved group quota.
     * 
     * @param limit the limit value to set.
     * @return the GroupQuotaRequestBase object itself.
     */
    public GroupQuotaRequestBase withLimit(Long limit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GroupQuotaRequestBaseProperties();
        }
        this.innerProperties().withLimit(limit);
        return this;
    }

    /**
     * Get the region property: Location/Azure region for the quota requested for resource.
     * 
     * @return the region value.
     */
    public String region() {
        return this.innerProperties() == null ? null : this.innerProperties().region();
    }

    /**
     * Set the region property: Location/Azure region for the quota requested for resource.
     * 
     * @param region the region value to set.
     * @return the GroupQuotaRequestBase object itself.
     */
    public GroupQuotaRequestBase withRegion(String region) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GroupQuotaRequestBaseProperties();
        }
        this.innerProperties().withRegion(region);
        return this;
    }

    /**
     * Get the comments property: GroupQuota Request comments and details for request. This is optional paramter to
     * provide more details related to the requested resource.
     * 
     * @return the comments value.
     */
    public String comments() {
        return this.innerProperties() == null ? null : this.innerProperties().comments();
    }

    /**
     * Set the comments property: GroupQuota Request comments and details for request. This is optional paramter to
     * provide more details related to the requested resource.
     * 
     * @param comments the comments value to set.
     * @return the GroupQuotaRequestBase object itself.
     */
    public GroupQuotaRequestBase withComments(String comments) {
        if (this.innerProperties() == null) {
            this.innerProperties = new GroupQuotaRequestBaseProperties();
        }
        this.innerProperties().withComments(comments);
        return this;
    }

    /**
     * Get the value property: Resource name.
     * 
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Get the localizedValue property: Resource display name.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.innerProperties() == null ? null : this.innerProperties().localizedValue();
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
