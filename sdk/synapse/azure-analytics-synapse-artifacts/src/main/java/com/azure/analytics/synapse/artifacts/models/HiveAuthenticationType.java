// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The authentication method used to access the Hive server. */
public final class HiveAuthenticationType extends ExpandableStringEnum<HiveAuthenticationType> {
    /** Static value Anonymous for HiveAuthenticationType. */
    public static final HiveAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value Username for HiveAuthenticationType. */
    public static final HiveAuthenticationType USERNAME = fromString("Username");

    /** Static value UsernameAndPassword for HiveAuthenticationType. */
    public static final HiveAuthenticationType USERNAME_AND_PASSWORD = fromString("UsernameAndPassword");

    /** Static value WindowsAzureHDInsightService for HiveAuthenticationType. */
    public static final HiveAuthenticationType WINDOWS_AZURE_HDINSIGHT_SERVICE =
            fromString("WindowsAzureHDInsightService");

    /**
     * Creates a new instance of HiveAuthenticationType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public HiveAuthenticationType() {}

    /**
     * Creates or finds a HiveAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HiveAuthenticationType.
     */
    @JsonCreator
    public static HiveAuthenticationType fromString(String name) {
        return fromString(name, HiveAuthenticationType.class);
    }

    /**
     * Gets known HiveAuthenticationType values.
     *
     * @return known HiveAuthenticationType values.
     */
    public static Collection<HiveAuthenticationType> values() {
        return values(HiveAuthenticationType.class);
    }
}
