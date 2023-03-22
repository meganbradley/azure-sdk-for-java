// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Site seal request. */
@Fluent
public final class SiteSealRequest {
    /*
     * If <code>true</code> use the light color theme for site seal; otherwise, use the default color theme.
     */
    @JsonProperty(value = "lightTheme")
    private Boolean lightTheme;

    /*
     * Locale of site seal.
     */
    @JsonProperty(value = "locale")
    private String locale;

    /** Creates an instance of SiteSealRequest class. */
    public SiteSealRequest() {
    }

    /**
     * Get the lightTheme property: If &lt;code&gt;true&lt;/code&gt; use the light color theme for site seal; otherwise,
     * use the default color theme.
     *
     * @return the lightTheme value.
     */
    public Boolean lightTheme() {
        return this.lightTheme;
    }

    /**
     * Set the lightTheme property: If &lt;code&gt;true&lt;/code&gt; use the light color theme for site seal; otherwise,
     * use the default color theme.
     *
     * @param lightTheme the lightTheme value to set.
     * @return the SiteSealRequest object itself.
     */
    public SiteSealRequest withLightTheme(Boolean lightTheme) {
        this.lightTheme = lightTheme;
        return this;
    }

    /**
     * Get the locale property: Locale of site seal.
     *
     * @return the locale value.
     */
    public String locale() {
        return this.locale;
    }

    /**
     * Set the locale property: Locale of site seal.
     *
     * @param locale the locale value to set.
     * @return the SiteSealRequest object itself.
     */
    public SiteSealRequest withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
