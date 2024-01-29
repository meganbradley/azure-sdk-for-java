// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The Virtual Machine Scale Set eviction policy.
 * 
 * The eviction policy specifies what to do with the VM when it is evicted. The default is Delete. For more information
 * about eviction see [spot VMs](https://docs.microsoft.com/azure/virtual-machines/spot-vms).
 */
public final class ScaleSetEvictionPolicy extends ExpandableStringEnum<ScaleSetEvictionPolicy> {
    /**
     * Static value Delete for ScaleSetEvictionPolicy.
     */
    public static final ScaleSetEvictionPolicy DELETE = fromString("Delete");

    /**
     * Static value Deallocate for ScaleSetEvictionPolicy.
     */
    public static final ScaleSetEvictionPolicy DEALLOCATE = fromString("Deallocate");

    /**
     * Creates a new instance of ScaleSetEvictionPolicy value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ScaleSetEvictionPolicy() {
    }

    /**
     * Creates or finds a ScaleSetEvictionPolicy from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ScaleSetEvictionPolicy.
     */
    @JsonCreator
    public static ScaleSetEvictionPolicy fromString(String name) {
        return fromString(name, ScaleSetEvictionPolicy.class);
    }

    /**
     * Gets known ScaleSetEvictionPolicy values.
     * 
     * @return known ScaleSetEvictionPolicy values.
     */
    public static Collection<ScaleSetEvictionPolicy> values() {
        return values(ScaleSetEvictionPolicy.class);
    }
}
