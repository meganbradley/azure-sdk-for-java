// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Packet core control plane collect diagnostics package options.
 */
@Fluent
public final class PacketCoreControlPlaneCollectDiagnosticsPackage {
    /*
     * The Storage Account Blob URL to upload the diagnostics package to.
     */
    @JsonProperty(value = "storageAccountBlobUrl", required = true)
    private String storageAccountBlobUrl;

    /**
     * Creates an instance of PacketCoreControlPlaneCollectDiagnosticsPackage class.
     */
    public PacketCoreControlPlaneCollectDiagnosticsPackage() {
    }

    /**
     * Get the storageAccountBlobUrl property: The Storage Account Blob URL to upload the diagnostics package to.
     * 
     * @return the storageAccountBlobUrl value.
     */
    public String storageAccountBlobUrl() {
        return this.storageAccountBlobUrl;
    }

    /**
     * Set the storageAccountBlobUrl property: The Storage Account Blob URL to upload the diagnostics package to.
     * 
     * @param storageAccountBlobUrl the storageAccountBlobUrl value to set.
     * @return the PacketCoreControlPlaneCollectDiagnosticsPackage object itself.
     */
    public PacketCoreControlPlaneCollectDiagnosticsPackage withStorageAccountBlobUrl(String storageAccountBlobUrl) {
        this.storageAccountBlobUrl = storageAccountBlobUrl;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageAccountBlobUrl() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property storageAccountBlobUrl in model PacketCoreControlPlaneCollectDiagnosticsPackage"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PacketCoreControlPlaneCollectDiagnosticsPackage.class);
}
