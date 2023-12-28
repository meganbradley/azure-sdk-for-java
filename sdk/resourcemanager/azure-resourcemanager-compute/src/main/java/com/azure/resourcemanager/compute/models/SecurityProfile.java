// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the Security profile settings for the virtual machine or virtual machine scale set.
 */
@Fluent
public final class SecurityProfile {
    /*
     * Specifies the security settings like secure boot and vTPM used while creating the virtual machine. Minimum
     * api-version: 2020-12-01.
     */
    @JsonProperty(value = "uefiSettings")
    private UefiSettings uefiSettings;

    /*
     * This property can be used by user in the request to enable or disable the Host Encryption for the virtual
     * machine or virtual machine scale set. This will enable the encryption for all the disks including Resource/Temp
     * disk at host itself. The default behavior is: The Encryption at host will be disabled unless this property is
     * set to true for the resource.
     */
    @JsonProperty(value = "encryptionAtHost")
    private Boolean encryptionAtHost;

    /*
     * Specifies the SecurityType of the virtual machine. It has to be set to any specified value to enable
     * UefiSettings. The default behavior is: UefiSettings will not be enabled unless this property is set.
     */
    @JsonProperty(value = "securityType")
    private SecurityTypes securityType;

    /*
     * Specifies the Managed Identity used by ADE to get access token for keyvault operations.
     */
    @JsonProperty(value = "encryptionIdentity")
    private EncryptionIdentity encryptionIdentity;

    /*
     * Specifies ProxyAgent settings while creating the virtual machine. Minimum api-version: 2023-09-01.
     */
    @JsonProperty(value = "proxyAgentSettings")
    private ProxyAgentSettings proxyAgentSettings;

    /**
     * Creates an instance of SecurityProfile class.
     */
    public SecurityProfile() {
    }

    /**
     * Get the uefiSettings property: Specifies the security settings like secure boot and vTPM used while creating the
     * virtual machine. Minimum api-version: 2020-12-01.
     * 
     * @return the uefiSettings value.
     */
    public UefiSettings uefiSettings() {
        return this.uefiSettings;
    }

    /**
     * Set the uefiSettings property: Specifies the security settings like secure boot and vTPM used while creating the
     * virtual machine. Minimum api-version: 2020-12-01.
     * 
     * @param uefiSettings the uefiSettings value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withUefiSettings(UefiSettings uefiSettings) {
        this.uefiSettings = uefiSettings;
        return this;
    }

    /**
     * Get the encryptionAtHost property: This property can be used by user in the request to enable or disable the
     * Host Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all
     * the disks including Resource/Temp disk at host itself. The default behavior is: The Encryption at host will be
     * disabled unless this property is set to true for the resource.
     * 
     * @return the encryptionAtHost value.
     */
    public Boolean encryptionAtHost() {
        return this.encryptionAtHost;
    }

    /**
     * Set the encryptionAtHost property: This property can be used by user in the request to enable or disable the
     * Host Encryption for the virtual machine or virtual machine scale set. This will enable the encryption for all
     * the disks including Resource/Temp disk at host itself. The default behavior is: The Encryption at host will be
     * disabled unless this property is set to true for the resource.
     * 
     * @param encryptionAtHost the encryptionAtHost value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withEncryptionAtHost(Boolean encryptionAtHost) {
        this.encryptionAtHost = encryptionAtHost;
        return this;
    }

    /**
     * Get the securityType property: Specifies the SecurityType of the virtual machine. It has to be set to any
     * specified value to enable UefiSettings. The default behavior is: UefiSettings will not be enabled unless this
     * property is set.
     * 
     * @return the securityType value.
     */
    public SecurityTypes securityType() {
        return this.securityType;
    }

    /**
     * Set the securityType property: Specifies the SecurityType of the virtual machine. It has to be set to any
     * specified value to enable UefiSettings. The default behavior is: UefiSettings will not be enabled unless this
     * property is set.
     * 
     * @param securityType the securityType value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withSecurityType(SecurityTypes securityType) {
        this.securityType = securityType;
        return this;
    }

    /**
     * Get the encryptionIdentity property: Specifies the Managed Identity used by ADE to get access token for keyvault
     * operations.
     * 
     * @return the encryptionIdentity value.
     */
    public EncryptionIdentity encryptionIdentity() {
        return this.encryptionIdentity;
    }

    /**
     * Set the encryptionIdentity property: Specifies the Managed Identity used by ADE to get access token for keyvault
     * operations.
     * 
     * @param encryptionIdentity the encryptionIdentity value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withEncryptionIdentity(EncryptionIdentity encryptionIdentity) {
        this.encryptionIdentity = encryptionIdentity;
        return this;
    }

    /**
     * Get the proxyAgentSettings property: Specifies ProxyAgent settings while creating the virtual machine. Minimum
     * api-version: 2023-09-01.
     * 
     * @return the proxyAgentSettings value.
     */
    public ProxyAgentSettings proxyAgentSettings() {
        return this.proxyAgentSettings;
    }

    /**
     * Set the proxyAgentSettings property: Specifies ProxyAgent settings while creating the virtual machine. Minimum
     * api-version: 2023-09-01.
     * 
     * @param proxyAgentSettings the proxyAgentSettings value to set.
     * @return the SecurityProfile object itself.
     */
    public SecurityProfile withProxyAgentSettings(ProxyAgentSettings proxyAgentSettings) {
        this.proxyAgentSettings = proxyAgentSettings;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (uefiSettings() != null) {
            uefiSettings().validate();
        }
        if (encryptionIdentity() != null) {
            encryptionIdentity().validate();
        }
        if (proxyAgentSettings() != null) {
            proxyAgentSettings().validate();
        }
    }
}
