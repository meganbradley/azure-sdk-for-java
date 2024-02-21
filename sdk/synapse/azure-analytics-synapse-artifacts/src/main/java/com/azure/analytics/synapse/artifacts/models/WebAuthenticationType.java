// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Type of authentication used to connect to the web table source.
 */
public final class WebAuthenticationType extends ExpandableStringEnum<WebAuthenticationType> {
    /**
     * Static value Basic for WebAuthenticationType.
     */
    public static final WebAuthenticationType BASIC = fromString("Basic");

    /**
     * Static value Anonymous for WebAuthenticationType.
     */
    public static final WebAuthenticationType ANONYMOUS = fromString("Anonymous");

    /**
     * Static value ClientCertificate for WebAuthenticationType.
     */
    public static final WebAuthenticationType CLIENT_CERTIFICATE = fromString("ClientCertificate");

    /**
     * Creates a new instance of WebAuthenticationType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public WebAuthenticationType() {
    }

    /**
     * Creates or finds a WebAuthenticationType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding WebAuthenticationType.
     */
    @JsonCreator
    public static WebAuthenticationType fromString(String name) {
        return fromString(name, WebAuthenticationType.class);
    }

    /**
     * Gets known WebAuthenticationType values.
     * 
     * @return known WebAuthenticationType values.
     */
    public static Collection<WebAuthenticationType> values() {
        return values(WebAuthenticationType.class);
    }
}
