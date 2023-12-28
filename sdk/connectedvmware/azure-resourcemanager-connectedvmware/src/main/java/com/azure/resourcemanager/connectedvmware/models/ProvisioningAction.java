// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines the different types of operations for guest agent. */
public final class ProvisioningAction extends ExpandableStringEnum<ProvisioningAction> {
    /** Static value install for ProvisioningAction. */
    public static final ProvisioningAction INSTALL = fromString("install");

    /** Static value uninstall for ProvisioningAction. */
    public static final ProvisioningAction UNINSTALL = fromString("uninstall");

    /** Static value repair for ProvisioningAction. */
    public static final ProvisioningAction REPAIR = fromString("repair");

    /**
     * Creates a new instance of ProvisioningAction value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningAction() {
    }

    /**
     * Creates or finds a ProvisioningAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ProvisioningAction.
     */
    @JsonCreator
    public static ProvisioningAction fromString(String name) {
        return fromString(name, ProvisioningAction.class);
    }

    /**
     * Gets known ProvisioningAction values.
     *
     * @return known ProvisioningAction values.
     */
    public static Collection<ProvisioningAction> values() {
        return values(ProvisioningAction.class);
    }
}
