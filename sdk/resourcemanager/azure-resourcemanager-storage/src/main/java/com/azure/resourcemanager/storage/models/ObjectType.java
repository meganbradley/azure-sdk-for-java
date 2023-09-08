// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * This is a required field. This field specifies the scope of the inventory created either at the blob or container
 * level.
 */
public final class ObjectType extends ExpandableStringEnum<ObjectType> {
    /** Static value Blob for ObjectType. */
    public static final ObjectType BLOB = fromString("Blob");

    /** Static value Container for ObjectType. */
    public static final ObjectType CONTAINER = fromString("Container");

    /**
     * Creates a new instance of ObjectType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ObjectType() {
    }

    /**
     * Creates or finds a ObjectType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ObjectType.
     */
    @JsonCreator
    public static ObjectType fromString(String name) {
        return fromString(name, ObjectType.class);
    }

    /**
     * Gets known ObjectType values.
     *
     * @return known ObjectType values.
     */
    public static Collection<ObjectType> values() {
        return values(ObjectType.class);
    }
}
