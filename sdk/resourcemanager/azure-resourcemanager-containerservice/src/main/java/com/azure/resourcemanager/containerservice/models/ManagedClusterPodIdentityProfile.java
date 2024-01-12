// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The pod identity profile of the Managed Cluster.
 *
 * See [use AAD pod identity](https://docs.microsoft.com/azure/aks/use-azure-ad-pod-identity) for more details on pod
 * identity integration.
 */
@Fluent
public final class ManagedClusterPodIdentityProfile {
    /*
     * Whether the pod identity addon is enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Whether pod identity is allowed to run on clusters with Kubenet networking.
     *
     * Running in Kubenet is disabled by default due to the security related nature of AAD Pod Identity and the risks
     * of IP spoofing. See [using Kubenet network plugin with AAD Pod
     * Identity](https://docs.microsoft.com/azure/aks/use-azure-ad-pod-identity#using-kubenet-network-plugin-with-azure-
     * active-directory-pod-managed-identities)
     * for more information.
     */
    @JsonProperty(value = "allowNetworkPluginKubenet")
    private Boolean allowNetworkPluginKubenet;

    /*
     * The pod identities to use in the cluster.
     */
    @JsonProperty(value = "userAssignedIdentities")
    private List<ManagedClusterPodIdentity> userAssignedIdentities;

    /*
     * The pod identity exceptions to allow.
     */
    @JsonProperty(value = "userAssignedIdentityExceptions")
    private List<ManagedClusterPodIdentityException> userAssignedIdentityExceptions;

    /**
     * Creates an instance of ManagedClusterPodIdentityProfile class.
     */
    public ManagedClusterPodIdentityProfile() {
    }

    /**
     * Get the enabled property: Whether the pod identity addon is enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether the pod identity addon is enabled.
     *
     * @param enabled the enabled value to set.
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the allowNetworkPluginKubenet property: Whether pod identity is allowed to run on clusters with Kubenet
     * networking.
     *
     * Running in Kubenet is disabled by default due to the security related nature of AAD Pod Identity and the risks
     * of IP spoofing. See [using Kubenet network plugin with AAD Pod
     * Identity](https://docs.microsoft.com/azure/aks/use-azure-ad-pod-identity#using-kubenet-network-plugin-with-azure-active-directory-pod-managed-identities)
     * for more information.
     *
     * @return the allowNetworkPluginKubenet value.
     */
    public Boolean allowNetworkPluginKubenet() {
        return this.allowNetworkPluginKubenet;
    }

    /**
     * Set the allowNetworkPluginKubenet property: Whether pod identity is allowed to run on clusters with Kubenet
     * networking.
     *
     * Running in Kubenet is disabled by default due to the security related nature of AAD Pod Identity and the risks
     * of IP spoofing. See [using Kubenet network plugin with AAD Pod
     * Identity](https://docs.microsoft.com/azure/aks/use-azure-ad-pod-identity#using-kubenet-network-plugin-with-azure-active-directory-pod-managed-identities)
     * for more information.
     *
     * @param allowNetworkPluginKubenet the allowNetworkPluginKubenet value to set.
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile withAllowNetworkPluginKubenet(Boolean allowNetworkPluginKubenet) {
        this.allowNetworkPluginKubenet = allowNetworkPluginKubenet;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The pod identities to use in the cluster.
     *
     * @return the userAssignedIdentities value.
     */
    public List<ManagedClusterPodIdentity> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The pod identities to use in the cluster.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile
        withUserAssignedIdentities(List<ManagedClusterPodIdentity> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Get the userAssignedIdentityExceptions property: The pod identity exceptions to allow.
     *
     * @return the userAssignedIdentityExceptions value.
     */
    public List<ManagedClusterPodIdentityException> userAssignedIdentityExceptions() {
        return this.userAssignedIdentityExceptions;
    }

    /**
     * Set the userAssignedIdentityExceptions property: The pod identity exceptions to allow.
     *
     * @param userAssignedIdentityExceptions the userAssignedIdentityExceptions value to set.
     * @return the ManagedClusterPodIdentityProfile object itself.
     */
    public ManagedClusterPodIdentityProfile
        withUserAssignedIdentityExceptions(List<ManagedClusterPodIdentityException> userAssignedIdentityExceptions) {
        this.userAssignedIdentityExceptions = userAssignedIdentityExceptions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities().forEach(e -> e.validate());
        }
        if (userAssignedIdentityExceptions() != null) {
            userAssignedIdentityExceptions().forEach(e -> e.validate());
        }
    }
}
