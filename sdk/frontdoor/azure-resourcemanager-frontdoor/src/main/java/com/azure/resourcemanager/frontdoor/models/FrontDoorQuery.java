// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FrontDoorQuery. */
public final class FrontDoorQuery extends ExpandableStringEnum<FrontDoorQuery> {
    /** Static value StripNone for FrontDoorQuery. */
    public static final FrontDoorQuery STRIP_NONE = fromString("StripNone");

    /** Static value StripAll for FrontDoorQuery. */
    public static final FrontDoorQuery STRIP_ALL = fromString("StripAll");

    /** Static value StripOnly for FrontDoorQuery. */
    public static final FrontDoorQuery STRIP_ONLY = fromString("StripOnly");

    /** Static value StripAllExcept for FrontDoorQuery. */
    public static final FrontDoorQuery STRIP_ALL_EXCEPT = fromString("StripAllExcept");

    /**
     * Creates or finds a FrontDoorQuery from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FrontDoorQuery.
     */
    @JsonCreator
    public static FrontDoorQuery fromString(String name) {
        return fromString(name, FrontDoorQuery.class);
    }

    /** @return known FrontDoorQuery values. */
    public static Collection<FrontDoorQuery> values() {
        return values(FrontDoorQuery.class);
    }
}
