// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * The definitions of type.
 */
@Immutable
public final class AtlasTypeDef {
    /*
     * The enum of type category.
     */
    @Generated
    @JsonProperty(value = "category")
    private TypeCategory category;

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
     * The date format.
     */
    @Generated
    @JsonProperty(value = "dateFormatter")
    private DateFormat dateFormatter;

    /*
     * The description of the type definition.
     */
    @Generated
    @JsonProperty(value = "description")
    private String description;

    /*
     * The GUID of the type definition.
     */
    @Generated
    @JsonProperty(value = "guid")
    private String guid;

    /*
     * The name of the type definition.
     */
    @Generated
    @JsonProperty(value = "name")
    private String name;

    /*
     * The options for the type definition.
     */
    @Generated
    @JsonProperty(value = "options")
    private Map<String, String> options;

    /*
     * The service type.
     */
    @Generated
    @JsonProperty(value = "serviceType")
    private String serviceType;

    /*
     * The version of the type.
     */
    @Generated
    @JsonProperty(value = "typeVersion")
    private String typeVersion;

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
     * The version of the record.
     */
    @Generated
    @JsonProperty(value = "version")
    private Long version;

    /*
     * ETag for concurrency control.
     */
    @Generated
    @JsonProperty(value = "lastModifiedTS")
    private String lastModifiedTS;

    /*
     * Specifying a list of entityType names in the classificationDef, ensures that
     * classifications can
     * only be applied to those entityTypes.
     * 
     * Any subtypes of the entity types inherit the restriction.
     * 
     * Any classificationDef subtypes inherit the parents entityTypes restrictions.
     * 
     * Any classificationDef subtypes can further restrict the parents entityTypes
     * restrictions by specifying a subset of the entityTypes.
     * 
     * An empty entityTypes list when there are no parent restrictions means there are no
     * restrictions.
     * 
     * An empty entityTypes list when there are parent
     * restrictions means that the subtype picks up the parents
     * restrictions.
     * 
     * If a list of entityTypes are supplied, where one inherits
     * from another, this will be rejected. This should encourage cleaner
     * classificationsDefs.
     * 
     */
    @Generated
    @JsonProperty(value = "entityTypes")
    private List<String> entityTypes;

    /*
     * An array of sub types.
     */
    @Generated
    @JsonProperty(value = "subTypes")
    private List<String> subTypes;

    /*
     * An array of super types.
     */
    @Generated
    @JsonProperty(value = "superTypes")
    private List<String> superTypes;

    /*
     * An array of relationship attributes.
     */
    @Generated
    @JsonProperty(value = "relationshipAttributeDefs")
    private List<AtlasRelationshipAttributeDef> relationshipAttributeDefs;

    /*
     * The default value.
     */
    @Generated
    @JsonProperty(value = "defaultValue")
    private String defaultValue;

    /*
     * An array of enum element definitions.
     */
    @Generated
    @JsonProperty(value = "elementDefs")
    private List<AtlasEnumElementDef> elementDefs;

    /*
     * The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     */
    @Generated
    @JsonProperty(value = "endDef1")
    private AtlasRelationshipEndDef endDef1;

    /*
     * The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     */
    @Generated
    @JsonProperty(value = "endDef2")
    private AtlasRelationshipEndDef endDef2;

    /*
     * The Relationship category determines the style of relationship around
     * containment and lifecycle.
     * UML terminology is used for the values.
     * 
     * ASSOCIATION is a relationship with no containment.
     * COMPOSITION and AGGREGATION are containment relationships.
     * 
     * The difference being in the lifecycles of the container and its children.
     * In the COMPOSITION case, the children cannot exist without the container.
     * For AGGREGATION, the life cycles of the container and children are totally independent.
     */
    @Generated
    @JsonProperty(value = "relationshipCategory")
    private RelationshipCategory relationshipCategory;

    /*
     * The label of the relationship.
     */
    @Generated
    @JsonProperty(value = "relationshipLabel")
    private String relationshipLabel;

    /*
     * An array of attribute definitions.
     */
    @Generated
    @JsonProperty(value = "attributeDefs")
    private List<AtlasAttributeDef> attributeDefs;

    /**
     * Creates an instance of AtlasTypeDef class.
     */
    @Generated
    private AtlasTypeDef() {
    }

    /**
     * Get the category property: The enum of type category.
     * 
     * @return the category value.
     */
    @Generated
    public TypeCategory getCategory() {
        return this.category;
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
     * Get the createdBy property: The user who created the record.
     * 
     * @return the createdBy value.
     */
    @Generated
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Get the dateFormatter property: The date format.
     * 
     * @return the dateFormatter value.
     */
    @Generated
    public DateFormat getDateFormatter() {
        return this.dateFormatter;
    }

    /**
     * Get the description property: The description of the type definition.
     * 
     * @return the description value.
     */
    @Generated
    public String getDescription() {
        return this.description;
    }

    /**
     * Get the guid property: The GUID of the type definition.
     * 
     * @return the guid value.
     */
    @Generated
    public String getGuid() {
        return this.guid;
    }

    /**
     * Get the name property: The name of the type definition.
     * 
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the options property: The options for the type definition.
     * 
     * @return the options value.
     */
    @Generated
    public Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * Get the serviceType property: The service type.
     * 
     * @return the serviceType value.
     */
    @Generated
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * Get the typeVersion property: The version of the type.
     * 
     * @return the typeVersion value.
     */
    @Generated
    public String getTypeVersion() {
        return this.typeVersion;
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
     * Get the updatedBy property: The user who updated the record.
     * 
     * @return the updatedBy value.
     */
    @Generated
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Get the version property: The version of the record.
     * 
     * @return the version value.
     */
    @Generated
    public Long getVersion() {
        return this.version;
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
     * Get the entityTypes property: Specifying a list of entityType names in the classificationDef, ensures that
     * classifications can
     * only be applied to those entityTypes.
     * 
     * Any subtypes of the entity types inherit the restriction.
     * 
     * Any classificationDef subtypes inherit the parents entityTypes restrictions.
     * 
     * Any classificationDef subtypes can further restrict the parents entityTypes
     * restrictions by specifying a subset of the entityTypes.
     * 
     * An empty entityTypes list when there are no parent restrictions means there are no
     * restrictions.
     * 
     * An empty entityTypes list when there are parent
     * restrictions means that the subtype picks up the parents
     * restrictions.
     * 
     * If a list of entityTypes are supplied, where one inherits
     * from another, this will be rejected. This should encourage cleaner
     * classificationsDefs.
     * 
     * @return the entityTypes value.
     */
    @Generated
    public List<String> getEntityTypes() {
        return this.entityTypes;
    }

    /**
     * Get the subTypes property: An array of sub types.
     * 
     * @return the subTypes value.
     */
    @Generated
    public List<String> getSubTypes() {
        return this.subTypes;
    }

    /**
     * Get the superTypes property: An array of super types.
     * 
     * @return the superTypes value.
     */
    @Generated
    public List<String> getSuperTypes() {
        return this.superTypes;
    }

    /**
     * Get the relationshipAttributeDefs property: An array of relationship attributes.
     * 
     * @return the relationshipAttributeDefs value.
     */
    @Generated
    public List<AtlasRelationshipAttributeDef> getRelationshipAttributeDefs() {
        return this.relationshipAttributeDefs;
    }

    /**
     * Get the defaultValue property: The default value.
     * 
     * @return the defaultValue value.
     */
    @Generated
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * Get the elementDefs property: An array of enum element definitions.
     * 
     * @return the elementDefs value.
     */
    @Generated
    public List<AtlasEnumElementDef> getElementDefs() {
        return this.elementDefs;
    }

    /**
     * Get the endDef1 property: The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     * 
     * @return the endDef1 value.
     */
    @Generated
    public AtlasRelationshipEndDef getEndDef1() {
        return this.endDef1;
    }

    /**
     * Get the endDef2 property: The relationshipEndDef represents an end of the relationship. The end of the
     * relationship is defined by a type, an
     * attribute name, cardinality and whether
     * it is the container end of the relationship.
     * 
     * @return the endDef2 value.
     */
    @Generated
    public AtlasRelationshipEndDef getEndDef2() {
        return this.endDef2;
    }

    /**
     * Get the relationshipCategory property: The Relationship category determines the style of relationship around
     * containment and lifecycle.
     * UML terminology is used for the values.
     * 
     * ASSOCIATION is a relationship with no containment.
     * COMPOSITION and AGGREGATION are containment relationships.
     * 
     * The difference being in the lifecycles of the container and its children.
     * In the COMPOSITION case, the children cannot exist without the container.
     * For AGGREGATION, the life cycles of the container and children are totally independent.
     * 
     * @return the relationshipCategory value.
     */
    @Generated
    public RelationshipCategory getRelationshipCategory() {
        return this.relationshipCategory;
    }

    /**
     * Get the relationshipLabel property: The label of the relationship.
     * 
     * @return the relationshipLabel value.
     */
    @Generated
    public String getRelationshipLabel() {
        return this.relationshipLabel;
    }

    /**
     * Get the attributeDefs property: An array of attribute definitions.
     * 
     * @return the attributeDefs value.
     */
    @Generated
    public List<AtlasAttributeDef> getAttributeDefs() {
        return this.attributeDefs;
    }
}
