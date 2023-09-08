// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeGroupInner;
import com.azure.resourcemanager.elasticsan.models.EncryptionType;
import com.azure.resourcemanager.elasticsan.models.NetworkRuleSet;
import com.azure.resourcemanager.elasticsan.models.PrivateEndpointConnection;
import com.azure.resourcemanager.elasticsan.models.ProvisioningStates;
import com.azure.resourcemanager.elasticsan.models.StorageTargetType;
import com.azure.resourcemanager.elasticsan.models.VolumeGroup;
import com.azure.resourcemanager.elasticsan.models.VolumeGroupUpdate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VolumeGroupImpl implements VolumeGroup, VolumeGroup.Definition, VolumeGroup.Update {
    private VolumeGroupInner innerObject;

    private final com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public ProvisioningStates provisioningState() {
        return this.innerModel().provisioningState();
    }

    public StorageTargetType protocolType() {
        return this.innerModel().protocolType();
    }

    public EncryptionType encryption() {
        return this.innerModel().encryption();
    }

    public NetworkRuleSet networkAcls() {
        return this.innerModel().networkAcls();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VolumeGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.elasticsan.ElasticSanManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String elasticSanName;

    private String volumeGroupName;

    private VolumeGroupUpdate updateParameters;

    public VolumeGroupImpl withExistingElasticSan(String resourceGroupName, String elasticSanName) {
        this.resourceGroupName = resourceGroupName;
        this.elasticSanName = elasticSanName;
        return this;
    }

    public VolumeGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumeGroups()
                .create(resourceGroupName, elasticSanName, volumeGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public VolumeGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumeGroups()
                .create(resourceGroupName, elasticSanName, volumeGroupName, this.innerModel(), context);
        return this;
    }

    VolumeGroupImpl(String name, com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager) {
        this.innerObject = new VolumeGroupInner();
        this.serviceManager = serviceManager;
        this.volumeGroupName = name;
    }

    public VolumeGroupImpl update() {
        this.updateParameters = new VolumeGroupUpdate();
        return this;
    }

    public VolumeGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumeGroups()
                .update(resourceGroupName, elasticSanName, volumeGroupName, updateParameters, Context.NONE);
        return this;
    }

    public VolumeGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumeGroups()
                .update(resourceGroupName, elasticSanName, volumeGroupName, updateParameters, context);
        return this;
    }

    VolumeGroupImpl(
        VolumeGroupInner innerObject, com.azure.resourcemanager.elasticsan.ElasticSanManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.elasticSanName = Utils.getValueFromIdByName(innerObject.id(), "elasticSans");
        this.volumeGroupName = Utils.getValueFromIdByName(innerObject.id(), "volumegroups");
    }

    public VolumeGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumeGroups()
                .getWithResponse(resourceGroupName, elasticSanName, volumeGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public VolumeGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVolumeGroups()
                .getWithResponse(resourceGroupName, elasticSanName, volumeGroupName, context)
                .getValue();
        return this;
    }

    public VolumeGroupImpl withProtocolType(StorageTargetType protocolType) {
        if (isInCreateMode()) {
            this.innerModel().withProtocolType(protocolType);
            return this;
        } else {
            this.updateParameters.withProtocolType(protocolType);
            return this;
        }
    }

    public VolumeGroupImpl withEncryption(EncryptionType encryption) {
        if (isInCreateMode()) {
            this.innerModel().withEncryption(encryption);
            return this;
        } else {
            this.updateParameters.withEncryption(encryption);
            return this;
        }
    }

    public VolumeGroupImpl withNetworkAcls(NetworkRuleSet networkAcls) {
        this.innerModel().withNetworkAcls(networkAcls);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
