// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SupportTier. */
public final class SupportTier extends ExpandableStringEnum<SupportTier> {
    /** Static value Microsoft for SupportTier. */
    public static final SupportTier MICROSOFT = fromString("Microsoft");

    /** Static value Partner for SupportTier. */
    public static final SupportTier PARTNER = fromString("Partner");

    /** Static value Community for SupportTier. */
    public static final SupportTier COMMUNITY = fromString("Community");

    /**
     * Creates or finds a SupportTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SupportTier.
     */
    @JsonCreator
    public static SupportTier fromString(String name) {
        return fromString(name, SupportTier.class);
    }

    /**
     * Gets known SupportTier values.
     *
     * @return known SupportTier values.
     */
    public static Collection<SupportTier> values() {
        return values(SupportTier.class);
    }
}
