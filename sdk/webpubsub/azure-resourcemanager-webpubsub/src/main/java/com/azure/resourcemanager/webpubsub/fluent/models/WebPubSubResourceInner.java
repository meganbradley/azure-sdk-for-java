// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.webpubsub.models.LiveTraceConfiguration;
import com.azure.resourcemanager.webpubsub.models.ManagedIdentity;
import com.azure.resourcemanager.webpubsub.models.ProvisioningState;
import com.azure.resourcemanager.webpubsub.models.ResourceLogConfiguration;
import com.azure.resourcemanager.webpubsub.models.ResourceSku;
import com.azure.resourcemanager.webpubsub.models.ServiceKind;
import com.azure.resourcemanager.webpubsub.models.WebPubSubNetworkACLs;
import com.azure.resourcemanager.webpubsub.models.WebPubSubTlsSettings;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A class represent a resource. */
@Fluent
public final class WebPubSubResourceInner extends Resource {
    /*
     * The billing information of the resource.
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * A class that describes the properties of the resource
     */
    @JsonProperty(value = "properties")
    private WebPubSubProperties innerProperties;

    /*
     * The kind of the service
     */
    @JsonProperty(value = "kind")
    private ServiceKind kind;

    /*
     * A class represent managed identities used for request and response
     */
    @JsonProperty(value = "identity")
    private ManagedIdentity identity;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of WebPubSubResourceInner class. */
    public WebPubSubResourceInner() {
    }

    /**
     * Get the sku property: The billing information of the resource.
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The billing information of the resource.
     *
     * @param sku the sku value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the innerProperties property: A class that describes the properties of the resource.
     *
     * @return the innerProperties value.
     */
    private WebPubSubProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the kind property: The kind of the service.
     *
     * @return the kind value.
     */
    public ServiceKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: The kind of the service.
     *
     * @param kind the kind value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withKind(ServiceKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the identity property: A class represent managed identities used for request and response.
     *
     * @return the identity value.
     */
    public ManagedIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: A class represent managed identities used for request and response.
     *
     * @param identity the identity value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withIdentity(ManagedIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public WebPubSubResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public WebPubSubResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the externalIp property: The publicly accessible IP of the resource.
     *
     * @return the externalIp value.
     */
    public String externalIp() {
        return this.innerProperties() == null ? null : this.innerProperties().externalIp();
    }

    /**
     * Get the hostname property: FQDN of the service instance.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Get the publicPort property: The publicly accessible port of the resource which is designed for browser/client
     * side usage.
     *
     * @return the publicPort value.
     */
    public Integer publicPort() {
        return this.innerProperties() == null ? null : this.innerProperties().publicPort();
    }

    /**
     * Get the serverPort property: The publicly accessible port of the resource which is designed for customer server
     * side usage.
     *
     * @return the serverPort value.
     */
    public Integer serverPort() {
        return this.innerProperties() == null ? null : this.innerProperties().serverPort();
    }

    /**
     * Get the version property: Version of the resource. Probably you need the same or higher version of client SDKs.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections to the resource.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().privateEndpointConnections();
    }

    /**
     * Get the sharedPrivateLinkResources property: The list of shared private link resources.
     *
     * @return the sharedPrivateLinkResources value.
     */
    public List<SharedPrivateLinkResourceInner> sharedPrivateLinkResources() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedPrivateLinkResources();
    }

    /**
     * Get the tls property: TLS settings for the resource.
     *
     * @return the tls value.
     */
    public WebPubSubTlsSettings tls() {
        return this.innerProperties() == null ? null : this.innerProperties().tls();
    }

    /**
     * Set the tls property: TLS settings for the resource.
     *
     * @param tls the tls value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withTls(WebPubSubTlsSettings tls) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebPubSubProperties();
        }
        this.innerProperties().withTls(tls);
        return this;
    }

    /**
     * Get the hostnamePrefix property: Deprecated.
     *
     * @return the hostnamePrefix value.
     */
    public String hostnamePrefix() {
        return this.innerProperties() == null ? null : this.innerProperties().hostnamePrefix();
    }

    /**
     * Get the liveTraceConfiguration property: Live trace configuration of a Microsoft.SignalRService resource.
     *
     * @return the liveTraceConfiguration value.
     */
    public LiveTraceConfiguration liveTraceConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().liveTraceConfiguration();
    }

    /**
     * Set the liveTraceConfiguration property: Live trace configuration of a Microsoft.SignalRService resource.
     *
     * @param liveTraceConfiguration the liveTraceConfiguration value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withLiveTraceConfiguration(LiveTraceConfiguration liveTraceConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebPubSubProperties();
        }
        this.innerProperties().withLiveTraceConfiguration(liveTraceConfiguration);
        return this;
    }

    /**
     * Get the resourceLogConfiguration property: Resource log configuration of a Microsoft.SignalRService resource.
     *
     * @return the resourceLogConfiguration value.
     */
    public ResourceLogConfiguration resourceLogConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceLogConfiguration();
    }

    /**
     * Set the resourceLogConfiguration property: Resource log configuration of a Microsoft.SignalRService resource.
     *
     * @param resourceLogConfiguration the resourceLogConfiguration value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withResourceLogConfiguration(ResourceLogConfiguration resourceLogConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebPubSubProperties();
        }
        this.innerProperties().withResourceLogConfiguration(resourceLogConfiguration);
        return this;
    }

    /**
     * Get the networkACLs property: Network ACLs for the resource.
     *
     * @return the networkACLs value.
     */
    public WebPubSubNetworkACLs networkACLs() {
        return this.innerProperties() == null ? null : this.innerProperties().networkACLs();
    }

    /**
     * Set the networkACLs property: Network ACLs for the resource.
     *
     * @param networkACLs the networkACLs value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withNetworkACLs(WebPubSubNetworkACLs networkACLs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebPubSubProperties();
        }
        this.innerProperties().withNetworkACLs(networkACLs);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Enable or disable public network access. Default to "Enabled". When it's
     * Enabled, network ACLs still apply. When it's Disabled, public network access is always disabled no matter what
     * you set in network ACLs.
     *
     * @return the publicNetworkAccess value.
     */
    public String publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: Enable or disable public network access. Default to "Enabled". When it's
     * Enabled, network ACLs still apply. When it's Disabled, public network access is always disabled no matter what
     * you set in network ACLs.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withPublicNetworkAccess(String publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebPubSubProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the disableLocalAuth property: DisableLocalAuth Enable or disable local auth with AccessKey When set as true,
     * connection with AccessKey=xxx won't work.
     *
     * @return the disableLocalAuth value.
     */
    public Boolean disableLocalAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableLocalAuth();
    }

    /**
     * Set the disableLocalAuth property: DisableLocalAuth Enable or disable local auth with AccessKey When set as true,
     * connection with AccessKey=xxx won't work.
     *
     * @param disableLocalAuth the disableLocalAuth value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withDisableLocalAuth(Boolean disableLocalAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebPubSubProperties();
        }
        this.innerProperties().withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Get the disableAadAuth property: DisableLocalAuth Enable or disable aad auth When set as true, connection with
     * AuthType=aad won't work.
     *
     * @return the disableAadAuth value.
     */
    public Boolean disableAadAuth() {
        return this.innerProperties() == null ? null : this.innerProperties().disableAadAuth();
    }

    /**
     * Set the disableAadAuth property: DisableLocalAuth Enable or disable aad auth When set as true, connection with
     * AuthType=aad won't work.
     *
     * @param disableAadAuth the disableAadAuth value to set.
     * @return the WebPubSubResourceInner object itself.
     */
    public WebPubSubResourceInner withDisableAadAuth(Boolean disableAadAuth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new WebPubSubProperties();
        }
        this.innerProperties().withDisableAadAuth(disableAadAuth);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
