// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagemover.fluent.models.JobDefinitionInner;
import com.azure.resourcemanager.storagemover.models.CopyMode;
import com.azure.resourcemanager.storagemover.models.JobDefinition;
import com.azure.resourcemanager.storagemover.models.JobDefinitionUpdateParameters;
import com.azure.resourcemanager.storagemover.models.JobRunResourceId;
import com.azure.resourcemanager.storagemover.models.JobRunStatus;
import com.azure.resourcemanager.storagemover.models.ProvisioningState;

public final class JobDefinitionImpl implements JobDefinition, JobDefinition.Definition, JobDefinition.Update {
    private JobDefinitionInner innerObject;

    private final com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String description() {
        return this.innerModel().description();
    }

    public CopyMode copyMode() {
        return this.innerModel().copyMode();
    }

    public String sourceName() {
        return this.innerModel().sourceName();
    }

    public String sourceResourceId() {
        return this.innerModel().sourceResourceId();
    }

    public String sourceSubpath() {
        return this.innerModel().sourceSubpath();
    }

    public String targetName() {
        return this.innerModel().targetName();
    }

    public String targetResourceId() {
        return this.innerModel().targetResourceId();
    }

    public String targetSubpath() {
        return this.innerModel().targetSubpath();
    }

    public String latestJobRunName() {
        return this.innerModel().latestJobRunName();
    }

    public String latestJobRunResourceId() {
        return this.innerModel().latestJobRunResourceId();
    }

    public JobRunStatus latestJobRunStatus() {
        return this.innerModel().latestJobRunStatus();
    }

    public String agentName() {
        return this.innerModel().agentName();
    }

    public String agentResourceId() {
        return this.innerModel().agentResourceId();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public JobDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storagemover.StorageMoverManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String storageMoverName;

    private String projectName;

    private String jobDefinitionName;

    private JobDefinitionUpdateParameters updateJobDefinition;

    public JobDefinitionImpl withExistingProject(
        String resourceGroupName, String storageMoverName, String projectName) {
        this.resourceGroupName = resourceGroupName;
        this.storageMoverName = storageMoverName;
        this.projectName = projectName;
        return this;
    }

    public JobDefinition create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobDefinitions()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    storageMoverName,
                    projectName,
                    jobDefinitionName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public JobDefinition create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobDefinitions()
                .createOrUpdateWithResponse(
                    resourceGroupName, storageMoverName, projectName, jobDefinitionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    JobDefinitionImpl(String name, com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager) {
        this.innerObject = new JobDefinitionInner();
        this.serviceManager = serviceManager;
        this.jobDefinitionName = name;
    }

    public JobDefinitionImpl update() {
        this.updateJobDefinition = new JobDefinitionUpdateParameters();
        return this;
    }

    public JobDefinition apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobDefinitions()
                .updateWithResponse(
                    resourceGroupName,
                    storageMoverName,
                    projectName,
                    jobDefinitionName,
                    updateJobDefinition,
                    Context.NONE)
                .getValue();
        return this;
    }

    public JobDefinition apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobDefinitions()
                .updateWithResponse(
                    resourceGroupName, storageMoverName, projectName, jobDefinitionName, updateJobDefinition, context)
                .getValue();
        return this;
    }

    JobDefinitionImpl(
        JobDefinitionInner innerObject, com.azure.resourcemanager.storagemover.StorageMoverManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.storageMoverName = Utils.getValueFromIdByName(innerObject.id(), "storageMovers");
        this.projectName = Utils.getValueFromIdByName(innerObject.id(), "projects");
        this.jobDefinitionName = Utils.getValueFromIdByName(innerObject.id(), "jobDefinitions");
    }

    public JobDefinition refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobDefinitions()
                .getWithResponse(resourceGroupName, storageMoverName, projectName, jobDefinitionName, Context.NONE)
                .getValue();
        return this;
    }

    public JobDefinition refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getJobDefinitions()
                .getWithResponse(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context)
                .getValue();
        return this;
    }

    public Response<JobRunResourceId> startJobWithResponse(Context context) {
        return serviceManager
            .jobDefinitions()
            .startJobWithResponse(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context);
    }

    public JobRunResourceId startJob() {
        return serviceManager
            .jobDefinitions()
            .startJob(resourceGroupName, storageMoverName, projectName, jobDefinitionName);
    }

    public Response<JobRunResourceId> stopJobWithResponse(Context context) {
        return serviceManager
            .jobDefinitions()
            .stopJobWithResponse(resourceGroupName, storageMoverName, projectName, jobDefinitionName, context);
    }

    public JobRunResourceId stopJob() {
        return serviceManager
            .jobDefinitions()
            .stopJob(resourceGroupName, storageMoverName, projectName, jobDefinitionName);
    }

    public JobDefinitionImpl withCopyMode(CopyMode copyMode) {
        if (isInCreateMode()) {
            this.innerModel().withCopyMode(copyMode);
            return this;
        } else {
            this.updateJobDefinition.withCopyMode(copyMode);
            return this;
        }
    }

    public JobDefinitionImpl withSourceName(String sourceName) {
        this.innerModel().withSourceName(sourceName);
        return this;
    }

    public JobDefinitionImpl withTargetName(String targetName) {
        this.innerModel().withTargetName(targetName);
        return this;
    }

    public JobDefinitionImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.innerModel().withDescription(description);
            return this;
        } else {
            this.updateJobDefinition.withDescription(description);
            return this;
        }
    }

    public JobDefinitionImpl withSourceSubpath(String sourceSubpath) {
        this.innerModel().withSourceSubpath(sourceSubpath);
        return this;
    }

    public JobDefinitionImpl withTargetSubpath(String targetSubpath) {
        this.innerModel().withTargetSubpath(targetSubpath);
        return this;
    }

    public JobDefinitionImpl withAgentName(String agentName) {
        if (isInCreateMode()) {
            this.innerModel().withAgentName(agentName);
            return this;
        } else {
            this.updateJobDefinition.withAgentName(agentName);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
