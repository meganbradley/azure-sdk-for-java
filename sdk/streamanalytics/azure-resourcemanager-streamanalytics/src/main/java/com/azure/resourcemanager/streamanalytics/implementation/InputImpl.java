// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.InputInner;
import com.azure.resourcemanager.streamanalytics.models.Input;
import com.azure.resourcemanager.streamanalytics.models.InputProperties;

public final class InputImpl implements Input, Input.Definition, Input.Update {
    private InputInner innerObject;

    private final com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public InputProperties properties() {
        return this.innerModel().properties();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public InputInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String jobName;

    private String inputName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    public InputImpl withExistingStreamingjob(String resourceGroupName, String jobName) {
        this.resourceGroupName = resourceGroupName;
        this.jobName = jobName;
        return this;
    }

    public Input create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInputs()
                .createOrReplaceWithResponse(
                    resourceGroupName,
                    jobName,
                    inputName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public Input create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInputs()
                .createOrReplaceWithResponse(
                    resourceGroupName, jobName, inputName, this.innerModel(), createIfMatch, createIfNoneMatch, context)
                .getValue();
        return this;
    }

    InputImpl(String name, com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = new InputInner();
        this.serviceManager = serviceManager;
        this.inputName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public InputImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public Input apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInputs()
                .updateWithResponse(
                    resourceGroupName, jobName, inputName, this.innerModel(), updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public Input apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInputs()
                .updateWithResponse(resourceGroupName, jobName, inputName, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    InputImpl(InputInner innerObject, com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.jobName = Utils.getValueFromIdByName(innerObject.id(), "streamingjobs");
        this.inputName = Utils.getValueFromIdByName(innerObject.id(), "inputs");
    }

    public Input refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInputs()
                .getWithResponse(resourceGroupName, jobName, inputName, Context.NONE)
                .getValue();
        return this;
    }

    public Input refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getInputs()
                .getWithResponse(resourceGroupName, jobName, inputName, context)
                .getValue();
        return this;
    }

    public InputImpl withProperties(InputProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }

    public InputImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public InputImpl withIfMatch(String ifMatch) {
        this.createIfMatch = ifMatch;
        return this;
    }

    public InputImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    public InputImpl ifMatch(String ifMatch) {
        this.updateIfMatch = ifMatch;
        return this;
    }
}
