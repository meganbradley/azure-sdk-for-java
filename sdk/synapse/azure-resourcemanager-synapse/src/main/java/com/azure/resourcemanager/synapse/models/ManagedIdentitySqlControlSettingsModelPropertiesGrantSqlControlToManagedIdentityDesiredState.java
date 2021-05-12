// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState. */
public final class ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState
    extends ExpandableStringEnum<
        ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState> {
    /**
     * Static value Enabled for
     * ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState.
     */
    public static final ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState
        ENABLED = fromString("Enabled");

    /**
     * Static value Disabled for
     * ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState.
     */
    public static final ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState
        DISABLED = fromString("Disabled");

    /**
     * Creates or finds a ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState
     * from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding
     *     ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState.
     */
    @JsonCreator
    public static ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState
        fromString(String name) {
        return fromString(
            name, ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState.class);
    }

    /**
     * @return known ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState
     *     values.
     */
    public static Collection<
            ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState>
        values() {
        return values(
            ManagedIdentitySqlControlSettingsModelPropertiesGrantSqlControlToManagedIdentityDesiredState.class);
    }
}
