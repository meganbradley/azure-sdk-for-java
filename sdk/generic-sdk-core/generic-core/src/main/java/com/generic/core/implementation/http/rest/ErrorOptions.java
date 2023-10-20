// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.implementation.http.rest;

import com.generic.core.http.models.HttpRequestOptions;

/**
 * Determines how errors are handled by requests using {@link HttpRequestOptions}.
 */
public enum ErrorOptions {
    /**
     * Throw exceptions when an HTTP response with a status code indicating an error (400 or above) is received.
     */
    THROW,

    /**
     * Do not throw exceptions when an HTTP response with a status code indicating an error (400 or above) is received.
     */
    NO_THROW
}
