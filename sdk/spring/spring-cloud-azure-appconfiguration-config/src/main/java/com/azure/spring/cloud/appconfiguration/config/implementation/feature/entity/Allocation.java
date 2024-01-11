// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.appconfiguration.config.implementation.feature.entity;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Allocation {

    private String defaultWhenEnabled;

    private String defaultWhenDisabled;

    private Map<String, UserAllocation> users = new HashMap<>();

    private Map<String, GroupAllocation> groups = new HashMap<>();

    private Map<String, PercentileAllocation> percentile = new HashMap<>();

    private String seed;

    /**
     * @return the defaultWhenEnabled
     */
    public String getDefaultWhenEnabled() {
        return defaultWhenEnabled;
    }

    /**
     * @param defaultWhenEnabled the defaultWhenEnabled to set
     */
    public void setDefaultWhenEnabled(String defaultWhenEnabled) {
        this.defaultWhenEnabled = defaultWhenEnabled;
    }

    /**
     * @return the defaultWhenDisabled
     */
    public String getDefaultWhenDisabled() {
        return defaultWhenDisabled;
    }

    /**
     * @param defaultWhenDisabled the defaultWhenDisabled to set
     */
    public void setDefaultWhenDisabled(String defaultWhenDisabled) {
        this.defaultWhenDisabled = defaultWhenDisabled;
    }

    /**
     * @return the users
     */
    public Map<String, UserAllocation> getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(Map<String, UserAllocation> users) {
        this.users = users;
    }

    /**
     * @return the groups
     */
    public Map<String, GroupAllocation> getGroups() {
        return groups;
    }

    /**
     * @param groups the groups to set
     */
    public void setGroups(Map<String, GroupAllocation> groups) {
        this.groups = groups;
    }

    /**
     * @return the percentile
     */
    public Map<String, PercentileAllocation> getPercentile() {
        return percentile;
    }

    /**
     * @param percentile the percentile to set
     */
    public void setPercentile(Map<String, PercentileAllocation> percentile) {
        this.percentile = percentile;
    }

    /**
     * @return the seed
     */
    public String getSeed() {
        return seed;
    }

    /**
     * @param seed the seed to set
     */
    public void setSeed(String seed) {
        this.seed = seed;
    }

}
