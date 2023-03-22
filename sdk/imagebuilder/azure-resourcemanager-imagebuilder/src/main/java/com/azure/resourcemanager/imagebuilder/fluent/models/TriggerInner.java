// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.imagebuilder.models.TriggerProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a trigger that can invoke an image template build. */
@Fluent
public final class TriggerInner extends ProxyResource {
    /*
     * The properties of a trigger
     */
    @JsonProperty(value = "properties")
    private TriggerProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of TriggerInner class. */
    public TriggerInner() {
    }

    /**
     * Get the properties property: The properties of a trigger.
     *
     * @return the properties value.
     */
    public TriggerProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties of a trigger.
     *
     * @param properties the properties value to set.
     * @return the TriggerInner object itself.
     */
    public TriggerInner withProperties(TriggerProperties properties) {
        this.properties = properties;
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
    }
}
