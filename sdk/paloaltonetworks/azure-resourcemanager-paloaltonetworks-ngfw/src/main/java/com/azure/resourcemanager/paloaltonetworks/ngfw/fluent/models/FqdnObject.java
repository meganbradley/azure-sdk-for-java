// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** fqdn object. */
@Fluent
public final class FqdnObject {
    /*
     * fqdn object description
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * fqdn list
     */
    @JsonProperty(value = "fqdnList", required = true)
    private List<String> fqdnList;

    /*
     * etag info
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * comment for this object
     */
    @JsonProperty(value = "auditComment")
    private String auditComment;

    /*
     * Provisioning state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /** Creates an instance of FqdnObject class. */
    public FqdnObject() {
    }

    /**
     * Get the description property: fqdn object description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: fqdn object description.
     *
     * @param description the description value to set.
     * @return the FqdnObject object itself.
     */
    public FqdnObject withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the fqdnList property: fqdn list.
     *
     * @return the fqdnList value.
     */
    public List<String> fqdnList() {
        return this.fqdnList;
    }

    /**
     * Set the fqdnList property: fqdn list.
     *
     * @param fqdnList the fqdnList value to set.
     * @return the FqdnObject object itself.
     */
    public FqdnObject withFqdnList(List<String> fqdnList) {
        this.fqdnList = fqdnList;
        return this;
    }

    /**
     * Get the etag property: etag info.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: etag info.
     *
     * @param etag the etag value to set.
     * @return the FqdnObject object itself.
     */
    public FqdnObject withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the auditComment property: comment for this object.
     *
     * @return the auditComment value.
     */
    public String auditComment() {
        return this.auditComment;
    }

    /**
     * Set the auditComment property: comment for this object.
     *
     * @param auditComment the auditComment value to set.
     * @return the FqdnObject object itself.
     */
    public FqdnObject withAuditComment(String auditComment) {
        this.auditComment = auditComment;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fqdnList() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property fqdnList in model FqdnObject"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FqdnObject.class);
}
