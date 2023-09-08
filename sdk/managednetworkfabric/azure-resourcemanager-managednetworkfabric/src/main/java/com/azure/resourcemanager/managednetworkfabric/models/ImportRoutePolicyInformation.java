// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Import Route Policy Configuration. */
@Fluent
public final class ImportRoutePolicyInformation {
    /*
     * Import IPv4 Route Policy Id.
     */
    @JsonProperty(value = "importIpv4RoutePolicyId")
    private String importIpv4RoutePolicyId;

    /*
     * Import IPv6 Route Policy Id.
     */
    @JsonProperty(value = "importIpv6RoutePolicyId")
    private String importIpv6RoutePolicyId;

    /** Creates an instance of ImportRoutePolicyInformation class. */
    public ImportRoutePolicyInformation() {
    }

    /**
     * Get the importIpv4RoutePolicyId property: Import IPv4 Route Policy Id.
     *
     * @return the importIpv4RoutePolicyId value.
     */
    public String importIpv4RoutePolicyId() {
        return this.importIpv4RoutePolicyId;
    }

    /**
     * Set the importIpv4RoutePolicyId property: Import IPv4 Route Policy Id.
     *
     * @param importIpv4RoutePolicyId the importIpv4RoutePolicyId value to set.
     * @return the ImportRoutePolicyInformation object itself.
     */
    public ImportRoutePolicyInformation withImportIpv4RoutePolicyId(String importIpv4RoutePolicyId) {
        this.importIpv4RoutePolicyId = importIpv4RoutePolicyId;
        return this;
    }

    /**
     * Get the importIpv6RoutePolicyId property: Import IPv6 Route Policy Id.
     *
     * @return the importIpv6RoutePolicyId value.
     */
    public String importIpv6RoutePolicyId() {
        return this.importIpv6RoutePolicyId;
    }

    /**
     * Set the importIpv6RoutePolicyId property: Import IPv6 Route Policy Id.
     *
     * @param importIpv6RoutePolicyId the importIpv6RoutePolicyId value to set.
     * @return the ImportRoutePolicyInformation object itself.
     */
    public ImportRoutePolicyInformation withImportIpv6RoutePolicyId(String importIpv6RoutePolicyId) {
        this.importIpv6RoutePolicyId = importIpv6RoutePolicyId;
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
