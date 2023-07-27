// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Provisioning state of the iSCSI Target. */
public final class ProvisioningStates extends ExpandableStringEnum<ProvisioningStates> {
    /** Static value Invalid for ProvisioningStates. */
    public static final ProvisioningStates INVALID = fromString("Invalid");

    /** Static value Succeeded for ProvisioningStates. */
    public static final ProvisioningStates SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for ProvisioningStates. */
    public static final ProvisioningStates FAILED = fromString("Failed");

    /** Static value Canceled for ProvisioningStates. */
    public static final ProvisioningStates CANCELED = fromString("Canceled");

    /** Static value Pending for ProvisioningStates. */
    public static final ProvisioningStates PENDING = fromString("Pending");

    /** Static value Creating for ProvisioningStates. */
    public static final ProvisioningStates CREATING = fromString("Creating");

    /** Static value Updating for ProvisioningStates. */
    public static final ProvisioningStates UPDATING = fromString("Updating");

    /** Static value Deleting for ProvisioningStates. */
    public static final ProvisioningStates DELETING = fromString("Deleting");

    /**
     * Creates a new instance of ProvisioningStates value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningStates() {
    }

    /**
     * Creates or finds a ProvisioningStates from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProvisioningStates.
     */
    @JsonCreator
    public static ProvisioningStates fromString(String name) {
        return fromString(name, ProvisioningStates.class);
    }

    /**
     * Gets known ProvisioningStates values.
     *
     * @return known ProvisioningStates values.
     */
    public static Collection<ProvisioningStates> values() {
        return values(ProvisioningStates.class);
    }
}
