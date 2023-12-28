// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.confluent.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.confluent.fluent.models.ConfluentAgreementResourceInner;
import com.azure.resourcemanager.confluent.models.ConfluentAgreementResource;
import java.time.OffsetDateTime;

public final class ConfluentAgreementResourceImpl implements ConfluentAgreementResource {
    private ConfluentAgreementResourceInner innerObject;

    private final com.azure.resourcemanager.confluent.ConfluentManager serviceManager;

    ConfluentAgreementResourceImpl(ConfluentAgreementResourceInner innerObject,
        com.azure.resourcemanager.confluent.ConfluentManager serviceManager) {
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

    public String publisher() {
        return this.innerModel().publisher();
    }

    public String product() {
        return this.innerModel().product();
    }

    public String plan() {
        return this.innerModel().plan();
    }

    public String licenseTextLink() {
        return this.innerModel().licenseTextLink();
    }

    public String privacyPolicyLink() {
        return this.innerModel().privacyPolicyLink();
    }

    public OffsetDateTime retrieveDatetime() {
        return this.innerModel().retrieveDatetime();
    }

    public String signature() {
        return this.innerModel().signature();
    }

    public Boolean accepted() {
        return this.innerModel().accepted();
    }

    public ConfluentAgreementResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.confluent.ConfluentManager manager() {
        return this.serviceManager;
    }
}
