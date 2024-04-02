// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.notificationhubs.models.AccessRights;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Response for POST requests that return single SharedAccessAuthorizationRule.
 */
@Fluent
public final class SharedAccessAuthorizationRuleResourceInner extends ProxyResource {
    /*
     * SharedAccessAuthorizationRule properties.
     */
    @JsonProperty(value = "properties")
    private SharedAccessAuthorizationRuleProperties innerProperties;

    /*
     * Deprecated - only for compatibility.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Deprecated - only for compatibility.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of SharedAccessAuthorizationRuleResourceInner class.
     */
    public SharedAccessAuthorizationRuleResourceInner() {
    }

    /**
     * Get the innerProperties property: SharedAccessAuthorizationRule properties.
     * 
     * @return the innerProperties value.
     */
    private SharedAccessAuthorizationRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: Deprecated - only for compatibility.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Deprecated - only for compatibility.
     * 
     * @param location the location value to set.
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Deprecated - only for compatibility.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Deprecated - only for compatibility.
     * 
     * @param tags the tags value to set.
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
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
     * Get the rights property: Gets or sets the rights associated with the rule.
     * 
     * @return the rights value.
     */
    public List<AccessRights> rights() {
        return this.innerProperties() == null ? null : this.innerProperties().rights();
    }

    /**
     * Set the rights property: Gets or sets the rights associated with the rule.
     * 
     * @param rights the rights value to set.
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withRights(List<AccessRights> rights) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SharedAccessAuthorizationRuleProperties();
        }
        this.innerProperties().withRights(rights);
        return this;
    }

    /**
     * Get the primaryKey property: Gets a base64-encoded 256-bit primary key for signing and
     * validating the SAS token.
     * 
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.innerProperties() == null ? null : this.innerProperties().primaryKey();
    }

    /**
     * Set the primaryKey property: Gets a base64-encoded 256-bit primary key for signing and
     * validating the SAS token.
     * 
     * @param primaryKey the primaryKey value to set.
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withPrimaryKey(String primaryKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SharedAccessAuthorizationRuleProperties();
        }
        this.innerProperties().withPrimaryKey(primaryKey);
        return this;
    }

    /**
     * Get the secondaryKey property: Gets a base64-encoded 256-bit primary key for signing and
     * validating the SAS token.
     * 
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.innerProperties() == null ? null : this.innerProperties().secondaryKey();
    }

    /**
     * Set the secondaryKey property: Gets a base64-encoded 256-bit primary key for signing and
     * validating the SAS token.
     * 
     * @param secondaryKey the secondaryKey value to set.
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withSecondaryKey(String secondaryKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SharedAccessAuthorizationRuleProperties();
        }
        this.innerProperties().withSecondaryKey(secondaryKey);
        return this;
    }

    /**
     * Get the keyName property: Gets a string that describes the authorization rule.
     * 
     * @return the keyName value.
     */
    public String keyName() {
        return this.innerProperties() == null ? null : this.innerProperties().keyName();
    }

    /**
     * Get the modifiedTime property: Gets the last modified time for this rule.
     * 
     * @return the modifiedTime value.
     */
    public OffsetDateTime modifiedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().modifiedTime();
    }

    /**
     * Get the createdTime property: Gets the created time for this rule.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTime();
    }

    /**
     * Get the claimType property: Gets a string that describes the claim type.
     * 
     * @return the claimType value.
     */
    public String claimType() {
        return this.innerProperties() == null ? null : this.innerProperties().claimType();
    }

    /**
     * Get the claimValue property: Gets a string that describes the claim value.
     * 
     * @return the claimValue value.
     */
    public String claimValue() {
        return this.innerProperties() == null ? null : this.innerProperties().claimValue();
    }

    /**
     * Get the revision property: Gets the revision number for the rule.
     * 
     * @return the revision value.
     */
    public Integer revision() {
        return this.innerProperties() == null ? null : this.innerProperties().revision();
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
