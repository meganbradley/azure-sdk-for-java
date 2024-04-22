// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.logs.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * A metadata response.
 * 
 * The metadata response for the app, including available tables, etc.
 */
@Fluent
public final class MetadataResults implements JsonSerializable<MetadataResults> {
    /*
     * The list of categories that are referenced in this metadata response.
     */
    private List<MetadataCategory> categories;

    /*
     * The list of resource types that are referenced in this metadata response.
     */
    private List<MetadataResourceType> resourceTypes;

    /*
     * The list of Log Analytics solutions installed on the workspace.
     */
    private List<MetadataSolution> solutions;

    /*
     * The list of tables and columns that comprise the schema of the workspace.
     */
    private List<MetadataTable> tables;

    /*
     * The list of functions stored on the workspace, or introduced by solutions etc.
     */
    private List<MetadataFunction> functions;

    /*
     * The list of saved queries stored on the workspace, or introduced by solutions, resource types, etc.
     */
    private List<MetadataQuery> queries;

    /*
     * The list of Application Insights apps that were referenced in the metadata request.
     */
    private List<MetadataApplication> applications;

    /*
     * The list of Log Analytics workspaces that were referenced in the metadata request.
     */
    private List<MetadataWorkspace> workspaces;

    /*
     * The list of Azure resources that were referenced in the metadata request.
     */
    private List<Object> resources;

    /*
     * The list of permission rules that affected the metadata request.
     */
    private List<MetadataPermissions> permissions;

    /**
     * Creates an instance of MetadataResults class.
     */
    public MetadataResults() {
    }

    /**
     * Get the categories property: The list of categories that are referenced in this metadata response.
     * 
     * @return the categories value.
     */
    public List<MetadataCategory> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: The list of categories that are referenced in this metadata response.
     * 
     * @param categories the categories value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setCategories(List<MetadataCategory> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the resourceTypes property: The list of resource types that are referenced in this metadata response.
     * 
     * @return the resourceTypes value.
     */
    public List<MetadataResourceType> getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * Set the resourceTypes property: The list of resource types that are referenced in this metadata response.
     * 
     * @param resourceTypes the resourceTypes value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setResourceTypes(List<MetadataResourceType> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }

    /**
     * Get the solutions property: The list of Log Analytics solutions installed on the workspace.
     * 
     * @return the solutions value.
     */
    public List<MetadataSolution> getSolutions() {
        return this.solutions;
    }

    /**
     * Set the solutions property: The list of Log Analytics solutions installed on the workspace.
     * 
     * @param solutions the solutions value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setSolutions(List<MetadataSolution> solutions) {
        this.solutions = solutions;
        return this;
    }

    /**
     * Get the tables property: The list of tables and columns that comprise the schema of the workspace.
     * 
     * @return the tables value.
     */
    public List<MetadataTable> getTables() {
        return this.tables;
    }

    /**
     * Set the tables property: The list of tables and columns that comprise the schema of the workspace.
     * 
     * @param tables the tables value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setTables(List<MetadataTable> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the functions property: The list of functions stored on the workspace, or introduced by solutions etc.
     * 
     * @return the functions value.
     */
    public List<MetadataFunction> getFunctions() {
        return this.functions;
    }

    /**
     * Set the functions property: The list of functions stored on the workspace, or introduced by solutions etc.
     * 
     * @param functions the functions value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setFunctions(List<MetadataFunction> functions) {
        this.functions = functions;
        return this;
    }

    /**
     * Get the queries property: The list of saved queries stored on the workspace, or introduced by solutions,
     * resource types, etc.
     * 
     * @return the queries value.
     */
    public List<MetadataQuery> getQueries() {
        return this.queries;
    }

    /**
     * Set the queries property: The list of saved queries stored on the workspace, or introduced by solutions,
     * resource types, etc.
     * 
     * @param queries the queries value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setQueries(List<MetadataQuery> queries) {
        this.queries = queries;
        return this;
    }

    /**
     * Get the applications property: The list of Application Insights apps that were referenced in the metadata
     * request.
     * 
     * @return the applications value.
     */
    public List<MetadataApplication> getApplications() {
        return this.applications;
    }

    /**
     * Set the applications property: The list of Application Insights apps that were referenced in the metadata
     * request.
     * 
     * @param applications the applications value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setApplications(List<MetadataApplication> applications) {
        this.applications = applications;
        return this;
    }

    /**
     * Get the workspaces property: The list of Log Analytics workspaces that were referenced in the metadata request.
     * 
     * @return the workspaces value.
     */
    public List<MetadataWorkspace> getWorkspaces() {
        return this.workspaces;
    }

    /**
     * Set the workspaces property: The list of Log Analytics workspaces that were referenced in the metadata request.
     * 
     * @param workspaces the workspaces value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setWorkspaces(List<MetadataWorkspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }

    /**
     * Get the resources property: The list of Azure resources that were referenced in the metadata request.
     * 
     * @return the resources value.
     */
    public List<Object> getResources() {
        return this.resources;
    }

    /**
     * Set the resources property: The list of Azure resources that were referenced in the metadata request.
     * 
     * @param resources the resources value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setResources(List<Object> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the permissions property: The list of permission rules that affected the metadata request.
     * 
     * @return the permissions value.
     */
    public List<MetadataPermissions> getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: The list of permission rules that affected the metadata request.
     * 
     * @param permissions the permissions value to set.
     * @return the MetadataResults object itself.
     */
    public MetadataResults setPermissions(List<MetadataPermissions> permissions) {
        this.permissions = permissions;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("categories", this.categories, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("resourceTypes", this.resourceTypes, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("solutions", this.solutions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("tables", this.tables, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("functions", this.functions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("queries", this.queries, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("applications", this.applications, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("workspaces", this.workspaces, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("resources", this.resources, (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeArrayField("permissions", this.permissions, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetadataResults from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetadataResults if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetadataResults.
     */
    public static MetadataResults fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetadataResults deserializedMetadataResults = new MetadataResults();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("categories".equals(fieldName)) {
                    List<MetadataCategory> categories = reader.readArray(reader1 -> MetadataCategory.fromJson(reader1));
                    deserializedMetadataResults.categories = categories;
                } else if ("resourceTypes".equals(fieldName)) {
                    List<MetadataResourceType> resourceTypes
                        = reader.readArray(reader1 -> MetadataResourceType.fromJson(reader1));
                    deserializedMetadataResults.resourceTypes = resourceTypes;
                } else if ("solutions".equals(fieldName)) {
                    List<MetadataSolution> solutions = reader.readArray(reader1 -> MetadataSolution.fromJson(reader1));
                    deserializedMetadataResults.solutions = solutions;
                } else if ("tables".equals(fieldName)) {
                    List<MetadataTable> tables = reader.readArray(reader1 -> MetadataTable.fromJson(reader1));
                    deserializedMetadataResults.tables = tables;
                } else if ("functions".equals(fieldName)) {
                    List<MetadataFunction> functions = reader.readArray(reader1 -> MetadataFunction.fromJson(reader1));
                    deserializedMetadataResults.functions = functions;
                } else if ("queries".equals(fieldName)) {
                    List<MetadataQuery> queries = reader.readArray(reader1 -> MetadataQuery.fromJson(reader1));
                    deserializedMetadataResults.queries = queries;
                } else if ("applications".equals(fieldName)) {
                    List<MetadataApplication> applications
                        = reader.readArray(reader1 -> MetadataApplication.fromJson(reader1));
                    deserializedMetadataResults.applications = applications;
                } else if ("workspaces".equals(fieldName)) {
                    List<MetadataWorkspace> workspaces
                        = reader.readArray(reader1 -> MetadataWorkspace.fromJson(reader1));
                    deserializedMetadataResults.workspaces = workspaces;
                } else if ("resources".equals(fieldName)) {
                    List<Object> resources = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedMetadataResults.resources = resources;
                } else if ("permissions".equals(fieldName)) {
                    List<MetadataPermissions> permissions
                        = reader.readArray(reader1 -> MetadataPermissions.fromJson(reader1));
                    deserializedMetadataResults.permissions = permissions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetadataResults;
        });
    }
}
