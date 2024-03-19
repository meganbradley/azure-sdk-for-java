// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metricsdefinitions.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The unit of the metric. */
public final class MetricUnit extends ExpandableStringEnum<MetricUnit> {
    /** Static value Count for MetricUnit. */
    public static final MetricUnit COUNT = fromString("Count");

    /** Static value Bytes for MetricUnit. */
    public static final MetricUnit BYTES = fromString("Bytes");

    /** Static value Seconds for MetricUnit. */
    public static final MetricUnit SECONDS = fromString("Seconds");

    /** Static value CountPerSecond for MetricUnit. */
    public static final MetricUnit COUNT_PER_SECOND = fromString("CountPerSecond");

    /** Static value BytesPerSecond for MetricUnit. */
    public static final MetricUnit BYTES_PER_SECOND = fromString("BytesPerSecond");

    /** Static value Percent for MetricUnit. */
    public static final MetricUnit PERCENT = fromString("Percent");

    /** Static value MilliSeconds for MetricUnit. */
    public static final MetricUnit MILLI_SECONDS = fromString("MilliSeconds");

    /** Static value ByteSeconds for MetricUnit. */
    public static final MetricUnit BYTE_SECONDS = fromString("ByteSeconds");

    /** Static value Unspecified for MetricUnit. */
    public static final MetricUnit UNSPECIFIED = fromString("Unspecified");

    /** Static value Cores for MetricUnit. */
    public static final MetricUnit CORES = fromString("Cores");

    /** Static value MilliCores for MetricUnit. */
    public static final MetricUnit MILLI_CORES = fromString("MilliCores");

    /** Static value NanoCores for MetricUnit. */
    public static final MetricUnit NANO_CORES = fromString("NanoCores");

    /** Static value BitsPerSecond for MetricUnit. */
    public static final MetricUnit BITS_PER_SECOND = fromString("BitsPerSecond");

    /**
     * Creates a new instance of MetricUnit value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public MetricUnit() {}

    /**
     * Creates or finds a MetricUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MetricUnit.
     */
    @JsonCreator
    public static MetricUnit fromString(String name) {
        return fromString(name, MetricUnit.class);
    }

    /**
     * Gets known MetricUnit values.
     *
     * @return known MetricUnit values.
     */
    public static Collection<MetricUnit> values() {
        return values(MetricUnit.class);
    }
}
