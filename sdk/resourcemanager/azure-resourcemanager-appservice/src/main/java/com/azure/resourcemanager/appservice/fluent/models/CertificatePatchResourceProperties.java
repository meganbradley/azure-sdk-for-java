// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.resourcemanager.appservice.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.models.KeyVaultSecretStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** CertificatePatchResource resource specific properties. */
@Fluent
public final class CertificatePatchResourceProperties {
    /*
     * Certificate password.
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * Friendly name of the certificate.
     */
    @JsonProperty(value = "friendlyName", access = JsonProperty.Access.WRITE_ONLY)
    private String friendlyName;

    /*
     * Subject name of the certificate.
     */
    @JsonProperty(value = "subjectName", access = JsonProperty.Access.WRITE_ONLY)
    private String subjectName;

    /*
     * Host names the certificate applies to.
     */
    @JsonProperty(value = "hostNames")
    private List<String> hostNames;

    /*
     * Pfx blob.
     */
    @JsonProperty(value = "pfxBlob")
    private byte[] pfxBlob;

    /*
     * App name.
     */
    @JsonProperty(value = "siteName", access = JsonProperty.Access.WRITE_ONLY)
    private String siteName;

    /*
     * Self link.
     */
    @JsonProperty(value = "selfLink", access = JsonProperty.Access.WRITE_ONLY)
    private String selfLink;

    /*
     * Certificate issuer.
     */
    @JsonProperty(value = "issuer", access = JsonProperty.Access.WRITE_ONLY)
    private String issuer;

    /*
     * Certificate issue Date.
     */
    @JsonProperty(value = "issueDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime issueDate;

    /*
     * Certificate expiration date.
     */
    @JsonProperty(value = "expirationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expirationDate;

    /*
     * Certificate thumbprint.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * Is the certificate valid?.
     */
    @JsonProperty(value = "valid", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean valid;

    /*
     * Raw bytes of .cer file
     */
    @JsonProperty(value = "cerBlob", access = JsonProperty.Access.WRITE_ONLY)
    private byte[] cerBlob;

    /*
     * Public key hash.
     */
    @JsonProperty(value = "publicKeyHash", access = JsonProperty.Access.WRITE_ONLY)
    private String publicKeyHash;

    /*
     * Specification for the App Service Environment to use for the certificate.
     */
    @JsonProperty(value = "hostingEnvironmentProfile", access = JsonProperty.Access.WRITE_ONLY)
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /*
     * Key Vault Csm resource Id.
     */
    @JsonProperty(value = "keyVaultId")
    private String keyVaultId;

    /*
     * Key Vault secret name.
     */
    @JsonProperty(value = "keyVaultSecretName")
    private String keyVaultSecretName;

    /*
     * Status of the Key Vault secret.
     */
    @JsonProperty(value = "keyVaultSecretStatus", access = JsonProperty.Access.WRITE_ONLY)
    private KeyVaultSecretStatus keyVaultSecretStatus;

    /*
     * Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     */
    @JsonProperty(value = "serverFarmId")
    private String serverFarmId;

    /*
     * CNAME of the certificate to be issued via free certificate
     */
    @JsonProperty(value = "canonicalName")
    private String canonicalName;

    /*
     * Method of domain validation for free cert
     */
    @JsonProperty(value = "domainValidationMethod")
    private String domainValidationMethod;

    /** Creates an instance of CertificatePatchResourceProperties class. */
    public CertificatePatchResourceProperties() {
    }

    /**
     * Get the password property: Certificate password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Certificate password.
     *
     * @param password the password value to set.
     * @return the CertificatePatchResourceProperties object itself.
     */
    public CertificatePatchResourceProperties withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the friendlyName property: Friendly name of the certificate.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Get the subjectName property: Subject name of the certificate.
     *
     * @return the subjectName value.
     */
    public String subjectName() {
        return this.subjectName;
    }

    /**
     * Get the hostNames property: Host names the certificate applies to.
     *
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames property: Host names the certificate applies to.
     *
     * @param hostNames the hostNames value to set.
     * @return the CertificatePatchResourceProperties object itself.
     */
    public CertificatePatchResourceProperties withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Get the pfxBlob property: Pfx blob.
     *
     * @return the pfxBlob value.
     */
    public byte[] pfxBlob() {
        return CoreUtils.clone(this.pfxBlob);
    }

    /**
     * Set the pfxBlob property: Pfx blob.
     *
     * @param pfxBlob the pfxBlob value to set.
     * @return the CertificatePatchResourceProperties object itself.
     */
    public CertificatePatchResourceProperties withPfxBlob(byte[] pfxBlob) {
        this.pfxBlob = CoreUtils.clone(pfxBlob);
        return this;
    }

    /**
     * Get the siteName property: App name.
     *
     * @return the siteName value.
     */
    public String siteName() {
        return this.siteName;
    }

    /**
     * Get the selfLink property: Self link.
     *
     * @return the selfLink value.
     */
    public String selfLink() {
        return this.selfLink;
    }

    /**
     * Get the issuer property: Certificate issuer.
     *
     * @return the issuer value.
     */
    public String issuer() {
        return this.issuer;
    }

    /**
     * Get the issueDate property: Certificate issue Date.
     *
     * @return the issueDate value.
     */
    public OffsetDateTime issueDate() {
        return this.issueDate;
    }

    /**
     * Get the expirationDate property: Certificate expiration date.
     *
     * @return the expirationDate value.
     */
    public OffsetDateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Get the thumbprint property: Certificate thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the valid property: Is the certificate valid?.
     *
     * @return the valid value.
     */
    public Boolean valid() {
        return this.valid;
    }

    /**
     * Get the cerBlob property: Raw bytes of .cer file.
     *
     * @return the cerBlob value.
     */
    public byte[] cerBlob() {
        return CoreUtils.clone(this.cerBlob);
    }

    /**
     * Get the publicKeyHash property: Public key hash.
     *
     * @return the publicKeyHash value.
     */
    public String publicKeyHash() {
        return this.publicKeyHash;
    }

    /**
     * Get the hostingEnvironmentProfile property: Specification for the App Service Environment to use for the
     * certificate.
     *
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Get the keyVaultId property: Key Vault Csm resource Id.
     *
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set the keyVaultId property: Key Vault Csm resource Id.
     *
     * @param keyVaultId the keyVaultId value to set.
     * @return the CertificatePatchResourceProperties object itself.
     */
    public CertificatePatchResourceProperties withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get the keyVaultSecretName property: Key Vault secret name.
     *
     * @return the keyVaultSecretName value.
     */
    public String keyVaultSecretName() {
        return this.keyVaultSecretName;
    }

    /**
     * Set the keyVaultSecretName property: Key Vault secret name.
     *
     * @param keyVaultSecretName the keyVaultSecretName value to set.
     * @return the CertificatePatchResourceProperties object itself.
     */
    public CertificatePatchResourceProperties withKeyVaultSecretName(String keyVaultSecretName) {
        this.keyVaultSecretName = keyVaultSecretName;
        return this;
    }

    /**
     * Get the keyVaultSecretStatus property: Status of the Key Vault secret.
     *
     * @return the keyVaultSecretStatus value.
     */
    public KeyVaultSecretStatus keyVaultSecretStatus() {
        return this.keyVaultSecretStatus;
    }

    /**
     * Get the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     *
     * @return the serverFarmId value.
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     *
     * @param serverFarmId the serverFarmId value to set.
     * @return the CertificatePatchResourceProperties object itself.
     */
    public CertificatePatchResourceProperties withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get the canonicalName property: CNAME of the certificate to be issued via free certificate.
     *
     * @return the canonicalName value.
     */
    public String canonicalName() {
        return this.canonicalName;
    }

    /**
     * Set the canonicalName property: CNAME of the certificate to be issued via free certificate.
     *
     * @param canonicalName the canonicalName value to set.
     * @return the CertificatePatchResourceProperties object itself.
     */
    public CertificatePatchResourceProperties withCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
        return this;
    }

    /**
     * Get the domainValidationMethod property: Method of domain validation for free cert.
     *
     * @return the domainValidationMethod value.
     */
    public String domainValidationMethod() {
        return this.domainValidationMethod;
    }

    /**
     * Set the domainValidationMethod property: Method of domain validation for free cert.
     *
     * @param domainValidationMethod the domainValidationMethod value to set.
     * @return the CertificatePatchResourceProperties object itself.
     */
    public CertificatePatchResourceProperties withDomainValidationMethod(String domainValidationMethod) {
        this.domainValidationMethod = domainValidationMethod;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostingEnvironmentProfile() != null) {
            hostingEnvironmentProfile().validate();
        }
    }
}
