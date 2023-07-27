// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** CertificateFormat enums. */
public final class CertificateFormat extends ExpandableStringEnum<CertificateFormat> {

    /** The Certificate is a PFX (PKCS#12) formatted Certificate or Certificate chain. */
    @Generated public static final CertificateFormat PFX = fromString("pfx");

    /** The Certificate is a base64-encoded X.509 Certificate. */
    @Generated public static final CertificateFormat CER = fromString("cer");

    /**
     * Creates a new instance of CertificateFormat value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public CertificateFormat() {}

    /**
     * Creates or finds a CertificateFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding CertificateFormat.
     */
    @Generated
    @JsonCreator
    public static CertificateFormat fromString(String name) {
        return fromString(name, CertificateFormat.class);
    }

    /**
     * Gets known CertificateFormat values.
     *
     * @return known CertificateFormat values.
     */
    @Generated
    public static Collection<CertificateFormat> values() {
        return values(CertificateFormat.class);
    }
}
