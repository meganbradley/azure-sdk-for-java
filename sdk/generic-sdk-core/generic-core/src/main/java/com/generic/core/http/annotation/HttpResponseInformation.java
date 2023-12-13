// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.http.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * Annotation describing the relative path to a REST endpoint and the method to use alongside it.
 *
 * <p>The required value can be either a relative path or an absolute path. When it's an absolute path, it must start
 * with a protocol or a parameterized segment (otherwise the parse cannot tell if it's absolute or relative).</p>
 *
 * <!-- TODO (vcolin7): Add samples. -->
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface HttpResponseInformation {
    /**
     * Get expected the status code(s) to receive with a response.
     *
     * @return The expected status code(s) to receive with a response.
     */
    int[] expectedStatusCodes() default {};

    /**
     * Get the type of the request body.
     *
     * @return The type of the request body.
     */
    Class<?> returnValueWireType() default Void.class;

    /**
     * Get the list of static headers to send with the request.
     *
     * @return The list of static headers to send with the request.
     */
    String[] headers() default {};

    /**
     * Get the delimiter to use for headers.
     *
     * @return The delimiter to use for headers.
     */
    // TODO (vcolin7): Handle this in SwaggerMethodParser.
    String headerDelimiter() default ";";
}
