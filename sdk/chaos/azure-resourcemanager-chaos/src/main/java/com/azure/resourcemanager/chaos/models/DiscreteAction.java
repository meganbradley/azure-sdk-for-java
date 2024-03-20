// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Model that represents a discrete action.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("discrete")
@Fluent
public final class DiscreteAction extends ChaosExperimentAction {
    /*
     * List of key value pairs.
     */
    @JsonProperty(value = "parameters", required = true)
    private List<KeyValuePair> parameters;

    /*
     * String that represents a selector.
     */
    @JsonProperty(value = "selectorId", required = true)
    private String selectorId;

    /**
     * Creates an instance of DiscreteAction class.
     */
    public DiscreteAction() {
    }

    /**
     * Get the parameters property: List of key value pairs.
     * 
     * @return the parameters value.
     */
    public List<KeyValuePair> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: List of key value pairs.
     * 
     * @param parameters the parameters value to set.
     * @return the DiscreteAction object itself.
     */
    public DiscreteAction withParameters(List<KeyValuePair> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the selectorId property: String that represents a selector.
     * 
     * @return the selectorId value.
     */
    public String selectorId() {
        return this.selectorId;
    }

    /**
     * Set the selectorId property: String that represents a selector.
     * 
     * @param selectorId the selectorId value to set.
     * @return the DiscreteAction object itself.
     */
    public DiscreteAction withSelectorId(String selectorId) {
        this.selectorId = selectorId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DiscreteAction withName(String name) {
        super.withName(name);
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
        if (parameters() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property parameters in model DiscreteAction"));
        } else {
            parameters().forEach(e -> e.validate());
        }
        if (selectorId() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property selectorId in model DiscreteAction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiscreteAction.class);
}
