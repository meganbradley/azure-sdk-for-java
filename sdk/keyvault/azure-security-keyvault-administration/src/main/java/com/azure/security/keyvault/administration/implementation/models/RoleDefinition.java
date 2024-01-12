// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.security.keyvault.administration.models.KeyVaultRoleDefinitionType;
import com.azure.security.keyvault.administration.models.KeyVaultRoleScope;
import com.azure.security.keyvault.administration.models.KeyVaultRoleType;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/**
 * Role definition.
 */
@Fluent
public class RoleDefinition implements JsonSerializable<RoleDefinition> {
    /*
     * The role definition ID.
     */
    private String id;

    /*
     * The role definition name.
     */
    private String name;

    /*
     * The role definition type.
     */
    private KeyVaultRoleDefinitionType type;

    /*
     * The role name.
     */
    private String roleName;

    /*
     * The role definition description.
     */
    private String description;

    /*
     * The role type.
     */
    private KeyVaultRoleType roleType;

    /*
     * Role definition permissions.
     */
    private List<Permission> permissions;

    /*
     * Role definition assignable scopes.
     */
    private List<KeyVaultRoleScope> assignableScopes;

    /**
     * Creates an instance of RoleDefinition class.
     */
    public RoleDefinition() {
    }

    /**
     * Get the id property: The role definition ID.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name property: The role definition name.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the type property: The role definition type.
     * 
     * @return the type value.
     */
    public KeyVaultRoleDefinitionType getType() {
        return this.type;
    }

    /**
     * Get the roleName property: The role name.
     * 
     * @return the roleName value.
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * Set the roleName property: The role name.
     * 
     * @param roleName the roleName value to set.
     * @return the RoleDefinition object itself.
     */
    public RoleDefinition setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get the description property: The role definition description.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The role definition description.
     * 
     * @param description the description value to set.
     * @return the RoleDefinition object itself.
     */
    public RoleDefinition setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the roleType property: The role type.
     * 
     * @return the roleType value.
     */
    public KeyVaultRoleType getRoleType() {
        return this.roleType;
    }

    /**
     * Set the roleType property: The role type.
     * 
     * @param roleType the roleType value to set.
     * @return the RoleDefinition object itself.
     */
    public RoleDefinition setRoleType(KeyVaultRoleType roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * Get the permissions property: Role definition permissions.
     * 
     * @return the permissions value.
     */
    public List<Permission> getPermissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: Role definition permissions.
     * 
     * @param permissions the permissions value to set.
     * @return the RoleDefinition object itself.
     */
    public RoleDefinition setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the assignableScopes property: Role definition assignable scopes.
     * 
     * @return the assignableScopes value.
     */
    public List<KeyVaultRoleScope> getAssignableScopes() {
        return this.assignableScopes;
    }

    /**
     * Set the assignableScopes property: Role definition assignable scopes.
     * 
     * @param assignableScopes the assignableScopes value to set.
     * @return the RoleDefinition object itself.
     */
    public RoleDefinition setAssignableScopes(List<KeyVaultRoleScope> assignableScopes) {
        this.assignableScopes = assignableScopes;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        if (roleName != null || description != null || roleType != null || permissions != null
            || assignableScopes != null) {
            jsonWriter.writeStartObject("properties");
            jsonWriter.writeStringField("roleName", this.roleName);
            jsonWriter.writeStringField("description", this.description);
            jsonWriter.writeStringField("type", Objects.toString(this.roleType, null));
            jsonWriter.writeArrayField("permissions", this.permissions, (writer, element) -> writer.writeJson(element));
            jsonWriter.writeArrayField("assignableScopes", this.assignableScopes,
                (writer, element) -> writer.writeString(Objects.toString(element, null)));
            jsonWriter.writeEndObject();
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleDefinition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleDefinition if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleDefinition.
     */
    public static RoleDefinition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleDefinition deserializedRoleDefinition = new RoleDefinition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRoleDefinition.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRoleDefinition.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRoleDefinition.type = KeyVaultRoleDefinitionType.fromString(reader.getString());
                } else if ("properties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("roleName".equals(fieldName)) {
                            deserializedRoleDefinition.roleName = reader.getString();
                        } else if ("description".equals(fieldName)) {
                            deserializedRoleDefinition.description = reader.getString();
                        } else if ("type".equals(fieldName)) {
                            deserializedRoleDefinition.roleType = KeyVaultRoleType.fromString(reader.getString());
                        } else if ("permissions".equals(fieldName)) {
                            List<Permission> permissions = reader.readArray(reader1 -> Permission.fromJson(reader1));
                            deserializedRoleDefinition.permissions = permissions;
                        } else if ("assignableScopes".equals(fieldName)) {
                            List<KeyVaultRoleScope> assignableScopes
                                = reader.readArray(reader1 -> KeyVaultRoleScope.fromString(reader1.getString()));
                            deserializedRoleDefinition.assignableScopes = assignableScopes;
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleDefinition;
        });
    }
}
