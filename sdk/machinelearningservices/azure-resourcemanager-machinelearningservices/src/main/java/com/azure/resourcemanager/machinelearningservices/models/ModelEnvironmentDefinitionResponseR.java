// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

/** Settings for a R environment. */
@Immutable
public final class ModelEnvironmentDefinitionResponseR extends RSectionResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ModelEnvironmentDefinitionResponseR.class);

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseR withRVersion(String rVersion) {
        super.withRVersion(rVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseR withUserManaged(Boolean userManaged) {
        super.withUserManaged(userManaged);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseR withRscriptPath(String rscriptPath) {
        super.withRscriptPath(rscriptPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseR withSnapshotDate(String snapshotDate) {
        super.withSnapshotDate(snapshotDate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseR withCranPackages(List<RCranPackage> cranPackages) {
        super.withCranPackages(cranPackages);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseR withGitHubPackages(List<RGitHubPackageResponse> gitHubPackages) {
        super.withGitHubPackages(gitHubPackages);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseR withCustomUrlPackages(List<String> customUrlPackages) {
        super.withCustomUrlPackages(customUrlPackages);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ModelEnvironmentDefinitionResponseR withBioConductorPackages(List<String> bioConductorPackages) {
        super.withBioConductorPackages(bioConductorPackages);
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
    }
}
