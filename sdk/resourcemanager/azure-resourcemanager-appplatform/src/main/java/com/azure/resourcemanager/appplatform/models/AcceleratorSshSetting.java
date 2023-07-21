// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Auth setting for SSH auth. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authType")
@JsonTypeName("SSH")
@Fluent
public final class AcceleratorSshSetting extends AcceleratorAuthSetting {
    /*
     * Public SSH Key of git repository.
     */
    @JsonProperty(value = "hostKey")
    private String hostKey;

    /*
     * SSH Key algorithm of git repository.
     */
    @JsonProperty(value = "hostKeyAlgorithm")
    private String hostKeyAlgorithm;

    /*
     * Private SSH Key algorithm of git repository.
     */
    @JsonProperty(value = "privateKey")
    private String privateKey;

    /** Creates an instance of AcceleratorSshSetting class. */
    public AcceleratorSshSetting() {
    }

    /**
     * Get the hostKey property: Public SSH Key of git repository.
     *
     * @return the hostKey value.
     */
    public String hostKey() {
        return this.hostKey;
    }

    /**
     * Set the hostKey property: Public SSH Key of git repository.
     *
     * @param hostKey the hostKey value to set.
     * @return the AcceleratorSshSetting object itself.
     */
    public AcceleratorSshSetting withHostKey(String hostKey) {
        this.hostKey = hostKey;
        return this;
    }

    /**
     * Get the hostKeyAlgorithm property: SSH Key algorithm of git repository.
     *
     * @return the hostKeyAlgorithm value.
     */
    public String hostKeyAlgorithm() {
        return this.hostKeyAlgorithm;
    }

    /**
     * Set the hostKeyAlgorithm property: SSH Key algorithm of git repository.
     *
     * @param hostKeyAlgorithm the hostKeyAlgorithm value to set.
     * @return the AcceleratorSshSetting object itself.
     */
    public AcceleratorSshSetting withHostKeyAlgorithm(String hostKeyAlgorithm) {
        this.hostKeyAlgorithm = hostKeyAlgorithm;
        return this;
    }

    /**
     * Get the privateKey property: Private SSH Key algorithm of git repository.
     *
     * @return the privateKey value.
     */
    public String privateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: Private SSH Key algorithm of git repository.
     *
     * @param privateKey the privateKey value to set.
     * @return the AcceleratorSshSetting object itself.
     */
    public AcceleratorSshSetting withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
