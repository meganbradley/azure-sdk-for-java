// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Properties of the deleted managed HSM. */
@Immutable
public final class DeletedManagedHsmProperties {
    /*
     * The resource id of the original managed HSM.
     */
    @JsonProperty(value = "mhsmId", access = JsonProperty.Access.WRITE_ONLY)
    private String mhsmId;

    /*
     * The location of the original managed HSM.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * The deleted date.
     */
    @JsonProperty(value = "deletionDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime deletionDate;

    /*
     * The scheduled purged date.
     */
    @JsonProperty(value = "scheduledPurgeDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime scheduledPurgeDate;

    /*
     * Purge protection status of the original managed HSM.
     */
    @JsonProperty(value = "purgeProtectionEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean purgeProtectionEnabled;

    /*
     * Tags of the original managed HSM.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /** Creates an instance of DeletedManagedHsmProperties class. */
    public DeletedManagedHsmProperties() {
    }

    /**
     * Get the mhsmId property: The resource id of the original managed HSM.
     *
     * @return the mhsmId value.
     */
    public String mhsmId() {
        return this.mhsmId;
    }

    /**
     * Get the location property: The location of the original managed HSM.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the deletionDate property: The deleted date.
     *
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.deletionDate;
    }

    /**
     * Get the scheduledPurgeDate property: The scheduled purged date.
     *
     * @return the scheduledPurgeDate value.
     */
    public OffsetDateTime scheduledPurgeDate() {
        return this.scheduledPurgeDate;
    }

    /**
     * Get the purgeProtectionEnabled property: Purge protection status of the original managed HSM.
     *
     * @return the purgeProtectionEnabled value.
     */
    public Boolean purgeProtectionEnabled() {
        return this.purgeProtectionEnabled;
    }

    /**
     * Get the tags property: Tags of the original managed HSM.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
