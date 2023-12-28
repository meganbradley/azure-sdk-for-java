// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.AdditionalLocation;
import com.azure.resourcemanager.apimanagement.models.ApiManagementServiceBaseProperties;
import com.azure.resourcemanager.apimanagement.models.ApiVersionConstraint;
import com.azure.resourcemanager.apimanagement.models.CertificateConfiguration;
import com.azure.resourcemanager.apimanagement.models.HostnameConfiguration;
import com.azure.resourcemanager.apimanagement.models.NatGatewayState;
import com.azure.resourcemanager.apimanagement.models.PublicNetworkAccess;
import com.azure.resourcemanager.apimanagement.models.RemotePrivateEndpointConnectionWrapper;
import com.azure.resourcemanager.apimanagement.models.VirtualNetworkConfiguration;
import com.azure.resourcemanager.apimanagement.models.VirtualNetworkType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Properties of an API Management service resource description. */
@Fluent
public final class ApiManagementServiceProperties extends ApiManagementServiceBaseProperties {
    /*
     * Publisher email.
     */
    @JsonProperty(value = "publisherEmail", required = true)
    private String publisherEmail;

    /*
     * Publisher name.
     */
    @JsonProperty(value = "publisherName", required = true)
    private String publisherName;

    /** Creates an instance of ApiManagementServiceProperties class. */
    public ApiManagementServiceProperties() {
    }

    /**
     * Get the publisherEmail property: Publisher email.
     *
     * @return the publisherEmail value.
     */
    public String publisherEmail() {
        return this.publisherEmail;
    }

    /**
     * Set the publisherEmail property: Publisher email.
     *
     * @param publisherEmail the publisherEmail value to set.
     * @return the ApiManagementServiceProperties object itself.
     */
    public ApiManagementServiceProperties withPublisherEmail(String publisherEmail) {
        this.publisherEmail = publisherEmail;
        return this;
    }

    /**
     * Get the publisherName property: Publisher name.
     *
     * @return the publisherName value.
     */
    public String publisherName() {
        return this.publisherName;
    }

    /**
     * Set the publisherName property: Publisher name.
     *
     * @param publisherName the publisherName value to set.
     * @return the ApiManagementServiceProperties object itself.
     */
    public ApiManagementServiceProperties withPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withNotificationSenderEmail(String notificationSenderEmail) {
        super.withNotificationSenderEmail(notificationSenderEmail);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withHostnameConfigurations(
        List<HostnameConfiguration> hostnameConfigurations) {
        super.withHostnameConfigurations(hostnameConfigurations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withPublicIpAddressId(String publicIpAddressId) {
        super.withPublicIpAddressId(publicIpAddressId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withVirtualNetworkConfiguration(
        VirtualNetworkConfiguration virtualNetworkConfiguration) {
        super.withVirtualNetworkConfiguration(virtualNetworkConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withAdditionalLocations(List<AdditionalLocation> additionalLocations) {
        super.withAdditionalLocations(additionalLocations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withCustomProperties(Map<String, String> customProperties) {
        super.withCustomProperties(customProperties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withCertificates(List<CertificateConfiguration> certificates) {
        super.withCertificates(certificates);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withEnableClientCertificate(Boolean enableClientCertificate) {
        super.withEnableClientCertificate(enableClientCertificate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withNatGatewayState(NatGatewayState natGatewayState) {
        super.withNatGatewayState(natGatewayState);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withDisableGateway(Boolean disableGateway) {
        super.withDisableGateway(disableGateway);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withVirtualNetworkType(VirtualNetworkType virtualNetworkType) {
        super.withVirtualNetworkType(virtualNetworkType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withApiVersionConstraint(ApiVersionConstraint apiVersionConstraint) {
        super.withApiVersionConstraint(apiVersionConstraint);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withRestore(Boolean restore) {
        super.withRestore(restore);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiManagementServiceProperties withPrivateEndpointConnections(
        List<RemotePrivateEndpointConnectionWrapper> privateEndpointConnections) {
        super.withPrivateEndpointConnections(privateEndpointConnections);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (publisherEmail() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publisherEmail in model ApiManagementServiceProperties"));
        }
        if (publisherName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publisherName in model ApiManagementServiceProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ApiManagementServiceProperties.class);
}
