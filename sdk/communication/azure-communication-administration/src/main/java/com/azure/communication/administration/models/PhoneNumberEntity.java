// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The PhoneNumberEntity model. */
@Fluent
public final class PhoneNumberEntity {
    /*
     * The id of the entity. It is the search id of a searc. It is the release
     * id of a release.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Date and time the entity is created.
     */
    @JsonProperty(value = "createdAt")
    private OffsetDateTime createdAt;

    /*
     * Name of the entity.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Quantity of requested phone numbers in the entity.
     */
    @JsonProperty(value = "quantity")
    private Integer quantity;

    /*
     * Quantity of acquired phone numbers in the entity.
     */
    @JsonProperty(value = "quantityObtained")
    private Integer quantityObtained;

    /*
     * Status of the entity.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The Firm Order Confirmation date of the phone number entity.
     */
    @JsonProperty(value = "focDate")
    private OffsetDateTime focDate;

    /**
     * Get the id property: The id of the entity. It is the search id of a searc. It is the release id of a release.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The id of the entity. It is the search id of a searc. It is the release id of a release.
     *
     * @param id the id value to set.
     * @return the PhoneNumberEntity object itself.
     */
    public PhoneNumberEntity setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the createdAt property: Date and time the entity is created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: Date and time the entity is created.
     *
     * @param createdAt the createdAt value to set.
     * @return the PhoneNumberEntity object itself.
     */
    public PhoneNumberEntity setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the displayName property: Name of the entity.
     *
     * @return the displayName value.
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Name of the entity.
     *
     * @param displayName the displayName value to set.
     * @return the PhoneNumberEntity object itself.
     */
    public PhoneNumberEntity setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the quantity property: Quantity of requested phone numbers in the entity.
     *
     * @return the quantity value.
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: Quantity of requested phone numbers in the entity.
     *
     * @param quantity the quantity value to set.
     * @return the PhoneNumberEntity object itself.
     */
    public PhoneNumberEntity setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the quantityObtained property: Quantity of acquired phone numbers in the entity.
     *
     * @return the quantityObtained value.
     */
    public Integer getQuantityObtained() {
        return this.quantityObtained;
    }

    /**
     * Set the quantityObtained property: Quantity of acquired phone numbers in the entity.
     *
     * @param quantityObtained the quantityObtained value to set.
     * @return the PhoneNumberEntity object itself.
     */
    public PhoneNumberEntity setQuantityObtained(Integer quantityObtained) {
        this.quantityObtained = quantityObtained;
        return this;
    }

    /**
     * Get the status property: Status of the entity.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Status of the entity.
     *
     * @param status the status value to set.
     * @return the PhoneNumberEntity object itself.
     */
    public PhoneNumberEntity setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the focDate property: The Firm Order Confirmation date of the phone number entity.
     *
     * @return the focDate value.
     */
    public OffsetDateTime getFocDate() {
        return this.focDate;
    }

    /**
     * Set the focDate property: The Firm Order Confirmation date of the phone number entity.
     *
     * @param focDate the focDate value to set.
     * @return the PhoneNumberEntity object itself.
     */
    public PhoneNumberEntity setFocDate(OffsetDateTime focDate) {
        this.focDate = focDate;
        return this;
    }
}
