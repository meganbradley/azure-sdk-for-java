// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for FileShareStorageType. */
public final class FileShareStorageType extends ExpandableStringEnum<FileShareStorageType> {
    /** Static value Standard_LRS for FileShareStorageType. */
    public static final FileShareStorageType STANDARD_LRS = fromString("Standard_LRS");

    /** Static value Standard_GRS for FileShareStorageType. */
    public static final FileShareStorageType STANDARD_GRS = fromString("Standard_GRS");

    /** Static value Standard_ZRS for FileShareStorageType. */
    public static final FileShareStorageType STANDARD_ZRS = fromString("Standard_ZRS");

    /** Static value Premium_LRS for FileShareStorageType. */
    public static final FileShareStorageType PREMIUM_LRS = fromString("Premium_LRS");

    /**
     * Creates or finds a FileShareStorageType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding FileShareStorageType.
     */
    @JsonCreator
    public static FileShareStorageType fromString(String name) {
        return fromString(name, FileShareStorageType.class);
    }

    /**
     * Gets known FileShareStorageType values.
     *
     * @return known FileShareStorageType values.
     */
    public static Collection<FileShareStorageType> values() {
        return values(FileShareStorageType.class);
    }
}
