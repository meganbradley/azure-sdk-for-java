// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureBatchLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Azure Batch linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBatch")
@Fluent
public final class AzureBatchLinkedService extends LinkedService {
    /*
     * Azure Batch linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureBatchLinkedServiceTypeProperties innerTypeProperties = new AzureBatchLinkedServiceTypeProperties();

    /**
     * Creates an instance of AzureBatchLinkedService class.
     */
    public AzureBatchLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Azure Batch linked service properties.
     * 
     * @return the innerTypeProperties value.
     */
    private AzureBatchLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBatchLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBatchLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBatchLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureBatchLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the accountName property: The Azure Batch account name. Type: string (or Expression with resultType string).
     * 
     * @return the accountName value.
     */
    public Object accountName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accountName();
    }

    /**
     * Set the accountName property: The Azure Batch account name. Type: string (or Expression with resultType string).
     * 
     * @param accountName the accountName value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService withAccountName(Object accountName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBatchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccountName(accountName);
        return this;
    }

    /**
     * Get the accessKey property: The Azure Batch account access key.
     * 
     * @return the accessKey value.
     */
    public SecretBase accessKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessKey();
    }

    /**
     * Set the accessKey property: The Azure Batch account access key.
     * 
     * @param accessKey the accessKey value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService withAccessKey(SecretBase accessKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBatchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessKey(accessKey);
        return this;
    }

    /**
     * Get the batchUri property: The Azure Batch URI. Type: string (or Expression with resultType string).
     * 
     * @return the batchUri value.
     */
    public Object batchUri() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().batchUri();
    }

    /**
     * Set the batchUri property: The Azure Batch URI. Type: string (or Expression with resultType string).
     * 
     * @param batchUri the batchUri value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService withBatchUri(Object batchUri) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBatchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withBatchUri(batchUri);
        return this;
    }

    /**
     * Get the poolName property: The Azure Batch pool name. Type: string (or Expression with resultType string).
     * 
     * @return the poolName value.
     */
    public Object poolName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().poolName();
    }

    /**
     * Set the poolName property: The Azure Batch pool name. Type: string (or Expression with resultType string).
     * 
     * @param poolName the poolName value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService withPoolName(Object poolName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBatchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPoolName(poolName);
        return this;
    }

    /**
     * Get the linkedServiceName property: The Azure Storage linked service reference.
     * 
     * @return the linkedServiceName value.
     */
    public LinkedServiceReference linkedServiceName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().linkedServiceName();
    }

    /**
     * Set the linkedServiceName property: The Azure Storage linked service reference.
     * 
     * @param linkedServiceName the linkedServiceName value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBatchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBatchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the credential property: The credential reference containing authentication information.
     * 
     * @return the credential value.
     */
    public CredentialReference credential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().credential();
    }

    /**
     * Set the credential property: The credential reference containing authentication information.
     * 
     * @param credential the credential value to set.
     * @return the AzureBatchLinkedService object itself.
     */
    public AzureBatchLinkedService withCredential(CredentialReference credential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBatchLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withCredential(credential);
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
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property innerTypeProperties in model AzureBatchLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureBatchLinkedService.class);
}
