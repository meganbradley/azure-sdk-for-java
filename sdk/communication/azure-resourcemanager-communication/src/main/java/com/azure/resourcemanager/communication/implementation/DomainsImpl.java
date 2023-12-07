// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.communication.fluent.DomainsClient;
import com.azure.resourcemanager.communication.fluent.models.DomainResourceInner;
import com.azure.resourcemanager.communication.models.DomainResource;
import com.azure.resourcemanager.communication.models.Domains;
import com.azure.resourcemanager.communication.models.VerificationParameter;

public final class DomainsImpl implements Domains {
    private static final ClientLogger LOGGER = new ClientLogger(DomainsImpl.class);

    private final DomainsClient innerClient;

    private final com.azure.resourcemanager.communication.CommunicationManager serviceManager;

    public DomainsImpl(DomainsClient innerClient,
        com.azure.resourcemanager.communication.CommunicationManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DomainResource> getWithResponse(String resourceGroupName, String emailServiceName,
        String domainName, Context context) {
        Response<DomainResourceInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, emailServiceName, domainName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new DomainResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DomainResource get(String resourceGroupName, String emailServiceName, String domainName) {
        DomainResourceInner inner = this.serviceClient().get(resourceGroupName, emailServiceName, domainName);
        if (inner != null) {
            return new DomainResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String emailServiceName, String domainName) {
        this.serviceClient().delete(resourceGroupName, emailServiceName, domainName);
    }

    public void delete(String resourceGroupName, String emailServiceName, String domainName, Context context) {
        this.serviceClient().delete(resourceGroupName, emailServiceName, domainName, context);
    }

    public PagedIterable<DomainResource> listByEmailServiceResource(String resourceGroupName, String emailServiceName) {
        PagedIterable<DomainResourceInner> inner
            = this.serviceClient().listByEmailServiceResource(resourceGroupName, emailServiceName);
        return Utils.mapPage(inner, inner1 -> new DomainResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DomainResource> listByEmailServiceResource(String resourceGroupName, String emailServiceName,
        Context context) {
        PagedIterable<DomainResourceInner> inner
            = this.serviceClient().listByEmailServiceResource(resourceGroupName, emailServiceName, context);
        return Utils.mapPage(inner, inner1 -> new DomainResourceImpl(inner1, this.manager()));
    }

    public void initiateVerification(String resourceGroupName, String emailServiceName, String domainName,
        VerificationParameter parameters) {
        this.serviceClient().initiateVerification(resourceGroupName, emailServiceName, domainName, parameters);
    }

    public void initiateVerification(String resourceGroupName, String emailServiceName, String domainName,
        VerificationParameter parameters, Context context) {
        this.serviceClient().initiateVerification(resourceGroupName, emailServiceName, domainName, parameters, context);
    }

    public void cancelVerification(String resourceGroupName, String emailServiceName, String domainName,
        VerificationParameter parameters) {
        this.serviceClient().cancelVerification(resourceGroupName, emailServiceName, domainName, parameters);
    }

    public void cancelVerification(String resourceGroupName, String emailServiceName, String domainName,
        VerificationParameter parameters, Context context) {
        this.serviceClient().cancelVerification(resourceGroupName, emailServiceName, domainName, parameters, context);
    }

    public DomainResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String emailServiceName = Utils.getValueFromIdByName(id, "emailServices");
        if (emailServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'emailServices'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        return this.getWithResponse(resourceGroupName, emailServiceName, domainName, Context.NONE).getValue();
    }

    public Response<DomainResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String emailServiceName = Utils.getValueFromIdByName(id, "emailServices");
        if (emailServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'emailServices'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        return this.getWithResponse(resourceGroupName, emailServiceName, domainName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String emailServiceName = Utils.getValueFromIdByName(id, "emailServices");
        if (emailServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'emailServices'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        this.delete(resourceGroupName, emailServiceName, domainName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String emailServiceName = Utils.getValueFromIdByName(id, "emailServices");
        if (emailServiceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'emailServices'.", id)));
        }
        String domainName = Utils.getValueFromIdByName(id, "domains");
        if (domainName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'domains'.", id)));
        }
        this.delete(resourceGroupName, emailServiceName, domainName, context);
    }

    private DomainsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.communication.CommunicationManager manager() {
        return this.serviceManager;
    }

    public DomainResourceImpl define(String name) {
        return new DomainResourceImpl(name, this.manager());
    }
}
