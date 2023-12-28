// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class representing detector definition.
 */
@Fluent
public final class DiagnosticCategoryInner extends ProxyOnlyResource {
    /*
     * DiagnosticCategory resource specific properties
     */
    @JsonProperty(value = "properties")
    private DiagnosticCategoryProperties innerProperties;

    /**
     * Creates an instance of DiagnosticCategoryInner class.
     */
    public DiagnosticCategoryInner() {
    }

    /**
     * Get the innerProperties property: DiagnosticCategory resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private DiagnosticCategoryProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiagnosticCategoryInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the description property: Description of the diagnostic category.
     * 
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
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
