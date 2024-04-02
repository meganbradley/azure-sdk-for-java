// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.xml;

import javax.xml.stream.XMLStreamException;

/**
 * A callback used when reading an XML value, such as {@link XmlReader#getNullableElement(ReadValueCallback)}.
 *
 * @param <T> Input type of the callback.
 * @param <R> Output type of the callback.
 */
@FunctionalInterface
public interface ReadValueCallback<T, R> {
    /**
     * Applies the read callback to the {@code input}.
     *
     * @param input Input to the callback.
     * @return The output of the callback.
     * @throws XMLStreamException If an XML stream error occurs during application of the callback.
     */
    R read(T input) throws XMLStreamException;
}
