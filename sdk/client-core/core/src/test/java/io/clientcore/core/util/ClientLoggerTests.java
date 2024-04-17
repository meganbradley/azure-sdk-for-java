// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package io.clientcore.core.util;

import io.clientcore.core.implementation.AccessibleByteArrayOutputStream;
import io.clientcore.core.implementation.util.DefaultLogger;
import io.clientcore.core.json.implementation.jackson.core.io.JsonStringEncoder;
import io.clientcore.core.util.ClientLogger.LogLevel;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for {@link ClientLogger}.
 */
public class ClientLoggerTests {
    private static final JsonStringEncoder JSON_STRING_ENCODER = JsonStringEncoder.getInstance();
    private static final String ESCAPED_NEW_LINE = new String(JSON_STRING_ENCODER.quoteAsString(System.lineSeparator()));
    private final AccessibleByteArrayOutputStream logCaptureStream;
    private final Map<String, Object> globalContext;

    public ClientLoggerTests() {
        this.logCaptureStream = new AccessibleByteArrayOutputStream();
        this.globalContext = new LinkedHashMap<>();
        this.globalContext.put("connectionId", "foo");
        this.globalContext.put("linkName", 1);
        this.globalContext.put("anotherKey", new LoggableObject("hello world"));
    }

    /**
     * Test whether the logger supports a given log level based on its configured log level.
     */
    @ParameterizedTest
    @MethodSource("singleLevelCheckSupplier")
    public void canLogAtLevel(LogLevel logLevelToConfigure, LogLevel logLevelToValidate, boolean expected) {
        ClientLogger clientLogger = setupLogLevelAndGetLogger(logLevelToConfigure);
        assertEquals(expected, clientLogger.canLogAtLevel(logLevelToValidate));
    }

    /**
     * Test whether a log will be captured when the ClientLogger and message are configured to the passed log levels.
     */
    @ParameterizedTest
    @MethodSource("singleLevelCheckSupplier")
    public void logSimpleMessage(LogLevel logLevelToConfigure, LogLevel logLevelToUse, boolean logContainsMessage) {
        String logMessage = "This is a test";

        logMessage(setupLogLevelAndGetLogger(logLevelToConfigure), logLevelToUse, logMessage);

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(logMessage));
    }

    /**
     * Test whether a log will be captured when the ClientLogger and message are configured to the passed log levels.
     */
    @ParameterizedTest
    @MethodSource("logMaliciousErrorSupplier")
    public void logMaliciousMessage(LogLevel logLevelToConfigure, LogLevel logLevelToUse) {
        String logMessage = "You have successfully authenticated, \r\n[INFO] User dummy was not"
            + " successfully authenticated.";

        String expectedMessage = "You have successfully authenticated, [INFO] User dummy was not"
            + " successfully authenticated.";

        logMessage(setupLogLevelAndGetLogger(logLevelToConfigure), logLevelToUse, logMessage);

        String logValues = byteArraySteamToString(logCaptureStream);
        System.out.println(logValues);
        // not removing new lines from log message
        assertTrue(logValues.contains(expectedMessage));
    }

    /**
     * Tests whether a log will contain the exception message when the ClientLogger and message are configured to the
     * passed log levels.
     */
    @ParameterizedTest
    @MethodSource("multiLevelCheckSupplier")
    public void logException(LogLevel logLevelToConfigure, LogLevel logLevelToUse, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String logMessage = "This is an exception";
        String exceptionMessage = "An exception message";
        RuntimeException runtimeException = createIllegalStateException(exceptionMessage);

        logMessage(setupLogLevelAndGetLogger(logLevelToConfigure), logLevelToUse, logMessage, runtimeException);

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(logMessage));
        assertEquals(logContainsStackTrace, logValues.contains(runtimeException.getStackTrace()[0].toString()));
    }

    /**
     * Tests that logging a RuntimeException as warning will log a message and stack trace appropriately based on the
     * configured log level.
     */
    @ParameterizedTest
    @MethodSource("logExceptionAsWarningSupplier")
    public void logThrowableAsWarning(LogLevel logLevelToConfigure, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String exceptionMessage = "An exception message";
        IOException ioException = createIOException(exceptionMessage);

        assertThrows(IOException.class, () -> {
            throw setupLogLevelAndGetLogger(logLevelToConfigure).logThrowableAsWarning(ioException);
        });

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(exceptionMessage));
        assertEquals(logContainsStackTrace, logValues.contains(ioException.getStackTrace()[0].toString()));
    }

    /**
     * Tests that logging a Throwable as warning will log a message and stack trace appropriately based on the
     * configured log level.
     */
    @ParameterizedTest
    @MethodSource("logExceptionAsWarningSupplier")
    public void logCheckedExceptionAsWarning(LogLevel logLevelToConfigure, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String exceptionMessage = "An exception message";
        IOException ioException = createIOException(exceptionMessage);

        assertThrows(IOException.class, () -> {
            throw setupLogLevelAndGetLogger(logLevelToConfigure).logThrowableAsWarning(ioException);
        });

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(exceptionMessage));
        assertEquals(logContainsStackTrace, logValues.contains(ioException.getStackTrace()[0].toString()));
    }

    /**
     * Tests that logging a RuntimeException as error will log a message and stack trace appropriately based on the
     * configured log level.
     */
    @ParameterizedTest
    @MethodSource("logExceptionAsErrorSupplier")
    public void logThrowableAsError(LogLevel logLevelToConfigure, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String exceptionMessage = "An exception message";
        IllegalStateException illegalStateException = createIllegalStateException(exceptionMessage);

        assertThrows(IllegalStateException.class, () -> {
            throw setupLogLevelAndGetLogger(logLevelToConfigure).logThrowableAsError(illegalStateException);
        });

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(exceptionMessage));
        assertEquals(logContainsStackTrace, logValues.contains(illegalStateException.getStackTrace()[0].toString()));
    }

    /**
     * Tests that logging a Throwable as error will log a message and stack trace appropriately based on the configured
     * log level.
     */
    @ParameterizedTest
    @MethodSource("logExceptionAsErrorSupplier")
    public void logCheckedExceptionAsError(LogLevel logLevelToConfigure, boolean logContainsMessage,
        boolean logContainsStackTrace) {
        String exceptionMessage = "An exception message";
        IOException ioException = createIOException(exceptionMessage);

        assertThrows(IOException.class, () -> {
            throw setupLogLevelAndGetLogger(logLevelToConfigure).logThrowableAsError(ioException);
        });

        String logValues = byteArraySteamToString(logCaptureStream);
        assertEquals(logContainsMessage, logValues.contains(exceptionMessage));
        assertEquals(logContainsStackTrace, logValues.contains(ioException.getStackTrace()[0].toString()));
    }

    /**
     * Tests that LogLevel.fromString returns the expected LogLevel enum based on the passed environment configuration.
     */
    @ParameterizedTest
    @MethodSource("validLogLevelSupplier")
    public void logLevelFromString(String environmentLogLevel, LogLevel expected) {
        assertEquals(expected, LogLevel.fromString(environmentLogLevel));
    }

    /**
     * Tests that LogLevel.fromString will throw an illegal argument exception when passed an environment configuration
     * it doesn't support.
     */
    @ParameterizedTest
    @ValueSource(strings = {"errs", "not_set", "12", "onlyErrorsPlease"})
    public void invalidLogLevelFromString(String environmentLogLevel) {
        assertThrows(IllegalArgumentException.class, () -> LogLevel.fromString(environmentLogLevel));
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithSupplier(LogLevel logLevel) {
        String message = String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3");
        ClientLogger logger = setupLogLevelAndGetLogger(logLevel);
        if (logLevel.equals(LogLevel.ERROR)) {
            logger.atError().log(message);
        } else if (logLevel.equals(LogLevel.WARNING)) {
            logger.atWarning().log(message);
        } else if (logLevel.equals(LogLevel.INFORMATIONAL)) {
            logger.atInfo().log(message);
        } else if (logLevel.equals(LogLevel.VERBOSE)) {
            logger.atVerbose().log(message);
        } else {
            throw new IllegalArgumentException("Unknown log level: " + logLevel);
        }

        String logValues = byteArraySteamToString(logCaptureStream);
        assertTrue(logValues.contains(message));
    }

    @Test
    public void logWithNewLine() {
        String message = String.format("Param 1: %s%s, Param 2: %s%s, Param 3: %s", "test1", System.lineSeparator(), "test2", System.lineSeparator(), "test3");
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);
        logger.atInfo().log(message);

        String logValues = byteArraySteamToString(logCaptureStream);
        assertTrue(logValues.contains("{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\"}"));
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithNullSupplier(LogLevel logLevel) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevel);
        if (logLevel.equals(LogLevel.ERROR)) {
            logger.atError().log(null);
        } else if (logLevel.equals(LogLevel.WARNING)) {
            logger.atWarning().log(null);
        } else if (logLevel.equals(LogLevel.INFORMATIONAL)) {
            logger.atInfo().log(null);
        } else if (logLevel.equals(LogLevel.VERBOSE)) {
            logger.atVerbose().log(null);
        } else {
            throw new IllegalArgumentException("Unknown log level: " + logLevel);
        }

        String logValues = byteArraySteamToString(logCaptureStream);
        assertTrue(logValues.isEmpty());
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logSupplierWithException(LogLevel logLevel) {
        NullPointerException exception = new NullPointerException();
        String message = String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3");
        ClientLogger logger = setupLogLevelAndGetLogger(logLevel);
        if (logLevel.equals(LogLevel.ERROR)) {
            logger.atError().log(message, exception);
        } else if (logLevel.equals(LogLevel.WARNING)) {
            logger.atWarning().log(message, exception);
        } else if (logLevel.equals(LogLevel.INFORMATIONAL)) {
            logger.atInfo().log(message, exception);
        } else if (logLevel.equals(LogLevel.VERBOSE)) {
            logger.atVerbose().log(message, exception);
        } else {
            throw new IllegalArgumentException("Unknown log level: " + logLevel);
        }
        String logValues = byteArraySteamToString(logCaptureStream);

        assertTrue(logValues.contains(message));
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logShouldEvaluateSupplierWithNullException(LogLevel logLevel) {
        String message = String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3");
        ClientLogger logger = setupLogLevelAndGetLogger(logLevel);
        if (logLevel.equals(LogLevel.ERROR)) {
            logger.atError().log(message, null);
        } else if (logLevel.equals(LogLevel.WARNING)) {
            logger.atWarning().log(message, null);
        } else if (logLevel.equals(LogLevel.INFORMATIONAL)) {
            logger.atInfo().log(message, null);
        } else if (logLevel.equals(LogLevel.VERBOSE)) {
            logger.atVerbose().log(message, null);
        } else {
            throw new IllegalArgumentException("Unknown log level: " + logLevel);
        }

        String logValues = byteArraySteamToString(logCaptureStream);
        assertTrue(logValues.contains(message));
    }

    /**
     * Tests that logging with context of string message writes
     * log message and context in correct format and depending on the level.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String message = String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3");

        logger.atWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", 1)
            .log(message);

        assertMessage(
            "{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\",\"connectionId\":\"foo\",\"linkName\":1}",
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.WARNING);
    }

    /**
     * Tests that logging with context of string message writes
     * log message and global context in correct format and depending on the level.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithGlobalContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure, globalContext);
        logger.atWarning().log(String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3"));

        assertMessage(
            "{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\",\"connectionId\":\"foo\",\"linkName\":1,\"anotherKey\":\"hello world\"}",
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.WARNING);
    }

    /**
     * Tests that logging with context of string message writes
     * log message and global context in correct format at info level
     */
    @Test
    public void logInfoWithGlobalContext() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE, globalContext);
        logger.atInfo().log("message");

        assertMessage(
            "{\"message\":\"message\",\"connectionId\":\"foo\",\"linkName\":1,\"anotherKey\":\"hello world\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.VERBOSE,
            LogLevel.VERBOSE);
    }

    /**
     * Tests that logging with context of string message writes
     * log message and global context in correct format at verbose level
     */
    @Test
    public void logVerboseWithGlobalContext() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE, globalContext);
        logger.atVerbose().log("message");

        assertMessage(
            "{\"message\":\"message\",\"connectionId\":\"foo\",\"linkName\":1,\"anotherKey\":\"hello world\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.VERBOSE,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that logging with context of string message writes
     * log message and global context in correct format at warning level
     */
    @Test
    public void logWarningWithGlobalContext() {
        setupLogLevelAndGetLogger(LogLevel.VERBOSE, globalContext)
            .atWarning().log("message");

        assertMessage(
            "{\"message\":\"message\",\"connectionId\":\"foo\",\"linkName\":1,\"anotherKey\":\"hello world\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.VERBOSE,
            LogLevel.WARNING);
    }

    /**
     * Tests that logging with context of string message writes
     * log message and global context in correct format at error level
     */
    @Test
    public void logErrorWithGlobalContext() {
        setupLogLevelAndGetLogger(LogLevel.VERBOSE, globalContext)
            .atError().log("message");

        assertMessage(
            "{\"message\":\"message\",\"connectionId\":\"foo\",\"linkName\":1,\"anotherKey\":\"hello world\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.VERBOSE,
            LogLevel.ERROR);
    }

    /**
     * Tests empty global context
     */
    @Test
    public void logWithEmptyGlobalContext() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL, Collections.emptyMap());
        logger.atWarning().log(String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3"));

        assertMessage(
            "{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.INFORMATIONAL,
            LogLevel.WARNING);
    }

    /**
     * Tests null global context
     */
    @Test
    public void logWithNullGlobalContext() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL, null);
        logger.atInfo().log(String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3"));

        assertMessage(
            "{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.INFORMATIONAL,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that logging with context of string message writes
     * log message and local and globacl context in correct format and depending on the level.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithGlobalAndLocalContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure, globalContext);
        logger.atInfo()
            .addKeyValue("local", true)
            .addKeyValue("connectionId", "conflict")
            .log(String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3"));

        assertMessage(
            "{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\",\"connectionId\":\"foo\",\"linkName\":1,\"anotherKey\":\"hello world\",\"local\":true,\"connectionId\":\"conflict\"}",
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that contextual logging without context of string message writes
     * log message and context in correct format and depending on the level.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void contextualLogWithoutContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        logger.atWarning().log(String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3"));

        assertMessage(
            "{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\"}",
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.WARNING);
    }


    /**
     * Tests message supplier with local and global context.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithGlobalContextMessageSupplier(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure, globalContext);

        logger.atInfo().log(String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3"));

        assertMessage(
            "{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\",\"connectionId\":\"foo\",\"linkName\":1,\"anotherKey\":\"hello world\"}",
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests message supplier with context.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextMessageSupplier(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String message = String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3");

        logger.atInfo()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .log(message);

        assertMessage(
            "{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\",\"connectionId\":\"foo\",\"linkName\":\"bar\"}",
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that logging with context with null message does not throw.
     */
    @Test
    public void logWithContextNullMessage() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE);

        logger.atVerbose()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", true)
            .log(null);

        assertMessage(
            "{\"message\":\"\",\"connectionId\":\"foo\",\"linkName\":true}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.VERBOSE,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that newline is escaped in message, keys and values.
     */
    @Test
    public void logWithContextNewLineIsEscaped() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE);

        logger.atVerbose()
            .addKeyValue("connection\nId" + System.lineSeparator(), "foo")
            .addKeyValue("link\r\nName", "test" + System.lineSeparator() + "me")
            .log("multiline " + System.lineSeparator() + "message");

        assertMessage(
            "{\"message\":\"multiline " + "message\",\"connection\\nId" + ESCAPED_NEW_LINE + "\":\"foo\",\"link\\r\\nName\":\"test" + ESCAPED_NEW_LINE + "me\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.VERBOSE,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that global context is escaped
     */
    @Test
    public void logWithGlobalContextIsEscaped() {
        // preserve order
        Map<String, Object> globalCtx = new LinkedHashMap<>();
        globalCtx.put("link\tName", 1);
        globalCtx.put("another\rKey\n", new LoggableObject("hello \"world\"\r\n"));

        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE, globalCtx);

        logger.atVerbose().log("\"message\"");

        assertMessage(
            "{\"message\":\"\\\"message\\\"\",\"link\\tName\":1,\"another\\rKey\\n\":\"hello \\\"world\\\"\\r\\n\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.VERBOSE,
            LogLevel.INFORMATIONAL);
    }

    /**
     * Tests that logging with context with null message supplier does not throw.
     */
    @Test
    public void logWithContextNullSupplier() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        logger.atError()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", (String) null)
            .log(null);

        assertMessage(
            "{\"message\":\"\",\"connectionId\":\"foo\",\"linkName\":null}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.INFORMATIONAL,
            LogLevel.ERROR);
    }

    /**
     * Tests supplied context value.
     */
    @Test
    public void logWithContextValueSupplier() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        logger.atWarning()
            // this is technically invalid, but we should not throw because of logging in runtime
            .addKeyValue("connectionId", (Supplier<String>) null)
            .addKeyValue("linkName", () -> String.format("complex value %s", 123))
            .log("test");

        assertMessage(
            "{\"message\":\"test\",\"connectionId\":null,\"linkName\":\"complex value 123\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.INFORMATIONAL,
            LogLevel.WARNING);
    }

    /**
     * Tests supplied context value.
     */
    @Test
    public void logWithContextObject() {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        logger.atWarning()
            .addKeyValue("linkName", new LoggableObject("some complex object"))
            .log("test");

        assertMessage(
            "{\"message\":\"test\",\"linkName\":\"some complex object\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.INFORMATIONAL,
            LogLevel.WARNING);
    }

    /**
     * Tests message with args and context.
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logMessageAndArgsWithContext(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        logger.atWarning()
            .addKeyValue("connectionId", () -> null)
            .addKeyValue("linkName", "bar")
            .log(String.format("Param 1: %s, Param 2: %s, Param 3: %s", "test1", "test2", "test3"));

        assertMessage(
            "{\"message\":\"Param 1: test1, Param 2: test2, Param 3: test3\",\"connectionId\":null,\"linkName\":\"bar\"}",
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.WARNING);
    }

    /**
     * Tests logging with context when args have throwable (stack trace is only logged at debug)
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextWithThrowableInArgs(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception message";
        RuntimeException runtimeException = createIllegalStateException(exceptionMessage);

        logger.atWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .log(String.format("Don't format strings when writing logs, %s!", "please"), runtimeException);

        String message = "{\"message\":\"Don't format strings when writing logs, please!\",\"connectionId\":\"foo\",\"linkName\":\"bar\",\"exception.message\":\"" + exceptionMessage + "\"}";
        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            message = message.substring(0, message.length() - 1);
            message += ",\"exception.stacktrace\":\""  + stackTraceToString(runtimeException) + "\"}";
        }

        assertMessage(
            message,
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.WARNING);
    }

    /**
     * Tests logging with context and supplied message when args have throwable (stack trace is only logged at debug)
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextMessageSupplierAndThrowableInArgs(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception message";
        IOException ioException = createIOException(exceptionMessage);

        logger.atWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .log(String.format("hello %s", "world"), ioException);

        String message = "{\"message\":\"hello world\",\"connectionId\":\"foo\",\"linkName\":\"bar\",\"exception.message\":\"" + exceptionMessage + "\"}";
        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            message = message.substring(0, message.length() - 1);
            StringBuilder stackTrace = new StringBuilder();
            message += ",\"exception.stacktrace\":\""  + stackTraceToString(ioException) + "\"}";
        }

        assertMessage(
            message,
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.WARNING);
    }

    /**
     * Tests json escape in keys, values, message and exception message
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextWithThrowableInArgsAndEscaping(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception \tmessage with \"special characters\"\r\n";
        RuntimeException runtimeException = createIllegalStateException(exceptionMessage);

        logger.atWarning()
            .addKeyValue("connection\tId", "foo")
            .addKeyValue("linkName", "\rbar")
            .log(String.format("hello %s, \"and\" {more}", "world"), runtimeException);


        String escapedExceptionMessage = "An exception \\tmessage with \\\"special characters\\\"\\r\\n";

        String expectedMessage = "{\"message\":\"hello world, \\\"and\\\" {more}\",\"connection\\tId\":\"foo\",\"linkName\":\"\\rbar\",\"exception.message\":\"" + escapedExceptionMessage + "\"}";
        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            expectedMessage = expectedMessage.substring(0, expectedMessage.length() - 1);
            expectedMessage += ",\"exception.stacktrace\":\""  + stackTraceToString(runtimeException) + "\"}";
        }

        assertMessage(
            expectedMessage,
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.WARNING);
    }

    /**
     * Tests logging with context when cause is set
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextRuntimeException(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception message";
        RuntimeException runtimeException = createIllegalStateException(exceptionMessage);

        assertSame(runtimeException, logger.atWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .log(null, runtimeException));

        String message = "{\"message\":\"\",\"connectionId\":\"foo\",\"linkName\":\"bar\",\"exception.message\":\"" + exceptionMessage + "\"}";
        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            message = message.substring(0, message.length() - 1);
            message += ",\"exception.stacktrace\":\"" + stackTraceToString(runtimeException) + "\"}";
        }

        assertMessage(
            message,
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.WARNING);
    }

    /**
     * Tests logging with context when cause is set
     */
    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logWithContextThrowable(LogLevel logLevelToConfigure) {
        ClientLogger logger = setupLogLevelAndGetLogger(logLevelToConfigure);

        String exceptionMessage = "An exception message";
        IOException ioException = createIOException(exceptionMessage);

        assertSame(ioException, logger.atWarning()
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .log(null, ioException));

        String message = "{\"message\":\"\",\"connectionId\":\"foo\",\"linkName\":\"bar\",\"exception.message\":\"" + exceptionMessage + "\"}";
        if (logLevelToConfigure.equals(LogLevel.VERBOSE)) {
            message = message.substring(0, message.length() - 1);
            message += ",\"exception.stacktrace\":\""  + stackTraceToString(ioException) + "\"}";
        }

        assertMessage(
            message,
            byteArraySteamToString(logCaptureStream),
            logLevelToConfigure,
            LogLevel.WARNING);
    }

    @Test
    public void logSupplierShouldLogExceptionOnVerboseLevel() {
        NullPointerException exception = new NullPointerException();
        String message = "A log message";
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.VERBOSE);
        String expectedStackTrace = stackTraceToString(exception);
        logger.atVerbose().log(message, exception);

        String logValues = byteArraySteamToString(logCaptureStream);

        assertTrue(logValues.contains(message));
        assertTrue(logValues.contains(expectedStackTrace));
    }

    @ParameterizedTest
    @MethodSource("provideLogLevels")
    public void logAtLevel(LogLevel level) {
        ClientLogger logger = setupLogLevelAndGetLogger(LogLevel.INFORMATIONAL);

        logger.atLevel(level)
            .addKeyValue("connectionId", "foo")
            .addKeyValue("linkName", "bar")
            .log("message");

        assertMessage(
            "{\"message\":\"message\",\"connectionId\":\"foo\",\"linkName\":\"bar\"}",
            byteArraySteamToString(logCaptureStream),
            LogLevel.INFORMATIONAL,
            level);
    }

    private String stackTraceToString(Throwable exception) {
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter(stringWriter));
        StringBuilder sb = new StringBuilder();
        JSON_STRING_ENCODER.quoteAsString(stringWriter.toString().trim(), sb);
        return sb.toString();
    }

    private ClientLogger setupLogLevelAndGetLogger(LogLevel logLevelToSet) {
        return setupLogLevelAndGetLogger(logLevelToSet, null);
    }

    private ClientLogger setupLogLevelAndGetLogger(LogLevel logLevelToSet, Map<String, Object> globalContext) {
        Logger logger = new DefaultLogger(ClientLogger.class.getName(), new PrintStream(logCaptureStream),
            logLevelToSet);

        return new ClientLogger(logger, globalContext);
    }

    private void logMessage(ClientLogger logger, LogLevel logLevel, String logMessage, RuntimeException runtimeException) {
        if (logLevel == null) {
            return;
        }

        switch (logLevel) {
            case VERBOSE:
                logger.atVerbose().log(logMessage, runtimeException);
                break;
            case INFORMATIONAL:
                logger.atInfo().log(logMessage, runtimeException);
                break;
            case WARNING:
                logger.atWarning().log(logMessage, runtimeException);
                break;
            case ERROR:
                logger.atError().log(logMessage, runtimeException);
                break;
            default:
                break;
        }
    }

    private void logMessage(ClientLogger logger, LogLevel logLevel, String logMessage) {
        if (logLevel == null) {
            return;
        }

        switch (logLevel) {
            case VERBOSE:
                logger.atVerbose().log(logMessage);
                break;
            case INFORMATIONAL:
                logger.atInfo().log(logMessage);
                break;
            case WARNING:
                logger.atWarning().log(logMessage);
                break;
            case ERROR:
                logger.atError().log(logMessage);
                break;
            default:
                break;
        }
    }

    private static IllegalStateException createIllegalStateException(String message) {
        return fillInStackTrace(new IllegalStateException(message));
    }

    private static IOException createIOException(String message) {
        return fillInStackTrace(new IOException(message));
    }

    private static <T extends Throwable> T fillInStackTrace(T throwable) {
        StackTraceElement[] stackTraceElements
            = { new StackTraceElement("ClientLoggerTests", "onlyLogExceptionMessage", "ClientLoggerTests", 117) };
        throwable.setStackTrace(stackTraceElements);

        return throwable;
    }

    private static String byteArraySteamToString(AccessibleByteArrayOutputStream stream) {
        return stream.toString(StandardCharsets.UTF_8);
    }

    private void assertMessage(String expectedMessage, String fullLog, LogLevel configuredLevel, LogLevel loggedLevel) {
        if (loggedLevel.compareTo(configuredLevel) >= 0) {
            // remove date/time/level/etc from fullMessage
            assertEquals(expectedMessage + System.lineSeparator(), fullLog.substring(fullLog.indexOf(" - ") + 3));
        } else {
            assertEquals("", fullLog);
        }
    }

    private static Stream<Arguments> singleLevelCheckSupplier() {
        return Stream.of(
            // Supported logging level set to VERBOSE.
            // Checking VERBOSE.
            Arguments.of(LogLevel.VERBOSE, LogLevel.VERBOSE, true),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.VERBOSE, LogLevel.INFORMATIONAL, true),

            // Checking WARNING.
            Arguments.of(LogLevel.VERBOSE, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.VERBOSE, LogLevel.ERROR, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.VERBOSE, LogLevel.NOTSET, false),

            // Checking null.
            Arguments.of(LogLevel.VERBOSE, null, false),

            // Supported logging level set to INFORMATIONAL.
            // Checking VERBOSE.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.VERBOSE, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.INFORMATIONAL, true),

            // Checking WARNING.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.ERROR, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.NOTSET, false),

            // Checking null.
            Arguments.of(LogLevel.INFORMATIONAL, null, false),

            // Supported logging level set to WARNING.
            // Checking VERBOSE.
            Arguments.of(LogLevel.WARNING, LogLevel.VERBOSE, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.WARNING, LogLevel.INFORMATIONAL, false),

            // Checking WARNING.
            Arguments.of(LogLevel.WARNING, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.WARNING, LogLevel.ERROR, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.WARNING, LogLevel.NOTSET, false),

            // Checking null.
            Arguments.of(LogLevel.WARNING, null, false),

            // Supported logging level set to ERROR.
            // Checking VERBOSE.
            Arguments.of(LogLevel.ERROR, LogLevel.VERBOSE, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.ERROR, LogLevel.INFORMATIONAL, false),

            // Checking WARNING.
            Arguments.of(LogLevel.ERROR, LogLevel.WARNING, false),

            // Checking ERROR.
            Arguments.of(LogLevel.ERROR, LogLevel.ERROR, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.VERBOSE, LogLevel.NOTSET, false),

            // Checking null.
            Arguments.of(LogLevel.VERBOSE, null, false));
    }

    private static Stream<Arguments> multiLevelCheckSupplier() {
        return Stream.of(
            // Supported logging level set to VERBOSE.
            // Checking VERBOSE.
            Arguments.of(LogLevel.VERBOSE, LogLevel.VERBOSE, true, true),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.VERBOSE, LogLevel.INFORMATIONAL, true, true),

            // Checking WARNING.
            Arguments.of(LogLevel.VERBOSE, LogLevel.WARNING, true, true),

            // Checking ERROR.
            Arguments.of(LogLevel.VERBOSE, LogLevel.ERROR, true, true),

            // Checking NOT_SET.
            Arguments.of(LogLevel.VERBOSE, LogLevel.NOTSET, false, false),

            // Checking null.
            Arguments.of(LogLevel.VERBOSE, null, false, false),

            // Supported logging level set to INFORMATIONAL.
            // Checking VERBOSE.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.VERBOSE, false, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.INFORMATIONAL, true, false),

            // Checking WARNING.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.WARNING, true, false),

            // Checking ERROR.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.ERROR, true, false),

            // Checking NOT_SET.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.NOTSET, false, false),

            // Checking null.
            Arguments.of(LogLevel.INFORMATIONAL, null, false, false),

            // Supported logging level set to WARNING.
            // Checking VERBOSE.
            Arguments.of(LogLevel.WARNING, LogLevel.VERBOSE, false, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.WARNING, LogLevel.INFORMATIONAL, false, false),

            // Checking WARNING.
            Arguments.of(LogLevel.WARNING, LogLevel.WARNING, true, false),

            // Checking ERROR.
            Arguments.of(LogLevel.WARNING, LogLevel.ERROR, true, false),

            // Checking NOT_SET.
            Arguments.of(LogLevel.WARNING, LogLevel.NOTSET, false, false),

            // Checking null.
            Arguments.of(LogLevel.WARNING, null, false, false),

            // Supported logging level set to ERROR.
            // Checking VERBOSE.
            Arguments.of(LogLevel.ERROR, LogLevel.VERBOSE, false, false),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.ERROR, LogLevel.INFORMATIONAL, false, false),

            // Checking WARNING.
            Arguments.of(LogLevel.ERROR, LogLevel.WARNING, false, false),

            // Checking ERROR.
            Arguments.of(LogLevel.ERROR, LogLevel.ERROR, true, false),

            // Checking NOT_SET.
            Arguments.of(LogLevel.VERBOSE, LogLevel.NOTSET, false, false),

            // Checking null.
            Arguments.of(LogLevel.VERBOSE, null, false, false));
    }

    private static Stream<Arguments> logMaliciousErrorSupplier() {
        return Stream.of(
            // Supported logging level set to VERBOSE.
            // Checking VERBOSE.
            Arguments.of(LogLevel.VERBOSE, LogLevel.VERBOSE, true),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.VERBOSE, LogLevel.INFORMATIONAL, true),

            // Checking WARNING.
            Arguments.of(LogLevel.VERBOSE, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.VERBOSE, LogLevel.ERROR, true),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.INFORMATIONAL, true),

            // Checking WARNING.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.INFORMATIONAL, LogLevel.ERROR, true),

            // Checking WARNING.
            Arguments.of(LogLevel.WARNING, LogLevel.WARNING, true),

            // Checking ERROR.
            Arguments.of(LogLevel.WARNING, LogLevel.ERROR, true),

            // Checking ERROR.
            Arguments.of(LogLevel.ERROR, LogLevel.ERROR, true));
    }

    private static Stream<Arguments> provideLogLevels() {
        return Stream.of(

            // Checking VERBOSE.
            Arguments.of(LogLevel.VERBOSE),

            // Checking WARNING.
            Arguments.of(LogLevel.WARNING),

            // Checking INFORMATIONAL.
            Arguments.of(LogLevel.INFORMATIONAL),

            // Checking ERROR.
            Arguments.of(LogLevel.ERROR));
    }

    private static Stream<Arguments> logExceptionAsWarningSupplier() {
        return Stream.of(
            Arguments.of(LogLevel.VERBOSE, true, true),
            Arguments.of(LogLevel.INFORMATIONAL, true, false),
            Arguments.of(LogLevel.WARNING, true, false),
            Arguments.of(LogLevel.ERROR, false, false),
            Arguments.of(LogLevel.NOTSET, false, false)
        );
    }

    private static Stream<Arguments> logExceptionAsErrorSupplier() {
        return Stream.of(
            Arguments.of(LogLevel.VERBOSE, true, true),
            Arguments.of(LogLevel.INFORMATIONAL, true, false),
            Arguments.of(LogLevel.WARNING, true, false),
            Arguments.of(LogLevel.ERROR, true, false),
            Arguments.of(LogLevel.NOTSET, false, false)
        );
    }

    private static Stream<Arguments> validLogLevelSupplier() {
        return Stream.of(
            // Valid VERBOSE environment variables.
            Arguments.of("1", LogLevel.VERBOSE),
            Arguments.of("verbose", LogLevel.VERBOSE),
            Arguments.of("debug", LogLevel.VERBOSE),
            Arguments.of("deBUG", LogLevel.VERBOSE),

            // Valid INFORMATIONAL environment variables.
            Arguments.of("2", LogLevel.INFORMATIONAL),
            Arguments.of("info", LogLevel.INFORMATIONAL),
            Arguments.of("information", LogLevel.INFORMATIONAL),
            Arguments.of("informational", LogLevel.INFORMATIONAL),
            Arguments.of("InForMATiONaL", LogLevel.INFORMATIONAL),

            // Valid WARNING environment variables.
            Arguments.of("3", LogLevel.WARNING),
            Arguments.of("warn", LogLevel.WARNING),
            Arguments.of("warning", LogLevel.WARNING),
            Arguments.of("WARniNg", LogLevel.WARNING),

            // Valid ERROR environment variables.
            Arguments.of("4", LogLevel.ERROR),
            Arguments.of("err", LogLevel.ERROR),
            Arguments.of("error", LogLevel.ERROR),
            Arguments.of("ErRoR", LogLevel.ERROR),

            // Valid NOT_SET environment variables.
            Arguments.of("0", LogLevel.NOTSET),
            Arguments.of(null, LogLevel.NOTSET)
        );
    }

    static class LoggableObject {
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
