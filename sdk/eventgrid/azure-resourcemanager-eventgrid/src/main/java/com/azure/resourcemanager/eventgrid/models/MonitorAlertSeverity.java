// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The severity that will be attached to every Alert fired through this event subscription.
 * This field must be provided.
 */
public final class MonitorAlertSeverity extends ExpandableStringEnum<MonitorAlertSeverity> {
    /**
     * Static value Sev0 for MonitorAlertSeverity.
     */
    public static final MonitorAlertSeverity SEV0 = fromString("Sev0");

    /**
     * Static value Sev1 for MonitorAlertSeverity.
     */
    public static final MonitorAlertSeverity SEV1 = fromString("Sev1");

    /**
     * Static value Sev2 for MonitorAlertSeverity.
     */
    public static final MonitorAlertSeverity SEV2 = fromString("Sev2");

    /**
     * Static value Sev3 for MonitorAlertSeverity.
     */
    public static final MonitorAlertSeverity SEV3 = fromString("Sev3");

    /**
     * Static value Sev4 for MonitorAlertSeverity.
     */
    public static final MonitorAlertSeverity SEV4 = fromString("Sev4");

    /**
     * Creates a new instance of MonitorAlertSeverity value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MonitorAlertSeverity() {
    }

    /**
     * Creates or finds a MonitorAlertSeverity from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding MonitorAlertSeverity.
     */
    @JsonCreator
    public static MonitorAlertSeverity fromString(String name) {
        return fromString(name, MonitorAlertSeverity.class);
    }

    /**
     * Gets known MonitorAlertSeverity values.
     * 
     * @return known MonitorAlertSeverity values.
     */
    public static Collection<MonitorAlertSeverity> values() {
        return values(MonitorAlertSeverity.class);
    }
}
