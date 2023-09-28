// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.util.logging;

import com.client.core.http.rest.Response;
import com.client.core.http.rest.SimpleResponse;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Code snippets for {@link ClientLogger} javadocs
 */
public class ClientLoggerJavaDocCodeSnippets {

    /**
     * Code snippets to show usage of {@link ClientLogger} at all log levels
     */
    public void loggingSnippets() {

        ClientLogger logger = new ClientLogger(ClientLoggerJavaDocCodeSnippets.class);
        String name = getName();

        // BEGIN: com.client.core.util.logging.clientlogger.verbose
        logger.verbose("A log message");
        // END: com.client.core.util.logging.clientlogger.verbose

        // BEGIN: com.client.core.util.logging.clientlogger.verbose#string-object
        logger.verbose("A formattable message. Hello, {}", name);
        // END: com.client.core.util.logging.clientlogger.verbose#string-object

        // BEGIN: com.client.core.util.logging.clientlogger.info
        logger.info("A log message");
        // END: com.client.core.util.logging.clientlogger.info

        // BEGIN: com.client.core.util.logging.clientlogger.info#string-object
        logger.info("A formattable message. Hello, {}", name);
        // END: com.client.core.util.logging.clientlogger.info#string-object

        // BEGIN: com.client.core.util.logging.clientlogger.log
        logger.log(LogLevel.VERBOSE,
            () -> String.format("Param 1: %s, Param 2: %s, Param 3: %s", "param1", "param2", "param3"));
        // END: com.client.core.util.logging.clientlogger.log

        // BEGIN: com.client.core.util.logging.clientlogger.log#throwable
        Throwable illegalArgumentException = new IllegalArgumentException("An invalid argument was encountered.");
        logger.log(LogLevel.VERBOSE,
            () -> String.format("Param 1: %s, Param 2: %s, Param 3: %s", "param1", "param2", "param3"),
            illegalArgumentException);
        // END: com.client.core.util.logging.clientlogger.log#throwable

        // BEGIN: com.client.core.util.logging.clientlogger.warning
        Throwable detailedException = new IllegalArgumentException("A exception with a detailed message");
        logger.warning(detailedException.getMessage());
        // END: com.client.core.util.logging.clientlogger.warning

        // BEGIN: com.client.core.util.logging.clientlogger.warning#string-object
        Throwable exception = new IllegalArgumentException("An invalid argument was encountered.");
        logger.warning("A formattable message. Hello, {}", name, exception);
        // END: com.client.core.util.logging.clientlogger.warning#string-object

        File resource = getFile();
        // BEGIN: com.client.core.util.logging.clientlogger.error
        try {
            upload(resource);
        } catch (IOException ex) {
            logger.error(ex.getMessage());
        }
        // END: com.client.core.util.logging.clientlogger.error

        // BEGIN: com.client.core.util.logging.clientlogger.error#string-object
        try {
            upload(resource);
        } catch (IOException ex) {
            logger.error("A formattable message. Hello, {}", name, ex);
        }
        // END: com.client.core.util.logging.clientlogger.error#string-object

        // BEGIN: com.client.core.util.logging.clientlogger#globalcontext
        Map<String, Object> context = new HashMap<>();
        context.put("connectionId", "95a47cf");

        ClientLogger loggerWithContext = new ClientLogger(ClientLoggerJavaDocCodeSnippets.class, context);
        loggerWithContext.info("A formattable message. Hello, {}", name);
        // END: com.client.core.util.logging.clientlogger#globalcontext

        // BEGIN: com.client.core.util.logging.clientlogger.atInfo
        logger.atInfo()
            .addKeyValue("key", "value")
            .log("A formattable message. Hello, {}", name);
        // END: com.client.core.util.logging.clientlogger.atInfo

        // BEGIN: com.client.core.util.logging.clientlogger.atWarning
        logger.atWarning()
            .addKeyValue("key", "value")
            .log("A formattable message. Hello, {}", name, exception);
        // END: com.client.core.util.logging.clientlogger.atWarning

        // BEGIN: com.client.core.util.logging.clientlogger.atError#deffered-value
        try {
            upload(resource);
        } catch (IOException ex) {
            logger.atError()
                .addKeyValue("key", () -> "Expensive to calculate value")
                .log("A formattable message. Hello, {}", name, ex);
        }
        // END: com.client.core.util.logging.clientlogger.atError#deffered-value

        Response<Void> response = getResponse();
        // BEGIN: com.client.core.util.logging.clientlogger.atLevel
        LogLevel level = response.getStatusCode() == 200 ? LogLevel.INFORMATIONAL : LogLevel.WARNING;
        logger.atLevel(level)
            .addKeyValue("key", "value")
            .log("message");
        // END: com.client.core.util.logging.clientlogger.atLevel

        // BEGIN: com.client.core.util.logging.clientlogger.atverbose.addKeyValue#primitive
        logger.atVerbose()
            .addKeyValue("key", 1L)
            .log(() -> String.format("Param 1: %s, Param 2: %s, Param 3: %s", "param1", "param2", "param3"));
        // END: com.client.core.util.logging.clientlogger.atverbose.addKeyValue#primitive

        // BEGIN: com.client.core.util.logging.loggingeventbuilder
        logger.atInfo()
            .addKeyValue("key1", "value1")
            .addKeyValue("key2", true)
            .addKeyValue("key3", () -> getName())
            .log("A formattable message. Hello, {}", name);
        // END: com.client.core.util.logging.loggingeventbuilder

        // BEGIN: com.client.core.util.logging.clientlogger.atverbose.addKeyValue#object
        logger.atVerbose()
            // equivalent to addKeyValue("key", () -> new LoggableObject("string representation").toString()
            .addKeyValue("key", new LoggableObject("string representation"))
            .log("Param 1: {}, Param 2: {}, Param 3: {}", "param1", "param2", "param3");
        // END: com.client.core.util.logging.clientlogger.atverbose.addKeyValue#object
    }

    private Response<Void> getResponse() {
        return new SimpleResponse<Void>(null, 200, null, null);
    }

    /**
     * Implementation not provided
     *
     * @return {@code null}
     */
    private File getFile() {
        return null;
    }

    /**
     * Implementation not provided
     *
     * @return {@code null}
     */
    private String getName() {
        return null;
    }

    /**
     * Implementation not provided
     *
     * @param resource A file resource
     * @throws IOException if upload fails
     */
    private void upload(File resource) throws IOException {
        throw new IOException();
    }

    class LoggableObject {
        private final String str;
        LoggableObject(String str) {
            this.str = str;
        }

        @Override
        public String toString() {
            return str;
        }
    }
}
