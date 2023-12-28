// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Migration sub state details. */
@Fluent
public final class MigrationSubStateDetails {
    /*
     * Migration sub state.
     */
    @JsonProperty(value = "currentSubState", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationSubState currentSubState;

    /*
     * Dictionary of <DbMigrationStatus>
     */
    @JsonProperty(value = "dbDetails")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, DbMigrationStatus> dbDetails;

    /*
     * Details for the validation for migration
     */
    @JsonProperty(value = "validationDetails")
    private ValidationDetails validationDetails;

    /** Creates an instance of MigrationSubStateDetails class. */
    public MigrationSubStateDetails() {
    }

    /**
     * Get the currentSubState property: Migration sub state.
     *
     * @return the currentSubState value.
     */
    public MigrationSubState currentSubState() {
        return this.currentSubState;
    }

    /**
     * Get the dbDetails property: Dictionary of &lt;DbMigrationStatus&gt;.
     *
     * @return the dbDetails value.
     */
    public Map<String, DbMigrationStatus> dbDetails() {
        return this.dbDetails;
    }

    /**
     * Set the dbDetails property: Dictionary of &lt;DbMigrationStatus&gt;.
     *
     * @param dbDetails the dbDetails value to set.
     * @return the MigrationSubStateDetails object itself.
     */
    public MigrationSubStateDetails withDbDetails(Map<String, DbMigrationStatus> dbDetails) {
        this.dbDetails = dbDetails;
        return this;
    }

    /**
     * Get the validationDetails property: Details for the validation for migration.
     *
     * @return the validationDetails value.
     */
    public ValidationDetails validationDetails() {
        return this.validationDetails;
    }

    /**
     * Set the validationDetails property: Details for the validation for migration.
     *
     * @param validationDetails the validationDetails value to set.
     * @return the MigrationSubStateDetails object itself.
     */
    public MigrationSubStateDetails withValidationDetails(ValidationDetails validationDetails) {
        this.validationDetails = validationDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dbDetails() != null) {
            dbDetails()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (validationDetails() != null) {
            validationDetails().validate();
        }
    }
}
