// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.PoolInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Pool. */
public interface Pool {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the healthStatus property: Overall health status of the Pool. Indicates whether or not the Pool is available
     * to create Dev Boxes.
     *
     * @return the healthStatus value.
     */
    HealthStatus healthStatus();

    /**
     * Gets the healthStatusDetails property: Details on the Pool health status to help diagnose issues. This is only
     * populated when the pool status indicates the pool is in a non-healthy state.
     *
     * @return the healthStatusDetails value.
     */
    List<HealthStatusDetail> healthStatusDetails();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
     *
     * @return the devBoxDefinitionName value.
     */
    String devBoxDefinitionName();

    /**
     * Gets the networkConnectionName property: Name of a Network Connection in parent Project of this Pool.
     *
     * @return the networkConnectionName value.
     */
    String networkConnectionName();

    /**
     * Gets the licenseType property: Specifies the license type indicating the caller has already acquired licenses for
     * the Dev Boxes that will be created.
     *
     * @return the licenseType value.
     */
    LicenseType licenseType();

    /**
     * Gets the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added as local
     * administrators on the Dev Box.
     *
     * @return the localAdministrator value.
     */
    LocalAdminStatus localAdministrator();

    /**
     * Gets the stopOnDisconnect property: Stop on disconnect configuration settings for Dev Boxes created in this pool.
     *
     * @return the stopOnDisconnect value.
     */
    StopOnDisconnectConfiguration stopOnDisconnect();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.PoolInner object.
     *
     * @return the inner object.
     */
    PoolInner innerModel();

    /** The entirety of the Pool definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The Pool definition stages. */
    interface DefinitionStages {
        /** The first stage of the Pool definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Pool definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the Pool definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, projectName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param projectName The name of the project.
             * @return the next definition stage.
             */
            WithCreate withExistingProject(String resourceGroupName, String projectName);
        }
        /**
         * The stage of the Pool definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDevBoxDefinitionName,
                DefinitionStages.WithNetworkConnectionName,
                DefinitionStages.WithLicenseType,
                DefinitionStages.WithLocalAdministrator,
                DefinitionStages.WithStopOnDisconnect {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Pool create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Pool create(Context context);
        }
        /** The stage of the Pool definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Pool definition allowing to specify devBoxDefinitionName. */
        interface WithDevBoxDefinitionName {
            /**
             * Specifies the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
             *
             * @param devBoxDefinitionName Name of a Dev Box definition in parent Project of this Pool.
             * @return the next definition stage.
             */
            WithCreate withDevBoxDefinitionName(String devBoxDefinitionName);
        }
        /** The stage of the Pool definition allowing to specify networkConnectionName. */
        interface WithNetworkConnectionName {
            /**
             * Specifies the networkConnectionName property: Name of a Network Connection in parent Project of this
             * Pool.
             *
             * @param networkConnectionName Name of a Network Connection in parent Project of this Pool.
             * @return the next definition stage.
             */
            WithCreate withNetworkConnectionName(String networkConnectionName);
        }
        /** The stage of the Pool definition allowing to specify licenseType. */
        interface WithLicenseType {
            /**
             * Specifies the licenseType property: Specifies the license type indicating the caller has already acquired
             * licenses for the Dev Boxes that will be created..
             *
             * @param licenseType Specifies the license type indicating the caller has already acquired licenses for the
             *     Dev Boxes that will be created.
             * @return the next definition stage.
             */
            WithCreate withLicenseType(LicenseType licenseType);
        }
        /** The stage of the Pool definition allowing to specify localAdministrator. */
        interface WithLocalAdministrator {
            /**
             * Specifies the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added
             * as local administrators on the Dev Box..
             *
             * @param localAdministrator Indicates whether owners of Dev Boxes in this pool are added as local
             *     administrators on the Dev Box.
             * @return the next definition stage.
             */
            WithCreate withLocalAdministrator(LocalAdminStatus localAdministrator);
        }
        /** The stage of the Pool definition allowing to specify stopOnDisconnect. */
        interface WithStopOnDisconnect {
            /**
             * Specifies the stopOnDisconnect property: Stop on disconnect configuration settings for Dev Boxes created
             * in this pool..
             *
             * @param stopOnDisconnect Stop on disconnect configuration settings for Dev Boxes created in this pool.
             * @return the next definition stage.
             */
            WithCreate withStopOnDisconnect(StopOnDisconnectConfiguration stopOnDisconnect);
        }
    }
    /**
     * Begins update for the Pool resource.
     *
     * @return the stage of resource update.
     */
    Pool.Update update();

    /** The template for Pool update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithDevBoxDefinitionName,
            UpdateStages.WithNetworkConnectionName,
            UpdateStages.WithLicenseType,
            UpdateStages.WithLocalAdministrator,
            UpdateStages.WithStopOnDisconnect {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Pool apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Pool apply(Context context);
    }
    /** The Pool update stages. */
    interface UpdateStages {
        /** The stage of the Pool update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Pool update allowing to specify devBoxDefinitionName. */
        interface WithDevBoxDefinitionName {
            /**
             * Specifies the devBoxDefinitionName property: Name of a Dev Box definition in parent Project of this Pool.
             *
             * @param devBoxDefinitionName Name of a Dev Box definition in parent Project of this Pool.
             * @return the next definition stage.
             */
            Update withDevBoxDefinitionName(String devBoxDefinitionName);
        }
        /** The stage of the Pool update allowing to specify networkConnectionName. */
        interface WithNetworkConnectionName {
            /**
             * Specifies the networkConnectionName property: Name of a Network Connection in parent Project of this
             * Pool.
             *
             * @param networkConnectionName Name of a Network Connection in parent Project of this Pool.
             * @return the next definition stage.
             */
            Update withNetworkConnectionName(String networkConnectionName);
        }
        /** The stage of the Pool update allowing to specify licenseType. */
        interface WithLicenseType {
            /**
             * Specifies the licenseType property: Specifies the license type indicating the caller has already acquired
             * licenses for the Dev Boxes that will be created..
             *
             * @param licenseType Specifies the license type indicating the caller has already acquired licenses for the
             *     Dev Boxes that will be created.
             * @return the next definition stage.
             */
            Update withLicenseType(LicenseType licenseType);
        }
        /** The stage of the Pool update allowing to specify localAdministrator. */
        interface WithLocalAdministrator {
            /**
             * Specifies the localAdministrator property: Indicates whether owners of Dev Boxes in this pool are added
             * as local administrators on the Dev Box..
             *
             * @param localAdministrator Indicates whether owners of Dev Boxes in this pool are added as local
             *     administrators on the Dev Box.
             * @return the next definition stage.
             */
            Update withLocalAdministrator(LocalAdminStatus localAdministrator);
        }
        /** The stage of the Pool update allowing to specify stopOnDisconnect. */
        interface WithStopOnDisconnect {
            /**
             * Specifies the stopOnDisconnect property: Stop on disconnect configuration settings for Dev Boxes created
             * in this pool..
             *
             * @param stopOnDisconnect Stop on disconnect configuration settings for Dev Boxes created in this pool.
             * @return the next definition stage.
             */
            Update withStopOnDisconnect(StopOnDisconnectConfiguration stopOnDisconnect);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Pool refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Pool refresh(Context context);

    /**
     * Triggers a refresh of the pool status.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void runHealthChecks();

    /**
     * Triggers a refresh of the pool status.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void runHealthChecks(Context context);
}
