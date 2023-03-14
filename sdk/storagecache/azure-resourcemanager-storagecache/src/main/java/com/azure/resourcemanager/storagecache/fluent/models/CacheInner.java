// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.storagecache.models.CacheDirectorySettings;
import com.azure.resourcemanager.storagecache.models.CacheEncryptionSettings;
import com.azure.resourcemanager.storagecache.models.CacheHealth;
import com.azure.resourcemanager.storagecache.models.CacheIdentity;
import com.azure.resourcemanager.storagecache.models.CacheNetworkSettings;
import com.azure.resourcemanager.storagecache.models.CacheSecuritySettings;
import com.azure.resourcemanager.storagecache.models.CacheSku;
import com.azure.resourcemanager.storagecache.models.CacheUpgradeSettings;
import com.azure.resourcemanager.storagecache.models.CacheUpgradeStatus;
import com.azure.resourcemanager.storagecache.models.PrimingJob;
import com.azure.resourcemanager.storagecache.models.ProvisioningStateType;
import com.azure.resourcemanager.storagecache.models.StorageTargetSpaceAllocation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * A cache instance. Follows Azure Resource Manager standards:
 * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/resource-api-reference.md.
 */
@Fluent
public final class CacheInner extends Resource {
    /*
     * The identity of the cache, if configured.
     */
    @JsonProperty(value = "identity")
    private CacheIdentity identity;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * Properties of the cache.
     */
    @JsonProperty(value = "properties")
    private CacheProperties innerProperties;

    /*
     * SKU for the cache.
     */
    @JsonProperty(value = "sku")
    private CacheSku sku;

    /** Creates an instance of CacheInner class. */
    public CacheInner() {
    }

    /**
     * Get the identity property: The identity of the cache, if configured.
     *
     * @return the identity value.
     */
    public CacheIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the cache, if configured.
     *
     * @param identity the identity value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withIdentity(CacheIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the innerProperties property: Properties of the cache.
     *
     * @return the innerProperties value.
     */
    private CacheProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: SKU for the cache.
     *
     * @return the sku value.
     */
    public CacheSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU for the cache.
     *
     * @param sku the sku value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withSku(CacheSku sku) {
        this.sku = sku;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CacheInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CacheInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the cacheSizeGB property: The size of this cache, in GB, when scalingFactor is 1.0. Values depend on the
     * cache SKU - &lt;a href="https://learn.microsoft.com/en-us/rest/api/storagecache/skus/list?tabs=HTTP"&gt;List
     * SKUs&lt;/a&gt;.
     *
     * @return the cacheSizeGB value.
     */
    public Integer cacheSizeGB() {
        return this.innerProperties() == null ? null : this.innerProperties().cacheSizeGB();
    }

    /**
     * Set the cacheSizeGB property: The size of this cache, in GB, when scalingFactor is 1.0. Values depend on the
     * cache SKU - &lt;a href="https://learn.microsoft.com/en-us/rest/api/storagecache/skus/list?tabs=HTTP"&gt;List
     * SKUs&lt;/a&gt;.
     *
     * @param cacheSizeGB the cacheSizeGB value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withCacheSizeGB(Integer cacheSizeGB) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheProperties();
        }
        this.innerProperties().withCacheSizeGB(cacheSizeGB);
        return this;
    }

    /**
     * Get the scalingFactor property: Multiplier that sets the current storage and throughput capacity of the cache.
     * Values depend on the cache SKU - &lt;a
     * href="https://learn.microsoft.com/en-us/rest/api/storagecache/skus/list?tabs=HTTP"&gt;List SKUs&lt;/a&gt;. Values
     * above 1.0 increase the cache size and throughput - for example, the scaling factor 1.33 gives a cache that's 33%
     * larger than its base size.
     *
     * @return the scalingFactor value.
     */
    public Double scalingFactor() {
        return this.innerProperties() == null ? null : this.innerProperties().scalingFactor();
    }

    /**
     * Set the scalingFactor property: Multiplier that sets the current storage and throughput capacity of the cache.
     * Values depend on the cache SKU - &lt;a
     * href="https://learn.microsoft.com/en-us/rest/api/storagecache/skus/list?tabs=HTTP"&gt;List SKUs&lt;/a&gt;. Values
     * above 1.0 increase the cache size and throughput - for example, the scaling factor 1.33 gives a cache that's 33%
     * larger than its base size.
     *
     * @param scalingFactor the scalingFactor value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withScalingFactor(Double scalingFactor) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheProperties();
        }
        this.innerProperties().withScalingFactor(scalingFactor);
        return this;
    }

    /**
     * Get the health property: Health of the cache.
     *
     * @return the health value.
     */
    public CacheHealth health() {
        return this.innerProperties() == null ? null : this.innerProperties().health();
    }

    /**
     * Get the mountAddresses property: Array of IPv4 addresses that can be used by clients mounting this cache.
     *
     * @return the mountAddresses value.
     */
    public List<String> mountAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().mountAddresses();
    }

    /**
     * Get the provisioningState property: ARM provisioning state, see
     * https://github.com/Azure/azure-resource-manager-rpc/blob/master/v1.0/Addendum.md#provisioningstate-property.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStateType provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the subnet property: Subnet used for the cache.
     *
     * @return the subnet value.
     */
    public String subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: Subnet used for the cache.
     *
     * @param subnet the subnet value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withSubnet(String subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheProperties();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the upgradeStatus property: Upgrade status of the cache.
     *
     * @return the upgradeStatus value.
     */
    public CacheUpgradeStatus upgradeStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradeStatus();
    }

    /**
     * Get the upgradeSettings property: Upgrade settings of the cache.
     *
     * @return the upgradeSettings value.
     */
    public CacheUpgradeSettings upgradeSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().upgradeSettings();
    }

    /**
     * Set the upgradeSettings property: Upgrade settings of the cache.
     *
     * @param upgradeSettings the upgradeSettings value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withUpgradeSettings(CacheUpgradeSettings upgradeSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheProperties();
        }
        this.innerProperties().withUpgradeSettings(upgradeSettings);
        return this;
    }

    /**
     * Get the networkSettings property: Specifies network settings of the cache.
     *
     * @return the networkSettings value.
     */
    public CacheNetworkSettings networkSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSettings();
    }

    /**
     * Set the networkSettings property: Specifies network settings of the cache.
     *
     * @param networkSettings the networkSettings value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withNetworkSettings(CacheNetworkSettings networkSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheProperties();
        }
        this.innerProperties().withNetworkSettings(networkSettings);
        return this;
    }

    /**
     * Get the encryptionSettings property: Specifies encryption settings of the cache.
     *
     * @return the encryptionSettings value.
     */
    public CacheEncryptionSettings encryptionSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionSettings();
    }

    /**
     * Set the encryptionSettings property: Specifies encryption settings of the cache.
     *
     * @param encryptionSettings the encryptionSettings value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withEncryptionSettings(CacheEncryptionSettings encryptionSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheProperties();
        }
        this.innerProperties().withEncryptionSettings(encryptionSettings);
        return this;
    }

    /**
     * Get the securitySettings property: Specifies security settings of the cache.
     *
     * @return the securitySettings value.
     */
    public CacheSecuritySettings securitySettings() {
        return this.innerProperties() == null ? null : this.innerProperties().securitySettings();
    }

    /**
     * Set the securitySettings property: Specifies security settings of the cache.
     *
     * @param securitySettings the securitySettings value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withSecuritySettings(CacheSecuritySettings securitySettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheProperties();
        }
        this.innerProperties().withSecuritySettings(securitySettings);
        return this;
    }

    /**
     * Get the directoryServicesSettings property: Specifies Directory Services settings of the cache.
     *
     * @return the directoryServicesSettings value.
     */
    public CacheDirectorySettings directoryServicesSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().directoryServicesSettings();
    }

    /**
     * Set the directoryServicesSettings property: Specifies Directory Services settings of the cache.
     *
     * @param directoryServicesSettings the directoryServicesSettings value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withDirectoryServicesSettings(CacheDirectorySettings directoryServicesSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheProperties();
        }
        this.innerProperties().withDirectoryServicesSettings(directoryServicesSettings);
        return this;
    }

    /**
     * Get the zones property: Availability zones for resources. This field should only contain a single element in the
     * array.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.innerProperties() == null ? null : this.innerProperties().zones();
    }

    /**
     * Set the zones property: Availability zones for resources. This field should only contain a single element in the
     * array.
     *
     * @param zones the zones value to set.
     * @return the CacheInner object itself.
     */
    public CacheInner withZones(List<String> zones) {
        if (this.innerProperties() == null) {
            this.innerProperties = new CacheProperties();
        }
        this.innerProperties().withZones(zones);
        return this;
    }

    /**
     * Get the primingJobs property: Specifies the priming jobs defined in the cache.
     *
     * @return the primingJobs value.
     */
    public List<PrimingJob> primingJobs() {
        return this.innerProperties() == null ? null : this.innerProperties().primingJobs();
    }

    /**
     * Get the spaceAllocation property: Specifies the space allocation percentage for each storage target in the cache.
     *
     * @return the spaceAllocation value.
     */
    public List<StorageTargetSpaceAllocation> spaceAllocation() {
        return this.innerProperties() == null ? null : this.innerProperties().spaceAllocation();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }
}
