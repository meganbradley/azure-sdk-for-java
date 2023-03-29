// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.newrelicobservability.fluent.TagRulesClient;
import com.azure.resourcemanager.newrelicobservability.fluent.models.TagRuleInner;
import com.azure.resourcemanager.newrelicobservability.models.TagRule;
import com.azure.resourcemanager.newrelicobservability.models.TagRules;

public final class TagRulesImpl implements TagRules {
    private static final ClientLogger LOGGER = new ClientLogger(TagRulesImpl.class);

    private final TagRulesClient innerClient;

    private final com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager;

    public TagRulesImpl(
        TagRulesClient innerClient,
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TagRule> listByNewRelicMonitorResource(String resourceGroupName, String monitorName) {
        PagedIterable<TagRuleInner> inner =
            this.serviceClient().listByNewRelicMonitorResource(resourceGroupName, monitorName);
        return Utils.mapPage(inner, inner1 -> new TagRuleImpl(inner1, this.manager()));
    }

    public PagedIterable<TagRule> listByNewRelicMonitorResource(
        String resourceGroupName, String monitorName, Context context) {
        PagedIterable<TagRuleInner> inner =
            this.serviceClient().listByNewRelicMonitorResource(resourceGroupName, monitorName, context);
        return Utils.mapPage(inner, inner1 -> new TagRuleImpl(inner1, this.manager()));
    }

    public Response<TagRule> getWithResponse(
        String resourceGroupName, String monitorName, String ruleSetName, Context context) {
        Response<TagRuleInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, monitorName, ruleSetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TagRuleImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TagRule get(String resourceGroupName, String monitorName, String ruleSetName) {
        TagRuleInner inner = this.serviceClient().get(resourceGroupName, monitorName, ruleSetName);
        if (inner != null) {
            return new TagRuleImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String monitorName, String ruleSetName) {
        this.serviceClient().delete(resourceGroupName, monitorName, ruleSetName);
    }

    public void delete(String resourceGroupName, String monitorName, String ruleSetName, Context context) {
        this.serviceClient().delete(resourceGroupName, monitorName, ruleSetName, context);
    }

    public TagRule getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "tagRules");
        if (ruleSetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tagRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, monitorName, ruleSetName, Context.NONE).getValue();
    }

    public Response<TagRule> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "tagRules");
        if (ruleSetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tagRules'.", id)));
        }
        return this.getWithResponse(resourceGroupName, monitorName, ruleSetName, context);
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
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "tagRules");
        if (ruleSetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tagRules'.", id)));
        }
        this.delete(resourceGroupName, monitorName, ruleSetName, Context.NONE);
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
        String monitorName = Utils.getValueFromIdByName(id, "monitors");
        if (monitorName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'monitors'.", id)));
        }
        String ruleSetName = Utils.getValueFromIdByName(id, "tagRules");
        if (ruleSetName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'tagRules'.", id)));
        }
        this.delete(resourceGroupName, monitorName, ruleSetName, context);
    }

    private TagRulesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager() {
        return this.serviceManager;
    }

    public TagRuleImpl define(String name) {
        return new TagRuleImpl(name, this.manager());
    }
}
