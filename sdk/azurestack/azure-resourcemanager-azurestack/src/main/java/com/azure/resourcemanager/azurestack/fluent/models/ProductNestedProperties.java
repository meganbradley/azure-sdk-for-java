// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurestack.models.Compatibility;
import com.azure.resourcemanager.azurestack.models.IconUris;
import com.azure.resourcemanager.azurestack.models.ProductLink;
import com.azure.resourcemanager.azurestack.models.ProductProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties portion of the product resource. */
@Fluent
public final class ProductNestedProperties {
    /*
     * The display name of the product.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The description of the product.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The user-friendly name of the product publisher.
     */
    @JsonProperty(value = "publisherDisplayName")
    private String publisherDisplayName;

    /*
     * Publisher identifier.
     */
    @JsonProperty(value = "publisherIdentifier")
    private String publisherIdentifier;

    /*
     * The offer representing the product.
     */
    @JsonProperty(value = "offer")
    private String offer;

    /*
     * The version of the product offer.
     */
    @JsonProperty(value = "offerVersion")
    private String offerVersion;

    /*
     * The product SKU.
     */
    @JsonProperty(value = "sku")
    private String sku;

    /*
     * The part number used for billing purposes.
     */
    @JsonProperty(value = "billingPartNumber")
    private String billingPartNumber;

    /*
     * The type of the Virtual Machine Extension.
     */
    @JsonProperty(value = "vmExtensionType")
    private String vmExtensionType;

    /*
     * The identifier of the gallery item corresponding to the product.
     */
    @JsonProperty(value = "galleryItemIdentity")
    private String galleryItemIdentity;

    /*
     * Additional links available for this product.
     */
    @JsonProperty(value = "iconUris")
    private IconUris iconUris;

    /*
     * Additional links available for this product.
     */
    @JsonProperty(value = "links")
    private List<ProductLink> links;

    /*
     * The legal terms.
     */
    @JsonProperty(value = "legalTerms")
    private String legalTerms;

    /*
     * The privacy policy.
     */
    @JsonProperty(value = "privacyPolicy")
    private String privacyPolicy;

    /*
     * The length of product content.
     */
    @JsonProperty(value = "payloadLength")
    private Long payloadLength;

    /*
     * The kind of the product (virtualMachine or virtualMachineExtension)
     */
    @JsonProperty(value = "productKind")
    private String productKind;

    /*
     * Additional properties for the product.
     */
    @JsonProperty(value = "productProperties")
    private ProductProperties productProperties;

    /*
     * Product compatibility with current device.
     */
    @JsonProperty(value = "compatibility")
    private Compatibility compatibility;

    /** Creates an instance of ProductNestedProperties class. */
    public ProductNestedProperties() {
    }

    /**
     * Get the displayName property: The display name of the product.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name of the product.
     *
     * @param displayName the displayName value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the product.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the product.
     *
     * @param description the description value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the publisherDisplayName property: The user-friendly name of the product publisher.
     *
     * @return the publisherDisplayName value.
     */
    public String publisherDisplayName() {
        return this.publisherDisplayName;
    }

    /**
     * Set the publisherDisplayName property: The user-friendly name of the product publisher.
     *
     * @param publisherDisplayName the publisherDisplayName value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withPublisherDisplayName(String publisherDisplayName) {
        this.publisherDisplayName = publisherDisplayName;
        return this;
    }

    /**
     * Get the publisherIdentifier property: Publisher identifier.
     *
     * @return the publisherIdentifier value.
     */
    public String publisherIdentifier() {
        return this.publisherIdentifier;
    }

    /**
     * Set the publisherIdentifier property: Publisher identifier.
     *
     * @param publisherIdentifier the publisherIdentifier value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withPublisherIdentifier(String publisherIdentifier) {
        this.publisherIdentifier = publisherIdentifier;
        return this;
    }

    /**
     * Get the offer property: The offer representing the product.
     *
     * @return the offer value.
     */
    public String offer() {
        return this.offer;
    }

    /**
     * Set the offer property: The offer representing the product.
     *
     * @param offer the offer value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withOffer(String offer) {
        this.offer = offer;
        return this;
    }

    /**
     * Get the offerVersion property: The version of the product offer.
     *
     * @return the offerVersion value.
     */
    public String offerVersion() {
        return this.offerVersion;
    }

    /**
     * Set the offerVersion property: The version of the product offer.
     *
     * @param offerVersion the offerVersion value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withOfferVersion(String offerVersion) {
        this.offerVersion = offerVersion;
        return this;
    }

    /**
     * Get the sku property: The product SKU.
     *
     * @return the sku value.
     */
    public String sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The product SKU.
     *
     * @param sku the sku value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withSku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the billingPartNumber property: The part number used for billing purposes.
     *
     * @return the billingPartNumber value.
     */
    public String billingPartNumber() {
        return this.billingPartNumber;
    }

    /**
     * Set the billingPartNumber property: The part number used for billing purposes.
     *
     * @param billingPartNumber the billingPartNumber value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withBillingPartNumber(String billingPartNumber) {
        this.billingPartNumber = billingPartNumber;
        return this;
    }

    /**
     * Get the vmExtensionType property: The type of the Virtual Machine Extension.
     *
     * @return the vmExtensionType value.
     */
    public String vmExtensionType() {
        return this.vmExtensionType;
    }

    /**
     * Set the vmExtensionType property: The type of the Virtual Machine Extension.
     *
     * @param vmExtensionType the vmExtensionType value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withVmExtensionType(String vmExtensionType) {
        this.vmExtensionType = vmExtensionType;
        return this;
    }

    /**
     * Get the galleryItemIdentity property: The identifier of the gallery item corresponding to the product.
     *
     * @return the galleryItemIdentity value.
     */
    public String galleryItemIdentity() {
        return this.galleryItemIdentity;
    }

    /**
     * Set the galleryItemIdentity property: The identifier of the gallery item corresponding to the product.
     *
     * @param galleryItemIdentity the galleryItemIdentity value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withGalleryItemIdentity(String galleryItemIdentity) {
        this.galleryItemIdentity = galleryItemIdentity;
        return this;
    }

    /**
     * Get the iconUris property: Additional links available for this product.
     *
     * @return the iconUris value.
     */
    public IconUris iconUris() {
        return this.iconUris;
    }

    /**
     * Set the iconUris property: Additional links available for this product.
     *
     * @param iconUris the iconUris value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withIconUris(IconUris iconUris) {
        this.iconUris = iconUris;
        return this;
    }

    /**
     * Get the links property: Additional links available for this product.
     *
     * @return the links value.
     */
    public List<ProductLink> links() {
        return this.links;
    }

    /**
     * Set the links property: Additional links available for this product.
     *
     * @param links the links value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withLinks(List<ProductLink> links) {
        this.links = links;
        return this;
    }

    /**
     * Get the legalTerms property: The legal terms.
     *
     * @return the legalTerms value.
     */
    public String legalTerms() {
        return this.legalTerms;
    }

    /**
     * Set the legalTerms property: The legal terms.
     *
     * @param legalTerms the legalTerms value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withLegalTerms(String legalTerms) {
        this.legalTerms = legalTerms;
        return this;
    }

    /**
     * Get the privacyPolicy property: The privacy policy.
     *
     * @return the privacyPolicy value.
     */
    public String privacyPolicy() {
        return this.privacyPolicy;
    }

    /**
     * Set the privacyPolicy property: The privacy policy.
     *
     * @param privacyPolicy the privacyPolicy value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withPrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
        return this;
    }

    /**
     * Get the payloadLength property: The length of product content.
     *
     * @return the payloadLength value.
     */
    public Long payloadLength() {
        return this.payloadLength;
    }

    /**
     * Set the payloadLength property: The length of product content.
     *
     * @param payloadLength the payloadLength value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withPayloadLength(Long payloadLength) {
        this.payloadLength = payloadLength;
        return this;
    }

    /**
     * Get the productKind property: The kind of the product (virtualMachine or virtualMachineExtension).
     *
     * @return the productKind value.
     */
    public String productKind() {
        return this.productKind;
    }

    /**
     * Set the productKind property: The kind of the product (virtualMachine or virtualMachineExtension).
     *
     * @param productKind the productKind value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withProductKind(String productKind) {
        this.productKind = productKind;
        return this;
    }

    /**
     * Get the productProperties property: Additional properties for the product.
     *
     * @return the productProperties value.
     */
    public ProductProperties productProperties() {
        return this.productProperties;
    }

    /**
     * Set the productProperties property: Additional properties for the product.
     *
     * @param productProperties the productProperties value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withProductProperties(ProductProperties productProperties) {
        this.productProperties = productProperties;
        return this;
    }

    /**
     * Get the compatibility property: Product compatibility with current device.
     *
     * @return the compatibility value.
     */
    public Compatibility compatibility() {
        return this.compatibility;
    }

    /**
     * Set the compatibility property: Product compatibility with current device.
     *
     * @param compatibility the compatibility value to set.
     * @return the ProductNestedProperties object itself.
     */
    public ProductNestedProperties withCompatibility(Compatibility compatibility) {
        this.compatibility = compatibility;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (iconUris() != null) {
            iconUris().validate();
        }
        if (links() != null) {
            links().forEach(e -> e.validate());
        }
        if (productProperties() != null) {
            productProperties().validate();
        }
        if (compatibility() != null) {
            compatibility().validate();
        }
    }
}
