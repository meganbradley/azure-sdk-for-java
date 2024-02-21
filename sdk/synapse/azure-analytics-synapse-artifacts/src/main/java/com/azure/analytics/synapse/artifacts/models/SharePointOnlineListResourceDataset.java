// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * The sharepoint online list resource dataset.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SharePointOnlineListResource")
@JsonFlatten
@Fluent
public class SharePointOnlineListResourceDataset extends Dataset {
    /*
     * The name of the SharePoint Online list. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.listName")
    private Object listName;

    /**
     * Creates an instance of SharePointOnlineListResourceDataset class.
     */
    public SharePointOnlineListResourceDataset() {
    }

    /**
     * Get the listName property: The name of the SharePoint Online list. Type: string (or Expression with resultType
     * string).
     * 
     * @return the listName value.
     */
    public Object getListName() {
        return this.listName;
    }

    /**
     * Set the listName property: The name of the SharePoint Online list. Type: string (or Expression with resultType
     * string).
     * 
     * @param listName the listName value to set.
     * @return the SharePointOnlineListResourceDataset object itself.
     */
    public SharePointOnlineListResourceDataset setListName(Object listName) {
        this.listName = listName;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SharePointOnlineListResourceDataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
