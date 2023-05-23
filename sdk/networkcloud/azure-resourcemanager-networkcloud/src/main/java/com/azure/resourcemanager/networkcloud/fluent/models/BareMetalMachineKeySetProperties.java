// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineKeySetDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineKeySetPrivilegeLevel;
import com.azure.resourcemanager.networkcloud.models.BareMetalMachineKeySetProvisioningState;
import com.azure.resourcemanager.networkcloud.models.KeySetUser;
import com.azure.resourcemanager.networkcloud.models.KeySetUserStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** BareMetalMachineKeySetProperties represents the properties of bare metal machine key set. */
@Fluent
public final class BareMetalMachineKeySetProperties {
    /*
     * The object ID of Azure Active Directory group that all users in the list must be in for access to be granted.
     * Users that are not in the group will not have access.
     */
    @JsonProperty(value = "azureGroupId", required = true)
    private String azureGroupId;

    /*
     * The more detailed status of the key set.
     */
    @JsonProperty(value = "detailedStatus", access = JsonProperty.Access.WRITE_ONLY)
    private BareMetalMachineKeySetDetailedStatus detailedStatus;

    /*
     * The descriptive message about the current detailed status.
     */
    @JsonProperty(value = "detailedStatusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String detailedStatusMessage;

    /*
     * The date and time after which the users in this key set will be removed from the bare metal machines.
     */
    @JsonProperty(value = "expiration", required = true)
    private OffsetDateTime expiration;

    /*
     * The list of IP addresses of jump hosts with management network access from which a login will be allowed for the
     * users.
     */
    @JsonProperty(value = "jumpHostsAllowed", required = true)
    private List<String> jumpHostsAllowed;

    /*
     * The last time this key set was validated.
     */
    @JsonProperty(value = "lastValidation", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastValidation;

    /*
     * The name of the group that users will be assigned to on the operating system of the machines.
     */
    @JsonProperty(value = "osGroupName")
    private String osGroupName;

    /*
     * The access level allowed for the users in this key set.
     */
    @JsonProperty(value = "privilegeLevel", required = true)
    private BareMetalMachineKeySetPrivilegeLevel privilegeLevel;

    /*
     * The provisioning state of the bare metal machine key set.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private BareMetalMachineKeySetProvisioningState provisioningState;

    /*
     * The unique list of permitted users.
     */
    @JsonProperty(value = "userList", required = true)
    private List<KeySetUser> userList;

    /*
     * The status evaluation of each user.
     */
    @JsonProperty(value = "userListStatus", access = JsonProperty.Access.WRITE_ONLY)
    private List<KeySetUserStatus> userListStatus;

    /** Creates an instance of BareMetalMachineKeySetProperties class. */
    public BareMetalMachineKeySetProperties() {
    }

    /**
     * Get the azureGroupId property: The object ID of Azure Active Directory group that all users in the list must be
     * in for access to be granted. Users that are not in the group will not have access.
     *
     * @return the azureGroupId value.
     */
    public String azureGroupId() {
        return this.azureGroupId;
    }

    /**
     * Set the azureGroupId property: The object ID of Azure Active Directory group that all users in the list must be
     * in for access to be granted. Users that are not in the group will not have access.
     *
     * @param azureGroupId the azureGroupId value to set.
     * @return the BareMetalMachineKeySetProperties object itself.
     */
    public BareMetalMachineKeySetProperties withAzureGroupId(String azureGroupId) {
        this.azureGroupId = azureGroupId;
        return this;
    }

    /**
     * Get the detailedStatus property: The more detailed status of the key set.
     *
     * @return the detailedStatus value.
     */
    public BareMetalMachineKeySetDetailedStatus detailedStatus() {
        return this.detailedStatus;
    }

    /**
     * Get the detailedStatusMessage property: The descriptive message about the current detailed status.
     *
     * @return the detailedStatusMessage value.
     */
    public String detailedStatusMessage() {
        return this.detailedStatusMessage;
    }

    /**
     * Get the expiration property: The date and time after which the users in this key set will be removed from the
     * bare metal machines.
     *
     * @return the expiration value.
     */
    public OffsetDateTime expiration() {
        return this.expiration;
    }

    /**
     * Set the expiration property: The date and time after which the users in this key set will be removed from the
     * bare metal machines.
     *
     * @param expiration the expiration value to set.
     * @return the BareMetalMachineKeySetProperties object itself.
     */
    public BareMetalMachineKeySetProperties withExpiration(OffsetDateTime expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Get the jumpHostsAllowed property: The list of IP addresses of jump hosts with management network access from
     * which a login will be allowed for the users.
     *
     * @return the jumpHostsAllowed value.
     */
    public List<String> jumpHostsAllowed() {
        return this.jumpHostsAllowed;
    }

    /**
     * Set the jumpHostsAllowed property: The list of IP addresses of jump hosts with management network access from
     * which a login will be allowed for the users.
     *
     * @param jumpHostsAllowed the jumpHostsAllowed value to set.
     * @return the BareMetalMachineKeySetProperties object itself.
     */
    public BareMetalMachineKeySetProperties withJumpHostsAllowed(List<String> jumpHostsAllowed) {
        this.jumpHostsAllowed = jumpHostsAllowed;
        return this;
    }

    /**
     * Get the lastValidation property: The last time this key set was validated.
     *
     * @return the lastValidation value.
     */
    public OffsetDateTime lastValidation() {
        return this.lastValidation;
    }

    /**
     * Get the osGroupName property: The name of the group that users will be assigned to on the operating system of the
     * machines.
     *
     * @return the osGroupName value.
     */
    public String osGroupName() {
        return this.osGroupName;
    }

    /**
     * Set the osGroupName property: The name of the group that users will be assigned to on the operating system of the
     * machines.
     *
     * @param osGroupName the osGroupName value to set.
     * @return the BareMetalMachineKeySetProperties object itself.
     */
    public BareMetalMachineKeySetProperties withOsGroupName(String osGroupName) {
        this.osGroupName = osGroupName;
        return this;
    }

    /**
     * Get the privilegeLevel property: The access level allowed for the users in this key set.
     *
     * @return the privilegeLevel value.
     */
    public BareMetalMachineKeySetPrivilegeLevel privilegeLevel() {
        return this.privilegeLevel;
    }

    /**
     * Set the privilegeLevel property: The access level allowed for the users in this key set.
     *
     * @param privilegeLevel the privilegeLevel value to set.
     * @return the BareMetalMachineKeySetProperties object itself.
     */
    public BareMetalMachineKeySetProperties withPrivilegeLevel(BareMetalMachineKeySetPrivilegeLevel privilegeLevel) {
        this.privilegeLevel = privilegeLevel;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the bare metal machine key set.
     *
     * @return the provisioningState value.
     */
    public BareMetalMachineKeySetProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the userList property: The unique list of permitted users.
     *
     * @return the userList value.
     */
    public List<KeySetUser> userList() {
        return this.userList;
    }

    /**
     * Set the userList property: The unique list of permitted users.
     *
     * @param userList the userList value to set.
     * @return the BareMetalMachineKeySetProperties object itself.
     */
    public BareMetalMachineKeySetProperties withUserList(List<KeySetUser> userList) {
        this.userList = userList;
        return this;
    }

    /**
     * Get the userListStatus property: The status evaluation of each user.
     *
     * @return the userListStatus value.
     */
    public List<KeySetUserStatus> userListStatus() {
        return this.userListStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (azureGroupId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property azureGroupId in model BareMetalMachineKeySetProperties"));
        }
        if (expiration() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property expiration in model BareMetalMachineKeySetProperties"));
        }
        if (jumpHostsAllowed() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property jumpHostsAllowed in model BareMetalMachineKeySetProperties"));
        }
        if (privilegeLevel() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property privilegeLevel in model BareMetalMachineKeySetProperties"));
        }
        if (userList() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property userList in model BareMetalMachineKeySetProperties"));
        } else {
            userList().forEach(e -> e.validate());
        }
        if (userListStatus() != null) {
            userListStatus().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BareMetalMachineKeySetProperties.class);
}
