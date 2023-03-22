// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The plan object in Azure Resource Manager, represents a marketplace plan. */
@Fluent
public final class ArmPlan {
    /*
     * The name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The publisher.
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /*
     * The product.
     */
    @JsonProperty(value = "product")
    private String product;

    /*
     * The promotion code.
     */
    @JsonProperty(value = "promotionCode")
    private String promotionCode;

    /*
     * Version of product.
     */
    @JsonProperty(value = "version")
    private String version;

    /** Creates an instance of ArmPlan class. */
    public ArmPlan() {
    }

    /**
     * Get the name property: The name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name.
     *
     * @param name the name value to set.
     * @return the ArmPlan object itself.
     */
    public ArmPlan withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publisher property: The publisher.
     *
     * @return the publisher value.
     */
    public String publisher() {
        return this.publisher;
    }

    /**
     * Set the publisher property: The publisher.
     *
     * @param publisher the publisher value to set.
     * @return the ArmPlan object itself.
     */
    public ArmPlan withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * Get the product property: The product.
     *
     * @return the product value.
     */
    public String product() {
        return this.product;
    }

    /**
     * Set the product property: The product.
     *
     * @param product the product value to set.
     * @return the ArmPlan object itself.
     */
    public ArmPlan withProduct(String product) {
        this.product = product;
        return this;
    }

    /**
     * Get the promotionCode property: The promotion code.
     *
     * @return the promotionCode value.
     */
    public String promotionCode() {
        return this.promotionCode;
    }

    /**
     * Set the promotionCode property: The promotion code.
     *
     * @param promotionCode the promotionCode value to set.
     * @return the ArmPlan object itself.
     */
    public ArmPlan withPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }

    /**
     * Get the version property: Version of product.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of product.
     *
     * @param version the version value to set.
     * @return the ArmPlan object itself.
     */
    public ArmPlan withVersion(String version) {
        this.version = version;
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
