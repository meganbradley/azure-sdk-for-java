// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * ARM provisioning state.
 */
public final class AmlFilesystemProvisioningStateType extends ExpandableStringEnum<AmlFilesystemProvisioningStateType> {
    /**
     * Static value Succeeded for AmlFilesystemProvisioningStateType.
     */
    public static final AmlFilesystemProvisioningStateType SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for AmlFilesystemProvisioningStateType.
     */
    public static final AmlFilesystemProvisioningStateType FAILED = fromString("Failed");

    /**
     * Static value Creating for AmlFilesystemProvisioningStateType.
     */
    public static final AmlFilesystemProvisioningStateType CREATING = fromString("Creating");

    /**
     * Static value Deleting for AmlFilesystemProvisioningStateType.
     */
    public static final AmlFilesystemProvisioningStateType DELETING = fromString("Deleting");

    /**
     * Static value Updating for AmlFilesystemProvisioningStateType.
     */
    public static final AmlFilesystemProvisioningStateType UPDATING = fromString("Updating");

    /**
     * Static value Canceled for AmlFilesystemProvisioningStateType.
     */
    public static final AmlFilesystemProvisioningStateType CANCELED = fromString("Canceled");

    /**
     * Creates a new instance of AmlFilesystemProvisioningStateType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AmlFilesystemProvisioningStateType() {
    }

    /**
     * Creates or finds a AmlFilesystemProvisioningStateType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AmlFilesystemProvisioningStateType.
     */
    @JsonCreator
    public static AmlFilesystemProvisioningStateType fromString(String name) {
        return fromString(name, AmlFilesystemProvisioningStateType.class);
    }

    /**
     * Gets known AmlFilesystemProvisioningStateType values.
     * 
     * @return known AmlFilesystemProvisioningStateType values.
     */
    public static Collection<AmlFilesystemProvisioningStateType> values() {
        return values(AmlFilesystemProvisioningStateType.class);
    }
}
