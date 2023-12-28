// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Referenced tumbling window trigger dependency.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TumblingWindowTriggerDependencyReference")
@Fluent
public final class TumblingWindowTriggerDependencyReference extends TriggerDependencyReference {
    /*
     * Timespan applied to the start time of a tumbling window when evaluating dependency.
     */
    @JsonProperty(value = "offset")
    private String offset;

    /*
     * The size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be
     * used.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * Creates an instance of TumblingWindowTriggerDependencyReference class.
     */
    public TumblingWindowTriggerDependencyReference() {
    }

    /**
     * Get the offset property: Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
     * @return the offset value.
     */
    public String offset() {
        return this.offset;
    }

    /**
     * Set the offset property: Timespan applied to the start time of a tumbling window when evaluating dependency.
     * 
     * @param offset the offset value to set.
     * @return the TumblingWindowTriggerDependencyReference object itself.
     */
    public TumblingWindowTriggerDependencyReference withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the size property: The size of the window when evaluating the dependency. If undefined the frequency of the
     * tumbling window will be used.
     * 
     * @return the size value.
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size property: The size of the window when evaluating the dependency. If undefined the frequency of the
     * tumbling window will be used.
     * 
     * @param size the size value to set.
     * @return the TumblingWindowTriggerDependencyReference object itself.
     */
    public TumblingWindowTriggerDependencyReference withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TumblingWindowTriggerDependencyReference withReferenceTrigger(TriggerReference referenceTrigger) {
        super.withReferenceTrigger(referenceTrigger);
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
    }
}
