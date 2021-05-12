// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.resourcemanager.mysql.fluent.models.OperationListResultInner;
import com.azure.resourcemanager.mysql.models.Operation;
import com.azure.resourcemanager.mysql.models.OperationListResult;
import java.util.Collections;
import java.util.List;

public final class OperationListResultImpl implements OperationListResult {
    private OperationListResultInner innerObject;

    private final com.azure.resourcemanager.mysql.MySqlManager serviceManager;

    OperationListResultImpl(
        OperationListResultInner innerObject, com.azure.resourcemanager.mysql.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<Operation> value() {
        List<Operation> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public OperationListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.MySqlManager manager() {
        return this.serviceManager;
    }
}
