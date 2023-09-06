// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.storage.models.SshPublicKey;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Storage Account Local User keys. */
@Fluent
public final class LocalUserKeysInner {
    /*
     * Optional, local user ssh authorized keys for SFTP.
     */
    @JsonProperty(value = "sshAuthorizedKeys")
    private List<SshPublicKey> sshAuthorizedKeys;

    /*
     * Auto generated by the server for SMB authentication.
     */
    @JsonProperty(value = "sharedKey", access = JsonProperty.Access.WRITE_ONLY)
    private String sharedKey;

    /** Creates an instance of LocalUserKeysInner class. */
    public LocalUserKeysInner() {
    }

    /**
     * Get the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP.
     *
     * @return the sshAuthorizedKeys value.
     */
    public List<SshPublicKey> sshAuthorizedKeys() {
        return this.sshAuthorizedKeys;
    }

    /**
     * Set the sshAuthorizedKeys property: Optional, local user ssh authorized keys for SFTP.
     *
     * @param sshAuthorizedKeys the sshAuthorizedKeys value to set.
     * @return the LocalUserKeysInner object itself.
     */
    public LocalUserKeysInner withSshAuthorizedKeys(List<SshPublicKey> sshAuthorizedKeys) {
        this.sshAuthorizedKeys = sshAuthorizedKeys;
        return this;
    }

    /**
     * Get the sharedKey property: Auto generated by the server for SMB authentication.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sshAuthorizedKeys() != null) {
            sshAuthorizedKeys().forEach(e -> e.validate());
        }
    }
}
