// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.selfhelp.models.ReplacementMaps;
import com.azure.resourcemanager.selfhelp.models.Section;
import com.azure.resourcemanager.selfhelp.models.SolutionProvisioningState;
import com.azure.resourcemanager.selfhelp.models.TriggerCriterion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * Solution response.
 */
@Fluent
public final class SolutionResourceInner extends ProxyResource {
    /*
     * Solution result
     */
    @JsonProperty(value = "properties")
    private SolutionResourceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of SolutionResourceInner class.
     */
    public SolutionResourceInner() {
    }

    /**
     * Get the innerProperties property: Solution result.
     * 
     * @return the innerProperties value.
     */
    private SolutionResourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the triggerCriteria property: Solution request trigger criteria.
     * 
     * @return the triggerCriteria value.
     */
    public List<TriggerCriterion> triggerCriteria() {
        return this.innerProperties() == null ? null : this.innerProperties().triggerCriteria();
    }

    /**
     * Set the triggerCriteria property: Solution request trigger criteria.
     * 
     * @param triggerCriteria the triggerCriteria value to set.
     * @return the SolutionResourceInner object itself.
     */
    public SolutionResourceInner withTriggerCriteria(List<TriggerCriterion> triggerCriteria) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SolutionResourceProperties();
        }
        this.innerProperties().withTriggerCriteria(triggerCriteria);
        return this;
    }

    /**
     * Get the parameters property: Client input parameters to run Solution.
     * 
     * @return the parameters value.
     */
    public Map<String, String> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: Client input parameters to run Solution.
     * 
     * @param parameters the parameters value to set.
     * @return the SolutionResourceInner object itself.
     */
    public SolutionResourceInner withParameters(Map<String, String> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SolutionResourceProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the solutionId property: Solution Id to identify single solution.
     * 
     * @return the solutionId value.
     */
    public String solutionId() {
        return this.innerProperties() == null ? null : this.innerProperties().solutionId();
    }

    /**
     * Get the provisioningState property: Status of solution provisioning.
     * 
     * @return the provisioningState value.
     */
    public SolutionProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the title property: The title.
     * 
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Get the content property: The HTML content that needs to be rendered and shown to customer.
     * 
     * @return the content value.
     */
    public String content() {
        return this.innerProperties() == null ? null : this.innerProperties().content();
    }

    /**
     * Get the replacementMaps property: Solution replacement maps.
     * 
     * @return the replacementMaps value.
     */
    public ReplacementMaps replacementMaps() {
        return this.innerProperties() == null ? null : this.innerProperties().replacementMaps();
    }

    /**
     * Get the sections property: List of section object.
     * 
     * @return the sections value.
     */
    public List<Section> sections() {
        return this.innerProperties() == null ? null : this.innerProperties().sections();
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
