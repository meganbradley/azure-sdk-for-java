// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Property of git environment. */
@Fluent
public final class ConfigurationServiceGitProperty {
    /*
     * Repositories of Application Configuration Service git property.
     */
    @JsonProperty(value = "repositories")
    private List<ConfigurationServiceGitRepository> repositories;

    /** Creates an instance of ConfigurationServiceGitProperty class. */
    public ConfigurationServiceGitProperty() {
    }

    /**
     * Get the repositories property: Repositories of Application Configuration Service git property.
     *
     * @return the repositories value.
     */
    public List<ConfigurationServiceGitRepository> repositories() {
        return this.repositories;
    }

    /**
     * Set the repositories property: Repositories of Application Configuration Service git property.
     *
     * @param repositories the repositories value to set.
     * @return the ConfigurationServiceGitProperty object itself.
     */
    public ConfigurationServiceGitProperty withRepositories(List<ConfigurationServiceGitRepository> repositories) {
        this.repositories = repositories;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (repositories() != null) {
            repositories().forEach(e -> e.validate());
        }
    }
}
