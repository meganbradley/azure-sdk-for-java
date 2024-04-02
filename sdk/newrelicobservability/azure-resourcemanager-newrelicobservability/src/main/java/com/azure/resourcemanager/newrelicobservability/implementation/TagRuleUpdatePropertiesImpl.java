// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.implementation;

import com.azure.resourcemanager.newrelicobservability.fluent.models.MetricRulesInner;
import com.azure.resourcemanager.newrelicobservability.fluent.models.TagRuleUpdatePropertiesInner;
import com.azure.resourcemanager.newrelicobservability.models.LogRules;
import com.azure.resourcemanager.newrelicobservability.models.MetricRules;
import com.azure.resourcemanager.newrelicobservability.models.TagRuleUpdateProperties;

public final class TagRuleUpdatePropertiesImpl implements TagRuleUpdateProperties {
    private TagRuleUpdatePropertiesInner innerObject;

    private final com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager;

    TagRuleUpdatePropertiesImpl(TagRuleUpdatePropertiesInner innerObject,
        com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public LogRules logRules() {
        return this.innerModel().logRules();
    }

    public MetricRules metricRules() {
        MetricRulesInner inner = this.innerModel().metricRules();
        if (inner != null) {
            return new MetricRulesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TagRuleUpdatePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.newrelicobservability.NewRelicObservabilityManager manager() {
        return this.serviceManager;
    }
}
