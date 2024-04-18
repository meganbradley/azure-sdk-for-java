// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * BatchCertificateState enums.
 */
public final class BatchCertificateState extends ExpandableStringEnum<BatchCertificateState> {

    /**
     * The Certificate is available for use in Pools.
     */
    @Generated
    public static final BatchCertificateState ACTIVE = fromString("active");

    /**
     * The user has requested that the Certificate be deleted, but the delete operation has not yet completed. You may
     * not reference the Certificate when creating or updating Pools.
     */
    @Generated
    public static final BatchCertificateState DELETING = fromString("deleting");

    /**
     * The user requested that the Certificate be deleted, but there are Pools that still have references to the
     * Certificate, or it is still installed on one or more Nodes. (The latter can occur if the Certificate has been
     * removed from the Pool, but the Compute Node has not yet restarted. Compute Nodes refresh their Certificates only
     * when they restart.) You may use the cancel Certificate delete operation to cancel the delete, or the delete
     * Certificate operation to retry the delete.
     */
    @Generated
    public static final BatchCertificateState DELETE_FAILED = fromString("deletefailed");

    /**
     * Creates a new instance of BatchCertificateState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public BatchCertificateState() {
    }

    /**
     * Creates or finds a BatchCertificateState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BatchCertificateState.
     */
    @Generated
    public static BatchCertificateState fromString(String name) {
        return fromString(name, BatchCertificateState.class);
    }

    /**
     * Gets known BatchCertificateState values.
     *
     * @return known BatchCertificateState values.
     */
    @Generated
    public static Collection<BatchCertificateState> values() {
        return values(BatchCertificateState.class);
    }
}
