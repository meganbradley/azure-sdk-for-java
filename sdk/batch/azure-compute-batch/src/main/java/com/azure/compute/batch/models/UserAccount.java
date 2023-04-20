// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties used to create a user used to execute Tasks on an Azure Batch Compute Node. */
@Fluent
public final class UserAccount {
    /*
     * The name of the user Account. Names can contain any Unicode characters up to a
     * maximum length of 20.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The password for the user Account.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /*
     * The default value is nonAdmin.
     */
    @JsonProperty(value = "elevationLevel")
    private ElevationLevel elevationLevel;

    /*
     * This property is ignored if specified on a Windows Pool. If not specified, the
     * user is created with the default options.
     */
    @JsonProperty(value = "linuxUserConfiguration")
    private LinuxUserConfiguration linuxUserConfiguration;

    /*
     * This property can only be specified if the user is on a Windows Pool. If not
     * specified and on a Windows Pool, the user is created with the default options.
     */
    @JsonProperty(value = "windowsUserConfiguration")
    private WindowsUserConfiguration windowsUserConfiguration;

    //TODO: Changing password required to false is temporary
    /**
     * Creates an instance of UserAccount class.
     *
     * @param name the name value to set.
     * @param password the password value to set.
     */
    @JsonCreator
    public UserAccount(
            @JsonProperty(value = "name", required = true) String name,
            @JsonProperty(value = "password", required = false) String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * Get the name property: The name of the user Account. Names can contain any Unicode characters up to a maximum
     * length of 20.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the password property: The password for the user Account.
     *
     * @return the password value.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Get the elevationLevel property: The default value is nonAdmin.
     *
     * @return the elevationLevel value.
     */
    public ElevationLevel getElevationLevel() {
        return this.elevationLevel;
    }

    /**
     * Set the elevationLevel property: The default value is nonAdmin.
     *
     * @param elevationLevel the elevationLevel value to set.
     * @return the UserAccount object itself.
     */
    public UserAccount setElevationLevel(ElevationLevel elevationLevel) {
        this.elevationLevel = elevationLevel;
        return this;
    }

    /**
     * Get the linuxUserConfiguration property: This property is ignored if specified on a Windows Pool. If not
     * specified, the user is created with the default options.
     *
     * @return the linuxUserConfiguration value.
     */
    public LinuxUserConfiguration getLinuxUserConfiguration() {
        return this.linuxUserConfiguration;
    }

    /**
     * Set the linuxUserConfiguration property: This property is ignored if specified on a Windows Pool. If not
     * specified, the user is created with the default options.
     *
     * @param linuxUserConfiguration the linuxUserConfiguration value to set.
     * @return the UserAccount object itself.
     */
    public UserAccount setLinuxUserConfiguration(LinuxUserConfiguration linuxUserConfiguration) {
        this.linuxUserConfiguration = linuxUserConfiguration;
        return this;
    }

    /**
     * Get the windowsUserConfiguration property: This property can only be specified if the user is on a Windows Pool.
     * If not specified and on a Windows Pool, the user is created with the default options.
     *
     * @return the windowsUserConfiguration value.
     */
    public WindowsUserConfiguration getWindowsUserConfiguration() {
        return this.windowsUserConfiguration;
    }

    /**
     * Set the windowsUserConfiguration property: This property can only be specified if the user is on a Windows Pool.
     * If not specified and on a Windows Pool, the user is created with the default options.
     *
     * @param windowsUserConfiguration the windowsUserConfiguration value to set.
     * @return the UserAccount object itself.
     */
    public UserAccount setWindowsUserConfiguration(WindowsUserConfiguration windowsUserConfiguration) {
        this.windowsUserConfiguration = windowsUserConfiguration;
        return this;
    }
}
