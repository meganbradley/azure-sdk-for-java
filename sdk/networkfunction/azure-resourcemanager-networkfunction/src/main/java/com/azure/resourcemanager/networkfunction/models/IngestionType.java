// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The ingestion type. */
public final class IngestionType extends ExpandableStringEnum<IngestionType> {
    /** Static value IPFIX for IngestionType. */
    public static final IngestionType IPFIX = fromString("IPFIX");

    /**
     * Creates or finds a IngestionType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IngestionType.
     */
    @JsonCreator
    public static IngestionType fromString(String name) {
        return fromString(name, IngestionType.class);
    }

    /**
     * Gets known IngestionType values.
     *
     * @return known IngestionType values.
     */
    public static Collection<IngestionType> values() {
        return values(IngestionType.class);
    }
}
