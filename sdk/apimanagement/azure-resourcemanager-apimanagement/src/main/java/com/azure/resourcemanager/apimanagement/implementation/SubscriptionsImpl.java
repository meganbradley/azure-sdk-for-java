// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.SubscriptionsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.SubscriptionContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.SubscriptionKeysContractInner;
import com.azure.resourcemanager.apimanagement.models.AppType;
import com.azure.resourcemanager.apimanagement.models.SubscriptionContract;
import com.azure.resourcemanager.apimanagement.models.SubscriptionCreateParameters;
import com.azure.resourcemanager.apimanagement.models.SubscriptionKeysContract;
import com.azure.resourcemanager.apimanagement.models.SubscriptionUpdateParameters;
import com.azure.resourcemanager.apimanagement.models.Subscriptions;
import com.azure.resourcemanager.apimanagement.models.SubscriptionsCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.SubscriptionsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.SubscriptionsGetResponse;
import com.azure.resourcemanager.apimanagement.models.SubscriptionsListSecretsResponse;
import com.azure.resourcemanager.apimanagement.models.SubscriptionsUpdateResponse;

public final class SubscriptionsImpl implements Subscriptions {
    private static final ClientLogger LOGGER = new ClientLogger(SubscriptionsImpl.class);

    private final SubscriptionsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public SubscriptionsImpl(
        SubscriptionsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SubscriptionContract> list(String resourceGroupName, String serviceName) {
        PagedIterable<SubscriptionContractInner> inner = this.serviceClient().list(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new SubscriptionContractImpl(inner1, this.manager()));
    }

    public PagedIterable<SubscriptionContract> list(
        String resourceGroupName, String serviceName, String filter, Integer top, Integer skip, Context context) {
        PagedIterable<SubscriptionContractInner> inner =
            this.serviceClient().list(resourceGroupName, serviceName, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new SubscriptionContractImpl(inner1, this.manager()));
    }

    public SubscriptionsGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String sid, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, sid, context);
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String sid) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, sid);
    }

    public Response<SubscriptionContract> getWithResponse(
        String resourceGroupName, String serviceName, String sid, Context context) {
        SubscriptionsGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, sid, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubscriptionContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SubscriptionContract get(String resourceGroupName, String serviceName, String sid) {
        SubscriptionContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, sid);
        if (inner != null) {
            return new SubscriptionContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SubscriptionContract> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String sid,
        SubscriptionCreateParameters parameters,
        Boolean notify,
        String ifMatch,
        AppType appType,
        Context context) {
        SubscriptionsCreateOrUpdateResponse inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, sid, parameters, notify, ifMatch, appType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubscriptionContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SubscriptionContract createOrUpdate(
        String resourceGroupName, String serviceName, String sid, SubscriptionCreateParameters parameters) {
        SubscriptionContractInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serviceName, sid, parameters);
        if (inner != null) {
            return new SubscriptionContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SubscriptionContract> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String sid,
        String ifMatch,
        SubscriptionUpdateParameters parameters,
        Boolean notify,
        AppType appType,
        Context context) {
        SubscriptionsUpdateResponse inner =
            this
                .serviceClient()
                .updateWithResponse(resourceGroupName, serviceName, sid, ifMatch, parameters, notify, appType, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubscriptionContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SubscriptionContract update(
        String resourceGroupName,
        String serviceName,
        String sid,
        String ifMatch,
        SubscriptionUpdateParameters parameters) {
        SubscriptionContractInner inner =
            this.serviceClient().update(resourceGroupName, serviceName, sid, ifMatch, parameters);
        if (inner != null) {
            return new SubscriptionContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String sid, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, sid, ifMatch, context);
    }

    public void delete(String resourceGroupName, String serviceName, String sid, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, sid, ifMatch);
    }

    public Response<Void> regeneratePrimaryKeyWithResponse(
        String resourceGroupName, String serviceName, String sid, Context context) {
        return this.serviceClient().regeneratePrimaryKeyWithResponse(resourceGroupName, serviceName, sid, context);
    }

    public void regeneratePrimaryKey(String resourceGroupName, String serviceName, String sid) {
        this.serviceClient().regeneratePrimaryKey(resourceGroupName, serviceName, sid);
    }

    public Response<Void> regenerateSecondaryKeyWithResponse(
        String resourceGroupName, String serviceName, String sid, Context context) {
        return this.serviceClient().regenerateSecondaryKeyWithResponse(resourceGroupName, serviceName, sid, context);
    }

    public void regenerateSecondaryKey(String resourceGroupName, String serviceName, String sid) {
        this.serviceClient().regenerateSecondaryKey(resourceGroupName, serviceName, sid);
    }

    public Response<SubscriptionKeysContract> listSecretsWithResponse(
        String resourceGroupName, String serviceName, String sid, Context context) {
        SubscriptionsListSecretsResponse inner =
            this.serviceClient().listSecretsWithResponse(resourceGroupName, serviceName, sid, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SubscriptionKeysContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SubscriptionKeysContract listSecrets(String resourceGroupName, String serviceName, String sid) {
        SubscriptionKeysContractInner inner = this.serviceClient().listSecrets(resourceGroupName, serviceName, sid);
        if (inner != null) {
            return new SubscriptionKeysContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private SubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
