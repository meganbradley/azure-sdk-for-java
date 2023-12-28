// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of the endpoint for the dead letter destination.
 */
public final class DeadLetterEndPointType extends ExpandableStringEnum<DeadLetterEndPointType> {
    /**
     * Static value StorageBlob for DeadLetterEndPointType.
     */
    public static final DeadLetterEndPointType STORAGE_BLOB = fromString("StorageBlob");

    /**
     * Creates a new instance of DeadLetterEndPointType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DeadLetterEndPointType() {
    }

    /**
     * Creates or finds a DeadLetterEndPointType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DeadLetterEndPointType.
     */
    @JsonCreator
    public static DeadLetterEndPointType fromString(String name) {
        return fromString(name, DeadLetterEndPointType.class);
    }

    /**
     * Gets known DeadLetterEndPointType values.
     * 
     * @return known DeadLetterEndPointType values.
     */
    public static Collection<DeadLetterEndPointType> values() {
        return values(DeadLetterEndPointType.class);
    }
}
