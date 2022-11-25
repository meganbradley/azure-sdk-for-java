// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.signalr.fluent.SignalRCustomCertificatesClient;
import com.azure.resourcemanager.signalr.fluent.models.CustomCertificateInner;
import com.azure.resourcemanager.signalr.models.CustomCertificate;
import com.azure.resourcemanager.signalr.models.SignalRCustomCertificates;

public final class SignalRCustomCertificatesImpl implements SignalRCustomCertificates {
    private static final ClientLogger LOGGER = new ClientLogger(SignalRCustomCertificatesImpl.class);

    private final SignalRCustomCertificatesClient innerClient;

    private final com.azure.resourcemanager.signalr.SignalRManager serviceManager;

    public SignalRCustomCertificatesImpl(
        SignalRCustomCertificatesClient innerClient, com.azure.resourcemanager.signalr.SignalRManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CustomCertificate> list(String resourceGroupName, String resourceName) {
        PagedIterable<CustomCertificateInner> inner = this.serviceClient().list(resourceGroupName, resourceName);
        return Utils.mapPage(inner, inner1 -> new CustomCertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<CustomCertificate> list(String resourceGroupName, String resourceName, Context context) {
        PagedIterable<CustomCertificateInner> inner =
            this.serviceClient().list(resourceGroupName, resourceName, context);
        return Utils.mapPage(inner, inner1 -> new CustomCertificateImpl(inner1, this.manager()));
    }

    public Response<CustomCertificate> getWithResponse(
        String resourceGroupName, String resourceName, String certificateName, Context context) {
        Response<CustomCertificateInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, resourceName, certificateName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CustomCertificateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public CustomCertificate get(String resourceGroupName, String resourceName, String certificateName) {
        CustomCertificateInner inner = this.serviceClient().get(resourceGroupName, resourceName, certificateName);
        if (inner != null) {
            return new CustomCertificateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String resourceName, String certificateName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, resourceName, certificateName, context);
    }

    public void delete(String resourceGroupName, String resourceName, String certificateName) {
        this.serviceClient().delete(resourceGroupName, resourceName, certificateName);
    }

    public CustomCertificate getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "signalR");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'signalR'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "customCertificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customCertificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, certificateName, Context.NONE).getValue();
    }

    public Response<CustomCertificate> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "signalR");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'signalR'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "customCertificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customCertificates'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, certificateName, context);
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
        String resourceName = Utils.getValueFromIdByName(id, "signalR");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'signalR'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "customCertificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customCertificates'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, resourceName, certificateName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = Utils.getValueFromIdByName(id, "signalR");
        if (resourceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'signalR'.", id)));
        }
        String certificateName = Utils.getValueFromIdByName(id, "customCertificates");
        if (certificateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'customCertificates'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, resourceName, certificateName, context);
    }

    private SignalRCustomCertificatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.signalr.SignalRManager manager() {
        return this.serviceManager;
    }

    public CustomCertificateImpl define(String name) {
        return new CustomCertificateImpl(name, this.manager());
    }
}
