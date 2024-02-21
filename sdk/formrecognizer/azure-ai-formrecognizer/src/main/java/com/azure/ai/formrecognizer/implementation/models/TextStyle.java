// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The text line style name, including handwriting and other. */
public final class TextStyle extends ExpandableStringEnum<TextStyle> {
    /** Static value other for TextStyle. */
    public static final TextStyle OTHER = fromString("other");

    /** Static value handwriting for TextStyle. */
    public static final TextStyle HANDWRITING = fromString("handwriting");

    /**
     * Creates a new instance of TextStyle value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TextStyle() {}

    /**
     * Creates or finds a TextStyle from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TextStyle.
     */
    @JsonCreator
    public static TextStyle fromString(String name) {
        return fromString(name, TextStyle.class);
    }

    /**
     * Gets known TextStyle values.
     *
     * @return known TextStyle values.
     */
    public static Collection<TextStyle> values() {
        return values(TextStyle.class);
    }
}
