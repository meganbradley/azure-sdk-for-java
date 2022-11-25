// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** plannerGroup. */
@Fluent
public final class MicrosoftGraphPlannerGroup extends MicrosoftGraphEntity {
    /*
     * Read-only. Nullable. Returns the plannerPlans owned by the group.
     */
    @JsonProperty(value = "plans")
    private List<MicrosoftGraphPlannerPlan> plans;

    /*
     * plannerGroup
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphPlannerGroup class. */
    public MicrosoftGraphPlannerGroup() {
    }

    /**
     * Get the plans property: Read-only. Nullable. Returns the plannerPlans owned by the group.
     *
     * @return the plans value.
     */
    public List<MicrosoftGraphPlannerPlan> plans() {
        return this.plans;
    }

    /**
     * Set the plans property: Read-only. Nullable. Returns the plannerPlans owned by the group.
     *
     * @param plans the plans value to set.
     * @return the MicrosoftGraphPlannerGroup object itself.
     */
    public MicrosoftGraphPlannerGroup withPlans(List<MicrosoftGraphPlannerPlan> plans) {
        this.plans = plans;
        return this;
    }

    /**
     * Get the additionalProperties property: plannerGroup.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: plannerGroup.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphPlannerGroup object itself.
     */
    public MicrosoftGraphPlannerGroup withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphPlannerGroup withId(String id) {
        super.withId(id);
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
        if (plans() != null) {
            plans().forEach(e -> e.validate());
        }
    }
}
