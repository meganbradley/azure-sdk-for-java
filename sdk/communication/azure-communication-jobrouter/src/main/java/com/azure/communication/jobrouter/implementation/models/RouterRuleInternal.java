// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.communication.jobrouter.implementation.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A rule of one of the following types: StaticRule: A rule providing static rules that always return the same result,
 * regardless of input. DirectMapRule: A rule that return the same labels as the input labels. ExpressionRule: A rule
 * providing inline expression rules. FunctionRule: A rule providing a binding to an HTTP Triggered Azure Function.
 * WebhookRule: A rule providing a binding to a webserver following OAuth2.0 authentication protocol.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "kind",
        defaultImpl = RouterRuleInternal.class)
@JsonTypeName("RouterRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "direct-map-rule", value = DirectMapRouterRuleInternal.class),
    @JsonSubTypes.Type(name = "expression-rule", value = ExpressionRouterRuleInternal.class),
    @JsonSubTypes.Type(name = "azure-function-rule", value = FunctionRouterRuleInternal.class),
    @JsonSubTypes.Type(name = "static-rule", value = StaticRouterRuleInternal.class),
    @JsonSubTypes.Type(name = "webhook-rule", value = WebhookRouterRuleInternal.class)
})
@Immutable
public class RouterRuleInternal {

    /** Creates an instance of RouterRule class. */
    @Generated
    public RouterRuleInternal() {}
}
