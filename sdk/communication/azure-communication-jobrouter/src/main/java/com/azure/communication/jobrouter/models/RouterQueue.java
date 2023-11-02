// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A queue that can contain jobs to be routed. */
@Fluent
public final class RouterQueue {

    /*
     * The Id of this queue
     */
    @Generated
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of this queue.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The ID of the distribution policy that will determine how a job is distributed
     * to workers.
     */
    @Generated
    @JsonProperty(value = "distributionPolicyId")
    private String distributionPolicyId;

    /*
     * A set of key/value pairs that are identifying attributes used by the rules
     * engines to make decisions.
     */
    @Generated
    @JsonProperty(value = "labels")
    private Map<String, Object> labels;

    /*
     * (Optional) The ID of the exception policy that determines various job
     * escalation rules.
     */
    @Generated
    @JsonProperty(value = "exceptionPolicyId")
    private String exceptionPolicyId;

    /** Creates an instance of RouterQueue class. */
    @Generated
    public RouterQueue() {}

    /**
     * Get the id property: The Id of this queue.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The name of this queue.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of this queue.
     *
     * @param name the name value to set.
     * @return the RouterQueue object itself.
     */
    @Generated
    public RouterQueue setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the distributionPolicyId property: The ID of the distribution policy that will determine how a job is
     * distributed to workers.
     *
     * @return the distributionPolicyId value.
     */
    @Generated
    public String getDistributionPolicyId() {
        return this.distributionPolicyId;
    }

    /**
     * Set the distributionPolicyId property: The ID of the distribution policy that will determine how a job is
     * distributed to workers.
     *
     * @param distributionPolicyId the distributionPolicyId value to set.
     * @return the RouterQueue object itself.
     */
    @Generated
    public RouterQueue setDistributionPolicyId(String distributionPolicyId) {
        this.distributionPolicyId = distributionPolicyId;
        return this;
    }

    /**
     * Get the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions.
     *
     * @return the labels value.
     */
    @Generated
    public Map<String, Object> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: A set of key/value pairs that are identifying attributes used by the rules engines to
     * make decisions.
     *
     * @param labels the labels value to set.
     * @return the RouterQueue object itself.
     */
    @Generated
    public RouterQueue setLabels(Map<String, Object> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the exceptionPolicyId property: (Optional) The ID of the exception policy that determines various job
     * escalation rules.
     *
     * @return the exceptionPolicyId value.
     */
    @Generated
    public String getExceptionPolicyId() {
        return this.exceptionPolicyId;
    }

    /**
     * Set the exceptionPolicyId property: (Optional) The ID of the exception policy that determines various job
     * escalation rules.
     *
     * @param exceptionPolicyId the exceptionPolicyId value to set.
     * @return the RouterQueue object itself.
     */
    @Generated
    public RouterQueue setExceptionPolicyId(String exceptionPolicyId) {
        this.exceptionPolicyId = exceptionPolicyId;
        return this;
    }

    /*
     * Concurrency Token.
     */
    @Generated
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the etag property: Concurrency Token.
     *
     * @return the etag value.
     */
    @Generated
    public String getEtag() {
        return this.etag;
    }
}
