// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Specifies the security profile settings for the virtual machine or virtual machine scale set.
 */
@Immutable
public final class SecurityProfile implements JsonSerializable<SecurityProfile> {

    /*
     * This property can be used by user in the request to enable or disable the Host Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the disks including Resource/Temp disk at host itself.
     */
    @Generated
    private final boolean encryptionAtHost;

    /*
     * Specifies the SecurityType of the virtual machine. It has to be set to any specified value to enable UefiSettings.
     */
    @Generated
    private final SecurityTypes securityType;

    /*
     * Specifies the security settings like secure boot and vTPM used while creating the virtual machine. Specifies the security settings like secure boot and vTPM used while creating the virtual machine.
     */
    @Generated
    private final UefiSettings uefiSettings;

    /**
     * Creates an instance of SecurityProfile class.
     *
     * @param encryptionAtHost the encryptionAtHost value to set.
     * @param securityType the securityType value to set.
     * @param uefiSettings the uefiSettings value to set.
     */
    @Generated
    public SecurityProfile(boolean encryptionAtHost, SecurityTypes securityType, UefiSettings uefiSettings) {
        this.encryptionAtHost = encryptionAtHost;
        this.securityType = securityType;
        this.uefiSettings = uefiSettings;
    }

    /**
     * Get the encryptionAtHost property: This property can be used by user in the request to enable or disable the Host
     * Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all the
     * disks including Resource/Temp disk at host itself.
     *
     * @return the encryptionAtHost value.
     */
    @Generated
    public boolean isEncryptionAtHost() {
        return this.encryptionAtHost;
    }

    /**
     * Get the securityType property: Specifies the SecurityType of the virtual machine. It has to be set to any
     * specified value to enable UefiSettings.
     *
     * @return the securityType value.
     */
    @Generated
    public SecurityTypes getSecurityType() {
        return this.securityType;
    }

    /**
     * Get the uefiSettings property: Specifies the security settings like secure boot and vTPM used while creating the
     * virtual machine. Specifies the security settings like secure boot and vTPM used while creating the virtual
     * machine.
     *
     * @return the uefiSettings value.
     */
    @Generated
    public UefiSettings getUefiSettings() {
        return this.uefiSettings;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("encryptionAtHost", this.encryptionAtHost);
        jsonWriter.writeStringField("securityType", this.securityType == null ? null : this.securityType.toString());
        jsonWriter.writeJsonField("uefiSettings", this.uefiSettings);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecurityProfile from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecurityProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SecurityProfile.
     */
    @Generated
    public static SecurityProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            boolean encryptionAtHost = false;
            SecurityTypes securityType = null;
            UefiSettings uefiSettings = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("encryptionAtHost".equals(fieldName)) {
                    encryptionAtHost = reader.getBoolean();
                } else if ("securityType".equals(fieldName)) {
                    securityType = SecurityTypes.fromString(reader.getString());
                } else if ("uefiSettings".equals(fieldName)) {
                    uefiSettings = UefiSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return new SecurityProfile(encryptionAtHost, securityType, uefiSettings);
        });
    }
}
