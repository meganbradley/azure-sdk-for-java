// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.appservice.models.BuildStatus;
import com.azure.resourcemanager.appservice.models.DatabaseConnectionOverview;
import com.azure.resourcemanager.appservice.models.StaticSiteLinkedBackend;
import com.azure.resourcemanager.appservice.models.StaticSiteUserProvidedFunctionApp;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** StaticSiteBuildARMResource resource specific properties. */
@Immutable
public final class StaticSiteBuildArmResourceProperties {
    /*
     * An identifier for the static site build.
     */
    @JsonProperty(value = "buildId", access = JsonProperty.Access.WRITE_ONLY)
    private String buildId;

    /*
     * The source branch.
     */
    @JsonProperty(value = "sourceBranch", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceBranch;

    /*
     * The title of a pull request that a static site build is related to.
     */
    @JsonProperty(value = "pullRequestTitle", access = JsonProperty.Access.WRITE_ONLY)
    private String pullRequestTitle;

    /*
     * The hostname for a static site build.
     */
    @JsonProperty(value = "hostname", access = JsonProperty.Access.WRITE_ONLY)
    private String hostname;

    /*
     * When this build was created.
     */
    @JsonProperty(value = "createdTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTimeUtc;

    /*
     * When this build was updated.
     */
    @JsonProperty(value = "lastUpdatedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedOn;

    /*
     * The status of the static site build.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private BuildStatus status;

    /*
     * User provided function apps registered with the static site build
     */
    @JsonProperty(value = "userProvidedFunctionApps", access = JsonProperty.Access.WRITE_ONLY)
    private List<StaticSiteUserProvidedFunctionApp> userProvidedFunctionApps;

    /*
     * Backends linked to the static side build
     */
    @JsonProperty(value = "linkedBackends", access = JsonProperty.Access.WRITE_ONLY)
    private List<StaticSiteLinkedBackend> linkedBackends;

    /*
     * Database connections for the static site build
     */
    @JsonProperty(value = "databaseConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatabaseConnectionOverview> databaseConnections;

    /** Creates an instance of StaticSiteBuildArmResourceProperties class. */
    public StaticSiteBuildArmResourceProperties() {
    }

    /**
     * Get the buildId property: An identifier for the static site build.
     *
     * @return the buildId value.
     */
    public String buildId() {
        return this.buildId;
    }

    /**
     * Get the sourceBranch property: The source branch.
     *
     * @return the sourceBranch value.
     */
    public String sourceBranch() {
        return this.sourceBranch;
    }

    /**
     * Get the pullRequestTitle property: The title of a pull request that a static site build is related to.
     *
     * @return the pullRequestTitle value.
     */
    public String pullRequestTitle() {
        return this.pullRequestTitle;
    }

    /**
     * Get the hostname property: The hostname for a static site build.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Get the createdTimeUtc property: When this build was created.
     *
     * @return the createdTimeUtc value.
     */
    public OffsetDateTime createdTimeUtc() {
        return this.createdTimeUtc;
    }

    /**
     * Get the lastUpdatedOn property: When this build was updated.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime lastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the status property: The status of the static site build.
     *
     * @return the status value.
     */
    public BuildStatus status() {
        return this.status;
    }

    /**
     * Get the userProvidedFunctionApps property: User provided function apps registered with the static site build.
     *
     * @return the userProvidedFunctionApps value.
     */
    public List<StaticSiteUserProvidedFunctionApp> userProvidedFunctionApps() {
        return this.userProvidedFunctionApps;
    }

    /**
     * Get the linkedBackends property: Backends linked to the static side build.
     *
     * @return the linkedBackends value.
     */
    public List<StaticSiteLinkedBackend> linkedBackends() {
        return this.linkedBackends;
    }

    /**
     * Get the databaseConnections property: Database connections for the static site build.
     *
     * @return the databaseConnections value.
     */
    public List<DatabaseConnectionOverview> databaseConnections() {
        return this.databaseConnections;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userProvidedFunctionApps() != null) {
            userProvidedFunctionApps().forEach(e -> e.validate());
        }
        if (linkedBackends() != null) {
            linkedBackends().forEach(e -> e.validate());
        }
        if (databaseConnections() != null) {
            databaseConnections().forEach(e -> e.validate());
        }
    }
}
