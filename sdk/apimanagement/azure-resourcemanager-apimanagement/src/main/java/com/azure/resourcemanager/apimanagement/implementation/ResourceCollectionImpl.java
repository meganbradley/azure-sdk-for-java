// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.resourcemanager.apimanagement.fluent.models.ResourceCollectionInner;
import com.azure.resourcemanager.apimanagement.models.ResourceCollection;
import com.azure.resourcemanager.apimanagement.models.ResourceCollectionValueItem;
import java.util.Collections;
import java.util.List;

public final class ResourceCollectionImpl implements ResourceCollection {
    private ResourceCollectionInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    ResourceCollectionImpl(
        ResourceCollectionInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ResourceCollectionValueItem> value() {
        List<ResourceCollectionValueItem> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Long count() {
        return this.innerModel().count();
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public ResourceCollectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
