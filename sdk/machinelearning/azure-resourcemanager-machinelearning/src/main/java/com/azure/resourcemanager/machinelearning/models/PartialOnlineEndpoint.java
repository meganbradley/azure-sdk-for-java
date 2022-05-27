// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Mutable online endpoint configuration. */
@Fluent
public final class PartialOnlineEndpoint {
    /*
     * Percentage of traffic to be mirrored to each deployment without using
     * returned scoring. Traffic values need to sum to utmost 50.
     */
    @JsonProperty(value = "mirrorTraffic")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Integer> mirrorTraffic;

    /*
     * Set to "Enabled" for endpoints that should allow public access when
     * Private Link is enabled.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccessType publicNetworkAccess;

    /*
     * Percentage of traffic from endpoint to divert to each deployment.
     * Traffic values need to sum to 100.
     */
    @JsonProperty(value = "traffic")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, Integer> traffic;

    /**
     * Get the mirrorTraffic property: Percentage of traffic to be mirrored to each deployment without using returned
     * scoring. Traffic values need to sum to utmost 50.
     *
     * @return the mirrorTraffic value.
     */
    public Map<String, Integer> mirrorTraffic() {
        return this.mirrorTraffic;
    }

    /**
     * Set the mirrorTraffic property: Percentage of traffic to be mirrored to each deployment without using returned
     * scoring. Traffic values need to sum to utmost 50.
     *
     * @param mirrorTraffic the mirrorTraffic value to set.
     * @return the PartialOnlineEndpoint object itself.
     */
    public PartialOnlineEndpoint withMirrorTraffic(Map<String, Integer> mirrorTraffic) {
        this.mirrorTraffic = mirrorTraffic;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Set to "Enabled" for endpoints that should allow public access when Private
     * Link is enabled.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessType publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Set to "Enabled" for endpoints that should allow public access when Private
     * Link is enabled.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the PartialOnlineEndpoint object itself.
     */
    public PartialOnlineEndpoint withPublicNetworkAccess(PublicNetworkAccessType publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the traffic property: Percentage of traffic from endpoint to divert to each deployment. Traffic values need
     * to sum to 100.
     *
     * @return the traffic value.
     */
    public Map<String, Integer> traffic() {
        return this.traffic;
    }

    /**
     * Set the traffic property: Percentage of traffic from endpoint to divert to each deployment. Traffic values need
     * to sum to 100.
     *
     * @param traffic the traffic value to set.
     * @return the PartialOnlineEndpoint object itself.
     */
    public PartialOnlineEndpoint withTraffic(Map<String, Integer> traffic) {
        this.traffic = traffic;
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
