// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.communication.fluent.models.CommunicationServiceResourceInner;
import com.azure.resourcemanager.communication.models.CommunicationServiceKeys;
import com.azure.resourcemanager.communication.models.CommunicationServiceResource;
import com.azure.resourcemanager.communication.models.CommunicationServiceResourceUpdate;
import com.azure.resourcemanager.communication.models.CommunicationServicesProvisioningState;
import com.azure.resourcemanager.communication.models.LinkNotificationHubParameters;
import com.azure.resourcemanager.communication.models.LinkedNotificationHub;
import com.azure.resourcemanager.communication.models.ManagedServiceIdentity;
import com.azure.resourcemanager.communication.models.RegenerateKeyParameters;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class CommunicationServiceResourceImpl implements CommunicationServiceResource,
    CommunicationServiceResource.Definition, CommunicationServiceResource.Update {
    private CommunicationServiceResourceInner innerObject;

    private final com.azure.resourcemanager.communication.CommunicationManager serviceManager;

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

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public CommunicationServicesProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String hostname() {
        return this.innerModel().hostname();
    }

    public String dataLocation() {
        return this.innerModel().dataLocation();
    }

    public String notificationHubId() {
        return this.innerModel().notificationHubId();
    }

    public String version() {
        return this.innerModel().version();
    }

    public String immutableResourceId() {
        return this.innerModel().immutableResourceId();
    }

    public List<String> linkedDomains() {
        List<String> inner = this.innerModel().linkedDomains();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public CommunicationServiceResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.communication.CommunicationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String communicationServiceName;

    private CommunicationServiceResourceUpdate updateParameters;

    public CommunicationServiceResourceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public CommunicationServiceResource create() {
        this.innerObject = serviceManager.serviceClient().getCommunicationServices().createOrUpdate(resourceGroupName,
            communicationServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public CommunicationServiceResource create(Context context) {
        this.innerObject = serviceManager.serviceClient().getCommunicationServices().createOrUpdate(resourceGroupName,
            communicationServiceName, this.innerModel(), context);
        return this;
    }

    CommunicationServiceResourceImpl(String name,
        com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = new CommunicationServiceResourceInner();
        this.serviceManager = serviceManager;
        this.communicationServiceName = name;
    }

    public CommunicationServiceResourceImpl update() {
        this.updateParameters = new CommunicationServiceResourceUpdate();
        return this;
    }

    public CommunicationServiceResource apply() {
        this.innerObject = serviceManager.serviceClient().getCommunicationServices()
            .updateWithResponse(resourceGroupName, communicationServiceName, updateParameters, Context.NONE).getValue();
        return this;
    }

    public CommunicationServiceResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getCommunicationServices()
            .updateWithResponse(resourceGroupName, communicationServiceName, updateParameters, context).getValue();
        return this;
    }

    CommunicationServiceResourceImpl(CommunicationServiceResourceInner innerObject,
        com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.communicationServiceName = Utils.getValueFromIdByName(innerObject.id(), "communicationServices");
    }

    public CommunicationServiceResource refresh() {
        this.innerObject = serviceManager.serviceClient().getCommunicationServices()
            .getByResourceGroupWithResponse(resourceGroupName, communicationServiceName, Context.NONE).getValue();
        return this;
    }

    public CommunicationServiceResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getCommunicationServices()
            .getByResourceGroupWithResponse(resourceGroupName, communicationServiceName, context).getValue();
        return this;
    }

    public Response<LinkedNotificationHub>
        linkNotificationHubWithResponse(LinkNotificationHubParameters linkNotificationHubParameters, Context context) {
        return serviceManager.communicationServices().linkNotificationHubWithResponse(resourceGroupName,
            communicationServiceName, linkNotificationHubParameters, context);
    }

    public LinkedNotificationHub linkNotificationHub() {
        return serviceManager.communicationServices().linkNotificationHub(resourceGroupName, communicationServiceName);
    }

    public Response<CommunicationServiceKeys> listKeysWithResponse(Context context) {
        return serviceManager.communicationServices().listKeysWithResponse(resourceGroupName, communicationServiceName,
            context);
    }

    public CommunicationServiceKeys listKeys() {
        return serviceManager.communicationServices().listKeys(resourceGroupName, communicationServiceName);
    }

    public Response<CommunicationServiceKeys> regenerateKeyWithResponse(RegenerateKeyParameters parameters,
        Context context) {
        return serviceManager.communicationServices().regenerateKeyWithResponse(resourceGroupName,
            communicationServiceName, parameters, context);
    }

    public CommunicationServiceKeys regenerateKey(RegenerateKeyParameters parameters) {
        return serviceManager.communicationServices().regenerateKey(resourceGroupName, communicationServiceName,
            parameters);
    }

    public CommunicationServiceResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public CommunicationServiceResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public CommunicationServiceResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public CommunicationServiceResourceImpl withIdentity(ManagedServiceIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public CommunicationServiceResourceImpl withDataLocation(String dataLocation) {
        this.innerModel().withDataLocation(dataLocation);
        return this;
    }

    public CommunicationServiceResourceImpl withLinkedDomains(List<String> linkedDomains) {
        if (isInCreateMode()) {
            this.innerModel().withLinkedDomains(linkedDomains);
            return this;
        } else {
            this.updateParameters.withLinkedDomains(linkedDomains);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
