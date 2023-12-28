// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The node image upgrade type. */
public final class NodeImageSelectionType extends ExpandableStringEnum<NodeImageSelectionType> {
    /** Static value Latest for NodeImageSelectionType. */
    public static final NodeImageSelectionType LATEST = fromString("Latest");

    /** Static value Consistent for NodeImageSelectionType. */
    public static final NodeImageSelectionType CONSISTENT = fromString("Consistent");

    /**
     * Creates a new instance of NodeImageSelectionType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NodeImageSelectionType() {
    }

    /**
     * Creates or finds a NodeImageSelectionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding NodeImageSelectionType.
     */
    @JsonCreator
    public static NodeImageSelectionType fromString(String name) {
        return fromString(name, NodeImageSelectionType.class);
    }

    /**
     * Gets known NodeImageSelectionType values.
     *
     * @return known NodeImageSelectionType values.
     */
    public static Collection<NodeImageSelectionType> values() {
        return values(NodeImageSelectionType.class);
    }
}
