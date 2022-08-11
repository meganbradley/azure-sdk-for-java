// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.storagecache.fluent.models.StorageTargetInner;
import java.util.List;

/** An immutable client-side representation of StorageTarget. */
public interface StorageTarget {
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
     * Gets the location property: Region name string.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the junctions property: List of Cache namespace junctions to target for namespace associations.
     *
     * @return the junctions value.
     */
    List<NamespaceJunction> junctions();

    /**
     * Gets the targetType property: Type of the Storage Target.
     *
     * @return the targetType value.
     */
    StorageTargetType targetType();

    /**
     * Gets the provisioningState property: ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property.
     *
     * @return the provisioningState value.
     */
    ProvisioningStateType provisioningState();

    /**
     * Gets the state property: Storage target operational state.
     *
     * @return the state value.
     */
    OperationalStateType state();

    /**
     * Gets the nfs3 property: Properties when targetType is nfs3.
     *
     * @return the nfs3 value.
     */
    Nfs3Target nfs3();

    /**
     * Gets the clfs property: Properties when targetType is clfs.
     *
     * @return the clfs value.
     */
    ClfsTarget clfs();

    /**
     * Gets the unknown property: Properties when targetType is unknown.
     *
     * @return the unknown value.
     */
    UnknownTarget unknown();

    /**
     * Gets the blobNfs property: Properties when targetType is blobNfs.
     *
     * @return the blobNfs value.
     */
    BlobNfsTarget blobNfs();

    /**
     * Gets the allocationPercentage property: The percentage of cache space allocated for this storage target.
     *
     * @return the allocationPercentage value.
     */
    Integer allocationPercentage();

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
     * Gets the inner com.azure.resourcemanager.storagecache.fluent.models.StorageTargetInner object.
     *
     * @return the inner object.
     */
    StorageTargetInner innerModel();

    /** The entirety of the StorageTarget definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The StorageTarget definition stages. */
    interface DefinitionStages {
        /** The first stage of the StorageTarget definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the StorageTarget definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, cacheName.
             *
             * @param resourceGroupName Target resource group.
             * @param cacheName Name of Cache. Length of name must not be greater than 80 and chars must be from the
             *     [-0-9a-zA-Z_] char class.
             * @return the next definition stage.
             */
            WithCreate withExistingCache(String resourceGroupName, String cacheName);
        }
        /**
         * The stage of the StorageTarget definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithJunctions,
                DefinitionStages.WithTargetType,
                DefinitionStages.WithState,
                DefinitionStages.WithNfs3,
                DefinitionStages.WithClfs,
                DefinitionStages.WithUnknown,
                DefinitionStages.WithBlobNfs {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            StorageTarget create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            StorageTarget create(Context context);
        }
        /** The stage of the StorageTarget definition allowing to specify junctions. */
        interface WithJunctions {
            /**
             * Specifies the junctions property: List of Cache namespace junctions to target for namespace
             * associations..
             *
             * @param junctions List of Cache namespace junctions to target for namespace associations.
             * @return the next definition stage.
             */
            WithCreate withJunctions(List<NamespaceJunction> junctions);
        }
        /** The stage of the StorageTarget definition allowing to specify targetType. */
        interface WithTargetType {
            /**
             * Specifies the targetType property: Type of the Storage Target..
             *
             * @param targetType Type of the Storage Target.
             * @return the next definition stage.
             */
            WithCreate withTargetType(StorageTargetType targetType);
        }
        /** The stage of the StorageTarget definition allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Storage target operational state..
             *
             * @param state Storage target operational state.
             * @return the next definition stage.
             */
            WithCreate withState(OperationalStateType state);
        }
        /** The stage of the StorageTarget definition allowing to specify nfs3. */
        interface WithNfs3 {
            /**
             * Specifies the nfs3 property: Properties when targetType is nfs3..
             *
             * @param nfs3 Properties when targetType is nfs3.
             * @return the next definition stage.
             */
            WithCreate withNfs3(Nfs3Target nfs3);
        }
        /** The stage of the StorageTarget definition allowing to specify clfs. */
        interface WithClfs {
            /**
             * Specifies the clfs property: Properties when targetType is clfs..
             *
             * @param clfs Properties when targetType is clfs.
             * @return the next definition stage.
             */
            WithCreate withClfs(ClfsTarget clfs);
        }
        /** The stage of the StorageTarget definition allowing to specify unknown. */
        interface WithUnknown {
            /**
             * Specifies the unknown property: Properties when targetType is unknown..
             *
             * @param unknown Properties when targetType is unknown.
             * @return the next definition stage.
             */
            WithCreate withUnknown(UnknownTarget unknown);
        }
        /** The stage of the StorageTarget definition allowing to specify blobNfs. */
        interface WithBlobNfs {
            /**
             * Specifies the blobNfs property: Properties when targetType is blobNfs..
             *
             * @param blobNfs Properties when targetType is blobNfs.
             * @return the next definition stage.
             */
            WithCreate withBlobNfs(BlobNfsTarget blobNfs);
        }
    }
    /**
     * Begins update for the StorageTarget resource.
     *
     * @return the stage of resource update.
     */
    StorageTarget.Update update();

    /** The template for StorageTarget update. */
    interface Update
        extends UpdateStages.WithJunctions,
            UpdateStages.WithState,
            UpdateStages.WithNfs3,
            UpdateStages.WithClfs,
            UpdateStages.WithUnknown,
            UpdateStages.WithBlobNfs {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        StorageTarget apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        StorageTarget apply(Context context);
    }
    /** The StorageTarget update stages. */
    interface UpdateStages {
        /** The stage of the StorageTarget update allowing to specify junctions. */
        interface WithJunctions {
            /**
             * Specifies the junctions property: List of Cache namespace junctions to target for namespace
             * associations..
             *
             * @param junctions List of Cache namespace junctions to target for namespace associations.
             * @return the next definition stage.
             */
            Update withJunctions(List<NamespaceJunction> junctions);
        }
        /** The stage of the StorageTarget update allowing to specify state. */
        interface WithState {
            /**
             * Specifies the state property: Storage target operational state..
             *
             * @param state Storage target operational state.
             * @return the next definition stage.
             */
            Update withState(OperationalStateType state);
        }
        /** The stage of the StorageTarget update allowing to specify nfs3. */
        interface WithNfs3 {
            /**
             * Specifies the nfs3 property: Properties when targetType is nfs3..
             *
             * @param nfs3 Properties when targetType is nfs3.
             * @return the next definition stage.
             */
            Update withNfs3(Nfs3Target nfs3);
        }
        /** The stage of the StorageTarget update allowing to specify clfs. */
        interface WithClfs {
            /**
             * Specifies the clfs property: Properties when targetType is clfs..
             *
             * @param clfs Properties when targetType is clfs.
             * @return the next definition stage.
             */
            Update withClfs(ClfsTarget clfs);
        }
        /** The stage of the StorageTarget update allowing to specify unknown. */
        interface WithUnknown {
            /**
             * Specifies the unknown property: Properties when targetType is unknown..
             *
             * @param unknown Properties when targetType is unknown.
             * @return the next definition stage.
             */
            Update withUnknown(UnknownTarget unknown);
        }
        /** The stage of the StorageTarget update allowing to specify blobNfs. */
        interface WithBlobNfs {
            /**
             * Specifies the blobNfs property: Properties when targetType is blobNfs..
             *
             * @param blobNfs Properties when targetType is blobNfs.
             * @return the next definition stage.
             */
            Update withBlobNfs(BlobNfsTarget blobNfs);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    StorageTarget refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    StorageTarget refresh(Context context);

    /**
     * Tells a storage target to refresh its DNS information.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dnsRefresh();

    /**
     * Tells a storage target to refresh its DNS information.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void dnsRefresh(Context context);
}
