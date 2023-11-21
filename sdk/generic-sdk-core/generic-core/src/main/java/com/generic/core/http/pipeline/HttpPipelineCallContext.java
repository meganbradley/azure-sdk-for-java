// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.http.pipeline;

import com.generic.core.http.models.HttpRequest;
import com.generic.core.models.Context;

import java.util.Objects;
import java.util.Optional;

/**
 * Represents the information used to make a single HTTP request.
 */
public final class HttpPipelineCallContext {
    private HttpRequest httpRequest;
    private Context context;

    /**
     * Package private constructor. Creates an HttpPipelineCallContext instance.
     *
     * @param httpRequest The request for which context needs to be created.
     *
     * @throws IllegalArgumentException If there are multiple policies with same name.
     */
    HttpPipelineCallContext(HttpRequest httpRequest) {
        this(httpRequest, Context.NONE);
    }

    /**
     * Package private constructor. Creates an HttpPipelineCallContext instance.
     *
     * @param httpRequest The request for which context needs to be created.
     * @param context The data to associate with this context.
     *
     * @throws IllegalArgumentException If there are multiple policies with same name.
     */
    public HttpPipelineCallContext(HttpRequest httpRequest, Context context) {
        Objects.requireNonNull(httpRequest, "'httpRequest' cannot be null.");
        Objects.requireNonNull(context, "'data' cannot be null.");

        this.httpRequest = httpRequest;
        this.context = context;
    }

    /**
     * Stores a key-value data in the context.
     *
     * @param key The key to add.
     * @param value The value to associate with that key.
     */
    public void setData(String key, Object value) {
        this.context = this.context.addData(key, value);
    }

    /**
     * Gets a value with the given key stored in the context.
     *
     * @param key The key to find in the context.
     *
     * @return The value associated with the key.
     */
    public Optional<Object> getData(String key) {
        return this.context.getData(key);
    }

    /**
     * Gets the context associated to the HTTP call.
     *
     * <p>
     * The returned context is a snapshot of the data stored in this http pipeline call context.
     * </p>
     *
     * @return The context associated to the HTTP call.
     */
    public Context getContext() {
        return context;
    }

    /**
     * Gets the HTTP request.
     *
     * @return The HTTP request.
     */
    public HttpRequest getHttpRequest() {
        return this.httpRequest;
    }

    /**
     * Sets the HTTP request object in the context.
     *
     * @param request The HTTP request.
     *
     * @return The updated HttpPipelineCallContext object.
     */
    public HttpPipelineCallContext setHttpRequest(HttpRequest request) {
        this.httpRequest = request;

        return this;
    }
}
