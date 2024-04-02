// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for SecurityCenter class.
 */
public interface SecurityCenter {
    /**
     * Gets Azure subscription ID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the LocationsClient object to access its operations.
     * 
     * @return the LocationsClient object.
     */
    LocationsClient getLocations();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the TasksClient object to access its operations.
     * 
     * @return the TasksClient object.
     */
    TasksClient getTasks();

    /**
     * Gets the AutoProvisioningSettingsClient object to access its operations.
     * 
     * @return the AutoProvisioningSettingsClient object.
     */
    AutoProvisioningSettingsClient getAutoProvisioningSettings();

    /**
     * Gets the CompliancesClient object to access its operations.
     * 
     * @return the CompliancesClient object.
     */
    CompliancesClient getCompliances();

    /**
     * Gets the InformationProtectionPoliciesClient object to access its operations.
     * 
     * @return the InformationProtectionPoliciesClient object.
     */
    InformationProtectionPoliciesClient getInformationProtectionPolicies();

    /**
     * Gets the WorkspaceSettingsClient object to access its operations.
     * 
     * @return the WorkspaceSettingsClient object.
     */
    WorkspaceSettingsClient getWorkspaceSettings();

    /**
     * Gets the AlertsSuppressionRulesClient object to access its operations.
     * 
     * @return the AlertsSuppressionRulesClient object.
     */
    AlertsSuppressionRulesClient getAlertsSuppressionRules();

    /**
     * Gets the AutomationsClient object to access its operations.
     * 
     * @return the AutomationsClient object.
     */
    AutomationsClient getAutomations();

    /**
     * Gets the RegulatoryComplianceStandardsClient object to access its operations.
     * 
     * @return the RegulatoryComplianceStandardsClient object.
     */
    RegulatoryComplianceStandardsClient getRegulatoryComplianceStandards();

    /**
     * Gets the RegulatoryComplianceControlsClient object to access its operations.
     * 
     * @return the RegulatoryComplianceControlsClient object.
     */
    RegulatoryComplianceControlsClient getRegulatoryComplianceControls();

    /**
     * Gets the RegulatoryComplianceAssessmentsClient object to access its operations.
     * 
     * @return the RegulatoryComplianceAssessmentsClient object.
     */
    RegulatoryComplianceAssessmentsClient getRegulatoryComplianceAssessments();

    /**
     * Gets the SubAssessmentsClient object to access its operations.
     * 
     * @return the SubAssessmentsClient object.
     */
    SubAssessmentsClient getSubAssessments();

    /**
     * Gets the ConnectorsClient object to access its operations.
     * 
     * @return the ConnectorsClient object.
     */
    ConnectorsClient getConnectors();

    /**
     * Gets the SecurityContactsClient object to access its operations.
     * 
     * @return the SecurityContactsClient object.
     */
    SecurityContactsClient getSecurityContacts();

    /**
     * Gets the SoftwareInventoriesClient object to access its operations.
     * 
     * @return the SoftwareInventoriesClient object.
     */
    SoftwareInventoriesClient getSoftwareInventories();

    /**
     * Gets the CustomAssessmentAutomationsClient object to access its operations.
     * 
     * @return the CustomAssessmentAutomationsClient object.
     */
    CustomAssessmentAutomationsClient getCustomAssessmentAutomations();

    /**
     * Gets the CustomEntityStoreAssignmentsClient object to access its operations.
     * 
     * @return the CustomEntityStoreAssignmentsClient object.
     */
    CustomEntityStoreAssignmentsClient getCustomEntityStoreAssignments();

    /**
     * Gets the MdeOnboardingsClient object to access its operations.
     * 
     * @return the MdeOnboardingsClient object.
     */
    MdeOnboardingsClient getMdeOnboardings();

    /**
     * Gets the GovernanceAssignmentsClient object to access its operations.
     * 
     * @return the GovernanceAssignmentsClient object.
     */
    GovernanceAssignmentsClient getGovernanceAssignments();

    /**
     * Gets the GovernanceRulesClient object to access its operations.
     * 
     * @return the GovernanceRulesClient object.
     */
    GovernanceRulesClient getGovernanceRules();

    /**
     * Gets the ApplicationsClient object to access its operations.
     * 
     * @return the ApplicationsClient object.
     */
    ApplicationsClient getApplications();

    /**
     * Gets the ApplicationOperationsClient object to access its operations.
     * 
     * @return the ApplicationOperationsClient object.
     */
    ApplicationOperationsClient getApplicationOperations();

    /**
     * Gets the SecurityConnectorApplicationsClient object to access its operations.
     * 
     * @return the SecurityConnectorApplicationsClient object.
     */
    SecurityConnectorApplicationsClient getSecurityConnectorApplications();

    /**
     * Gets the SecurityConnectorApplicationOperationsClient object to access its operations.
     * 
     * @return the SecurityConnectorApplicationOperationsClient object.
     */
    SecurityConnectorApplicationOperationsClient getSecurityConnectorApplicationOperations();

    /**
     * Gets the DefenderForStoragesClient object to access its operations.
     * 
     * @return the DefenderForStoragesClient object.
     */
    DefenderForStoragesClient getDefenderForStorages();

    /**
     * Gets the SecurityOperatorsClient object to access its operations.
     * 
     * @return the SecurityOperatorsClient object.
     */
    SecurityOperatorsClient getSecurityOperators();

    /**
     * Gets the SqlVulnerabilityAssessmentBaselineRulesClient object to access its operations.
     * 
     * @return the SqlVulnerabilityAssessmentBaselineRulesClient object.
     */
    SqlVulnerabilityAssessmentBaselineRulesClient getSqlVulnerabilityAssessmentBaselineRules();

    /**
     * Gets the SqlVulnerabilityAssessmentScansClient object to access its operations.
     * 
     * @return the SqlVulnerabilityAssessmentScansClient object.
     */
    SqlVulnerabilityAssessmentScansClient getSqlVulnerabilityAssessmentScans();

    /**
     * Gets the SqlVulnerabilityAssessmentScanResultsClient object to access its operations.
     * 
     * @return the SqlVulnerabilityAssessmentScanResultsClient object.
     */
    SqlVulnerabilityAssessmentScanResultsClient getSqlVulnerabilityAssessmentScanResults();

    /**
     * Gets the ResourceProvidersClient object to access its operations.
     * 
     * @return the ResourceProvidersClient object.
     */
    ResourceProvidersClient getResourceProviders();

    /**
     * Gets the SensitivitySettingsClient object to access its operations.
     * 
     * @return the SensitivitySettingsClient object.
     */
    SensitivitySettingsClient getSensitivitySettings();

    /**
     * Gets the HealthReportsClient object to access its operations.
     * 
     * @return the HealthReportsClient object.
     */
    HealthReportsClient getHealthReports();

    /**
     * Gets the AzureDevOpsOrgsClient object to access its operations.
     * 
     * @return the AzureDevOpsOrgsClient object.
     */
    AzureDevOpsOrgsClient getAzureDevOpsOrgs();

    /**
     * Gets the AzureDevOpsProjectsClient object to access its operations.
     * 
     * @return the AzureDevOpsProjectsClient object.
     */
    AzureDevOpsProjectsClient getAzureDevOpsProjects();

    /**
     * Gets the AzureDevOpsReposClient object to access its operations.
     * 
     * @return the AzureDevOpsReposClient object.
     */
    AzureDevOpsReposClient getAzureDevOpsRepos();

    /**
     * Gets the DevOpsConfigurationsClient object to access its operations.
     * 
     * @return the DevOpsConfigurationsClient object.
     */
    DevOpsConfigurationsClient getDevOpsConfigurations();

    /**
     * Gets the GitHubOwnersClient object to access its operations.
     * 
     * @return the GitHubOwnersClient object.
     */
    GitHubOwnersClient getGitHubOwners();

    /**
     * Gets the GitHubReposClient object to access its operations.
     * 
     * @return the GitHubReposClient object.
     */
    GitHubReposClient getGitHubRepos();

    /**
     * Gets the GitLabGroupsClient object to access its operations.
     * 
     * @return the GitLabGroupsClient object.
     */
    GitLabGroupsClient getGitLabGroups();

    /**
     * Gets the GitLabSubgroupsClient object to access its operations.
     * 
     * @return the GitLabSubgroupsClient object.
     */
    GitLabSubgroupsClient getGitLabSubgroups();

    /**
     * Gets the GitLabProjectsClient object to access its operations.
     * 
     * @return the GitLabProjectsClient object.
     */
    GitLabProjectsClient getGitLabProjects();

    /**
     * Gets the DevOpsOperationResultsClient object to access its operations.
     * 
     * @return the DevOpsOperationResultsClient object.
     */
    DevOpsOperationResultsClient getDevOpsOperationResults();

    /**
     * Gets the SecurityConnectorsClient object to access its operations.
     * 
     * @return the SecurityConnectorsClient object.
     */
    SecurityConnectorsClient getSecurityConnectors();

    /**
     * Gets the ComplianceResultsClient object to access its operations.
     * 
     * @return the ComplianceResultsClient object.
     */
    ComplianceResultsClient getComplianceResults();

    /**
     * Gets the AdvancedThreatProtectionsClient object to access its operations.
     * 
     * @return the AdvancedThreatProtectionsClient object.
     */
    AdvancedThreatProtectionsClient getAdvancedThreatProtections();

    /**
     * Gets the DeviceSecurityGroupsClient object to access its operations.
     * 
     * @return the DeviceSecurityGroupsClient object.
     */
    DeviceSecurityGroupsClient getDeviceSecurityGroups();

    /**
     * Gets the IotSecuritySolutionAnalyticsClient object to access its operations.
     * 
     * @return the IotSecuritySolutionAnalyticsClient object.
     */
    IotSecuritySolutionAnalyticsClient getIotSecuritySolutionAnalytics();

    /**
     * Gets the IotSecuritySolutionsAnalyticsAggregatedAlertsClient object to access its operations.
     * 
     * @return the IotSecuritySolutionsAnalyticsAggregatedAlertsClient object.
     */
    IotSecuritySolutionsAnalyticsAggregatedAlertsClient getIotSecuritySolutionsAnalyticsAggregatedAlerts();

    /**
     * Gets the IotSecuritySolutionsAnalyticsRecommendationsClient object to access its operations.
     * 
     * @return the IotSecuritySolutionsAnalyticsRecommendationsClient object.
     */
    IotSecuritySolutionsAnalyticsRecommendationsClient getIotSecuritySolutionsAnalyticsRecommendations();

    /**
     * Gets the IotSecuritySolutionsClient object to access its operations.
     * 
     * @return the IotSecuritySolutionsClient object.
     */
    IotSecuritySolutionsClient getIotSecuritySolutions();

    /**
     * Gets the AdaptiveNetworkHardeningsClient object to access its operations.
     * 
     * @return the AdaptiveNetworkHardeningsClient object.
     */
    AdaptiveNetworkHardeningsClient getAdaptiveNetworkHardenings();

    /**
     * Gets the AllowedConnectionsClient object to access its operations.
     * 
     * @return the AllowedConnectionsClient object.
     */
    AllowedConnectionsClient getAllowedConnections();

    /**
     * Gets the AdaptiveApplicationControlsClient object to access its operations.
     * 
     * @return the AdaptiveApplicationControlsClient object.
     */
    AdaptiveApplicationControlsClient getAdaptiveApplicationControls();

    /**
     * Gets the DiscoveredSecuritySolutionsClient object to access its operations.
     * 
     * @return the DiscoveredSecuritySolutionsClient object.
     */
    DiscoveredSecuritySolutionsClient getDiscoveredSecuritySolutions();

    /**
     * Gets the ExternalSecuritySolutionsClient object to access its operations.
     * 
     * @return the ExternalSecuritySolutionsClient object.
     */
    ExternalSecuritySolutionsClient getExternalSecuritySolutions();

    /**
     * Gets the JitNetworkAccessPoliciesClient object to access its operations.
     * 
     * @return the JitNetworkAccessPoliciesClient object.
     */
    JitNetworkAccessPoliciesClient getJitNetworkAccessPolicies();

    /**
     * Gets the SecureScoresClient object to access its operations.
     * 
     * @return the SecureScoresClient object.
     */
    SecureScoresClient getSecureScores();

    /**
     * Gets the SecureScoreControlsClient object to access its operations.
     * 
     * @return the SecureScoreControlsClient object.
     */
    SecureScoreControlsClient getSecureScoreControls();

    /**
     * Gets the SecureScoreControlDefinitionsClient object to access its operations.
     * 
     * @return the SecureScoreControlDefinitionsClient object.
     */
    SecureScoreControlDefinitionsClient getSecureScoreControlDefinitions();

    /**
     * Gets the SecuritySolutionsClient object to access its operations.
     * 
     * @return the SecuritySolutionsClient object.
     */
    SecuritySolutionsClient getSecuritySolutions();

    /**
     * Gets the SecuritySolutionsReferenceDatasClient object to access its operations.
     * 
     * @return the SecuritySolutionsReferenceDatasClient object.
     */
    SecuritySolutionsReferenceDatasClient getSecuritySolutionsReferenceDatas();

    /**
     * Gets the ServerVulnerabilityAssessmentsClient object to access its operations.
     * 
     * @return the ServerVulnerabilityAssessmentsClient object.
     */
    ServerVulnerabilityAssessmentsClient getServerVulnerabilityAssessments();

    /**
     * Gets the TopologiesClient object to access its operations.
     * 
     * @return the TopologiesClient object.
     */
    TopologiesClient getTopologies();

    /**
     * Gets the AssessmentsMetadatasClient object to access its operations.
     * 
     * @return the AssessmentsMetadatasClient object.
     */
    AssessmentsMetadatasClient getAssessmentsMetadatas();

    /**
     * Gets the AssessmentsClient object to access its operations.
     * 
     * @return the AssessmentsClient object.
     */
    AssessmentsClient getAssessments();

    /**
     * Gets the AlertsClient object to access its operations.
     * 
     * @return the AlertsClient object.
     */
    AlertsClient getAlerts();

    /**
     * Gets the SettingsClient object to access its operations.
     * 
     * @return the SettingsClient object.
     */
    SettingsClient getSettings();

    /**
     * Gets the ServerVulnerabilityAssessmentsSettingsClient object to access its operations.
     * 
     * @return the ServerVulnerabilityAssessmentsSettingsClient object.
     */
    ServerVulnerabilityAssessmentsSettingsClient getServerVulnerabilityAssessmentsSettings();

    /**
     * Gets the ApiCollectionsClient object to access its operations.
     * 
     * @return the ApiCollectionsClient object.
     */
    ApiCollectionsClient getApiCollections();

    /**
     * Gets the PricingsClient object to access its operations.
     * 
     * @return the PricingsClient object.
     */
    PricingsClient getPricings();
}
