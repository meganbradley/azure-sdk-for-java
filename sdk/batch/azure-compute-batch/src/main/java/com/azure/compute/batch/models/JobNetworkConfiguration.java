// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The network configuration for the Job. */
@Immutable
public final class JobNetworkConfiguration {

    /*
     * The virtual network must be in the same region and subscription as the Azure Batch Account. The specified subnet
     * should have enough free IP addresses to accommodate the number of Compute Nodes which will run Tasks from the
     * Job. This can be up to the number of Compute Nodes in the Pool. The 'MicrosoftAzureBatch' service principal must
     * have the 'Classic Virtual Machine Contributor'
     * Role-Based Access Control (RBAC) role for the specified VNet so that Azure Batch service can schedule Tasks on
     * the Nodes. This can be verified by checking if the specified VNet has any associated Network Security Groups
     * (NSG). If communication to the Nodes in the specified subnet is denied by an NSG, then the Batch service will
     * set the state of the Compute Nodes to unusable. This is
     * of the form
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/{provider}/virtualNetworks/{network}/subnets/{subnet}.
     * If the specified VNet has any associated Network Security Groups (NSG), then a
     * few reserved system ports must be enabled for inbound communication from the Azure Batch service. For Pools
     * created with a Virtual Machine configuration, enable ports 29876 and 29877, as well as port 22 for Linux and
     * port 3389 for Windows. Port 443 is also required to be open for outbound connections for communications to Azure
     * Storage. For more details see:
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration
     */
    @JsonProperty(value = "subnetId", required = true)
    private String subnetId;

    /**
     * Creates an instance of JobNetworkConfiguration class.
     *
     * @param subnetId the subnetId value to set.
     */
    @JsonCreator
    public JobNetworkConfiguration(@JsonProperty(value = "subnetId", required = true) String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * Get the subnetId property: The virtual network must be in the same region and subscription as the Azure Batch
     * Account. The specified subnet should have enough free IP addresses to accommodate the number of Compute Nodes
     * which will run Tasks from the Job. This can be up to the number of Compute Nodes in the Pool. The
     * 'MicrosoftAzureBatch' service principal must have the 'Classic Virtual Machine Contributor' Role-Based Access
     * Control (RBAC) role for the specified VNet so that Azure Batch service can schedule Tasks on the Nodes. This can
     * be verified by checking if the specified VNet has any associated Network Security Groups (NSG). If communication
     * to the Nodes in the specified subnet is denied by an NSG, then the Batch service will set the state of the
     * Compute Nodes to unusable. This is of the form
     * /subscriptions/{subscription}/resourceGroups/{group}/providers/{provider}/virtualNetworks/{network}/subnets/{subnet}.
     * If the specified VNet has any associated Network Security Groups (NSG), then a few reserved system ports must be
     * enabled for inbound communication from the Azure Batch service. For Pools created with a Virtual Machine
     * configuration, enable ports 29876 and 29877, as well as port 22 for Linux and port 3389 for Windows. Port 443 is
     * also required to be open for outbound connections for communications to Azure Storage. For more details see:
     * https://docs.microsoft.com/en-us/azure/batch/batch-api-basics#virtual-network-vnet-and-firewall-configuration.
     *
     * @return the subnetId value.
     */
    public String getSubnetId() {
        return this.subnetId;
    }
}
