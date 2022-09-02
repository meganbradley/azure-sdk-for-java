// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.alertsmanagement.implementation;

import com.azure.resourcemanager.alertsmanagement.fluent.models.AlertInner;
import com.azure.resourcemanager.alertsmanagement.models.Alert;
import com.azure.resourcemanager.alertsmanagement.models.AlertProperties;

public final class AlertImpl implements Alert {
    private AlertInner innerObject;

    private final com.azure.resourcemanager.alertsmanagement.AlertsManagementManager serviceManager;

    AlertImpl(
        AlertInner innerObject, com.azure.resourcemanager.alertsmanagement.AlertsManagementManager serviceManager) {
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

    public AlertProperties properties() {
        return this.innerModel().properties();
    }

    public AlertInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.alertsmanagement.AlertsManagementManager manager() {
        return this.serviceManager;
    }
}
