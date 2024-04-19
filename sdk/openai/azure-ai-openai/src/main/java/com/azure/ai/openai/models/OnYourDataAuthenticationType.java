// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The authentication types supported with Azure OpenAI On Your Data.
 */
public final class OnYourDataAuthenticationType extends ExpandableStringEnum<OnYourDataAuthenticationType> {

    /**
     * Authentication via API key.
     */
    @Generated
    public static final OnYourDataAuthenticationType API_KEY = fromString("api_key");

    /**
     * Authentication via connection string.
     */
    @Generated
    public static final OnYourDataAuthenticationType CONNECTION_STRING = fromString("connection_string");

    /**
     * Authentication via key and key ID pair.
     */
    @Generated
    public static final OnYourDataAuthenticationType KEY_AND_KEY_ID = fromString("key_and_key_id");

    /**
     * Authentication via encoded API key.
     */
    @Generated
    public static final OnYourDataAuthenticationType ENCODED_API_KEY = fromString("encoded_api_key");

    /**
     * Authentication via access token.
     */
    @Generated
    public static final OnYourDataAuthenticationType ACCESS_TOKEN = fromString("access_token");

    /**
     * Authentication via system-assigned managed identity.
     */
    @Generated
    public static final OnYourDataAuthenticationType SYSTEM_ASSIGNED_MANAGED_IDENTITY
        = fromString("system_assigned_managed_identity");

    /**
     * Authentication via user-assigned managed identity.
     */
    @Generated
    public static final OnYourDataAuthenticationType USER_ASSIGNED_MANAGED_IDENTITY
        = fromString("user_assigned_managed_identity");

    /**
     * Creates a new instance of OnYourDataAuthenticationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public OnYourDataAuthenticationType() {
    }

    /**
     * Creates or finds a OnYourDataAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OnYourDataAuthenticationType.
     */
    @Generated
    @JsonCreator
    public static OnYourDataAuthenticationType fromString(String name) {
        return fromString(name, OnYourDataAuthenticationType.class);
    }

    /**
     * Gets known OnYourDataAuthenticationType values.
     *
     * @return known OnYourDataAuthenticationType values.
     */
    @Generated
    public static Collection<OnYourDataAuthenticationType> values() {
        return values(OnYourDataAuthenticationType.class);
    }
}
