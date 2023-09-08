// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationState;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicyInformation;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicyInformation;
import com.azure.resourcemanager.managednetworkfabric.models.IsManagementType;
import com.azure.resourcemanager.managednetworkfabric.models.Layer2Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NniType;
import com.azure.resourcemanager.managednetworkfabric.models.NpbStaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration used to setup CE-PE connectivity. */
@Fluent
public final class NetworkToNetworkInterconnectProperties {
    /*
     * Type of NNI used. Example: CE | NPB
     */
    @JsonProperty(value = "nniType")
    private NniType nniType;

    /*
     * Configuration to use NNI for Infrastructure Management. Example: True/False.
     */
    @JsonProperty(value = "isManagementType")
    private IsManagementType isManagementType;

    /*
     * Based on this option layer3 parameters are mandatory. Example: True/False
     */
    @JsonProperty(value = "useOptionB", required = true)
    private BooleanEnumProperty useOptionB;

    /*
     * Common properties for Layer2 Configuration.
     */
    @JsonProperty(value = "layer2Configuration")
    private Layer2Configuration layer2Configuration;

    /*
     * Common properties for Layer3Configuration.
     */
    @JsonProperty(value = "optionBLayer3Configuration")
    private NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration optionBLayer3Configuration;

    /*
     * NPB Static Route Configuration properties.
     */
    @JsonProperty(value = "npbStaticRouteConfiguration")
    private NpbStaticRouteConfiguration npbStaticRouteConfiguration;

    /*
     * Import Route Policy configuration.
     */
    @JsonProperty(value = "importRoutePolicy")
    private ImportRoutePolicyInformation importRoutePolicy;

    /*
     * Export Route Policy configuration.
     */
    @JsonProperty(value = "exportRoutePolicy")
    private ExportRoutePolicyInformation exportRoutePolicy;

    /*
     * Egress Acl. ARM resource ID of Access Control Lists.
     */
    @JsonProperty(value = "egressAclId")
    private String egressAclId;

    /*
     * Ingress Acl. ARM resource ID of Access Control Lists.
     */
    @JsonProperty(value = "ingressAclId")
    private String ingressAclId;

    /*
     * Configuration state of the resource.
     */
    @JsonProperty(value = "configurationState", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigurationState configurationState;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Administrative state of the resource.
     */
    @JsonProperty(value = "administrativeState", access = JsonProperty.Access.WRITE_ONLY)
    private AdministrativeState administrativeState;

    /** Creates an instance of NetworkToNetworkInterconnectProperties class. */
    public NetworkToNetworkInterconnectProperties() {
    }

    /**
     * Get the nniType property: Type of NNI used. Example: CE | NPB.
     *
     * @return the nniType value.
     */
    public NniType nniType() {
        return this.nniType;
    }

    /**
     * Set the nniType property: Type of NNI used. Example: CE | NPB.
     *
     * @param nniType the nniType value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withNniType(NniType nniType) {
        this.nniType = nniType;
        return this;
    }

    /**
     * Get the isManagementType property: Configuration to use NNI for Infrastructure Management. Example: True/False.
     *
     * @return the isManagementType value.
     */
    public IsManagementType isManagementType() {
        return this.isManagementType;
    }

    /**
     * Set the isManagementType property: Configuration to use NNI for Infrastructure Management. Example: True/False.
     *
     * @param isManagementType the isManagementType value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withIsManagementType(IsManagementType isManagementType) {
        this.isManagementType = isManagementType;
        return this;
    }

    /**
     * Get the useOptionB property: Based on this option layer3 parameters are mandatory. Example: True/False.
     *
     * @return the useOptionB value.
     */
    public BooleanEnumProperty useOptionB() {
        return this.useOptionB;
    }

    /**
     * Set the useOptionB property: Based on this option layer3 parameters are mandatory. Example: True/False.
     *
     * @param useOptionB the useOptionB value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withUseOptionB(BooleanEnumProperty useOptionB) {
        this.useOptionB = useOptionB;
        return this;
    }

    /**
     * Get the layer2Configuration property: Common properties for Layer2 Configuration.
     *
     * @return the layer2Configuration value.
     */
    public Layer2Configuration layer2Configuration() {
        return this.layer2Configuration;
    }

    /**
     * Set the layer2Configuration property: Common properties for Layer2 Configuration.
     *
     * @param layer2Configuration the layer2Configuration value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withLayer2Configuration(Layer2Configuration layer2Configuration) {
        this.layer2Configuration = layer2Configuration;
        return this;
    }

    /**
     * Get the optionBLayer3Configuration property: Common properties for Layer3Configuration.
     *
     * @return the optionBLayer3Configuration value.
     */
    public NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration optionBLayer3Configuration() {
        return this.optionBLayer3Configuration;
    }

    /**
     * Set the optionBLayer3Configuration property: Common properties for Layer3Configuration.
     *
     * @param optionBLayer3Configuration the optionBLayer3Configuration value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withOptionBLayer3Configuration(
        NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration optionBLayer3Configuration) {
        this.optionBLayer3Configuration = optionBLayer3Configuration;
        return this;
    }

    /**
     * Get the npbStaticRouteConfiguration property: NPB Static Route Configuration properties.
     *
     * @return the npbStaticRouteConfiguration value.
     */
    public NpbStaticRouteConfiguration npbStaticRouteConfiguration() {
        return this.npbStaticRouteConfiguration;
    }

    /**
     * Set the npbStaticRouteConfiguration property: NPB Static Route Configuration properties.
     *
     * @param npbStaticRouteConfiguration the npbStaticRouteConfiguration value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withNpbStaticRouteConfiguration(
        NpbStaticRouteConfiguration npbStaticRouteConfiguration) {
        this.npbStaticRouteConfiguration = npbStaticRouteConfiguration;
        return this;
    }

    /**
     * Get the importRoutePolicy property: Import Route Policy configuration.
     *
     * @return the importRoutePolicy value.
     */
    public ImportRoutePolicyInformation importRoutePolicy() {
        return this.importRoutePolicy;
    }

    /**
     * Set the importRoutePolicy property: Import Route Policy configuration.
     *
     * @param importRoutePolicy the importRoutePolicy value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withImportRoutePolicy(
        ImportRoutePolicyInformation importRoutePolicy) {
        this.importRoutePolicy = importRoutePolicy;
        return this;
    }

    /**
     * Get the exportRoutePolicy property: Export Route Policy configuration.
     *
     * @return the exportRoutePolicy value.
     */
    public ExportRoutePolicyInformation exportRoutePolicy() {
        return this.exportRoutePolicy;
    }

    /**
     * Set the exportRoutePolicy property: Export Route Policy configuration.
     *
     * @param exportRoutePolicy the exportRoutePolicy value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withExportRoutePolicy(
        ExportRoutePolicyInformation exportRoutePolicy) {
        this.exportRoutePolicy = exportRoutePolicy;
        return this;
    }

    /**
     * Get the egressAclId property: Egress Acl. ARM resource ID of Access Control Lists.
     *
     * @return the egressAclId value.
     */
    public String egressAclId() {
        return this.egressAclId;
    }

    /**
     * Set the egressAclId property: Egress Acl. ARM resource ID of Access Control Lists.
     *
     * @param egressAclId the egressAclId value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withEgressAclId(String egressAclId) {
        this.egressAclId = egressAclId;
        return this;
    }

    /**
     * Get the ingressAclId property: Ingress Acl. ARM resource ID of Access Control Lists.
     *
     * @return the ingressAclId value.
     */
    public String ingressAclId() {
        return this.ingressAclId;
    }

    /**
     * Set the ingressAclId property: Ingress Acl. ARM resource ID of Access Control Lists.
     *
     * @param ingressAclId the ingressAclId value to set.
     * @return the NetworkToNetworkInterconnectProperties object itself.
     */
    public NetworkToNetworkInterconnectProperties withIngressAclId(String ingressAclId) {
        this.ingressAclId = ingressAclId;
        return this;
    }

    /**
     * Get the configurationState property: Configuration state of the resource.
     *
     * @return the configurationState value.
     */
    public ConfigurationState configurationState() {
        return this.configurationState;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the administrativeState property: Administrative state of the resource.
     *
     * @return the administrativeState value.
     */
    public AdministrativeState administrativeState() {
        return this.administrativeState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (useOptionB() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property useOptionB in model NetworkToNetworkInterconnectProperties"));
        }
        if (layer2Configuration() != null) {
            layer2Configuration().validate();
        }
        if (optionBLayer3Configuration() != null) {
            optionBLayer3Configuration().validate();
        }
        if (npbStaticRouteConfiguration() != null) {
            npbStaticRouteConfiguration().validate();
        }
        if (importRoutePolicy() != null) {
            importRoutePolicy().validate();
        }
        if (exportRoutePolicy() != null) {
            exportRoutePolicy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetworkToNetworkInterconnectProperties.class);
}
