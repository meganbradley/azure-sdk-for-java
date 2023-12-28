// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/**
 * Data flow reference type.
 */
@Fluent
public final class DataFlowReference {
    /*
     * Data flow reference type.
     */
    @JsonProperty(value = "type", required = true)
    private DataFlowReferenceType type;

    /*
     * Reference data flow name.
     */
    @JsonProperty(value = "referenceName", required = true)
    private String referenceName;

    /*
     * Reference data flow parameters from dataset.
     */
    @JsonProperty(value = "datasetParameters")
    private Object datasetParameters;

    /*
     * Data flow parameters
     */
    @JsonProperty(value = "parameters")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Object> parameters;

    /*
     * Data flow reference type.
     */
    @JsonIgnore
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of DataFlowReference class.
     */
    public DataFlowReference() {
    }

    /**
     * Get the type property: Data flow reference type.
     * 
     * @return the type value.
     */
    public DataFlowReferenceType type() {
        return this.type;
    }

    /**
     * Set the type property: Data flow reference type.
     * 
     * @param type the type value to set.
     * @return the DataFlowReference object itself.
     */
    public DataFlowReference withType(DataFlowReferenceType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the referenceName property: Reference data flow name.
     * 
     * @return the referenceName value.
     */
    public String referenceName() {
        return this.referenceName;
    }

    /**
     * Set the referenceName property: Reference data flow name.
     * 
     * @param referenceName the referenceName value to set.
     * @return the DataFlowReference object itself.
     */
    public DataFlowReference withReferenceName(String referenceName) {
        this.referenceName = referenceName;
        return this;
    }

    /**
     * Get the datasetParameters property: Reference data flow parameters from dataset.
     * 
     * @return the datasetParameters value.
     */
    public Object datasetParameters() {
        return this.datasetParameters;
    }

    /**
     * Set the datasetParameters property: Reference data flow parameters from dataset.
     * 
     * @param datasetParameters the datasetParameters value to set.
     * @return the DataFlowReference object itself.
     */
    public DataFlowReference withDatasetParameters(Object datasetParameters) {
        this.datasetParameters = datasetParameters;
        return this;
    }

    /**
     * Get the parameters property: Data flow parameters.
     * 
     * @return the parameters value.
     */
    public Map<String, Object> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: Data flow parameters.
     * 
     * @param parameters the parameters value to set.
     * @return the DataFlowReference object itself.
     */
    public DataFlowReference withParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the additionalProperties property: Data flow reference type.
     * 
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Data flow reference type.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the DataFlowReference object itself.
     */
    public DataFlowReference withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property type in model DataFlowReference"));
        }
        if (referenceName() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property referenceName in model DataFlowReference"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataFlowReference.class);
}
