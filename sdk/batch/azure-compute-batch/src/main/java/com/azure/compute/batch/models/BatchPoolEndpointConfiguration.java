// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The endpoint configuration for a Pool.
 */
@Immutable
public final class BatchPoolEndpointConfiguration {

    /*
     * A list of inbound NAT Pools that can be used to address specific ports on an individual Compute Node externally.
     * The maximum number of inbound NAT Pools per Batch Pool is 5. If the maximum number of inbound NAT Pools is
     * exceeded the request fails with HTTP status code 400. This cannot be specified if the IPAddressProvisioningType
     * is NoPublicIPAddresses.
     */
    @Generated
    @JsonProperty(value = "inboundNATPools")
    private List<InboundNATPool> inboundNatPools;

    /**
     * Creates an instance of BatchPoolEndpointConfiguration class.
     *
     * @param inboundNatPools the inboundNatPools value to set.
     */
    @Generated
    @JsonCreator
    public BatchPoolEndpointConfiguration(
        @JsonProperty(value = "inboundNATPools") List<InboundNATPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
    }

    /**
     * Get the inboundNatPools property: A list of inbound NAT Pools that can be used to address specific ports on an
     * individual Compute Node externally. The maximum number of inbound NAT Pools per Batch Pool is 5. If the maximum
     * number of inbound NAT Pools is exceeded the request fails with HTTP status code 400. This cannot be specified if
     * the IPAddressProvisioningType is NoPublicIPAddresses.
     *
     * @return the inboundNatPools value.
     */
    @Generated
    public List<InboundNATPool> getInboundNatPools() {
        return this.inboundNatPools;
    }
}
