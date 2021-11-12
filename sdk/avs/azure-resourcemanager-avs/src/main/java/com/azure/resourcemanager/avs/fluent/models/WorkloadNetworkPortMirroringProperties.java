// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.PortMirroringDirectionEnum;
import com.azure.resourcemanager.avs.models.PortMirroringStatusEnum;
import com.azure.resourcemanager.avs.models.WorkloadNetworkPortMirroringProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NSX Port Mirroring Properties. */
@Fluent
public final class WorkloadNetworkPortMirroringProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkloadNetworkPortMirroringProperties.class);

    /*
     * Display name of the port mirroring profile.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Direction of port mirroring profile.
     */
    @JsonProperty(value = "direction")
    private PortMirroringDirectionEnum direction;

    /*
     * Source VM Group.
     */
    @JsonProperty(value = "source")
    private String source;

    /*
     * Destination VM Group.
     */
    @JsonProperty(value = "destination")
    private String destination;

    /*
     * Port Mirroring Status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private PortMirroringStatusEnum status;

    /*
     * The provisioning state
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private WorkloadNetworkPortMirroringProvisioningState provisioningState;

    /*
     * NSX revision number.
     */
    @JsonProperty(value = "revision")
    private Long revision;

    /**
     * Get the displayName property: Display name of the port mirroring profile.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the port mirroring profile.
     *
     * @param displayName the displayName value to set.
     * @return the WorkloadNetworkPortMirroringProperties object itself.
     */
    public WorkloadNetworkPortMirroringProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the direction property: Direction of port mirroring profile.
     *
     * @return the direction value.
     */
    public PortMirroringDirectionEnum direction() {
        return this.direction;
    }

    /**
     * Set the direction property: Direction of port mirroring profile.
     *
     * @param direction the direction value to set.
     * @return the WorkloadNetworkPortMirroringProperties object itself.
     */
    public WorkloadNetworkPortMirroringProperties withDirection(PortMirroringDirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the source property: Source VM Group.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: Source VM Group.
     *
     * @param source the source value to set.
     * @return the WorkloadNetworkPortMirroringProperties object itself.
     */
    public WorkloadNetworkPortMirroringProperties withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination property: Destination VM Group.
     *
     * @return the destination value.
     */
    public String destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Destination VM Group.
     *
     * @param destination the destination value to set.
     * @return the WorkloadNetworkPortMirroringProperties object itself.
     */
    public WorkloadNetworkPortMirroringProperties withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the status property: Port Mirroring Status.
     *
     * @return the status value.
     */
    public PortMirroringStatusEnum status() {
        return this.status;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public WorkloadNetworkPortMirroringProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the revision property: NSX revision number.
     *
     * @return the revision value.
     */
    public Long revision() {
        return this.revision;
    }

    /**
     * Set the revision property: NSX revision number.
     *
     * @param revision the revision value to set.
     * @return the WorkloadNetworkPortMirroringProperties object itself.
     */
    public WorkloadNetworkPortMirroringProperties withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
