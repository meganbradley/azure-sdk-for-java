// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Base class for feature request.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "featureType",
    defaultImpl = FeatureSupportRequest.class)
@JsonTypeName("FeatureSupportRequest")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureBackupGoals", value = AzureBackupGoalFeatureSupportRequest.class),
    @JsonSubTypes.Type(name = "AzureVMResourceBackup", value = AzureVMResourceFeatureSupportRequest.class) })
@Immutable
public class FeatureSupportRequest {
    /**
     * Creates an instance of FeatureSupportRequest class.
     */
    public FeatureSupportRequest() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
