// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CertificateVisibility. */
public final class CertificateVisibility extends ExpandableStringEnum<CertificateVisibility> {
    /**
     * The Certificate should be visible to the user account under which the StartTask is run. Note that if AutoUser
     * Scope is Pool for both the StartTask and a Task, this certificate will be visible to the Task as well.
     */
    public static final CertificateVisibility START_TASK = fromString("starttask");

    /** The Certificate should be visible to the user accounts under which Job Tasks are run. */
    public static final CertificateVisibility TASK = fromString("task");

    /** The Certificate should be visible to the user accounts under which users remotely access the Compute Node. */
    public static final CertificateVisibility REMOTE_USER = fromString("remoteuser");

    /**
     * Creates a new instance of CertificateVisibility value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CertificateVisibility() {}

    /**
     * Creates or finds a CertificateVisibility from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateVisibility.
     */
    @JsonCreator
    public static CertificateVisibility fromString(String name) {
        return fromString(name, CertificateVisibility.class);
    }

    /**
     * Gets known CertificateVisibility values.
     *
     * @return known CertificateVisibility values.
     */
    public static Collection<CertificateVisibility> values() {
        return values(CertificateVisibility.class);
    }
}
