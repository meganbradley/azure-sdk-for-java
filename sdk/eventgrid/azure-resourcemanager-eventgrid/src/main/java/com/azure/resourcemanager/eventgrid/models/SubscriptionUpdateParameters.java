// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.fluent.models.SubscriptionUpdateParametersProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the Event Subscription update.
 */
@Fluent
public final class SubscriptionUpdateParameters {
    /*
     * Properties of the Event Subscription update parameters.
     */
    @JsonProperty(value = "properties")
    private SubscriptionUpdateParametersProperties innerProperties;

    /**
     * Creates an instance of SubscriptionUpdateParameters class.
     */
    public SubscriptionUpdateParameters() {
    }

    /**
     * Get the innerProperties property: Properties of the Event Subscription update parameters.
     * 
     * @return the innerProperties value.
     */
    private SubscriptionUpdateParametersProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the deliveryConfiguration property: Information about the delivery configuration of the event subscription.
     * 
     * @return the deliveryConfiguration value.
     */
    public DeliveryConfiguration deliveryConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().deliveryConfiguration();
    }

    /**
     * Set the deliveryConfiguration property: Information about the delivery configuration of the event subscription.
     * 
     * @param deliveryConfiguration the deliveryConfiguration value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withDeliveryConfiguration(DeliveryConfiguration deliveryConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParametersProperties();
        }
        this.innerProperties().withDeliveryConfiguration(deliveryConfiguration);
        return this;
    }

    /**
     * Get the eventDeliverySchema property: The event delivery schema for the event subscription.
     * 
     * @return the eventDeliverySchema value.
     */
    public DeliverySchema eventDeliverySchema() {
        return this.innerProperties() == null ? null : this.innerProperties().eventDeliverySchema();
    }

    /**
     * Set the eventDeliverySchema property: The event delivery schema for the event subscription.
     * 
     * @param eventDeliverySchema the eventDeliverySchema value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withEventDeliverySchema(DeliverySchema eventDeliverySchema) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParametersProperties();
        }
        this.innerProperties().withEventDeliverySchema(eventDeliverySchema);
        return this;
    }

    /**
     * Get the filtersConfiguration property: Information about the filter for the event subscription.
     * 
     * @return the filtersConfiguration value.
     */
    public FiltersConfiguration filtersConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().filtersConfiguration();
    }

    /**
     * Set the filtersConfiguration property: Information about the filter for the event subscription.
     * 
     * @param filtersConfiguration the filtersConfiguration value to set.
     * @return the SubscriptionUpdateParameters object itself.
     */
    public SubscriptionUpdateParameters withFiltersConfiguration(FiltersConfiguration filtersConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SubscriptionUpdateParametersProperties();
        }
        this.innerProperties().withFiltersConfiguration(filtersConfiguration);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
