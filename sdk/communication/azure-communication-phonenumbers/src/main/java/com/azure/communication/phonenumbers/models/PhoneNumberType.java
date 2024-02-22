// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PhoneNumberType. */
public final class PhoneNumberType extends ExpandableStringEnum<PhoneNumberType> {
    /** Static value geographic for PhoneNumberType. */
    public static final PhoneNumberType GEOGRAPHIC = fromString("geographic");

    /** Static value tollFree for PhoneNumberType. */
    public static final PhoneNumberType TOLL_FREE = fromString("tollFree");

    /**
     * Creates or finds a PhoneNumberType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PhoneNumberType.
     */
    @JsonCreator
    public static PhoneNumberType fromString(String name) {
        return fromString(name, PhoneNumberType.class);
    }

    /**
     * Gives a collection of PhoneNumberType values
     *
     * @return known PhoneNumberType values.
     */
    public static Collection<PhoneNumberType> values() {
        return values(PhoneNumberType.class);
    }
}
