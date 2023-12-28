// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.appconfiguration.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The ConfigurationSnapshot model. */
@Fluent
public final class ConfigurationSnapshot implements JsonSerializable<ConfigurationSnapshot> {
    /*
     * The name of the snapshot.
     */
    private String name;

    /*
     * The current status of the snapshot.
     */
    private ConfigurationSnapshotStatus status;

    /*
     * A list of filters used to filter the key-values included in the snapshot.
     */
    private final List<ConfigurationSettingsFilter> filters;

    /*
     * The composition type describes how the key-values within the snapshot are composed. The 'key' composition type
     * ensures there are no two key-values containing the same key. The 'key_label' composition type ensures there are
     * no two key-values containing the same key and label.
     */
    private SnapshotComposition snapshotComposition;

    /*
     * The time that the snapshot was created.
     */
    private OffsetDateTime createdAt;

    /*
     * The time that the snapshot will expire.
     */
    private OffsetDateTime expiresAt;

    /*
     * The amount of time, in seconds, that a snapshot will remain in the archived state before expiring. This property
     * is only writable during the creation of a snapshot. If not specified, the default lifetime of key-value
     * revisions will be used.
     */
    private Long retentionPeriod;

    /*
     * The size in bytes of the snapshot.
     */
    private Long sizeInBytes;

    /*
     * The amount of key-values in the snapshot.
     */
    private Long itemCount;

    /*
     * The tags of the snapshot.
     */
    private Map<String, String> tags;

    /*
     * A value representing the current state of the snapshot.
     */
    private String eTag;

    /**
     * Creates an instance of ConfigurationSnapshot class.
     *
     * @param filters the filters value to set.
     */
    public ConfigurationSnapshot(List<ConfigurationSettingsFilter> filters) {
        this.filters = filters;
    }

    /**
     * Get the name property: The name of the snapshot.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the status property: The current status of the snapshot.
     *
     * @return the status value.
     */
    public ConfigurationSnapshotStatus getStatus() {
        return this.status;
    }

    /**
     * Get the filters property: A list of filters used to filter the key-values included in the snapshot.
     *
     * @return the filters value.
     */
    public List<ConfigurationSettingsFilter> getFilters() {
        return this.filters;
    }

    /**
     * Get the snapshotComposition property: The composition type describes how the key-values within the snapshot are
     * composed. The 'key' composition type ensures there are no two key-values containing the same key. The 'key_label'
     * composition type ensures there are no two key-values containing the same key and label.
     *
     * @return the snapshotComposition value.
     */
    public SnapshotComposition getSnapshotComposition() {
        return this.snapshotComposition;
    }

    /**
     * Set the snapshotComposition property: The composition type describes how the key-values within the snapshot are
     * composed. The 'key' composition type ensures there are no two key-values containing the same key. The 'key_label'
     * composition type ensures there are no two key-values containing the same key and label.
     *
     * @param snapshotComposition the snapshotComposition value to set.
     * @return the ConfigurationSnapshot object itself.
     */
    public ConfigurationSnapshot setSnapshotComposition(SnapshotComposition snapshotComposition) {
        this.snapshotComposition = snapshotComposition;
        return this;
    }

    /**
     * Get the createdAt property: The time that the snapshot was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Get the expiresAt property: The time that the snapshot will expire.
     *
     * @return the expiresAt value.
     */
    public OffsetDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * Get the retentionPeriod property: The amount of time, in seconds, that a snapshot will remain in the archived
     * state before expiring. This property is only writable during the creation of a snapshot. If not specified, the
     * default lifetime of key-value revisions will be used.
     *
     * @return the retentionPeriod value.
     */
    public Duration getRetentionPeriod() {
        if (this.retentionPeriod == null) {
            return null;
        }
        return Duration.ofSeconds(this.retentionPeriod);
    }

    /**
     * Set the retentionPeriod property: The amount of time, in seconds, that a snapshot will remain in the archived
     * state before expiring. This property is only writable during the creation of a snapshot. If not specified, the
     * default lifetime of key-value revisions will be used.
     *
     * @param retentionPeriod the retentionPeriod value to set.
     * @return the ConfigurationSnapshot object itself.
     */
    public ConfigurationSnapshot setRetentionPeriod(Duration retentionPeriod) {
        this.retentionPeriod = retentionPeriod == null ? null : retentionPeriod.getSeconds();
        return this;
    }

    /**
     * Get the sizeInBytes property: The size in bytes of the snapshot.
     *
     * @return the sizeInBytes value.
     */
    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }

    /**
     * Get the itemCount property: The amount of key-values in the snapshot.
     *
     * @return the itemCount value.
     */
    public Long getItemCount() {
        return this.itemCount;
    }

    /**
     * Get the tags property: The tags of the snapshot.
     *
     * @return the tags value.
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags of the snapshot.
     *
     * @param tags the tags value to set.
     * @return the ConfigurationSnapshot object itself.
     */
    public ConfigurationSnapshot setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the eTag property: A value representing the current state of the snapshot.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("filters", this.filters, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("status", Objects.toString(this.status, null));
        jsonWriter.writeStringField("composition_type", Objects.toString(this.snapshotComposition, null));
        jsonWriter.writeStringField("created", Objects.toString(this.createdAt, null));
        jsonWriter.writeStringField("expires", Objects.toString(this.expiresAt, null));
        jsonWriter.writeNumberField("retention_period", this.retentionPeriod);
        jsonWriter.writeNumberField("size", this.sizeInBytes);
        jsonWriter.writeNumberField("items_count", this.itemCount);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("etag", this.eTag);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConfigurationSnapshot from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConfigurationSnapshot if the JsonReader was pointing to an instance of it, or null if it
     *     was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConfigurationSnapshot.
     */
    public static ConfigurationSnapshot fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    boolean filtersFound = false;
                    List<ConfigurationSettingsFilter> filters = null;
                    String name = null;
                    ConfigurationSnapshotStatus status = null;
                    SnapshotComposition snapshotComposition = null;
                    OffsetDateTime createdAt = null;
                    OffsetDateTime expiresAt = null;
                    Long retentionPeriod = null;
                    Long sizeInBytes = null;
                    Long itemCount = null;
                    Map<String, String> tags = null;
                    String eTag = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("filters".equals(fieldName)) {
                            filters = reader.readArray(reader1 -> ConfigurationSettingsFilter.fromJson(reader1));
                            filtersFound = true;
                        } else if ("name".equals(fieldName)) {
                            name = reader.getString();
                        } else if ("status".equals(fieldName)) {
                            status = ConfigurationSnapshotStatus.fromString(reader.getString());
                        } else if ("composition_type".equals(fieldName)) {
                            snapshotComposition = SnapshotComposition.fromString(reader.getString());
                        } else if ("created".equals(fieldName)) {
                            createdAt =
                                    reader.getNullable(
                                            nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                        } else if ("expires".equals(fieldName)) {
                            expiresAt =
                                    reader.getNullable(
                                            nonNullReader -> OffsetDateTime.parse(nonNullReader.getString()));
                        } else if ("retention_period".equals(fieldName)) {
                            retentionPeriod = reader.getNullable(JsonReader::getLong);
                        } else if ("size".equals(fieldName)) {
                            sizeInBytes = reader.getNullable(JsonReader::getLong);
                        } else if ("items_count".equals(fieldName)) {
                            itemCount = reader.getNullable(JsonReader::getLong);
                        } else if ("tags".equals(fieldName)) {
                            tags = reader.readMap(reader1 -> reader1.getString());
                        } else if ("etag".equals(fieldName)) {
                            eTag = reader.getString();
                        } else {
                            reader.skipChildren();
                        }
                    }
                    if (filtersFound) {
                        ConfigurationSnapshot deserializedConfigurationSnapshot = new ConfigurationSnapshot(filters);
                        deserializedConfigurationSnapshot.name = name;
                        deserializedConfigurationSnapshot.status = status;
                        deserializedConfigurationSnapshot.snapshotComposition = snapshotComposition;
                        deserializedConfigurationSnapshot.createdAt = createdAt;
                        deserializedConfigurationSnapshot.expiresAt = expiresAt;
                        deserializedConfigurationSnapshot.retentionPeriod = retentionPeriod;
                        deserializedConfigurationSnapshot.sizeInBytes = sizeInBytes;
                        deserializedConfigurationSnapshot.itemCount = itemCount;
                        deserializedConfigurationSnapshot.tags = tags;
                        deserializedConfigurationSnapshot.eTag = eTag;

                        return deserializedConfigurationSnapshot;
                    }
                    List<String> missingProperties = new ArrayList<>();
                    if (!filtersFound) {
                        missingProperties.add("filters");
                    }

                    throw new IllegalStateException(
                            "Missing required property/properties: " + String.join(", ", missingProperties));
                });
    }
}
