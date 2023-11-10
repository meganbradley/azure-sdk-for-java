// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The value that indicates whether the policy is enabled or not.
 */
public final class AzureADAuthenticationAsArmPolicyStatus
    extends ExpandableStringEnum<AzureADAuthenticationAsArmPolicyStatus> {
    /**
     * Static value enabled for AzureADAuthenticationAsArmPolicyStatus.
     */
    public static final AzureADAuthenticationAsArmPolicyStatus ENABLED = fromString("enabled");

    /**
     * Static value disabled for AzureADAuthenticationAsArmPolicyStatus.
     */
    public static final AzureADAuthenticationAsArmPolicyStatus DISABLED = fromString("disabled");

    /**
     * Creates a new instance of AzureADAuthenticationAsArmPolicyStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureADAuthenticationAsArmPolicyStatus() {
    }

    /**
     * Creates or finds a AzureADAuthenticationAsArmPolicyStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureADAuthenticationAsArmPolicyStatus.
     */
    @JsonCreator
    public static AzureADAuthenticationAsArmPolicyStatus fromString(String name) {
        return fromString(name, AzureADAuthenticationAsArmPolicyStatus.class);
    }

    /**
     * Gets known AzureADAuthenticationAsArmPolicyStatus values.
     * 
     * @return known AzureADAuthenticationAsArmPolicyStatus values.
     */
    public static Collection<AzureADAuthenticationAsArmPolicyStatus> values() {
        return values(AzureADAuthenticationAsArmPolicyStatus.class);
    }
}
