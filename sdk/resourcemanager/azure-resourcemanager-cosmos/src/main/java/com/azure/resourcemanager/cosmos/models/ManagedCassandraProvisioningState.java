// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ManagedCassandraProvisioningState. */
public final class ManagedCassandraProvisioningState extends ExpandableStringEnum<ManagedCassandraProvisioningState> {
    /** Static value Creating for ManagedCassandraProvisioningState. */
    public static final ManagedCassandraProvisioningState CREATING = fromString("Creating");

    /** Static value Updating for ManagedCassandraProvisioningState. */
    public static final ManagedCassandraProvisioningState UPDATING = fromString("Updating");

    /** Static value Deleting for ManagedCassandraProvisioningState. */
    public static final ManagedCassandraProvisioningState DELETING = fromString("Deleting");

    /** Static value Succeeded for ManagedCassandraProvisioningState. */
    public static final ManagedCassandraProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ManagedCassandraProvisioningState. */
    public static final ManagedCassandraProvisioningState FAILED = fromString("Failed");

    /** Static value Canceled for ManagedCassandraProvisioningState. */
    public static final ManagedCassandraProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates or finds a ManagedCassandraProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ManagedCassandraProvisioningState.
     */
    @JsonCreator
    public static ManagedCassandraProvisioningState fromString(String name) {
        return fromString(name, ManagedCassandraProvisioningState.class);
    }

    /**
     * Gets known ManagedCassandraProvisioningState values.
     *
     * @return known ManagedCassandraProvisioningState values.
     */
    public static Collection<ManagedCassandraProvisioningState> values() {
        return values(ManagedCassandraProvisioningState.class);
    }
}
