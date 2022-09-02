// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.monitor.fluent.ActionGroupsClient;
import com.azure.resourcemanager.monitor.fluent.ActivityLogAlertsClient;
import com.azure.resourcemanager.monitor.fluent.ActivityLogsClient;
import com.azure.resourcemanager.monitor.fluent.AlertRuleIncidentsClient;
import com.azure.resourcemanager.monitor.fluent.AlertRulesClient;
import com.azure.resourcemanager.monitor.fluent.AutoscaleSettingsClient;
import com.azure.resourcemanager.monitor.fluent.BaselinesClient;
import com.azure.resourcemanager.monitor.fluent.DataCollectionEndpointsClient;
import com.azure.resourcemanager.monitor.fluent.DataCollectionRuleAssociationsClient;
import com.azure.resourcemanager.monitor.fluent.DataCollectionRulesClient;
import com.azure.resourcemanager.monitor.fluent.DiagnosticSettingsCategoriesClient;
import com.azure.resourcemanager.monitor.fluent.DiagnosticSettingsOperationsClient;
import com.azure.resourcemanager.monitor.fluent.EventCategoriesClient;
import com.azure.resourcemanager.monitor.fluent.LogProfilesClient;
import com.azure.resourcemanager.monitor.fluent.MetricAlertsClient;
import com.azure.resourcemanager.monitor.fluent.MetricAlertsStatusClient;
import com.azure.resourcemanager.monitor.fluent.MetricDefinitionsClient;
import com.azure.resourcemanager.monitor.fluent.MetricNamespacesClient;
import com.azure.resourcemanager.monitor.fluent.MetricsClient;
import com.azure.resourcemanager.monitor.fluent.MonitorClient;
import com.azure.resourcemanager.monitor.fluent.OperationsClient;
import com.azure.resourcemanager.monitor.fluent.PredictiveMetricsClient;
import com.azure.resourcemanager.monitor.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.monitor.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.monitor.fluent.PrivateLinkScopeOperationStatusClient;
import com.azure.resourcemanager.monitor.fluent.PrivateLinkScopedResourcesClient;
import com.azure.resourcemanager.monitor.fluent.PrivateLinkScopesClient;
import com.azure.resourcemanager.monitor.fluent.ScheduledQueryRulesClient;
import com.azure.resourcemanager.monitor.fluent.TenantActivityLogsClient;
import com.azure.resourcemanager.monitor.fluent.VMInsightsClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the MonitorClientImpl type. */
@ServiceClient(builder = MonitorClientBuilder.class)
public final class MonitorClientImpl extends AzureServiceClient implements MonitorClient {
    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The AutoscaleSettingsClient object to access its operations. */
    private final AutoscaleSettingsClient autoscaleSettings;

    /**
     * Gets the AutoscaleSettingsClient object to access its operations.
     *
     * @return the AutoscaleSettingsClient object.
     */
    public AutoscaleSettingsClient getAutoscaleSettings() {
        return this.autoscaleSettings;
    }

    /** The PredictiveMetricsClient object to access its operations. */
    private final PredictiveMetricsClient predictiveMetrics;

    /**
     * Gets the PredictiveMetricsClient object to access its operations.
     *
     * @return the PredictiveMetricsClient object.
     */
    public PredictiveMetricsClient getPredictiveMetrics() {
        return this.predictiveMetrics;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The AlertRuleIncidentsClient object to access its operations. */
    private final AlertRuleIncidentsClient alertRuleIncidents;

    /**
     * Gets the AlertRuleIncidentsClient object to access its operations.
     *
     * @return the AlertRuleIncidentsClient object.
     */
    public AlertRuleIncidentsClient getAlertRuleIncidents() {
        return this.alertRuleIncidents;
    }

    /** The AlertRulesClient object to access its operations. */
    private final AlertRulesClient alertRules;

    /**
     * Gets the AlertRulesClient object to access its operations.
     *
     * @return the AlertRulesClient object.
     */
    public AlertRulesClient getAlertRules() {
        return this.alertRules;
    }

    /** The LogProfilesClient object to access its operations. */
    private final LogProfilesClient logProfiles;

    /**
     * Gets the LogProfilesClient object to access its operations.
     *
     * @return the LogProfilesClient object.
     */
    public LogProfilesClient getLogProfiles() {
        return this.logProfiles;
    }

    /** The DiagnosticSettingsOperationsClient object to access its operations. */
    private final DiagnosticSettingsOperationsClient diagnosticSettingsOperations;

    /**
     * Gets the DiagnosticSettingsOperationsClient object to access its operations.
     *
     * @return the DiagnosticSettingsOperationsClient object.
     */
    public DiagnosticSettingsOperationsClient getDiagnosticSettingsOperations() {
        return this.diagnosticSettingsOperations;
    }

    /** The DiagnosticSettingsCategoriesClient object to access its operations. */
    private final DiagnosticSettingsCategoriesClient diagnosticSettingsCategories;

    /**
     * Gets the DiagnosticSettingsCategoriesClient object to access its operations.
     *
     * @return the DiagnosticSettingsCategoriesClient object.
     */
    public DiagnosticSettingsCategoriesClient getDiagnosticSettingsCategories() {
        return this.diagnosticSettingsCategories;
    }

    /** The ActionGroupsClient object to access its operations. */
    private final ActionGroupsClient actionGroups;

    /**
     * Gets the ActionGroupsClient object to access its operations.
     *
     * @return the ActionGroupsClient object.
     */
    public ActionGroupsClient getActionGroups() {
        return this.actionGroups;
    }

    /** The ActivityLogsClient object to access its operations. */
    private final ActivityLogsClient activityLogs;

    /**
     * Gets the ActivityLogsClient object to access its operations.
     *
     * @return the ActivityLogsClient object.
     */
    public ActivityLogsClient getActivityLogs() {
        return this.activityLogs;
    }

    /** The EventCategoriesClient object to access its operations. */
    private final EventCategoriesClient eventCategories;

    /**
     * Gets the EventCategoriesClient object to access its operations.
     *
     * @return the EventCategoriesClient object.
     */
    public EventCategoriesClient getEventCategories() {
        return this.eventCategories;
    }

    /** The TenantActivityLogsClient object to access its operations. */
    private final TenantActivityLogsClient tenantActivityLogs;

    /**
     * Gets the TenantActivityLogsClient object to access its operations.
     *
     * @return the TenantActivityLogsClient object.
     */
    public TenantActivityLogsClient getTenantActivityLogs() {
        return this.tenantActivityLogs;
    }

    /** The MetricDefinitionsClient object to access its operations. */
    private final MetricDefinitionsClient metricDefinitions;

    /**
     * Gets the MetricDefinitionsClient object to access its operations.
     *
     * @return the MetricDefinitionsClient object.
     */
    public MetricDefinitionsClient getMetricDefinitions() {
        return this.metricDefinitions;
    }

    /** The MetricsClient object to access its operations. */
    private final MetricsClient metrics;

    /**
     * Gets the MetricsClient object to access its operations.
     *
     * @return the MetricsClient object.
     */
    public MetricsClient getMetrics() {
        return this.metrics;
    }

    /** The BaselinesClient object to access its operations. */
    private final BaselinesClient baselines;

    /**
     * Gets the BaselinesClient object to access its operations.
     *
     * @return the BaselinesClient object.
     */
    public BaselinesClient getBaselines() {
        return this.baselines;
    }

    /** The MetricAlertsClient object to access its operations. */
    private final MetricAlertsClient metricAlerts;

    /**
     * Gets the MetricAlertsClient object to access its operations.
     *
     * @return the MetricAlertsClient object.
     */
    public MetricAlertsClient getMetricAlerts() {
        return this.metricAlerts;
    }

    /** The MetricAlertsStatusClient object to access its operations. */
    private final MetricAlertsStatusClient metricAlertsStatus;

    /**
     * Gets the MetricAlertsStatusClient object to access its operations.
     *
     * @return the MetricAlertsStatusClient object.
     */
    public MetricAlertsStatusClient getMetricAlertsStatus() {
        return this.metricAlertsStatus;
    }

    /** The ScheduledQueryRulesClient object to access its operations. */
    private final ScheduledQueryRulesClient scheduledQueryRules;

    /**
     * Gets the ScheduledQueryRulesClient object to access its operations.
     *
     * @return the ScheduledQueryRulesClient object.
     */
    public ScheduledQueryRulesClient getScheduledQueryRules() {
        return this.scheduledQueryRules;
    }

    /** The MetricNamespacesClient object to access its operations. */
    private final MetricNamespacesClient metricNamespaces;

    /**
     * Gets the MetricNamespacesClient object to access its operations.
     *
     * @return the MetricNamespacesClient object.
     */
    public MetricNamespacesClient getMetricNamespaces() {
        return this.metricNamespaces;
    }

    /** The VMInsightsClient object to access its operations. */
    private final VMInsightsClient vMInsights;

    /**
     * Gets the VMInsightsClient object to access its operations.
     *
     * @return the VMInsightsClient object.
     */
    public VMInsightsClient getVMInsights() {
        return this.vMInsights;
    }

    /** The PrivateLinkScopesClient object to access its operations. */
    private final PrivateLinkScopesClient privateLinkScopes;

    /**
     * Gets the PrivateLinkScopesClient object to access its operations.
     *
     * @return the PrivateLinkScopesClient object.
     */
    public PrivateLinkScopesClient getPrivateLinkScopes() {
        return this.privateLinkScopes;
    }

    /** The PrivateLinkScopeOperationStatusClient object to access its operations. */
    private final PrivateLinkScopeOperationStatusClient privateLinkScopeOperationStatus;

    /**
     * Gets the PrivateLinkScopeOperationStatusClient object to access its operations.
     *
     * @return the PrivateLinkScopeOperationStatusClient object.
     */
    public PrivateLinkScopeOperationStatusClient getPrivateLinkScopeOperationStatus() {
        return this.privateLinkScopeOperationStatus;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The PrivateLinkScopedResourcesClient object to access its operations. */
    private final PrivateLinkScopedResourcesClient privateLinkScopedResources;

    /**
     * Gets the PrivateLinkScopedResourcesClient object to access its operations.
     *
     * @return the PrivateLinkScopedResourcesClient object.
     */
    public PrivateLinkScopedResourcesClient getPrivateLinkScopedResources() {
        return this.privateLinkScopedResources;
    }

    /** The ActivityLogAlertsClient object to access its operations. */
    private final ActivityLogAlertsClient activityLogAlerts;

    /**
     * Gets the ActivityLogAlertsClient object to access its operations.
     *
     * @return the ActivityLogAlertsClient object.
     */
    public ActivityLogAlertsClient getActivityLogAlerts() {
        return this.activityLogAlerts;
    }

    /** The DataCollectionEndpointsClient object to access its operations. */
    private final DataCollectionEndpointsClient dataCollectionEndpoints;

    /**
     * Gets the DataCollectionEndpointsClient object to access its operations.
     *
     * @return the DataCollectionEndpointsClient object.
     */
    public DataCollectionEndpointsClient getDataCollectionEndpoints() {
        return this.dataCollectionEndpoints;
    }

    /** The DataCollectionRuleAssociationsClient object to access its operations. */
    private final DataCollectionRuleAssociationsClient dataCollectionRuleAssociations;

    /**
     * Gets the DataCollectionRuleAssociationsClient object to access its operations.
     *
     * @return the DataCollectionRuleAssociationsClient object.
     */
    public DataCollectionRuleAssociationsClient getDataCollectionRuleAssociations() {
        return this.dataCollectionRuleAssociations;
    }

    /** The DataCollectionRulesClient object to access its operations. */
    private final DataCollectionRulesClient dataCollectionRules;

    /**
     * Gets the DataCollectionRulesClient object to access its operations.
     *
     * @return the DataCollectionRulesClient object.
     */
    public DataCollectionRulesClient getDataCollectionRules() {
        return this.dataCollectionRules;
    }

    /**
     * Initializes an instance of MonitorClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    MonitorClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.autoscaleSettings = new AutoscaleSettingsClientImpl(this);
        this.predictiveMetrics = new PredictiveMetricsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.alertRuleIncidents = new AlertRuleIncidentsClientImpl(this);
        this.alertRules = new AlertRulesClientImpl(this);
        this.logProfiles = new LogProfilesClientImpl(this);
        this.diagnosticSettingsOperations = new DiagnosticSettingsOperationsClientImpl(this);
        this.diagnosticSettingsCategories = new DiagnosticSettingsCategoriesClientImpl(this);
        this.actionGroups = new ActionGroupsClientImpl(this);
        this.activityLogs = new ActivityLogsClientImpl(this);
        this.eventCategories = new EventCategoriesClientImpl(this);
        this.tenantActivityLogs = new TenantActivityLogsClientImpl(this);
        this.metricDefinitions = new MetricDefinitionsClientImpl(this);
        this.metrics = new MetricsClientImpl(this);
        this.baselines = new BaselinesClientImpl(this);
        this.metricAlerts = new MetricAlertsClientImpl(this);
        this.metricAlertsStatus = new MetricAlertsStatusClientImpl(this);
        this.scheduledQueryRules = new ScheduledQueryRulesClientImpl(this);
        this.metricNamespaces = new MetricNamespacesClientImpl(this);
        this.vMInsights = new VMInsightsClientImpl(this);
        this.privateLinkScopes = new PrivateLinkScopesClientImpl(this);
        this.privateLinkScopeOperationStatus = new PrivateLinkScopeOperationStatusClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClientImpl(this);
        this.privateLinkScopedResources = new PrivateLinkScopedResourcesClientImpl(this);
        this.activityLogAlerts = new ActivityLogAlertsClientImpl(this);
        this.dataCollectionEndpoints = new DataCollectionEndpointsClientImpl(this);
        this.dataCollectionRuleAssociations = new DataCollectionRuleAssociationsClientImpl(this);
        this.dataCollectionRules = new DataCollectionRulesClientImpl(this);
    }
}
