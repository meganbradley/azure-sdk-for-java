// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Kubernetes cluster configuration. */
@Fluent
public final class KubernetesClusterInfo {
    /*
     * Etcd configuration
     */
    @JsonProperty(value = "etcdInfo", access = JsonProperty.Access.WRITE_ONLY)
    private EtcdInfo etcdInfo;

    /*
     * Kubernetes cluster nodes
     */
    @JsonProperty(value = "nodes", access = JsonProperty.Access.WRITE_ONLY)
    private List<NodeInfo> nodes;

    /*
     * Kubernetes cluster version
     */
    @JsonProperty(value = "version", required = true)
    private String version;

    /** Creates an instance of KubernetesClusterInfo class. */
    public KubernetesClusterInfo() {
    }

    /**
     * Get the etcdInfo property: Etcd configuration.
     *
     * @return the etcdInfo value.
     */
    public EtcdInfo etcdInfo() {
        return this.etcdInfo;
    }

    /**
     * Get the nodes property: Kubernetes cluster nodes.
     *
     * @return the nodes value.
     */
    public List<NodeInfo> nodes() {
        return this.nodes;
    }

    /**
     * Get the version property: Kubernetes cluster version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Kubernetes cluster version.
     *
     * @param version the version value to set.
     * @return the KubernetesClusterInfo object itself.
     */
    public KubernetesClusterInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (etcdInfo() != null) {
            etcdInfo().validate();
        }
        if (nodes() != null) {
            nodes().forEach(e -> e.validate());
        }
        if (version() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property version in model KubernetesClusterInfo"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KubernetesClusterInfo.class);
}
