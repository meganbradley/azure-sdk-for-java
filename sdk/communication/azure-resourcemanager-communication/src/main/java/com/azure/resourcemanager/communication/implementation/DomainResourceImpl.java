// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.communication.fluent.models.DomainResourceInner;
import com.azure.resourcemanager.communication.models.DomainManagement;
import com.azure.resourcemanager.communication.models.DomainPropertiesVerificationRecords;
import com.azure.resourcemanager.communication.models.DomainPropertiesVerificationStates;
import com.azure.resourcemanager.communication.models.DomainResource;
import com.azure.resourcemanager.communication.models.DomainsProvisioningState;
import com.azure.resourcemanager.communication.models.UpdateDomainRequestParameters;
import com.azure.resourcemanager.communication.models.UserEngagementTracking;
import com.azure.resourcemanager.communication.models.VerificationParameter;
import java.util.Collections;
import java.util.Map;

public final class DomainResourceImpl implements DomainResource, DomainResource.Definition, DomainResource.Update {
    private DomainResourceInner innerObject;

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

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public DomainsProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String dataLocation() {
        return this.innerModel().dataLocation();
    }

    public String fromSenderDomain() {
        return this.innerModel().fromSenderDomain();
    }

    public String mailFromSenderDomain() {
        return this.innerModel().mailFromSenderDomain();
    }

    public DomainManagement domainManagement() {
        return this.innerModel().domainManagement();
    }

    public DomainPropertiesVerificationStates verificationStates() {
        return this.innerModel().verificationStates();
    }

    public DomainPropertiesVerificationRecords verificationRecords() {
        return this.innerModel().verificationRecords();
    }

    public UserEngagementTracking userEngagementTracking() {
        return this.innerModel().userEngagementTracking();
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

    public DomainResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.communication.CommunicationManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String emailServiceName;

    private String domainName;

    private UpdateDomainRequestParameters updateParameters;

    public DomainResourceImpl withExistingEmailService(String resourceGroupName, String emailServiceName) {
        this.resourceGroupName = resourceGroupName;
        this.emailServiceName = emailServiceName;
        return this;
    }

    public DomainResource create() {
        this.innerObject = serviceManager.serviceClient().getDomains().createOrUpdate(resourceGroupName,
            emailServiceName, domainName, this.innerModel(), Context.NONE);
        return this;
    }

    public DomainResource create(Context context) {
        this.innerObject = serviceManager.serviceClient().getDomains().createOrUpdate(resourceGroupName,
            emailServiceName, domainName, this.innerModel(), context);
        return this;
    }

    DomainResourceImpl(String name, com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = new DomainResourceInner();
        this.serviceManager = serviceManager;
        this.domainName = name;
    }

    public DomainResourceImpl update() {
        this.updateParameters = new UpdateDomainRequestParameters();
        return this;
    }

    public DomainResource apply() {
        this.innerObject = serviceManager.serviceClient().getDomains().update(resourceGroupName, emailServiceName,
            domainName, updateParameters, Context.NONE);
        return this;
    }

    public DomainResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getDomains().update(resourceGroupName, emailServiceName,
            domainName, updateParameters, context);
        return this;
    }

    DomainResourceImpl(DomainResourceInner innerObject,
        com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.emailServiceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "emailServices");
        this.domainName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "domains");
    }

    public DomainResource refresh() {
        this.innerObject = serviceManager.serviceClient().getDomains()
            .getWithResponse(resourceGroupName, emailServiceName, domainName, Context.NONE).getValue();
        return this;
    }

    public DomainResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getDomains()
            .getWithResponse(resourceGroupName, emailServiceName, domainName, context).getValue();
        return this;
    }

    public void initiateVerification(VerificationParameter parameters) {
        serviceManager.domains().initiateVerification(resourceGroupName, emailServiceName, domainName, parameters);
    }

    public void initiateVerification(VerificationParameter parameters, Context context) {
        serviceManager.domains().initiateVerification(resourceGroupName, emailServiceName, domainName, parameters,
            context);
    }

    public void cancelVerification(VerificationParameter parameters) {
        serviceManager.domains().cancelVerification(resourceGroupName, emailServiceName, domainName, parameters);
    }

    public void cancelVerification(VerificationParameter parameters, Context context) {
        serviceManager.domains().cancelVerification(resourceGroupName, emailServiceName, domainName, parameters,
            context);
    }

    public DomainResourceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public DomainResourceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public DomainResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public DomainResourceImpl withDomainManagement(DomainManagement domainManagement) {
        this.innerModel().withDomainManagement(domainManagement);
        return this;
    }

    public DomainResourceImpl withUserEngagementTracking(UserEngagementTracking userEngagementTracking) {
        if (isInCreateMode()) {
            this.innerModel().withUserEngagementTracking(userEngagementTracking);
            return this;
        } else {
            this.updateParameters.withUserEngagementTracking(userEngagementTracking);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
