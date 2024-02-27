// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadssapvirtualinstance.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.workloadssapvirtualinstance.fluent.models.OperationStatusResultInner;
import com.azure.resourcemanager.workloadssapvirtualinstance.models.OperationStatusResult;
import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class OperationStatusResultImpl implements OperationStatusResult {
    private OperationStatusResultInner innerObject;

    private final com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager serviceManager;

    OperationStatusResultImpl(OperationStatusResultInner innerObject,
        com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String status() {
        return this.innerModel().status();
    }

    public Float percentComplete() {
        return this.innerModel().percentComplete();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public List<OperationStatusResult> operations() {
        List<OperationStatusResultInner> inner = this.innerModel().operations();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new OperationStatusResultImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public OperationStatusResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.workloadssapvirtualinstance.WorkloadsSapVirtualInstanceManager manager() {
        return this.serviceManager;
    }
}
