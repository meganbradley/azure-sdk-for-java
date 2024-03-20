// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.resourcemanager.security.fluent.models.ScanResultInner;
import com.azure.resourcemanager.security.fluent.models.ScanResultsInner;
import com.azure.resourcemanager.security.models.ScanResult;
import com.azure.resourcemanager.security.models.ScanResults;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ScanResultsImpl implements ScanResults {
    private ScanResultsInner innerObject;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    ScanResultsImpl(ScanResultsInner innerObject, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ScanResult> value() {
        List<ScanResultInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new ScanResultImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ScanResultsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
