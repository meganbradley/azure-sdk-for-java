// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.util.serializer;

import com.generic.core.models.TypeReference;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Generic interface covering basic JSON serialization and deserialization methods.
 */
public interface JsonSerializer extends ObjectSerializer {
    /**
     * Reads a JSON byte array into its object representation.
     *
     * @param data The JSON byte array.
     * @param typeReference {@link TypeReference} representing the object.
     * @param <T> Type of the object.
     *
     * @return The object represented by the deserialized JSON byte array.
     */
    @Override
    <T> T deserializeFromBytes(byte[] data, TypeReference<T> typeReference);

    /**
     * Reads a JSON stream into its object representation.
     *
     * @param stream JSON stream.
     * @param typeReference {@link TypeReference} representing the object.
     * @param <T> Type of the object.
     *
     * @return The object represented by the deserialized JSON stream.
     */
    @Override
    <T> T deserializeFromStream(InputStream stream, TypeReference<T> typeReference);

    /**
     * Converts the object into a JSON byte array.
     *
     * @param value The object.
     *
     * @return The JSON binary representation of the serialized object.
     */
    @Override
    byte[] serializeToBytes(Object value);

    /**
     * Writes an object's JSON representation into a stream.
     *
     * @param stream {@link OutputStream} where the object's JSON representation will be written.
     * @param value The object to serialize.
     */
    @Override
    void serializeToStream(OutputStream stream, Object value);
}
