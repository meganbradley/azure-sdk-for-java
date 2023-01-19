// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** indicates whether account onboarded or not in a given region. */
public enum OnboardingStatus {
    /** Enum value notOnBoarded. */
    NOT_ON_BOARDED("notOnBoarded"),

    /** Enum value onBoarded. */
    ON_BOARDED("onBoarded"),

    /** Enum value onBoardingFailed. */
    ON_BOARDING_FAILED("onBoardingFailed"),

    /** Enum value onBoarding. */
    ON_BOARDING("onBoarding");

    /** The actual serialized value for a OnboardingStatus instance. */
    private final String value;

    OnboardingStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a OnboardingStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed OnboardingStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static OnboardingStatus fromString(String value) {
        if (value == null) {
            return null;
        }
        OnboardingStatus[] items = OnboardingStatus.values();
        for (OnboardingStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
