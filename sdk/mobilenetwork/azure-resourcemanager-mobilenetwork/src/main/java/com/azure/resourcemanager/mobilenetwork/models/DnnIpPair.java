// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DNN and UE IP address.
 */
@Fluent
public final class DnnIpPair {
    /*
     * Data network name
     */
    @JsonProperty(value = "dnn")
    private String dnn;

    /*
     * UE IP address
     */
    @JsonProperty(value = "ueIpAddress")
    private UeIpAddress ueIpAddress;

    /**
     * Creates an instance of DnnIpPair class.
     */
    public DnnIpPair() {
    }

    /**
     * Get the dnn property: Data network name.
     * 
     * @return the dnn value.
     */
    public String dnn() {
        return this.dnn;
    }

    /**
     * Set the dnn property: Data network name.
     * 
     * @param dnn the dnn value to set.
     * @return the DnnIpPair object itself.
     */
    public DnnIpPair withDnn(String dnn) {
        this.dnn = dnn;
        return this;
    }

    /**
     * Get the ueIpAddress property: UE IP address.
     * 
     * @return the ueIpAddress value.
     */
    public UeIpAddress ueIpAddress() {
        return this.ueIpAddress;
    }

    /**
     * Set the ueIpAddress property: UE IP address.
     * 
     * @param ueIpAddress the ueIpAddress value to set.
     * @return the DnnIpPair object itself.
     */
    public DnnIpPair withUeIpAddress(UeIpAddress ueIpAddress) {
        this.ueIpAddress = ueIpAddress;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ueIpAddress() != null) {
            ueIpAddress().validate();
        }
    }
}
