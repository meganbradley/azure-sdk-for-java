// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.HeaderCollection;
import com.azure.core.http.HttpHeader;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.storage.file.share.models.LeaseDurationType;
import com.azure.storage.file.share.models.LeaseStateType;
import com.azure.storage.file.share.models.LeaseStatusType;
import com.azure.storage.file.share.models.ShareRootSquash;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** The SharesGetPropertiesHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class SharesGetPropertiesHeaders {
    /*
     * The x-ms-share-provisioned-iops property.
     */
    @JsonProperty(value = "x-ms-share-provisioned-iops")
    private Integer xMsShareProvisionedIops;

    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The x-ms-lease-status property.
     */
    @JsonProperty(value = "x-ms-lease-status")
    private LeaseStatusType xMsLeaseStatus;

    /*
     * The x-ms-lease-state property.
     */
    @JsonProperty(value = "x-ms-lease-state")
    private LeaseStateType xMsLeaseState;

    /*
     * The x-ms-root-squash property.
     */
    @JsonProperty(value = "x-ms-root-squash")
    private ShareRootSquash xMsRootSquash;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-access-tier-change-time property.
     */
    @JsonProperty(value = "x-ms-access-tier-change-time")
    private DateTimeRfc1123 xMsAccessTierChangeTime;

    /*
     * The x-ms-meta- property.
     */
    @HeaderCollection("x-ms-meta-")
    private Map<String, String> xMsMeta;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /*
     * The x-ms-share-provisioned-ingress-mbps property.
     */
    @JsonProperty(value = "x-ms-share-provisioned-ingress-mbps")
    private Integer xMsShareProvisionedIngressMbps;

    /*
     * The x-ms-share-provisioned-bandwidth-mibps property.
     */
    @JsonProperty(value = "x-ms-share-provisioned-bandwidth-mibps")
    private Integer xMsShareProvisionedBandwidthMibps;

    /*
     * The x-ms-share-quota property.
     */
    @JsonProperty(value = "x-ms-share-quota")
    private Integer xMsShareQuota;

    /*
     * The x-ms-access-tier property.
     */
    @JsonProperty(value = "x-ms-access-tier")
    private String xMsAccessTier;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-enabled-protocols property.
     */
    @JsonProperty(value = "x-ms-enabled-protocols")
    private String xMsEnabledProtocols;

    /*
     * The x-ms-lease-duration property.
     */
    @JsonProperty(value = "x-ms-lease-duration")
    private LeaseDurationType xMsLeaseDuration;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The x-ms-access-tier-transition-state property.
     */
    @JsonProperty(value = "x-ms-access-tier-transition-state")
    private String xMsAccessTierTransitionState;

    /*
     * The x-ms-share-provisioned-egress-mbps property.
     */
    @JsonProperty(value = "x-ms-share-provisioned-egress-mbps")
    private Integer xMsShareProvisionedEgressMbps;

    /*
     * The x-ms-share-next-allowed-quota-downgrade-time property.
     */
    @JsonProperty(value = "x-ms-share-next-allowed-quota-downgrade-time")
    private DateTimeRfc1123 xMsShareNextAllowedQuotaDowngradeTime;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of SharesGetPropertiesHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public SharesGetPropertiesHeaders(HttpHeaders rawHeaders) {
        if (rawHeaders.getValue("x-ms-share-provisioned-iops") != null) {
            this.xMsShareProvisionedIops = Integer.parseInt(rawHeaders.getValue("x-ms-share-provisioned-iops"));
        }
        this.xMsVersion = rawHeaders.getValue("x-ms-version");
        if (rawHeaders.getValue("x-ms-lease-status") != null) {
            this.xMsLeaseStatus = LeaseStatusType.fromString(rawHeaders.getValue("x-ms-lease-status"));
        }
        if (rawHeaders.getValue("x-ms-lease-state") != null) {
            this.xMsLeaseState = LeaseStateType.fromString(rawHeaders.getValue("x-ms-lease-state"));
        }
        if (rawHeaders.getValue("x-ms-root-squash") != null) {
            this.xMsRootSquash = ShareRootSquash.fromString(rawHeaders.getValue("x-ms-root-squash"));
        }
        if (rawHeaders.getValue("Last-Modified") != null) {
            this.lastModified = new DateTimeRfc1123(rawHeaders.getValue("Last-Modified"));
        }
        if (rawHeaders.getValue("x-ms-access-tier-change-time") != null) {
            this.xMsAccessTierChangeTime = new DateTimeRfc1123(rawHeaders.getValue("x-ms-access-tier-change-time"));
        }
        Map<String, String> xMsMetaHeaderCollection = new HashMap<>();

        for (HttpHeader header : rawHeaders) {
            if (!header.getName().startsWith("x-ms-meta-")) {
                continue;
            }
            xMsMetaHeaderCollection.put(header.getName().substring(10), header.getValue());
        }
        this.xMsMeta = xMsMetaHeaderCollection;
        if (rawHeaders.getValue("Date") != null) {
            this.dateProperty = new DateTimeRfc1123(rawHeaders.getValue("Date"));
        }
        if (rawHeaders.getValue("x-ms-share-provisioned-ingress-mbps") != null) {
            this.xMsShareProvisionedIngressMbps =
                    Integer.parseInt(rawHeaders.getValue("x-ms-share-provisioned-ingress-mbps"));
        }
        if (rawHeaders.getValue("x-ms-share-provisioned-bandwidth-mibps") != null) {
            this.xMsShareProvisionedBandwidthMibps =
                    Integer.parseInt(rawHeaders.getValue("x-ms-share-provisioned-bandwidth-mibps"));
        }
        if (rawHeaders.getValue("x-ms-share-quota") != null) {
            this.xMsShareQuota = Integer.parseInt(rawHeaders.getValue("x-ms-share-quota"));
        }
        this.xMsAccessTier = rawHeaders.getValue("x-ms-access-tier");
        this.eTag = rawHeaders.getValue("ETag");
        this.xMsEnabledProtocols = rawHeaders.getValue("x-ms-enabled-protocols");
        if (rawHeaders.getValue("x-ms-lease-duration") != null) {
            this.xMsLeaseDuration = LeaseDurationType.fromString(rawHeaders.getValue("x-ms-lease-duration"));
        }
        this.xMsRequestId = rawHeaders.getValue("x-ms-request-id");
        this.xMsAccessTierTransitionState = rawHeaders.getValue("x-ms-access-tier-transition-state");
        if (rawHeaders.getValue("x-ms-share-provisioned-egress-mbps") != null) {
            this.xMsShareProvisionedEgressMbps =
                    Integer.parseInt(rawHeaders.getValue("x-ms-share-provisioned-egress-mbps"));
        }
        if (rawHeaders.getValue("x-ms-share-next-allowed-quota-downgrade-time") != null) {
            this.xMsShareNextAllowedQuotaDowngradeTime =
                    new DateTimeRfc1123(rawHeaders.getValue("x-ms-share-next-allowed-quota-downgrade-time"));
        }
    }

    /**
     * Get the xMsShareProvisionedIops property: The x-ms-share-provisioned-iops property.
     *
     * @return the xMsShareProvisionedIops value.
     */
    public Integer getXMsShareProvisionedIops() {
        return this.xMsShareProvisionedIops;
    }

    /**
     * Set the xMsShareProvisionedIops property: The x-ms-share-provisioned-iops property.
     *
     * @param xMsShareProvisionedIops the xMsShareProvisionedIops value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareProvisionedIops(Integer xMsShareProvisionedIops) {
        this.xMsShareProvisionedIops = xMsShareProvisionedIops;
        return this;
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsLeaseStatus property: The x-ms-lease-status property.
     *
     * @return the xMsLeaseStatus value.
     */
    public LeaseStatusType getXMsLeaseStatus() {
        return this.xMsLeaseStatus;
    }

    /**
     * Set the xMsLeaseStatus property: The x-ms-lease-status property.
     *
     * @param xMsLeaseStatus the xMsLeaseStatus value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsLeaseStatus(LeaseStatusType xMsLeaseStatus) {
        this.xMsLeaseStatus = xMsLeaseStatus;
        return this;
    }

    /**
     * Get the xMsLeaseState property: The x-ms-lease-state property.
     *
     * @return the xMsLeaseState value.
     */
    public LeaseStateType getXMsLeaseState() {
        return this.xMsLeaseState;
    }

    /**
     * Set the xMsLeaseState property: The x-ms-lease-state property.
     *
     * @param xMsLeaseState the xMsLeaseState value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsLeaseState(LeaseStateType xMsLeaseState) {
        this.xMsLeaseState = xMsLeaseState;
        return this;
    }

    /**
     * Get the xMsRootSquash property: The x-ms-root-squash property.
     *
     * @return the xMsRootSquash value.
     */
    public ShareRootSquash getXMsRootSquash() {
        return this.xMsRootSquash;
    }

    /**
     * Set the xMsRootSquash property: The x-ms-root-squash property.
     *
     * @param xMsRootSquash the xMsRootSquash value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsRootSquash(ShareRootSquash xMsRootSquash) {
        this.xMsRootSquash = xMsRootSquash;
        return this;
    }

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
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsAccessTierChangeTime property: The x-ms-access-tier-change-time property.
     *
     * @return the xMsAccessTierChangeTime value.
     */
    public OffsetDateTime getXMsAccessTierChangeTime() {
        if (this.xMsAccessTierChangeTime == null) {
            return null;
        }
        return this.xMsAccessTierChangeTime.getDateTime();
    }

    /**
     * Set the xMsAccessTierChangeTime property: The x-ms-access-tier-change-time property.
     *
     * @param xMsAccessTierChangeTime the xMsAccessTierChangeTime value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsAccessTierChangeTime(OffsetDateTime xMsAccessTierChangeTime) {
        if (xMsAccessTierChangeTime == null) {
            this.xMsAccessTierChangeTime = null;
        } else {
            this.xMsAccessTierChangeTime = new DateTimeRfc1123(xMsAccessTierChangeTime);
        }
        return this;
    }

    /**
     * Get the xMsMeta property: The x-ms-meta- property.
     *
     * @return the xMsMeta value.
     */
    public Map<String, String> getXMsMeta() {
        return this.xMsMeta;
    }

    /**
     * Set the xMsMeta property: The x-ms-meta- property.
     *
     * @param xMsMeta the xMsMeta value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsMeta(Map<String, String> xMsMeta) {
        this.xMsMeta = xMsMeta;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the xMsShareProvisionedIngressMbps property: The x-ms-share-provisioned-ingress-mbps property.
     *
     * @return the xMsShareProvisionedIngressMbps value.
     */
    public Integer getXMsShareProvisionedIngressMbps() {
        return this.xMsShareProvisionedIngressMbps;
    }

    /**
     * Set the xMsShareProvisionedIngressMbps property: The x-ms-share-provisioned-ingress-mbps property.
     *
     * @param xMsShareProvisionedIngressMbps the xMsShareProvisionedIngressMbps value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareProvisionedIngressMbps(Integer xMsShareProvisionedIngressMbps) {
        this.xMsShareProvisionedIngressMbps = xMsShareProvisionedIngressMbps;
        return this;
    }

    /**
     * Get the xMsShareProvisionedBandwidthMibps property: The x-ms-share-provisioned-bandwidth-mibps property.
     *
     * @return the xMsShareProvisionedBandwidthMibps value.
     */
    public Integer getXMsShareProvisionedBandwidthMibps() {
        return this.xMsShareProvisionedBandwidthMibps;
    }

    /**
     * Set the xMsShareProvisionedBandwidthMibps property: The x-ms-share-provisioned-bandwidth-mibps property.
     *
     * @param xMsShareProvisionedBandwidthMibps the xMsShareProvisionedBandwidthMibps value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareProvisionedBandwidthMibps(Integer xMsShareProvisionedBandwidthMibps) {
        this.xMsShareProvisionedBandwidthMibps = xMsShareProvisionedBandwidthMibps;
        return this;
    }

    /**
     * Get the xMsShareQuota property: The x-ms-share-quota property.
     *
     * @return the xMsShareQuota value.
     */
    public Integer getXMsShareQuota() {
        return this.xMsShareQuota;
    }

    /**
     * Set the xMsShareQuota property: The x-ms-share-quota property.
     *
     * @param xMsShareQuota the xMsShareQuota value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareQuota(Integer xMsShareQuota) {
        this.xMsShareQuota = xMsShareQuota;
        return this;
    }

    /**
     * Get the xMsAccessTier property: The x-ms-access-tier property.
     *
     * @return the xMsAccessTier value.
     */
    public String getXMsAccessTier() {
        return this.xMsAccessTier;
    }

    /**
     * Set the xMsAccessTier property: The x-ms-access-tier property.
     *
     * @param xMsAccessTier the xMsAccessTier value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsAccessTier(String xMsAccessTier) {
        this.xMsAccessTier = xMsAccessTier;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsEnabledProtocols property: The x-ms-enabled-protocols property.
     *
     * @return the xMsEnabledProtocols value.
     */
    public String getXMsEnabledProtocols() {
        return this.xMsEnabledProtocols;
    }

    /**
     * Set the xMsEnabledProtocols property: The x-ms-enabled-protocols property.
     *
     * @param xMsEnabledProtocols the xMsEnabledProtocols value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsEnabledProtocols(String xMsEnabledProtocols) {
        this.xMsEnabledProtocols = xMsEnabledProtocols;
        return this;
    }

    /**
     * Get the xMsLeaseDuration property: The x-ms-lease-duration property.
     *
     * @return the xMsLeaseDuration value.
     */
    public LeaseDurationType getXMsLeaseDuration() {
        return this.xMsLeaseDuration;
    }

    /**
     * Set the xMsLeaseDuration property: The x-ms-lease-duration property.
     *
     * @param xMsLeaseDuration the xMsLeaseDuration value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsLeaseDuration(LeaseDurationType xMsLeaseDuration) {
        this.xMsLeaseDuration = xMsLeaseDuration;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsAccessTierTransitionState property: The x-ms-access-tier-transition-state property.
     *
     * @return the xMsAccessTierTransitionState value.
     */
    public String getXMsAccessTierTransitionState() {
        return this.xMsAccessTierTransitionState;
    }

    /**
     * Set the xMsAccessTierTransitionState property: The x-ms-access-tier-transition-state property.
     *
     * @param xMsAccessTierTransitionState the xMsAccessTierTransitionState value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsAccessTierTransitionState(String xMsAccessTierTransitionState) {
        this.xMsAccessTierTransitionState = xMsAccessTierTransitionState;
        return this;
    }

    /**
     * Get the xMsShareProvisionedEgressMbps property: The x-ms-share-provisioned-egress-mbps property.
     *
     * @return the xMsShareProvisionedEgressMbps value.
     */
    public Integer getXMsShareProvisionedEgressMbps() {
        return this.xMsShareProvisionedEgressMbps;
    }

    /**
     * Set the xMsShareProvisionedEgressMbps property: The x-ms-share-provisioned-egress-mbps property.
     *
     * @param xMsShareProvisionedEgressMbps the xMsShareProvisionedEgressMbps value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareProvisionedEgressMbps(Integer xMsShareProvisionedEgressMbps) {
        this.xMsShareProvisionedEgressMbps = xMsShareProvisionedEgressMbps;
        return this;
    }

    /**
     * Get the xMsShareNextAllowedQuotaDowngradeTime property: The x-ms-share-next-allowed-quota-downgrade-time
     * property.
     *
     * @return the xMsShareNextAllowedQuotaDowngradeTime value.
     */
    public OffsetDateTime getXMsShareNextAllowedQuotaDowngradeTime() {
        if (this.xMsShareNextAllowedQuotaDowngradeTime == null) {
            return null;
        }
        return this.xMsShareNextAllowedQuotaDowngradeTime.getDateTime();
    }

    /**
     * Set the xMsShareNextAllowedQuotaDowngradeTime property: The x-ms-share-next-allowed-quota-downgrade-time
     * property.
     *
     * @param xMsShareNextAllowedQuotaDowngradeTime the xMsShareNextAllowedQuotaDowngradeTime value to set.
     * @return the SharesGetPropertiesHeaders object itself.
     */
    public SharesGetPropertiesHeaders setXMsShareNextAllowedQuotaDowngradeTime(
            OffsetDateTime xMsShareNextAllowedQuotaDowngradeTime) {
        if (xMsShareNextAllowedQuotaDowngradeTime == null) {
            this.xMsShareNextAllowedQuotaDowngradeTime = null;
        } else {
            this.xMsShareNextAllowedQuotaDowngradeTime = new DateTimeRfc1123(xMsShareNextAllowedQuotaDowngradeTime);
        }
        return this;
    }
}
