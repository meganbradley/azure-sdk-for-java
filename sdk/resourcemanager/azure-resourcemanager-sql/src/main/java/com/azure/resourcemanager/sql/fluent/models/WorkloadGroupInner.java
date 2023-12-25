// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Workload group operations for a data warehouse.
 */
@Fluent
public final class WorkloadGroupInner extends ProxyResource {
    /*
     * Resource properties.
     */
    @JsonProperty(value = "properties")
    private WorkloadGroupProperties innerProperties;

    /**
     * Creates an instance of WorkloadGroupInner class.
     */
    public WorkloadGroupInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private WorkloadGroupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the minResourcePercent property: The workload group minimum percentage resource.
     * 
     * @return the minResourcePercent value.
     */
    public Integer minResourcePercent() {
        return this.innerProperties() == null ? null : this.innerProperties().minResourcePercent();
    }

    /**
     * Set the minResourcePercent property: The workload group minimum percentage resource.
     * 
     * @param minResourcePercent the minResourcePercent value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withMinResourcePercent(Integer minResourcePercent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadGroupProperties();
        }
        this.innerProperties().withMinResourcePercent(minResourcePercent);
        return this;
    }

    /**
     * Get the maxResourcePercent property: The workload group cap percentage resource.
     * 
     * @return the maxResourcePercent value.
     */
    public Integer maxResourcePercent() {
        return this.innerProperties() == null ? null : this.innerProperties().maxResourcePercent();
    }

    /**
     * Set the maxResourcePercent property: The workload group cap percentage resource.
     * 
     * @param maxResourcePercent the maxResourcePercent value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withMaxResourcePercent(Integer maxResourcePercent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadGroupProperties();
        }
        this.innerProperties().withMaxResourcePercent(maxResourcePercent);
        return this;
    }

    /**
     * Get the minResourcePercentPerRequest property: The workload group request minimum grant percentage.
     * 
     * @return the minResourcePercentPerRequest value.
     */
    public Double minResourcePercentPerRequest() {
        return this.innerProperties() == null ? null : this.innerProperties().minResourcePercentPerRequest();
    }

    /**
     * Set the minResourcePercentPerRequest property: The workload group request minimum grant percentage.
     * 
     * @param minResourcePercentPerRequest the minResourcePercentPerRequest value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withMinResourcePercentPerRequest(Double minResourcePercentPerRequest) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadGroupProperties();
        }
        this.innerProperties().withMinResourcePercentPerRequest(minResourcePercentPerRequest);
        return this;
    }

    /**
     * Get the maxResourcePercentPerRequest property: The workload group request maximum grant percentage.
     * 
     * @return the maxResourcePercentPerRequest value.
     */
    public Double maxResourcePercentPerRequest() {
        return this.innerProperties() == null ? null : this.innerProperties().maxResourcePercentPerRequest();
    }

    /**
     * Set the maxResourcePercentPerRequest property: The workload group request maximum grant percentage.
     * 
     * @param maxResourcePercentPerRequest the maxResourcePercentPerRequest value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withMaxResourcePercentPerRequest(Double maxResourcePercentPerRequest) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadGroupProperties();
        }
        this.innerProperties().withMaxResourcePercentPerRequest(maxResourcePercentPerRequest);
        return this;
    }

    /**
     * Get the importance property: The workload group importance level.
     * 
     * @return the importance value.
     */
    public String importance() {
        return this.innerProperties() == null ? null : this.innerProperties().importance();
    }

    /**
     * Set the importance property: The workload group importance level.
     * 
     * @param importance the importance value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withImportance(String importance) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadGroupProperties();
        }
        this.innerProperties().withImportance(importance);
        return this;
    }

    /**
     * Get the queryExecutionTimeout property: The workload group query execution timeout.
     * 
     * @return the queryExecutionTimeout value.
     */
    public Integer queryExecutionTimeout() {
        return this.innerProperties() == null ? null : this.innerProperties().queryExecutionTimeout();
    }

    /**
     * Set the queryExecutionTimeout property: The workload group query execution timeout.
     * 
     * @param queryExecutionTimeout the queryExecutionTimeout value to set.
     * @return the WorkloadGroupInner object itself.
     */
    public WorkloadGroupInner withQueryExecutionTimeout(Integer queryExecutionTimeout) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WorkloadGroupProperties();
        }
        this.innerProperties().withQueryExecutionTimeout(queryExecutionTimeout);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
