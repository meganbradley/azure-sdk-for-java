// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Cache network settings.
 */
@Fluent
public final class CacheNetworkSettings {
    /*
     * The IPv4 maximum transmission unit configured for the subnet.
     */
    @JsonProperty(value = "mtu")
    private Integer mtu;

    /*
     * Array of additional IP addresses used by this cache.
     */
    @JsonProperty(value = "utilityAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> utilityAddresses;

    /*
     * DNS servers for the cache to use. It will be set from the network configuration if no value is provided.
     */
    @JsonProperty(value = "dnsServers")
    private List<String> dnsServers;

    /*
     * DNS search domain
     */
    @JsonProperty(value = "dnsSearchDomain")
    private String dnsSearchDomain;

    /*
     * NTP server IP Address or FQDN for the cache to use. The default is time.windows.com.
     */
    @JsonProperty(value = "ntpServer")
    private String ntpServer;

    /**
     * Creates an instance of CacheNetworkSettings class.
     */
    public CacheNetworkSettings() {
    }

    /**
     * Get the mtu property: The IPv4 maximum transmission unit configured for the subnet.
     * 
     * @return the mtu value.
     */
    public Integer mtu() {
        return this.mtu;
    }

    /**
     * Set the mtu property: The IPv4 maximum transmission unit configured for the subnet.
     * 
     * @param mtu the mtu value to set.
     * @return the CacheNetworkSettings object itself.
     */
    public CacheNetworkSettings withMtu(Integer mtu) {
        this.mtu = mtu;
        return this;
    }

    /**
     * Get the utilityAddresses property: Array of additional IP addresses used by this cache.
     * 
     * @return the utilityAddresses value.
     */
    public List<String> utilityAddresses() {
        return this.utilityAddresses;
    }

    /**
     * Get the dnsServers property: DNS servers for the cache to use. It will be set from the network configuration if
     * no value is provided.
     * 
     * @return the dnsServers value.
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }

    /**
     * Set the dnsServers property: DNS servers for the cache to use. It will be set from the network configuration if
     * no value is provided.
     * 
     * @param dnsServers the dnsServers value to set.
     * @return the CacheNetworkSettings object itself.
     */
    public CacheNetworkSettings withDnsServers(List<String> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * Get the dnsSearchDomain property: DNS search domain.
     * 
     * @return the dnsSearchDomain value.
     */
    public String dnsSearchDomain() {
        return this.dnsSearchDomain;
    }

    /**
     * Set the dnsSearchDomain property: DNS search domain.
     * 
     * @param dnsSearchDomain the dnsSearchDomain value to set.
     * @return the CacheNetworkSettings object itself.
     */
    public CacheNetworkSettings withDnsSearchDomain(String dnsSearchDomain) {
        this.dnsSearchDomain = dnsSearchDomain;
        return this;
    }

    /**
     * Get the ntpServer property: NTP server IP Address or FQDN for the cache to use. The default is time.windows.com.
     * 
     * @return the ntpServer value.
     */
    public String ntpServer() {
        return this.ntpServer;
    }

    /**
     * Set the ntpServer property: NTP server IP Address or FQDN for the cache to use. The default is time.windows.com.
     * 
     * @param ntpServer the ntpServer value to set.
     * @return the CacheNetworkSettings object itself.
     */
    public CacheNetworkSettings withNtpServer(String ntpServer) {
        this.ntpServer = ntpServer;
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
