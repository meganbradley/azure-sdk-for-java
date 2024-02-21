// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureLogAnalyticsParameterPatch model. */
@Fluent
public final class AzureLogAnalyticsParameterPatch {
    /*
     * The tenant id of service principal that have access to this Log Analytics
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The client id of service principal that have access to this Log Analytics
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * The client secret of service principal that have access to this Log Analytics
     */
    @JsonProperty(value = "clientSecret")
    private String clientSecret;

    /*
     * The workspace id of this Log Analytics
     */
    @JsonProperty(value = "workspaceId")
    private String workspaceId;

    /*
     * The KQL (Kusto Query Language) query to fetch data from this Log Analytics
     */
    @JsonProperty(value = "query")
    private String query;

    /** Creates an instance of AzureLogAnalyticsParameterPatch class. */
    public AzureLogAnalyticsParameterPatch() {}

    /**
     * Get the tenantId property: The tenant id of service principal that have access to this Log Analytics.
     *
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant id of service principal that have access to this Log Analytics.
     *
     * @param tenantId the tenantId value to set.
     * @return the AzureLogAnalyticsParameterPatch object itself.
     */
    public AzureLogAnalyticsParameterPatch setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the clientId property: The client id of service principal that have access to this Log Analytics.
     *
     * @return the clientId value.
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The client id of service principal that have access to this Log Analytics.
     *
     * @param clientId the clientId value to set.
     * @return the AzureLogAnalyticsParameterPatch object itself.
     */
    public AzureLogAnalyticsParameterPatch setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the clientSecret property: The client secret of service principal that have access to this Log Analytics.
     *
     * @return the clientSecret value.
     */
    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * Set the clientSecret property: The client secret of service principal that have access to this Log Analytics.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the AzureLogAnalyticsParameterPatch object itself.
     */
    public AzureLogAnalyticsParameterPatch setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Get the workspaceId property: The workspace id of this Log Analytics.
     *
     * @return the workspaceId value.
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: The workspace id of this Log Analytics.
     *
     * @param workspaceId the workspaceId value to set.
     * @return the AzureLogAnalyticsParameterPatch object itself.
     */
    public AzureLogAnalyticsParameterPatch setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the query property: The KQL (Kusto Query Language) query to fetch data from this Log Analytics.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The KQL (Kusto Query Language) query to fetch data from this Log Analytics.
     *
     * @param query the query value to set.
     * @return the AzureLogAnalyticsParameterPatch object itself.
     */
    public AzureLogAnalyticsParameterPatch setQuery(String query) {
        this.query = query;
        return this;
    }
}
