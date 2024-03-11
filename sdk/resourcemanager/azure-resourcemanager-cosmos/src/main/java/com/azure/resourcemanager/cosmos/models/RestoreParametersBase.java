// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Parameters to indicate the information about the restore.
 */
@Fluent
public class RestoreParametersBase {
    /*
     * The id of the restorable database account from which the restore has to be initiated. For example:
     * /subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{
     * restorableDatabaseAccountName}
     */
    @JsonProperty(value = "restoreSource")
    private String restoreSource;

    /*
     * Time to which the account has to be restored (ISO-8601 format).
     */
    @JsonProperty(value = "restoreTimestampInUtc")
    private OffsetDateTime restoreTimestampInUtc;

    /*
     * Specifies whether the restored account will have Time-To-Live disabled upon the successful restore.
     */
    @JsonProperty(value = "restoreWithTtlDisabled")
    private Boolean restoreWithTtlDisabled;

    /**
     * Creates an instance of RestoreParametersBase class.
     */
    public RestoreParametersBase() {
    }

    /**
     * Get the restoreSource property: The id of the restorable database account from which the restore has to be
     * initiated. For example:
     * /subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{restorableDatabaseAccountName}.
     * 
     * @return the restoreSource value.
     */
    public String restoreSource() {
        return this.restoreSource;
    }

    /**
     * Set the restoreSource property: The id of the restorable database account from which the restore has to be
     * initiated. For example:
     * /subscriptions/{subscriptionId}/providers/Microsoft.DocumentDB/locations/{location}/restorableDatabaseAccounts/{restorableDatabaseAccountName}.
     * 
     * @param restoreSource the restoreSource value to set.
     * @return the RestoreParametersBase object itself.
     */
    public RestoreParametersBase withRestoreSource(String restoreSource) {
        this.restoreSource = restoreSource;
        return this;
    }

    /**
     * Get the restoreTimestampInUtc property: Time to which the account has to be restored (ISO-8601 format).
     * 
     * @return the restoreTimestampInUtc value.
     */
    public OffsetDateTime restoreTimestampInUtc() {
        return this.restoreTimestampInUtc;
    }

    /**
     * Set the restoreTimestampInUtc property: Time to which the account has to be restored (ISO-8601 format).
     * 
     * @param restoreTimestampInUtc the restoreTimestampInUtc value to set.
     * @return the RestoreParametersBase object itself.
     */
    public RestoreParametersBase withRestoreTimestampInUtc(OffsetDateTime restoreTimestampInUtc) {
        this.restoreTimestampInUtc = restoreTimestampInUtc;
        return this;
    }

    /**
     * Get the restoreWithTtlDisabled property: Specifies whether the restored account will have Time-To-Live disabled
     * upon the successful restore.
     * 
     * @return the restoreWithTtlDisabled value.
     */
    public Boolean restoreWithTtlDisabled() {
        return this.restoreWithTtlDisabled;
    }

    /**
     * Set the restoreWithTtlDisabled property: Specifies whether the restored account will have Time-To-Live disabled
     * upon the successful restore.
     * 
     * @param restoreWithTtlDisabled the restoreWithTtlDisabled value to set.
     * @return the RestoreParametersBase object itself.
     */
    public RestoreParametersBase withRestoreWithTtlDisabled(Boolean restoreWithTtlDisabled) {
        this.restoreWithTtlDisabled = restoreWithTtlDisabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
