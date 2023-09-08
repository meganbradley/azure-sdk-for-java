// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.PortalSettingsContract;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Descriptions of API Management policies. */
@Fluent
public final class PortalSettingsCollectionInner {
    /*
     * Descriptions of API Management policies.
     */
    @JsonProperty(value = "value")
    private List<PortalSettingsContract> value;

    /*
     * Total record count number.
     */
    @JsonProperty(value = "count")
    private Long count;

    /** Creates an instance of PortalSettingsCollectionInner class. */
    public PortalSettingsCollectionInner() {
    }

    /**
     * Get the value property: Descriptions of API Management policies.
     *
     * @return the value value.
     */
    public List<PortalSettingsContract> value() {
        return this.value;
    }

    /**
     * Set the value property: Descriptions of API Management policies.
     *
     * @param value the value value to set.
     * @return the PortalSettingsCollectionInner object itself.
     */
    public PortalSettingsCollectionInner withValue(List<PortalSettingsContract> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the count property: Total record count number.
     *
     * @return the count value.
     */
    public Long count() {
        return this.count;
    }

    /**
     * Set the count property: Total record count number.
     *
     * @param count the count value to set.
     * @return the PortalSettingsCollectionInner object itself.
     */
    public PortalSettingsCollectionInner withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
