// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import com.azure.resourcemanager.cdn.models.EnabledState;
import com.azure.resourcemanager.cdn.models.HealthProbeParameters;
import com.azure.resourcemanager.cdn.models.LoadBalancingSettingsParameters;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON object that contains the properties of the origin group.
 */
@Fluent
public final class AfdOriginGroupProperties extends AfdOriginGroupUpdatePropertiesParameters {
    /*
     * Provisioning status
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /*
     * The deploymentStatus property.
     */
    @JsonProperty(value = "deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /**
     * Creates an instance of AfdOriginGroupProperties class.
     */
    public AfdOriginGroupProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning status.
     * 
     * @return the provisioningState value.
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     * 
     * @return the deploymentStatus value.
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfdOriginGroupProperties withLoadBalancingSettings(LoadBalancingSettingsParameters loadBalancingSettings) {
        super.withLoadBalancingSettings(loadBalancingSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfdOriginGroupProperties withHealthProbeSettings(HealthProbeParameters healthProbeSettings) {
        super.withHealthProbeSettings(healthProbeSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfdOriginGroupProperties withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
        Integer trafficRestorationTimeToHealedOrNewEndpointsInMinutes) {
        super.withTrafficRestorationTimeToHealedOrNewEndpointsInMinutes(
            trafficRestorationTimeToHealedOrNewEndpointsInMinutes);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfdOriginGroupProperties withSessionAffinityState(EnabledState sessionAffinityState) {
        super.withSessionAffinityState(sessionAffinityState);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
