// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a managed server DNS alias.
 */
@Immutable
public final class ManagedServerDnsAliasProperties {
    /*
     * The fully qualified DNS record for managed server alias
     */
    @JsonProperty(value = "azureDnsRecord", access = JsonProperty.Access.WRITE_ONLY)
    private String azureDnsRecord;

    /*
     * The fully qualified public DNS record for managed server alias
     */
    @JsonProperty(value = "publicAzureDnsRecord", access = JsonProperty.Access.WRITE_ONLY)
    private String publicAzureDnsRecord;

    /**
     * Creates an instance of ManagedServerDnsAliasProperties class.
     */
    public ManagedServerDnsAliasProperties() {
    }

    /**
     * Get the azureDnsRecord property: The fully qualified DNS record for managed server alias.
     * 
     * @return the azureDnsRecord value.
     */
    public String azureDnsRecord() {
        return this.azureDnsRecord;
    }

    /**
     * Get the publicAzureDnsRecord property: The fully qualified public DNS record for managed server alias.
     * 
     * @return the publicAzureDnsRecord value.
     */
    public String publicAzureDnsRecord() {
        return this.publicAzureDnsRecord;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
