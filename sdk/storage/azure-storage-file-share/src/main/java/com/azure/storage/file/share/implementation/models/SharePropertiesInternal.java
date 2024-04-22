// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.file.share.models.LeaseDurationType;
import com.azure.storage.file.share.models.LeaseStateType;
import com.azure.storage.file.share.models.LeaseStatusType;
import com.azure.storage.file.share.models.ShareRootSquash;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.Map;

/** Properties of a share. */
@JacksonXmlRootElement(localName = "SharePropertiesInternal")
@Fluent
public final class SharePropertiesInternal {
    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified", required = true)
    private DateTimeRfc1123 lastModified;

    /*
     * The Etag property.
     */
    @JsonProperty(value = "Etag", required = true)
    private String eTag;

    /*
     * The Quota property.
     */
    @JsonProperty(value = "Quota", required = true)
    private int quota;

    /*
     * The ProvisionedIops property.
     */
    @JsonProperty(value = "ProvisionedIops")
    private Integer provisionedIops;

    /*
     * The ProvisionedIngressMBps property.
     */
    @JsonProperty(value = "ProvisionedIngressMBps")
    private Integer provisionedIngressMBps;

    /*
     * The ProvisionedEgressMBps property.
     */
    @JsonProperty(value = "ProvisionedEgressMBps")
    private Integer provisionedEgressMBps;

    /*
     * The ProvisionedBandwidthMiBps property.
     */
    @JsonProperty(value = "ProvisionedBandwidthMiBps")
    private Integer provisionedBandwidthMiBps;

    /*
     * The NextAllowedQuotaDowngradeTime property.
     */
    @JsonProperty(value = "NextAllowedQuotaDowngradeTime")
    private DateTimeRfc1123 nextAllowedQuotaDowngradeTime;

    /*
     * The DeletedTime property.
     */
    @JsonProperty(value = "DeletedTime")
    private DateTimeRfc1123 deletedTime;

    /*
     * The RemainingRetentionDays property.
     */
    @JsonProperty(value = "RemainingRetentionDays")
    private Integer remainingRetentionDays;

    /*
     * The AccessTier property.
     */
    @JsonProperty(value = "AccessTier")
    private String accessTier;

    /*
     * The AccessTierChangeTime property.
     */
    @JsonProperty(value = "AccessTierChangeTime")
    private DateTimeRfc1123 accessTierChangeTime;

    /*
     * The AccessTierTransitionState property.
     */
    @JsonProperty(value = "AccessTierTransitionState")
    private String accessTierTransitionState;

    /*
     * The current lease status of the share.
     */
    @JsonProperty(value = "LeaseStatus")
    private LeaseStatusType leaseStatus;

    /*
     * Lease state of the share.
     */
    @JsonProperty(value = "LeaseState")
    private LeaseStateType leaseState;

    /*
     * When a share is leased, specifies whether the lease is of infinite or fixed duration.
     */
    @JsonProperty(value = "LeaseDuration")
    private LeaseDurationType leaseDuration;

    /*
     * The EnabledProtocols property.
     */
    @JsonProperty(value = "EnabledProtocols")
    private String enabledProtocols;

    /*
     * The RootSquash property.
     */
    @JsonProperty(value = "RootSquash")
    private ShareRootSquash rootSquash;

    /*
     * The EnableSnapshotVirtualDirectoryAccess property.
     */
    @JsonProperty(value = "EnableSnapshotVirtualDirectoryAccess")
    private Boolean enableSnapshotVirtualDirectoryAccess;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /** Creates an instance of SharePropertiesInternal class. */
    public SharePropertiesInternal() {}

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the eTag property: The Etag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The Etag property.
     *
     * @param eTag the eTag value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the quota property: The Quota property.
     *
     * @return the quota value.
     */
    public int getQuota() {
        return this.quota;
    }

    /**
     * Set the quota property: The Quota property.
     *
     * @param quota the quota value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setQuota(int quota) {
        this.quota = quota;
        return this;
    }

    /**
     * Get the provisionedIops property: The ProvisionedIops property.
     *
     * @return the provisionedIops value.
     */
    public Integer getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * Set the provisionedIops property: The ProvisionedIops property.
     *
     * @param provisionedIops the provisionedIops value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setProvisionedIops(Integer provisionedIops) {
        this.provisionedIops = provisionedIops;
        return this;
    }

    /**
     * Get the provisionedIngressMBps property: The ProvisionedIngressMBps property.
     *
     * @return the provisionedIngressMBps value.
     */
    public Integer getProvisionedIngressMBps() {
        return this.provisionedIngressMBps;
    }

    /**
     * Set the provisionedIngressMBps property: The ProvisionedIngressMBps property.
     *
     * @param provisionedIngressMBps the provisionedIngressMBps value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setProvisionedIngressMBps(Integer provisionedIngressMBps) {
        this.provisionedIngressMBps = provisionedIngressMBps;
        return this;
    }

    /**
     * Get the provisionedEgressMBps property: The ProvisionedEgressMBps property.
     *
     * @return the provisionedEgressMBps value.
     */
    public Integer getProvisionedEgressMBps() {
        return this.provisionedEgressMBps;
    }

    /**
     * Set the provisionedEgressMBps property: The ProvisionedEgressMBps property.
     *
     * @param provisionedEgressMBps the provisionedEgressMBps value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setProvisionedEgressMBps(Integer provisionedEgressMBps) {
        this.provisionedEgressMBps = provisionedEgressMBps;
        return this;
    }

    /**
     * Get the provisionedBandwidthMiBps property: The ProvisionedBandwidthMiBps property.
     *
     * @return the provisionedBandwidthMiBps value.
     */
    public Integer getProvisionedBandwidthMiBps() {
        return this.provisionedBandwidthMiBps;
    }

    /**
     * Set the provisionedBandwidthMiBps property: The ProvisionedBandwidthMiBps property.
     *
     * @param provisionedBandwidthMiBps the provisionedBandwidthMiBps value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setProvisionedBandwidthMiBps(Integer provisionedBandwidthMiBps) {
        this.provisionedBandwidthMiBps = provisionedBandwidthMiBps;
        return this;
    }

    /**
     * Get the nextAllowedQuotaDowngradeTime property: The NextAllowedQuotaDowngradeTime property.
     *
     * @return the nextAllowedQuotaDowngradeTime value.
     */
    public OffsetDateTime getNextAllowedQuotaDowngradeTime() {
        if (this.nextAllowedQuotaDowngradeTime == null) {
            return null;
        }
        return this.nextAllowedQuotaDowngradeTime.getDateTime();
    }

    /**
     * Set the nextAllowedQuotaDowngradeTime property: The NextAllowedQuotaDowngradeTime property.
     *
     * @param nextAllowedQuotaDowngradeTime the nextAllowedQuotaDowngradeTime value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setNextAllowedQuotaDowngradeTime(OffsetDateTime nextAllowedQuotaDowngradeTime) {
        if (nextAllowedQuotaDowngradeTime == null) {
            this.nextAllowedQuotaDowngradeTime = null;
        } else {
            this.nextAllowedQuotaDowngradeTime = new DateTimeRfc1123(nextAllowedQuotaDowngradeTime);
        }
        return this;
    }

    /**
     * Get the deletedTime property: The DeletedTime property.
     *
     * @return the deletedTime value.
     */
    public OffsetDateTime getDeletedTime() {
        if (this.deletedTime == null) {
            return null;
        }
        return this.deletedTime.getDateTime();
    }

    /**
     * Set the deletedTime property: The DeletedTime property.
     *
     * @param deletedTime the deletedTime value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setDeletedTime(OffsetDateTime deletedTime) {
        if (deletedTime == null) {
            this.deletedTime = null;
        } else {
            this.deletedTime = new DateTimeRfc1123(deletedTime);
        }
        return this;
    }

    /**
     * Get the remainingRetentionDays property: The RemainingRetentionDays property.
     *
     * @return the remainingRetentionDays value.
     */
    public Integer getRemainingRetentionDays() {
        return this.remainingRetentionDays;
    }

    /**
     * Set the remainingRetentionDays property: The RemainingRetentionDays property.
     *
     * @param remainingRetentionDays the remainingRetentionDays value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setRemainingRetentionDays(Integer remainingRetentionDays) {
        this.remainingRetentionDays = remainingRetentionDays;
        return this;
    }

    /**
     * Get the accessTier property: The AccessTier property.
     *
     * @return the accessTier value.
     */
    public String getAccessTier() {
        return this.accessTier;
    }

    /**
     * Set the accessTier property: The AccessTier property.
     *
     * @param accessTier the accessTier value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setAccessTier(String accessTier) {
        this.accessTier = accessTier;
        return this;
    }

    /**
     * Get the accessTierChangeTime property: The AccessTierChangeTime property.
     *
     * @return the accessTierChangeTime value.
     */
    public OffsetDateTime getAccessTierChangeTime() {
        if (this.accessTierChangeTime == null) {
            return null;
        }
        return this.accessTierChangeTime.getDateTime();
    }

    /**
     * Set the accessTierChangeTime property: The AccessTierChangeTime property.
     *
     * @param accessTierChangeTime the accessTierChangeTime value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setAccessTierChangeTime(OffsetDateTime accessTierChangeTime) {
        if (accessTierChangeTime == null) {
            this.accessTierChangeTime = null;
        } else {
            this.accessTierChangeTime = new DateTimeRfc1123(accessTierChangeTime);
        }
        return this;
    }

    /**
     * Get the accessTierTransitionState property: The AccessTierTransitionState property.
     *
     * @return the accessTierTransitionState value.
     */
    public String getAccessTierTransitionState() {
        return this.accessTierTransitionState;
    }

    /**
     * Set the accessTierTransitionState property: The AccessTierTransitionState property.
     *
     * @param accessTierTransitionState the accessTierTransitionState value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setAccessTierTransitionState(String accessTierTransitionState) {
        this.accessTierTransitionState = accessTierTransitionState;
        return this;
    }

    /**
     * Get the leaseStatus property: The current lease status of the share.
     *
     * @return the leaseStatus value.
     */
    public LeaseStatusType getLeaseStatus() {
        return this.leaseStatus;
    }

    /**
     * Set the leaseStatus property: The current lease status of the share.
     *
     * @param leaseStatus the leaseStatus value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setLeaseStatus(LeaseStatusType leaseStatus) {
        this.leaseStatus = leaseStatus;
        return this;
    }

    /**
     * Get the leaseState property: Lease state of the share.
     *
     * @return the leaseState value.
     */
    public LeaseStateType getLeaseState() {
        return this.leaseState;
    }

    /**
     * Set the leaseState property: Lease state of the share.
     *
     * @param leaseState the leaseState value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setLeaseState(LeaseStateType leaseState) {
        this.leaseState = leaseState;
        return this;
    }

    /**
     * Get the leaseDuration property: When a share is leased, specifies whether the lease is of infinite or fixed
     * duration.
     *
     * @return the leaseDuration value.
     */
    public LeaseDurationType getLeaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration property: When a share is leased, specifies whether the lease is of infinite or fixed
     * duration.
     *
     * @param leaseDuration the leaseDuration value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setLeaseDuration(LeaseDurationType leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get the enabledProtocols property: The EnabledProtocols property.
     *
     * @return the enabledProtocols value.
     */
    public String getEnabledProtocols() {
        return this.enabledProtocols;
    }

    /**
     * Set the enabledProtocols property: The EnabledProtocols property.
     *
     * @param enabledProtocols the enabledProtocols value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setEnabledProtocols(String enabledProtocols) {
        this.enabledProtocols = enabledProtocols;
        return this;
    }

    /**
     * Get the rootSquash property: The RootSquash property.
     *
     * @return the rootSquash value.
     */
    public ShareRootSquash getRootSquash() {
        return this.rootSquash;
    }

    /**
     * Set the rootSquash property: The RootSquash property.
     *
     * @param rootSquash the rootSquash value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setRootSquash(ShareRootSquash rootSquash) {
        this.rootSquash = rootSquash;
        return this;
    }

    /**
     * Get the enableSnapshotVirtualDirectoryAccess property: The EnableSnapshotVirtualDirectoryAccess property.
     *
     * @return the enableSnapshotVirtualDirectoryAccess value.
     */
    public Boolean isEnableSnapshotVirtualDirectoryAccess() {
        return this.enableSnapshotVirtualDirectoryAccess;
    }

    /**
     * Set the enableSnapshotVirtualDirectoryAccess property: The EnableSnapshotVirtualDirectoryAccess property.
     *
     * @param enableSnapshotVirtualDirectoryAccess the enableSnapshotVirtualDirectoryAccess value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setEnableSnapshotVirtualDirectoryAccess(
            Boolean enableSnapshotVirtualDirectoryAccess) {
        this.enableSnapshotVirtualDirectoryAccess = enableSnapshotVirtualDirectoryAccess;
        return this;
    }

    /**
     * Get the metadata property: Dictionary of &lt;string&gt;.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Dictionary of &lt;string&gt;.
     *
     * @param metadata the metadata value to set.
     * @return the SharePropertiesInternal object itself.
     */
    public SharePropertiesInternal setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}
