// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.phonenumbers;

import com.azure.core.util.ServiceVersion;

/**
 * The versions of Phone Number Admin Service supported by this client library.
 */
public enum PhoneNumbersServiceVersion implements ServiceVersion {
    /**
     * Latest stable service version {@code 2021-03-07}
     */
    V2021_03_07("2021-03-07"),

    /**
     * Number Lookup preview version {@code 2023-05-01-preview}
     */
    V2023_05_01_Preview("2023-05-01-preview");

    private final String version;

    PhoneNumbersServiceVersion(String version) {

        this.version = version;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {

        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library
     *
     * @return the latest {@link PhoneNumbersServiceVersion}
     */
    public static PhoneNumbersServiceVersion getLatest() {

        return V2023_05_01_Preview;
    }
}
