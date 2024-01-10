// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metricsdefinitions.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Metric definition class specifies the metadata for a metric.
 */
@Fluent
public final class MetricDefinition implements JsonSerializable<MetricDefinition> {
    /*
     * Flag to indicate whether the dimension is required.
     */
    private Boolean isDimensionRequired;

    /*
     * the resource identifier of the resource that emitted the metric.
     */
    private String resourceId;

    /*
     * the namespace the metric belongs to.
     */
    private String namespace;

    /*
     * the name and the display name of the metric, i.e. it is a localizable string.
     */
    private LocalizableString name;

    /*
     * Detailed description of this metric.
     */
    private String displayDescription;

    /*
     * Custom category name for this metric.
     */
    private String category;

    /*
     * The class of the metric.
     */
    private MetricClass metricClass;

    /*
     * The unit of the metric.
     */
    private MetricUnit unit;

    /*
     * the primary aggregation type value defining how to use the values for display.
     */
    private AggregationType primaryAggregationType;

    /*
     * the collection of what aggregation types are supported.
     */
    private List<AggregationType> supportedAggregationTypes;

    /*
     * the collection of what aggregation intervals are available to be queried.
     */
    private List<MetricAvailability> metricAvailabilities;

    /*
     * the resource identifier of the metric definition.
     */
    private String id;

    /*
     * the name and the display name of the dimension, i.e. it is a localizable string.
     */
    private List<LocalizableString> dimensions;

    /**
     * Creates an instance of MetricDefinition class.
     */
    public MetricDefinition() {
    }

    /**
     * Get the isDimensionRequired property: Flag to indicate whether the dimension is required.
     * 
     * @return the isDimensionRequired value.
     */
    public Boolean isDimensionRequired() {
        return this.isDimensionRequired;
    }

    /**
     * Set the isDimensionRequired property: Flag to indicate whether the dimension is required.
     * 
     * @param isDimensionRequired the isDimensionRequired value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setIsDimensionRequired(Boolean isDimensionRequired) {
        this.isDimensionRequired = isDimensionRequired;
        return this;
    }

    /**
     * Get the resourceId property: the resource identifier of the resource that emitted the metric.
     * 
     * @return the resourceId value.
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: the resource identifier of the resource that emitted the metric.
     * 
     * @param resourceId the resourceId value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the namespace property: the namespace the metric belongs to.
     * 
     * @return the namespace value.
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * Set the namespace property: the namespace the metric belongs to.
     * 
     * @param namespace the namespace value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the name property: the name and the display name of the metric, i.e. it is a localizable string.
     * 
     * @return the name value.
     */
    public LocalizableString getName() {
        return this.name;
    }

    /**
     * Set the name property: the name and the display name of the metric, i.e. it is a localizable string.
     * 
     * @param name the name value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setName(LocalizableString name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayDescription property: Detailed description of this metric.
     * 
     * @return the displayDescription value.
     */
    public String getDisplayDescription() {
        return this.displayDescription;
    }

    /**
     * Set the displayDescription property: Detailed description of this metric.
     * 
     * @param displayDescription the displayDescription value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
        return this;
    }

    /**
     * Get the category property: Custom category name for this metric.
     * 
     * @return the category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Set the category property: Custom category name for this metric.
     * 
     * @param category the category value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the metricClass property: The class of the metric.
     * 
     * @return the metricClass value.
     */
    public MetricClass getMetricClass() {
        return this.metricClass;
    }

    /**
     * Set the metricClass property: The class of the metric.
     * 
     * @param metricClass the metricClass value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setMetricClass(MetricClass metricClass) {
        this.metricClass = metricClass;
        return this;
    }

    /**
     * Get the unit property: The unit of the metric.
     * 
     * @return the unit value.
     */
    public MetricUnit getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit of the metric.
     * 
     * @param unit the unit value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setUnit(MetricUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the primaryAggregationType property: the primary aggregation type value defining how to use the values for
     * display.
     * 
     * @return the primaryAggregationType value.
     */
    public AggregationType getPrimaryAggregationType() {
        return this.primaryAggregationType;
    }

    /**
     * Set the primaryAggregationType property: the primary aggregation type value defining how to use the values for
     * display.
     * 
     * @param primaryAggregationType the primaryAggregationType value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setPrimaryAggregationType(AggregationType primaryAggregationType) {
        this.primaryAggregationType = primaryAggregationType;
        return this;
    }

    /**
     * Get the supportedAggregationTypes property: the collection of what aggregation types are supported.
     * 
     * @return the supportedAggregationTypes value.
     */
    public List<AggregationType> getSupportedAggregationTypes() {
        return this.supportedAggregationTypes;
    }

    /**
     * Set the supportedAggregationTypes property: the collection of what aggregation types are supported.
     * 
     * @param supportedAggregationTypes the supportedAggregationTypes value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setSupportedAggregationTypes(List<AggregationType> supportedAggregationTypes) {
        this.supportedAggregationTypes = supportedAggregationTypes;
        return this;
    }

    /**
     * Get the metricAvailabilities property: the collection of what aggregation intervals are available to be queried.
     * 
     * @return the metricAvailabilities value.
     */
    public List<MetricAvailability> getMetricAvailabilities() {
        return this.metricAvailabilities;
    }

    /**
     * Set the metricAvailabilities property: the collection of what aggregation intervals are available to be queried.
     * 
     * @param metricAvailabilities the metricAvailabilities value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setMetricAvailabilities(List<MetricAvailability> metricAvailabilities) {
        this.metricAvailabilities = metricAvailabilities;
        return this;
    }

    /**
     * Get the id property: the resource identifier of the metric definition.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: the resource identifier of the metric definition.
     * 
     * @param id the id value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the dimensions property: the name and the display name of the dimension, i.e. it is a localizable string.
     * 
     * @return the dimensions value.
     */
    public List<LocalizableString> getDimensions() {
        return this.dimensions;
    }

    /**
     * Set the dimensions property: the name and the display name of the dimension, i.e. it is a localizable string.
     * 
     * @param dimensions the dimensions value to set.
     * @return the MetricDefinition object itself.
     */
    public MetricDefinition setDimensions(List<LocalizableString> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("isDimensionRequired", this.isDimensionRequired);
        jsonWriter.writeStringField("resourceId", this.resourceId);
        jsonWriter.writeStringField("namespace", this.namespace);
        jsonWriter.writeJsonField("name", this.name);
        jsonWriter.writeStringField("displayDescription", this.displayDescription);
        jsonWriter.writeStringField("category", this.category);
        jsonWriter.writeStringField("metricClass", this.metricClass == null ? null : this.metricClass.toString());
        jsonWriter.writeStringField("unit", this.unit == null ? null : this.unit.toString());
        jsonWriter.writeStringField("primaryAggregationType",
            this.primaryAggregationType == null ? null : this.primaryAggregationType.toString());
        jsonWriter.writeArrayField("supportedAggregationTypes", this.supportedAggregationTypes,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        jsonWriter.writeArrayField("metricAvailabilities", this.metricAvailabilities,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeArrayField("dimensions", this.dimensions, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricDefinition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MetricDefinition.
     */
    public static MetricDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricDefinition deserializedMetricDefinition = new MetricDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("isDimensionRequired".equals(fieldName)) {
                    deserializedMetricDefinition.isDimensionRequired = reader.getNullable(JsonReader::getBoolean);
                } else if ("resourceId".equals(fieldName)) {
                    deserializedMetricDefinition.resourceId = reader.getString();
                } else if ("namespace".equals(fieldName)) {
                    deserializedMetricDefinition.namespace = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedMetricDefinition.name = LocalizableString.fromJson(reader);
                } else if ("displayDescription".equals(fieldName)) {
                    deserializedMetricDefinition.displayDescription = reader.getString();
                } else if ("category".equals(fieldName)) {
                    deserializedMetricDefinition.category = reader.getString();
                } else if ("metricClass".equals(fieldName)) {
                    deserializedMetricDefinition.metricClass = MetricClass.fromString(reader.getString());
                } else if ("unit".equals(fieldName)) {
                    deserializedMetricDefinition.unit = MetricUnit.fromString(reader.getString());
                } else if ("primaryAggregationType".equals(fieldName)) {
                    deserializedMetricDefinition.primaryAggregationType
                        = AggregationType.fromString(reader.getString());
                } else if ("supportedAggregationTypes".equals(fieldName)) {
                    List<AggregationType> supportedAggregationTypes
                        = reader.readArray(reader1 -> AggregationType.fromString(reader1.getString()));
                    deserializedMetricDefinition.supportedAggregationTypes = supportedAggregationTypes;
                } else if ("metricAvailabilities".equals(fieldName)) {
                    List<MetricAvailability> metricAvailabilities
                        = reader.readArray(reader1 -> MetricAvailability.fromJson(reader1));
                    deserializedMetricDefinition.metricAvailabilities = metricAvailabilities;
                } else if ("id".equals(fieldName)) {
                    deserializedMetricDefinition.id = reader.getString();
                } else if ("dimensions".equals(fieldName)) {
                    List<LocalizableString> dimensions
                        = reader.readArray(reader1 -> LocalizableString.fromJson(reader1));
                    deserializedMetricDefinition.dimensions = dimensions;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricDefinition;
        });
    }
}
