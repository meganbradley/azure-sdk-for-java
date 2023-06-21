// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managementgroups.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The results of Azure-AsyncOperation. */
@Fluent
public final class AzureAsyncOperationResultsInner {
    /*
     * The fully qualified ID for the management group.  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The type of the resource.  For example, Microsoft.Management/managementGroups
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The name of the management group. For example, 00000000-0000-0000-0000-000000000000
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The current status of the asynchronous operation performed . For example, Running, Succeeded, Failed
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /*
     * The generic properties of a management group.
     */
    @JsonProperty(value = "properties")
    private ManagementGroupInfoProperties innerProperties;

    /** Creates an instance of AzureAsyncOperationResultsInner class. */
    public AzureAsyncOperationResultsInner() {
    }

    /**
     * Get the id property: The fully qualified ID for the management group. For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type property: The type of the resource. For example, Microsoft.Management/managementGroups.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the management group. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the status property: The current status of the asynchronous operation performed . For example, Running,
     * Succeeded, Failed.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the innerProperties property: The generic properties of a management group.
     *
     * @return the innerProperties value.
     */
    private ManagementGroupInfoProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The AAD Tenant ID associated with the management group. For example,
     * 00000000-0000-0000-0000-000000000000.
     *
     * @param tenantId the tenantId value to set.
     * @return the AzureAsyncOperationResultsInner object itself.
     */
    public AzureAsyncOperationResultsInner withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagementGroupInfoProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Get the displayName property: The friendly name of the management group.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The friendly name of the management group.
     *
     * @param displayName the displayName value to set.
     * @return the AzureAsyncOperationResultsInner object itself.
     */
    public AzureAsyncOperationResultsInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ManagementGroupInfoProperties();
        }
        this.innerProperties().withDisplayName(displayName);
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
    }
}