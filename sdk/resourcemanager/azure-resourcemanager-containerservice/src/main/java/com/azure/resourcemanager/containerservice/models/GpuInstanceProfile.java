// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** GPUInstanceProfile to be used to specify GPU MIG instance profile for supported GPU VM SKU. */
public final class GpuInstanceProfile extends ExpandableStringEnum<GpuInstanceProfile> {
    /** Static value MIG1g for GpuInstanceProfile. */
    public static final GpuInstanceProfile MIG1G = fromString("MIG1g");

    /** Static value MIG2g for GpuInstanceProfile. */
    public static final GpuInstanceProfile MIG2G = fromString("MIG2g");

    /** Static value MIG3g for GpuInstanceProfile. */
    public static final GpuInstanceProfile MIG3G = fromString("MIG3g");

    /** Static value MIG4g for GpuInstanceProfile. */
    public static final GpuInstanceProfile MIG4G = fromString("MIG4g");

    /** Static value MIG7g for GpuInstanceProfile. */
    public static final GpuInstanceProfile MIG7G = fromString("MIG7g");

    /**
     * Creates or finds a GpuInstanceProfile from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GpuInstanceProfile.
     */
    @JsonCreator
    public static GpuInstanceProfile fromString(String name) {
        return fromString(name, GpuInstanceProfile.class);
    }

    /**
     * Gets known GpuInstanceProfile values.
     *
     * @return known GpuInstanceProfile values.
     */
    public static Collection<GpuInstanceProfile> values() {
        return values(GpuInstanceProfile.class);
    }
}
