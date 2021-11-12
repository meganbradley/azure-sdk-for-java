// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FeatureType. */
public final class FeatureType extends ExpandableStringEnum<FeatureType> {
    /** Static value Invalid for FeatureType. */
    public static final FeatureType INVALID = fromString("Invalid");

    /** Static value DataSourceType for FeatureType. */
    public static final FeatureType DATA_SOURCE_TYPE = fromString("DataSourceType");

    /**
     * Creates or finds a FeatureType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FeatureType.
     */
    @JsonCreator
    public static FeatureType fromString(String name) {
        return fromString(name, FeatureType.class);
    }

    /** @return known FeatureType values. */
    public static Collection<FeatureType> values() {
        return values(FeatureType.class);
    }
}
