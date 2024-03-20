// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.fluent.SnapshotsClient;
import com.azure.resourcemanager.netapp.fluent.models.SnapshotInner;
import com.azure.resourcemanager.netapp.models.Snapshot;
import com.azure.resourcemanager.netapp.models.SnapshotRestoreFiles;
import com.azure.resourcemanager.netapp.models.Snapshots;

public final class SnapshotsImpl implements Snapshots {
    private static final ClientLogger LOGGER = new ClientLogger(SnapshotsImpl.class);

    private final SnapshotsClient innerClient;

    private final com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager;

    public SnapshotsImpl(SnapshotsClient innerClient,
        com.azure.resourcemanager.netapp.NetAppFilesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Snapshot> list(String resourceGroupName, String accountName, String poolName,
        String volumeName) {
        PagedIterable<SnapshotInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, poolName, volumeName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SnapshotImpl(inner1, this.manager()));
    }

    public PagedIterable<Snapshot> list(String resourceGroupName, String accountName, String poolName,
        String volumeName, Context context) {
        PagedIterable<SnapshotInner> inner
            = this.serviceClient().list(resourceGroupName, accountName, poolName, volumeName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SnapshotImpl(inner1, this.manager()));
    }

    public Response<Snapshot> getWithResponse(String resourceGroupName, String accountName, String poolName,
        String volumeName, String snapshotName, Context context) {
        Response<SnapshotInner> inner = this.serviceClient().getWithResponse(resourceGroupName, accountName, poolName,
            volumeName, snapshotName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SnapshotImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Snapshot get(String resourceGroupName, String accountName, String poolName, String volumeName,
        String snapshotName) {
        SnapshotInner inner
            = this.serviceClient().get(resourceGroupName, accountName, poolName, volumeName, snapshotName);
        if (inner != null) {
            return new SnapshotImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Snapshot update(String resourceGroupName, String accountName, String poolName, String volumeName,
        String snapshotName, Object body) {
        SnapshotInner inner
            = this.serviceClient().update(resourceGroupName, accountName, poolName, volumeName, snapshotName, body);
        if (inner != null) {
            return new SnapshotImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Snapshot update(String resourceGroupName, String accountName, String poolName, String volumeName,
        String snapshotName, Object body, Context context) {
        SnapshotInner inner = this.serviceClient().update(resourceGroupName, accountName, poolName, volumeName,
            snapshotName, body, context);
        if (inner != null) {
            return new SnapshotImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String poolName, String volumeName,
        String snapshotName) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, snapshotName);
    }

    public void delete(String resourceGroupName, String accountName, String poolName, String volumeName,
        String snapshotName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, poolName, volumeName, snapshotName, context);
    }

    public void restoreFiles(String resourceGroupName, String accountName, String poolName, String volumeName,
        String snapshotName, SnapshotRestoreFiles body) {
        this.serviceClient().restoreFiles(resourceGroupName, accountName, poolName, volumeName, snapshotName, body);
    }

    public void restoreFiles(String resourceGroupName, String accountName, String poolName, String volumeName,
        String snapshotName, SnapshotRestoreFiles body, Context context) {
        this.serviceClient().restoreFiles(resourceGroupName, accountName, poolName, volumeName, snapshotName, body,
            context);
    }

    public Snapshot getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = ResourceManagerUtils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = ResourceManagerUtils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String snapshotName = ResourceManagerUtils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, volumeName, snapshotName, Context.NONE)
            .getValue();
    }

    public Response<Snapshot> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = ResourceManagerUtils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = ResourceManagerUtils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String snapshotName = ResourceManagerUtils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, poolName, volumeName, snapshotName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = ResourceManagerUtils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = ResourceManagerUtils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String snapshotName = ResourceManagerUtils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, snapshotName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = ResourceManagerUtils.getValueFromIdByName(id, "netAppAccounts");
        if (accountName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'netAppAccounts'.", id)));
        }
        String poolName = ResourceManagerUtils.getValueFromIdByName(id, "capacityPools");
        if (poolName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'capacityPools'.", id)));
        }
        String volumeName = ResourceManagerUtils.getValueFromIdByName(id, "volumes");
        if (volumeName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'volumes'.", id)));
        }
        String snapshotName = ResourceManagerUtils.getValueFromIdByName(id, "snapshots");
        if (snapshotName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'snapshots'.", id)));
        }
        this.delete(resourceGroupName, accountName, poolName, volumeName, snapshotName, context);
    }

    private SnapshotsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.netapp.NetAppFilesManager manager() {
        return this.serviceManager;
    }

    public SnapshotImpl define(String name) {
        return new SnapshotImpl(name, this.manager());
    }
}
