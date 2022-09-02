// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for CertificatePermissions. */
public final class CertificatePermissions extends ExpandableStringEnum<CertificatePermissions> {
    /** Static value all for CertificatePermissions. */
    public static final CertificatePermissions ALL = fromString("all");

    /** Static value get for CertificatePermissions. */
    public static final CertificatePermissions GET = fromString("get");

    /** Static value list for CertificatePermissions. */
    public static final CertificatePermissions LIST = fromString("list");

    /** Static value delete for CertificatePermissions. */
    public static final CertificatePermissions DELETE = fromString("delete");

    /** Static value create for CertificatePermissions. */
    public static final CertificatePermissions CREATE = fromString("create");

    /** Static value import for CertificatePermissions. */
    public static final CertificatePermissions IMPORT = fromString("import");

    /** Static value update for CertificatePermissions. */
    public static final CertificatePermissions UPDATE = fromString("update");

    /** Static value managecontacts for CertificatePermissions. */
    public static final CertificatePermissions MANAGECONTACTS = fromString("managecontacts");

    /** Static value getissuers for CertificatePermissions. */
    public static final CertificatePermissions GETISSUERS = fromString("getissuers");

    /** Static value listissuers for CertificatePermissions. */
    public static final CertificatePermissions LISTISSUERS = fromString("listissuers");

    /** Static value setissuers for CertificatePermissions. */
    public static final CertificatePermissions SETISSUERS = fromString("setissuers");

    /** Static value deleteissuers for CertificatePermissions. */
    public static final CertificatePermissions DELETEISSUERS = fromString("deleteissuers");

    /** Static value manageissuers for CertificatePermissions. */
    public static final CertificatePermissions MANAGEISSUERS = fromString("manageissuers");

    /** Static value recover for CertificatePermissions. */
    public static final CertificatePermissions RECOVER = fromString("recover");

    /** Static value purge for CertificatePermissions. */
    public static final CertificatePermissions PURGE = fromString("purge");

    /** Static value backup for CertificatePermissions. */
    public static final CertificatePermissions BACKUP = fromString("backup");

    /** Static value restore for CertificatePermissions. */
    public static final CertificatePermissions RESTORE = fromString("restore");

    /**
     * Creates or finds a CertificatePermissions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificatePermissions.
     */
    @JsonCreator
    public static CertificatePermissions fromString(String name) {
        return fromString(name, CertificatePermissions.class);
    }

    /**
     * Gets known CertificatePermissions values.
     *
     * @return known CertificatePermissions values.
     */
    public static Collection<CertificatePermissions> values() {
        return values(CertificatePermissions.class);
    }
}
