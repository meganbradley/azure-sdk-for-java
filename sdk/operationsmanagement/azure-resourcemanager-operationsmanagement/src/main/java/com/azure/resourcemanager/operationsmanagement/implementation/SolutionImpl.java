// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.operationsmanagement.fluent.models.SolutionInner;
import com.azure.resourcemanager.operationsmanagement.models.Solution;
import com.azure.resourcemanager.operationsmanagement.models.SolutionPatch;
import com.azure.resourcemanager.operationsmanagement.models.SolutionPlan;
import com.azure.resourcemanager.operationsmanagement.models.SolutionProperties;
import java.util.Collections;
import java.util.Map;

public final class SolutionImpl implements Solution, Solution.Definition, Solution.Update {
    private SolutionInner innerObject;

    private final com.azure.resourcemanager.operationsmanagement.OperationsManagementManager serviceManager;

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

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SolutionPlan plan() {
        return this.innerModel().plan();
    }

    public SolutionProperties properties() {
        return this.innerModel().properties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public SolutionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.operationsmanagement.OperationsManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String solutionName;

    private SolutionPatch updateParameters;

    public SolutionImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Solution create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSolutions()
                .createOrUpdate(resourceGroupName, solutionName, this.innerModel(), Context.NONE);
        return this;
    }

    public Solution create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSolutions()
                .createOrUpdate(resourceGroupName, solutionName, this.innerModel(), context);
        return this;
    }

    SolutionImpl(
        String name, com.azure.resourcemanager.operationsmanagement.OperationsManagementManager serviceManager) {
        this.innerObject = new SolutionInner();
        this.serviceManager = serviceManager;
        this.solutionName = name;
    }

    public SolutionImpl update() {
        this.updateParameters = new SolutionPatch();
        return this;
    }

    public Solution apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSolutions()
                .update(resourceGroupName, solutionName, updateParameters, Context.NONE);
        return this;
    }

    public Solution apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSolutions()
                .update(resourceGroupName, solutionName, updateParameters, context);
        return this;
    }

    SolutionImpl(
        SolutionInner innerObject,
        com.azure.resourcemanager.operationsmanagement.OperationsManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.solutionName = Utils.getValueFromIdByName(innerObject.id(), "solutions");
    }

    public Solution refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSolutions()
                .getByResourceGroupWithResponse(resourceGroupName, solutionName, Context.NONE)
                .getValue();
        return this;
    }

    public Solution refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getSolutions()
                .getByResourceGroupWithResponse(resourceGroupName, solutionName, context)
                .getValue();
        return this;
    }

    public SolutionImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public SolutionImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public SolutionImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public SolutionImpl withPlan(SolutionPlan plan) {
        this.innerModel().withPlan(plan);
        return this;
    }

    public SolutionImpl withProperties(SolutionProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
