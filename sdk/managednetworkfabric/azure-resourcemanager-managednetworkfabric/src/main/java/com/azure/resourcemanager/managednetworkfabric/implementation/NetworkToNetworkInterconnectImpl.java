// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkToNetworkInterconnectInner;
import com.azure.resourcemanager.managednetworkfabric.models.AdministrativeState;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.CommonPostActionResponseForStateUpdate;
import com.azure.resourcemanager.managednetworkfabric.models.ConfigurationState;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicyInformation;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicyInformation;
import com.azure.resourcemanager.managednetworkfabric.models.IsManagementType;
import com.azure.resourcemanager.managednetworkfabric.models.Layer2Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkToNetworkInterconnect;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkToNetworkInterconnectPatch;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NniType;
import com.azure.resourcemanager.managednetworkfabric.models.NpbStaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.OptionBLayer3Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.UpdateAdministrativeState;

public final class NetworkToNetworkInterconnectImpl
    implements NetworkToNetworkInterconnect,
        NetworkToNetworkInterconnect.Definition,
        NetworkToNetworkInterconnect.Update {
    private NetworkToNetworkInterconnectInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public NniType nniType() {
        return this.innerModel().nniType();
    }

    public IsManagementType isManagementType() {
        return this.innerModel().isManagementType();
    }

    public BooleanEnumProperty useOptionB() {
        return this.innerModel().useOptionB();
    }

    public Layer2Configuration layer2Configuration() {
        return this.innerModel().layer2Configuration();
    }

    public NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration optionBLayer3Configuration() {
        return this.innerModel().optionBLayer3Configuration();
    }

    public NpbStaticRouteConfiguration npbStaticRouteConfiguration() {
        return this.innerModel().npbStaticRouteConfiguration();
    }

    public ImportRoutePolicyInformation importRoutePolicy() {
        return this.innerModel().importRoutePolicy();
    }

    public ExportRoutePolicyInformation exportRoutePolicy() {
        return this.innerModel().exportRoutePolicy();
    }

    public String egressAclId() {
        return this.innerModel().egressAclId();
    }

    public String ingressAclId() {
        return this.innerModel().ingressAclId();
    }

    public ConfigurationState configurationState() {
        return this.innerModel().configurationState();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public AdministrativeState administrativeState() {
        return this.innerModel().administrativeState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NetworkToNetworkInterconnectInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkFabricName;

    private String networkToNetworkInterconnectName;

    private NetworkToNetworkInterconnectPatch updateBody;

    public NetworkToNetworkInterconnectImpl withExistingNetworkFabric(
        String resourceGroupName, String networkFabricName) {
        this.resourceGroupName = resourceGroupName;
        this.networkFabricName = networkFabricName;
        return this;
    }

    public NetworkToNetworkInterconnect create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .create(
                    resourceGroupName,
                    networkFabricName,
                    networkToNetworkInterconnectName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public NetworkToNetworkInterconnect create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .create(
                    resourceGroupName, networkFabricName, networkToNetworkInterconnectName, this.innerModel(), context);
        return this;
    }

    NetworkToNetworkInterconnectImpl(
        String name, com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = new NetworkToNetworkInterconnectInner();
        this.serviceManager = serviceManager;
        this.networkToNetworkInterconnectName = name;
    }

    public NetworkToNetworkInterconnectImpl update() {
        this.updateBody = new NetworkToNetworkInterconnectPatch();
        return this;
    }

    public NetworkToNetworkInterconnect apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .update(
                    resourceGroupName, networkFabricName, networkToNetworkInterconnectName, updateBody, Context.NONE);
        return this;
    }

    public NetworkToNetworkInterconnect apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .update(resourceGroupName, networkFabricName, networkToNetworkInterconnectName, updateBody, context);
        return this;
    }

    NetworkToNetworkInterconnectImpl(
        NetworkToNetworkInterconnectInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkFabricName = Utils.getValueFromIdByName(innerObject.id(), "networkFabrics");
        this.networkToNetworkInterconnectName =
            Utils.getValueFromIdByName(innerObject.id(), "networkToNetworkInterconnects");
    }

    public NetworkToNetworkInterconnect refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .getWithResponse(resourceGroupName, networkFabricName, networkToNetworkInterconnectName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkToNetworkInterconnect refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .getWithResponse(resourceGroupName, networkFabricName, networkToNetworkInterconnectName, context)
                .getValue();
        return this;
    }

    public CommonPostActionResponseForStateUpdate updateNpbStaticRouteBfdAdministrativeState(
        UpdateAdministrativeState body) {
        return serviceManager
            .networkToNetworkInterconnects()
            .updateNpbStaticRouteBfdAdministrativeState(
                resourceGroupName, networkFabricName, networkToNetworkInterconnectName, body);
    }

    public CommonPostActionResponseForStateUpdate updateNpbStaticRouteBfdAdministrativeState(
        UpdateAdministrativeState body, Context context) {
        return serviceManager
            .networkToNetworkInterconnects()
            .updateNpbStaticRouteBfdAdministrativeState(
                resourceGroupName, networkFabricName, networkToNetworkInterconnectName, body, context);
    }

    public CommonPostActionResponseForStateUpdate updateAdministrativeState(UpdateAdministrativeState body) {
        return serviceManager
            .networkToNetworkInterconnects()
            .updateAdministrativeState(resourceGroupName, networkFabricName, networkToNetworkInterconnectName, body);
    }

    public CommonPostActionResponseForStateUpdate updateAdministrativeState(
        UpdateAdministrativeState body, Context context) {
        return serviceManager
            .networkToNetworkInterconnects()
            .updateAdministrativeState(
                resourceGroupName, networkFabricName, networkToNetworkInterconnectName, body, context);
    }

    public NetworkToNetworkInterconnectImpl withUseOptionB(BooleanEnumProperty useOptionB) {
        this.innerModel().withUseOptionB(useOptionB);
        return this;
    }

    public NetworkToNetworkInterconnectImpl withNniType(NniType nniType) {
        this.innerModel().withNniType(nniType);
        return this;
    }

    public NetworkToNetworkInterconnectImpl withIsManagementType(IsManagementType isManagementType) {
        this.innerModel().withIsManagementType(isManagementType);
        return this;
    }

    public NetworkToNetworkInterconnectImpl withLayer2Configuration(Layer2Configuration layer2Configuration) {
        if (isInCreateMode()) {
            this.innerModel().withLayer2Configuration(layer2Configuration);
            return this;
        } else {
            this.updateBody.withLayer2Configuration(layer2Configuration);
            return this;
        }
    }

    public NetworkToNetworkInterconnectImpl withOptionBLayer3Configuration(
        NetworkToNetworkInterconnectPropertiesOptionBLayer3Configuration optionBLayer3Configuration) {
        this.innerModel().withOptionBLayer3Configuration(optionBLayer3Configuration);
        return this;
    }

    public NetworkToNetworkInterconnectImpl withNpbStaticRouteConfiguration(
        NpbStaticRouteConfiguration npbStaticRouteConfiguration) {
        if (isInCreateMode()) {
            this.innerModel().withNpbStaticRouteConfiguration(npbStaticRouteConfiguration);
            return this;
        } else {
            this.updateBody.withNpbStaticRouteConfiguration(npbStaticRouteConfiguration);
            return this;
        }
    }

    public NetworkToNetworkInterconnectImpl withImportRoutePolicy(ImportRoutePolicyInformation importRoutePolicy) {
        if (isInCreateMode()) {
            this.innerModel().withImportRoutePolicy(importRoutePolicy);
            return this;
        } else {
            this.updateBody.withImportRoutePolicy(importRoutePolicy);
            return this;
        }
    }

    public NetworkToNetworkInterconnectImpl withExportRoutePolicy(ExportRoutePolicyInformation exportRoutePolicy) {
        if (isInCreateMode()) {
            this.innerModel().withExportRoutePolicy(exportRoutePolicy);
            return this;
        } else {
            this.updateBody.withExportRoutePolicy(exportRoutePolicy);
            return this;
        }
    }

    public NetworkToNetworkInterconnectImpl withEgressAclId(String egressAclId) {
        if (isInCreateMode()) {
            this.innerModel().withEgressAclId(egressAclId);
            return this;
        } else {
            this.updateBody.withEgressAclId(egressAclId);
            return this;
        }
    }

    public NetworkToNetworkInterconnectImpl withIngressAclId(String ingressAclId) {
        if (isInCreateMode()) {
            this.innerModel().withIngressAclId(ingressAclId);
            return this;
        } else {
            this.updateBody.withIngressAclId(ingressAclId);
            return this;
        }
    }

    public NetworkToNetworkInterconnectImpl withOptionBLayer3Configuration(
        OptionBLayer3Configuration optionBLayer3Configuration) {
        this.updateBody.withOptionBLayer3Configuration(optionBLayer3Configuration);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
