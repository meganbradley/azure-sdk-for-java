// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.implementation;

import com.azure.resourcemanager.confluent.fluent.models.AccessRoleBindingNameListSuccessResponseInner;
import com.azure.resourcemanager.confluent.models.AccessRoleBindingNameListSuccessResponse;
import com.azure.resourcemanager.confluent.models.ConfluentListMetadata;
import java.util.Collections;
import java.util.List;

public final class AccessRoleBindingNameListSuccessResponseImpl implements AccessRoleBindingNameListSuccessResponse {
    private AccessRoleBindingNameListSuccessResponseInner innerObject;

    private final com.azure.resourcemanager.confluent.ConfluentManager serviceManager;

    AccessRoleBindingNameListSuccessResponseImpl(AccessRoleBindingNameListSuccessResponseInner innerObject,
        com.azure.resourcemanager.confluent.ConfluentManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public ConfluentListMetadata metadata() {
        return this.innerModel().metadata();
    }

    public List<String> data() {
        List<String> inner = this.innerModel().data();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AccessRoleBindingNameListSuccessResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.confluent.ConfluentManager manager() {
        return this.serviceManager;
    }
}
