// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.GenericDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * Xero Service dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = XeroObjectDataset.class, visible = true)
@JsonTypeName("XeroObject")
@Fluent
public final class XeroObjectDataset extends Dataset {
    /*
     * Type of dataset.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "XeroObject";

    /*
     * Properties specific to this dataset type.
     */
    @JsonProperty(value = "typeProperties")
    private GenericDatasetTypeProperties innerTypeProperties;

    /**
     * Creates an instance of XeroObjectDataset class.
     */
    public XeroObjectDataset() {
    }

    /**
     * Get the type property: Type of dataset.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Properties specific to this dataset type.
     * 
     * @return the innerTypeProperties value.
     */
    private GenericDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroObjectDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroObjectDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroObjectDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroObjectDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroObjectDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroObjectDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public XeroObjectDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the tableName property: The table name. Type: string (or Expression with resultType string).
     * 
     * @return the tableName value.
     */
    public Object tableName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().tableName();
    }

    /**
     * Set the tableName property: The table name. Type: string (or Expression with resultType string).
     * 
     * @param tableName the tableName value to set.
     * @return the XeroObjectDataset object itself.
     */
    public XeroObjectDataset withTableName(Object tableName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new GenericDatasetTypeProperties();
        }
        this.innerTypeProperties().withTableName(tableName);
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
