// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.AlertInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Alert. */
public interface Alert {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of Alert.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the title property: Alert title.
     *
     * @return the title value.
     */
    String title();

    /**
     * Gets the alertType property: Alert type.
     *
     * @return the alertType value.
     */
    String alertType();

    /**
     * Gets the appearedAtDateTime property: UTC time when the alert appeared.
     *
     * @return the appearedAtDateTime value.
     */
    OffsetDateTime appearedAtDateTime();

    /**
     * Gets the recommendation property: Alert recommendation.
     *
     * @return the recommendation value.
     */
    String recommendation();

    /**
     * Gets the severity property: Severity of the alert.
     *
     * @return the severity value.
     */
    AlertSeverity severity();

    /**
     * Gets the errorDetails property: Error details of the alert.
     *
     * @return the errorDetails value.
     */
    AlertErrorDetails errorDetails();

    /**
     * Gets the detailedInformation property: Alert details.
     *
     * @return the detailedInformation value.
     */
    Map<String, String> detailedInformation();

    /**
     * Gets the inner com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.AlertInner object.
     *
     * @return the inner object.
     */
    AlertInner innerModel();
}
