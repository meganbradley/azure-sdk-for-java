// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A top level domain object.
 */
@Fluent
public final class TopLevelDomainInner extends ProxyOnlyResource {
    /*
     * TopLevelDomain resource specific properties
     */
    @JsonProperty(value = "properties")
    private TopLevelDomainProperties innerProperties;

    /**
     * Creates an instance of TopLevelDomainInner class.
     */
    public TopLevelDomainInner() {
    }

    /**
     * Get the innerProperties property: TopLevelDomain resource specific properties.
     * 
     * @return the innerProperties value.
     */
    private TopLevelDomainProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TopLevelDomainInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the privacy property: If &lt;code&gt;true&lt;/code&gt;, then the top level domain supports domain privacy;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the privacy value.
     */
    public Boolean privacy() {
        return this.innerProperties() == null ? null : this.innerProperties().privacy();
    }

    /**
     * Set the privacy property: If &lt;code&gt;true&lt;/code&gt;, then the top level domain supports domain privacy;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param privacy the privacy value to set.
     * @return the TopLevelDomainInner object itself.
     */
    public TopLevelDomainInner withPrivacy(Boolean privacy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new TopLevelDomainProperties();
        }
        this.innerProperties().withPrivacy(privacy);
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
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
