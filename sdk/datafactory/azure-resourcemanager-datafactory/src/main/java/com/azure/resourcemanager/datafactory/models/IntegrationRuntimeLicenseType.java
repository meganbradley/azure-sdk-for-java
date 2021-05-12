// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IntegrationRuntimeLicenseType. */
public final class IntegrationRuntimeLicenseType extends ExpandableStringEnum<IntegrationRuntimeLicenseType> {
    /** Static value BasePrice for IntegrationRuntimeLicenseType. */
    public static final IntegrationRuntimeLicenseType BASE_PRICE = fromString("BasePrice");

    /** Static value LicenseIncluded for IntegrationRuntimeLicenseType. */
    public static final IntegrationRuntimeLicenseType LICENSE_INCLUDED = fromString("LicenseIncluded");

    /**
     * Creates or finds a IntegrationRuntimeLicenseType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IntegrationRuntimeLicenseType.
     */
    @JsonCreator
    public static IntegrationRuntimeLicenseType fromString(String name) {
        return fromString(name, IntegrationRuntimeLicenseType.class);
    }

    /** @return known IntegrationRuntimeLicenseType values. */
    public static Collection<IntegrationRuntimeLicenseType> values() {
        return values(IntegrationRuntimeLicenseType.class);
    }
}
