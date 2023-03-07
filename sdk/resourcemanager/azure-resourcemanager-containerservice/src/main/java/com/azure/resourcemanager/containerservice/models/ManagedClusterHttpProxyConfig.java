// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Cluster HTTP proxy configuration. */
@Fluent
public final class ManagedClusterHttpProxyConfig {
    /*
     * The HTTP proxy server endpoint to use.
     */
    @JsonProperty(value = "httpProxy")
    private String httpProxy;

    /*
     * The HTTPS proxy server endpoint to use.
     */
    @JsonProperty(value = "httpsProxy")
    private String httpsProxy;

    /*
     * The endpoints that should not go through proxy.
     */
    @JsonProperty(value = "noProxy")
    private List<String> noProxy;

    /*
     * A read-only list of all endpoints for which traffic should not be sent to the proxy. This list is a superset of
     * noProxy and values injected by AKS.
     */
    @JsonProperty(value = "effectiveNoProxy", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> effectiveNoProxy;

    /*
     * Alternative CA cert to use for connecting to proxy servers.
     */
    @JsonProperty(value = "trustedCa")
    private String trustedCa;

    /** Creates an instance of ManagedClusterHttpProxyConfig class. */
    public ManagedClusterHttpProxyConfig() {
    }

    /**
     * Get the httpProxy property: The HTTP proxy server endpoint to use.
     *
     * @return the httpProxy value.
     */
    public String httpProxy() {
        return this.httpProxy;
    }

    /**
     * Set the httpProxy property: The HTTP proxy server endpoint to use.
     *
     * @param httpProxy the httpProxy value to set.
     * @return the ManagedClusterHttpProxyConfig object itself.
     */
    public ManagedClusterHttpProxyConfig withHttpProxy(String httpProxy) {
        this.httpProxy = httpProxy;
        return this;
    }

    /**
     * Get the httpsProxy property: The HTTPS proxy server endpoint to use.
     *
     * @return the httpsProxy value.
     */
    public String httpsProxy() {
        return this.httpsProxy;
    }

    /**
     * Set the httpsProxy property: The HTTPS proxy server endpoint to use.
     *
     * @param httpsProxy the httpsProxy value to set.
     * @return the ManagedClusterHttpProxyConfig object itself.
     */
    public ManagedClusterHttpProxyConfig withHttpsProxy(String httpsProxy) {
        this.httpsProxy = httpsProxy;
        return this;
    }

    /**
     * Get the noProxy property: The endpoints that should not go through proxy.
     *
     * @return the noProxy value.
     */
    public List<String> noProxy() {
        return this.noProxy;
    }

    /**
     * Set the noProxy property: The endpoints that should not go through proxy.
     *
     * @param noProxy the noProxy value to set.
     * @return the ManagedClusterHttpProxyConfig object itself.
     */
    public ManagedClusterHttpProxyConfig withNoProxy(List<String> noProxy) {
        this.noProxy = noProxy;
        return this;
    }

    /**
     * Get the effectiveNoProxy property: A read-only list of all endpoints for which traffic should not be sent to the
     * proxy. This list is a superset of noProxy and values injected by AKS.
     *
     * @return the effectiveNoProxy value.
     */
    public List<String> effectiveNoProxy() {
        return this.effectiveNoProxy;
    }

    /**
     * Get the trustedCa property: Alternative CA cert to use for connecting to proxy servers.
     *
     * @return the trustedCa value.
     */
    public String trustedCa() {
        return this.trustedCa;
    }

    /**
     * Set the trustedCa property: Alternative CA cert to use for connecting to proxy servers.
     *
     * @param trustedCa the trustedCa value to set.
     * @return the ManagedClusterHttpProxyConfig object itself.
     */
    public ManagedClusterHttpProxyConfig withTrustedCa(String trustedCa) {
        this.trustedCa = trustedCa;
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
