// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ManagedCertificatesClient;
import com.azure.resourcemanager.appcontainers.fluent.models.ManagedCertificateInner;
import com.azure.resourcemanager.appcontainers.models.ManagedCertificate;
import com.azure.resourcemanager.appcontainers.models.ManagedCertificates;

public final class ManagedCertificatesImpl implements ManagedCertificates {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedCertificatesImpl.class);

    private final ManagedCertificatesClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ManagedCertificatesImpl(ManagedCertificatesClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ManagedCertificate> getWithResponse(String resourceGroupName, String environmentName,
        String managedCertificateName, Context context) {
        Response<ManagedCertificateInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, environmentName, managedCertificateName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ManagedCertificateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagedCertificate get(String resourceGroupName, String environmentName, String managedCertificateName) {
        ManagedCertificateInner inner
            = this.serviceClient().get(resourceGroupName, environmentName, managedCertificateName);
        if (inner != null) {
            return new ManagedCertificateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String environmentName,
        String managedCertificateName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, environmentName, managedCertificateName,
            context);
    }

    public void delete(String resourceGroupName, String environmentName, String managedCertificateName) {
        this.serviceClient().delete(resourceGroupName, environmentName, managedCertificateName);
    }

    public PagedIterable<ManagedCertificate> list(String resourceGroupName, String environmentName) {
        PagedIterable<ManagedCertificateInner> inner = this.serviceClient().list(resourceGroupName, environmentName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ManagedCertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<ManagedCertificate> list(String resourceGroupName, String environmentName, Context context) {
        PagedIterable<ManagedCertificateInner> inner
            = this.serviceClient().list(resourceGroupName, environmentName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ManagedCertificateImpl(inner1, this.manager()));
    }

    public ManagedCertificate getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String environmentName = ResourceManagerUtils.getValueFromIdByName(id, "managedEnvironments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedEnvironments'.", id)));
        }
        String managedCertificateName = ResourceManagerUtils.getValueFromIdByName(id, "managedCertificates");
        if (managedCertificateName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedCertificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, environmentName, managedCertificateName, Context.NONE)
            .getValue();
    }

    public Response<ManagedCertificate> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String environmentName = ResourceManagerUtils.getValueFromIdByName(id, "managedEnvironments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedEnvironments'.", id)));
        }
        String managedCertificateName = ResourceManagerUtils.getValueFromIdByName(id, "managedCertificates");
        if (managedCertificateName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedCertificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, environmentName, managedCertificateName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String environmentName = ResourceManagerUtils.getValueFromIdByName(id, "managedEnvironments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedEnvironments'.", id)));
        }
        String managedCertificateName = ResourceManagerUtils.getValueFromIdByName(id, "managedCertificates");
        if (managedCertificateName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedCertificates'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, environmentName, managedCertificateName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String environmentName = ResourceManagerUtils.getValueFromIdByName(id, "managedEnvironments");
        if (environmentName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedEnvironments'.", id)));
        }
        String managedCertificateName = ResourceManagerUtils.getValueFromIdByName(id, "managedCertificates");
        if (managedCertificateName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'managedCertificates'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, environmentName, managedCertificateName, context);
    }

    private ManagedCertificatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }

    public ManagedCertificateImpl define(String name) {
        return new ManagedCertificateImpl(name, this.manager());
    }
}
