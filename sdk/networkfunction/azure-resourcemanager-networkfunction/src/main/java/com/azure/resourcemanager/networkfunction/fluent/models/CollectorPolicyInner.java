// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkfunction.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.networkfunction.models.EmissionPoliciesPropertiesFormat;
import com.azure.resourcemanager.networkfunction.models.IngestionPolicyPropertiesFormat;
import com.azure.resourcemanager.networkfunction.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Collector policy resource. */
@Fluent
public final class CollectorPolicyInner extends Resource {
    /*
     * Properties of the Collector Policy.
     */
    @JsonProperty(value = "properties")
    private CollectorPolicyPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of CollectorPolicyInner class. */
    public CollectorPolicyInner() {
    }

    /**
     * Get the innerProperties property: Properties of the Collector Policy.
     *
     * @return the innerProperties value.
     */
    private CollectorPolicyPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public CollectorPolicyInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CollectorPolicyInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the ingestionPolicy property: Ingestion policies.
     *
     * @return the ingestionPolicy value.
     */
    public IngestionPolicyPropertiesFormat ingestionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().ingestionPolicy();
    }

    /**
     * Set the ingestionPolicy property: Ingestion policies.
     *
     * @param ingestionPolicy the ingestionPolicy value to set.
     * @return the CollectorPolicyInner object itself.
     */
    public CollectorPolicyInner withIngestionPolicy(IngestionPolicyPropertiesFormat ingestionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CollectorPolicyPropertiesFormat();
        }
        this.innerProperties().withIngestionPolicy(ingestionPolicy);
        return this;
    }

    /**
     * Get the emissionPolicies property: Emission policies.
     *
     * @return the emissionPolicies value.
     */
    public List<EmissionPoliciesPropertiesFormat> emissionPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().emissionPolicies();
    }

    /**
     * Set the emissionPolicies property: Emission policies.
     *
     * @param emissionPolicies the emissionPolicies value to set.
     * @return the CollectorPolicyInner object itself.
     */
    public CollectorPolicyInner withEmissionPolicies(List<EmissionPoliciesPropertiesFormat> emissionPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CollectorPolicyPropertiesFormat();
        }
        this.innerProperties().withEmissionPolicies(emissionPolicies);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
