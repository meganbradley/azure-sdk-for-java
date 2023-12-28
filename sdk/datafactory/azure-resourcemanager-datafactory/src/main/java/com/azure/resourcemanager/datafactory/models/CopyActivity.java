// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.CopyActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Copy activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Copy")
@Fluent
public final class CopyActivity extends ExecutionActivity {
    /*
     * Copy activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private CopyActivityTypeProperties innerTypeProperties = new CopyActivityTypeProperties();

    /*
     * List of inputs for the activity.
     */
    @JsonProperty(value = "inputs")
    private List<DatasetReference> inputs;

    /*
     * List of outputs for the activity.
     */
    @JsonProperty(value = "outputs")
    private List<DatasetReference> outputs;

    /**
     * Creates an instance of CopyActivity class.
     */
    public CopyActivity() {
    }

    /**
     * Get the innerTypeProperties property: Copy activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    private CopyActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * Get the inputs property: List of inputs for the activity.
     * 
     * @return the inputs value.
     */
    public List<DatasetReference> inputs() {
        return this.inputs;
    }

    /**
     * Set the inputs property: List of inputs for the activity.
     * 
     * @param inputs the inputs value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withInputs(List<DatasetReference> inputs) {
        this.inputs = inputs;
        return this;
    }

    /**
     * Get the outputs property: List of outputs for the activity.
     * 
     * @return the outputs value.
     */
    public List<DatasetReference> outputs() {
        return this.outputs;
    }

    /**
     * Set the outputs property: List of outputs for the activity.
     * 
     * @param outputs the outputs value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withOutputs(List<DatasetReference> outputs) {
        this.outputs = outputs;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CopyActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the source property: Copy activity source.
     * 
     * @return the source value.
     */
    public CopySource source() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().source();
    }

    /**
     * Set the source property: Copy activity source.
     * 
     * @param source the source value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withSource(CopySource source) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withSource(source);
        return this;
    }

    /**
     * Get the sink property: Copy activity sink.
     * 
     * @return the sink value.
     */
    public CopySink sink() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().sink();
    }

    /**
     * Set the sink property: Copy activity sink.
     * 
     * @param sink the sink value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withSink(CopySink sink) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withSink(sink);
        return this;
    }

    /**
     * Get the translator property: Copy activity translator. If not specified, tabular translator is used.
     * 
     * @return the translator value.
     */
    public Object translator() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().translator();
    }

    /**
     * Set the translator property: Copy activity translator. If not specified, tabular translator is used.
     * 
     * @param translator the translator value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withTranslator(Object translator) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withTranslator(translator);
        return this;
    }

    /**
     * Get the enableStaging property: Specifies whether to copy data via an interim staging. Default value is false.
     * Type: boolean (or Expression with resultType boolean).
     * 
     * @return the enableStaging value.
     */
    public Object enableStaging() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().enableStaging();
    }

    /**
     * Set the enableStaging property: Specifies whether to copy data via an interim staging. Default value is false.
     * Type: boolean (or Expression with resultType boolean).
     * 
     * @param enableStaging the enableStaging value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withEnableStaging(Object enableStaging) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withEnableStaging(enableStaging);
        return this;
    }

    /**
     * Get the stagingSettings property: Specifies interim staging settings when EnableStaging is true.
     * 
     * @return the stagingSettings value.
     */
    public StagingSettings stagingSettings() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().stagingSettings();
    }

    /**
     * Set the stagingSettings property: Specifies interim staging settings when EnableStaging is true.
     * 
     * @param stagingSettings the stagingSettings value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withStagingSettings(StagingSettings stagingSettings) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withStagingSettings(stagingSettings);
        return this;
    }

    /**
     * Get the parallelCopies property: Maximum number of concurrent sessions opened on the source or sink to avoid
     * overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the parallelCopies value.
     */
    public Object parallelCopies() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().parallelCopies();
    }

    /**
     * Set the parallelCopies property: Maximum number of concurrent sessions opened on the source or sink to avoid
     * overloading the data store. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param parallelCopies the parallelCopies value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withParallelCopies(Object parallelCopies) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withParallelCopies(parallelCopies);
        return this;
    }

    /**
     * Get the dataIntegrationUnits property: Maximum number of data integration units that can be used to perform this
     * data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the dataIntegrationUnits value.
     */
    public Object dataIntegrationUnits() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().dataIntegrationUnits();
    }

    /**
     * Set the dataIntegrationUnits property: Maximum number of data integration units that can be used to perform this
     * data movement. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param dataIntegrationUnits the dataIntegrationUnits value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withDataIntegrationUnits(Object dataIntegrationUnits) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withDataIntegrationUnits(dataIntegrationUnits);
        return this;
    }

    /**
     * Get the enableSkipIncompatibleRow property: Whether to skip incompatible row. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the enableSkipIncompatibleRow value.
     */
    public Object enableSkipIncompatibleRow() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().enableSkipIncompatibleRow();
    }

    /**
     * Set the enableSkipIncompatibleRow property: Whether to skip incompatible row. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param enableSkipIncompatibleRow the enableSkipIncompatibleRow value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withEnableSkipIncompatibleRow(Object enableSkipIncompatibleRow) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withEnableSkipIncompatibleRow(enableSkipIncompatibleRow);
        return this;
    }

    /**
     * Get the redirectIncompatibleRowSettings property: Redirect incompatible row settings when
     * EnableSkipIncompatibleRow is true.
     * 
     * @return the redirectIncompatibleRowSettings value.
     */
    public RedirectIncompatibleRowSettings redirectIncompatibleRowSettings() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().redirectIncompatibleRowSettings();
    }

    /**
     * Set the redirectIncompatibleRowSettings property: Redirect incompatible row settings when
     * EnableSkipIncompatibleRow is true.
     * 
     * @param redirectIncompatibleRowSettings the redirectIncompatibleRowSettings value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity
        withRedirectIncompatibleRowSettings(RedirectIncompatibleRowSettings redirectIncompatibleRowSettings) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withRedirectIncompatibleRowSettings(redirectIncompatibleRowSettings);
        return this;
    }

    /**
     * Get the logStorageSettings property: (Deprecated. Please use LogSettings) Log storage settings customer need to
     * provide when enabling session log.
     * 
     * @return the logStorageSettings value.
     */
    public LogStorageSettings logStorageSettings() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().logStorageSettings();
    }

    /**
     * Set the logStorageSettings property: (Deprecated. Please use LogSettings) Log storage settings customer need to
     * provide when enabling session log.
     * 
     * @param logStorageSettings the logStorageSettings value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withLogStorageSettings(LogStorageSettings logStorageSettings) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withLogStorageSettings(logStorageSettings);
        return this;
    }

    /**
     * Get the logSettings property: Log settings customer needs provide when enabling log.
     * 
     * @return the logSettings value.
     */
    public LogSettings logSettings() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().logSettings();
    }

    /**
     * Set the logSettings property: Log settings customer needs provide when enabling log.
     * 
     * @param logSettings the logSettings value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withLogSettings(LogSettings logSettings) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withLogSettings(logSettings);
        return this;
    }

    /**
     * Get the preserveRules property: Preserve Rules.
     * 
     * @return the preserveRules value.
     */
    public List<Object> preserveRules() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().preserveRules();
    }

    /**
     * Set the preserveRules property: Preserve Rules.
     * 
     * @param preserveRules the preserveRules value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withPreserveRules(List<Object> preserveRules) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withPreserveRules(preserveRules);
        return this;
    }

    /**
     * Get the preserve property: Preserve rules.
     * 
     * @return the preserve value.
     */
    public List<Object> preserve() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().preserve();
    }

    /**
     * Set the preserve property: Preserve rules.
     * 
     * @param preserve the preserve value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withPreserve(List<Object> preserve) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withPreserve(preserve);
        return this;
    }

    /**
     * Get the validateDataConsistency property: Whether to enable Data Consistency validation. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @return the validateDataConsistency value.
     */
    public Object validateDataConsistency() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().validateDataConsistency();
    }

    /**
     * Set the validateDataConsistency property: Whether to enable Data Consistency validation. Type: boolean (or
     * Expression with resultType boolean).
     * 
     * @param validateDataConsistency the validateDataConsistency value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withValidateDataConsistency(Object validateDataConsistency) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withValidateDataConsistency(validateDataConsistency);
        return this;
    }

    /**
     * Get the skipErrorFile property: Specify the fault tolerance for data consistency.
     * 
     * @return the skipErrorFile value.
     */
    public SkipErrorFile skipErrorFile() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().skipErrorFile();
    }

    /**
     * Set the skipErrorFile property: Specify the fault tolerance for data consistency.
     * 
     * @param skipErrorFile the skipErrorFile value to set.
     * @return the CopyActivity object itself.
     */
    public CopyActivity withSkipErrorFile(SkipErrorFile skipErrorFile) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new CopyActivityTypeProperties();
        }
        this.innerTypeProperties().withSkipErrorFile(skipErrorFile);
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
        if (innerTypeProperties() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property innerTypeProperties in model CopyActivity"));
        } else {
            innerTypeProperties().validate();
        }
        if (inputs() != null) {
            inputs().forEach(e -> e.validate());
        }
        if (outputs() != null) {
            outputs().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CopyActivity.class);
}
