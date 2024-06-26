// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for RouteAvoidType.
 */
public final class RouteAvoidType extends ExpandableStringEnum<RouteAvoidType> {
    /**
     * Avoids toll roads.
     */
    public static final RouteAvoidType TOLL_ROADS = fromString("tollRoads");

    /**
     * Avoids motorways.
     */
    public static final RouteAvoidType MOTORWAYS = fromString("motorways");

    /**
     * Avoids ferries.
     */
    public static final RouteAvoidType FERRIES = fromString("ferries");

    /**
     * Avoids unpaved roads.
     */
    public static final RouteAvoidType UNPAVED_ROADS = fromString("unpavedRoads");

    /**
     * Avoids routes that require the use of carpool (HOV/High Occupancy Vehicle) lanes.
     */
    public static final RouteAvoidType CARPOOLS = fromString("carpools");

    /**
     * Avoids using the same road multiple times. Most useful in conjunction with `routeType`=thrilling.
     */
    public static final RouteAvoidType ALREADY_USED_ROADS = fromString("alreadyUsedRoads");

    /**
     * Avoids border crossings in route calculation.
     */
    public static final RouteAvoidType BORDER_CROSSINGS = fromString("borderCrossings");

    /**
     * Creates a new instance of RouteAvoidType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public RouteAvoidType() {
    }

    /**
     * Creates or finds a RouteAvoidType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding RouteAvoidType.
     */
    public static RouteAvoidType fromString(String name) {
        return fromString(name, RouteAvoidType.class);
    }

    /**
     * Gets known RouteAvoidType values.
     * 
     * @return known RouteAvoidType values.
     */
    public static Collection<RouteAvoidType> values() {
        return values(RouteAvoidType.class);
    }
}
