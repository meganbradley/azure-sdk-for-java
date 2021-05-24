// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base class for backup copies. Workload-specific backup copies are derived from this class. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = RecoveryPoint.class)
@JsonTypeName("RecoveryPoint")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureFileShareRecoveryPoint", value = AzureFileShareRecoveryPoint.class),
    @JsonSubTypes.Type(name = "AzureWorkloadRecoveryPoint", value = AzureWorkloadRecoveryPoint.class),
    @JsonSubTypes.Type(name = "GenericRecoveryPoint", value = GenericRecoveryPoint.class),
    @JsonSubTypes.Type(name = "IaasVMRecoveryPoint", value = IaasVMRecoveryPoint.class),
    @JsonSubTypes.Type(name = "AzureFileShareRecoveryPoint", value = AzureFileShareRecoveryPointAutoGenerated.class),
    @JsonSubTypes.Type(name = "AzureWorkloadRecoveryPoint", value = AzureWorkloadRecoveryPointAutoGenerated.class),
    @JsonSubTypes.Type(name = "IaasVMRecoveryPoint", value = IaasVMRecoveryPointAutoGenerated.class)
})
@Immutable
public class RecoveryPoint {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecoveryPoint.class);

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
