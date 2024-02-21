// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SAS URIs of the console screenshot and serial log blobs.
 */
@Immutable
public final class RetrieveBootDiagnosticsDataResultInner {
    /*
     * The console screenshot blob URI
     */
    @JsonProperty(value = "consoleScreenshotBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String consoleScreenshotBlobUri;

    /*
     * The serial console log blob URI.
     */
    @JsonProperty(value = "serialConsoleLogBlobUri", access = JsonProperty.Access.WRITE_ONLY)
    private String serialConsoleLogBlobUri;

    /**
     * Creates an instance of RetrieveBootDiagnosticsDataResultInner class.
     */
    public RetrieveBootDiagnosticsDataResultInner() {
    }

    /**
     * Get the consoleScreenshotBlobUri property: The console screenshot blob URI.
     * 
     * @return the consoleScreenshotBlobUri value.
     */
    public String consoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }

    /**
     * Get the serialConsoleLogBlobUri property: The serial console log blob URI.
     * 
     * @return the serialConsoleLogBlobUri value.
     */
    public String serialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
