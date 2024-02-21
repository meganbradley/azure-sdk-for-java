// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeGroupUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volume Group request.
 */
@Fluent
public final class VolumeGroupUpdate {
    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * Properties of VolumeGroup.
     */
    @JsonProperty(value = "properties")
    private VolumeGroupUpdateProperties innerProperties;

    /**
     * Creates an instance of VolumeGroupUpdate class.
     */
    public VolumeGroupUpdate() {
    }

    /**
     * Get the identity property: The identity of the resource.
     * 
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     * 
     * @param identity the identity value to set.
     * @return the VolumeGroupUpdate object itself.
     */
    public VolumeGroupUpdate withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of VolumeGroup.
     * 
     * @return the innerProperties value.
     */
    private VolumeGroupUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the protocolType property: Type of storage target.
     * 
     * @return the protocolType value.
     */
    public StorageTargetType protocolType() {
        return this.innerProperties() == null ? null : this.innerProperties().protocolType();
    }

    /**
     * Set the protocolType property: Type of storage target.
     * 
     * @param protocolType the protocolType value to set.
     * @return the VolumeGroupUpdate object itself.
     */
    public VolumeGroupUpdate withProtocolType(StorageTargetType protocolType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupUpdateProperties();
        }
        this.innerProperties().withProtocolType(protocolType);
        return this;
    }

    /**
     * Get the encryption property: Type of encryption.
     * 
     * @return the encryption value.
     */
    public EncryptionType encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Type of encryption.
     * 
     * @param encryption the encryption value to set.
     * @return the VolumeGroupUpdate object itself.
     */
    public VolumeGroupUpdate withEncryption(EncryptionType encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupUpdateProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the encryptionProperties property: Encryption Properties describing Key Vault and Identity information.
     * 
     * @return the encryptionProperties value.
     */
    public EncryptionProperties encryptionProperties() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionProperties();
    }

    /**
     * Set the encryptionProperties property: Encryption Properties describing Key Vault and Identity information.
     * 
     * @param encryptionProperties the encryptionProperties value to set.
     * @return the VolumeGroupUpdate object itself.
     */
    public VolumeGroupUpdate withEncryptionProperties(EncryptionProperties encryptionProperties) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupUpdateProperties();
        }
        this.innerProperties().withEncryptionProperties(encryptionProperties);
        return this;
    }

    /**
     * Get the networkAcls property: A collection of rules governing the accessibility from specific network locations.
     * 
     * @return the networkAcls value.
     */
    public NetworkRuleSet networkAcls() {
        return this.innerProperties() == null ? null : this.innerProperties().networkAcls();
    }

    /**
     * Set the networkAcls property: A collection of rules governing the accessibility from specific network locations.
     * 
     * @param networkAcls the networkAcls value to set.
     * @return the VolumeGroupUpdate object itself.
     */
    public VolumeGroupUpdate withNetworkAcls(NetworkRuleSet networkAcls) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeGroupUpdateProperties();
        }
        this.innerProperties().withNetworkAcls(networkAcls);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
