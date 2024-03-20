// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Updates severity, ticket status, and contact details in the support ticket.
 */
@Fluent
public final class UpdateSupportTicket {
    /*
     * Severity level.
     */
    @JsonProperty(value = "severity")
    private SeverityLevel severity;

    /*
     * Status to be updated on the ticket.
     */
    @JsonProperty(value = "status")
    private Status status;

    /*
     * Contact details to be updated on the support ticket.
     */
    @JsonProperty(value = "contactDetails")
    private UpdateContactProfile contactDetails;

    /*
     * Advanced diagnostic consent to be updated on the support ticket.
     */
    @JsonProperty(value = "advancedDiagnosticConsent")
    private Consent advancedDiagnosticConsent;

    /*
     * This property indicates secondary consents for the support ticket
     */
    @JsonProperty(value = "secondaryConsent")
    private List<SecondaryConsent> secondaryConsent;

    /**
     * Creates an instance of UpdateSupportTicket class.
     */
    public UpdateSupportTicket() {
    }

    /**
     * Get the severity property: Severity level.
     * 
     * @return the severity value.
     */
    public SeverityLevel severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Severity level.
     * 
     * @param severity the severity value to set.
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withSeverity(SeverityLevel severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the status property: Status to be updated on the ticket.
     * 
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: Status to be updated on the ticket.
     * 
     * @param status the status value to set.
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withStatus(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get the contactDetails property: Contact details to be updated on the support ticket.
     * 
     * @return the contactDetails value.
     */
    public UpdateContactProfile contactDetails() {
        return this.contactDetails;
    }

    /**
     * Set the contactDetails property: Contact details to be updated on the support ticket.
     * 
     * @param contactDetails the contactDetails value to set.
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withContactDetails(UpdateContactProfile contactDetails) {
        this.contactDetails = contactDetails;
        return this;
    }

    /**
     * Get the advancedDiagnosticConsent property: Advanced diagnostic consent to be updated on the support ticket.
     * 
     * @return the advancedDiagnosticConsent value.
     */
    public Consent advancedDiagnosticConsent() {
        return this.advancedDiagnosticConsent;
    }

    /**
     * Set the advancedDiagnosticConsent property: Advanced diagnostic consent to be updated on the support ticket.
     * 
     * @param advancedDiagnosticConsent the advancedDiagnosticConsent value to set.
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withAdvancedDiagnosticConsent(Consent advancedDiagnosticConsent) {
        this.advancedDiagnosticConsent = advancedDiagnosticConsent;
        return this;
    }

    /**
     * Get the secondaryConsent property: This property indicates secondary consents for the support ticket.
     * 
     * @return the secondaryConsent value.
     */
    public List<SecondaryConsent> secondaryConsent() {
        return this.secondaryConsent;
    }

    /**
     * Set the secondaryConsent property: This property indicates secondary consents for the support ticket.
     * 
     * @param secondaryConsent the secondaryConsent value to set.
     * @return the UpdateSupportTicket object itself.
     */
    public UpdateSupportTicket withSecondaryConsent(List<SecondaryConsent> secondaryConsent) {
        this.secondaryConsent = secondaryConsent;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (contactDetails() != null) {
            contactDetails().validate();
        }
        if (secondaryConsent() != null) {
            secondaryConsent().forEach(e -> e.validate());
        }
    }
}
