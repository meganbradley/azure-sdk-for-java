// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.resourcemanager.chaos.fluent.models.ExperimentExecutionDetailsInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of ExperimentExecutionDetails. */
public interface ExperimentExecutionDetails {
    /**
     * Gets the type property: String of the resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the id property: String of the fully qualified resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: String of the resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the experimentId property: The id of the experiment.
     *
     * @return the experimentId value.
     */
    String experimentId();

    /**
     * Gets the status property: The value of the status of the experiment execution.
     *
     * @return the status value.
     */
    String status();

    /**
     * Gets the failureReason property: The reason why the execution failed.
     *
     * @return the failureReason value.
     */
    String failureReason();

    /**
     * Gets the createdDateTime property: String that represents the created date time.
     *
     * @return the createdDateTime value.
     */
    OffsetDateTime createdDateTime();

    /**
     * Gets the lastActionDateTime property: String that represents the last action date time.
     *
     * @return the lastActionDateTime value.
     */
    OffsetDateTime lastActionDateTime();

    /**
     * Gets the startDateTime property: String that represents the start date time.
     *
     * @return the startDateTime value.
     */
    OffsetDateTime startDateTime();

    /**
     * Gets the stopDateTime property: String that represents the stop date time.
     *
     * @return the stopDateTime value.
     */
    OffsetDateTime stopDateTime();

    /**
     * Gets the runInformation property: The information of the experiment run.
     *
     * @return the runInformation value.
     */
    ExperimentExecutionDetailsPropertiesRunInformation runInformation();

    /**
     * Gets the inner com.azure.resourcemanager.chaos.fluent.models.ExperimentExecutionDetailsInner object.
     *
     * @return the inner object.
     */
    ExperimentExecutionDetailsInner innerModel();
}
