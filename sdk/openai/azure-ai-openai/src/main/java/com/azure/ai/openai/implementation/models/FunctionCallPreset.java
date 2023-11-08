// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The collection of predefined behaviors for handling request-provided function information in a chat completions
 * operation.
 */
public final class FunctionCallPreset extends ExpandableStringEnum<FunctionCallPreset> {

    /**
     * Specifies that the model may either use any of the functions provided in this chat completions request or instead
     * return a standard chat completions response as if no functions were provided.
     */
    @Generated public static final FunctionCallPreset AUTO = fromString("auto");

    /**
     * Specifies that the model should not respond with a function call and should instead provide a standard chat
     * completions response. Response content may still be influenced by the provided function information.
     */
    @Generated public static final FunctionCallPreset NONE = fromString("none");

    /**
     * Creates a new instance of FunctionCallPreset value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public FunctionCallPreset() {}

    /**
     * Creates or finds a FunctionCallPreset from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FunctionCallPreset.
     */
    @Generated
    @JsonCreator
    public static FunctionCallPreset fromString(String name) {
        return fromString(name, FunctionCallPreset.class);
    }

    /**
     * Gets known FunctionCallPreset values.
     *
     * @return known FunctionCallPreset values.
     */
    @Generated
    public static Collection<FunctionCallPreset> values() {
        return values(FunctionCallPreset.class);
    }
}
