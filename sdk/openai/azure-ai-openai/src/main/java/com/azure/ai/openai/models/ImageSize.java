// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The desired size of generated images.
 */
public final class ImageSize extends ExpandableStringEnum<ImageSize> {

    /**
     * Very small image size of 256x256 pixels.
     * Only supported with dall-e-2 models.
     */
    @Generated
    public static final ImageSize SIZE256X256 = fromString("256x256");

    /**
     * A smaller image size of 512x512 pixels.
     * Only supported with dall-e-2 models.
     */
    @Generated
    public static final ImageSize SIZE512X512 = fromString("512x512");

    /**
     * A standard, square image size of 1024x1024 pixels.
     * Supported by both dall-e-2 and dall-e-3 models.
     */
    @Generated
    public static final ImageSize SIZE1024X1024 = fromString("1024x1024");

    /**
     * Creates a new instance of ImageSize value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public ImageSize() {
    }

    /**
     * Creates or finds a ImageSize from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImageSize.
     */
    @Generated
    @JsonCreator
    public static ImageSize fromString(String name) {
        return fromString(name, ImageSize.class);
    }

    /**
     * Gets known ImageSize values.
     *
     * @return known ImageSize values.
     */
    @Generated
    public static Collection<ImageSize> values() {
        return values(ImageSize.class);
    }

    /**
     * A wider image size of 1024x1792 pixels.
     * Only supported with dall-e-3 models.
     */
    @Generated
    public static final ImageSize SIZE1792X1024 = fromString("1792x1024");

    /**
     * A taller image size of 1792x1024 pixels.
     * Only supported with dall-e-3 models.
     */
    @Generated
    public static final ImageSize SIZE1024X1792 = fromString("1024x1792");
}
