// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentProactiveDetectionConfigurationInner;
import java.util.List;

/** An immutable client-side representation of ApplicationInsightsComponentProactiveDetectionConfiguration. */
public interface ApplicationInsightsComponentProactiveDetectionConfiguration {
    /**
     * Gets the name property: The rule name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the enabled property: A flag that indicates whether this rule is enabled by the user.
     *
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * Gets the sendEmailsToSubscriptionOwners property: A flag that indicated whether notifications on this rule should
     * be sent to subscription owners.
     *
     * @return the sendEmailsToSubscriptionOwners value.
     */
    Boolean sendEmailsToSubscriptionOwners();

    /**
     * Gets the customEmails property: Custom email addresses for this rule notifications.
     *
     * @return the customEmails value.
     */
    List<String> customEmails();

    /**
     * Gets the lastUpdatedTime property: The last time this rule was updated.
     *
     * @return the lastUpdatedTime value.
     */
    String lastUpdatedTime();

    /**
     * Gets the ruleDefinitions property: Static definitions of the ProactiveDetection configuration rule (same values
     * for all components).
     *
     * @return the ruleDefinitions value.
     */
    ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions ruleDefinitions();

    /**
     * Gets the inner
     * com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentProactiveDetectionConfigurationInner
     * object.
     *
     * @return the inner object.
     */
    ApplicationInsightsComponentProactiveDetectionConfigurationInner innerModel();
}
