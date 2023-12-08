// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The settings that will be leveraged for Oracle source partitioning.
 */
@Fluent
public final class OraclePartitionSettings {
    /*
     * Names of the physical partitions of Oracle table.
     */
    @JsonProperty(value = "partitionNames")
    private Object partitionNames;

    /*
     * The name of the column in integer type that will be used for proceeding range partitioning. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "partitionColumnName")
    private Object partitionColumnName;

    /*
     * The maximum value of column specified in partitionColumnName that will be used for proceeding range
     * partitioning. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionUpperBound")
    private Object partitionUpperBound;

    /*
     * The minimum value of column specified in partitionColumnName that will be used for proceeding range
     * partitioning. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "partitionLowerBound")
    private Object partitionLowerBound;

    /**
     * Creates an instance of OraclePartitionSettings class.
     */
    public OraclePartitionSettings() {
    }

    /**
     * Get the partitionNames property: Names of the physical partitions of Oracle table.
     * 
     * @return the partitionNames value.
     */
    public Object partitionNames() {
        return this.partitionNames;
    }

    /**
     * Set the partitionNames property: Names of the physical partitions of Oracle table.
     * 
     * @param partitionNames the partitionNames value to set.
     * @return the OraclePartitionSettings object itself.
     */
    public OraclePartitionSettings withPartitionNames(Object partitionNames) {
        this.partitionNames = partitionNames;
        return this;
    }

    /**
     * Get the partitionColumnName property: The name of the column in integer type that will be used for proceeding
     * range partitioning. Type: string (or Expression with resultType string).
     * 
     * @return the partitionColumnName value.
     */
    public Object partitionColumnName() {
        return this.partitionColumnName;
    }

    /**
     * Set the partitionColumnName property: The name of the column in integer type that will be used for proceeding
     * range partitioning. Type: string (or Expression with resultType string).
     * 
     * @param partitionColumnName the partitionColumnName value to set.
     * @return the OraclePartitionSettings object itself.
     */
    public OraclePartitionSettings withPartitionColumnName(Object partitionColumnName) {
        this.partitionColumnName = partitionColumnName;
        return this;
    }

    /**
     * Get the partitionUpperBound property: The maximum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @return the partitionUpperBound value.
     */
    public Object partitionUpperBound() {
        return this.partitionUpperBound;
    }

    /**
     * Set the partitionUpperBound property: The maximum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @param partitionUpperBound the partitionUpperBound value to set.
     * @return the OraclePartitionSettings object itself.
     */
    public OraclePartitionSettings withPartitionUpperBound(Object partitionUpperBound) {
        this.partitionUpperBound = partitionUpperBound;
        return this;
    }

    /**
     * Get the partitionLowerBound property: The minimum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @return the partitionLowerBound value.
     */
    public Object partitionLowerBound() {
        return this.partitionLowerBound;
    }

    /**
     * Set the partitionLowerBound property: The minimum value of column specified in partitionColumnName that will be
     * used for proceeding range partitioning. Type: string (or Expression with resultType string).
     * 
     * @param partitionLowerBound the partitionLowerBound value to set.
     * @return the OraclePartitionSettings object itself.
     */
    public OraclePartitionSettings withPartitionLowerBound(Object partitionLowerBound) {
        this.partitionLowerBound = partitionLowerBound;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
