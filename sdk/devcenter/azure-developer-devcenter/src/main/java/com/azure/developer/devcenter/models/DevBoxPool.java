// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.developer.devcenter.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A pool of Dev Boxes.
 */
@Immutable
public final class DevBoxPool {

    /*
     * Pool name
     */
    @Generated
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Azure region where Dev Boxes in the pool are located
     */
    @Generated
    @JsonProperty(value = "location")
    private String location;

    /*
     * The operating system type of Dev Boxes in this pool
     */
    @Generated
    @JsonProperty(value = "osType")
    private DevBoxOsType osType;

    /*
     * Hardware settings for the Dev Boxes created in this pool
     */
    @Generated
    @JsonProperty(value = "hardwareProfile")
    private DevBoxHardwareProfile hardwareProfile;

    /*
     * Indicates whether hibernate is enabled/disabled or unknown.
     */
    @Generated
    @JsonProperty(value = "hibernateSupport")
    private HibernateSupport hibernateSupport;

    /*
     * Storage settings for Dev Box created in this pool
     */
    @Generated
    @JsonProperty(value = "storageProfile")
    private DevBoxStorageProfile storageProfile;

    /*
     * Image settings for Dev Boxes create in this pool
     */
    @Generated
    @JsonProperty(value = "imageReference")
    private DevBoxImageReference imageReference;

    /*
     * Indicates whether owners of Dev Boxes in this pool are local administrators on
     * the Dev Boxes.
     */
    @Generated
    @JsonProperty(value = "localAdministrator")
    private LocalAdministratorStatus localAdministratorStatus;

    /*
     * Stop on disconnect configuration settings for Dev Boxes created in this pool.
     */
    @Generated
    @JsonProperty(value = "stopOnDisconnect")
    private StopOnDisconnectConfiguration stopOnDisconnect;

    /*
     * Overall health status of the Pool. Indicates whether or not the Pool is
     * available to create Dev Boxes.
     */
    @Generated
    @JsonProperty(value = "healthStatus")
    private PoolHealthStatus healthStatus;

    /**
     * Creates an instance of DevBoxPool class.
     *
     * @param location the location value to set.
     * @param healthStatus the healthStatus value to set.
     */
    @Generated
    @JsonCreator
    private DevBoxPool(@JsonProperty(value = "location") String location,
        @JsonProperty(value = "healthStatus") PoolHealthStatus healthStatus) {
        this.location = location;
        this.healthStatus = healthStatus;
    }

    /**
     * Get the name property: Pool name.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the location property: Azure region where Dev Boxes in the pool are located.
     *
     * @return the location value.
     */
    @Generated
    public String getLocation() {
        return this.location;
    }

    /**
     * Get the osType property: The operating system type of Dev Boxes in this pool.
     *
     * @return the osType value.
     */
    @Generated
    public DevBoxOsType getOsType() {
        return this.osType;
    }

    /**
     * Get the hardwareProfile property: Hardware settings for the Dev Boxes created in this pool.
     *
     * @return the hardwareProfile value.
     */
    @Generated
    public DevBoxHardwareProfile getHardwareProfile() {
        return this.hardwareProfile;
    }

    /**
     * Get the hibernateSupport property: Indicates whether hibernate is enabled/disabled or unknown.
     *
     * @return the hibernateSupport value.
     */
    @Generated
    public HibernateSupport getHibernateSupport() {
        return this.hibernateSupport;
    }

    /**
     * Get the storageProfile property: Storage settings for Dev Box created in this pool.
     *
     * @return the storageProfile value.
     */
    @Generated
    public DevBoxStorageProfile getStorageProfile() {
        return this.storageProfile;
    }

    /**
     * Get the imageReference property: Image settings for Dev Boxes create in this pool.
     *
     * @return the imageReference value.
     */
    @Generated
    public DevBoxImageReference getImageReference() {
        return this.imageReference;
    }

    /**
     * Get the localAdministratorStatus property: Indicates whether owners of Dev Boxes in this pool are local
     * administrators on
     * the Dev Boxes.
     *
     * @return the localAdministratorStatus value.
     */
    @Generated
    public LocalAdministratorStatus getLocalAdministratorStatus() {
        return this.localAdministratorStatus;
    }

    /**
     * Get the stopOnDisconnect property: Stop on disconnect configuration settings for Dev Boxes created in this pool.
     *
     * @return the stopOnDisconnect value.
     */
    @Generated
    public StopOnDisconnectConfiguration getStopOnDisconnect() {
        return this.stopOnDisconnect;
    }

    /**
     * Get the healthStatus property: Overall health status of the Pool. Indicates whether or not the Pool is
     * available to create Dev Boxes.
     *
     * @return the healthStatus value.
     */
    @Generated
    public PoolHealthStatus getHealthStatus() {
        return this.healthStatus;
    }
}
