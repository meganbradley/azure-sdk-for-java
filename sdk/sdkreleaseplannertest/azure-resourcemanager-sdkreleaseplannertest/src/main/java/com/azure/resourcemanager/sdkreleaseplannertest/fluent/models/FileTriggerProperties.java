// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sdkreleaseplannertest.models.FileSourceInfo;
import com.azure.resourcemanager.sdkreleaseplannertest.models.RoleSinkInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/** File trigger properties. */
@Fluent
public final class FileTriggerProperties {
    /*
     * File event source details.
     */
    @JsonProperty(value = "sourceInfo", required = true)
    private FileSourceInfo sourceInfo;

    /*
     * Role sink info.
     */
    @JsonProperty(value = "sinkInfo", required = true)
    private RoleSinkInfo sinkInfo;

    /*
     * A custom context tag typically used to correlate the trigger against its usage. For example, if a periodic timer
     * trigger is intended for certain specific IoT modules in the device, the tag can be the name or the image URL of
     * the module.
     */
    @JsonProperty(value = "customContextTag")
    private String customContextTag;

    /** Creates an instance of FileTriggerProperties class. */
    public FileTriggerProperties() {
    }

    /**
     * Get the sourceInfo property: File event source details.
     *
     * @return the sourceInfo value.
     */
    public FileSourceInfo sourceInfo() {
        return this.sourceInfo;
    }

    /**
     * Set the sourceInfo property: File event source details.
     *
     * @param sourceInfo the sourceInfo value to set.
     * @return the FileTriggerProperties object itself.
     */
    public FileTriggerProperties withSourceInfo(FileSourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        return this;
    }

    /**
     * Get the sinkInfo property: Role sink info.
     *
     * @return the sinkInfo value.
     */
    public RoleSinkInfo sinkInfo() {
        return this.sinkInfo;
    }

    /**
     * Set the sinkInfo property: Role sink info.
     *
     * @param sinkInfo the sinkInfo value to set.
     * @return the FileTriggerProperties object itself.
     */
    public FileTriggerProperties withSinkInfo(RoleSinkInfo sinkInfo) {
        this.sinkInfo = sinkInfo;
        return this;
    }

    /**
     * Get the customContextTag property: A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the
     * tag can be the name or the image URL of the module.
     *
     * @return the customContextTag value.
     */
    public String customContextTag() {
        return this.customContextTag;
    }

    /**
     * Set the customContextTag property: A custom context tag typically used to correlate the trigger against its
     * usage. For example, if a periodic timer trigger is intended for certain specific IoT modules in the device, the
     * tag can be the name or the image URL of the module.
     *
     * @param customContextTag the customContextTag value to set.
     * @return the FileTriggerProperties object itself.
     */
    public FileTriggerProperties withCustomContextTag(String customContextTag) {
        this.customContextTag = customContextTag;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceInfo in model FileTriggerProperties"));
        } else {
            sourceInfo().validate();
        }
        if (sinkInfo() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sinkInfo in model FileTriggerProperties"));
        } else {
            sinkInfo().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FileTriggerProperties.class);
}
