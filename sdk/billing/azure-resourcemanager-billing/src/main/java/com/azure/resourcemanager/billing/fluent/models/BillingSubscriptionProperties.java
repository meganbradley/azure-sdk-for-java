// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.billing.models.Amount;
import com.azure.resourcemanager.billing.models.BillingSubscriptionStatusType;
import com.azure.resourcemanager.billing.models.Reseller;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.UUID;

/** The billing properties of a subscription. */
@Fluent
public final class BillingSubscriptionProperties {
    /*
     * The name of the subscription.
     */
    @JsonProperty(value = "displayName", access = JsonProperty.Access.WRITE_ONLY)
    private String displayName;

    /*
     * The ID of the subscription.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID subscriptionId;

    /*
     * The current billing status of the subscription.
     */
    @JsonProperty(value = "subscriptionBillingStatus")
    private BillingSubscriptionStatusType subscriptionBillingStatus;

    /*
     * The last month charges.
     */
    @JsonProperty(value = "lastMonthCharges", access = JsonProperty.Access.WRITE_ONLY)
    private Amount lastMonthCharges;

    /*
     * The current month to date charges.
     */
    @JsonProperty(value = "monthToDateCharges", access = JsonProperty.Access.WRITE_ONLY)
    private Amount monthToDateCharges;

    /*
     * The ID of the billing profile to which the subscription is billed.
     */
    @JsonProperty(value = "billingProfileId", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileId;

    /*
     * The name of the billing profile to which the subscription is billed.
     */
    @JsonProperty(value = "billingProfileDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String billingProfileDisplayName;

    /*
     * The cost center applied to the subscription.
     */
    @JsonProperty(value = "costCenter")
    private String costCenter;

    /*
     * The ID of the customer for whom the subscription was created. The field is applicable only for Microsoft Partner
     * Agreement billing account.
     */
    @JsonProperty(value = "customerId", access = JsonProperty.Access.WRITE_ONLY)
    private String customerId;

    /*
     * The name of the customer for whom the subscription was created. The field is applicable only for Microsoft
     * Partner Agreement billing account.
     */
    @JsonProperty(value = "customerDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String customerDisplayName;

    /*
     * The ID of the invoice section to which the subscription is billed.
     */
    @JsonProperty(value = "invoiceSectionId", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionId;

    /*
     * The name of the invoice section to which the subscription is billed.
     */
    @JsonProperty(value = "invoiceSectionDisplayName", access = JsonProperty.Access.WRITE_ONLY)
    private String invoiceSectionDisplayName;

    /*
     * Reseller for this subscription.
     */
    @JsonProperty(value = "reseller", access = JsonProperty.Access.WRITE_ONLY)
    private Reseller reseller;

    /*
     * The sku ID of the Azure plan for the subscription.
     */
    @JsonProperty(value = "skuId")
    private String skuId;

    /*
     * The sku description of the Azure plan for the subscription.
     */
    @JsonProperty(value = "skuDescription", access = JsonProperty.Access.WRITE_ONLY)
    private String skuDescription;

    /*
     * The suspension reason for a subscription. Applies only to subscriptions in Microsoft Online Services Program
     * billing accounts.
     */
    @JsonProperty(value = "suspensionReasons", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> suspensionReasons;

    /** Creates an instance of BillingSubscriptionProperties class. */
    public BillingSubscriptionProperties() {
    }

    /**
     * Get the displayName property: The name of the subscription.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Get the subscriptionId property: The ID of the subscription.
     *
     * @return the subscriptionId value.
     */
    public UUID subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Get the subscriptionBillingStatus property: The current billing status of the subscription.
     *
     * @return the subscriptionBillingStatus value.
     */
    public BillingSubscriptionStatusType subscriptionBillingStatus() {
        return this.subscriptionBillingStatus;
    }

    /**
     * Set the subscriptionBillingStatus property: The current billing status of the subscription.
     *
     * @param subscriptionBillingStatus the subscriptionBillingStatus value to set.
     * @return the BillingSubscriptionProperties object itself.
     */
    public BillingSubscriptionProperties withSubscriptionBillingStatus(
        BillingSubscriptionStatusType subscriptionBillingStatus) {
        this.subscriptionBillingStatus = subscriptionBillingStatus;
        return this;
    }

    /**
     * Get the lastMonthCharges property: The last month charges.
     *
     * @return the lastMonthCharges value.
     */
    public Amount lastMonthCharges() {
        return this.lastMonthCharges;
    }

    /**
     * Get the monthToDateCharges property: The current month to date charges.
     *
     * @return the monthToDateCharges value.
     */
    public Amount monthToDateCharges() {
        return this.monthToDateCharges;
    }

    /**
     * Get the billingProfileId property: The ID of the billing profile to which the subscription is billed.
     *
     * @return the billingProfileId value.
     */
    public String billingProfileId() {
        return this.billingProfileId;
    }

    /**
     * Get the billingProfileDisplayName property: The name of the billing profile to which the subscription is billed.
     *
     * @return the billingProfileDisplayName value.
     */
    public String billingProfileDisplayName() {
        return this.billingProfileDisplayName;
    }

    /**
     * Get the costCenter property: The cost center applied to the subscription.
     *
     * @return the costCenter value.
     */
    public String costCenter() {
        return this.costCenter;
    }

    /**
     * Set the costCenter property: The cost center applied to the subscription.
     *
     * @param costCenter the costCenter value to set.
     * @return the BillingSubscriptionProperties object itself.
     */
    public BillingSubscriptionProperties withCostCenter(String costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    /**
     * Get the customerId property: The ID of the customer for whom the subscription was created. The field is
     * applicable only for Microsoft Partner Agreement billing account.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Get the customerDisplayName property: The name of the customer for whom the subscription was created. The field
     * is applicable only for Microsoft Partner Agreement billing account.
     *
     * @return the customerDisplayName value.
     */
    public String customerDisplayName() {
        return this.customerDisplayName;
    }

    /**
     * Get the invoiceSectionId property: The ID of the invoice section to which the subscription is billed.
     *
     * @return the invoiceSectionId value.
     */
    public String invoiceSectionId() {
        return this.invoiceSectionId;
    }

    /**
     * Get the invoiceSectionDisplayName property: The name of the invoice section to which the subscription is billed.
     *
     * @return the invoiceSectionDisplayName value.
     */
    public String invoiceSectionDisplayName() {
        return this.invoiceSectionDisplayName;
    }

    /**
     * Get the reseller property: Reseller for this subscription.
     *
     * @return the reseller value.
     */
    public Reseller reseller() {
        return this.reseller;
    }

    /**
     * Get the skuId property: The sku ID of the Azure plan for the subscription.
     *
     * @return the skuId value.
     */
    public String skuId() {
        return this.skuId;
    }

    /**
     * Set the skuId property: The sku ID of the Azure plan for the subscription.
     *
     * @param skuId the skuId value to set.
     * @return the BillingSubscriptionProperties object itself.
     */
    public BillingSubscriptionProperties withSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    /**
     * Get the skuDescription property: The sku description of the Azure plan for the subscription.
     *
     * @return the skuDescription value.
     */
    public String skuDescription() {
        return this.skuDescription;
    }

    /**
     * Get the suspensionReasons property: The suspension reason for a subscription. Applies only to subscriptions in
     * Microsoft Online Services Program billing accounts.
     *
     * @return the suspensionReasons value.
     */
    public List<String> suspensionReasons() {
        return this.suspensionReasons;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (lastMonthCharges() != null) {
            lastMonthCharges().validate();
        }
        if (monthToDateCharges() != null) {
            monthToDateCharges().validate();
        }
        if (reseller() != null) {
            reseller().validate();
        }
    }
}
