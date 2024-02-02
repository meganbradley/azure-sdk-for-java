// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.springappdiscovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.springappdiscovery.fluent.SpringbootserversClient;
import com.azure.resourcemanager.springappdiscovery.fluent.models.SpringbootserversModelInner;
import com.azure.resourcemanager.springappdiscovery.models.Springbootservers;
import com.azure.resourcemanager.springappdiscovery.models.SpringbootserversModel;

public final class SpringbootserversImpl implements Springbootservers {
    private static final ClientLogger LOGGER = new ClientLogger(SpringbootserversImpl.class);

    private final SpringbootserversClient innerClient;

    private final com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager serviceManager;

    public SpringbootserversImpl(SpringbootserversClient innerClient,
        com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<SpringbootserversModel> getWithResponse(String resourceGroupName, String siteName,
        String springbootserversName, Context context) {
        Response<SpringbootserversModelInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, siteName, springbootserversName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new SpringbootserversModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public SpringbootserversModel get(String resourceGroupName, String siteName, String springbootserversName) {
        SpringbootserversModelInner inner
            = this.serviceClient().get(resourceGroupName, siteName, springbootserversName);
        if (inner != null) {
            return new SpringbootserversModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String siteName, String springbootserversName) {
        this.serviceClient().delete(resourceGroupName, siteName, springbootserversName);
    }

    public void delete(String resourceGroupName, String siteName, String springbootserversName, Context context) {
        this.serviceClient().delete(resourceGroupName, siteName, springbootserversName, context);
    }

    public PagedIterable<SpringbootserversModel> listByResourceGroup(String resourceGroupName, String siteName) {
        PagedIterable<SpringbootserversModelInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, siteName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SpringbootserversModelImpl(inner1, this.manager()));
    }

    public PagedIterable<SpringbootserversModel> listByResourceGroup(String resourceGroupName, String siteName,
        Context context) {
        PagedIterable<SpringbootserversModelInner> inner
            = this.serviceClient().listByResourceGroup(resourceGroupName, siteName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SpringbootserversModelImpl(inner1, this.manager()));
    }

    public PagedIterable<SpringbootserversModel> listBySubscription(String siteName) {
        PagedIterable<SpringbootserversModelInner> inner = this.serviceClient().listBySubscription(siteName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SpringbootserversModelImpl(inner1, this.manager()));
    }

    public PagedIterable<SpringbootserversModel> listBySubscription(String siteName, Context context) {
        PagedIterable<SpringbootserversModelInner> inner = this.serviceClient().listBySubscription(siteName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new SpringbootserversModelImpl(inner1, this.manager()));
    }

    public SpringbootserversModel getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String siteName = ResourceManagerUtils.getValueFromIdByName(id, "springbootsites");
        if (siteName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootsites'.", id)));
        }
        String springbootserversName = ResourceManagerUtils.getValueFromIdByName(id, "springbootservers");
        if (springbootserversName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootservers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, siteName, springbootserversName, Context.NONE).getValue();
    }

    public Response<SpringbootserversModel> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String siteName = ResourceManagerUtils.getValueFromIdByName(id, "springbootsites");
        if (siteName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootsites'.", id)));
        }
        String springbootserversName = ResourceManagerUtils.getValueFromIdByName(id, "springbootservers");
        if (springbootserversName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootservers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, siteName, springbootserversName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String siteName = ResourceManagerUtils.getValueFromIdByName(id, "springbootsites");
        if (siteName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootsites'.", id)));
        }
        String springbootserversName = ResourceManagerUtils.getValueFromIdByName(id, "springbootservers");
        if (springbootserversName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootservers'.", id)));
        }
        this.delete(resourceGroupName, siteName, springbootserversName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String siteName = ResourceManagerUtils.getValueFromIdByName(id, "springbootsites");
        if (siteName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootsites'.", id)));
        }
        String springbootserversName = ResourceManagerUtils.getValueFromIdByName(id, "springbootservers");
        if (springbootserversName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'springbootservers'.", id)));
        }
        this.delete(resourceGroupName, siteName, springbootserversName, context);
    }

    private SpringbootserversClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.springappdiscovery.SpringAppDiscoveryManager manager() {
        return this.serviceManager;
    }

    public SpringbootserversModelImpl define(String name) {
        return new SpringbootserversModelImpl(name, this.manager());
    }
}
