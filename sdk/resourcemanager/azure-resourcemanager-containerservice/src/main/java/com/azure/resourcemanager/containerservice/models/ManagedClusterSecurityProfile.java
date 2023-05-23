// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Security profile for the container service cluster. */
@Fluent
public final class ManagedClusterSecurityProfile {
    /*
     * Microsoft Defender settings for the security profile.
     */
    @JsonProperty(value = "defender")
    private ManagedClusterSecurityProfileDefender defender;

    /*
     * Azure Key Vault [key management service](https://kubernetes.io/docs/tasks/administer-cluster/kms-provider/)
     * settings for the security profile.
     */
    @JsonProperty(value = "azureKeyVaultKms")
    private AzureKeyVaultKms azureKeyVaultKms;

    /*
     * Workload identity settings for the security profile. Workload identity enables Kubernetes applications to access
     * Azure cloud resources securely with Azure AD. See https://aka.ms/aks/wi for more details.
     */
    @JsonProperty(value = "workloadIdentity")
    private ManagedClusterSecurityProfileWorkloadIdentity workloadIdentity;

    /*
     * Image Cleaner settings for the security profile.
     */
    @JsonProperty(value = "imageCleaner")
    private ManagedClusterSecurityProfileImageCleaner imageCleaner;

    /** Creates an instance of ManagedClusterSecurityProfile class. */
    public ManagedClusterSecurityProfile() {
    }

    /**
     * Get the defender property: Microsoft Defender settings for the security profile.
     *
     * @return the defender value.
     */
    public ManagedClusterSecurityProfileDefender defender() {
        return this.defender;
    }

    /**
     * Set the defender property: Microsoft Defender settings for the security profile.
     *
     * @param defender the defender value to set.
     * @return the ManagedClusterSecurityProfile object itself.
     */
    public ManagedClusterSecurityProfile withDefender(ManagedClusterSecurityProfileDefender defender) {
        this.defender = defender;
        return this;
    }

    /**
     * Get the azureKeyVaultKms property: Azure Key Vault [key management
     * service](https://kubernetes.io/docs/tasks/administer-cluster/kms-provider/) settings for the security profile.
     *
     * @return the azureKeyVaultKms value.
     */
    public AzureKeyVaultKms azureKeyVaultKms() {
        return this.azureKeyVaultKms;
    }

    /**
     * Set the azureKeyVaultKms property: Azure Key Vault [key management
     * service](https://kubernetes.io/docs/tasks/administer-cluster/kms-provider/) settings for the security profile.
     *
     * @param azureKeyVaultKms the azureKeyVaultKms value to set.
     * @return the ManagedClusterSecurityProfile object itself.
     */
    public ManagedClusterSecurityProfile withAzureKeyVaultKms(AzureKeyVaultKms azureKeyVaultKms) {
        this.azureKeyVaultKms = azureKeyVaultKms;
        return this;
    }

    /**
     * Get the workloadIdentity property: Workload identity settings for the security profile. Workload identity enables
     * Kubernetes applications to access Azure cloud resources securely with Azure AD. See https://aka.ms/aks/wi for
     * more details.
     *
     * @return the workloadIdentity value.
     */
    public ManagedClusterSecurityProfileWorkloadIdentity workloadIdentity() {
        return this.workloadIdentity;
    }

    /**
     * Set the workloadIdentity property: Workload identity settings for the security profile. Workload identity enables
     * Kubernetes applications to access Azure cloud resources securely with Azure AD. See https://aka.ms/aks/wi for
     * more details.
     *
     * @param workloadIdentity the workloadIdentity value to set.
     * @return the ManagedClusterSecurityProfile object itself.
     */
    public ManagedClusterSecurityProfile withWorkloadIdentity(
        ManagedClusterSecurityProfileWorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
        return this;
    }

    /**
     * Get the imageCleaner property: Image Cleaner settings for the security profile.
     *
     * @return the imageCleaner value.
     */
    public ManagedClusterSecurityProfileImageCleaner imageCleaner() {
        return this.imageCleaner;
    }

    /**
     * Set the imageCleaner property: Image Cleaner settings for the security profile.
     *
     * @param imageCleaner the imageCleaner value to set.
     * @return the ManagedClusterSecurityProfile object itself.
     */
    public ManagedClusterSecurityProfile withImageCleaner(ManagedClusterSecurityProfileImageCleaner imageCleaner) {
        this.imageCleaner = imageCleaner;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (defender() != null) {
            defender().validate();
        }
        if (azureKeyVaultKms() != null) {
            azureKeyVaultKms().validate();
        }
        if (workloadIdentity() != null) {
            workloadIdentity().validate();
        }
        if (imageCleaner() != null) {
            imageCleaner().validate();
        }
    }
}
