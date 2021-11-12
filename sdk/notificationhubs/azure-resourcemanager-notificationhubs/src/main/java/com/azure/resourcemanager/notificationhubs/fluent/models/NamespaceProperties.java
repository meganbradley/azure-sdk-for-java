// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.notificationhubs.models.NamespaceType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Namespace properties. */
@Fluent
public final class NamespaceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NamespaceProperties.class);

    /*
     * The name of the namespace.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Provisioning state of the Namespace.
     */
    @JsonProperty(value = "provisioningState")
    private String provisioningState;

    /*
     * Specifies the targeted region in which the namespace should be created.
     * It can be any of the following values: Australia East, Australia
     * Southeast, Central US, East US, East US 2, West US, North Central US,
     * South Central US, East Asia, Southeast Asia, Brazil South, Japan East,
     * Japan West, North Europe, West Europe
     */
    @JsonProperty(value = "region")
    private String region;

    /*
     * Identifier for Azure Insights metrics
     */
    @JsonProperty(value = "metricId", access = JsonProperty.Access.WRITE_ONLY)
    private String metricId;

    /*
     * Status of the namespace. It can be any of these values:1 =
     * Created/Active2 = Creating3 = Suspended4 = Deleting
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The time the namespace was created.
     */
    @JsonProperty(value = "createdAt")
    private OffsetDateTime createdAt;

    /*
     * The time the namespace was updated.
     */
    @JsonProperty(value = "updatedAt")
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform NotificationHub operations.
     */
    @JsonProperty(value = "serviceBusEndpoint")
    private String serviceBusEndpoint;

    /*
     * The Id of the Azure subscription associated with the namespace.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * ScaleUnit where the namespace gets created
     */
    @JsonProperty(value = "scaleUnit")
    private String scaleUnit;

    /*
     * Whether or not the namespace is currently enabled.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Whether or not the namespace is set as Critical.
     */
    @JsonProperty(value = "critical")
    private Boolean critical;

    /*
     * Data center for the namespace
     */
    @JsonProperty(value = "dataCenter")
    private String dataCenter;

    /*
     * The namespace type.
     */
    @JsonProperty(value = "namespaceType")
    private NamespaceType namespaceType;

    /**
     * Get the name property: The name of the namespace.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the namespace.
     *
     * @param name the name value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Namespace.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the Namespace.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the region property: Specifies the targeted region in which the namespace should be created. It can be any of
     * the following values: Australia East, Australia Southeast, Central US, East US, East US 2, West US, North Central
     * US, South Central US, East Asia, Southeast Asia, Brazil South, Japan East, Japan West, North Europe, West Europe.
     *
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Specifies the targeted region in which the namespace should be created. It can be any of
     * the following values: Australia East, Australia Southeast, Central US, East US, East US 2, West US, North Central
     * US, South Central US, East Asia, Southeast Asia, Brazil South, Japan East, Japan West, North Europe, West Europe.
     *
     * @param region the region value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     *
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get the status property: Status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 =
     * Suspended4 = Deleting.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status of the namespace. It can be any of these values:1 = Created/Active2 = Creating3 =
     * Suspended4 = Deleting.
     *
     * @param status the status value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The time the namespace was created.
     *
     * @param createdAt the createdAt value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     *
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Set the updatedAt property: The time the namespace was updated.
     *
     * @param updatedAt the updatedAt value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform NotificationHub operations.
     *
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Set the serviceBusEndpoint property: Endpoint you can use to perform NotificationHub operations.
     *
     * @param serviceBusEndpoint the serviceBusEndpoint value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withServiceBusEndpoint(String serviceBusEndpoint) {
        this.serviceBusEndpoint = serviceBusEndpoint;
        return this;
    }

    /**
     * Get the subscriptionId property: The Id of the Azure subscription associated with the namespace.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The Id of the Azure subscription associated with the namespace.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the scaleUnit property: ScaleUnit where the namespace gets created.
     *
     * @return the scaleUnit value.
     */
    public String scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Set the scaleUnit property: ScaleUnit where the namespace gets created.
     *
     * @param scaleUnit the scaleUnit value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withScaleUnit(String scaleUnit) {
        this.scaleUnit = scaleUnit;
        return this;
    }

    /**
     * Get the enabled property: Whether or not the namespace is currently enabled.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether or not the namespace is currently enabled.
     *
     * @param enabled the enabled value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the critical property: Whether or not the namespace is set as Critical.
     *
     * @return the critical value.
     */
    public Boolean critical() {
        return this.critical;
    }

    /**
     * Set the critical property: Whether or not the namespace is set as Critical.
     *
     * @param critical the critical value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withCritical(Boolean critical) {
        this.critical = critical;
        return this;
    }

    /**
     * Get the dataCenter property: Data center for the namespace.
     *
     * @return the dataCenter value.
     */
    public String dataCenter() {
        return this.dataCenter;
    }

    /**
     * Set the dataCenter property: Data center for the namespace.
     *
     * @param dataCenter the dataCenter value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }

    /**
     * Get the namespaceType property: The namespace type.
     *
     * @return the namespaceType value.
     */
    public NamespaceType namespaceType() {
        return this.namespaceType;
    }

    /**
     * Set the namespaceType property: The namespace type.
     *
     * @param namespaceType the namespaceType value to set.
     * @return the NamespaceProperties object itself.
     */
    public NamespaceProperties withNamespaceType(NamespaceType namespaceType) {
        this.namespaceType = namespaceType;
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
