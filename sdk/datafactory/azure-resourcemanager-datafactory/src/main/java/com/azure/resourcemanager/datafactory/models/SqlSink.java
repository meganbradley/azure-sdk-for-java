// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity SQL sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SqlSink")
@Fluent
public final class SqlSink extends CopySink {
    /*
     * SQL writer stored procedure name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sqlWriterStoredProcedureName")
    private Object sqlWriterStoredProcedureName;

    /*
     * SQL writer table type. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "sqlWriterTableType")
    private Object sqlWriterTableType;

    /*
     * SQL pre-copy script. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "preCopyScript")
    private Object preCopyScript;

    /*
     * SQL stored procedure parameters.
     */
    @JsonProperty(value = "storedProcedureParameters")
    private Object storedProcedureParameters;

    /*
     * The stored procedure parameter name of the table type. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "storedProcedureTableTypeParameterName")
    private Object storedProcedureTableTypeParameterName;

    /*
     * The option to handle sink table, such as autoCreate. For now only 'autoCreate' value is supported. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "tableOption")
    private Object tableOption;

    /*
     * Whether to use table lock during bulk copy. Type: boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "sqlWriterUseTableLock")
    private Object sqlWriterUseTableLock;

    /*
     * Write behavior when copying data into sql. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "writeBehavior")
    private Object writeBehavior;

    /*
     * SQL upsert settings.
     */
    @JsonProperty(value = "upsertSettings")
    private SqlUpsertSettings upsertSettings;

    /**
     * Creates an instance of SqlSink class.
     */
    public SqlSink() {
    }

    /**
     * Get the sqlWriterStoredProcedureName property: SQL writer stored procedure name. Type: string (or Expression
     * with resultType string).
     * 
     * @return the sqlWriterStoredProcedureName value.
     */
    public Object sqlWriterStoredProcedureName() {
        return this.sqlWriterStoredProcedureName;
    }

    /**
     * Set the sqlWriterStoredProcedureName property: SQL writer stored procedure name. Type: string (or Expression
     * with resultType string).
     * 
     * @param sqlWriterStoredProcedureName the sqlWriterStoredProcedureName value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink withSqlWriterStoredProcedureName(Object sqlWriterStoredProcedureName) {
        this.sqlWriterStoredProcedureName = sqlWriterStoredProcedureName;
        return this;
    }

    /**
     * Get the sqlWriterTableType property: SQL writer table type. Type: string (or Expression with resultType string).
     * 
     * @return the sqlWriterTableType value.
     */
    public Object sqlWriterTableType() {
        return this.sqlWriterTableType;
    }

    /**
     * Set the sqlWriterTableType property: SQL writer table type. Type: string (or Expression with resultType string).
     * 
     * @param sqlWriterTableType the sqlWriterTableType value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink withSqlWriterTableType(Object sqlWriterTableType) {
        this.sqlWriterTableType = sqlWriterTableType;
        return this;
    }

    /**
     * Get the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @return the preCopyScript value.
     */
    public Object preCopyScript() {
        return this.preCopyScript;
    }

    /**
     * Set the preCopyScript property: SQL pre-copy script. Type: string (or Expression with resultType string).
     * 
     * @param preCopyScript the preCopyScript value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink withPreCopyScript(Object preCopyScript) {
        this.preCopyScript = preCopyScript;
        return this;
    }

    /**
     * Get the storedProcedureParameters property: SQL stored procedure parameters.
     * 
     * @return the storedProcedureParameters value.
     */
    public Object storedProcedureParameters() {
        return this.storedProcedureParameters;
    }

    /**
     * Set the storedProcedureParameters property: SQL stored procedure parameters.
     * 
     * @param storedProcedureParameters the storedProcedureParameters value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink withStoredProcedureParameters(Object storedProcedureParameters) {
        this.storedProcedureParameters = storedProcedureParameters;
        return this;
    }

    /**
     * Get the storedProcedureTableTypeParameterName property: The stored procedure parameter name of the table type.
     * Type: string (or Expression with resultType string).
     * 
     * @return the storedProcedureTableTypeParameterName value.
     */
    public Object storedProcedureTableTypeParameterName() {
        return this.storedProcedureTableTypeParameterName;
    }

    /**
     * Set the storedProcedureTableTypeParameterName property: The stored procedure parameter name of the table type.
     * Type: string (or Expression with resultType string).
     * 
     * @param storedProcedureTableTypeParameterName the storedProcedureTableTypeParameterName value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink withStoredProcedureTableTypeParameterName(Object storedProcedureTableTypeParameterName) {
        this.storedProcedureTableTypeParameterName = storedProcedureTableTypeParameterName;
        return this;
    }

    /**
     * Get the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     * 
     * @return the tableOption value.
     */
    public Object tableOption() {
        return this.tableOption;
    }

    /**
     * Set the tableOption property: The option to handle sink table, such as autoCreate. For now only 'autoCreate'
     * value is supported. Type: string (or Expression with resultType string).
     * 
     * @param tableOption the tableOption value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink withTableOption(Object tableOption) {
        this.tableOption = tableOption;
        return this;
    }

    /**
     * Get the sqlWriterUseTableLock property: Whether to use table lock during bulk copy. Type: boolean (or Expression
     * with resultType boolean).
     * 
     * @return the sqlWriterUseTableLock value.
     */
    public Object sqlWriterUseTableLock() {
        return this.sqlWriterUseTableLock;
    }

    /**
     * Set the sqlWriterUseTableLock property: Whether to use table lock during bulk copy. Type: boolean (or Expression
     * with resultType boolean).
     * 
     * @param sqlWriterUseTableLock the sqlWriterUseTableLock value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink withSqlWriterUseTableLock(Object sqlWriterUseTableLock) {
        this.sqlWriterUseTableLock = sqlWriterUseTableLock;
        return this;
    }

    /**
     * Get the writeBehavior property: Write behavior when copying data into sql. Type: string (or Expression with
     * resultType string).
     * 
     * @return the writeBehavior value.
     */
    public Object writeBehavior() {
        return this.writeBehavior;
    }

    /**
     * Set the writeBehavior property: Write behavior when copying data into sql. Type: string (or Expression with
     * resultType string).
     * 
     * @param writeBehavior the writeBehavior value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink withWriteBehavior(Object writeBehavior) {
        this.writeBehavior = writeBehavior;
        return this;
    }

    /**
     * Get the upsertSettings property: SQL upsert settings.
     * 
     * @return the upsertSettings value.
     */
    public SqlUpsertSettings upsertSettings() {
        return this.upsertSettings;
    }

    /**
     * Set the upsertSettings property: SQL upsert settings.
     * 
     * @param upsertSettings the upsertSettings value to set.
     * @return the SqlSink object itself.
     */
    public SqlSink withUpsertSettings(SqlUpsertSettings upsertSettings) {
        this.upsertSettings = upsertSettings;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink withWriteBatchSize(Object writeBatchSize) {
        super.withWriteBatchSize(writeBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink withWriteBatchTimeout(Object writeBatchTimeout) {
        super.withWriteBatchTimeout(writeBatchTimeout);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink withSinkRetryCount(Object sinkRetryCount) {
        super.withSinkRetryCount(sinkRetryCount);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink withSinkRetryWait(Object sinkRetryWait) {
        super.withSinkRetryWait(sinkRetryWait);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSink withDisableMetricsCollection(Object disableMetricsCollection) {
        super.withDisableMetricsCollection(disableMetricsCollection);
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
        if (upsertSettings() != null) {
            upsertSettings().validate();
        }
    }
}
