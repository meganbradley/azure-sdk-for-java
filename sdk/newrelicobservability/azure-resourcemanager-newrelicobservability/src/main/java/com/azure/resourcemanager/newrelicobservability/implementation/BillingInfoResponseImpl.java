// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.implementation;

import com.azure.resourcemanager.newrelicobservability.fluent.models.BillingInfoResponseInner;
import com.azure.resourcemanager.newrelicobservability.models.BillingInfoResponse;
import com.azure.resourcemanager.newrelicobservability.models.MarketplaceSaaSInfo;
import com.azure.resourcemanager.newrelicobservability.models.PartnerBillingEntity;

public final class BillingInfoResponseImpl implements BillingInfoResponse {
    private BillingInfoResponseInner innerObject;

    private final com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager;

    BillingInfoResponseImpl(BillingInfoResponseInner innerObject,
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public MarketplaceSaaSInfo marketplaceSaasInfo() {
        return this.innerModel().marketplaceSaasInfo();
    }

    public PartnerBillingEntity partnerBillingEntity() {
        return this.innerModel().partnerBillingEntity();
    }

    public BillingInfoResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager() {
        return this.serviceManager;
    }
}
