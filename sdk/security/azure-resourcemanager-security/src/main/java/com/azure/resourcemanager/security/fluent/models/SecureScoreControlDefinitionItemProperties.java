// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.security.models.AzureResourceLink;
import com.azure.resourcemanager.security.models.SecureScoreControlDefinitionSource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Security Control Definition Properties.
 */
@Immutable
public final class SecureScoreControlDefinitionItemProperties {
    /*
     * User friendly display name of the control
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * User friendly description of the control
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /*
     * Maximum control score (0..10)
     */
    @JsonProperty(value = "maxScore", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxScore;

    /*
     * Source object from which the control was created
     */
    @JsonProperty(value = "source", access = JsonProperty.Access.WRITE_ONLY)
    private SecureScoreControlDefinitionSource source;

    /*
     * Array of assessments metadata IDs that are included in this security control
     */
    @JsonProperty(value = "assessmentDefinitions", access = JsonProperty.Access.WRITE_ONLY)
    private List<AzureResourceLink> assessmentDefinitions;

    /**
     * Creates an instance of SecureScoreControlDefinitionItemProperties class.
     */
    public SecureScoreControlDefinitionItemProperties() {
    }

    /**
     * Get the displayName property: User friendly display name of the control.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the description property: User friendly description of the control.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the maxScore property: Maximum control score (0..10).
     * 
     * @return the maxScore value.
     */
    public Integer maxScore() {
        return this.maxScore;
    }

    /**
     * Get the source property: Source object from which the control was created.
     * 
     * @return the source value.
     */
    public SecureScoreControlDefinitionSource source() {
        return this.source;
    }

    /**
     * Get the assessmentDefinitions property: Array of assessments metadata IDs that are included in this security
     * control.
     * 
     * @return the assessmentDefinitions value.
     */
    public List<AzureResourceLink> assessmentDefinitions() {
        return this.assessmentDefinitions;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() != null) {
            source().validate();
        }
        if (assessmentDefinitions() != null) {
            assessmentDefinitions().forEach(e -> e.validate());
        }
    }
}
