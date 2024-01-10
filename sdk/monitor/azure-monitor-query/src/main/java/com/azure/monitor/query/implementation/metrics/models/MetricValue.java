// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.monitor.query.implementation.metrics.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents a metric value.
 */
@Fluent
public final class MetricValue implements JsonSerializable<MetricValue> {
    /*
     * The timestamp for the metric value in ISO 8601 format.
     */
    private final OffsetDateTime timeStamp;

    /*
     * The average value in the time range.
     */
    private Double average;

    /*
     * The least value in the time range.
     */
    private Double minimum;

    /*
     * The greatest value in the time range.
     */
    private Double maximum;

    /*
     * The sum of all of the values in the time range.
     */
    private Double total;

    /*
     * The number of samples in the time range. Can be used to determine the number of values that contributed to the
     * average value.
     */
    private Double count;

    /**
     * Creates an instance of MetricValue class.
     * 
     * @param timeStamp the timeStamp value to set.
     */
    public MetricValue(OffsetDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * Get the timeStamp property: The timestamp for the metric value in ISO 8601 format.
     * 
     * @return the timeStamp value.
     */
    public OffsetDateTime getTimeStamp() {
        return this.timeStamp;
    }

    /**
     * Get the average property: The average value in the time range.
     * 
     * @return the average value.
     */
    public Double getAverage() {
        return this.average;
    }

    /**
     * Set the average property: The average value in the time range.
     * 
     * @param average the average value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setAverage(Double average) {
        this.average = average;
        return this;
    }

    /**
     * Get the minimum property: The least value in the time range.
     * 
     * @return the minimum value.
     */
    public Double getMinimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: The least value in the time range.
     * 
     * @param minimum the minimum value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setMinimum(Double minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the maximum property: The greatest value in the time range.
     * 
     * @return the maximum value.
     */
    public Double getMaximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: The greatest value in the time range.
     * 
     * @param maximum the maximum value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setMaximum(Double maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the total property: The sum of all of the values in the time range.
     * 
     * @return the total value.
     */
    public Double getTotal() {
        return this.total;
    }

    /**
     * Set the total property: The sum of all of the values in the time range.
     * 
     * @param total the total value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setTotal(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Get the count property: The number of samples in the time range. Can be used to determine the number of values
     * that contributed to the average value.
     * 
     * @return the count value.
     */
    public Double getCount() {
        return this.count;
    }

    /**
     * Set the count property: The number of samples in the time range. Can be used to determine the number of values
     * that contributed to the average value.
     * 
     * @param count the count value to set.
     * @return the MetricValue object itself.
     */
    public MetricValue setCount(Double count) {
        this.count = count;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("timeStamp",
            this.timeStamp == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.timeStamp));
        jsonWriter.writeNumberField("average", this.average);
        jsonWriter.writeNumberField("minimum", this.minimum);
        jsonWriter.writeNumberField("maximum", this.maximum);
        jsonWriter.writeNumberField("total", this.total);
        jsonWriter.writeNumberField("count", this.count);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricValue from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricValue if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MetricValue.
     */
    public static MetricValue fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean timeStampFound = false;
            OffsetDateTime timeStamp = null;
            Double average = null;
            Double minimum = null;
            Double maximum = null;
            Double total = null;
            Double count = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timeStamp".equals(fieldName)) {
                    timeStamp = reader.getNullable(nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                    timeStampFound = true;
                } else if ("average".equals(fieldName)) {
                    average = reader.getNullable(JsonReader::getDouble);
                } else if ("minimum".equals(fieldName)) {
                    minimum = reader.getNullable(JsonReader::getDouble);
                } else if ("maximum".equals(fieldName)) {
                    maximum = reader.getNullable(JsonReader::getDouble);
                } else if ("total".equals(fieldName)) {
                    total = reader.getNullable(JsonReader::getDouble);
                } else if ("count".equals(fieldName)) {
                    count = reader.getNullable(JsonReader::getDouble);
                } else {
                    reader.skipChildren();
                }
            }
            if (timeStampFound) {
                MetricValue deserializedMetricValue = new MetricValue(timeStamp);
                deserializedMetricValue.average = average;
                deserializedMetricValue.minimum = minimum;
                deserializedMetricValue.maximum = maximum;
                deserializedMetricValue.total = total;
                deserializedMetricValue.count = count;

                return deserializedMetricValue;
            }
            throw new IllegalStateException("Missing required property: timeStamp");
        });
    }
}
