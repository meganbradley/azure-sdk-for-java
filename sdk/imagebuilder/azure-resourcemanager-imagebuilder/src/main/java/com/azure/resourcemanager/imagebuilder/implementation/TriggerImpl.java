// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.imagebuilder.fluent.models.TriggerInner;
import com.azure.resourcemanager.imagebuilder.models.Trigger;
import com.azure.resourcemanager.imagebuilder.models.TriggerProperties;

public final class TriggerImpl implements Trigger, Trigger.Definition, Trigger.Update {
    private TriggerInner innerObject;

    private final com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public TriggerProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public TriggerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.imagebuilder.ImageBuilderManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String imageTemplateName;

    private String triggerName;

    public TriggerImpl withExistingImageTemplate(String resourceGroupName, String imageTemplateName) {
        this.resourceGroupName = resourceGroupName;
        this.imageTemplateName = imageTemplateName;
        return this;
    }

    public Trigger create() {
        this.innerObject = serviceManager.serviceClient().getTriggers().createOrUpdate(resourceGroupName,
            imageTemplateName, triggerName, this.innerModel(), Context.NONE);
        return this;
    }

    public Trigger create(Context context) {
        this.innerObject = serviceManager.serviceClient().getTriggers().createOrUpdate(resourceGroupName,
            imageTemplateName, triggerName, this.innerModel(), context);
        return this;
    }

    TriggerImpl(String name, com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager) {
        this.innerObject = new TriggerInner();
        this.serviceManager = serviceManager;
        this.triggerName = name;
    }

    public TriggerImpl update() {
        return this;
    }

    public Trigger apply() {
        this.innerObject = serviceManager.serviceClient().getTriggers().createOrUpdate(resourceGroupName,
            imageTemplateName, triggerName, this.innerModel(), Context.NONE);
        return this;
    }

    public Trigger apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getTriggers().createOrUpdate(resourceGroupName,
            imageTemplateName, triggerName, this.innerModel(), context);
        return this;
    }

    TriggerImpl(TriggerInner innerObject, com.azure.resourcemanager.imagebuilder.ImageBuilderManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.imageTemplateName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "imageTemplates");
        this.triggerName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "triggers");
    }

    public Trigger refresh() {
        this.innerObject = serviceManager.serviceClient().getTriggers()
            .getWithResponse(resourceGroupName, imageTemplateName, triggerName, Context.NONE).getValue();
        return this;
    }

    public Trigger refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getTriggers()
            .getWithResponse(resourceGroupName, imageTemplateName, triggerName, context).getValue();
        return this;
    }

    public TriggerImpl withProperties(TriggerProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
