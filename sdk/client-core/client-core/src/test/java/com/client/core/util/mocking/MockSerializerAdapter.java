// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.util.mocking;

import com.client.core.http.HttpHeaders;
import com.client.core.util.serializer.CollectionFormat;
import com.client.core.util.serializer.SerializerAdapter;
import com.client.core.util.serializer.SerializerEncoding;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/**
 * A serializer adapter used for mocking in tests.
 */
public class MockSerializerAdapter implements SerializerAdapter {
    @Override
    public String serialize(Object object, SerializerEncoding encoding) throws IOException {
        return null;
    }

    @Override
    public String serializeRaw(Object object) {
        return null;
    }

    @Override
    public String serializeList(List<?> list, CollectionFormat format) {
        return null;
    }

    @Override
    public <T> T deserialize(String value, Type type, SerializerEncoding encoding) throws IOException {
        return null;
    }

    @Override
    public <T> T deserialize(HttpHeaders headers, Type type) throws IOException {
        return null;
    }
}
