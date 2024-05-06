// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.openai.assistants;

import com.azure.core.util.ServiceVersion;

/**
 * Service version of AssistantsClient.
 */
public enum AssistantsServiceVersion implements ServiceVersion {
    /**
     * Enum value 2024-02-15-preview.
     */
    V2024_02_15_PREVIEW("2024-02-15-preview"),

    /**
     * Enum value placeholder-for-future-release.
     */
    VPLACEHOLDER_FOR_FUTURE_RELEASE("placeholder-for-future-release");

    private final String version;

    AssistantsServiceVersion(String version) {
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
     * Gets the latest service version supported by this client library.
     *
     * @return The latest {@link AssistantsServiceVersion}.
     */
    public static AssistantsServiceVersion getLatest() {
        return VPLACEHOLDER_FOR_FUTURE_RELEASE;
    }
}
