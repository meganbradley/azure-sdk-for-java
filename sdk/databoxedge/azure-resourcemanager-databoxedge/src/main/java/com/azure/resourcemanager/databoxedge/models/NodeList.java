// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databoxedge.fluent.models.NodeInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of Nodes. */
@Immutable
public final class NodeList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NodeList.class);

    /*
     * The list of Nodes.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<NodeInner> value;

    /**
     * Get the value property: The list of Nodes.
     *
     * @return the value value.
     */
    public List<NodeInner> value() {
        return this.value;
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
