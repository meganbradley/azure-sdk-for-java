// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.containerservice.models.FleetMemberProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a Fleet member. */
@Fluent
public final class FleetMemberProperties {
    /*
     * The ARM resource id of the cluster that joins the Fleet. Must be a valid Azure resource id. e.g.:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{clusterName}'.
     */
    @JsonProperty(value = "clusterResourceId")
    private String clusterResourceId;

    /*
     * The provisioning state of the last accepted operation.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private FleetMemberProvisioningState provisioningState;

    /** Creates an instance of FleetMemberProperties class. */
    public FleetMemberProperties() {
    }

    /**
     * Get the clusterResourceId property: The ARM resource id of the cluster that joins the Fleet. Must be a valid
     * Azure resource id. e.g.:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{clusterName}'.
     *
     * @return the clusterResourceId value.
     */
    public String clusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * Set the clusterResourceId property: The ARM resource id of the cluster that joins the Fleet. Must be a valid
     * Azure resource id. e.g.:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ContainerService/managedClusters/{clusterName}'.
     *
     * @param clusterResourceId the clusterResourceId value to set.
     * @return the FleetMemberProperties object itself.
     */
    public FleetMemberProperties withClusterResourceId(String clusterResourceId) {
        this.clusterResourceId = clusterResourceId;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the last accepted operation.
     *
     * @return the provisioningState value.
     */
    public FleetMemberProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
