// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** API route config of the Spring Cloud Gateway. */
@Fluent
public final class GatewayApiRoute {
    /*
     * A title, will be applied to methods in the generated OpenAPI documentation.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * A description, will be applied to methods in the generated OpenAPI documentation.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Full uri, will override `appName`.
     */
    @JsonProperty(value = "uri")
    private String uri;

    /*
     * Enable sso validation.
     */
    @JsonProperty(value = "ssoEnabled")
    private Boolean ssoEnabled;

    /*
     * Pass currently-authenticated user's identity token to application service, default is 'false'
     */
    @JsonProperty(value = "tokenRelay")
    private Boolean tokenRelay;

    /*
     * A number of conditions to evaluate a route for each request. Each predicate may be evaluated against request
     * headers and parameter values. All of the predicates associated with a route must evaluate to true for the route
     * to be matched to the request.
     */
    @JsonProperty(value = "predicates")
    private List<String> predicates;

    /*
     * To modify the request before sending it to the target endpoint, or the received response.
     */
    @JsonProperty(value = "filters")
    private List<String> filters;

    /*
     * Route processing order.
     */
    @JsonProperty(value = "order")
    private Integer order;

    /*
     * Classification tags, will be applied to methods in the generated OpenAPI documentation.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /** Creates an instance of GatewayApiRoute class. */
    public GatewayApiRoute() {
    }

    /**
     * Get the title property: A title, will be applied to methods in the generated OpenAPI documentation.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: A title, will be applied to methods in the generated OpenAPI documentation.
     *
     * @param title the title value to set.
     * @return the GatewayApiRoute object itself.
     */
    public GatewayApiRoute withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the description property: A description, will be applied to methods in the generated OpenAPI documentation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description, will be applied to methods in the generated OpenAPI documentation.
     *
     * @param description the description value to set.
     * @return the GatewayApiRoute object itself.
     */
    public GatewayApiRoute withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the uri property: Full uri, will override `appName`.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: Full uri, will override `appName`.
     *
     * @param uri the uri value to set.
     * @return the GatewayApiRoute object itself.
     */
    public GatewayApiRoute withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the ssoEnabled property: Enable sso validation.
     *
     * @return the ssoEnabled value.
     */
    public Boolean ssoEnabled() {
        return this.ssoEnabled;
    }

    /**
     * Set the ssoEnabled property: Enable sso validation.
     *
     * @param ssoEnabled the ssoEnabled value to set.
     * @return the GatewayApiRoute object itself.
     */
    public GatewayApiRoute withSsoEnabled(Boolean ssoEnabled) {
        this.ssoEnabled = ssoEnabled;
        return this;
    }

    /**
     * Get the tokenRelay property: Pass currently-authenticated user's identity token to application service, default
     * is 'false'.
     *
     * @return the tokenRelay value.
     */
    public Boolean tokenRelay() {
        return this.tokenRelay;
    }

    /**
     * Set the tokenRelay property: Pass currently-authenticated user's identity token to application service, default
     * is 'false'.
     *
     * @param tokenRelay the tokenRelay value to set.
     * @return the GatewayApiRoute object itself.
     */
    public GatewayApiRoute withTokenRelay(Boolean tokenRelay) {
        this.tokenRelay = tokenRelay;
        return this;
    }

    /**
     * Get the predicates property: A number of conditions to evaluate a route for each request. Each predicate may be
     * evaluated against request headers and parameter values. All of the predicates associated with a route must
     * evaluate to true for the route to be matched to the request.
     *
     * @return the predicates value.
     */
    public List<String> predicates() {
        return this.predicates;
    }

    /**
     * Set the predicates property: A number of conditions to evaluate a route for each request. Each predicate may be
     * evaluated against request headers and parameter values. All of the predicates associated with a route must
     * evaluate to true for the route to be matched to the request.
     *
     * @param predicates the predicates value to set.
     * @return the GatewayApiRoute object itself.
     */
    public GatewayApiRoute withPredicates(List<String> predicates) {
        this.predicates = predicates;
        return this;
    }

    /**
     * Get the filters property: To modify the request before sending it to the target endpoint, or the received
     * response.
     *
     * @return the filters value.
     */
    public List<String> filters() {
        return this.filters;
    }

    /**
     * Set the filters property: To modify the request before sending it to the target endpoint, or the received
     * response.
     *
     * @param filters the filters value to set.
     * @return the GatewayApiRoute object itself.
     */
    public GatewayApiRoute withFilters(List<String> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Get the order property: Route processing order.
     *
     * @return the order value.
     */
    public Integer order() {
        return this.order;
    }

    /**
     * Set the order property: Route processing order.
     *
     * @param order the order value to set.
     * @return the GatewayApiRoute object itself.
     */
    public GatewayApiRoute withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * Get the tags property: Classification tags, will be applied to methods in the generated OpenAPI documentation.
     *
     * @return the tags value.
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Classification tags, will be applied to methods in the generated OpenAPI documentation.
     *
     * @param tags the tags value to set.
     * @return the GatewayApiRoute object itself.
     */
    public GatewayApiRoute withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
