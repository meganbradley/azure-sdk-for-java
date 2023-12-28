// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.NetezzaTableDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Netezza dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("NetezzaTable")
@Fluent
public final class NetezzaTableDataset extends Dataset {
    /*
     * Properties specific to this dataset type.
     */
    @JsonProperty(value = "typeProperties")
    private NetezzaTableDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of NetezzaTableDataset class.
     */
    public NetezzaTableDataset() {
    }

    /**
     * Get the innerTypeProperties property: Properties specific to this dataset type.
     * 
     * @return the innerTypeProperties value.
     */
    private NetezzaTableDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaTableDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaTableDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaTableDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaTableDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaTableDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaTableDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public NetezzaTableDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tableName();
    }

    /**
     * Set the tableName property: This property will be retired. Please consider using schema + table properties
     * instead.
     * 
     * @param tableName the tableName value to set.
     * @return the NetezzaTableDataset object itself.
     */
    public NetezzaTableDataset withTableName(Object tableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new NetezzaTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTableName(tableName);
        return this;
    }

    /**
     * Get the table property: The table name of the Netezza. Type: string (or Expression with resultType string).
     * 
     * @return the table value.
     */
    public Object table() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().table();
    }

    /**
     * Set the table property: The table name of the Netezza. Type: string (or Expression with resultType string).
     * 
     * @param table the table value to set.
     * @return the NetezzaTableDataset object itself.
     */
    public NetezzaTableDataset withTable(Object table) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new NetezzaTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withTable(table);
        return this;
    }

    /**
     * Get the schema property: The schema name of the Netezza. Type: string (or Expression with resultType string).
     * 
     * @return the schema value.
     */
    public Object schemaTypePropertiesSchema() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().schema();
    }

    /**
     * Set the schema property: The schema name of the Netezza. Type: string (or Expression with resultType string).
     * 
     * @param schema the schema value to set.
     * @return the NetezzaTableDataset object itself.
     */
    public NetezzaTableDataset withSchemaTypePropertiesSchema(Object schema) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new NetezzaTableDatasetTypeProperties();
        }
        this.innerTypeProperties().withSchema(schema);
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
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
