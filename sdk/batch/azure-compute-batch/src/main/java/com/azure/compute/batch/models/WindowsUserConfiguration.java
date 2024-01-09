// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties used to create a user Account on a Windows Compute Node.
 */
@Fluent
public final class WindowsUserConfiguration {

    /*
     * The login mode for the user. The default value for VirtualMachineConfiguration Pools is 'batch' and for
     * CloudServiceConfiguration Pools is 'interactive'.
     */
    @Generated
    @JsonProperty(value = "loginMode")
    private LoginMode loginMode;

    /**
     * Creates an instance of WindowsUserConfiguration class.
     */
    @Generated
    public WindowsUserConfiguration() {
    }

    /**
     * Get the loginMode property: The login mode for the user. The default value for VirtualMachineConfiguration Pools
     * is 'batch' and for CloudServiceConfiguration Pools is 'interactive'.
     *
     * @return the loginMode value.
     */
    @Generated
    public LoginMode getLoginMode() {
        return this.loginMode;
    }

    /**
     * Set the loginMode property: The login mode for the user. The default value for VirtualMachineConfiguration Pools
     * is 'batch' and for CloudServiceConfiguration Pools is 'interactive'.
     *
     * @param loginMode the loginMode value to set.
     * @return the WindowsUserConfiguration object itself.
     */
    @Generated
    public WindowsUserConfiguration setLoginMode(LoginMode loginMode) {
        this.loginMode = loginMode;
        return this;
    }
}
