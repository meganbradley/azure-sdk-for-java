// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.resourcemanager.machinelearning.models.AccountKeyDatastoreSecrets;
import com.azure.resourcemanager.machinelearning.models.CertificateDatastoreSecrets;
import com.azure.resourcemanager.machinelearning.models.KerberosKeytabSecrets;
import com.azure.resourcemanager.machinelearning.models.KerberosPasswordSecrets;
import com.azure.resourcemanager.machinelearning.models.SasDatastoreSecrets;
import com.azure.resourcemanager.machinelearning.models.ServicePrincipalDatastoreSecrets;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base definition for datastore secrets. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "secretsType",
    defaultImpl = DatastoreSecretsInner.class)
@JsonTypeName("DatastoreSecrets")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AccountKey", value = AccountKeyDatastoreSecrets.class),
    @JsonSubTypes.Type(name = "Certificate", value = CertificateDatastoreSecrets.class),
    @JsonSubTypes.Type(name = "KerberosKeytab", value = KerberosKeytabSecrets.class),
    @JsonSubTypes.Type(name = "KerberosPassword", value = KerberosPasswordSecrets.class),
    @JsonSubTypes.Type(name = "Sas", value = SasDatastoreSecrets.class),
    @JsonSubTypes.Type(name = "ServicePrincipal", value = ServicePrincipalDatastoreSecrets.class)
})
@Immutable
public class DatastoreSecretsInner {
    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
