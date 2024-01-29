// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.QuotaUsagesClient;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.QuotaUsageInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.QuotaUsage;
import com.azure.resourcemanager.postgresqlflexibleserver.models.QuotaUsages;

public final class QuotaUsagesImpl implements QuotaUsages {
    private static final ClientLogger LOGGER = new ClientLogger(QuotaUsagesImpl.class);

    private final QuotaUsagesClient innerClient;

    private final com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager;

    public QuotaUsagesImpl(QuotaUsagesClient innerClient,
        com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<QuotaUsage> list(String locationName) {
        PagedIterable<QuotaUsageInner> inner = this.serviceClient().list(locationName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new QuotaUsageImpl(inner1, this.manager()));
    }

    public PagedIterable<QuotaUsage> list(String locationName, Context context) {
        PagedIterable<QuotaUsageInner> inner = this.serviceClient().list(locationName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new QuotaUsageImpl(inner1, this.manager()));
    }

    private QuotaUsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager() {
        return this.serviceManager;
    }
}
