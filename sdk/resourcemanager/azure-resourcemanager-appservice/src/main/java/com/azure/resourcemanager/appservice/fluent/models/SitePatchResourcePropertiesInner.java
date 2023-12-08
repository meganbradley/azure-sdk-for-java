// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.ClientCertMode;
import com.azure.resourcemanager.appservice.models.CloningInfo;
import com.azure.resourcemanager.appservice.models.HostingEnvironmentProfile;
import com.azure.resourcemanager.appservice.models.HostnameSslState;
import com.azure.resourcemanager.appservice.models.RedundancyMode;
import com.azure.resourcemanager.appservice.models.SiteAvailabilityState;
import com.azure.resourcemanager.appservice.models.SlotSwapStatus;
import com.azure.resourcemanager.appservice.models.UsageState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/**
 * SitePatchResource resource specific properties.
 */
@Fluent
public final class SitePatchResourcePropertiesInner {
    /*
     * Current state of the app.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * Hostnames associated with the app.
     */
    @JsonProperty(value = "hostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> hostNames;

    /*
     * Name of the repository site.
     */
    @JsonProperty(value = "repositorySiteName", access = JsonProperty.Access.WRITE_ONLY)
    private String repositorySiteName;

    /*
     * State indicating whether the app has exceeded its quota usage. Read-only.
     */
    @JsonProperty(value = "usageState", access = JsonProperty.Access.WRITE_ONLY)
    private UsageState usageState;

    /*
     * <code>true</code> if the app is enabled; otherwise, <code>false</code>. Setting this value to false disables the
     * app (takes the app offline).
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Enabled hostnames for the app.Hostnames need to be assigned (see HostNames) AND enabled. Otherwise,
     * the app is not served on those hostnames.
     */
    @JsonProperty(value = "enabledHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> enabledHostNames;

    /*
     * Management information availability state for the app.
     */
    @JsonProperty(value = "availabilityState", access = JsonProperty.Access.WRITE_ONLY)
    private SiteAvailabilityState availabilityState;

    /*
     * Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     */
    @JsonProperty(value = "hostNameSslStates")
    private List<HostnameSslState> hostnameSslStates;

    /*
     * Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     */
    @JsonProperty(value = "serverFarmId")
    private String serverFarmId;

    /*
     * <code>true</code> if reserved; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "reserved")
    private Boolean reserved;

    /*
     * Obsolete: Hyper-V sandbox.
     */
    @JsonProperty(value = "isXenon")
    private Boolean isXenon;

    /*
     * Hyper-V sandbox.
     */
    @JsonProperty(value = "hyperV")
    private Boolean hyperV;

    /*
     * Last time the app was modified, in UTC. Read-only.
     */
    @JsonProperty(value = "lastModifiedTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTimeUtc;

    /*
     * Configuration of the app.
     */
    @JsonProperty(value = "siteConfig")
    private SiteConfigInner siteConfig;

    /*
     * Azure Traffic Manager hostnames associated with the app. Read-only.
     */
    @JsonProperty(value = "trafficManagerHostNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> trafficManagerHostNames;

    /*
     * <code>true</code> to stop SCM (KUDU) site when the app is stopped; otherwise, <code>false</code>. The default is
     * <code>false</code>.
     */
    @JsonProperty(value = "scmSiteAlsoStopped")
    private Boolean scmSiteAlsoStopped;

    /*
     * Specifies which deployment slot this app will swap into. Read-only.
     */
    @JsonProperty(value = "targetSwapSlot", access = JsonProperty.Access.WRITE_ONLY)
    private String targetSwapSlot;

    /*
     * App Service Environment to use for the app.
     */
    @JsonProperty(value = "hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /*
     * <code>true</code> to enable client affinity; <code>false</code> to stop sending session affinity cookies, which
     * route client requests in the same session to the same instance. Default is <code>true</code>.
     */
    @JsonProperty(value = "clientAffinityEnabled")
    private Boolean clientAffinityEnabled;

    /*
     * <code>true</code> to enable client certificate authentication (TLS mutual authentication); otherwise,
     * <code>false</code>. Default is <code>false</code>.
     */
    @JsonProperty(value = "clientCertEnabled")
    private Boolean clientCertEnabled;

    /*
     * This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     */
    @JsonProperty(value = "clientCertMode")
    private ClientCertMode clientCertMode;

    /*
     * client certificate authentication comma-separated exclusion paths
     */
    @JsonProperty(value = "clientCertExclusionPaths")
    private String clientCertExclusionPaths;

    /*
     * <code>true</code> to disable the public hostnames of the app; otherwise, <code>false</code>.
     * If <code>true</code>, the app is only accessible via API management process.
     */
    @JsonProperty(value = "hostNamesDisabled")
    private Boolean hostNamesDisabled;

    /*
     * Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt
     * record for verification.
     */
    @JsonProperty(value = "customDomainVerificationId")
    private String customDomainVerificationId;

    /*
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from
     * tenants that site can be hosted with current settings. Read-only.
     */
    @JsonProperty(value = "outboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private String outboundIpAddresses;

    /*
     * List of IP addresses that the app uses for outbound connections (e.g. database access). Includes VIPs from all
     * tenants except dataComponent. Read-only.
     */
    @JsonProperty(value = "possibleOutboundIpAddresses", access = JsonProperty.Access.WRITE_ONLY)
    private String possibleOutboundIpAddresses;

    /*
     * Size of the function container.
     */
    @JsonProperty(value = "containerSize")
    private Integer containerSize;

    /*
     * Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     */
    @JsonProperty(value = "dailyMemoryTimeQuota")
    private Integer dailyMemoryTimeQuota;

    /*
     * App suspended till in case memory-time quota is exceeded.
     */
    @JsonProperty(value = "suspendedTill", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime suspendedTill;

    /*
     * Maximum number of workers.
     * This only applies to Functions container.
     */
    @JsonProperty(value = "maxNumberOfWorkers", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxNumberOfWorkers;

    /*
     * If specified during app creation, the app is cloned from a source app.
     */
    @JsonProperty(value = "cloningInfo")
    private CloningInfo cloningInfo;

    /*
     * Name of the resource group the app belongs to. Read-only.
     */
    @JsonProperty(value = "resourceGroup", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroup;

    /*
     * <code>true</code> if the app is a default container; otherwise, <code>false</code>.
     */
    @JsonProperty(value = "isDefaultContainer", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isDefaultContainer;

    /*
     * Default hostname of the app. Read-only.
     */
    @JsonProperty(value = "defaultHostName", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultHostname;

    /*
     * Status of the last deployment slot swap operation.
     */
    @JsonProperty(value = "slotSwapStatus", access = JsonProperty.Access.WRITE_ONLY)
    private SlotSwapStatus slotSwapStatus;

    /*
     * HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     */
    @JsonProperty(value = "httpsOnly")
    private Boolean httpsOnly;

    /*
     * Site redundancy mode
     */
    @JsonProperty(value = "redundancyMode")
    private RedundancyMode redundancyMode;

    /*
     * Specifies an operation id if this site has a pending operation.
     */
    @JsonProperty(value = "inProgressOperationId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID inProgressOperationId;

    /*
     * Checks if Customer provided storage account is required
     */
    @JsonProperty(value = "storageAccountRequired")
    private Boolean storageAccountRequired;

    /*
     * Identity to use for Key Vault Reference authentication.
     */
    @JsonProperty(value = "keyVaultReferenceIdentity")
    private String keyVaultReferenceIdentity;

    /*
     * Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form
     * /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/
     * {vnetName}/subnets/{subnetName}
     */
    @JsonProperty(value = "virtualNetworkSubnetId")
    private String virtualNetworkSubnetId;

    /**
     * Creates an instance of SitePatchResourcePropertiesInner class.
     */
    public SitePatchResourcePropertiesInner() {
    }

    /**
     * Get the state property: Current state of the app.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Get the hostNames property: Hostnames associated with the app.
     * 
     * @return the hostNames value.
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Get the repositorySiteName property: Name of the repository site.
     * 
     * @return the repositorySiteName value.
     */
    public String repositorySiteName() {
        return this.repositorySiteName;
    }

    /**
     * Get the usageState property: State indicating whether the app has exceeded its quota usage. Read-only.
     * 
     * @return the usageState value.
     */
    public UsageState usageState() {
        return this.usageState;
    }

    /**
     * Get the enabled property: &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: &lt;code&gt;true&lt;/code&gt; if the app is enabled; otherwise,
     * &lt;code&gt;false&lt;/code&gt;. Setting this value to false disables the app (takes the app offline).
     * 
     * @param enabled the enabled value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the enabledHostNames property: Enabled hostnames for the app.Hostnames need to be assigned (see HostNames)
     * AND enabled. Otherwise,
     * the app is not served on those hostnames.
     * 
     * @return the enabledHostNames value.
     */
    public List<String> enabledHostNames() {
        return this.enabledHostNames;
    }

    /**
     * Get the availabilityState property: Management information availability state for the app.
     * 
     * @return the availabilityState value.
     */
    public SiteAvailabilityState availabilityState() {
        return this.availabilityState;
    }

    /**
     * Get the hostnameSslStates property: Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     * 
     * @return the hostnameSslStates value.
     */
    public List<HostnameSslState> hostnameSslStates() {
        return this.hostnameSslStates;
    }

    /**
     * Set the hostnameSslStates property: Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     * 
     * @param hostnameSslStates the hostnameSslStates value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withHostnameSslStates(List<HostnameSslState> hostnameSslStates) {
        this.hostnameSslStates = hostnameSslStates;
        return this;
    }

    /**
     * Get the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     * @return the serverFarmId value.
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId property: Resource ID of the associated App Service plan, formatted as:
     * "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     * @param serverFarmId the serverFarmId value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get the reserved property: &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the reserved value.
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * Set the reserved property: &lt;code&gt;true&lt;/code&gt; if reserved; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param reserved the reserved value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * Get the isXenon property: Obsolete: Hyper-V sandbox.
     * 
     * @return the isXenon value.
     */
    public Boolean isXenon() {
        return this.isXenon;
    }

    /**
     * Set the isXenon property: Obsolete: Hyper-V sandbox.
     * 
     * @param isXenon the isXenon value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withIsXenon(Boolean isXenon) {
        this.isXenon = isXenon;
        return this;
    }

    /**
     * Get the hyperV property: Hyper-V sandbox.
     * 
     * @return the hyperV value.
     */
    public Boolean hyperV() {
        return this.hyperV;
    }

    /**
     * Set the hyperV property: Hyper-V sandbox.
     * 
     * @param hyperV the hyperV value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withHyperV(Boolean hyperV) {
        this.hyperV = hyperV;
        return this;
    }

    /**
     * Get the lastModifiedTimeUtc property: Last time the app was modified, in UTC. Read-only.
     * 
     * @return the lastModifiedTimeUtc value.
     */
    public OffsetDateTime lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }

    /**
     * Get the siteConfig property: Configuration of the app.
     * 
     * @return the siteConfig value.
     */
    public SiteConfigInner siteConfig() {
        return this.siteConfig;
    }

    /**
     * Set the siteConfig property: Configuration of the app.
     * 
     * @param siteConfig the siteConfig value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withSiteConfig(SiteConfigInner siteConfig) {
        this.siteConfig = siteConfig;
        return this;
    }

    /**
     * Get the trafficManagerHostNames property: Azure Traffic Manager hostnames associated with the app. Read-only.
     * 
     * @return the trafficManagerHostNames value.
     */
    public List<String> trafficManagerHostNames() {
        return this.trafficManagerHostNames;
    }

    /**
     * Get the scmSiteAlsoStopped property: &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is
     * stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the scmSiteAlsoStopped value.
     */
    public Boolean scmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped;
    }

    /**
     * Set the scmSiteAlsoStopped property: &lt;code&gt;true&lt;/code&gt; to stop SCM (KUDU) site when the app is
     * stopped; otherwise, &lt;code&gt;false&lt;/code&gt;. The default is &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param scmSiteAlsoStopped the scmSiteAlsoStopped value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        this.scmSiteAlsoStopped = scmSiteAlsoStopped;
        return this;
    }

    /**
     * Get the targetSwapSlot property: Specifies which deployment slot this app will swap into. Read-only.
     * 
     * @return the targetSwapSlot value.
     */
    public String targetSwapSlot() {
        return this.targetSwapSlot;
    }

    /**
     * Get the hostingEnvironmentProfile property: App Service Environment to use for the app.
     * 
     * @return the hostingEnvironmentProfile value.
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile property: App Service Environment to use for the app.
     * 
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner
        withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get the clientAffinityEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client affinity;
     * &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same
     * session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     * 
     * @return the clientAffinityEnabled value.
     */
    public Boolean clientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }

    /**
     * Set the clientAffinityEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client affinity;
     * &lt;code&gt;false&lt;/code&gt; to stop sending session affinity cookies, which route client requests in the same
     * session to the same instance. Default is &lt;code&gt;true&lt;/code&gt;.
     * 
     * @param clientAffinityEnabled the clientAffinityEnabled value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withClientAffinityEnabled(Boolean clientAffinityEnabled) {
        this.clientAffinityEnabled = clientAffinityEnabled;
        return this;
    }

    /**
     * Get the clientCertEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication
     * (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the clientCertEnabled value.
     */
    public Boolean clientCertEnabled() {
        return this.clientCertEnabled;
    }

    /**
     * Set the clientCertEnabled property: &lt;code&gt;true&lt;/code&gt; to enable client certificate authentication
     * (TLS mutual authentication); otherwise, &lt;code&gt;false&lt;/code&gt;. Default is
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @param clientCertEnabled the clientCertEnabled value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withClientCertEnabled(Boolean clientCertEnabled) {
        this.clientCertEnabled = clientCertEnabled;
        return this;
    }

    /**
     * Get the clientCertMode property: This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     * @return the clientCertMode value.
     */
    public ClientCertMode clientCertMode() {
        return this.clientCertMode;
    }

    /**
     * Set the clientCertMode property: This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     * @param clientCertMode the clientCertMode value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withClientCertMode(ClientCertMode clientCertMode) {
        this.clientCertMode = clientCertMode;
        return this;
    }

    /**
     * Get the clientCertExclusionPaths property: client certificate authentication comma-separated exclusion paths.
     * 
     * @return the clientCertExclusionPaths value.
     */
    public String clientCertExclusionPaths() {
        return this.clientCertExclusionPaths;
    }

    /**
     * Set the clientCertExclusionPaths property: client certificate authentication comma-separated exclusion paths.
     * 
     * @param clientCertExclusionPaths the clientCertExclusionPaths value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withClientCertExclusionPaths(String clientCertExclusionPaths) {
        this.clientCertExclusionPaths = clientCertExclusionPaths;
        return this;
    }

    /**
     * Get the hostNamesDisabled property: &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
     * 
     * @return the hostNamesDisabled value.
     */
    public Boolean hostNamesDisabled() {
        return this.hostNamesDisabled;
    }

    /**
     * Set the hostNamesDisabled property: &lt;code&gt;true&lt;/code&gt; to disable the public hostnames of the app;
     * otherwise, &lt;code&gt;false&lt;/code&gt;.
     * If &lt;code&gt;true&lt;/code&gt;, the app is only accessible via API management process.
     * 
     * @param hostNamesDisabled the hostNamesDisabled value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withHostNamesDisabled(Boolean hostNamesDisabled) {
        this.hostNamesDisabled = hostNamesDisabled;
        return this;
    }

    /**
     * Get the customDomainVerificationId property: Unique identifier that verifies the custom domains assigned to the
     * app. Customer will add this id to a txt record for verification.
     * 
     * @return the customDomainVerificationId value.
     */
    public String customDomainVerificationId() {
        return this.customDomainVerificationId;
    }

    /**
     * Set the customDomainVerificationId property: Unique identifier that verifies the custom domains assigned to the
     * app. Customer will add this id to a txt record for verification.
     * 
     * @param customDomainVerificationId the customDomainVerificationId value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withCustomDomainVerificationId(String customDomainVerificationId) {
        this.customDomainVerificationId = customDomainVerificationId;
        return this;
    }

    /**
     * Get the outboundIpAddresses property: List of IP addresses that the app uses for outbound connections (e.g.
     * database access). Includes VIPs from tenants that site can be hosted with current settings. Read-only.
     * 
     * @return the outboundIpAddresses value.
     */
    public String outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Get the possibleOutboundIpAddresses property: List of IP addresses that the app uses for outbound connections
     * (e.g. database access). Includes VIPs from all tenants except dataComponent. Read-only.
     * 
     * @return the possibleOutboundIpAddresses value.
     */
    public String possibleOutboundIpAddresses() {
        return this.possibleOutboundIpAddresses;
    }

    /**
     * Get the containerSize property: Size of the function container.
     * 
     * @return the containerSize value.
     */
    public Integer containerSize() {
        return this.containerSize;
    }

    /**
     * Set the containerSize property: Size of the function container.
     * 
     * @param containerSize the containerSize value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
        return this;
    }

    /**
     * Get the dailyMemoryTimeQuota property: Maximum allowed daily memory-time quota (applicable on dynamic apps
     * only).
     * 
     * @return the dailyMemoryTimeQuota value.
     */
    public Integer dailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota;
    }

    /**
     * Set the dailyMemoryTimeQuota property: Maximum allowed daily memory-time quota (applicable on dynamic apps
     * only).
     * 
     * @param dailyMemoryTimeQuota the dailyMemoryTimeQuota value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
        this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
        return this;
    }

    /**
     * Get the suspendedTill property: App suspended till in case memory-time quota is exceeded.
     * 
     * @return the suspendedTill value.
     */
    public OffsetDateTime suspendedTill() {
        return this.suspendedTill;
    }

    /**
     * Get the maxNumberOfWorkers property: Maximum number of workers.
     * This only applies to Functions container.
     * 
     * @return the maxNumberOfWorkers value.
     */
    public Integer maxNumberOfWorkers() {
        return this.maxNumberOfWorkers;
    }

    /**
     * Get the cloningInfo property: If specified during app creation, the app is cloned from a source app.
     * 
     * @return the cloningInfo value.
     */
    public CloningInfo cloningInfo() {
        return this.cloningInfo;
    }

    /**
     * Set the cloningInfo property: If specified during app creation, the app is cloned from a source app.
     * 
     * @param cloningInfo the cloningInfo value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withCloningInfo(CloningInfo cloningInfo) {
        this.cloningInfo = cloningInfo;
        return this;
    }

    /**
     * Get the resourceGroup property: Name of the resource group the app belongs to. Read-only.
     * 
     * @return the resourceGroup value.
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Get the isDefaultContainer property: &lt;code&gt;true&lt;/code&gt; if the app is a default container; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     * 
     * @return the isDefaultContainer value.
     */
    public Boolean isDefaultContainer() {
        return this.isDefaultContainer;
    }

    /**
     * Get the defaultHostname property: Default hostname of the app. Read-only.
     * 
     * @return the defaultHostname value.
     */
    public String defaultHostname() {
        return this.defaultHostname;
    }

    /**
     * Get the slotSwapStatus property: Status of the last deployment slot swap operation.
     * 
     * @return the slotSwapStatus value.
     */
    public SlotSwapStatus slotSwapStatus() {
        return this.slotSwapStatus;
    }

    /**
     * Get the httpsOnly property: HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests.
     * 
     * @return the httpsOnly value.
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }

    /**
     * Set the httpsOnly property: HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests.
     * 
     * @param httpsOnly the httpsOnly value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withHttpsOnly(Boolean httpsOnly) {
        this.httpsOnly = httpsOnly;
        return this;
    }

    /**
     * Get the redundancyMode property: Site redundancy mode.
     * 
     * @return the redundancyMode value.
     */
    public RedundancyMode redundancyMode() {
        return this.redundancyMode;
    }

    /**
     * Set the redundancyMode property: Site redundancy mode.
     * 
     * @param redundancyMode the redundancyMode value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withRedundancyMode(RedundancyMode redundancyMode) {
        this.redundancyMode = redundancyMode;
        return this;
    }

    /**
     * Get the inProgressOperationId property: Specifies an operation id if this site has a pending operation.
     * 
     * @return the inProgressOperationId value.
     */
    public UUID inProgressOperationId() {
        return this.inProgressOperationId;
    }

    /**
     * Get the storageAccountRequired property: Checks if Customer provided storage account is required.
     * 
     * @return the storageAccountRequired value.
     */
    public Boolean storageAccountRequired() {
        return this.storageAccountRequired;
    }

    /**
     * Set the storageAccountRequired property: Checks if Customer provided storage account is required.
     * 
     * @param storageAccountRequired the storageAccountRequired value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withStorageAccountRequired(Boolean storageAccountRequired) {
        this.storageAccountRequired = storageAccountRequired;
        return this;
    }

    /**
     * Get the keyVaultReferenceIdentity property: Identity to use for Key Vault Reference authentication.
     * 
     * @return the keyVaultReferenceIdentity value.
     */
    public String keyVaultReferenceIdentity() {
        return this.keyVaultReferenceIdentity;
    }

    /**
     * Set the keyVaultReferenceIdentity property: Identity to use for Key Vault Reference authentication.
     * 
     * @param keyVaultReferenceIdentity the keyVaultReferenceIdentity value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withKeyVaultReferenceIdentity(String keyVaultReferenceIdentity) {
        this.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
        return this;
    }

    /**
     * Get the virtualNetworkSubnetId property: Azure Resource Manager ID of the Virtual network and subnet to be
     * joined by Regional VNET Integration.
     * This must be of the form
     * /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     * @return the virtualNetworkSubnetId value.
     */
    public String virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId;
    }

    /**
     * Set the virtualNetworkSubnetId property: Azure Resource Manager ID of the Virtual network and subnet to be
     * joined by Regional VNET Integration.
     * This must be of the form
     * /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}.
     * 
     * @param virtualNetworkSubnetId the virtualNetworkSubnetId value to set.
     * @return the SitePatchResourcePropertiesInner object itself.
     */
    public SitePatchResourcePropertiesInner withVirtualNetworkSubnetId(String virtualNetworkSubnetId) {
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (hostnameSslStates() != null) {
            hostnameSslStates().forEach(e -> e.validate());
        }
        if (siteConfig() != null) {
            siteConfig().validate();
        }
        if (hostingEnvironmentProfile() != null) {
            hostingEnvironmentProfile().validate();
        }
        if (cloningInfo() != null) {
            cloningInfo().validate();
        }
        if (slotSwapStatus() != null) {
            slotSwapStatus().validate();
        }
    }
}
