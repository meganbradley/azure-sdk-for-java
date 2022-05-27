// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies policy and settings for SSH access. */
@Fluent
public final class ComputeInstanceSshSettings {
    /*
     * Access policy for SSH State of the public SSH port. Possible values are:
     * Disabled - Indicates that the public ssh port is closed on this
     * instance. Enabled - Indicates that the public ssh port is open and
     * accessible according to the VNet/subnet policy if applicable.
     */
    @JsonProperty(value = "sshPublicAccess")
    private SshPublicAccess sshPublicAccess;

    /*
     * Describes the admin user name.
     */
    @JsonProperty(value = "adminUserName", access = JsonProperty.Access.WRITE_ONLY)
    private String adminUsername;

    /*
     * Describes the port for connecting through SSH.
     */
    @JsonProperty(value = "sshPort", access = JsonProperty.Access.WRITE_ONLY)
    private Integer sshPort;

    /*
     * Specifies the SSH rsa public key file as a string. Use "ssh-keygen -t
     * rsa -b 2048" to generate your SSH key pairs.
     */
    @JsonProperty(value = "adminPublicKey")
    private String adminPublicKey;

    /**
     * Get the sshPublicAccess property: Access policy for SSH State of the public SSH port. Possible values are:
     * Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh
     * port is open and accessible according to the VNet/subnet policy if applicable.
     *
     * @return the sshPublicAccess value.
     */
    public SshPublicAccess sshPublicAccess() {
        return this.sshPublicAccess;
    }

    /**
     * Set the sshPublicAccess property: Access policy for SSH State of the public SSH port. Possible values are:
     * Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh
     * port is open and accessible according to the VNet/subnet policy if applicable.
     *
     * @param sshPublicAccess the sshPublicAccess value to set.
     * @return the ComputeInstanceSshSettings object itself.
     */
    public ComputeInstanceSshSettings withSshPublicAccess(SshPublicAccess sshPublicAccess) {
        this.sshPublicAccess = sshPublicAccess;
        return this;
    }

    /**
     * Get the adminUsername property: Describes the admin user name.
     *
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Get the sshPort property: Describes the port for connecting through SSH.
     *
     * @return the sshPort value.
     */
    public Integer sshPort() {
        return this.sshPort;
    }

    /**
     * Get the adminPublicKey property: Specifies the SSH rsa public key file as a string. Use "ssh-keygen -t rsa -b
     * 2048" to generate your SSH key pairs.
     *
     * @return the adminPublicKey value.
     */
    public String adminPublicKey() {
        return this.adminPublicKey;
    }

    /**
     * Set the adminPublicKey property: Specifies the SSH rsa public key file as a string. Use "ssh-keygen -t rsa -b
     * 2048" to generate your SSH key pairs.
     *
     * @param adminPublicKey the adminPublicKey value to set.
     * @return the ComputeInstanceSshSettings object itself.
     */
    public ComputeInstanceSshSettings withAdminPublicKey(String adminPublicKey) {
        this.adminPublicKey = adminPublicKey;
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
