// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Gets or sets the resource settings. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "resourceType",
    defaultImpl = ResourceSettings.class)
@JsonTypeName("ResourceSettings")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Microsoft.Compute/virtualMachines", value = VirtualMachineResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Compute/availabilitySets", value = AvailabilitySetResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Network/virtualNetworks", value = VirtualNetworkResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Network/networkInterfaces", value = NetworkInterfaceResourceSettings.class),
    @JsonSubTypes.Type(
        name = "Microsoft.Network/networkSecurityGroups",
        value = NetworkSecurityGroupResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Network/loadBalancers", value = LoadBalancerResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/servers", value = SqlServerResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/servers/elasticPools", value = SqlElasticPoolResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Sql/servers/databases", value = SqlDatabaseResourceSettings.class),
    @JsonSubTypes.Type(name = "resourceGroups", value = ResourceGroupResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Network/publicIPAddresses", value = PublicIpAddressResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.KeyVault/vaults", value = KeyVaultResourceSettings.class),
    @JsonSubTypes.Type(name = "Microsoft.Compute/diskEncryptionSets", value = DiskEncryptionSetResourceSettings.class)
})
@Fluent
public class ResourceSettings {
    /*
     * Gets or sets the target Resource name.
     */
    @JsonProperty(value = "targetResourceName")
    private String targetResourceName;

    /*
     * Gets or sets the target resource group name.
     */
    @JsonProperty(value = "targetResourceGroupName")
    private String targetResourceGroupName;

    /** Creates an instance of ResourceSettings class. */
    public ResourceSettings() {
    }

    /**
     * Get the targetResourceName property: Gets or sets the target Resource name.
     *
     * @return the targetResourceName value.
     */
    public String targetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Set the targetResourceName property: Gets or sets the target Resource name.
     *
     * @param targetResourceName the targetResourceName value to set.
     * @return the ResourceSettings object itself.
     */
    public ResourceSettings withTargetResourceName(String targetResourceName) {
        this.targetResourceName = targetResourceName;
        return this;
    }

    /**
     * Get the targetResourceGroupName property: Gets or sets the target resource group name.
     *
     * @return the targetResourceGroupName value.
     */
    public String targetResourceGroupName() {
        return this.targetResourceGroupName;
    }

    /**
     * Set the targetResourceGroupName property: Gets or sets the target resource group name.
     *
     * @param targetResourceGroupName the targetResourceGroupName value to set.
     * @return the ResourceSettings object itself.
     */
    public ResourceSettings withTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
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
