// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whether a particular kubernetes version's variant (CBLMariner, Windows, Windows2022) is ready or not.
 */
@Fluent
public final class KubernetesVersionReadiness {
    /*
     * The particular KubernetesVersion's Image's OS Type (Linux, Windows)
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private OsType osType;

    /*
     * Specifies the OS SKU used by the agent pool. The default is CBLMariner if OSType is Linux. The default is
     * Windows2019 when OSType is Windows.
     */
    @JsonProperty(value = "osSku")
    private Ossku osSku;

    /*
     * Whether or not the given image is ready
     */
    @JsonProperty(value = "ready", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean ready;

    /*
     * If image is not ready, the error message for version not being ready
     */
    @JsonProperty(value = "errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Creates an instance of KubernetesVersionReadiness class.
     */
    public KubernetesVersionReadiness() {
    }

    /**
     * Get the osType property: The particular KubernetesVersion's Image's OS Type (Linux, Windows).
     * 
     * @return the osType value.
     */
    public OsType osType() {
        return this.osType;
    }

    /**
     * Get the osSku property: Specifies the OS SKU used by the agent pool. The default is CBLMariner if OSType is
     * Linux. The default is Windows2019 when OSType is Windows.
     * 
     * @return the osSku value.
     */
    public Ossku osSku() {
        return this.osSku;
    }

    /**
     * Set the osSku property: Specifies the OS SKU used by the agent pool. The default is CBLMariner if OSType is
     * Linux. The default is Windows2019 when OSType is Windows.
     * 
     * @param osSku the osSku value to set.
     * @return the KubernetesVersionReadiness object itself.
     */
    public KubernetesVersionReadiness withOsSku(Ossku osSku) {
        this.osSku = osSku;
        return this;
    }

    /**
     * Get the ready property: Whether or not the given image is ready.
     * 
     * @return the ready value.
     */
    public Boolean ready() {
        return this.ready;
    }

    /**
     * Get the errorMessage property: If image is not ready, the error message for version not being ready.
     * 
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
