// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ApplicationInsightsManagementClient class. */
public interface ApplicationInsightsManagementClient {
    /**
     * Gets The ID of the target subscription.
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
     * Gets the ComponentsClient object to access its operations.
     *
     * @return the ComponentsClient object.
     */
    ComponentsClient getComponents();

    /**
     * Gets the AnnotationsClient object to access its operations.
     *
     * @return the AnnotationsClient object.
     */
    AnnotationsClient getAnnotations();

    /**
     * Gets the ApiKeysClient object to access its operations.
     *
     * @return the ApiKeysClient object.
     */
    ApiKeysClient getApiKeys();

    /**
     * Gets the ExportConfigurationsClient object to access its operations.
     *
     * @return the ExportConfigurationsClient object.
     */
    ExportConfigurationsClient getExportConfigurations();

    /**
     * Gets the ComponentCurrentBillingFeaturesClient object to access its operations.
     *
     * @return the ComponentCurrentBillingFeaturesClient object.
     */
    ComponentCurrentBillingFeaturesClient getComponentCurrentBillingFeatures();

    /**
     * Gets the ComponentQuotaStatusClient object to access its operations.
     *
     * @return the ComponentQuotaStatusClient object.
     */
    ComponentQuotaStatusClient getComponentQuotaStatus();

    /**
     * Gets the ComponentFeatureCapabilitiesClient object to access its operations.
     *
     * @return the ComponentFeatureCapabilitiesClient object.
     */
    ComponentFeatureCapabilitiesClient getComponentFeatureCapabilities();

    /**
     * Gets the ComponentAvailableFeaturesClient object to access its operations.
     *
     * @return the ComponentAvailableFeaturesClient object.
     */
    ComponentAvailableFeaturesClient getComponentAvailableFeatures();

    /**
     * Gets the ProactiveDetectionConfigurationsClient object to access its operations.
     *
     * @return the ProactiveDetectionConfigurationsClient object.
     */
    ProactiveDetectionConfigurationsClient getProactiveDetectionConfigurations();

    /**
     * Gets the WorkItemConfigurationsClient object to access its operations.
     *
     * @return the WorkItemConfigurationsClient object.
     */
    WorkItemConfigurationsClient getWorkItemConfigurations();

    /**
     * Gets the FavoritesClient object to access its operations.
     *
     * @return the FavoritesClient object.
     */
    FavoritesClient getFavorites();

    /**
     * Gets the WebTestLocationsClient object to access its operations.
     *
     * @return the WebTestLocationsClient object.
     */
    WebTestLocationsClient getWebTestLocations();

    /**
     * Gets the WebTestsClient object to access its operations.
     *
     * @return the WebTestsClient object.
     */
    WebTestsClient getWebTests();

    /**
     * Gets the AnalyticsItemsClient object to access its operations.
     *
     * @return the AnalyticsItemsClient object.
     */
    AnalyticsItemsClient getAnalyticsItems();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the WorkbookTemplatesClient object to access its operations.
     *
     * @return the WorkbookTemplatesClient object.
     */
    WorkbookTemplatesClient getWorkbookTemplates();

    /**
     * Gets the MyWorkbooksClient object to access its operations.
     *
     * @return the MyWorkbooksClient object.
     */
    MyWorkbooksClient getMyWorkbooks();

    /**
     * Gets the WorkbooksClient object to access its operations.
     *
     * @return the WorkbooksClient object.
     */
    WorkbooksClient getWorkbooks();

    /**
     * Gets the LiveTokensClient object to access its operations.
     *
     * @return the LiveTokensClient object.
     */
    LiveTokensClient getLiveTokens();
}
