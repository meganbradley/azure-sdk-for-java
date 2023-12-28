// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * detection direction.
 */
public final class AnomalyDetectorDirection extends ExpandableStringEnum<AnomalyDetectorDirection> {
    /**
     * Static value Both for AnomalyDetectorDirection.
     */
    public static final AnomalyDetectorDirection BOTH = fromString("Both");

    /**
     * Static value Down for AnomalyDetectorDirection.
     */
    public static final AnomalyDetectorDirection DOWN = fromString("Down");

    /**
     * Static value Up for AnomalyDetectorDirection.
     */
    public static final AnomalyDetectorDirection UP = fromString("Up");

    /**
     * Creates a new instance of AnomalyDetectorDirection value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AnomalyDetectorDirection() {
    }

    /**
     * Creates or finds a AnomalyDetectorDirection from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AnomalyDetectorDirection.
     */
    public static AnomalyDetectorDirection fromString(String name) {
        return fromString(name, AnomalyDetectorDirection.class);
    }

    /**
     * Gets known AnomalyDetectorDirection values.
     * 
     * @return known AnomalyDetectorDirection values.
     */
    public static Collection<AnomalyDetectorDirection> values() {
        return values(AnomalyDetectorDirection.class);
    }
}
