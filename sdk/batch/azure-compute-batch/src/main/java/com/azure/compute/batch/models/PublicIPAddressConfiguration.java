// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The public IP Address configuration of the networking configuration of a Pool. */
@Fluent
public final class PublicIPAddressConfiguration {

    /*
     * The default value is BatchManaged.
     */
    @JsonProperty(value = "provision")
    private IPAddressProvisioningType provision;

    /*
     * The number of IPs specified here limits the maximum size of the Pool - 100
     * dedicated nodes or 100 Spot/Low-priority nodes can be allocated for each public
     * IP. For example, a pool needing 250 dedicated VMs would need at least 3 public
     * IPs specified. Each element of this collection is of the form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     */
    @JsonProperty(value = "ipAddressIds")
    private List<String> ipAddressIds;

    /** Creates an instance of PublicIPAddressConfiguration class. */
    public PublicIPAddressConfiguration() {}

    /**
     * Get the provision property: The default value is BatchManaged.
     *
     * @return the provision value.
     */
    public IPAddressProvisioningType getProvision() {
        return this.provision;
    }

    /**
     * Set the provision property: The default value is BatchManaged.
     *
     * @param provision the provision value to set.
     * @return the PublicIPAddressConfiguration object itself.
     */
    public PublicIPAddressConfiguration setProvision(IPAddressProvisioningType provision) {
        this.provision = provision;
        return this;
    }

    /**
     * Get the ipAddressIds property: The number of IPs specified here limits the maximum size of the Pool - 100
     * dedicated nodes or 100 Spot/Low-priority nodes can be allocated for each public IP. For example, a pool needing
     * 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     *
     * @return the ipAddressIds value.
     */
    public List<String> getIpAddressIds() {
        return this.ipAddressIds;
    }

    /**
     * Set the ipAddressIds property: The number of IPs specified here limits the maximum size of the Pool - 100
     * dedicated nodes or 100 Spot/Low-priority nodes can be allocated for each public IP. For example, a pool needing
     * 250 dedicated VMs would need at least 3 public IPs specified. Each element of this collection is of the form:
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/Microsoft.Network/publicIPAddresses/{ip}.
     *
     * @param ipAddressIds the ipAddressIds value to set.
     * @return the PublicIPAddressConfiguration object itself.
     */
    public PublicIPAddressConfiguration setIpAddressIds(List<String> ipAddressIds) {
        this.ipAddressIds = ipAddressIds;
        return this;
    }
}
