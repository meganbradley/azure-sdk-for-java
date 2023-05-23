// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Identity for the managed cluster. */
@Fluent
public final class ManagedClusterIdentity {
    /*
     * The principal id of the system assigned identity which is used by master components.
     */
    @JsonProperty(value = "principalId", access = JsonProperty.Access.WRITE_ONLY)
    private String principalId;

    /*
     * The tenant id of the system assigned identity which is used by master components.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /*
     * The type of identity used for the managed cluster.
     *
     * For more information see [use managed identities in
     * AKS](https://docs.microsoft.com/azure/aks/use-managed-identity).
     */
    @JsonProperty(value = "type")
    private ResourceIdentityType type;

    /*
     * The keys must be ARM resource IDs in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     */
    @JsonProperty(value = "userAssignedIdentities")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, ManagedServiceIdentityUserAssignedIdentitiesValue> userAssignedIdentities;

    /** Creates an instance of ManagedClusterIdentity class. */
    public ManagedClusterIdentity() {
    }

    /**
     * Get the principalId property: The principal id of the system assigned identity which is used by master
     * components.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Get the tenantId property: The tenant id of the system assigned identity which is used by master components.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get the type property: The type of identity used for the managed cluster.
     *
     * <p>For more information see [use managed identities in
     * AKS](https://docs.microsoft.com/azure/aks/use-managed-identity).
     *
     * @return the type value.
     */
    public ResourceIdentityType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of identity used for the managed cluster.
     *
     * <p>For more information see [use managed identities in
     * AKS](https://docs.microsoft.com/azure/aks/use-managed-identity).
     *
     * @param type the type value to set.
     * @return the ManagedClusterIdentity object itself.
     */
    public ManagedClusterIdentity withType(ResourceIdentityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the userAssignedIdentities property: The keys must be ARM resource IDs in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @return the userAssignedIdentities value.
     */
    public Map<String, ManagedServiceIdentityUserAssignedIdentitiesValue> userAssignedIdentities() {
        return this.userAssignedIdentities;
    }

    /**
     * Set the userAssignedIdentities property: The keys must be ARM resource IDs in the form:
     * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     *
     * @param userAssignedIdentities the userAssignedIdentities value to set.
     * @return the ManagedClusterIdentity object itself.
     */
    public ManagedClusterIdentity withUserAssignedIdentities(
        Map<String, ManagedServiceIdentityUserAssignedIdentitiesValue> userAssignedIdentities) {
        this.userAssignedIdentities = userAssignedIdentities;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (userAssignedIdentities() != null) {
            userAssignedIdentities()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
    }
}
