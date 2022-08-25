// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WafAction. */
public final class WafAction extends ExpandableStringEnum<WafAction> {
    /** Static value allow for WafAction. */
    public static final WafAction ALLOW = fromString("allow");

    /** Static value block for WafAction. */
    public static final WafAction BLOCK = fromString("block");

    /** Static value log for WafAction. */
    public static final WafAction LOG = fromString("log");

    /** Static value redirect for WafAction. */
    public static final WafAction REDIRECT = fromString("redirect");

    /**
     * Creates or finds a WafAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WafAction.
     */
    @JsonCreator
    public static WafAction fromString(String name) {
        return fromString(name, WafAction.class);
    }

    /**
     * Gets known WafAction values.
     *
     * @return known WafAction values.
     */
    public static Collection<WafAction> values() {
        return values(WafAction.class);
    }
}
