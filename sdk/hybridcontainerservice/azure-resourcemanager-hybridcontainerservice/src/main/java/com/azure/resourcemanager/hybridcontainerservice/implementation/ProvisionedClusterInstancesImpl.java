// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridcontainerservice.fluent.ProvisionedClusterInstancesClient;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ListCredentialResponseInner;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClusterUpgradeProfileInner;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.ProvisionedClustersInner;
import com.azure.resourcemanager.hybridcontainerservice.models.ListCredentialResponse;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterInstances;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterUpgradeProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusters;

public final class ProvisionedClusterInstancesImpl implements ProvisionedClusterInstances {
    private static final ClientLogger LOGGER = new ClientLogger(ProvisionedClusterInstancesImpl.class);

    private final ProvisionedClusterInstancesClient innerClient;

    private final com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager;

    public ProvisionedClusterInstancesImpl(ProvisionedClusterInstancesClient innerClient,
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ProvisionedClusters> getWithResponse(String connectedClusterResourceUri, Context context) {
        Response<ProvisionedClustersInner> inner
            = this.serviceClient().getWithResponse(connectedClusterResourceUri, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ProvisionedClustersImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProvisionedClusters get(String connectedClusterResourceUri) {
        ProvisionedClustersInner inner = this.serviceClient().get(connectedClusterResourceUri);
        if (inner != null) {
            return new ProvisionedClustersImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProvisionedClusters createOrUpdate(String connectedClusterResourceUri,
        ProvisionedClustersInner provisionedClusterInstance) {
        ProvisionedClustersInner inner
            = this.serviceClient().createOrUpdate(connectedClusterResourceUri, provisionedClusterInstance);
        if (inner != null) {
            return new ProvisionedClustersImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProvisionedClusters createOrUpdate(String connectedClusterResourceUri,
        ProvisionedClustersInner provisionedClusterInstance, Context context) {
        ProvisionedClustersInner inner
            = this.serviceClient().createOrUpdate(connectedClusterResourceUri, provisionedClusterInstance, context);
        if (inner != null) {
            return new ProvisionedClustersImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String connectedClusterResourceUri) {
        this.serviceClient().delete(connectedClusterResourceUri);
    }

    public void delete(String connectedClusterResourceUri, Context context) {
        this.serviceClient().delete(connectedClusterResourceUri, context);
    }

    public PagedIterable<ProvisionedClusters> list(String connectedClusterResourceUri) {
        PagedIterable<ProvisionedClustersInner> inner = this.serviceClient().list(connectedClusterResourceUri);
        return Utils.mapPage(inner, inner1 -> new ProvisionedClustersImpl(inner1, this.manager()));
    }

    public PagedIterable<ProvisionedClusters> list(String connectedClusterResourceUri, Context context) {
        PagedIterable<ProvisionedClustersInner> inner = this.serviceClient().list(connectedClusterResourceUri, context);
        return Utils.mapPage(inner, inner1 -> new ProvisionedClustersImpl(inner1, this.manager()));
    }

    public Response<ProvisionedClusterUpgradeProfile> getUpgradeProfileWithResponse(String connectedClusterResourceUri,
        Context context) {
        Response<ProvisionedClusterUpgradeProfileInner> inner
            = this.serviceClient().getUpgradeProfileWithResponse(connectedClusterResourceUri, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ProvisionedClusterUpgradeProfileImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProvisionedClusterUpgradeProfile getUpgradeProfile(String connectedClusterResourceUri) {
        ProvisionedClusterUpgradeProfileInner inner
            = this.serviceClient().getUpgradeProfile(connectedClusterResourceUri);
        if (inner != null) {
            return new ProvisionedClusterUpgradeProfileImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ListCredentialResponse listUserKubeconfig(String connectedClusterResourceUri) {
        ListCredentialResponseInner inner = this.serviceClient().listUserKubeconfig(connectedClusterResourceUri);
        if (inner != null) {
            return new ListCredentialResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ListCredentialResponse listUserKubeconfig(String connectedClusterResourceUri, Context context) {
        ListCredentialResponseInner inner
            = this.serviceClient().listUserKubeconfig(connectedClusterResourceUri, context);
        if (inner != null) {
            return new ListCredentialResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ListCredentialResponse listAdminKubeconfig(String connectedClusterResourceUri) {
        ListCredentialResponseInner inner = this.serviceClient().listAdminKubeconfig(connectedClusterResourceUri);
        if (inner != null) {
            return new ListCredentialResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ListCredentialResponse listAdminKubeconfig(String connectedClusterResourceUri, Context context) {
        ListCredentialResponseInner inner
            = this.serviceClient().listAdminKubeconfig(connectedClusterResourceUri, context);
        if (inner != null) {
            return new ListCredentialResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ProvisionedClusterInstancesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager() {
        return this.serviceManager;
    }
}
