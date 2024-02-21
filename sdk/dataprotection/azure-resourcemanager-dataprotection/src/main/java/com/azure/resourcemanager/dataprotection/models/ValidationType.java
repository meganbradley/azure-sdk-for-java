// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Specifies the type of validation. In case of DeepValidation, all validations from /validateForBackup API will run
 * again.
 */
public final class ValidationType extends ExpandableStringEnum<ValidationType> {
    /**
     * Static value ShallowValidation for ValidationType.
     */
    public static final ValidationType SHALLOW_VALIDATION = fromString("ShallowValidation");

    /**
     * Static value DeepValidation for ValidationType.
     */
    public static final ValidationType DEEP_VALIDATION = fromString("DeepValidation");

    /**
     * Creates a new instance of ValidationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ValidationType() {
    }

    /**
     * Creates or finds a ValidationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ValidationType.
     */
    @JsonCreator
    public static ValidationType fromString(String name) {
        return fromString(name, ValidationType.class);
    }

    /**
     * Gets known ValidationType values.
     * 
     * @return known ValidationType values.
     */
    public static Collection<ValidationType> values() {
        return values(ValidationType.class);
    }
}
