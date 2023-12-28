// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.HybridIdentityMetadataInner;
import com.azure.resourcemanager.hybridcontainerservice.models.HybridIdentityMetadata;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceProvisioningState;

public final class HybridIdentityMetadataImpl implements HybridIdentityMetadata {
    private HybridIdentityMetadataInner innerObject;

    private final com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager;

    HybridIdentityMetadataImpl(HybridIdentityMetadataInner innerObject,
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

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

    public String resourceUid() {
        return this.innerModel().resourceUid();
    }

    public String publicKey() {
        return this.innerModel().publicKey();
    }

    public ResourceProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public HybridIdentityMetadataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager() {
        return this.serviceManager;
    }
}
