// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch;

import com.azure.core.util.ServiceVersion;

/** Service version of BatchClient. */
public enum BatchServiceVersion implements ServiceVersion {
    /** Enum value 2023-05-01.17.0. */
    V2023_05_01_17_0("2023-05-01.17.0");

    private final String version;

    BatchServiceVersion(String version) {
        this.version = version;
    }

    /** {@inheritDoc} */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link BatchServiceVersion}.
     */
    public static BatchServiceVersion getLatest() {
        return V2023_05_01_17_0;
    }
}
