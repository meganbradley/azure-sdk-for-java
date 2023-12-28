// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Schedule. */
public interface Schedule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the status property: The status of the schedule (i.e. Enabled, Disabled).
     *
     * @return the status value.
     */
    EnableStatus status();

    /**
     * Gets the taskType property: The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
     *
     * @return the taskType value.
     */
    String taskType();

    /**
     * Gets the weeklyRecurrence property: If the schedule will occur only some days of the week, specify the weekly
     * recurrence.
     *
     * @return the weeklyRecurrence value.
     */
    WeekDetails weeklyRecurrence();

    /**
     * Gets the dailyRecurrence property: If the schedule will occur once each day of the week, specify the daily
     * recurrence.
     *
     * @return the dailyRecurrence value.
     */
    DayDetails dailyRecurrence();

    /**
     * Gets the hourlyRecurrence property: If the schedule will occur multiple times a day, specify the hourly
     * recurrence.
     *
     * @return the hourlyRecurrence value.
     */
    HourDetails hourlyRecurrence();

    /**
     * Gets the timeZoneId property: The time zone ID (e.g. China Standard Time, Greenland Standard Time, Pacific
     * Standard time, etc.). The possible values for this property can be found in `IReadOnlyCollection&lt;string&gt;
     * TimeZoneConverter.TZConvert.KnownWindowsTimeZoneIds`
     * (https://github.com/mattjohnsonpint/TimeZoneConverter/blob/main/README.md).
     *
     * @return the timeZoneId value.
     */
    String timeZoneId();

    /**
     * Gets the notificationSettings property: Notification settings.
     *
     * @return the notificationSettings value.
     */
    NotificationSettings notificationSettings();

    /**
     * Gets the createdDate property: The creation date of the schedule.
     *
     * @return the createdDate value.
     */
    OffsetDateTime createdDate();

    /**
     * Gets the targetResourceId property: The resource ID to which the schedule belongs.
     *
     * @return the targetResourceId value.
     */
    String targetResourceId();

    /**
     * Gets the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devtestlabs.fluent.models.ScheduleInner object.
     *
     * @return the inner object.
     */
    ScheduleInner innerModel();

    /** The entirety of the Schedule definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }

    /** The Schedule definition stages. */
    interface DefinitionStages {
        /** The first stage of the Schedule definition. */
        interface Blank extends WithLocation {
        }

        /** The stage of the Schedule definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /** The stage of the Schedule definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the Schedule definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithStatus,
                DefinitionStages.WithTaskType,
                DefinitionStages.WithWeeklyRecurrence,
                DefinitionStages.WithDailyRecurrence,
                DefinitionStages.WithHourlyRecurrence,
                DefinitionStages.WithTimeZoneId,
                DefinitionStages.WithNotificationSettings,
                DefinitionStages.WithTargetResourceId {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Schedule create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Schedule create(Context context);
        }

        /** The stage of the Schedule definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /** The stage of the Schedule definition allowing to specify status. */
        interface WithStatus {
            /**
             * Specifies the status property: The status of the schedule (i.e. Enabled, Disabled).
             *
             * @param status The status of the schedule (i.e. Enabled, Disabled).
             * @return the next definition stage.
             */
            WithCreate withStatus(EnableStatus status);
        }

        /** The stage of the Schedule definition allowing to specify taskType. */
        interface WithTaskType {
            /**
             * Specifies the taskType property: The task type of the schedule (e.g. LabVmsShutdownTask,
             * LabVmAutoStart)..
             *
             * @param taskType The task type of the schedule (e.g. LabVmsShutdownTask, LabVmAutoStart).
             * @return the next definition stage.
             */
            WithCreate withTaskType(String taskType);
        }

        /** The stage of the Schedule definition allowing to specify weeklyRecurrence. */
        interface WithWeeklyRecurrence {
            /**
             * Specifies the weeklyRecurrence property: If the schedule will occur only some days of the week, specify
             * the weekly recurrence..
             *
             * @param weeklyRecurrence If the schedule will occur only some days of the week, specify the weekly
             *     recurrence.
             * @return the next definition stage.
             */
            WithCreate withWeeklyRecurrence(WeekDetails weeklyRecurrence);
        }

        /** The stage of the Schedule definition allowing to specify dailyRecurrence. */
        interface WithDailyRecurrence {
            /**
             * Specifies the dailyRecurrence property: If the schedule will occur once each day of the week, specify the
             * daily recurrence..
             *
             * @param dailyRecurrence If the schedule will occur once each day of the week, specify the daily
             *     recurrence.
             * @return the next definition stage.
             */
            WithCreate withDailyRecurrence(DayDetails dailyRecurrence);
        }

        /** The stage of the Schedule definition allowing to specify hourlyRecurrence. */
        interface WithHourlyRecurrence {
            /**
             * Specifies the hourlyRecurrence property: If the schedule will occur multiple times a day, specify the
             * hourly recurrence..
             *
             * @param hourlyRecurrence If the schedule will occur multiple times a day, specify the hourly recurrence.
             * @return the next definition stage.
             */
            WithCreate withHourlyRecurrence(HourDetails hourlyRecurrence);
        }

        /** The stage of the Schedule definition allowing to specify timeZoneId. */
        interface WithTimeZoneId {
            /**
             * Specifies the timeZoneId property: The time zone ID (e.g. China Standard Time, Greenland Standard Time,
             * Pacific Standard time, etc.). The possible values for this property can be found in
             * `IReadOnlyCollection&lt;string&gt; TimeZoneConverter.TZConvert.KnownWindowsTimeZoneIds`
             * (https://github.com/mattjohnsonpint/TimeZoneConverter/blob/main/README.md).
             *
             * @param timeZoneId The time zone ID (e.g. China Standard Time, Greenland Standard Time, Pacific Standard
             *     time, etc.). The possible values for this property can be found in `IReadOnlyCollection&lt;string&gt;
             *     TimeZoneConverter.TZConvert.KnownWindowsTimeZoneIds`
             *     (https://github.com/mattjohnsonpint/TimeZoneConverter/blob/main/README.md).
             * @return the next definition stage.
             */
            WithCreate withTimeZoneId(String timeZoneId);
        }

        /** The stage of the Schedule definition allowing to specify notificationSettings. */
        interface WithNotificationSettings {
            /**
             * Specifies the notificationSettings property: Notification settings..
             *
             * @param notificationSettings Notification settings.
             * @return the next definition stage.
             */
            WithCreate withNotificationSettings(NotificationSettings notificationSettings);
        }

        /** The stage of the Schedule definition allowing to specify targetResourceId. */
        interface WithTargetResourceId {
            /**
             * Specifies the targetResourceId property: The resource ID to which the schedule belongs.
             *
             * @param targetResourceId The resource ID to which the schedule belongs.
             * @return the next definition stage.
             */
            WithCreate withTargetResourceId(String targetResourceId);
        }
    }

    /**
     * Begins update for the Schedule resource.
     *
     * @return the stage of resource update.
     */
    Schedule.Update update();

    /** The template for Schedule update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Schedule apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Schedule apply(Context context);
    }

    /** The Schedule update stages. */
    interface UpdateStages {
        /** The stage of the Schedule update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The tags of the resource..
             *
             * @param tags The tags of the resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Schedule refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Schedule refresh(Context context);

    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void execute();

    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void execute(Context context);

    /**
     * Updates a schedule's target resource Id. This operation can take a while to complete.
     *
     * @param retargetScheduleProperties Properties for retargeting a virtual machine schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void retarget(RetargetScheduleProperties retargetScheduleProperties);

    /**
     * Updates a schedule's target resource Id. This operation can take a while to complete.
     *
     * @param retargetScheduleProperties Properties for retargeting a virtual machine schedule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void retarget(RetargetScheduleProperties retargetScheduleProperties, Context context);
}
