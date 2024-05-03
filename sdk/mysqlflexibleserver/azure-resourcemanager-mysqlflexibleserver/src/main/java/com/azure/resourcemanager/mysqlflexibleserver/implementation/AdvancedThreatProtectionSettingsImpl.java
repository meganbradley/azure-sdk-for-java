// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.AdvancedThreatProtectionSettingsClient;
import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.AdvancedThreatProtectionInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtection;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtectionForUpdate;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtectionName;
import com.azure.resourcemanager.mysqlflexibleserver.models.AdvancedThreatProtectionSettings;

public final class AdvancedThreatProtectionSettingsImpl implements AdvancedThreatProtectionSettings {
    private static final ClientLogger LOGGER = new ClientLogger(AdvancedThreatProtectionSettingsImpl.class);

    private final AdvancedThreatProtectionSettingsClient innerClient;

    private final com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager;

    public AdvancedThreatProtectionSettingsImpl(AdvancedThreatProtectionSettingsClient innerClient,
        com.azure.resourcemanager.mysqlflexibleserver.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<AdvancedThreatProtection> getWithResponse(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName, Context context) {
        Response<AdvancedThreatProtectionInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, serverName, advancedThreatProtectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new AdvancedThreatProtectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AdvancedThreatProtection get(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName) {
        AdvancedThreatProtectionInner inner
            = this.serviceClient().get(resourceGroupName, serverName, advancedThreatProtectionName);
        if (inner != null) {
            return new AdvancedThreatProtectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AdvancedThreatProtection update(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName, AdvancedThreatProtectionForUpdate parameters) {
        AdvancedThreatProtectionInner inner
            = this.serviceClient().update(resourceGroupName, serverName, advancedThreatProtectionName, parameters);
        if (inner != null) {
            return new AdvancedThreatProtectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AdvancedThreatProtection update(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName, AdvancedThreatProtectionForUpdate parameters,
        Context context) {
        AdvancedThreatProtectionInner inner = this.serviceClient()
            .update(resourceGroupName, serverName, advancedThreatProtectionName, parameters, context);
        if (inner != null) {
            return new AdvancedThreatProtectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AdvancedThreatProtection updatePut(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName, AdvancedThreatProtectionInner parameters) {
        AdvancedThreatProtectionInner inner
            = this.serviceClient().updatePut(resourceGroupName, serverName, advancedThreatProtectionName, parameters);
        if (inner != null) {
            return new AdvancedThreatProtectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public AdvancedThreatProtection updatePut(String resourceGroupName, String serverName,
        AdvancedThreatProtectionName advancedThreatProtectionName, AdvancedThreatProtectionInner parameters,
        Context context) {
        AdvancedThreatProtectionInner inner = this.serviceClient()
            .updatePut(resourceGroupName, serverName, advancedThreatProtectionName, parameters, context);
        if (inner != null) {
            return new AdvancedThreatProtectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<AdvancedThreatProtection> list(String resourceGroupName, String serverName) {
        PagedIterable<AdvancedThreatProtectionInner> inner = this.serviceClient().list(resourceGroupName, serverName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AdvancedThreatProtectionImpl(inner1, this.manager()));
    }

    public PagedIterable<AdvancedThreatProtection> list(String resourceGroupName, String serverName, Context context) {
        PagedIterable<AdvancedThreatProtectionInner> inner
            = this.serviceClient().list(resourceGroupName, serverName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new AdvancedThreatProtectionImpl(inner1, this.manager()));
    }

    private AdvancedThreatProtectionSettingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager() {
        return this.serviceManager;
    }
}
