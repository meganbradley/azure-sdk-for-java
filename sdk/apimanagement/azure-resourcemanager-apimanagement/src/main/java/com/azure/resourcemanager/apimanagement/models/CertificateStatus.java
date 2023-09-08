// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Certificate Status. */
public final class CertificateStatus extends ExpandableStringEnum<CertificateStatus> {
    /** Static value Completed for CertificateStatus. */
    public static final CertificateStatus COMPLETED = fromString("Completed");

    /** Static value Failed for CertificateStatus. */
    public static final CertificateStatus FAILED = fromString("Failed");

    /** Static value InProgress for CertificateStatus. */
    public static final CertificateStatus IN_PROGRESS = fromString("InProgress");

    /**
     * Creates a new instance of CertificateStatus value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CertificateStatus() {
    }

    /**
     * Creates or finds a CertificateStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateStatus.
     */
    @JsonCreator
    public static CertificateStatus fromString(String name) {
        return fromString(name, CertificateStatus.class);
    }

    /**
     * Gets known CertificateStatus values.
     *
     * @return known CertificateStatus values.
     */
    public static Collection<CertificateStatus> values() {
        return values(CertificateStatus.class);
    }
}
