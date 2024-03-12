// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Replication eligibility results collection response model.
 */
@Fluent
public final class ReplicationEligibilityResultsCollectionInner {
    /*
     * The replication eligibility results details.
     */
    @JsonProperty(value = "value")
    private List<ReplicationEligibilityResultsInner> value;

    /**
     * Creates an instance of ReplicationEligibilityResultsCollectionInner class.
     */
    public ReplicationEligibilityResultsCollectionInner() {
    }

    /**
     * Get the value property: The replication eligibility results details.
     * 
     * @return the value value.
     */
    public List<ReplicationEligibilityResultsInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The replication eligibility results details.
     * 
     * @param value the value value to set.
     * @return the ReplicationEligibilityResultsCollectionInner object itself.
     */
    public ReplicationEligibilityResultsCollectionInner withValue(List<ReplicationEligibilityResultsInner> value) {
        this.value = value;
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
