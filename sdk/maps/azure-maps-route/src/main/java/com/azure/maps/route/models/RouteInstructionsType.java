// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for RouteInstructionsType. */
public final class RouteInstructionsType extends ExpandableStringEnum<RouteInstructionsType> {
    /** Static value coded for RouteInstructionsType. */
    public static final RouteInstructionsType CODED = fromString("coded");

    /** Static value text for RouteInstructionsType. */
    public static final RouteInstructionsType TEXT = fromString("text");

    /** Static value tagged for RouteInstructionsType. */
    public static final RouteInstructionsType TAGGED = fromString("tagged");

    /**
     * Creates or finds a RouteInstructionsType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RouteInstructionsType.
     */
    @JsonCreator
    public static RouteInstructionsType fromString(String name) {
        return fromString(name, RouteInstructionsType.class);
    }

    /**
     * Gets known RouteInstructionsType values.
     *
     * @return known RouteInstructionsType values.
     */
    public static Collection<RouteInstructionsType> values() {
        return values(RouteInstructionsType.class);
    }
}
