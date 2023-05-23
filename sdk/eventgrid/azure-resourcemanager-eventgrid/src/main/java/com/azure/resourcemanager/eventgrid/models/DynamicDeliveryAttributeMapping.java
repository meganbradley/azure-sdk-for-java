// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.DynamicDeliveryAttributeMappingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Dynamic delivery attribute mapping details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Dynamic")
@Fluent
public final class DynamicDeliveryAttributeMapping extends DeliveryAttributeMapping {
    /*
     * Properties of dynamic delivery attribute mapping.
     */
    @JsonProperty(value = "properties")
    private DynamicDeliveryAttributeMappingProperties innerProperties;

    /** Creates an instance of DynamicDeliveryAttributeMapping class. */
    public DynamicDeliveryAttributeMapping() {
    }

    /**
     * Get the innerProperties property: Properties of dynamic delivery attribute mapping.
     *
     * @return the innerProperties value.
     */
    private DynamicDeliveryAttributeMappingProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public DynamicDeliveryAttributeMapping withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Get the sourceField property: JSON path in the event which contains attribute value.
     *
     * @return the sourceField value.
     */
    public String sourceField() {
        return this.innerProperties() == null ? null : this.innerProperties().sourceField();
    }

    /**
     * Set the sourceField property: JSON path in the event which contains attribute value.
     *
     * @param sourceField the sourceField value to set.
     * @return the DynamicDeliveryAttributeMapping object itself.
     */
    public DynamicDeliveryAttributeMapping withSourceField(String sourceField) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DynamicDeliveryAttributeMappingProperties();
        }
        this.innerProperties().withSourceField(sourceField);
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
