// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.cosmos.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.models.ManagedServiceIdentity;
import com.azure.resourcemanager.cosmos.models.SqlStoredProcedureGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * An Azure Cosmos DB storedProcedure.
 */
@Fluent
public final class SqlStoredProcedureGetResultsInner extends ArmResourceProperties {
    /*
     * The properties of an Azure Cosmos DB storedProcedure
     */
    @JsonProperty(value = "properties")
    private SqlStoredProcedureGetProperties innerProperties;

    /**
     * Creates an instance of SqlStoredProcedureGetResultsInner class.
     */
    public SqlStoredProcedureGetResultsInner() {
    }

    /**
     * Get the innerProperties property: The properties of an Azure Cosmos DB storedProcedure.
     * 
     * @return the innerProperties value.
     */
    private SqlStoredProcedureGetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlStoredProcedureGetResultsInner withIdentity(ManagedServiceIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlStoredProcedureGetResultsInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlStoredProcedureGetResultsInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the resource property: The resource property.
     * 
     * @return the resource value.
     */
    public SqlStoredProcedureGetPropertiesResource resource() {
        return this.innerProperties() == null ? null : this.innerProperties().resource();
    }

    /**
     * Set the resource property: The resource property.
     * 
     * @param resource the resource value to set.
     * @return the SqlStoredProcedureGetResultsInner object itself.
     */
    public SqlStoredProcedureGetResultsInner withResource(SqlStoredProcedureGetPropertiesResource resource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SqlStoredProcedureGetProperties();
        }
        this.innerProperties().withResource(resource);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
