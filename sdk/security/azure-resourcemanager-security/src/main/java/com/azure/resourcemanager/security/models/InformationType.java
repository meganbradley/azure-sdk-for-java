// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/**
 * The information type.
 */
@Fluent
public final class InformationType {
    /*
     * The name of the information type.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the information type.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The order of the information type.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /*
     * The recommended label id to be associated with this information type.
     */
    @JsonProperty(value = "recommendedLabelId")
    private UUID recommendedLabelId;

    /*
     * Indicates whether the information type is enabled or not.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Indicates whether the information type is custom or not.
     */
    @JsonProperty(value = "custom")
    private Boolean custom;

    /*
     * The information type keywords.
     */
    @JsonProperty(value = "keywords")
    private List<InformationProtectionKeyword> keywords;

    /**
     * Creates an instance of InformationType class.
     */
    public InformationType() {
    }

    /**
     * Get the displayName property: The name of the information type.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The name of the information type.
     * 
     * @param displayName the displayName value to set.
     * @return the InformationType object itself.
     */
    public InformationType withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the information type.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the information type.
     * 
     * @param description the description value to set.
     * @return the InformationType object itself.
     */
    public InformationType withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the order property: The order of the information type.
     * 
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: The order of the information type.
     * 
     * @param order the order value to set.
     * @return the InformationType object itself.
     */
    public InformationType withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the recommendedLabelId property: The recommended label id to be associated with this information type.
     * 
     * @return the recommendedLabelId value.
     */
    public UUID recommendedLabelId() {
        return this.recommendedLabelId;
    }

    /**
     * Set the recommendedLabelId property: The recommended label id to be associated with this information type.
     * 
     * @param recommendedLabelId the recommendedLabelId value to set.
     * @return the InformationType object itself.
     */
    public InformationType withRecommendedLabelId(UUID recommendedLabelId) {
        this.recommendedLabelId = recommendedLabelId;
        return this;
    }

    /**
     * Get the enabled property: Indicates whether the information type is enabled or not.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Indicates whether the information type is enabled or not.
     * 
     * @param enabled the enabled value to set.
     * @return the InformationType object itself.
     */
    public InformationType withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the custom property: Indicates whether the information type is custom or not.
     * 
     * @return the custom value.
     */
    public Boolean custom() {
        return this.custom;
    }

    /**
     * Set the custom property: Indicates whether the information type is custom or not.
     * 
     * @param custom the custom value to set.
     * @return the InformationType object itself.
     */
    public InformationType withCustom(Boolean custom) {
        this.custom = custom;
        return this;
    }

    /**
     * Get the keywords property: The information type keywords.
     * 
     * @return the keywords value.
     */
    public List<InformationProtectionKeyword> keywords() {
        return this.keywords;
    }

    /**
     * Set the keywords property: The information type keywords.
     * 
     * @param keywords the keywords value to set.
     * @return the InformationType object itself.
     */
    public InformationType withKeywords(List<InformationProtectionKeyword> keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keywords() != null) {
            keywords().forEach(e -> e.validate());
        }
    }
}
