// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Tier of an Azure Firewall. */
public final class AzureFirewallSkuTier extends ExpandableStringEnum<AzureFirewallSkuTier> {
    /** Static value Standard for AzureFirewallSkuTier. */
    public static final AzureFirewallSkuTier STANDARD = fromString("Standard");

    /** Static value Premium for AzureFirewallSkuTier. */
    public static final AzureFirewallSkuTier PREMIUM = fromString("Premium");

    /** Static value Basic for AzureFirewallSkuTier. */
    public static final AzureFirewallSkuTier BASIC = fromString("Basic");

    /**
     * Creates or finds a AzureFirewallSkuTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AzureFirewallSkuTier.
     */
    @JsonCreator
    public static AzureFirewallSkuTier fromString(String name) {
        return fromString(name, AzureFirewallSkuTier.class);
    }

    /**
     * Gets known AzureFirewallSkuTier values.
     *
     * @return known AzureFirewallSkuTier values.
     */
    public static Collection<AzureFirewallSkuTier> values() {
        return values(AzureFirewallSkuTier.class);
    }
}
