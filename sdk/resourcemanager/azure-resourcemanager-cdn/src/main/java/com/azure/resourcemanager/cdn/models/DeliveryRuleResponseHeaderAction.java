// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Defines the response header action for the delivery rule. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonTypeName("ModifyResponseHeader")
@Fluent
public final class DeliveryRuleResponseHeaderAction extends DeliveryRuleAction {
    /*
     * Defines the parameters for the action.
     */
    @JsonProperty(value = "parameters", required = true)
    private HeaderActionParameters parameters;

    /**
     * Get the parameters property: Defines the parameters for the action.
     *
     * @return the parameters value.
     */
    public HeaderActionParameters parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Defines the parameters for the action.
     *
     * @param parameters the parameters value to set.
     * @return the DeliveryRuleResponseHeaderAction object itself.
     */
    public DeliveryRuleResponseHeaderAction withParameters(HeaderActionParameters parameters) {
        this.parameters = parameters;
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
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property parameters in model DeliveryRuleResponseHeaderAction"));
        } else {
            parameters().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeliveryRuleResponseHeaderAction.class);
}
