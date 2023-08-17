// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.implementation.instrumentation;

import com.azure.core.util.Context;
import com.azure.core.util.metrics.Meter;
import com.azure.core.util.tracing.Tracer;
import com.azure.messaging.servicebus.ServiceBusReceivedMessage;
import com.azure.messaging.servicebus.implementation.DispositionStatus;
import reactor.core.Disposable;
import reactor.core.Disposables;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Contains convenience methods to instrument specific calls with traces and metrics.
 */
public final class ServiceBusReceiverInstrumentation {
    private final ServiceBusMeter meter;
    private final ServiceBusTracer tracer;
    private final ReceiverKind receiverKind;

    public ServiceBusReceiverInstrumentation(Tracer tracer, Meter meter, String fullyQualifiedName, String entityPath, String subscriptionName, ReceiverKind receiverKind) {
        this.tracer = new ServiceBusTracer(tracer, fullyQualifiedName, entityPath);
        this.meter = new ServiceBusMeter(meter, fullyQualifiedName, entityPath, subscriptionName);
        this.receiverKind = receiverKind;
    }

    /**
     * Creates subscription to report last settled sequence number. Call it in client constructor
     * and close along with client.
     */
    public AutoCloseable startTrackingSettlementSequenceNumber() {
        return meter.isSettlementEnabled() ? this.meter.trackSettlementSequenceNumber() : null;
    }

    /**
     * Checks if any receiver instrumentation is enabled
     */
    public boolean isEnabled() {
        return tracer.isEnabled() || meter.isSettlementEnabled() || meter.isConsumerLagEnabled();
    }

    /**
     * Checks if the instrumentation is created for processor client.
     * @return
     */
    public boolean isProcessorInstrumentation() {
        return receiverKind == ReceiverKind.PROCESSOR;
    }

    /**
     * Instruments even processing. For Processor traces processMessage callback, for async receiver
     * traces subscriber call. Does not trace anything for sync receiver - use {@link ServiceBusTracer#traceSyncReceive(String, Flux)}
     * for sync receiver.
     * Reports consumer lag metric.
     */
    public Context startProcessInstrumentation(String name, ServiceBusReceivedMessage message, Context parent) {
        if (message == null || (!tracer.isEnabled() && !meter.isConsumerLagEnabled())) {
            return parent;
        }

        Context span = (tracer.isEnabled() && receiverKind != ReceiverKind.SYNC_RECEIVER) ? tracer.startProcessSpan(name, message, parent) : parent;

        // important to record metric after span is started
        meter.reportConsumerLag(message.getEnqueuedTime(), span);

        return span;
    }

    public void instrumentProcess(ServiceBusReceivedMessage message, ReceiverKind caller, Function<ServiceBusReceivedMessage, Throwable> handleMessage) {
        if (receiverKind != caller) {
            handleMessage.apply(message);
            return;
        }

        Context span = startProcessInstrumentation("ServiceBus.process", message, Context.NONE);
        ContextAccessor.setContext(message, span);
        AutoCloseable scope = tracer.makeSpanCurrent(span);
        Throwable error = null;
        try {
            error = handleMessage.apply(message);
        } catch (Throwable t) {
            error = t;
            throw t;
        } finally {
            tracer.endSpan(error, span, scope);
        }
    }

    /**
     * Instruments settlement calls. Creates a span for settlement call and reports settlement metrics.
     */
    public <T> Mono<T> instrumentSettlement(Mono<T> publisher, ServiceBusReceivedMessage message, Context messageContext, DispositionStatus status) {
        if (tracer.isEnabled() || meter.isSettlementEnabled()) {
            return Mono.defer(() -> {
                long startTime = Instant.now().toEpochMilli();
                Context span = tracer.startSpanWithLink(getSettlementSpanName(status), ServiceBusTracer.OperationName.SETTLE,
                    message, messageContext);
                return publisher
                    .doOnEach(signal -> {
                        meter.reportSettlement(startTime, message.getSequenceNumber(), status, signal.getThrowable(), false, span);
                        tracer.endSpan(signal.getThrowable(), span, null);
                    })
                    .doOnCancel(() -> {
                        meter.reportSettlement(startTime, message.getSequenceNumber(), status, null, true, span);
                        tracer.cancelSpan(span);

                    });
            });
        }

        return publisher;
    }

    public ServiceBusTracer getTracer() {
        return tracer;
    }

    private static String getSettlementSpanName(DispositionStatus status) {
        switch (status) {
            case COMPLETED:
                return "ServiceBus.complete";
            case ABANDONED:
                return "ServiceBus.abandon";
            case DEFERRED:
                return "ServiceBus.defer";
            case SUSPENDED:
                return "ServiceBus.deadLetter";
            case RELEASED:
                return "ServiceBus.release";
            default:
                return "ServiceBus.unknown";
        }
    }
}
