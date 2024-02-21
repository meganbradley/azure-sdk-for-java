// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The related metadata items for the resource-type. */
@Fluent
public final class MetadataResourceTypeRelated {
    /*
     * The tables related to the resource-type
     */
    @JsonProperty(value = "tables")
    private List<String> tables;

    /*
     * The functions related to the resource-type
     */
    @JsonProperty(value = "functions")
    private List<String> functions;

    /*
     * The categories related to the resource-type
     */
    @JsonProperty(value = "categories")
    private List<String> categories;

    /*
     * The queries related to the resource-type
     */
    @JsonProperty(value = "queries")
    private List<String> queries;

    /*
     * The Log Analytics workspaces related to the resource-type
     */
    @JsonProperty(value = "workspaces")
    private List<String> workspaces;

    /*
     * The Azure resources related to the resource-type
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /** Creates an instance of MetadataResourceTypeRelated class. */
    public MetadataResourceTypeRelated() {}

    /**
     * Get the tables property: The tables related to the resource-type.
     *
     * @return the tables value.
     */
    public List<String> getTables() {
        return this.tables;
    }

    /**
     * Set the tables property: The tables related to the resource-type.
     *
     * @param tables the tables value to set.
     * @return the MetadataResourceTypeRelated object itself.
     */
    public MetadataResourceTypeRelated setTables(List<String> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the functions property: The functions related to the resource-type.
     *
     * @return the functions value.
     */
    public List<String> getFunctions() {
        return this.functions;
    }

    /**
     * Set the functions property: The functions related to the resource-type.
     *
     * @param functions the functions value to set.
     * @return the MetadataResourceTypeRelated object itself.
     */
    public MetadataResourceTypeRelated setFunctions(List<String> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the categories property: The categories related to the resource-type.
     *
     * @return the categories value.
     */
    public List<String> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: The categories related to the resource-type.
     *
     * @param categories the categories value to set.
     * @return the MetadataResourceTypeRelated object itself.
     */
    public MetadataResourceTypeRelated setCategories(List<String> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the queries property: The queries related to the resource-type.
     *
     * @return the queries value.
     */
    public List<String> getQueries() {
        return this.queries;
    }

    /**
     * Set the queries property: The queries related to the resource-type.
     *
     * @param queries the queries value to set.
     * @return the MetadataResourceTypeRelated object itself.
     */
    public MetadataResourceTypeRelated setQueries(List<String> queries) {
        this.queries = queries;
        return this;
    }

    /**
     * Get the workspaces property: The Log Analytics workspaces related to the resource-type.
     *
     * @return the workspaces value.
     */
    public List<String> getWorkspaces() {
        return this.workspaces;
    }

    /**
     * Set the workspaces property: The Log Analytics workspaces related to the resource-type.
     *
     * @param workspaces the workspaces value to set.
     * @return the MetadataResourceTypeRelated object itself.
     */
    public MetadataResourceTypeRelated setWorkspaces(List<String> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    /**
     * Get the resources property: The Azure resources related to the resource-type.
     *
     * @return the resources value.
     */
    public List<String> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: The Azure resources related to the resource-type.
     *
     * @param resources the resources value to set.
     * @return the MetadataResourceTypeRelated object itself.
     */
    public MetadataResourceTypeRelated setResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {}
}
