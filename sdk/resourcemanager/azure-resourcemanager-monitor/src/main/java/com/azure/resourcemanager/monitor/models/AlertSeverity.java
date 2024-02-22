// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Severity of the alert. Should be an integer between [0-4]. Value of 0 is severest. Relevant and required only for
 * rules of the kind LogAlert.
 */
public final class AlertSeverity extends ExpandableStringEnum<AlertSeverity> {
    /**
     * Static value 0 for AlertSeverity.
     */
    public static final AlertSeverity ZERO = fromLong(0L);

    /**
     * Static value 1 for AlertSeverity.
     */
    public static final AlertSeverity ONE = fromLong(1L);

    /**
     * Static value 2 for AlertSeverity.
     */
    public static final AlertSeverity TWO = fromLong(2L);

    /**
     * Static value 3 for AlertSeverity.
     */
    public static final AlertSeverity THREE = fromLong(3L);

    /**
     * Static value 4 for AlertSeverity.
     */
    public static final AlertSeverity FOUR = fromLong(4L);

    /**
     * Creates a new instance of AlertSeverity value.
     * 
     * @deprecated Use the {@link #fromLong(long)} factory method.
     */
    @Deprecated
    public AlertSeverity() {
    }

    /**
     * Creates or finds a AlertSeverity from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AlertSeverity.
     */
    @JsonCreator
    public static AlertSeverity fromLong(long name) {
        return fromString(String.valueOf(name), AlertSeverity.class);
    }

    /**
     * Gets known AlertSeverity values.
     * 
     * @return known AlertSeverity values.
     */
    public static Collection<AlertSeverity> values() {
        return values(AlertSeverity.class);
    }
}
