// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Microsoft Defender settings for the security profile.
 */
@Fluent
public final class ManagedClusterSecurityProfileDefender {
    /*
     * Resource ID of the Log Analytics workspace to be associated with Microsoft Defender. When Microsoft Defender is
     * enabled, this field is required and must be a valid workspace resource ID. When Microsoft Defender is disabled,
     * leave the field empty.
     */
    @JsonProperty(value = "logAnalyticsWorkspaceResourceId")
    private String logAnalyticsWorkspaceResourceId;

    /*
     * Microsoft Defender threat detection for Cloud settings for the security profile.
     */
    @JsonProperty(value = "securityMonitoring")
    private ManagedClusterSecurityProfileDefenderSecurityMonitoring securityMonitoring;

    /**
     * Creates an instance of ManagedClusterSecurityProfileDefender class.
     */
    public ManagedClusterSecurityProfileDefender() {
    }

    /**
     * Get the logAnalyticsWorkspaceResourceId property: Resource ID of the Log Analytics workspace to be associated
     * with Microsoft Defender. When Microsoft Defender is enabled, this field is required and must be a valid
     * workspace resource ID. When Microsoft Defender is disabled, leave the field empty.
     * 
     * @return the logAnalyticsWorkspaceResourceId value.
     */
    public String logAnalyticsWorkspaceResourceId() {
        return this.logAnalyticsWorkspaceResourceId;
    }

    /**
     * Set the logAnalyticsWorkspaceResourceId property: Resource ID of the Log Analytics workspace to be associated
     * with Microsoft Defender. When Microsoft Defender is enabled, this field is required and must be a valid
     * workspace resource ID. When Microsoft Defender is disabled, leave the field empty.
     * 
     * @param logAnalyticsWorkspaceResourceId the logAnalyticsWorkspaceResourceId value to set.
     * @return the ManagedClusterSecurityProfileDefender object itself.
     */
    public ManagedClusterSecurityProfileDefender
        withLogAnalyticsWorkspaceResourceId(String logAnalyticsWorkspaceResourceId) {
        this.logAnalyticsWorkspaceResourceId = logAnalyticsWorkspaceResourceId;
        return this;
    }

    /**
     * Get the securityMonitoring property: Microsoft Defender threat detection for Cloud settings for the security
     * profile.
     * 
     * @return the securityMonitoring value.
     */
    public ManagedClusterSecurityProfileDefenderSecurityMonitoring securityMonitoring() {
        return this.securityMonitoring;
    }

    /**
     * Set the securityMonitoring property: Microsoft Defender threat detection for Cloud settings for the security
     * profile.
     * 
     * @param securityMonitoring the securityMonitoring value to set.
     * @return the ManagedClusterSecurityProfileDefender object itself.
     */
    public ManagedClusterSecurityProfileDefender
        withSecurityMonitoring(ManagedClusterSecurityProfileDefenderSecurityMonitoring securityMonitoring) {
        this.securityMonitoring = securityMonitoring;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityMonitoring() != null) {
            securityMonitoring().validate();
        }
    }
}
