// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The onboarding status for the resource. Note that, a higher level scope, e.g., resource group or subscription, is
 * considered onboarded if at least one resource under it is onboarded.
 */
public final class OnboardingStatus extends ExpandableStringEnum<OnboardingStatus> {
    /**
     * Static value onboarded for OnboardingStatus.
     */
    public static final OnboardingStatus ONBOARDED = fromString("onboarded");

    /**
     * Static value notOnboarded for OnboardingStatus.
     */
    public static final OnboardingStatus NOT_ONBOARDED = fromString("notOnboarded");

    /**
     * Static value unknown for OnboardingStatus.
     */
    public static final OnboardingStatus UNKNOWN = fromString("unknown");

    /**
     * Creates a new instance of OnboardingStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public OnboardingStatus() {
    }

    /**
     * Creates or finds a OnboardingStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding OnboardingStatus.
     */
    @JsonCreator
    public static OnboardingStatus fromString(String name) {
        return fromString(name, OnboardingStatus.class);
    }

    /**
     * Gets known OnboardingStatus values.
     * 
     * @return known OnboardingStatus values.
     */
    public static Collection<OnboardingStatus> values() {
        return values(OnboardingStatus.class);
    }
}
