// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesdatareplication.models;

import com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.DeploymentPreflightModelInner;
import java.util.List;

/** An immutable client-side representation of DeploymentPreflightModel. */
public interface DeploymentPreflightModel {
    /**
     * Gets the resources property: Gets or sets the list of resources.
     *
     * @return the resources value.
     */
    List<DeploymentPreflightResource> resources();

    /**
     * Gets the inner
     * com.azure.resourcemanager.recoveryservicesdatareplication.fluent.models.DeploymentPreflightModelInner object.
     *
     * @return the inner object.
     */
    DeploymentPreflightModelInner innerModel();
}
