// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AnomalyValue.
 */
public final class AnomalyValue extends ExpandableStringEnum<AnomalyValue> {
    /**
     * Static value AutoDetect for AnomalyValue.
     */
    public static final AnomalyValue AUTO_DETECT = fromString("AutoDetect");

    /**
     * Static value Anomaly for AnomalyValue.
     */
    public static final AnomalyValue ANOMALY = fromString("Anomaly");

    /**
     * Static value NotAnomaly for AnomalyValue.
     */
    public static final AnomalyValue NOT_ANOMALY = fromString("NotAnomaly");

    /**
     * Creates a new instance of AnomalyValue value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AnomalyValue() {
    }

    /**
     * Creates or finds a AnomalyValue from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AnomalyValue.
     */
    public static AnomalyValue fromString(String name) {
        return fromString(name, AnomalyValue.class);
    }

    /**
     * Gets known AnomalyValue values.
     * 
     * @return known AnomalyValue values.
     */
    public static Collection<AnomalyValue> values() {
        return values(AnomalyValue.class);
    }
}
