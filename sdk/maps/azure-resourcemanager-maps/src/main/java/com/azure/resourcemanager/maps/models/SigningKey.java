// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maps.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The Map account key to use for signing. Picking `primaryKey` or `secondaryKey` will use the Map account Shared Keys,
 * and using `managedIdentity` will use the auto-renewed private key to sign the SAS.
 */
public final class SigningKey extends ExpandableStringEnum<SigningKey> {
    /** Static value primaryKey for SigningKey. */
    public static final SigningKey PRIMARY_KEY = fromString("primaryKey");

    /** Static value secondaryKey for SigningKey. */
    public static final SigningKey SECONDARY_KEY = fromString("secondaryKey");

    /** Static value managedIdentity for SigningKey. */
    public static final SigningKey MANAGED_IDENTITY = fromString("managedIdentity");

    /**
     * Creates a new instance of SigningKey value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public SigningKey() {
    }

    /**
     * Creates or finds a SigningKey from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SigningKey.
     */
    @JsonCreator
    public static SigningKey fromString(String name) {
        return fromString(name, SigningKey.class);
    }

    /**
     * Gets known SigningKey values.
     *
     * @return known SigningKey values.
     */
    public static Collection<SigningKey> values() {
        return values(SigningKey.class);
    }
}
