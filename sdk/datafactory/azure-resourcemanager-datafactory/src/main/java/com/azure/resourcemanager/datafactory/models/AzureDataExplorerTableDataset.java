// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.AzureDataExplorerDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Azure Data Explorer (Kusto) dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataExplorerTable")
@Fluent
public final class AzureDataExplorerTableDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureDataExplorerTableDataset.class);

    /*
     * Azure Data Explorer (Kusto) dataset properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private AzureDataExplorerDatasetTypeProperties innerTypeProperties = new AzureDataExplorerDatasetTypeProperties();

    /**
     * Get the innerTypeProperties property: Azure Data Explorer (Kusto) dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private AzureDataExplorerDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataExplorerTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the table property: The table name of the Azure Data Explorer database. Type: string (or Expression with
     * resultType string).
     *
     * @return the table value.
     */
    public Object table() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().table();
    }

    /**
     * Set the table property: The table name of the Azure Data Explorer database. Type: string (or Expression with
     * resultType string).
     *
     * @param table the table value to set.
     * @return the AzureDataExplorerTableDataset object itself.
     */
    public AzureDataExplorerTableDataset withTable(Object table) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureDataExplorerDatasetTypeProperties();
        }
        this.innerTypeProperties().withTable(table);
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
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model AzureDataExplorerTableDataset"));
        } else {
            innerTypeProperties().validate();
        }
    }
}
