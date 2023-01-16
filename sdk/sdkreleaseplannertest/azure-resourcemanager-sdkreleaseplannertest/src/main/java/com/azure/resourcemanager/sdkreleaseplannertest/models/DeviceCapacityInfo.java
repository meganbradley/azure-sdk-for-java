// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.DeviceCapacityInfoInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of DeviceCapacityInfo. */
public interface DeviceCapacityInfo {
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
     * Gets the systemData property: Metadata pertaining to device capacity info.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the timestamp property: Timestamp of request in UTC.
     *
     * @return the timestamp value.
     */
    OffsetDateTime timestamp();

    /**
     * Gets the clusterStorageCapacityInfo property: Cluster capacity data for storage resources (CSV).
     *
     * @return the clusterStorageCapacityInfo value.
     */
    ClusterStorageViewData clusterStorageCapacityInfo();

    /**
     * Gets the clusterComputeCapacityInfo property: Cluster capacity data for compute resources (Memory and GPU).
     *
     * @return the clusterComputeCapacityInfo value.
     */
    ClusterCapacityViewData clusterComputeCapacityInfo();

    /**
     * Gets the nodeCapacityInfos property: The dictionary of individual node names and node capacities in the cluster.
     *
     * @return the nodeCapacityInfos value.
     */
    Map<String, HostCapacity> nodeCapacityInfos();

    /**
     * Gets the inner com.azure.resourcemanager.sdkreleaseplannertest.fluent.models.DeviceCapacityInfoInner object.
     *
     * @return the inner object.
     */
    DeviceCapacityInfoInner innerModel();
}
