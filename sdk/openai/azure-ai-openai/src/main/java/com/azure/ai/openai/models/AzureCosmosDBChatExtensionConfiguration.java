// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A specific representation of configurable options for Elasticsearch when using it as an Azure OpenAI chat
 * extension.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureCosmosDB")
@Immutable
public final class AzureCosmosDBChatExtensionConfiguration extends AzureChatExtensionConfiguration {

    /*
     * The parameters to use when configuring Azure OpenAI CosmosDB chat extensions.
     */
    @Generated
    @JsonProperty(value = "parameters")
    private AzureCosmosDBChatExtensionParameters parameters;

    /**
     * Get the parameters property: The parameters to use when configuring Azure OpenAI CosmosDB chat extensions.
     *
     * @return the parameters value.
     */
    @Generated
    public AzureCosmosDBChatExtensionParameters getParameters() {
        return this.parameters;
    }

    /**
     * Creates an instance of AzureCosmosDBChatExtensionConfiguration class.
     *
     * @param parameters the parameters value to set.
     */
    @Generated
    @JsonCreator
    public AzureCosmosDBChatExtensionConfiguration(
        @JsonProperty(value = "parameters") AzureCosmosDBChatExtensionParameters parameters) {
        this.parameters = parameters;
    }
}
