// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.loganalytics.models.PrivateLinkScopedResource;
import com.azure.resourcemanager.loganalytics.models.PublicNetworkAccessType;
import com.azure.resourcemanager.loganalytics.models.SystemDataAutoGenerated;
import com.azure.resourcemanager.loganalytics.models.WorkspaceCapping;
import com.azure.resourcemanager.loganalytics.models.WorkspaceEntityStatus;
import com.azure.resourcemanager.loganalytics.models.WorkspaceFeatures;
import com.azure.resourcemanager.loganalytics.models.WorkspaceSku;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The top level Workspace resource container. */
@Fluent
public final class WorkspaceInner extends Resource {
    /*
     * Workspace properties.
     */
    @JsonProperty(value = "properties")
    private WorkspaceProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemDataAutoGenerated systemData;

    /*
     * The ETag of the workspace.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Get the innerProperties property: Workspace properties.
     *
     * @return the innerProperties value.
     */
    private WorkspaceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemDataAutoGenerated systemData() {
        return this.systemData;
    }

    /**
     * Get the etag property: The ETag of the workspace.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag of the workspace.
     *
     * @param etag the etag value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkspaceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WorkspaceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the workspace.
     *
     * @return the provisioningState value.
     */
    public WorkspaceEntityStatus provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the customerId property: This is a read-only property. Represents the ID associated with the workspace.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.innerProperties() == null ? null : this.innerProperties().customerId();
    }

    /**
     * Get the sku property: The SKU of the workspace.
     *
     * @return the sku value.
     */
    public WorkspaceSku sku() {
        return this.innerProperties() == null ? null : this.innerProperties().sku();
    }

    /**
     * Set the sku property: The SKU of the workspace.
     *
     * @param sku the sku value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withSku(WorkspaceSku sku) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceProperties();
        }
        this.innerProperties().withSku(sku);
        return this;
    }

    /**
     * Get the retentionInDays property: The workspace data retention in days. Allowed values are per pricing plan. See
     * pricing tiers documentation for details.
     *
     * @return the retentionInDays value.
     */
    public Integer retentionInDays() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionInDays();
    }

    /**
     * Set the retentionInDays property: The workspace data retention in days. Allowed values are per pricing plan. See
     * pricing tiers documentation for details.
     *
     * @param retentionInDays the retentionInDays value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withRetentionInDays(Integer retentionInDays) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceProperties();
        }
        this.innerProperties().withRetentionInDays(retentionInDays);
        return this;
    }

    /**
     * Get the workspaceCapping property: The daily volume cap for ingestion.
     *
     * @return the workspaceCapping value.
     */
    public WorkspaceCapping workspaceCapping() {
        return this.innerProperties() == null ? null : this.innerProperties().workspaceCapping();
    }

    /**
     * Set the workspaceCapping property: The daily volume cap for ingestion.
     *
     * @param workspaceCapping the workspaceCapping value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withWorkspaceCapping(WorkspaceCapping workspaceCapping) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceProperties();
        }
        this.innerProperties().withWorkspaceCapping(workspaceCapping);
        return this;
    }

    /**
     * Get the createdDate property: Workspace creation date.
     *
     * @return the createdDate value.
     */
    public String createdDate() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDate();
    }

    /**
     * Get the modifiedDate property: Workspace modification date.
     *
     * @return the modifiedDate value.
     */
    public String modifiedDate() {
        return this.innerProperties() == null ? null : this.innerProperties().modifiedDate();
    }

    /**
     * Get the publicNetworkAccessForIngestion property: The network access type for accessing Log Analytics ingestion.
     *
     * @return the publicNetworkAccessForIngestion value.
     */
    public PublicNetworkAccessType publicNetworkAccessForIngestion() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccessForIngestion();
    }

    /**
     * Set the publicNetworkAccessForIngestion property: The network access type for accessing Log Analytics ingestion.
     *
     * @param publicNetworkAccessForIngestion the publicNetworkAccessForIngestion value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withPublicNetworkAccessForIngestion(PublicNetworkAccessType publicNetworkAccessForIngestion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceProperties();
        }
        this.innerProperties().withPublicNetworkAccessForIngestion(publicNetworkAccessForIngestion);
        return this;
    }

    /**
     * Get the publicNetworkAccessForQuery property: The network access type for accessing Log Analytics query.
     *
     * @return the publicNetworkAccessForQuery value.
     */
    public PublicNetworkAccessType publicNetworkAccessForQuery() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccessForQuery();
    }

    /**
     * Set the publicNetworkAccessForQuery property: The network access type for accessing Log Analytics query.
     *
     * @param publicNetworkAccessForQuery the publicNetworkAccessForQuery value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withPublicNetworkAccessForQuery(PublicNetworkAccessType publicNetworkAccessForQuery) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceProperties();
        }
        this.innerProperties().withPublicNetworkAccessForQuery(publicNetworkAccessForQuery);
        return this;
    }

    /**
     * Get the forceCmkForQuery property: Indicates whether customer managed storage is mandatory for query management.
     *
     * @return the forceCmkForQuery value.
     */
    public Boolean forceCmkForQuery() {
        return this.innerProperties() == null ? null : this.innerProperties().forceCmkForQuery();
    }

    /**
     * Set the forceCmkForQuery property: Indicates whether customer managed storage is mandatory for query management.
     *
     * @param forceCmkForQuery the forceCmkForQuery value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withForceCmkForQuery(Boolean forceCmkForQuery) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceProperties();
        }
        this.innerProperties().withForceCmkForQuery(forceCmkForQuery);
        return this;
    }

    /**
     * Get the privateLinkScopedResources property: List of linked private link scope resources.
     *
     * @return the privateLinkScopedResources value.
     */
    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        return this.innerProperties() == null ? null : this.innerProperties().privateLinkScopedResources();
    }

    /**
     * Get the features property: Workspace features.
     *
     * @return the features value.
     */
    public WorkspaceFeatures features() {
        return this.innerProperties() == null ? null : this.innerProperties().features();
    }

    /**
     * Set the features property: Workspace features.
     *
     * @param features the features value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withFeatures(WorkspaceFeatures features) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceProperties();
        }
        this.innerProperties().withFeatures(features);
        return this;
    }

    /**
     * Get the defaultDataCollectionRuleResourceId property: The resource ID of the default Data Collection Rule to use
     * for this workspace. Expected format is -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/dataCollectionRules/{dcrName}.
     *
     * @return the defaultDataCollectionRuleResourceId value.
     */
    public String defaultDataCollectionRuleResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultDataCollectionRuleResourceId();
    }

    /**
     * Set the defaultDataCollectionRuleResourceId property: The resource ID of the default Data Collection Rule to use
     * for this workspace. Expected format is -
     * /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights/dataCollectionRules/{dcrName}.
     *
     * @param defaultDataCollectionRuleResourceId the defaultDataCollectionRuleResourceId value to set.
     * @return the WorkspaceInner object itself.
     */
    public WorkspaceInner withDefaultDataCollectionRuleResourceId(String defaultDataCollectionRuleResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkspaceProperties();
        }
        this.innerProperties().withDefaultDataCollectionRuleResourceId(defaultDataCollectionRuleResourceId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
