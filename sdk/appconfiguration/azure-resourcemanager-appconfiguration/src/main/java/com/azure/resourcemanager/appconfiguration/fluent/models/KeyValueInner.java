// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The key-value resource along with all resource properties. */
@Fluent
public final class KeyValueInner extends ProxyResource {
    /*
     * All key-value properties.
     */
    @JsonProperty(value = "properties")
    private KeyValueProperties innerProperties;

    /** Creates an instance of KeyValueInner class. */
    public KeyValueInner() {
    }

    /**
     * Get the innerProperties property: All key-value properties.
     *
     * @return the innerProperties value.
     */
    private KeyValueProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the key property: The primary identifier of a key-value. The key is used in unison with the label to uniquely
     * identify a key-value.
     *
     * @return the key value.
     */
    public String key() {
        return this.innerProperties() == null ? null : this.innerProperties().key();
    }

    /**
     * Get the label property: A value used to group key-values. The label is used in unison with the key to uniquely
     * identify a key-value.
     *
     * @return the label value.
     */
    public String label() {
        return this.innerProperties() == null ? null : this.innerProperties().label();
    }

    /**
     * Get the value property: The value of the key-value.
     *
     * @return the value value.
     */
    public String value() {
        return this.innerProperties() == null ? null : this.innerProperties().value();
    }

    /**
     * Set the value property: The value of the key-value.
     *
     * @param value the value value to set.
     * @return the KeyValueInner object itself.
     */
    public KeyValueInner withValue(String value) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyValueProperties();
        }
        this.innerProperties().withValue(value);
        return this;
    }

    /**
     * Get the contentType property: The content type of the key-value's value. Providing a proper content-type can
     * enable transformations of values when they are retrieved by applications.
     *
     * @return the contentType value.
     */
    public String contentType() {
        return this.innerProperties() == null ? null : this.innerProperties().contentType();
    }

    /**
     * Set the contentType property: The content type of the key-value's value. Providing a proper content-type can
     * enable transformations of values when they are retrieved by applications.
     *
     * @param contentType the contentType value to set.
     * @return the KeyValueInner object itself.
     */
    public KeyValueInner withContentType(String contentType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyValueProperties();
        }
        this.innerProperties().withContentType(contentType);
        return this;
    }

    /**
     * Get the etag property: An ETag indicating the state of a key-value within a configuration store.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.innerProperties() == null ? null : this.innerProperties().etag();
    }

    /**
     * Get the lastModified property: The last time a modifying operation was performed on the given key-value.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.innerProperties() == null ? null : this.innerProperties().lastModified();
    }

    /**
     * Get the locked property: A value indicating whether the key-value is locked. A locked key-value may not be
     * modified until it is unlocked.
     *
     * @return the locked value.
     */
    public Boolean locked() {
        return this.innerProperties() == null ? null : this.innerProperties().locked();
    }

    /**
     * Get the tags property: A dictionary of tags that can help identify what a key-value may be applicable for.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.innerProperties() == null ? null : this.innerProperties().tags();
    }

    /**
     * Set the tags property: A dictionary of tags that can help identify what a key-value may be applicable for.
     *
     * @param tags the tags value to set.
     * @return the KeyValueInner object itself.
     */
    public KeyValueInner withTags(Map<String, String> tags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new KeyValueProperties();
        }
        this.innerProperties().withTags(tags);
        return this;
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
