// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** One of the supported timestamp formats. */
public final class KnownLogFileTextSettingsRecordStartTimestampFormat
    extends ExpandableStringEnum<KnownLogFileTextSettingsRecordStartTimestampFormat> {
    /** Static value ISO 8601 for KnownLogFileTextSettingsRecordStartTimestampFormat. */
    public static final KnownLogFileTextSettingsRecordStartTimestampFormat ISO_8601 = fromString("ISO 8601");

    /** Static value YYYY-MM-DD HH:MM:SS for KnownLogFileTextSettingsRecordStartTimestampFormat. */
    public static final KnownLogFileTextSettingsRecordStartTimestampFormat YYYY_MM_DD_HH_MM_SS =
        fromString("YYYY-MM-DD HH:MM:SS");

    /** Static value M/D/YYYY HH:MM:SS AM/PM for KnownLogFileTextSettingsRecordStartTimestampFormat. */
    public static final KnownLogFileTextSettingsRecordStartTimestampFormat M_D_YYYY_HH_MM_SS_AM_PM =
        fromString("M/D/YYYY HH:MM:SS AM/PM");

    /** Static value Mon DD, YYYY HH:MM:SS for KnownLogFileTextSettingsRecordStartTimestampFormat. */
    public static final KnownLogFileTextSettingsRecordStartTimestampFormat MON_DD_YYYY_HH_MM_SS =
        fromString("Mon DD, YYYY HH:MM:SS");

    /** Static value yyMMdd HH:mm:ss for KnownLogFileTextSettingsRecordStartTimestampFormat. */
    public static final KnownLogFileTextSettingsRecordStartTimestampFormat YY_MMDD_HH_MM_SS =
        fromString("yyMMdd HH:mm:ss");

    /** Static value ddMMyy HH:mm:ss for KnownLogFileTextSettingsRecordStartTimestampFormat. */
    public static final KnownLogFileTextSettingsRecordStartTimestampFormat DD_MMYY_HH_MM_SS =
        fromString("ddMMyy HH:mm:ss");

    /** Static value MMM d hh:mm:ss for KnownLogFileTextSettingsRecordStartTimestampFormat. */
    public static final KnownLogFileTextSettingsRecordStartTimestampFormat MMM_D_HH_MM_SS =
        fromString("MMM d hh:mm:ss");

    /** Static value dd/MMM/yyyy:HH:mm:ss zzz for KnownLogFileTextSettingsRecordStartTimestampFormat. */
    public static final KnownLogFileTextSettingsRecordStartTimestampFormat DD_MMM_YYYY_HH_MM_SS_ZZZ =
        fromString("dd/MMM/yyyy:HH:mm:ss zzz");

    /** Static value yyyy-MM-ddTHH:mm:ssK for KnownLogFileTextSettingsRecordStartTimestampFormat. */
    public static final KnownLogFileTextSettingsRecordStartTimestampFormat YYYY_MM_DD_THH_MM_SSK =
        fromString("yyyy-MM-ddTHH:mm:ssK");

    /**
     * Creates or finds a KnownLogFileTextSettingsRecordStartTimestampFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding KnownLogFileTextSettingsRecordStartTimestampFormat.
     */
    @JsonCreator
    public static KnownLogFileTextSettingsRecordStartTimestampFormat fromString(String name) {
        return fromString(name, KnownLogFileTextSettingsRecordStartTimestampFormat.class);
    }

    /**
     * Gets known KnownLogFileTextSettingsRecordStartTimestampFormat values.
     *
     * @return known KnownLogFileTextSettingsRecordStartTimestampFormat values.
     */
    public static Collection<KnownLogFileTextSettingsRecordStartTimestampFormat> values() {
        return values(KnownLogFileTextSettingsRecordStartTimestampFormat.class);
    }
}
