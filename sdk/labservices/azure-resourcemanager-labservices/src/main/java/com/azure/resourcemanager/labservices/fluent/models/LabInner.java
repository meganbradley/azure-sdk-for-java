// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.models.AutoShutdownProfile;
import com.azure.resourcemanager.labservices.models.ConnectionProfile;
import com.azure.resourcemanager.labservices.models.LabNetworkProfile;
import com.azure.resourcemanager.labservices.models.LabState;
import com.azure.resourcemanager.labservices.models.ProvisioningState;
import com.azure.resourcemanager.labservices.models.RosterProfile;
import com.azure.resourcemanager.labservices.models.SecurityProfile;
import com.azure.resourcemanager.labservices.models.VirtualMachineProfile;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The lab resource. */
@Fluent
public final class LabInner extends Resource {
    /*
     * Metadata pertaining to creation and last modification of the lab.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Lab resource properties
     */
    @JsonProperty(value = "properties", required = true)
    private LabProperties innerProperties = new LabProperties();

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the lab.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Lab resource properties.
     *
     * @return the innerProperties value.
     */
    private LabProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public LabInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LabInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Current provisioning state of the lab.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the networkProfile property: The network profile for the lab, typically applied via a lab plan. This profile
     * cannot be modified once a lab has been created.
     *
     * @return the networkProfile value.
     */
    public LabNetworkProfile networkProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfile();
    }

    /**
     * Set the networkProfile property: The network profile for the lab, typically applied via a lab plan. This profile
     * cannot be modified once a lab has been created.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the LabInner object itself.
     */
    public LabInner withNetworkProfile(LabNetworkProfile networkProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withNetworkProfile(networkProfile);
        return this;
    }

    /**
     * Get the state property: The lab state.
     *
     * @return the state value.
     */
    public LabState state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Get the autoShutdownProfile property: The resource auto shutdown configuration for the lab. This controls whether
     * actions are taken on resources that are sitting idle.
     *
     * @return the autoShutdownProfile value.
     */
    public AutoShutdownProfile autoShutdownProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().autoShutdownProfile();
    }

    /**
     * Set the autoShutdownProfile property: The resource auto shutdown configuration for the lab. This controls whether
     * actions are taken on resources that are sitting idle.
     *
     * @param autoShutdownProfile the autoShutdownProfile value to set.
     * @return the LabInner object itself.
     */
    public LabInner withAutoShutdownProfile(AutoShutdownProfile autoShutdownProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withAutoShutdownProfile(autoShutdownProfile);
        return this;
    }

    /**
     * Get the connectionProfile property: The connection profile for the lab. This controls settings such as web access
     * to lab resources or whether RDP or SSH ports are open.
     *
     * @return the connectionProfile value.
     */
    public ConnectionProfile connectionProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionProfile();
    }

    /**
     * Set the connectionProfile property: The connection profile for the lab. This controls settings such as web access
     * to lab resources or whether RDP or SSH ports are open.
     *
     * @param connectionProfile the connectionProfile value to set.
     * @return the LabInner object itself.
     */
    public LabInner withConnectionProfile(ConnectionProfile connectionProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withConnectionProfile(connectionProfile);
        return this;
    }

    /**
     * Get the virtualMachineProfile property: The profile used for creating lab virtual machines.
     *
     * @return the virtualMachineProfile value.
     */
    public VirtualMachineProfile virtualMachineProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachineProfile();
    }

    /**
     * Set the virtualMachineProfile property: The profile used for creating lab virtual machines.
     *
     * @param virtualMachineProfile the virtualMachineProfile value to set.
     * @return the LabInner object itself.
     */
    public LabInner withVirtualMachineProfile(VirtualMachineProfile virtualMachineProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withVirtualMachineProfile(virtualMachineProfile);
        return this;
    }

    /**
     * Get the securityProfile property: The lab security profile.
     *
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProfile();
    }

    /**
     * Set the securityProfile property: The lab security profile.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the LabInner object itself.
     */
    public LabInner withSecurityProfile(SecurityProfile securityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withSecurityProfile(securityProfile);
        return this;
    }

    /**
     * Get the rosterProfile property: The lab user list management profile.
     *
     * @return the rosterProfile value.
     */
    public RosterProfile rosterProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().rosterProfile();
    }

    /**
     * Set the rosterProfile property: The lab user list management profile.
     *
     * @param rosterProfile the rosterProfile value to set.
     * @return the LabInner object itself.
     */
    public LabInner withRosterProfile(RosterProfile rosterProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withRosterProfile(rosterProfile);
        return this;
    }

    /**
     * Get the labPlanId property: The ID of the lab plan. Used during resource creation to provide defaults and acts as
     * a permission container when creating a lab via labs.azure.com. Setting a labPlanId on an existing lab provides
     * organization..
     *
     * @return the labPlanId value.
     */
    public String labPlanId() {
        return this.innerProperties() == null ? null : this.innerProperties().labPlanId();
    }

    /**
     * Set the labPlanId property: The ID of the lab plan. Used during resource creation to provide defaults and acts as
     * a permission container when creating a lab via labs.azure.com. Setting a labPlanId on an existing lab provides
     * organization..
     *
     * @param labPlanId the labPlanId value to set.
     * @return the LabInner object itself.
     */
    public LabInner withLabPlanId(String labPlanId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withLabPlanId(labPlanId);
        return this;
    }

    /**
     * Get the title property: The title of the lab.
     *
     * @return the title value.
     */
    public String title() {
        return this.innerProperties() == null ? null : this.innerProperties().title();
    }

    /**
     * Set the title property: The title of the lab.
     *
     * @param title the title value to set.
     * @return the LabInner object itself.
     */
    public LabInner withTitle(String title) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withTitle(title);
        return this;
    }

    /**
     * Get the description property: The description of the lab.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of the lab.
     *
     * @param description the description value to set.
     * @return the LabInner object itself.
     */
    public LabInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new LabProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model LabInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LabInner.class);
}
