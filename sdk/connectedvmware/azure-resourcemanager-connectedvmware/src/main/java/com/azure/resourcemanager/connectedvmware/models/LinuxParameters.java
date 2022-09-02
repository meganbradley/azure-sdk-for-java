// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Input for InstallPatches on a Linux VM, as directly received by the API. */
@Fluent
public final class LinuxParameters {
    /*
     * The update classifications to select when installing patches for Linux.
     */
    @JsonProperty(value = "classificationsToInclude")
    private List<VMGuestPatchClassificationLinux> classificationsToInclude;

    /*
     * packages to include in the patch operation. Format: packageName_packageVersion
     */
    @JsonProperty(value = "packageNameMasksToInclude")
    private List<String> packageNameMasksToInclude;

    /*
     * packages to exclude in the patch operation. Format: packageName_packageVersion
     */
    @JsonProperty(value = "packageNameMasksToExclude")
    private List<String> packageNameMasksToExclude;

    /**
     * Get the classificationsToInclude property: The update classifications to select when installing patches for
     * Linux.
     *
     * @return the classificationsToInclude value.
     */
    public List<VMGuestPatchClassificationLinux> classificationsToInclude() {
        return this.classificationsToInclude;
    }

    /**
     * Set the classificationsToInclude property: The update classifications to select when installing patches for
     * Linux.
     *
     * @param classificationsToInclude the classificationsToInclude value to set.
     * @return the LinuxParameters object itself.
     */
    public LinuxParameters withClassificationsToInclude(
        List<VMGuestPatchClassificationLinux> classificationsToInclude) {
        this.classificationsToInclude = classificationsToInclude;
        return this;
    }

    /**
     * Get the packageNameMasksToInclude property: packages to include in the patch operation. Format:
     * packageName_packageVersion.
     *
     * @return the packageNameMasksToInclude value.
     */
    public List<String> packageNameMasksToInclude() {
        return this.packageNameMasksToInclude;
    }

    /**
     * Set the packageNameMasksToInclude property: packages to include in the patch operation. Format:
     * packageName_packageVersion.
     *
     * @param packageNameMasksToInclude the packageNameMasksToInclude value to set.
     * @return the LinuxParameters object itself.
     */
    public LinuxParameters withPackageNameMasksToInclude(List<String> packageNameMasksToInclude) {
        this.packageNameMasksToInclude = packageNameMasksToInclude;
        return this;
    }

    /**
     * Get the packageNameMasksToExclude property: packages to exclude in the patch operation. Format:
     * packageName_packageVersion.
     *
     * @return the packageNameMasksToExclude value.
     */
    public List<String> packageNameMasksToExclude() {
        return this.packageNameMasksToExclude;
    }

    /**
     * Set the packageNameMasksToExclude property: packages to exclude in the patch operation. Format:
     * packageName_packageVersion.
     *
     * @param packageNameMasksToExclude the packageNameMasksToExclude value to set.
     * @return the LinuxParameters object itself.
     */
    public LinuxParameters withPackageNameMasksToExclude(List<String> packageNameMasksToExclude) {
        this.packageNameMasksToExclude = packageNameMasksToExclude;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
