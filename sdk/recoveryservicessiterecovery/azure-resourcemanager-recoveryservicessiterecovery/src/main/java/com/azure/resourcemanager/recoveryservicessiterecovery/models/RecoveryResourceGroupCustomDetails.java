// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Recovery Resource Group custom input.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "resourceType",
    defaultImpl = RecoveryResourceGroupCustomDetails.class)
@JsonTypeName("RecoveryResourceGroupCustomDetails")
@JsonSubTypes({ @JsonSubTypes.Type(name = "Existing", value = ExistingRecoveryResourceGroup.class) })
@Immutable
public class RecoveryResourceGroupCustomDetails {
    /**
     * Creates an instance of RecoveryResourceGroupCustomDetails class.
     */
    public RecoveryResourceGroupCustomDetails() {
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
