// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Publisher Scope.
 */
public final class PublisherScope extends ExpandableStringEnum<PublisherScope> {
    /**
     * Static value Unknown for PublisherScope.
     */
    public static final PublisherScope UNKNOWN = fromString("Unknown");

    /**
     * Static value Private for PublisherScope.
     */
    public static final PublisherScope PRIVATE = fromString("Private");

    /**
     * Creates a new instance of PublisherScope value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PublisherScope() {
    }

    /**
     * Creates or finds a PublisherScope from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PublisherScope.
     */
    @JsonCreator
    public static PublisherScope fromString(String name) {
        return fromString(name, PublisherScope.class);
    }

    /**
     * Gets known PublisherScope values.
     * 
     * @return known PublisherScope values.
     */
    public static Collection<PublisherScope> values() {
        return values(PublisherScope.class);
    }
}
