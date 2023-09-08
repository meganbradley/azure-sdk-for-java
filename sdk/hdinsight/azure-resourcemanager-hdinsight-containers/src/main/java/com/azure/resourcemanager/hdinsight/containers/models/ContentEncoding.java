// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * This property indicates if the content is encoded and is case-insensitive. Please set the value to base64 if the
 * content is base64 encoded. Set it to none or skip it if the content is plain text.
 */
public final class ContentEncoding extends ExpandableStringEnum<ContentEncoding> {
    /** Static value Base64 for ContentEncoding. */
    public static final ContentEncoding BASE64 = fromString("Base64");

    /** Static value None for ContentEncoding. */
    public static final ContentEncoding NONE = fromString("None");

    /**
     * Creates a new instance of ContentEncoding value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ContentEncoding() {
    }

    /**
     * Creates or finds a ContentEncoding from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContentEncoding.
     */
    @JsonCreator
    public static ContentEncoding fromString(String name) {
        return fromString(name, ContentEncoding.class);
    }

    /**
     * Gets known ContentEncoding values.
     *
     * @return known ContentEncoding values.
     */
    public static Collection<ContentEncoding> values() {
        return values(ContentEncoding.class);
    }
}
