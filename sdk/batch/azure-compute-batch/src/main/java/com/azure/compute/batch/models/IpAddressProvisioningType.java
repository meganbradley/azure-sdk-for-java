// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * IPAddressProvisioningType enums.
 */
public final class IpAddressProvisioningType extends ExpandableStringEnum<IpAddressProvisioningType> {

    /**
     * A public IP will be created and managed by Batch. There may be multiple public IPs depending on the size of the
     * Pool.
     */
    @Generated
    public static final IpAddressProvisioningType BATCH_MANAGED = fromString("batchmanaged");

    /**
     * Public IPs are provided by the user and will be used to provision the Compute Nodes.
     */
    @Generated
    public static final IpAddressProvisioningType USER_MANAGED = fromString("usermanaged");

    /**
     * Creates a new instance of IpAddressProvisioningType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public IpAddressProvisioningType() {
    }

    /**
     * Creates or finds a IpAddressProvisioningType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IpAddressProvisioningType.
     */
    @Generated
    @JsonCreator
    public static IpAddressProvisioningType fromString(String name) {
        return fromString(name, IpAddressProvisioningType.class);
    }

    /**
     * Gets known IpAddressProvisioningType values.
     *
     * @return known IpAddressProvisioningType values.
     */
    @Generated
    public static Collection<IpAddressProvisioningType> values() {
        return values(IpAddressProvisioningType.class);
    }

    /**
     * No public IP Address will be created.
     */
    @Generated
    public static final IpAddressProvisioningType NO_PUBLIC_IP_ADDRESSES = fromString("nopublicipaddresses");
}
