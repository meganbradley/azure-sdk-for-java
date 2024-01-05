// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.models;

import com.azure.communication.phonenumbers.CodeCoverageAnnotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PhoneNumberOperationType. */
@Generated
public final class PhoneNumberOperationType extends ExpandableStringEnum<PhoneNumberOperationType> {
    /** Static value purchase for PhoneNumberOperationType. */
    public static final PhoneNumberOperationType PURCHASE = fromString("purchase");

    /** Static value releasePhoneNumber for PhoneNumberOperationType. */
    public static final PhoneNumberOperationType RELEASE_PHONE_NUMBER = fromString("releasePhoneNumber");

    /** Static value search for PhoneNumberOperationType. */
    public static final PhoneNumberOperationType SEARCH = fromString("search");

    /** Static value updatePhoneNumberCapabilities for PhoneNumberOperationType. */
    public static final PhoneNumberOperationType UPDATE_PHONE_NUMBER_CAPABILITIES = fromString(
            "updatePhoneNumberCapabilities");

    /** Static value reservationPurchase for PhoneNumberOperationType. */
    public static final PhoneNumberOperationType RESERVATION_PURCHASE = fromString("reservationPurchase");

    /**
     * Creates or finds a PhoneNumberOperationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PhoneNumberOperationType.
     */
    @JsonCreator
    public static PhoneNumberOperationType fromString(String name) {
        return fromString(name, PhoneNumberOperationType.class);
    }

    /** @return known PhoneNumberOperationType values. */
    public static Collection<PhoneNumberOperationType> values() {
        return values(PhoneNumberOperationType.class);
    }
}
