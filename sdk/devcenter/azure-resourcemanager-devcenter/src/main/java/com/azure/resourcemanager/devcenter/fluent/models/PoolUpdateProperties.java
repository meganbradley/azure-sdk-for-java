// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.devcenter.models.LicenseType;
import com.azure.resourcemanager.devcenter.models.LocalAdminStatus;
import com.azure.resourcemanager.devcenter.models.SingleSignOnStatus;
import com.azure.resourcemanager.devcenter.models.StopOnDisconnectConfiguration;
import com.azure.resourcemanager.devcenter.models.VirtualNetworkType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of a Pool. These properties can be updated after the resource has been created.
 */
@Fluent
public class PoolUpdateProperties {
    /*
     * Name of a Dev Box definition in parent Project of this Pool
     */
    @JsonProperty(value = "devBoxDefinitionName")
    private String devBoxDefinitionName;

    /*
     * Name of a Network Connection in parent Project of this Pool
     */
    @JsonProperty(value = "networkConnectionName")
    private String networkConnectionName;

    /*
     * Specifies the license type indicating the caller has already acquired licenses for the Dev Boxes that will be created.
     */
    @JsonProperty(value = "licenseType")
    private LicenseType licenseType;

    /*
     * Indicates whether owners of Dev Boxes in this pool are added as local administrators on the Dev Box.
     */
    @JsonProperty(value = "localAdministrator")
    private LocalAdminStatus localAdministrator;

    /*
     * Stop on disconnect configuration settings for Dev Boxes created in this pool.
     */
    @JsonProperty(value = "stopOnDisconnect")
    private StopOnDisconnectConfiguration stopOnDisconnect;

    /*
     * Indicates whether Dev Boxes in this pool are created with single sign on enabled. The also requires that single sign on be enabled on the tenant.
     */
    @JsonProperty(value = "singleSignOnStatus")
    private SingleSignOnStatus singleSignOnStatus;

    /*
     * The display name of the pool.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Indicates whether the pool uses a Virtual Network managed by Microsoft or a customer provided network.
     */
    @JsonProperty(value = "virtualNetworkType")
    private VirtualNetworkType virtualNetworkType;

    /*
     * The regions of the managed virtual network (required when managedNetworkType is Managed).
     */
    @JsonProperty(value = "managedVirtualNetworkRegions")
    private List<String> managedVirtualNetworkRegions;

    /**
     * Creates an instance of PoolUpdateProperties class.
     */
    public PoolUpdateProperties() {
    }

    /**
     * Get the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
     * 
     * @return the devBoxDefinitionName value.
     */
    public String devBoxDefinitionName() {
        return this.devBoxDefinitionName;
    }

    /**
     * Set the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
     * 
     * @param devBoxDefinitionName the devBoxDefinitionName value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withDevBoxDefinitionName(String devBoxDefinitionName) {
        this.devBoxDefinitionName = devBoxDefinitionName;
        return this;
    }

    /**
     * Get the networkConnectionName property: Name of a Network Connection in parent Project of this Pool.
     * 
     * @return the networkConnectionName value.
     */
    public String networkConnectionName() {
        return this.networkConnectionName;
    }

    /**
     * Set the networkConnectionName property: Name of a Network Connection in parent Project of this Pool.
     * 
     * @param networkConnectionName the networkConnectionName value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withNetworkConnectionName(String networkConnectionName) {
        this.networkConnectionName = networkConnectionName;
        return this;
    }

    /**
     * Get the licenseType property: Specifies the license type indicating the caller has already acquired licenses for
     * the Dev Boxes that will be created.
     * 
     * @return the licenseType value.
     */
    public LicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: Specifies the license type indicating the caller has already acquired licenses for
     * the Dev Boxes that will be created.
     * 
     * @param licenseType the licenseType value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added as local
     * administrators on the Dev Box.
     * 
     * @return the localAdministrator value.
     */
    public LocalAdminStatus localAdministrator() {
        return this.localAdministrator;
    }

    /**
     * Set the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added as local
     * administrators on the Dev Box.
     * 
     * @param localAdministrator the localAdministrator value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withLocalAdministrator(LocalAdminStatus localAdministrator) {
        this.localAdministrator = localAdministrator;
        return this;
    }

    /**
     * Get the stopOnDisconnect property: Stop on disconnect configuration settings for Dev Boxes created in this pool.
     * 
     * @return the stopOnDisconnect value.
     */
    public StopOnDisconnectConfiguration stopOnDisconnect() {
        return this.stopOnDisconnect;
    }

    /**
     * Set the stopOnDisconnect property: Stop on disconnect configuration settings for Dev Boxes created in this pool.
     * 
     * @param stopOnDisconnect the stopOnDisconnect value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withStopOnDisconnect(StopOnDisconnectConfiguration stopOnDisconnect) {
        this.stopOnDisconnect = stopOnDisconnect;
        return this;
    }

    /**
     * Get the singleSignOnStatus property: Indicates whether Dev Boxes in this pool are created with single sign on
     * enabled. The also requires that single sign on be enabled on the tenant.
     * 
     * @return the singleSignOnStatus value.
     */
    public SingleSignOnStatus singleSignOnStatus() {
        return this.singleSignOnStatus;
    }

    /**
     * Set the singleSignOnStatus property: Indicates whether Dev Boxes in this pool are created with single sign on
     * enabled. The also requires that single sign on be enabled on the tenant.
     * 
     * @param singleSignOnStatus the singleSignOnStatus value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withSingleSignOnStatus(SingleSignOnStatus singleSignOnStatus) {
        this.singleSignOnStatus = singleSignOnStatus;
        return this;
    }

    /**
     * Get the displayName property: The display name of the pool.
     * 
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the pool.
     * 
     * @param displayName the displayName value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the virtualNetworkType property: Indicates whether the pool uses a Virtual Network managed by Microsoft or a
     * customer provided network.
     * 
     * @return the virtualNetworkType value.
     */
    public VirtualNetworkType virtualNetworkType() {
        return this.virtualNetworkType;
    }

    /**
     * Set the virtualNetworkType property: Indicates whether the pool uses a Virtual Network managed by Microsoft or a
     * customer provided network.
     * 
     * @param virtualNetworkType the virtualNetworkType value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withVirtualNetworkType(VirtualNetworkType virtualNetworkType) {
        this.virtualNetworkType = virtualNetworkType;
        return this;
    }

    /**
     * Get the managedVirtualNetworkRegions property: The regions of the managed virtual network (required when
     * managedNetworkType is Managed).
     * 
     * @return the managedVirtualNetworkRegions value.
     */
    public List<String> managedVirtualNetworkRegions() {
        return this.managedVirtualNetworkRegions;
    }

    /**
     * Set the managedVirtualNetworkRegions property: The regions of the managed virtual network (required when
     * managedNetworkType is Managed).
     * 
     * @param managedVirtualNetworkRegions the managedVirtualNetworkRegions value to set.
     * @return the PoolUpdateProperties object itself.
     */
    public PoolUpdateProperties withManagedVirtualNetworkRegions(List<String> managedVirtualNetworkRegions) {
        this.managedVirtualNetworkRegions = managedVirtualNetworkRegions;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stopOnDisconnect() != null) {
            stopOnDisconnect().validate();
        }
    }
}
