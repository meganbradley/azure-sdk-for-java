// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.RoleInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.ProvisioningState;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.Role;

public final class RoleImpl implements Role, Role.Definition {
    private RoleInner innerObject;

    private final com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager;

    RoleImpl(
        RoleInner innerObject,
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String password() {
        return this.innerModel().password();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public RoleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String roleName;

    public RoleImpl withExistingServerGroupsv2(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public Role create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoles()
                .create(resourceGroupName, clusterName, roleName, this.innerModel(), Context.NONE);
        return this;
    }

    public Role create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoles()
                .create(resourceGroupName, clusterName, roleName, this.innerModel(), context);
        return this;
    }

    RoleImpl(String name, com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager serviceManager) {
        this.innerObject = new RoleInner();
        this.serviceManager = serviceManager;
        this.roleName = name;
    }

    public Role refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoles()
                .getWithResponse(resourceGroupName, clusterName, roleName, Context.NONE)
                .getValue();
        return this;
    }

    public Role refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoles()
                .getWithResponse(resourceGroupName, clusterName, roleName, context)
                .getValue();
        return this;
    }

    public RoleImpl withPassword(String password) {
        this.innerModel().withPassword(password);
        return this;
    }
}
