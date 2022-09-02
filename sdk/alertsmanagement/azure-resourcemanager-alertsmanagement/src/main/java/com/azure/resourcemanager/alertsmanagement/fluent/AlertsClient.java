// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.alertsmanagement.fluent.models.AlertInner;
import com.azure.resourcemanager.alertsmanagement.fluent.models.AlertModificationInner;
import com.azure.resourcemanager.alertsmanagement.fluent.models.AlertsMetadataInner;
import com.azure.resourcemanager.alertsmanagement.fluent.models.AlertsSummaryInner;
import com.azure.resourcemanager.alertsmanagement.models.AlertState;
import com.azure.resourcemanager.alertsmanagement.models.AlertsSortByFields;
import com.azure.resourcemanager.alertsmanagement.models.AlertsSummaryGroupByFields;
import com.azure.resourcemanager.alertsmanagement.models.Identifier;
import com.azure.resourcemanager.alertsmanagement.models.MonitorCondition;
import com.azure.resourcemanager.alertsmanagement.models.MonitorService;
import com.azure.resourcemanager.alertsmanagement.models.Severity;
import com.azure.resourcemanager.alertsmanagement.models.SortOrder;
import com.azure.resourcemanager.alertsmanagement.models.TimeRange;

/** An instance of this class provides access to all the operations defined in AlertsClient. */
public interface AlertsClient {
    /**
     * List alerts meta data information based on value of identifier parameter.
     *
     * @param identifier Identification of the information to be retrieved by API call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alert meta data information.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AlertsMetadataInner metadata(Identifier identifier);

    /**
     * List alerts meta data information based on value of identifier parameter.
     *
     * @param identifier Identification of the information to be retrieved by API call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alert meta data information along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AlertsMetadataInner> metadataWithResponse(Identifier identifier, Context context);

    /**
     * List all existing alerts, where the results can be filtered on the basis of multiple parameters (e.g. time
     * range). The results can then be sorted on the basis specific fields, with the default being lastModifiedDateTime.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list the alerts as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AlertInner> list();

    /**
     * List all existing alerts, where the results can be filtered on the basis of multiple parameters (e.g. time
     * range). The results can then be sorted on the basis specific fields, with the default being lastModifiedDateTime.
     *
     * @param targetResource Filter by target resource( which is full ARM ID) Default value is select all.
     * @param targetResourceType Filter by target resource type. Default value is select all.
     * @param targetResourceGroup Filter by target resource group name. Default value is select all.
     * @param monitorService Filter by monitor service which generates the alert instance. Default value is select all.
     * @param monitorCondition Filter by monitor condition which is either 'Fired' or 'Resolved'. Default value is to
     *     select all.
     * @param severity Filter by severity. Default value is select all.
     * @param alertState Filter by state of the alert instance. Default value is to select all.
     * @param alertRule Filter by specific alert rule. Default value is to select all.
     * @param smartGroupId Filter the alerts list by the Smart Group Id. Default value is none.
     * @param includeContext Include context which has contextual data specific to the monitor service. Default value is
     *     false'.
     * @param includeEgressConfig Include egress config which would be used for displaying the content in portal.
     *     Default value is 'false'.
     * @param pageCount Determines number of alerts returned per page in response. Permissible value is between 1 to
     *     250. When the "includeContent" filter is selected, maximum value allowed is 25. Default value is 25.
     * @param sortBy Sort the query results by input field, Default value is 'lastModifiedDateTime'.
     * @param sortOrder Sort the query results order in either ascending or descending. Default value is 'desc' for time
     *     fields and 'asc' for others.
     * @param select This filter allows to selection of the fields(comma separated) which would be part of the essential
     *     section. This would allow to project only the required fields rather than getting entire content. Default is
     *     to fetch all the fields in the essentials section.
     * @param timeRange Filter by time range by below listed values. Default value is 1 day.
     * @param customTimeRange Filter by custom time range in the format &lt;start-time&gt;/&lt;end-time&gt; where time
     *     is in (ISO-8601 format)'. Permissible values is within 30 days from query time. Either timeRange or
     *     customTimeRange could be used but not both. Default is none.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list the alerts as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AlertInner> list(
        String targetResource,
        String targetResourceType,
        String targetResourceGroup,
        MonitorService monitorService,
        MonitorCondition monitorCondition,
        Severity severity,
        AlertState alertState,
        String alertRule,
        String smartGroupId,
        Boolean includeContext,
        Boolean includeEgressConfig,
        Long pageCount,
        AlertsSortByFields sortBy,
        SortOrder sortOrder,
        String select,
        TimeRange timeRange,
        String customTimeRange,
        Context context);

    /**
     * Get a specific alert.
     *
     * <p>Get information related to a specific alert.
     *
     * @param alertId Unique ID of an alert instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information related to a specific alert.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AlertInner getById(String alertId);

    /**
     * Get a specific alert.
     *
     * <p>Get information related to a specific alert.
     *
     * @param alertId Unique ID of an alert instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information related to a specific alert along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AlertInner> getByIdWithResponse(String alertId, Context context);

    /**
     * Change the state of an alert.
     *
     * @param alertId Unique ID of an alert instance.
     * @param newState New state of the alert.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an alert created in alert management service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AlertInner changeState(String alertId, AlertState newState);

    /**
     * Change the state of an alert.
     *
     * @param alertId Unique ID of an alert instance.
     * @param newState New state of the alert.
     * @param comment reason of change alert state.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an alert created in alert management service along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AlertInner> changeStateWithResponse(String alertId, AlertState newState, String comment, Context context);

    /**
     * Get the history of an alert, which captures any monitor condition changes (Fired/Resolved) and alert state
     * changes (New/Acknowledged/Closed).
     *
     * @param alertId Unique ID of an alert instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the history of an alert, which captures any monitor condition changes (Fired/Resolved) and alert state
     *     changes (New/Acknowledged/Closed).
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AlertModificationInner getHistory(String alertId);

    /**
     * Get the history of an alert, which captures any monitor condition changes (Fired/Resolved) and alert state
     * changes (New/Acknowledged/Closed).
     *
     * @param alertId Unique ID of an alert instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the history of an alert, which captures any monitor condition changes (Fired/Resolved) and alert state
     *     changes (New/Acknowledged/Closed) along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AlertModificationInner> getHistoryWithResponse(String alertId, Context context);

    /**
     * Get a summarized count of your alerts grouped by various parameters (e.g. grouping by 'Severity' returns the
     * count of alerts for each severity).
     *
     * @param groupby This parameter allows the result set to be grouped by input fields (Maximum 2 comma separated
     *     fields supported). For example, groupby=severity or groupby=severity,alertstate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a summarized count of your alerts grouped by various parameters (e.g.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AlertsSummaryInner getSummary(AlertsSummaryGroupByFields groupby);

    /**
     * Get a summarized count of your alerts grouped by various parameters (e.g. grouping by 'Severity' returns the
     * count of alerts for each severity).
     *
     * @param groupby This parameter allows the result set to be grouped by input fields (Maximum 2 comma separated
     *     fields supported). For example, groupby=severity or groupby=severity,alertstate.
     * @param includeSmartGroupsCount Include count of the SmartGroups as part of the summary. Default value is 'false'.
     * @param targetResource Filter by target resource( which is full ARM ID) Default value is select all.
     * @param targetResourceType Filter by target resource type. Default value is select all.
     * @param targetResourceGroup Filter by target resource group name. Default value is select all.
     * @param monitorService Filter by monitor service which generates the alert instance. Default value is select all.
     * @param monitorCondition Filter by monitor condition which is either 'Fired' or 'Resolved'. Default value is to
     *     select all.
     * @param severity Filter by severity. Default value is select all.
     * @param alertState Filter by state of the alert instance. Default value is to select all.
     * @param alertRule Filter by specific alert rule. Default value is to select all.
     * @param timeRange Filter by time range by below listed values. Default value is 1 day.
     * @param customTimeRange Filter by custom time range in the format &lt;start-time&gt;/&lt;end-time&gt; where time
     *     is in (ISO-8601 format)'. Permissible values is within 30 days from query time. Either timeRange or
     *     customTimeRange could be used but not both. Default is none.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a summarized count of your alerts grouped by various parameters (e.g along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AlertsSummaryInner> getSummaryWithResponse(
        AlertsSummaryGroupByFields groupby,
        Boolean includeSmartGroupsCount,
        String targetResource,
        String targetResourceType,
        String targetResourceGroup,
        MonitorService monitorService,
        MonitorCondition monitorCondition,
        Severity severity,
        AlertState alertState,
        String alertRule,
        TimeRange timeRange,
        String customTimeRange,
        Context context);
}
