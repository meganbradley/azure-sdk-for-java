// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines the disk sku name. */
public final class DiskSkuName extends ExpandableStringEnum<DiskSkuName> {
    /** Static value Standard_LRS for DiskSkuName. */
    public static final DiskSkuName STANDARD_LRS = fromString("Standard_LRS");

    /** Static value Premium_LRS for DiskSkuName. */
    public static final DiskSkuName PREMIUM_LRS = fromString("Premium_LRS");

    /** Static value StandardSSD_LRS for DiskSkuName. */
    public static final DiskSkuName STANDARD_SSD_LRS = fromString("StandardSSD_LRS");

    /** Static value UltraSSD_LRS for DiskSkuName. */
    public static final DiskSkuName ULTRA_SSD_LRS = fromString("UltraSSD_LRS");

    /** Static value Premium_ZRS for DiskSkuName. */
    public static final DiskSkuName PREMIUM_ZRS = fromString("Premium_ZRS");

    /** Static value StandardSSD_ZRS for DiskSkuName. */
    public static final DiskSkuName STANDARD_SSD_ZRS = fromString("StandardSSD_ZRS");

    /** Static value PremiumV2_LRS for DiskSkuName. */
    public static final DiskSkuName PREMIUM_V2_LRS = fromString("PremiumV2_LRS");

    /**
     * Creates a new instance of DiskSkuName value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DiskSkuName() {
    }

    /**
     * Creates or finds a DiskSkuName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DiskSkuName.
     */
    @JsonCreator
    public static DiskSkuName fromString(String name) {
        return fromString(name, DiskSkuName.class);
    }

    /**
     * Gets known DiskSkuName values.
     *
     * @return known DiskSkuName values.
     */
    public static Collection<DiskSkuName> values() {
        return values(DiskSkuName.class);
    }
}
