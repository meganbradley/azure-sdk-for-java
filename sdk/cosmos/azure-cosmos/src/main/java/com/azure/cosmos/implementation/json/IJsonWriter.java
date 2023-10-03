// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos.implementation.json;

import java.util.concurrent.atomic.AtomicReference;
import java.util.UUID;

/**
 * Interface for JsonWriters.
 */
interface IJsonWriter {

    /**
     * Gets the SerializationFormat of the JsonWriter.
     *
     * @return The SerializationFormat of the JsonWriter.
     */
    JsonSerializationFormat getSerializationFormat();

    /**
     * Gets the current length of the internal buffer.
     *
     * @return The current length of the internal buffer.
     */
    long getCurrentLength();

    /**
     * Writes the object start symbol to the internal buffer.
     */
    void writeObjectStart();

    /**
     * Writes the object end symbol to the internal buffer.
     */
    void writeObjectEnd();

    /**
     * Writes the array start symbol to the internal buffer.
     */
    void writeArrayStart();

    /**
     * Writes the array end symbol to the internal buffer.
     */
    void writeArrayEnd();

    /**
     * Writes a field name to the internal buffer.
     *
     * @param fieldName The name of the field to write.
     */
    void writeFieldName(String fieldName);

    /**
     * Writes a string to the internal buffer.
     *
     * @param value The value of the string to write.
     */
    void writeStringValue(String value);

    /**
     * Writes a boolean to the internal buffer.
     *
     * @param value The value of the boolean to write.
     */
    void writeBoolValue(boolean value);

    /**
     * Writes a null to the internal buffer.
     */
    void writeNullValue();

    /**
     * Writes a single signed byte integer to the internal buffer.
     *
     * @param value The value of the integer to write.
     */
    void writeInt8Value(byte value);

    /**
     * Writes a signed 2-byte integer to the internal buffer.
     *
     * @param value The value of the integer to write.
     */
    void writeInt16Value(short value);

    /**
     * Writes a signed 4-byte integer to the internal buffer.
     *
     * @param value The value of the integer to write.
     */
    void writeInt32Value(int value);

    /**
     * Writes a signed 8-byte integer to the internal buffer.
     *
     * @param value The value of the integer to write.
     */
    void writeInt64Value(long value);

    /**
     * Writes a single precision floating point number into the internal buffer.
     *
     * @param value The value of the number to write.
     */
    void writeFloat32Value(float value);

    /**
     * Writes a double precision floating point number into the internal buffer.
     *
     * @param value The value of the number to write.
     */
    void writeFloat64Value(double value);

    /**
     * Writes a UUID value into the internal buffer.
     *
     * @param value The value of the Uuid to write.
     */
    void writeUuidValue(UUID value);

    /**
     * Writes a Binary value into the internal buffer.
     *
     * @param value The value of the bytes to write.
     */
    void writeBinaryValue(AtomicReference<Byte[]> value);

    /**
     * Gets the result of the JsonWriter.
     *
     * @return The result of the JsonWriter as an array of bytes.
     */
    AtomicReference<Byte[]> getResult();
}
