// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.InboundNatPool;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the load balancer.
 */
@Fluent
public final class LoadBalancerPropertiesFormat {
    /*
     * Object representing the frontend IPs to be used for the load balancer.
     */
    @JsonProperty(value = "frontendIPConfigurations")
    private List<FrontendIpConfigurationInner> frontendIpConfigurations;

    /*
     * Collection of backend address pools used by a load balancer.
     */
    @JsonProperty(value = "backendAddressPools")
    private List<BackendAddressPoolInner> backendAddressPools;

    /*
     * Object collection representing the load balancing rules Gets the provisioning.
     */
    @JsonProperty(value = "loadBalancingRules")
    private List<LoadBalancingRuleInner> loadBalancingRules;

    /*
     * Collection of probe objects used in the load balancer.
     */
    @JsonProperty(value = "probes")
    private List<ProbeInner> probes;

    /*
     * Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT rules on your load balancer is
     * mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are referenced from virtual machine
     * scale sets. NICs that are associated with individual virtual machines cannot reference an Inbound NAT pool. They
     * have to reference individual inbound NAT rules.
     */
    @JsonProperty(value = "inboundNatRules")
    private List<InboundNatRuleInner> inboundNatRules;

    /*
     * Defines an external port range for inbound NAT to a single backend port on NICs associated with a load balancer.
     * Inbound NAT rules are created automatically for each NIC associated with the Load Balancer using an external
     * port from this range. Defining an Inbound NAT pool on your Load Balancer is mutually exclusive with defining
     * inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale sets. NICs that are associated
     * with individual virtual machines cannot reference an inbound NAT pool. They have to reference individual inbound
     * NAT rules.
     */
    @JsonProperty(value = "inboundNatPools")
    private List<InboundNatPool> inboundNatPools;

    /*
     * The outbound rules.
     */
    @JsonProperty(value = "outboundRules")
    private List<OutboundRuleInner> outboundRules;

    /*
     * The resource GUID property of the load balancer resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the load balancer resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of LoadBalancerPropertiesFormat class.
     */
    public LoadBalancerPropertiesFormat() {
    }

    /**
     * Get the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load
     * balancer.
     * 
     * @return the frontendIpConfigurations value.
     */
    public List<FrontendIpConfigurationInner> frontendIpConfigurations() {
        return this.frontendIpConfigurations;
    }

    /**
     * Set the frontendIpConfigurations property: Object representing the frontend IPs to be used for the load
     * balancer.
     * 
     * @param frontendIpConfigurations the frontendIpConfigurations value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat
        withFrontendIpConfigurations(List<FrontendIpConfigurationInner> frontendIpConfigurations) {
        this.frontendIpConfigurations = frontendIpConfigurations;
        return this;
    }

    /**
     * Get the backendAddressPools property: Collection of backend address pools used by a load balancer.
     * 
     * @return the backendAddressPools value.
     */
    public List<BackendAddressPoolInner> backendAddressPools() {
        return this.backendAddressPools;
    }

    /**
     * Set the backendAddressPools property: Collection of backend address pools used by a load balancer.
     * 
     * @param backendAddressPools the backendAddressPools value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withBackendAddressPools(List<BackendAddressPoolInner> backendAddressPools) {
        this.backendAddressPools = backendAddressPools;
        return this;
    }

    /**
     * Get the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     * 
     * @return the loadBalancingRules value.
     */
    public List<LoadBalancingRuleInner> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Set the loadBalancingRules property: Object collection representing the load balancing rules Gets the
     * provisioning.
     * 
     * @param loadBalancingRules the loadBalancingRules value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withLoadBalancingRules(List<LoadBalancingRuleInner> loadBalancingRules) {
        this.loadBalancingRules = loadBalancingRules;
        return this;
    }

    /**
     * Get the probes property: Collection of probe objects used in the load balancer.
     * 
     * @return the probes value.
     */
    public List<ProbeInner> probes() {
        return this.probes;
    }

    /**
     * Set the probes property: Collection of probe objects used in the load balancer.
     * 
     * @param probes the probes value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withProbes(List<ProbeInner> probes) {
        this.probes = probes;
        return this;
    }

    /**
     * Get the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     * @return the inboundNatRules value.
     */
    public List<InboundNatRuleInner> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * Set the inboundNatRules property: Collection of inbound NAT Rules used by a load balancer. Defining inbound NAT
     * rules on your load balancer is mutually exclusive with defining an inbound NAT pool. Inbound NAT pools are
     * referenced from virtual machine scale sets. NICs that are associated with individual virtual machines cannot
     * reference an Inbound NAT pool. They have to reference individual inbound NAT rules.
     * 
     * @param inboundNatRules the inboundNatRules value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withInboundNatRules(List<InboundNatRuleInner> inboundNatRules) {
        this.inboundNatRules = inboundNatRules;
        return this;
    }

    /**
     * Get the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on
     * NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with
     * the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     * 
     * @return the inboundNatPools value.
     */
    public List<InboundNatPool> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the inboundNatPools property: Defines an external port range for inbound NAT to a single backend port on
     * NICs associated with a load balancer. Inbound NAT rules are created automatically for each NIC associated with
     * the Load Balancer using an external port from this range. Defining an Inbound NAT pool on your Load Balancer is
     * mutually exclusive with defining inbound NAT rules. Inbound NAT pools are referenced from virtual machine scale
     * sets. NICs that are associated with individual virtual machines cannot reference an inbound NAT pool. They have
     * to reference individual inbound NAT rules.
     * 
     * @param inboundNatPools the inboundNatPools value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
        return this;
    }

    /**
     * Get the outboundRules property: The outbound rules.
     * 
     * @return the outboundRules value.
     */
    public List<OutboundRuleInner> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Set the outboundRules property: The outbound rules.
     * 
     * @param outboundRules the outboundRules value to set.
     * @return the LoadBalancerPropertiesFormat object itself.
     */
    public LoadBalancerPropertiesFormat withOutboundRules(List<OutboundRuleInner> outboundRules) {
        this.outboundRules = outboundRules;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the load balancer resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the load balancer resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (frontendIpConfigurations() != null) {
            frontendIpConfigurations().forEach(e -> e.validate());
        }
        if (backendAddressPools() != null) {
            backendAddressPools().forEach(e -> e.validate());
        }
        if (loadBalancingRules() != null) {
            loadBalancingRules().forEach(e -> e.validate());
        }
        if (probes() != null) {
            probes().forEach(e -> e.validate());
        }
        if (inboundNatRules() != null) {
            inboundNatRules().forEach(e -> e.validate());
        }
        if (inboundNatPools() != null) {
            inboundNatPools().forEach(e -> e.validate());
        }
        if (outboundRules() != null) {
            outboundRules().forEach(e -> e.validate());
        }
    }
}
