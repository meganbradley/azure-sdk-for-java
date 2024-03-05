// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * An instance of an entity - like hive_table, hive_database.
 */
@Fluent
public final class AtlasEntity {
    /*
     * The attributes of the struct.
     */
    @Generated
    @JsonProperty(value = "attributes")
    private Map<String, Object> attributes;

    /*
     * The name of the type.
     */
    @Generated
    @JsonProperty(value = "typeName")
    private String typeName;

    /*
     * ETag for concurrency control.
     */
    @Generated
    @JsonProperty(value = "lastModifiedTS")
    private String lastModifiedTS;

    /*
     * Business attributes
     */
    @Generated
    @JsonProperty(value = "businessAttributes")
    private Map<String, Object> businessAttributes;

    /*
     * An array of classifications.
     */
    @Generated
    @JsonProperty(value = "classifications")
    private List<AtlasClassification> classifications;

    /*
     * The created time of the record.
     */
    @Generated
    @JsonProperty(value = "createTime")
    private Long createTime;

    /*
     * The user who created the record.
     */
    @Generated
    @JsonProperty(value = "createdBy")
    private String createdBy;

    /*
     * Custom Attribute
     */
    @Generated
    @JsonProperty(value = "customAttributes")
    private Map<String, String> customAttributes;

    /*
     * The GUID of the entity.
     */
    @Generated
    @JsonProperty(value = "guid")
    private String guid;

    /*
     * The home ID of the entity.
     */
    @Generated
    @JsonProperty(value = "homeId")
    private String homeId;

    /*
     * The collection ID of the entity.
     */
    @Generated
    @JsonProperty(value = "collectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String collectionId;

    /*
     * Whether it is a shell entity
     */
    @Generated
    @JsonProperty(value = "isIncomplete")
    private Boolean isIncomplete;

    /*
     * labels
     */
    @Generated
    @JsonProperty(value = "labels")
    private List<String> labels;

    /*
     * An array of term assignment headers indicating the meanings of the entity.
     */
    @Generated
    @JsonProperty(value = "meanings")
    private List<AtlasTermAssignmentHeader> meanings;

    /*
     * Used to record the provenance of an instance of an entity or relationship.
     */
    @Generated
    @JsonProperty(value = "provenanceType")
    private Integer provenanceType;

    /*
     * Determines if there's a proxy.
     */
    @Generated
    @JsonProperty(value = "proxy")
    private Boolean proxy;

    /*
     * The attributes of relationship.
     */
    @Generated
    @JsonProperty(value = "relationshipAttributes")
    private Map<String, Object> relationshipAttributes;

    /*
     * Status of the entity - can be active or deleted. Deleted entities are not
     * removed.
     */
    @Generated
    @JsonProperty(value = "status")
    private EntityStatus status;

    /*
     * The update time of the record.
     */
    @Generated
    @JsonProperty(value = "updateTime")
    private Long updateTime;

    /*
     * The user who updated the record.
     */
    @Generated
    @JsonProperty(value = "updatedBy")
    private String updatedBy;

    /*
     * The version of the entity.
     */
    @Generated
    @JsonProperty(value = "version")
    private Long version;

    /*
     * The dictionary of contacts for entities. Key could be Expert or Owner.
     */
    @Generated
    @JsonProperty(value = "contacts")
    private Map<String, List<ContactInfo>> contacts;

    /**
     * Creates an instance of AtlasEntity class.
     */
    @Generated
    public AtlasEntity() {
    }

    /**
     * Get the attributes property: The attributes of the struct.
     * 
     * @return the attributes value.
     */
    @Generated
    public Map<String, Object> getAttributes() {
        return this.attributes;
    }

    /**
     * Set the attributes property: The attributes of the struct.
     * 
     * @param attributes the attributes value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get the typeName property: The name of the type.
     * 
     * @return the typeName value.
     */
    @Generated
    public String getTypeName() {
        return this.typeName;
    }

    /**
     * Set the typeName property: The name of the type.
     * 
     * @param typeName the typeName value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * Get the lastModifiedTS property: ETag for concurrency control.
     * 
     * @return the lastModifiedTS value.
     */
    @Generated
    public String getLastModifiedTS() {
        return this.lastModifiedTS;
    }

    /**
     * Set the lastModifiedTS property: ETag for concurrency control.
     * 
     * @param lastModifiedTS the lastModifiedTS value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setLastModifiedTS(String lastModifiedTS) {
        this.lastModifiedTS = lastModifiedTS;
        return this;
    }

    /**
     * Get the businessAttributes property: Business attributes.
     * 
     * @return the businessAttributes value.
     */
    @Generated
    public Map<String, Object> getBusinessAttributes() {
        return this.businessAttributes;
    }

    /**
     * Set the businessAttributes property: Business attributes.
     * 
     * @param businessAttributes the businessAttributes value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setBusinessAttributes(Map<String, Object> businessAttributes) {
        this.businessAttributes = businessAttributes;
        return this;
    }

    /**
     * Get the classifications property: An array of classifications.
     * 
     * @return the classifications value.
     */
    @Generated
    public List<AtlasClassification> getClassifications() {
        return this.classifications;
    }

    /**
     * Set the classifications property: An array of classifications.
     * 
     * @param classifications the classifications value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setClassifications(List<AtlasClassification> classifications) {
        this.classifications = classifications;
        return this;
    }

    /**
     * Get the createTime property: The created time of the record.
     * 
     * @return the createTime value.
     */
    @Generated
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * Set the createTime property: The created time of the record.
     * 
     * @param createTime the createTime value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the createdBy property: The user who created the record.
     * 
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: The user who created the record.
     * 
     * @param createdBy the createdBy value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the customAttributes property: Custom Attribute.
     * 
     * @return the customAttributes value.
     */
    @Generated
    public Map<String, String> getCustomAttributes() {
        return this.customAttributes;
    }

    /**
     * Set the customAttributes property: Custom Attribute.
     * 
     * @param customAttributes the customAttributes value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setCustomAttributes(Map<String, String> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    /**
     * Get the guid property: The GUID of the entity.
     * 
     * @return the guid value.
     */
    @Generated
    public String getGuid() {
        return this.guid;
    }

    /**
     * Set the guid property: The GUID of the entity.
     * 
     * @param guid the guid value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setGuid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get the homeId property: The home ID of the entity.
     * 
     * @return the homeId value.
     */
    @Generated
    public String getHomeId() {
        return this.homeId;
    }

    /**
     * Set the homeId property: The home ID of the entity.
     * 
     * @param homeId the homeId value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setHomeId(String homeId) {
        this.homeId = homeId;
        return this;
    }

    /**
     * Get the collectionId property: The collection ID of the entity.
     * 
     * @return the collectionId value.
     */
    @Generated
    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * Get the isIncomplete property: Whether it is a shell entity.
     * 
     * @return the isIncomplete value.
     */
    @Generated
    public Boolean isIncomplete() {
        return this.isIncomplete;
    }

    /**
     * Set the isIncomplete property: Whether it is a shell entity.
     * 
     * @param isIncomplete the isIncomplete value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setIsIncomplete(Boolean isIncomplete) {
        this.isIncomplete = isIncomplete;
        return this;
    }

    /**
     * Get the labels property: labels.
     * 
     * @return the labels value.
     */
    @Generated
    public List<String> getLabels() {
        return this.labels;
    }

    /**
     * Set the labels property: labels.
     * 
     * @param labels the labels value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the meanings property: An array of term assignment headers indicating the meanings of the entity.
     * 
     * @return the meanings value.
     */
    @Generated
    public List<AtlasTermAssignmentHeader> getMeanings() {
        return this.meanings;
    }

    /**
     * Set the meanings property: An array of term assignment headers indicating the meanings of the entity.
     * 
     * @param meanings the meanings value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setMeanings(List<AtlasTermAssignmentHeader> meanings) {
        this.meanings = meanings;
        return this;
    }

    /**
     * Get the provenanceType property: Used to record the provenance of an instance of an entity or relationship.
     * 
     * @return the provenanceType value.
     */
    @Generated
    public Integer getProvenanceType() {
        return this.provenanceType;
    }

    /**
     * Set the provenanceType property: Used to record the provenance of an instance of an entity or relationship.
     * 
     * @param provenanceType the provenanceType value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setProvenanceType(Integer provenanceType) {
        this.provenanceType = provenanceType;
        return this;
    }

    /**
     * Get the proxy property: Determines if there's a proxy.
     * 
     * @return the proxy value.
     */
    @Generated
    public Boolean isProxy() {
        return this.proxy;
    }

    /**
     * Set the proxy property: Determines if there's a proxy.
     * 
     * @param proxy the proxy value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setProxy(Boolean proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * Get the relationshipAttributes property: The attributes of relationship.
     * 
     * @return the relationshipAttributes value.
     */
    @Generated
    public Map<String, Object> getRelationshipAttributes() {
        return this.relationshipAttributes;
    }

    /**
     * Set the relationshipAttributes property: The attributes of relationship.
     * 
     * @param relationshipAttributes the relationshipAttributes value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setRelationshipAttributes(Map<String, Object> relationshipAttributes) {
        this.relationshipAttributes = relationshipAttributes;
        return this;
    }

    /**
     * Get the status property: Status of the entity - can be active or deleted. Deleted entities are not
     * removed.
     * 
     * @return the status value.
     */
    @Generated
    public EntityStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the entity - can be active or deleted. Deleted entities are not
     * removed.
     * 
     * @param status the status value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setStatus(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the updateTime property: The update time of the record.
     * 
     * @return the updateTime value.
     */
    @Generated
    public Long getUpdateTime() {
        return this.updateTime;
    }

    /**
     * Set the updateTime property: The update time of the record.
     * 
     * @param updateTime the updateTime value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get the updatedBy property: The user who updated the record.
     * 
     * @return the updatedBy value.
     */
    @Generated
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Set the updatedBy property: The user who updated the record.
     * 
     * @param updatedBy the updatedBy value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get the version property: The version of the entity.
     * 
     * @return the version value.
     */
    @Generated
    public Long getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version of the entity.
     * 
     * @param version the version value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * Get the contacts property: The dictionary of contacts for entities. Key could be Expert or Owner.
     * 
     * @return the contacts value.
     */
    @Generated
    public Map<String, List<ContactInfo>> getContacts() {
        return this.contacts;
    }

    /**
     * Set the contacts property: The dictionary of contacts for entities. Key could be Expert or Owner.
     * 
     * @param contacts the contacts value to set.
     * @return the AtlasEntity object itself.
     */
    @Generated
    public AtlasEntity setContacts(Map<String, List<ContactInfo>> contacts) {
        this.contacts = contacts;
        return this;
    }
}
