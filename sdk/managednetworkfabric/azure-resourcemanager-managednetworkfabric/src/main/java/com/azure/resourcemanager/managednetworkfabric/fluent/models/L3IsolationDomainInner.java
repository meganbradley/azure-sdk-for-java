// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.AggregateRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationState;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnetRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeConnectedSubnets;
import com.azure.resourcemanager.managednetworkfabric.models.RedistributeStaticRoutes;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The L3 Isolation Domain resource definition. */
@Fluent
public final class L3IsolationDomainInner extends Resource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties", required = true)
    private L3IsolationDomainProperties innerProperties = new L3IsolationDomainProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of L3IsolationDomainInner class. */
    public L3IsolationDomainInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     *
     * @return the innerProperties value.
     */
    private L3IsolationDomainProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public L3IsolationDomainInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public L3IsolationDomainInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the networkFabricId property: ARM Resource ID of the Network Fabric.
     *
     * @return the networkFabricId value.
     */
    public String networkFabricId() {
        return this.innerProperties() == null ? null : this.innerProperties().networkFabricId();
    }

    /**
     * Set the networkFabricId property: ARM Resource ID of the Network Fabric.
     *
     * @param networkFabricId the networkFabricId value to set.
     * @return the L3IsolationDomainInner object itself.
     */
    public L3IsolationDomainInner withNetworkFabricId(String networkFabricId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3IsolationDomainProperties();
        }
        this.innerProperties().withNetworkFabricId(networkFabricId);
        return this;
    }

    /**
     * Get the configurationState property: Configuration state of the resource.
     *
     * @return the configurationState value.
     */
    public ConfigurationState configurationState() {
        return this.innerProperties() == null ? null : this.innerProperties().configurationState();
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    public AdministrativeState administrativeState() {
        return this.innerProperties() == null ? null : this.innerProperties().administrativeState();
    }

    /**
     * Get the redistributeConnectedSubnets property: Advertise Connected Subnets. Ex: "True" | "False".
     *
     * @return the redistributeConnectedSubnets value.
     */
    public RedistributeConnectedSubnets redistributeConnectedSubnets() {
        return this.innerProperties() == null ? null : this.innerProperties().redistributeConnectedSubnets();
    }

    /**
     * Set the redistributeConnectedSubnets property: Advertise Connected Subnets. Ex: "True" | "False".
     *
     * @param redistributeConnectedSubnets the redistributeConnectedSubnets value to set.
     * @return the L3IsolationDomainInner object itself.
     */
    public L3IsolationDomainInner withRedistributeConnectedSubnets(
        RedistributeConnectedSubnets redistributeConnectedSubnets) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3IsolationDomainProperties();
        }
        this.innerProperties().withRedistributeConnectedSubnets(redistributeConnectedSubnets);
        return this;
    }

    /**
     * Get the redistributeStaticRoutes property: Advertise Static Routes. Ex: "True" | "False".
     *
     * @return the redistributeStaticRoutes value.
     */
    public RedistributeStaticRoutes redistributeStaticRoutes() {
        return this.innerProperties() == null ? null : this.innerProperties().redistributeStaticRoutes();
    }

    /**
     * Set the redistributeStaticRoutes property: Advertise Static Routes. Ex: "True" | "False".
     *
     * @param redistributeStaticRoutes the redistributeStaticRoutes value to set.
     * @return the L3IsolationDomainInner object itself.
     */
    public L3IsolationDomainInner withRedistributeStaticRoutes(RedistributeStaticRoutes redistributeStaticRoutes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3IsolationDomainProperties();
        }
        this.innerProperties().withRedistributeStaticRoutes(redistributeStaticRoutes);
        return this;
    }

    /**
     * Get the aggregateRouteConfiguration property: Aggregate route configurations.
     *
     * @return the aggregateRouteConfiguration value.
     */
    public AggregateRouteConfiguration aggregateRouteConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().aggregateRouteConfiguration();
    }

    /**
     * Set the aggregateRouteConfiguration property: Aggregate route configurations.
     *
     * @param aggregateRouteConfiguration the aggregateRouteConfiguration value to set.
     * @return the L3IsolationDomainInner object itself.
     */
    public L3IsolationDomainInner withAggregateRouteConfiguration(
        AggregateRouteConfiguration aggregateRouteConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3IsolationDomainProperties();
        }
        this.innerProperties().withAggregateRouteConfiguration(aggregateRouteConfiguration);
        return this;
    }

    /**
     * Get the connectedSubnetRoutePolicy property: Connected Subnet RoutePolicy.
     *
     * @return the connectedSubnetRoutePolicy value.
     */
    public ConnectedSubnetRoutePolicy connectedSubnetRoutePolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().connectedSubnetRoutePolicy();
    }

    /**
     * Set the connectedSubnetRoutePolicy property: Connected Subnet RoutePolicy.
     *
     * @param connectedSubnetRoutePolicy the connectedSubnetRoutePolicy value to set.
     * @return the L3IsolationDomainInner object itself.
     */
    public L3IsolationDomainInner withConnectedSubnetRoutePolicy(
        ConnectedSubnetRoutePolicy connectedSubnetRoutePolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3IsolationDomainProperties();
        }
        this.innerProperties().withConnectedSubnetRoutePolicy(connectedSubnetRoutePolicy);
        return this;
    }

    /**
     * Get the annotation property: Switch configuration description.
     *
     * @return the annotation value.
     */
    public String annotation() {
        return this.innerProperties() == null ? null : this.innerProperties().annotation();
    }

    /**
     * Set the annotation property: Switch configuration description.
     *
     * @param annotation the annotation value to set.
     * @return the L3IsolationDomainInner object itself.
     */
    public L3IsolationDomainInner withAnnotation(String annotation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new L3IsolationDomainProperties();
        }
        this.innerProperties().withAnnotation(annotation);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model L3IsolationDomainInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(L3IsolationDomainInner.class);
}
