// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.synapse.fluent.models.AttachedDatabaseConfigurationInner;
import com.azure.resourcemanager.synapse.models.AttachedDatabaseConfiguration;
import com.azure.resourcemanager.synapse.models.DefaultPrincipalsModificationKind;
import com.azure.resourcemanager.synapse.models.ResourceProvisioningState;
import com.azure.resourcemanager.synapse.models.TableLevelSharingProperties;
import java.util.Collections;
import java.util.List;

public final class AttachedDatabaseConfigurationImpl
    implements AttachedDatabaseConfiguration,
        AttachedDatabaseConfiguration.Definition,
        AttachedDatabaseConfiguration.Update {
    private AttachedDatabaseConfigurationInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ResourceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public String kustoPoolResourceId() {
        return this.innerModel().kustoPoolResourceId();
    }

    public List<String> attachedDatabaseNames() {
        List<String> inner = this.innerModel().attachedDatabaseNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DefaultPrincipalsModificationKind defaultPrincipalsModificationKind() {
        return this.innerModel().defaultPrincipalsModificationKind();
    }

    public TableLevelSharingProperties tableLevelSharingProperties() {
        return this.innerModel().tableLevelSharingProperties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public AttachedDatabaseConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }

    private String workspaceName;

    private String kustoPoolName;

    private String attachedDatabaseConfigurationName;

    private String resourceGroupName;

    public AttachedDatabaseConfigurationImpl withExistingKustoPool(
        String workspaceName, String kustoPoolName, String resourceGroupName) {
        this.workspaceName = workspaceName;
        this.kustoPoolName = kustoPoolName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AttachedDatabaseConfiguration create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolAttachedDatabaseConfigurations()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    attachedDatabaseConfigurationName,
                    resourceGroupName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public AttachedDatabaseConfiguration create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolAttachedDatabaseConfigurations()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    attachedDatabaseConfigurationName,
                    resourceGroupName,
                    this.innerModel(),
                    context);
        return this;
    }

    AttachedDatabaseConfigurationImpl(String name, com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = new AttachedDatabaseConfigurationInner();
        this.serviceManager = serviceManager;
        this.attachedDatabaseConfigurationName = name;
    }

    public AttachedDatabaseConfigurationImpl update() {
        return this;
    }

    public AttachedDatabaseConfiguration apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolAttachedDatabaseConfigurations()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    attachedDatabaseConfigurationName,
                    resourceGroupName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public AttachedDatabaseConfiguration apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolAttachedDatabaseConfigurations()
                .createOrUpdate(
                    workspaceName,
                    kustoPoolName,
                    attachedDatabaseConfigurationName,
                    resourceGroupName,
                    this.innerModel(),
                    context);
        return this;
    }

    AttachedDatabaseConfigurationImpl(
        AttachedDatabaseConfigurationInner innerObject,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.workspaceName = Utils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.kustoPoolName = Utils.getValueFromIdByName(innerObject.id(), "kustoPools");
        this.attachedDatabaseConfigurationName =
            Utils.getValueFromIdByName(innerObject.id(), "attachedDatabaseConfigurations");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public AttachedDatabaseConfiguration refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolAttachedDatabaseConfigurations()
                .getWithResponse(
                    workspaceName, kustoPoolName, attachedDatabaseConfigurationName, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public AttachedDatabaseConfiguration refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getKustoPoolAttachedDatabaseConfigurations()
                .getWithResponse(
                    workspaceName, kustoPoolName, attachedDatabaseConfigurationName, resourceGroupName, context)
                .getValue();
        return this;
    }

    public AttachedDatabaseConfigurationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AttachedDatabaseConfigurationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AttachedDatabaseConfigurationImpl withDatabaseName(String databaseName) {
        this.innerModel().withDatabaseName(databaseName);
        return this;
    }

    public AttachedDatabaseConfigurationImpl withKustoPoolResourceId(String kustoPoolResourceId) {
        this.innerModel().withKustoPoolResourceId(kustoPoolResourceId);
        return this;
    }

    public AttachedDatabaseConfigurationImpl withDefaultPrincipalsModificationKind(
        DefaultPrincipalsModificationKind defaultPrincipalsModificationKind) {
        this.innerModel().withDefaultPrincipalsModificationKind(defaultPrincipalsModificationKind);
        return this;
    }

    public AttachedDatabaseConfigurationImpl withTableLevelSharingProperties(
        TableLevelSharingProperties tableLevelSharingProperties) {
        this.innerModel().withTableLevelSharingProperties(tableLevelSharingProperties);
        return this;
    }
}
