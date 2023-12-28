// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Recipient Email details. */
@Fluent
public final class RecipientEmailContractInner extends ProxyResource {
    /*
     * Recipient Email contract properties.
     */
    @JsonProperty(value = "properties")
    private RecipientEmailContractProperties innerProperties;

    /** Creates an instance of RecipientEmailContractInner class. */
    public RecipientEmailContractInner() {
    }

    /**
     * Get the innerProperties property: Recipient Email contract properties.
     *
     * @return the innerProperties value.
     */
    private RecipientEmailContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the email property: User Email subscribed to notification.
     *
     * @return the email value.
     */
    public String email() {
        return this.innerProperties() == null ? null : this.innerProperties().email();
    }

    /**
     * Set the email property: User Email subscribed to notification.
     *
     * @param email the email value to set.
     * @return the RecipientEmailContractInner object itself.
     */
    public RecipientEmailContractInner withEmail(String email) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RecipientEmailContractProperties();
        }
        this.innerProperties().withEmail(email);
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
    }
}
