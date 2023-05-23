// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkcloud.fluent.models.ClusterInner;
import com.azure.resourcemanager.networkcloud.models.Cluster;
import com.azure.resourcemanager.networkcloud.models.ClusterAvailableUpgradeVersion;
import com.azure.resourcemanager.networkcloud.models.ClusterCapacity;
import com.azure.resourcemanager.networkcloud.models.ClusterConnectionStatus;
import com.azure.resourcemanager.networkcloud.models.ClusterDeployParameters;
import com.azure.resourcemanager.networkcloud.models.ClusterDetailedStatus;
import com.azure.resourcemanager.networkcloud.models.ClusterManagerConnectionStatus;
import com.azure.resourcemanager.networkcloud.models.ClusterPatchParameters;
import com.azure.resourcemanager.networkcloud.models.ClusterProvisioningState;
import com.azure.resourcemanager.networkcloud.models.ClusterType;
import com.azure.resourcemanager.networkcloud.models.ClusterUpdateVersionParameters;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.ManagedResourceGroupConfiguration;
import com.azure.resourcemanager.networkcloud.models.RackDefinition;
import com.azure.resourcemanager.networkcloud.models.ServicePrincipalInformation;
import com.azure.resourcemanager.networkcloud.models.ValidationThreshold;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ClusterImpl implements Cluster, Cluster.Definition, Cluster.Update {
    private ClusterInner innerObject;

    private final com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public RackDefinition aggregatorOrSingleRackDefinition() {
        return this.innerModel().aggregatorOrSingleRackDefinition();
    }

    public String analyticsWorkspaceId() {
        return this.innerModel().analyticsWorkspaceId();
    }

    public List<ClusterAvailableUpgradeVersion> availableUpgradeVersions() {
        List<ClusterAvailableUpgradeVersion> inner = this.innerModel().availableUpgradeVersions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ClusterCapacity clusterCapacity() {
        return this.innerModel().clusterCapacity();
    }

    public ClusterConnectionStatus clusterConnectionStatus() {
        return this.innerModel().clusterConnectionStatus();
    }

    public ExtendedLocation clusterExtendedLocation() {
        return this.innerModel().clusterExtendedLocation();
    }

    public String clusterLocation() {
        return this.innerModel().clusterLocation();
    }

    public ClusterManagerConnectionStatus clusterManagerConnectionStatus() {
        return this.innerModel().clusterManagerConnectionStatus();
    }

    public String clusterManagerId() {
        return this.innerModel().clusterManagerId();
    }

    public ServicePrincipalInformation clusterServicePrincipal() {
        return this.innerModel().clusterServicePrincipal();
    }

    public ClusterType clusterType() {
        return this.innerModel().clusterType();
    }

    public String clusterVersion() {
        return this.innerModel().clusterVersion();
    }

    public ValidationThreshold computeDeploymentThreshold() {
        return this.innerModel().computeDeploymentThreshold();
    }

    public List<RackDefinition> computeRackDefinitions() {
        List<RackDefinition> inner = this.innerModel().computeRackDefinitions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ClusterDetailedStatus detailedStatus() {
        return this.innerModel().detailedStatus();
    }

    public String detailedStatusMessage() {
        return this.innerModel().detailedStatusMessage();
    }

    public ExtendedLocation hybridAksExtendedLocation() {
        return this.innerModel().hybridAksExtendedLocation();
    }

    public ManagedResourceGroupConfiguration managedResourceGroupConfiguration() {
        return this.innerModel().managedResourceGroupConfiguration();
    }

    public Long manualActionCount() {
        return this.innerModel().manualActionCount();
    }

    public String networkFabricId() {
        return this.innerModel().networkFabricId();
    }

    public ClusterProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String supportExpiryDate() {
        return this.innerModel().supportExpiryDate();
    }

    public List<String> workloadResourceIds() {
        List<String> inner = this.innerModel().workloadResourceIds();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ClusterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.networkcloud.NetworkCloudManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private ClusterPatchParameters updateClusterUpdateParameters;

    public ClusterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Cluster create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .createOrUpdate(resourceGroupName, clusterName, this.innerModel(), Context.NONE);
        return this;
    }

    public Cluster create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .createOrUpdate(resourceGroupName, clusterName, this.innerModel(), context);
        return this;
    }

    ClusterImpl(String name, com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerObject = new ClusterInner();
        this.serviceManager = serviceManager;
        this.clusterName = name;
    }

    public ClusterImpl update() {
        this.updateClusterUpdateParameters = new ClusterPatchParameters();
        return this;
    }

    public Cluster apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .update(resourceGroupName, clusterName, updateClusterUpdateParameters, Context.NONE);
        return this;
    }

    public Cluster apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .update(resourceGroupName, clusterName, updateClusterUpdateParameters, context);
        return this;
    }

    ClusterImpl(ClusterInner innerObject, com.azure.resourcemanager.networkcloud.NetworkCloudManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
    }

    public Cluster refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, Context.NONE)
                .getValue();
        return this;
    }

    public Cluster refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getClusters()
                .getByResourceGroupWithResponse(resourceGroupName, clusterName, context)
                .getValue();
        return this;
    }

    public void deploy() {
        serviceManager.clusters().deploy(resourceGroupName, clusterName);
    }

    public void deploy(ClusterDeployParameters clusterDeployParameters, Context context) {
        serviceManager.clusters().deploy(resourceGroupName, clusterName, clusterDeployParameters, context);
    }

    public void updateVersion(ClusterUpdateVersionParameters clusterUpdateVersionParameters) {
        serviceManager.clusters().updateVersion(resourceGroupName, clusterName, clusterUpdateVersionParameters);
    }

    public void updateVersion(ClusterUpdateVersionParameters clusterUpdateVersionParameters, Context context) {
        serviceManager
            .clusters()
            .updateVersion(resourceGroupName, clusterName, clusterUpdateVersionParameters, context);
    }

    public ClusterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ClusterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ClusterImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public ClusterImpl withAggregatorOrSingleRackDefinition(RackDefinition aggregatorOrSingleRackDefinition) {
        if (isInCreateMode()) {
            this.innerModel().withAggregatorOrSingleRackDefinition(aggregatorOrSingleRackDefinition);
            return this;
        } else {
            this.updateClusterUpdateParameters.withAggregatorOrSingleRackDefinition(aggregatorOrSingleRackDefinition);
            return this;
        }
    }

    public ClusterImpl withAnalyticsWorkspaceId(String analyticsWorkspaceId) {
        this.innerModel().withAnalyticsWorkspaceId(analyticsWorkspaceId);
        return this;
    }

    public ClusterImpl withClusterType(ClusterType clusterType) {
        this.innerModel().withClusterType(clusterType);
        return this;
    }

    public ClusterImpl withClusterVersion(String clusterVersion) {
        this.innerModel().withClusterVersion(clusterVersion);
        return this;
    }

    public ClusterImpl withNetworkFabricId(String networkFabricId) {
        this.innerModel().withNetworkFabricId(networkFabricId);
        return this;
    }

    public ClusterImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateClusterUpdateParameters.withTags(tags);
            return this;
        }
    }

    public ClusterImpl withClusterLocation(String clusterLocation) {
        if (isInCreateMode()) {
            this.innerModel().withClusterLocation(clusterLocation);
            return this;
        } else {
            this.updateClusterUpdateParameters.withClusterLocation(clusterLocation);
            return this;
        }
    }

    public ClusterImpl withClusterServicePrincipal(ServicePrincipalInformation clusterServicePrincipal) {
        if (isInCreateMode()) {
            this.innerModel().withClusterServicePrincipal(clusterServicePrincipal);
            return this;
        } else {
            this.updateClusterUpdateParameters.withClusterServicePrincipal(clusterServicePrincipal);
            return this;
        }
    }

    public ClusterImpl withComputeDeploymentThreshold(ValidationThreshold computeDeploymentThreshold) {
        if (isInCreateMode()) {
            this.innerModel().withComputeDeploymentThreshold(computeDeploymentThreshold);
            return this;
        } else {
            this.updateClusterUpdateParameters.withComputeDeploymentThreshold(computeDeploymentThreshold);
            return this;
        }
    }

    public ClusterImpl withComputeRackDefinitions(List<RackDefinition> computeRackDefinitions) {
        if (isInCreateMode()) {
            this.innerModel().withComputeRackDefinitions(computeRackDefinitions);
            return this;
        } else {
            this.updateClusterUpdateParameters.withComputeRackDefinitions(computeRackDefinitions);
            return this;
        }
    }

    public ClusterImpl withManagedResourceGroupConfiguration(
        ManagedResourceGroupConfiguration managedResourceGroupConfiguration) {
        this.innerModel().withManagedResourceGroupConfiguration(managedResourceGroupConfiguration);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
