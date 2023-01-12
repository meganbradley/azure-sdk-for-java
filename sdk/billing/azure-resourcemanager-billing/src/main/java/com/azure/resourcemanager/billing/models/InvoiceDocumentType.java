// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The type of the document. */
public final class InvoiceDocumentType extends ExpandableStringEnum<InvoiceDocumentType> {
    /** Static value Invoice for InvoiceDocumentType. */
    public static final InvoiceDocumentType INVOICE = fromString("Invoice");

    /** Static value CreditNote for InvoiceDocumentType. */
    public static final InvoiceDocumentType CREDIT_NOTE = fromString("CreditNote");

    /**
     * Creates a new instance of InvoiceDocumentType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public InvoiceDocumentType() {
    }

    /**
     * Creates or finds a InvoiceDocumentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InvoiceDocumentType.
     */
    @JsonCreator
    public static InvoiceDocumentType fromString(String name) {
        return fromString(name, InvoiceDocumentType.class);
    }

    /**
     * Gets known InvoiceDocumentType values.
     *
     * @return known InvoiceDocumentType values.
     */
    public static Collection<InvoiceDocumentType> values() {
        return values(InvoiceDocumentType.class);
    }
}
