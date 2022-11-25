// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batch.fluent.CertificatesClient;
import com.azure.resourcemanager.batch.fluent.models.CertificateInner;
import com.azure.resourcemanager.batch.models.Certificate;
import com.azure.resourcemanager.batch.models.Certificates;
import com.azure.resourcemanager.batch.models.CertificatesCancelDeletionResponse;
import com.azure.resourcemanager.batch.models.CertificatesGetResponse;

public final class CertificatesImpl implements Certificates {
    private static final ClientLogger LOGGER = new ClientLogger(CertificatesImpl.class);

    private final CertificatesClient innerClient;

    private final com.azure.resourcemanager.batch.BatchManager serviceManager;

    public CertificatesImpl(
        CertificatesClient innerClient, com.azure.resourcemanager.batch.BatchManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Certificate> listByBatchAccount(String resourceGroupName, String accountName) {
        PagedIterable<CertificateInner> inner = this.serviceClient().listByBatchAccount(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<Certificate> listByBatchAccount(
        String resourceGroupName,
        String accountName,
        Integer maxresults,
        String select,
        String filter,
        Context context) {
        PagedIterable<CertificateInner> inner =
            this
                .serviceClient()
                .listByBatchAccount(resourceGroupName, accountName, maxresults, select, filter, context);
        return Utils.mapPage(inner, inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String accountName, String certificateName) {
        this.serviceClient().delete(resourceGroupName, accountName, certificateName);
    }

    public void delete(String resourceGroupName, String accountName, String certificateName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, certificateName, context);
    }

    public Response<Certificate> getWithResponse(
        String resourceGroupName, String accountName, String certificateName, Context context) {
        CertificatesGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, certificateName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Certificate get(String resourceGroupName, String accountName, String certificateName) {
        CertificateInner inner = this.serviceClient().get(resourceGroupName, accountName, certificateName);
        if (inner != null) {
            return new CertificateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Certificate> cancelDeletionWithResponse(
        String resourceGroupName, String accountName, String certificateName, Context context) {
        CertificatesCancelDeletionResponse inner =
            this.serviceClient().cancelDeletionWithResponse(resourceGroupName, accountName, certificateName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Certificate cancelDeletion(String resourceGroupName, String accountName, String certificateName) {
        CertificateInner inner = this.serviceClient().cancelDeletion(resourceGroupName, accountName, certificateName);
        if (inner != null) {
            return new CertificateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Certificate getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "certificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, certificateName, Context.NONE).getValue();
    }

    public Response<Certificate> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "certificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, certificateName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "certificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        this.delete(resourceGroupName, accountName, certificateName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "batchAccounts");
        if (accountName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'batchAccounts'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "certificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        this.delete(resourceGroupName, accountName, certificateName, context);
    }

    private CertificatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.batch.BatchManager manager() {
        return this.serviceManager;
    }

    public CertificateImpl define(String name) {
        return new CertificateImpl(name, this.manager());
    }
}
