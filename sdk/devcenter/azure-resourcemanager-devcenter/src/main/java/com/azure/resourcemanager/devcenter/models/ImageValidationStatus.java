// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Image validation status.
 */
public final class ImageValidationStatus extends ExpandableStringEnum<ImageValidationStatus> {
    /**
     * Static value Unknown for ImageValidationStatus.
     */
    public static final ImageValidationStatus UNKNOWN = fromString("Unknown");

    /**
     * Static value Pending for ImageValidationStatus.
     */
    public static final ImageValidationStatus PENDING = fromString("Pending");

    /**
     * Static value Succeeded for ImageValidationStatus.
     */
    public static final ImageValidationStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Failed for ImageValidationStatus.
     */
    public static final ImageValidationStatus FAILED = fromString("Failed");

    /**
     * Static value TimedOut for ImageValidationStatus.
     */
    public static final ImageValidationStatus TIMED_OUT = fromString("TimedOut");

    /**
     * Creates a new instance of ImageValidationStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ImageValidationStatus() {
    }

    /**
     * Creates or finds a ImageValidationStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ImageValidationStatus.
     */
    @JsonCreator
    public static ImageValidationStatus fromString(String name) {
        return fromString(name, ImageValidationStatus.class);
    }

    /**
     * Gets known ImageValidationStatus values.
     * 
     * @return known ImageValidationStatus values.
     */
    public static Collection<ImageValidationStatus> values() {
        return values(ImageValidationStatus.class);
    }
}
