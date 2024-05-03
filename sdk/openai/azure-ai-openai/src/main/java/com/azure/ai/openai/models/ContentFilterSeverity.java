// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Ratings for the intensity and risk level of harmful content.
 */
public final class ContentFilterSeverity extends ExpandableStringEnum<ContentFilterSeverity> {

    /**
     * Content may be related to violence, self-harm, sexual, or hate categories but the terms
     * are used in general, journalistic, scientific, medical, and similar professional contexts,
     * which are appropriate for most audiences.
     */
    @Generated
    public static final ContentFilterSeverity SAFE = fromString("safe");

    /**
     * Content that expresses prejudiced, judgmental, or opinionated views, includes offensive
     * use of language, stereotyping, use cases exploring a fictional world (for example, gaming,
     * literature) and depictions at low intensity.
     */
    @Generated
    public static final ContentFilterSeverity LOW = fromString("low");

    /**
     * Content that uses offensive, insulting, mocking, intimidating, or demeaning language
     * towards specific identity groups, includes depictions of seeking and executing harmful
     * instructions, fantasies, glorification, promotion of harm at medium intensity.
     */
    @Generated
    public static final ContentFilterSeverity MEDIUM = fromString("medium");

    /**
     * Content that displays explicit and severe harmful instructions, actions,
     * damage, or abuse; includes endorsement, glorification, or promotion of severe
     * harmful acts, extreme or illegal forms of harm, radicalization, or non-consensual
     * power exchange or abuse.
     */
    @Generated
    public static final ContentFilterSeverity HIGH = fromString("high");

    /**
     * Creates a new instance of ContentFilterSeverity value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ContentFilterSeverity() {
    }

    /**
     * Creates or finds a ContentFilterSeverity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ContentFilterSeverity.
     */
    @Generated
    public static ContentFilterSeverity fromString(String name) {
        return fromString(name, ContentFilterSeverity.class);
    }

    /**
     * Gets known ContentFilterSeverity values.
     *
     * @return known ContentFilterSeverity values.
     */
    @Generated
    public static Collection<ContentFilterSeverity> values() {
        return values(ContentFilterSeverity.class);
    }
}
