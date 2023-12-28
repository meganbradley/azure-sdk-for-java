// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.RecoveryPointModelInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Recovery point model collection. */
@Fluent
public final class RecoveryPointModelCollection {
    /*
     * Gets or sets the list of recovery points.
     */
    @JsonProperty(value = "value")
    private List<RecoveryPointModelInner> value;

    /*
     * Gets or sets the value of next link.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of RecoveryPointModelCollection class. */
    public RecoveryPointModelCollection() {
    }

    /**
     * Get the value property: Gets or sets the list of recovery points.
     *
     * @return the value value.
     */
    public List<RecoveryPointModelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets the list of recovery points.
     *
     * @param value the value value to set.
     * @return the RecoveryPointModelCollection object itself.
     */
    public RecoveryPointModelCollection withValue(List<RecoveryPointModelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets the value of next link.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets the value of next link.
     *
     * @param nextLink the nextLink value to set.
     * @return the RecoveryPointModelCollection object itself.
     */
    public RecoveryPointModelCollection withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
