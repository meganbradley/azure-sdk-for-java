// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.avs.fluent.models.PrivateCloudUpdateProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** An update to a private cloud resource. */
@Fluent
public final class PrivateCloudUpdate {
    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The updatable properties of a private cloud resource
     */
    @JsonProperty(value = "properties")
    private PrivateCloudUpdateProperties innerProperties;

    /*
     * The identity of the private cloud, if configured.
     */
    @JsonProperty(value = "identity")
    private PrivateCloudIdentity identity;

    /** Creates an instance of PrivateCloudUpdate class. */
    public PrivateCloudUpdate() {
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the innerProperties property: The updatable properties of a private cloud resource.
     *
     * @return the innerProperties value.
     */
    private PrivateCloudUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the identity property: The identity of the private cloud, if configured.
     *
     * @return the identity value.
     */
    public PrivateCloudIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the private cloud, if configured.
     *
     * @param identity the identity value to set.
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withIdentity(PrivateCloudIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the managementCluster property: The default cluster used for management.
     *
     * @return the managementCluster value.
     */
    public ManagementCluster managementCluster() {
        return this.innerProperties() == null ? null : this.innerProperties().managementCluster();
    }

    /**
     * Set the managementCluster property: The default cluster used for management.
     *
     * @param managementCluster the managementCluster value to set.
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withManagementCluster(ManagementCluster managementCluster) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudUpdateProperties();
        }
        this.innerProperties().withManagementCluster(managementCluster);
        return this;
    }

    /**
     * Get the internet property: Connectivity to internet is enabled or disabled.
     *
     * @return the internet value.
     */
    public InternetEnum internet() {
        return this.innerProperties() == null ? null : this.innerProperties().internet();
    }

    /**
     * Set the internet property: Connectivity to internet is enabled or disabled.
     *
     * @param internet the internet value to set.
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withInternet(InternetEnum internet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudUpdateProperties();
        }
        this.innerProperties().withInternet(internet);
        return this;
    }

    /**
     * Get the identitySources property: vCenter Single Sign On Identity Sources.
     *
     * @return the identitySources value.
     */
    public List<IdentitySource> identitySources() {
        return this.innerProperties() == null ? null : this.innerProperties().identitySources();
    }

    /**
     * Set the identitySources property: vCenter Single Sign On Identity Sources.
     *
     * @param identitySources the identitySources value to set.
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withIdentitySources(List<IdentitySource> identitySources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudUpdateProperties();
        }
        this.innerProperties().withIdentitySources(identitySources);
        return this;
    }

    /**
     * Get the availability property: Properties describing how the cloud is distributed across availability zones.
     *
     * @return the availability value.
     */
    public AvailabilityProperties availability() {
        return this.innerProperties() == null ? null : this.innerProperties().availability();
    }

    /**
     * Set the availability property: Properties describing how the cloud is distributed across availability zones.
     *
     * @param availability the availability value to set.
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withAvailability(AvailabilityProperties availability) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudUpdateProperties();
        }
        this.innerProperties().withAvailability(availability);
        return this;
    }

    /**
     * Get the encryption property: Customer managed key encryption, can be enabled or disabled.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Customer managed key encryption, can be enabled or disabled.
     *
     * @param encryption the encryption value to set.
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudUpdateProperties();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the extendedNetworkBlocks property: Array of additional networks noncontiguous with networkBlock. Networks
     * must be unique and non-overlapping across VNet in your subscription, on-premise, and this privateCloud
     * networkBlock attribute. Make sure the CIDR format conforms to (A.B.C.D/X).
     *
     * @return the extendedNetworkBlocks value.
     */
    public List<String> extendedNetworkBlocks() {
        return this.innerProperties() == null ? null : this.innerProperties().extendedNetworkBlocks();
    }

    /**
     * Set the extendedNetworkBlocks property: Array of additional networks noncontiguous with networkBlock. Networks
     * must be unique and non-overlapping across VNet in your subscription, on-premise, and this privateCloud
     * networkBlock attribute. Make sure the CIDR format conforms to (A.B.C.D/X).
     *
     * @param extendedNetworkBlocks the extendedNetworkBlocks value to set.
     * @return the PrivateCloudUpdate object itself.
     */
    public PrivateCloudUpdate withExtendedNetworkBlocks(List<String> extendedNetworkBlocks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateCloudUpdateProperties();
        }
        this.innerProperties().withExtendedNetworkBlocks(extendedNetworkBlocks);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
