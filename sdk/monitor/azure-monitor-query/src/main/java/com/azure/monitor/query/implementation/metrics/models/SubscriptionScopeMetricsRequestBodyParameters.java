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

/**
 * Query parameters can also be specified in the body, specifying the same parameter in both the body and query
 * parameters will result in an error.
 */
@Fluent
public final class SubscriptionScopeMetricsRequestBodyParameters
    implements JsonSerializable<SubscriptionScopeMetricsRequestBodyParameters> {
    /*
     * The timespan of the query. It is a string with the following format 'startDateTime_ISO/endDateTime_ISO'.
     */
    private String timespan;

    /*
     * The interval (i.e. timegrain) of the query in ISO 8601 duration format. Defaults to PT1M. Special case for
     * 'FULL' value that returns single datapoint for entire time span requested.
     * *Examples: PT15M, PT1H, P1D, FULL*
     */
    private String interval;

    /*
     * The names of the metrics (comma separated) to retrieve.
     */
    private String metricNames;

    /*
     * The list of aggregation types (comma separated) to retrieve.
     */
    private String aggregation;

    /*
     * The **$filter** is used to reduce the set of metric data returned.<br>Example:<br>Metric contains metadata A, B
     * and C.<br>- Return all time series of C where A = a1 and B = b1 or b2<br>**$filter=A eq ‘a1’ and B eq ‘b1’ or B
     * eq ‘b2’ and C eq ‘*’**<br>- Invalid variant:<br>**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B =
     * ‘b2’**<br>This is invalid because the logical or operator cannot separate two different metadata names.<br>-
     * Return all time series where A = a1, B = b1 and C = c1:<br>**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq
     * ‘c1’**<br>- Return all time series where A = a1<br>**$filter=A eq ‘a1’ and B eq ‘*’ and C eq ‘*’**.
     */
    private String filter;

    /*
     * The maximum number of records to retrieve.
     * Valid only if $filter is specified.
     * Defaults to 10.
     */
    private Integer top;

    /*
     * The aggregation to use for sorting results and the direction of the sort.
     * Only one order can be specified.
     * Examples: sum asc.
     */
    private String orderBy;

    /*
     * Dimension name(s) to rollup results by. For example if you only want to see metric values with a filter like
     * 'City eq Seattle or City eq Tacoma' but don't want to see separate values for each city, you can specify
     * 'RollUpBy=City' to see the results for Seattle and Tacoma rolled up into one timeseries.
     */
    private String rollUpBy;

    /*
     * Reduces the set of data collected. The syntax allowed depends on the operation. See the operation's description
     * for details.
     */
    private MetricResultType resultType;

    /*
     * Metric namespace where the metrics you want reside.
     */
    private String metricNamespace;

    /*
     * When set to true, if the timespan passed in is not supported by this metric, the API will return the result
     * using the closest supported timespan. When set to false, an error is returned for invalid timespan parameters.
     * Defaults to false.
     */
    private Boolean autoAdjustTimegrain;

    /*
     * When set to false, invalid filter parameter values will be ignored. When set to true, an error is returned for
     * invalid filter parameters. Defaults to true.
     */
    private Boolean validateDimensions;

    /**
     * Creates an instance of SubscriptionScopeMetricsRequestBodyParameters class.
     */
    public SubscriptionScopeMetricsRequestBodyParameters() {
    }

    /**
     * Get the timespan property: The timespan of the query. It is a string with the following format
     * 'startDateTime_ISO/endDateTime_ISO'.
     * 
     * @return the timespan value.
     */
    public String getTimespan() {
        return this.timespan;
    }

    /**
     * Set the timespan property: The timespan of the query. It is a string with the following format
     * 'startDateTime_ISO/endDateTime_ISO'.
     * 
     * @param timespan the timespan value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }

    /**
     * Get the interval property: The interval (i.e. timegrain) of the query in ISO 8601 duration format. Defaults to
     * PT1M. Special case for 'FULL' value that returns single datapoint for entire time span requested.
     * *Examples: PT15M, PT1H, P1D, FULL*.
     * 
     * @return the interval value.
     */
    public String getInterval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval (i.e. timegrain) of the query in ISO 8601 duration format. Defaults to
     * PT1M. Special case for 'FULL' value that returns single datapoint for entire time span requested.
     * *Examples: PT15M, PT1H, P1D, FULL*.
     * 
     * @param interval the interval value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setInterval(String interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the metricNames property: The names of the metrics (comma separated) to retrieve.
     * 
     * @return the metricNames value.
     */
    public String getMetricNames() {
        return this.metricNames;
    }

    /**
     * Set the metricNames property: The names of the metrics (comma separated) to retrieve.
     * 
     * @param metricNames the metricNames value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setMetricNames(String metricNames) {
        this.metricNames = metricNames;
        return this;
    }

    /**
     * Get the aggregation property: The list of aggregation types (comma separated) to retrieve.
     * 
     * @return the aggregation value.
     */
    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * Set the aggregation property: The list of aggregation types (comma separated) to retrieve.
     * 
     * @param aggregation the aggregation value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setAggregation(String aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    /**
     * Get the filter property: The **$filter** is used to reduce the set of metric data
     * returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series of C
     * where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq ‘*’**&lt;br&gt;-
     * Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B = ‘b2’**&lt;br&gt;This is invalid
     * because the logical or operator cannot separate two different metadata names.&lt;br&gt;- Return all time series
     * where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return
     * all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘*’ and C eq ‘*’**.
     * 
     * @return the filter value.
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: The **$filter** is used to reduce the set of metric data
     * returned.&lt;br&gt;Example:&lt;br&gt;Metric contains metadata A, B and C.&lt;br&gt;- Return all time series of C
     * where A = a1 and B = b1 or b2&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ or B eq ‘b2’ and C eq ‘*’**&lt;br&gt;-
     * Invalid variant:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘*’ or B = ‘b2’**&lt;br&gt;This is invalid
     * because the logical or operator cannot separate two different metadata names.&lt;br&gt;- Return all time series
     * where A = a1, B = b1 and C = c1:&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘b1’ and C eq ‘c1’**&lt;br&gt;- Return
     * all time series where A = a1&lt;br&gt;**$filter=A eq ‘a1’ and B eq ‘*’ and C eq ‘*’**.
     * 
     * @param filter the filter value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the top property: The maximum number of records to retrieve.
     * Valid only if $filter is specified.
     * Defaults to 10.
     * 
     * @return the top value.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Set the top property: The maximum number of records to retrieve.
     * Valid only if $filter is specified.
     * Defaults to 10.
     * 
     * @param top the top value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setTop(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Get the orderBy property: The aggregation to use for sorting results and the direction of the sort.
     * Only one order can be specified.
     * Examples: sum asc.
     * 
     * @return the orderBy value.
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * Set the orderBy property: The aggregation to use for sorting results and the direction of the sort.
     * Only one order can be specified.
     * Examples: sum asc.
     * 
     * @param orderBy the orderBy value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Get the rollUpBy property: Dimension name(s) to rollup results by. For example if you only want to see metric
     * values with a filter like 'City eq Seattle or City eq Tacoma' but don't want to see separate values for each
     * city, you can specify 'RollUpBy=City' to see the results for Seattle and Tacoma rolled up into one timeseries.
     * 
     * @return the rollUpBy value.
     */
    public String getRollUpBy() {
        return this.rollUpBy;
    }

    /**
     * Set the rollUpBy property: Dimension name(s) to rollup results by. For example if you only want to see metric
     * values with a filter like 'City eq Seattle or City eq Tacoma' but don't want to see separate values for each
     * city, you can specify 'RollUpBy=City' to see the results for Seattle and Tacoma rolled up into one timeseries.
     * 
     * @param rollUpBy the rollUpBy value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setRollUpBy(String rollUpBy) {
        this.rollUpBy = rollUpBy;
        return this;
    }

    /**
     * Get the resultType property: Reduces the set of data collected. The syntax allowed depends on the operation. See
     * the operation's description for details.
     * 
     * @return the resultType value.
     */
    public MetricResultType getResultType() {
        return this.resultType;
    }

    /**
     * Set the resultType property: Reduces the set of data collected. The syntax allowed depends on the operation. See
     * the operation's description for details.
     * 
     * @param resultType the resultType value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setResultType(MetricResultType resultType) {
        this.resultType = resultType;
        return this;
    }

    /**
     * Get the metricNamespace property: Metric namespace where the metrics you want reside.
     * 
     * @return the metricNamespace value.
     */
    public String getMetricNamespace() {
        return this.metricNamespace;
    }

    /**
     * Set the metricNamespace property: Metric namespace where the metrics you want reside.
     * 
     * @param metricNamespace the metricNamespace value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setMetricNamespace(String metricNamespace) {
        this.metricNamespace = metricNamespace;
        return this;
    }

    /**
     * Get the autoAdjustTimegrain property: When set to true, if the timespan passed in is not supported by this
     * metric, the API will return the result using the closest supported timespan. When set to false, an error is
     * returned for invalid timespan parameters. Defaults to false.
     * 
     * @return the autoAdjustTimegrain value.
     */
    public Boolean isAutoAdjustTimegrain() {
        return this.autoAdjustTimegrain;
    }

    /**
     * Set the autoAdjustTimegrain property: When set to true, if the timespan passed in is not supported by this
     * metric, the API will return the result using the closest supported timespan. When set to false, an error is
     * returned for invalid timespan parameters. Defaults to false.
     * 
     * @param autoAdjustTimegrain the autoAdjustTimegrain value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setAutoAdjustTimegrain(Boolean autoAdjustTimegrain) {
        this.autoAdjustTimegrain = autoAdjustTimegrain;
        return this;
    }

    /**
     * Get the validateDimensions property: When set to false, invalid filter parameter values will be ignored. When
     * set to true, an error is returned for invalid filter parameters. Defaults to true.
     * 
     * @return the validateDimensions value.
     */
    public Boolean isValidateDimensions() {
        return this.validateDimensions;
    }

    /**
     * Set the validateDimensions property: When set to false, invalid filter parameter values will be ignored. When
     * set to true, an error is returned for invalid filter parameters. Defaults to true.
     * 
     * @param validateDimensions the validateDimensions value to set.
     * @return the SubscriptionScopeMetricsRequestBodyParameters object itself.
     */
    public SubscriptionScopeMetricsRequestBodyParameters setValidateDimensions(Boolean validateDimensions) {
        this.validateDimensions = validateDimensions;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("timespan", this.timespan);
        jsonWriter.writeStringField("interval", this.interval);
        jsonWriter.writeStringField("metricNames", this.metricNames);
        jsonWriter.writeStringField("aggregation", this.aggregation);
        jsonWriter.writeStringField("filter", this.filter);
        jsonWriter.writeNumberField("top", this.top);
        jsonWriter.writeStringField("orderBy", this.orderBy);
        jsonWriter.writeStringField("rollUpBy", this.rollUpBy);
        jsonWriter.writeStringField("resultType", this.resultType == null ? null : this.resultType.toString());
        jsonWriter.writeStringField("metricNamespace", this.metricNamespace);
        jsonWriter.writeBooleanField("autoAdjustTimegrain", this.autoAdjustTimegrain);
        jsonWriter.writeBooleanField("validateDimensions", this.validateDimensions);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SubscriptionScopeMetricsRequestBodyParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SubscriptionScopeMetricsRequestBodyParameters if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SubscriptionScopeMetricsRequestBodyParameters.
     */
    public static SubscriptionScopeMetricsRequestBodyParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SubscriptionScopeMetricsRequestBodyParameters deserializedSubscriptionScopeMetricsRequestBodyParameters
                = new SubscriptionScopeMetricsRequestBodyParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timespan".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.timespan = reader.getString();
                } else if ("interval".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.interval = reader.getString();
                } else if ("metricNames".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.metricNames = reader.getString();
                } else if ("aggregation".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.aggregation = reader.getString();
                } else if ("filter".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.filter = reader.getString();
                } else if ("top".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.top
                        = reader.getNullable(JsonReader::getInt);
                } else if ("orderBy".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.orderBy = reader.getString();
                } else if ("rollUpBy".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.rollUpBy = reader.getString();
                } else if ("resultType".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.resultType
                        = MetricResultType.fromString(reader.getString());
                } else if ("metricNamespace".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.metricNamespace = reader.getString();
                } else if ("autoAdjustTimegrain".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.autoAdjustTimegrain
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("validateDimensions".equals(fieldName)) {
                    deserializedSubscriptionScopeMetricsRequestBodyParameters.validateDimensions
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSubscriptionScopeMetricsRequestBodyParameters;
        });
    }
}
