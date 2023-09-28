// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.implementation.util;

import com.client.core.util.BinaryData;

/**
 * Type of the content that a {@link BinaryData} is representing.
 */
public enum BinaryDataContentType {
    /**
     * {@link BinaryData} based on binary content.
     */
    BINARY,

    /**
     * {@link BinaryData} based on a serializable object.
     */
    OBJECT,

    /**
     * {@link BinaryData} based on text.
     */
    TEXT
}
