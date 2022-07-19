// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ServiceSize. */
public final class ServiceSize extends ExpandableStringEnum<ServiceSize> {
    /** Static value Cosmos.D4s for ServiceSize. */
    public static final ServiceSize COSMOS_D4S = fromString("Cosmos.D4s");

    /** Static value Cosmos.D8s for ServiceSize. */
    public static final ServiceSize COSMOS_D8S = fromString("Cosmos.D8s");

    /** Static value Cosmos.D16s for ServiceSize. */
    public static final ServiceSize COSMOS_D16S = fromString("Cosmos.D16s");

    /**
     * Creates or finds a ServiceSize from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceSize.
     */
    @JsonCreator
    public static ServiceSize fromString(String name) {
        return fromString(name, ServiceSize.class);
    }

    /**
     * Gets known ServiceSize values.
     *
     * @return known ServiceSize values.
     */
    public static Collection<ServiceSize> values() {
        return values(ServiceSize.class);
    }
}
