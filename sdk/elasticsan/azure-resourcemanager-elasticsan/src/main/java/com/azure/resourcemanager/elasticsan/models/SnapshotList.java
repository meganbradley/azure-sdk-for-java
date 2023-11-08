// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.elasticsan.fluent.models.SnapshotInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Snapshots. */
@Fluent
public final class SnapshotList {
    /*
     * An array of Snapshot objects.
     */
    @JsonProperty(value = "value")
    private List<SnapshotInner> value;

    /*
     * URI to fetch the next section of the paginated response.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of SnapshotList class. */
    public SnapshotList() {
    }

    /**
     * Get the value property: An array of Snapshot objects.
     *
     * @return the value value.
     */
    public List<SnapshotInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of Snapshot objects.
     *
     * @param value the value value to set.
     * @return the SnapshotList object itself.
     */
    public SnapshotList withValue(List<SnapshotInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URI to fetch the next section of the paginated response.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
