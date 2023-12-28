// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.GroupContractInner;
import com.azure.resourcemanager.apimanagement.models.GroupContract;
import com.azure.resourcemanager.apimanagement.models.GroupCreateParameters;
import com.azure.resourcemanager.apimanagement.models.GroupType;
import com.azure.resourcemanager.apimanagement.models.GroupUpdateParameters;

public final class GroupContractImpl implements GroupContract, GroupContract.Definition, GroupContract.Update {
    private GroupContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String description() {
        return this.innerModel().description();
    }

    public Boolean builtIn() {
        return this.innerModel().builtIn();
    }

    public GroupType typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public String externalId() {
        return this.innerModel().externalId();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public GroupContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String groupId;

    private String createIfMatch;

    private GroupCreateParameters createParameters;

    private String updateIfMatch;

    private GroupUpdateParameters updateParameters;

    public GroupContractImpl withExistingService(String resourceGroupName, String serviceName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        return this;
    }

    public GroupContract create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGroups()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, groupId, createParameters, createIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public GroupContract create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGroups()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, groupId, createParameters, createIfMatch, context)
                .getValue();
        return this;
    }

    GroupContractImpl(String name, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new GroupContractInner();
        this.serviceManager = serviceManager;
        this.groupId = name;
        this.createIfMatch = null;
        this.createParameters = new GroupCreateParameters();
    }

    public GroupContractImpl update() {
        this.updateIfMatch = null;
        this.updateParameters = new GroupUpdateParameters();
        return this;
    }

    public GroupContract apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGroups()
                .updateWithResponse(
                    resourceGroupName, serviceName, groupId, updateIfMatch, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public GroupContract apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGroups()
                .updateWithResponse(resourceGroupName, serviceName, groupId, updateIfMatch, updateParameters, context)
                .getValue();
        return this;
    }

    GroupContractImpl(
        GroupContractInner innerObject, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "service");
        this.groupId = Utils.getValueFromIdByName(innerObject.id(), "groups");
    }

    public GroupContract refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGroups()
                .getWithResponse(resourceGroupName, serviceName, groupId, Context.NONE)
                .getValue();
        return this;
    }

    public GroupContract refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getGroups()
                .getWithResponse(resourceGroupName, serviceName, groupId, context)
                .getValue();
        return this;
    }

    public GroupContractImpl withDisplayName(String displayName) {
        if (isInCreateMode()) {
            this.createParameters.withDisplayName(displayName);
            return this;
        } else {
            this.updateParameters.withDisplayName(displayName);
            return this;
        }
    }

    public GroupContractImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameters.withDescription(description);
            return this;
        } else {
            this.updateParameters.withDescription(description);
            return this;
        }
    }

    public GroupContractImpl withType(GroupType type) {
        if (isInCreateMode()) {
            this.createParameters.withType(type);
            return this;
        } else {
            this.updateParameters.withType(type);
            return this;
        }
    }

    public GroupContractImpl withExternalId(String externalId) {
        if (isInCreateMode()) {
            this.createParameters.withExternalId(externalId);
            return this;
        } else {
            this.updateParameters.withExternalId(externalId);
            return this;
        }
    }

    public GroupContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
