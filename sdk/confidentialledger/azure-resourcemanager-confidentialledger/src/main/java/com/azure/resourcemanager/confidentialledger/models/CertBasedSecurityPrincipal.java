// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confidentialledger.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cert based security principal with Ledger RoleName. */
@Fluent
public final class CertBasedSecurityPrincipal {
    /*
     * Public key of the user cert (.pem or .cer)
     */
    @JsonProperty(value = "cert")
    private String cert;

    /*
     * LedgerRole associated with the Security Principal of Ledger
     */
    @JsonProperty(value = "ledgerRoleName")
    private LedgerRoleName ledgerRoleName;

    /** Creates an instance of CertBasedSecurityPrincipal class. */
    public CertBasedSecurityPrincipal() {
    }

    /**
     * Get the cert property: Public key of the user cert (.pem or .cer).
     *
     * @return the cert value.
     */
    public String cert() {
        return this.cert;
    }

    /**
     * Set the cert property: Public key of the user cert (.pem or .cer).
     *
     * @param cert the cert value to set.
     * @return the CertBasedSecurityPrincipal object itself.
     */
    public CertBasedSecurityPrincipal withCert(String cert) {
        this.cert = cert;
        return this;
    }

    /**
     * Get the ledgerRoleName property: LedgerRole associated with the Security Principal of Ledger.
     *
     * @return the ledgerRoleName value.
     */
    public LedgerRoleName ledgerRoleName() {
        return this.ledgerRoleName;
    }

    /**
     * Set the ledgerRoleName property: LedgerRole associated with the Security Principal of Ledger.
     *
     * @param ledgerRoleName the ledgerRoleName value to set.
     * @return the CertBasedSecurityPrincipal object itself.
     */
    public CertBasedSecurityPrincipal withLedgerRoleName(LedgerRoleName ledgerRoleName) {
        this.ledgerRoleName = ledgerRoleName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
