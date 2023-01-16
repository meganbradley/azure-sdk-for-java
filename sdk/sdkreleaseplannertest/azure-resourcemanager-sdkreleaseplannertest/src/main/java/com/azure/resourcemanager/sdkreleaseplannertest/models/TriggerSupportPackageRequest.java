// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.SupportPackageRequestProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The request object for trigger support package. */
@Fluent
public final class TriggerSupportPackageRequest extends ArmBaseModel {
    /*
     * The TriggerSupportPackageRequest properties.
     */
    @JsonProperty(value = "properties", required = true)
    private SupportPackageRequestProperties innerProperties = new SupportPackageRequestProperties();

    /** Creates an instance of TriggerSupportPackageRequest class. */
    public TriggerSupportPackageRequest() {
    }

    /**
     * Get the innerProperties property: The TriggerSupportPackageRequest properties.
     *
     * @return the innerProperties value.
     */
    private SupportPackageRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the minimumTimestamp property: MinimumTimeStamp from where logs need to be collected.
     *
     * @return the minimumTimestamp value.
     */
    public OffsetDateTime minimumTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTimestamp();
    }

    /**
     * Set the minimumTimestamp property: MinimumTimeStamp from where logs need to be collected.
     *
     * @param minimumTimestamp the minimumTimestamp value to set.
     * @return the TriggerSupportPackageRequest object itself.
     */
    public TriggerSupportPackageRequest withMinimumTimestamp(OffsetDateTime minimumTimestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportPackageRequestProperties();
        }
        this.innerProperties().withMinimumTimestamp(minimumTimestamp);
        return this;
    }

    /**
     * Get the maximumTimestamp property: Start of the timespan of the log collection.
     *
     * @return the maximumTimestamp value.
     */
    public OffsetDateTime maximumTimestamp() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumTimestamp();
    }

    /**
     * Set the maximumTimestamp property: Start of the timespan of the log collection.
     *
     * @param maximumTimestamp the maximumTimestamp value to set.
     * @return the TriggerSupportPackageRequest object itself.
     */
    public TriggerSupportPackageRequest withMaximumTimestamp(OffsetDateTime maximumTimestamp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportPackageRequestProperties();
        }
        this.innerProperties().withMaximumTimestamp(maximumTimestamp);
        return this;
    }

    /**
     * Get the include property: Type of files, which need to be included in the logs This will contain the type of logs
     * (Default/DefaultWithDumps/None/All/DefaultWithArchived) or a comma separated list of log types that are required.
     *
     * @return the include value.
     */
    public String include() {
        return this.innerProperties() == null ? null : this.innerProperties().include();
    }

    /**
     * Set the include property: Type of files, which need to be included in the logs This will contain the type of logs
     * (Default/DefaultWithDumps/None/All/DefaultWithArchived) or a comma separated list of log types that are required.
     *
     * @param include the include value to set.
     * @return the TriggerSupportPackageRequest object itself.
     */
    public TriggerSupportPackageRequest withInclude(String include) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SupportPackageRequestProperties();
        }
        this.innerProperties().withInclude(include);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model TriggerSupportPackageRequest"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TriggerSupportPackageRequest.class);
}
