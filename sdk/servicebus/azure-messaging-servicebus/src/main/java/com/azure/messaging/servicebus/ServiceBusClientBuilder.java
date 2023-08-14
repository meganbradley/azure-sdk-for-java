// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.core.amqp.AmqpClientOptions;
import com.azure.core.amqp.AmqpRetryOptions;
import com.azure.core.amqp.AmqpRetryPolicy;
import com.azure.core.amqp.AmqpTransportType;
import com.azure.core.amqp.ProxyOptions;
import com.azure.core.amqp.client.traits.AmqpTrait;
import com.azure.core.amqp.implementation.AzureTokenManagerProvider;
import com.azure.core.amqp.implementation.ConnectionOptions;
import com.azure.core.amqp.implementation.ConnectionStringProperties;
import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.amqp.implementation.ReactorConnectionCache;
import com.azure.core.amqp.implementation.ReactorHandlerProvider;
import com.azure.core.amqp.implementation.ReactorProvider;
import com.azure.core.amqp.implementation.RetryUtil;
import com.azure.core.amqp.implementation.StringUtil;
import com.azure.core.amqp.implementation.TokenManagerProvider;
import com.azure.core.amqp.models.CbsAuthorizationType;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.annotation.ServiceClientProtocol;
import com.azure.core.client.traits.AzureNamedKeyCredentialTrait;
import com.azure.core.client.traits.AzureSasCredentialTrait;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.ConnectionStringTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.AzureNamedKeyCredential;
import com.azure.core.credential.AzureSasCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.exception.AzureException;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.ConfigurationProperty;
import com.azure.core.util.ConfigurationPropertyBuilder;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.metrics.Meter;
import com.azure.core.util.metrics.MeterProvider;
import com.azure.core.util.tracing.Tracer;
import com.azure.core.util.tracing.TracerProvider;
import com.azure.messaging.servicebus.implementation.MessageUtils;
import com.azure.messaging.servicebus.implementation.MessagingEntityType;
import com.azure.messaging.servicebus.implementation.ServiceBusAmqpConnection;
import com.azure.messaging.servicebus.implementation.ServiceBusAmqpLinkProvider;
import com.azure.messaging.servicebus.implementation.ServiceBusConnectionProcessor;
import com.azure.messaging.servicebus.implementation.ServiceBusConstants;
import com.azure.messaging.servicebus.implementation.ServiceBusManagementNode;
import com.azure.messaging.servicebus.implementation.ServiceBusReactorAmqpConnection;
import com.azure.messaging.servicebus.implementation.instrumentation.ReceiverKind;
import com.azure.messaging.servicebus.implementation.instrumentation.ServiceBusReceiverInstrumentation;
import com.azure.messaging.servicebus.implementation.instrumentation.ServiceBusSenderInstrumentation;
import com.azure.messaging.servicebus.implementation.ServiceBusSharedKeyCredential;
import com.azure.messaging.servicebus.implementation.ServiceBusProcessorClientOptions;
import com.azure.messaging.servicebus.models.ServiceBusReceiveMode;
import com.azure.messaging.servicebus.models.SubQueue;
import org.apache.qpid.proton.engine.SslDomain;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.azure.core.amqp.implementation.ClientConstants.ENTITY_PATH_KEY;
import static com.azure.messaging.servicebus.ReceiverOptions.createNonSessionOptions;
import static com.azure.messaging.servicebus.ReceiverOptions.createUnnamedSessionOptions;
import static com.azure.messaging.servicebus.implementation.ServiceBusConstants.AZ_TRACING_NAMESPACE_VALUE;

/**
 * The builder to create Service Bus clients:
 *
 * <p><strong>Instantiate a synchronous sender</strong></p>
 * <!-- src_embed com.azure.messaging.servicebus.sender.sync.client.instantiation -->
 * <pre>
 * &#47;&#47; Retrieve 'connectionString' and 'queueName' from your configuration.
 * ServiceBusClientBuilder builder = new ServiceBusClientBuilder&#40;&#41;
 *     .connectionString&#40;connectionString&#41;;
 * ServiceBusSenderClient sender = builder
 *     .sender&#40;&#41;
 *     .queueName&#40;queueName&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.messaging.servicebus.sender.sync.client.instantiation -->
 *
 * <p><strong>Instantiate an asynchronous receiver</strong></p>
 * <!-- src_embed com.azure.messaging.servicebus.receiver.async.client.instantiation -->
 * <pre>
 * &#47;&#47; Retrieve 'connectionString', 'topicName' and 'subscriptionName' from your configuration.
 * ServiceBusClientBuilder builder = new ServiceBusClientBuilder&#40;&#41;
 *     .connectionString&#40;connectionString&#41;;
 * ServiceBusReceiverAsyncClient receiver = builder
 *     .receiver&#40;&#41;
 *     .disableAutoComplete&#40;&#41; &#47;&#47; Allows user to take control of settling a message.
 *     .topicName&#40;topicName&#41;
 *     .subscriptionName&#40;subscriptionName&#41;
 *     .buildAsyncClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.messaging.servicebus.receiver.async.client.instantiation -->
 *
 * <p><strong>Instantiate an asynchronous session receiver</strong></p>
 * <!-- src_embed com.azure.messaging.servicebus.session.receiver.async.client.instantiation -->
 * <pre>
 * &#47;&#47; Retrieve 'connectionString', 'topicName' and 'subscriptionName' from your configuration.
 * ServiceBusSessionReceiverAsyncClient sessionReceiver = new ServiceBusClientBuilder&#40;&#41;
 *     .connectionString&#40;connectionString&#41;
 *     .sessionReceiver&#40;&#41;
 *     .receiveMode&#40;ServiceBusReceiveMode.PEEK_LOCK&#41;
 *     .topicName&#40;topicName&#41;
 *     .subscriptionName&#40;subscriptionName&#41;
 *     .buildAsyncClient&#40;&#41;;
 *
 * &#47;&#47; Receiving messages from the first available sessions. It waits up to the AmqpRetryOptions.getTryTimeout&#40;&#41;.
 * &#47;&#47; If no session is available within that operation timeout, it completes with an error. Otherwise, a receiver
 * &#47;&#47; is returned when a lock on the session is acquired.
 * Mono&lt;ServiceBusReceiverAsyncClient&gt; receiverMono = sessionReceiver.acceptNextSession&#40;&#41;;
 *
 * Flux.usingWhen&#40;receiverMono,
 *     receiver -&gt; receiver.receiveMessages&#40;&#41;,
 *     receiver -&gt; Mono.fromRunnable&#40;receiver::close&#41;&#41;
 *     .subscribe&#40;message -&gt; System.out.println&#40;message.getBody&#40;&#41;.toString&#40;&#41;&#41;&#41;;
 * </pre>
 * <!-- end com.azure.messaging.servicebus.session.receiver.async.client.instantiation -->
 *
 * <p><strong>Instantiate the processor</strong></p>
 * <!-- src_embed com.azure.messaging.servicebus.processor.client.instantiation -->
 * <pre>
 * &#47;&#47; Retrieve 'connectionString' and 'queueName' from your configuration.
 * ServiceBusClientBuilder builder = new ServiceBusClientBuilder&#40;&#41;
 *     .connectionString&#40;connectionString&#41;;
 * ServiceBusProcessorClient processor = builder
 *     .processor&#40;&#41;
 *     .queueName&#40;queueName&#41;
 *     .processMessage&#40;System.out::println&#41;
 *     .processError&#40;context -&gt; System.err.println&#40;context.getErrorSource&#40;&#41;&#41;&#41;
 *     .buildProcessorClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.messaging.servicebus.processor.client.instantiation -->

 * <p><strong>Sharing a connection between clients</strong></p>
 * The creation of physical connection to Service Bus requires resources. If your architecture allows, an application
 * should share connection between clients which can be achieved by sharing the top level builder as shown below.
 *
 * <!-- src_embed com.azure.messaging.servicebus.connection.sharing -->
 * <pre>
 * &#47;&#47; Retrieve 'connectionString' and 'queueName' from your configuration.
 * &#47;&#47; Create shared builder.
 * ServiceBusClientBuilder sharedConnectionBuilder = new ServiceBusClientBuilder&#40;&#41;
 *     .connectionString&#40;connectionString&#41;;
 * &#47;&#47; Create receiver and sender which will share the connection.
 * ServiceBusReceiverClient receiver = sharedConnectionBuilder
 *     .receiver&#40;&#41;
 *     .queueName&#40;queueName&#41;
 *     .buildClient&#40;&#41;;
 * ServiceBusSenderClient sender = sharedConnectionBuilder
 *     .sender&#40;&#41;
 *     .queueName&#40;queueName&#41;
 *     .buildClient&#40;&#41;;
 * </pre>
 * <!-- end com.azure.messaging.servicebus.connection.sharing -->
 *
 * <p><strong>Clients for sending messages</strong></p>
 * <ul>
 * <li>{@link ServiceBusSenderAsyncClient}</li>
 * <li>{@link ServiceBusSenderClient}</li>
 * </ul>
 *
 * <p><strong>Clients for receiving messages</strong></p>
 * <ul>
 * <li>{@link ServiceBusReceiverAsyncClient}</li>
 * <li>{@link ServiceBusReceiverClient}</li>
 * </ul>
 *
 * <p><strong>Clients for receiving messages from a session-enabled Service Bus entity</strong></p>
 * <ul>
 * <li>{@link ServiceBusSessionReceiverAsyncClient}</li>
 * <li>{@link ServiceBusSessionReceiverClient}</li>
 * </ul>
 *
 * <p><strong>Client for receiving messages using a callback-based processor</strong></p>
 * <ul>
 * <li>{@link ServiceBusProcessorClient}</li>
 * </ul>
 */
@ServiceClientBuilder(serviceClients = {ServiceBusReceiverAsyncClient.class, ServiceBusSenderAsyncClient.class,
    ServiceBusSenderClient.class, ServiceBusReceiverClient.class, ServiceBusProcessorClient.class},
    protocol = ServiceClientProtocol.AMQP)
public final class ServiceBusClientBuilder implements
    TokenCredentialTrait<ServiceBusClientBuilder>,
    AzureNamedKeyCredentialTrait<ServiceBusClientBuilder>,
    ConnectionStringTrait<ServiceBusClientBuilder>,
    AzureSasCredentialTrait<ServiceBusClientBuilder>,
    AmqpTrait<ServiceBusClientBuilder>,
    ConfigurationTrait<ServiceBusClientBuilder> {
    private static final AmqpRetryOptions DEFAULT_RETRY =
        new AmqpRetryOptions().setTryTimeout(ServiceBusConstants.OPERATION_TIMEOUT);

    private static final String SERVICE_BUS_PROPERTIES_FILE = "azure-messaging-servicebus.properties";
    private static final String SUBSCRIPTION_ENTITY_PATH_FORMAT = "%s/subscriptions/%s";
    private static final String DEAD_LETTER_QUEUE_NAME_SUFFIX = "/$deadletterqueue";
    private static final String TRANSFER_DEAD_LETTER_QUEUE_NAME_SUFFIX = "/$Transfer/$deadletterqueue";

    // Using 0 pre-fetch count for both receive modes, to avoid message lock lost exceptions in application
    // receiving messages at a slow rate. Applications can set it to a higher value if they need better performance.
    private static final int DEFAULT_PREFETCH_COUNT = 0;
    private static final String NAME_KEY = "name";
    private static final String VERSION_KEY = "version";
    private static final String UNKNOWN = "UNKNOWN";
    private static final String LIBRARY_NAME;
    private static final String LIBRARY_VERSION;
    private static final Duration MAX_LOCK_RENEW_DEFAULT_DURATION = Duration.ofMinutes(5);
    private static final ClientLogger LOGGER = new ClientLogger(ServiceBusClientBuilder.class);
    private final Object connectionLock = new Object();
    private final MessageSerializer messageSerializer = new ServiceBusMessageSerializer();
    private ClientOptions clientOptions;
    private Configuration configuration;
    private ServiceBusConnectionProcessor sharedConnection;
    private String connectionStringEntityName;
    private TokenCredential credentials;
    private String fullyQualifiedNamespace;
    private ProxyOptions proxyOptions;
    private AmqpRetryOptions retryOptions;
    private Scheduler scheduler;
    private AmqpTransportType transport = AmqpTransportType.AMQP;
    private SslDomain.VerifyMode verifyMode;
    private boolean crossEntityTransactions;
    private URL customEndpointAddress;
    private final V2StackSupport v2StackSupport = new V2StackSupport();

    /**
     * Keeps track of the open clients that were created from this builder when there is a shared connection.
     */
    private final AtomicInteger openClients = new AtomicInteger();

    static {
        final Map<String, String> properties = CoreUtils.getProperties(SERVICE_BUS_PROPERTIES_FILE);
        LIBRARY_NAME = properties.getOrDefault(NAME_KEY, UNKNOWN);
        LIBRARY_VERSION = properties.getOrDefault(VERSION_KEY, UNKNOWN);
    }

    /**
     * Creates a new instance with the default transport {@link AmqpTransportType#AMQP}.
     */
    public ServiceBusClientBuilder() {
    }

    /**
     * Sets the {@link ClientOptions} to be sent from the client built from this builder, enabling customization of
     * certain properties, as well as support the addition of custom header information. Refer to the {@link
     * ClientOptions} documentation for more information.
     *
     * @param clientOptions to be set on the client.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    @Override
    public ServiceBusClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * Sets the fully-qualified namespace for the Service Bus.
     *
     * @param fullyQualifiedNamespace The fully-qualified namespace for the Service Bus.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    public ServiceBusClientBuilder fullyQualifiedNamespace(String fullyQualifiedNamespace) {
        this.fullyQualifiedNamespace = Objects.requireNonNull(fullyQualifiedNamespace,
            "'fullyQualifiedNamespace' cannot be null.");
        if (CoreUtils.isNullOrEmpty(fullyQualifiedNamespace)) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("'fullyQualifiedNamespace' cannot be an empty string."));
        }
        return this;
    }

    private String getAndValidateFullyQualifiedNamespace() {
        if (CoreUtils.isNullOrEmpty(fullyQualifiedNamespace)) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("'fullyQualifiedNamespace' cannot be an empty string."));
        }
        return fullyQualifiedNamespace;
    }

    /**
     * Sets a custom endpoint address when connecting to the Service Bus service. This can be useful when your network
     * does not allow connecting to the standard Azure Service Bus endpoint address, but does allow connecting through
     * an intermediary. For example: {@literal https://my.custom.endpoint.com:55300}.
     * <p>
     * If no port is specified, the default port for the {@link #transportType(AmqpTransportType) transport type} is
     * used.
     *
     * @param customEndpointAddress The custom endpoint address.
     * @return The updated {@link ServiceBusClientBuilder} object.
     * @throws IllegalArgumentException if {@code customEndpointAddress} cannot be parsed into a valid {@link URL}.
     */
    public ServiceBusClientBuilder customEndpointAddress(String customEndpointAddress) {
        if (customEndpointAddress == null) {
            this.customEndpointAddress = null;
            return this;
        }

        try {
            this.customEndpointAddress = new URL(customEndpointAddress);
        } catch (MalformedURLException e) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException(String.format("(%s) : is not a valid URL,", customEndpointAddress), e));
        }

        return this;
    }

    /**
     * Sets the connection string for a Service Bus namespace or a specific Service Bus resource.
     *
     * @param connectionString Connection string for a Service Bus namespace or a specific Service Bus resource.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    public ServiceBusClientBuilder connectionString(String connectionString) {
        final ConnectionStringProperties properties = new ConnectionStringProperties(connectionString);
        final TokenCredential tokenCredential;
        try {
            tokenCredential = getTokenCredential(properties);
        } catch (Exception e) {
            throw LOGGER.logExceptionAsError(
                new AzureException("Could not create the ServiceBusSharedKeyCredential.", e));
        }

        this.fullyQualifiedNamespace = properties.getEndpoint().getHost();

        String entityPath = properties.getEntityPath();
        if (!CoreUtils.isNullOrEmpty(entityPath)) {
            LOGGER.atInfo()
                .addKeyValue(ENTITY_PATH_KEY, entityPath)
                .log("Setting entity from connection string.");
            this.connectionStringEntityName = entityPath;
        }

        return credential(properties.getEndpoint().getHost(), tokenCredential);
    }

    /**
     * Enable cross entity transaction on the connection to Service bus. Use this feature only when your transaction
     * scope spans across different Service Bus entities. This feature is achieved by routing all the messages through
     * one 'send-via' entity on server side as explained next.
     * Once clients are created for multiple entities, the first entity that an operation occurs on becomes the
     * entity through which all subsequent sends will be routed through ('send-via' entity). This enables the service to
     * perform a transaction that is meant to span multiple entities. This means that subsequent entities that perform
     * their first operation need to either be senders, or if they are receivers they need to be on the same entity as
     * the initial entity through which all sends are routed through (otherwise the service would not be able to ensure
     * that the transaction is committed because it cannot route a receive operation through a different entity). For
     * instance, if you have SenderA (For entity A) and ReceiverB (For entity B) that are created from a client with
     * cross-entity transactions enabled, you would need to receive first with ReceiverB to allow this to work. If you
     * first send to entity A, and then attempted to receive from entity B, an exception would be thrown.
     *
     * <p><strong>Avoid using non-transaction API on this client</strong></p>
     * Since this feature will set up connection to Service Bus optimised to enable this feature. Once all the clients
     * have been setup, the first receiver or sender used will initialize 'send-via' queue as a single message transfer
     * entity. All the messages will flow via this queue. Thus this client is not suitable for any non-transaction API.
     *
     * <p><strong>When not to enable this feature</strong></p>
     * If your transaction is involved in one Service bus entity only. For example you are receiving from one
     * queue/subscription and you want to settle your own messages which are part of one transaction.
     *
     * @return The updated {@link ServiceBusSenderClientBuilder} object.
     *
     * @see <a href="https://docs.microsoft.com/azure/service-bus-messaging/service-bus-transactions#transfers-and-send-via">Service Bus transactions</a>
     */
    public ServiceBusClientBuilder enableCrossEntityTransactions() {
        this.crossEntityTransactions = true;
        return this;
    }

    private TokenCredential getTokenCredential(ConnectionStringProperties properties) {
        TokenCredential tokenCredential;
        if (properties.getSharedAccessSignature() == null) {
            tokenCredential = new ServiceBusSharedKeyCredential(properties.getSharedAccessKeyName(),
                properties.getSharedAccessKey(), ServiceBusConstants.TOKEN_VALIDITY);
        } else {
            tokenCredential = new ServiceBusSharedKeyCredential(properties.getSharedAccessSignature());
        }
        return tokenCredential;
    }

    /**
     * Sets the configuration store that is used during construction of the service client.
     *
     * If not specified, the default configuration store is used to configure Service Bus clients. Use {@link
     * Configuration#NONE} to bypass using configuration settings during construction.
     *
     * @param configuration The configuration store used to configure Service Bus clients.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    @Override
    public ServiceBusClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Sets the credential by using a {@link TokenCredential} for the Service Bus resource.
     * <a href="https://github.com/Azure/azure-sdk-for-java/tree/main/sdk/identity/azure-identity">
     *     azure-identity</a> has multiple {@link TokenCredential} implementations that can be used to authenticate
     *     the access to the Service Bus resource.
     *
     * @param fullyQualifiedNamespace The fully-qualified namespace for the Service Bus.
     * @param credential The token credential to use for authentication. Access controls may be specified by the
     * ServiceBus namespace or the requested Service Bus entity, depending on Azure configuration.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    public ServiceBusClientBuilder credential(String fullyQualifiedNamespace, TokenCredential credential) {

        this.fullyQualifiedNamespace = Objects.requireNonNull(fullyQualifiedNamespace,
            "'fullyQualifiedNamespace' cannot be null.");
        this.credentials = Objects.requireNonNull(credential, "'credential' cannot be null.");

        if (CoreUtils.isNullOrEmpty(fullyQualifiedNamespace)) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("'fullyQualifiedNamespace' cannot be an empty string."));
        }

        return this;
    }

    /**
     * Sets the {@link TokenCredential} used to authorize requests sent to the service. Refer to the Azure SDK for Java
     * <a href="https://aka.ms/azsdk/java/docs/identity">identity and authentication</a>
     * documentation for more details on proper usage of the {@link TokenCredential} type.
     *
     * @param credential The token credential to use for authentication. Access controls may be specified by the
     * ServiceBus namespace or the requested Service Bus entity, depending on Azure configuration.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    @Override
    public ServiceBusClientBuilder credential(TokenCredential credential) {
        this.credentials = Objects.requireNonNull(credential, "'credential' cannot be null.");
        return this;
    }

    /**
     * Sets the credential with the shared access policies for the Service Bus resource.
     * You can find the shared access policies on the azure portal or Azure CLI.
     * For instance, on the portal, "Shared Access policies" has 'policy' and its 'Primary Key' and 'Secondary Key'.
     * The 'name' attribute of the {@link AzureNamedKeyCredential} is the 'policy' on portal and the 'key' attribute
     * can be either 'Primary Key' or 'Secondary Key'.
     * This method and {@link #connectionString(String)} take the same information in different forms. But it allows
     * you to update the name and key.
     *
     * @param fullyQualifiedNamespace The fully-qualified namespace for the Service Bus.
     * @param credential {@link AzureNamedKeyCredential} to be used for authentication.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    public ServiceBusClientBuilder credential(String fullyQualifiedNamespace, AzureNamedKeyCredential credential) {

        this.fullyQualifiedNamespace = Objects.requireNonNull(fullyQualifiedNamespace,
            "'fullyQualifiedNamespace' cannot be null.");
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        if (CoreUtils.isNullOrEmpty(fullyQualifiedNamespace)) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("'fullyQualifiedNamespace' cannot be an empty string."));
        }

        this.credentials = new ServiceBusSharedKeyCredential(credential.getAzureNamedKey().getName(),
            credential.getAzureNamedKey().getKey(), ServiceBusConstants.TOKEN_VALIDITY);

        return this;
    }

    /**
     * Sets the credential with the shared access policies for the Service Bus resource.
     * You can find the shared access policies on the azure portal or Azure CLI.
     * For instance, on the portal, "Shared Access policies" has 'policy' and its 'Primary Key' and 'Secondary Key'.
     * The 'name' attribute of the {@link AzureNamedKeyCredential} is the 'policy' on portal and the 'key' attribute
     * can be either 'Primary Key' or 'Secondary Key'.
     * This method and {@link #connectionString(String)} take the same information in different forms. But it allows
     * you to update the name and key.
     *
     * @param credential {@link AzureNamedKeyCredential} to be used for authentication.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    @Override
    public ServiceBusClientBuilder credential(AzureNamedKeyCredential credential) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        this.credentials = new ServiceBusSharedKeyCredential(credential.getAzureNamedKey().getName(),
            credential.getAzureNamedKey().getKey(), ServiceBusConstants.TOKEN_VALIDITY);
        return this;
    }

    /**
     * Sets the credential with Shared Access Signature for the Service Bus resource.
     * Refer to <a href="https://docs.microsoft.com/azure/service-bus-messaging/service-bus-sas">
     *     Service Bus access control with Shared Access Signatures</a>.
     *
     * @param fullyQualifiedNamespace The fully-qualified namespace for the Service Bus.
     * @param credential {@link AzureSasCredential} to be used for authentication.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    public ServiceBusClientBuilder credential(String fullyQualifiedNamespace, AzureSasCredential credential) {

        this.fullyQualifiedNamespace = Objects.requireNonNull(fullyQualifiedNamespace,
            "'fullyQualifiedNamespace' cannot be null.");
        Objects.requireNonNull(credential, "'credential' cannot be null.");

        if (CoreUtils.isNullOrEmpty(fullyQualifiedNamespace)) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("'fullyQualifiedNamespace' cannot be an empty string."));
        }

        this.credentials = new ServiceBusSharedKeyCredential(credential.getSignature());

        return this;
    }

    /**
     * Sets the credential with Shared Access Signature for the Service Bus resource.
     * Refer to <a href="https://docs.microsoft.com/azure/service-bus-messaging/service-bus-sas">
     *     Service Bus access control with Shared Access Signatures</a>.
     *
     * @param credential {@link AzureSasCredential} to be used for authentication.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    @Override
    public ServiceBusClientBuilder credential(AzureSasCredential credential) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        this.credentials = new ServiceBusSharedKeyCredential(credential.getSignature());
        return this;
    }

    /**
     * Sets the proxy configuration to use for {@link ServiceBusSenderAsyncClient}. When a proxy is configured, {@link
     * AmqpTransportType#AMQP_WEB_SOCKETS} must be used for the transport type.
     *
     * @param proxyOptions The proxy configuration to use.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    @Override
    public ServiceBusClientBuilder proxyOptions(ProxyOptions proxyOptions) {
        this.proxyOptions = proxyOptions;
        return this;
    }

    /**
     * Package-private method that sets the verify mode for this connection.
     *
     * @param verifyMode The verification mode.
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    ServiceBusClientBuilder verifyMode(SslDomain.VerifyMode verifyMode) {
        this.verifyMode = verifyMode;
        return this;
    }

    /**
     * Sets the retry options for Service Bus clients. If not specified, the default retry options are used.
     *
     * @param retryOptions The retry options to use.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    @Override
    public ServiceBusClientBuilder retryOptions(AmqpRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * Sets the scheduler to use.
     *
     * @param scheduler Scheduler to be used.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    ServiceBusClientBuilder scheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
        return this;
    }

    /**
     * Sets the transport type by which all the communication with Azure Service Bus occurs. Default value is {@link
     * AmqpTransportType#AMQP}.
     *
     * @param transportType The transport type to use.
     *
     * @return The updated {@link ServiceBusClientBuilder} object.
     */
    @Override
    public ServiceBusClientBuilder transportType(AmqpTransportType transportType) {
        this.transport = transportType;
        return this;
    }

    /**
     * A new instance of {@link ServiceBusSenderClientBuilder} used to configure Service Bus message senders.
     *
     * @return A new instance of {@link ServiceBusSenderClientBuilder}.
     */
    public ServiceBusSenderClientBuilder sender() {
        return new ServiceBusSenderClientBuilder();
    }

    /**
     * A new instance of {@link ServiceBusReceiverClientBuilder} used to configure Service Bus message receivers.
     *
     * @return A new instance of {@link ServiceBusReceiverClientBuilder}.
     */
    public ServiceBusReceiverClientBuilder receiver() {
        return new ServiceBusReceiverClientBuilder();
    }

    /**
     * A new instance of {@link ServiceBusSessionReceiverClientBuilder} used to configure <b>session aware</b> Service
     * Bus message receivers.
     *
     * @return A new instance of {@link ServiceBusSessionReceiverClientBuilder}.
     */
    public ServiceBusSessionReceiverClientBuilder sessionReceiver() {
        return new ServiceBusSessionReceiverClientBuilder();
    }

    /**
     * A new instance of {@link ServiceBusProcessorClientBuilder} used to configure {@link ServiceBusProcessorClient}
     * instance.
     *
     * @return A new instance of {@link ServiceBusProcessorClientBuilder}.
     */
    public ServiceBusProcessorClientBuilder processor() {
        return new ServiceBusProcessorClientBuilder();
    }

    /**
     * A new instance of {@link ServiceBusSessionProcessorClientBuilder} used to configure a Service Bus processor
     * instance that processes sessions.
     * @return A new instance of {@link ServiceBusSessionProcessorClientBuilder}.
     */
    public ServiceBusSessionProcessorClientBuilder sessionProcessor() {
        return new ServiceBusSessionProcessorClientBuilder();
    }

    /**
     * A new instance of {@link ServiceBusRuleManagerBuilder} used to configure a Service Bus rule manager instance.
     *
     * @return A new instance of {@link ServiceBusRuleManagerBuilder}.
     */
    public ServiceBusRuleManagerBuilder ruleManager() {
        return new ServiceBusRuleManagerBuilder();
    }

    /**
     * Called when a child client is closed. Disposes of the shared connection if there are no more clients.
     */
    void onClientClose() {
        synchronized (connectionLock) {
            final int numberOfOpenClients = openClients.decrementAndGet();
            LOGGER.atInfo()
                .addKeyValue("numberOfOpenClients", numberOfOpenClients)
                .log("Closing a dependent client.");

            if (numberOfOpenClients > 0) {
                return;
            }

            if (numberOfOpenClients < 0) {
                LOGGER.atWarning()
                    .addKeyValue("numberOfOpenClients", numberOfOpenClients)
                    .log("There should not be less than 0 clients.");
            }

            LOGGER.info("No more open clients, closing shared connection.");

            if (sharedConnection != null) {
                sharedConnection.dispose();
                sharedConnection = null;
            } else {
                LOGGER.warning("Shared ServiceBusConnectionProcessor was already disposed.");
            }
        }
    }

    // Connection-caching for the V1-Stack.
    private ServiceBusConnectionProcessor getOrCreateConnectionProcessor(MessageSerializer serializer) {
        synchronized (connectionLock) {
            if (sharedConnection == null) {
                final ConnectionOptions connectionOptions = getConnectionOptions();

                final Flux<ServiceBusAmqpConnection> connectionFlux = Mono.fromCallable(() -> {
                    final String connectionId = StringUtil.getRandomString("MF");
                    final ReactorProvider provider = new ReactorProvider();
                    final ReactorHandlerProvider handlerProvider = new ReactorHandlerProvider(provider);
                    final TokenManagerProvider tokenManagerProvider = new AzureTokenManagerProvider(
                        connectionOptions.getAuthorizationType(), connectionOptions.getFullyQualifiedNamespace(),
                        connectionOptions.getAuthorizationScope());
                    final ServiceBusAmqpLinkProvider linkProvider = new ServiceBusAmqpLinkProvider();

                    // For the V1-Stack, tell the connection to continue creating receivers on v1 stack.
                    final boolean isV2 = false;
                    return (ServiceBusAmqpConnection) new ServiceBusReactorAmqpConnection(connectionId,
                        connectionOptions, provider, handlerProvider, linkProvider, tokenManagerProvider, serializer,
                        crossEntityTransactions, isV2);
                }).repeat();

                sharedConnection = connectionFlux.subscribeWith(new ServiceBusConnectionProcessor(
                    connectionOptions.getFullyQualifiedNamespace(), connectionOptions.getRetry()));
            }
        }

        final int numberOfOpenClients = openClients.incrementAndGet();
        LOGGER.info("# of open clients with shared connection: {}", numberOfOpenClients);

        return sharedConnection;
    }

    private ConnectionOptions getConnectionOptions() {
        configuration = configuration == null ? Configuration.getGlobalConfiguration().clone() : configuration;
        if (retryOptions == null) {
            retryOptions = DEFAULT_RETRY;
        }
        if (scheduler == null) {
            scheduler = Schedulers.boundedElastic();
        }
        if (credentials == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException("Credentials have not been set. "
                + "They can be set using: connectionString(String), connectionString(String, String), "
                + "or credentials(String, String, TokenCredential)"
            ));
        }

        // If the proxy has been configured by the user but they have overridden the TransportType with something that
        // is not AMQP_WEB_SOCKETS.
        if (proxyOptions != null && proxyOptions.isProxyAddressConfigured()
            && transport != AmqpTransportType.AMQP_WEB_SOCKETS) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Cannot use a proxy when TransportType is not AMQP Web Sockets. "
                    + "Use the setter 'transportType(AmqpTransportType.AMQP_WEB_SOCKETS)' to enable Web Sockets mode."));
        }

        if (proxyOptions == null) {
            proxyOptions = ProxyOptions.fromConfiguration(configuration);
        }

        final CbsAuthorizationType authorizationType = credentials instanceof ServiceBusSharedKeyCredential
            ? CbsAuthorizationType.SHARED_ACCESS_SIGNATURE
            : CbsAuthorizationType.JSON_WEB_TOKEN;

        final SslDomain.VerifyMode verificationMode = verifyMode != null
            ? verifyMode
            : SslDomain.VerifyMode.VERIFY_PEER_NAME;

        final ClientOptions options = clientOptions != null ? clientOptions : new ClientOptions();

        if (customEndpointAddress == null) {
            return new ConnectionOptions(getAndValidateFullyQualifiedNamespace(), credentials, authorizationType,
                ServiceBusConstants.AZURE_ACTIVE_DIRECTORY_SCOPE, transport, retryOptions, proxyOptions, scheduler,
                options, verificationMode, LIBRARY_NAME, LIBRARY_VERSION);
        } else {
            return new ConnectionOptions(getAndValidateFullyQualifiedNamespace(), credentials, authorizationType,
                ServiceBusConstants.AZURE_ACTIVE_DIRECTORY_SCOPE, transport, retryOptions, proxyOptions, scheduler,
                options, verificationMode, LIBRARY_NAME, LIBRARY_VERSION, customEndpointAddress.getHost(),
                customEndpointAddress.getPort());
        }
    }

    // Connection-caching for the V2-Stack.
    private ReactorConnectionCache<ServiceBusReactorAmqpConnection> getOrCreateConnectionCache(MessageSerializer serializer) {
        return v2StackSupport.getOrCreateConnectionCache(getConnectionOptions(), serializer, crossEntityTransactions);
    }

    private static boolean isNullOrEmpty(String item) {
        return item == null || item.isEmpty();
    }

    private static MessagingEntityType validateEntityPaths(String connectionStringEntityName,
        String topicName, String queueName) {

        final boolean hasTopicName = !isNullOrEmpty(topicName);
        final boolean hasQueueName = !isNullOrEmpty(queueName);
        final boolean hasConnectionStringEntity = !isNullOrEmpty(connectionStringEntityName);

        final MessagingEntityType entityType;

        if (!hasConnectionStringEntity && !hasQueueName && !hasTopicName) {
            throw ServiceBusClientBuilder.LOGGER.logExceptionAsError(new IllegalStateException(
                "Cannot build client without setting either a queueName or topicName."));
        } else if (hasQueueName && hasTopicName) {
            throw ServiceBusClientBuilder.LOGGER.logExceptionAsError(new IllegalStateException(String.format(
                "Cannot build client with both queueName (%s) and topicName (%s) set.", queueName, topicName)));
        } else if (hasQueueName) {
            if (hasConnectionStringEntity && !queueName.equals(connectionStringEntityName)) {
                throw ServiceBusClientBuilder.LOGGER.logExceptionAsError(new IllegalStateException(String.format(
                    "queueName (%s) is different than the connectionString's EntityPath (%s).",
                    queueName, connectionStringEntityName)));
            }

            entityType = MessagingEntityType.QUEUE;
        } else if (hasTopicName) {
            if (hasConnectionStringEntity && !topicName.equals(connectionStringEntityName)) {
                throw ServiceBusClientBuilder.LOGGER.logExceptionAsError(new IllegalStateException(String.format(
                    "topicName (%s) is different than the connectionString's EntityPath (%s).",
                    topicName, connectionStringEntityName)));
            }

            entityType = MessagingEntityType.SUBSCRIPTION;
        } else {
            // It is a connection string entity path.
            entityType = MessagingEntityType.UNKNOWN;
        }

        return entityType;
    }

    private static String getEntityPath(MessagingEntityType entityType, String queueName,
        String topicName, String subscriptionName, SubQueue subQueue) {

        String entityPath;
        switch (entityType) {
            case QUEUE:
                entityPath = queueName;
                break;
            case SUBSCRIPTION:
                if (isNullOrEmpty(subscriptionName)) {
                    throw ServiceBusClientBuilder.LOGGER.logExceptionAsError(new IllegalStateException(String.format(
                        "topicName (%s) must have a subscriptionName associated with it.", topicName)));
                }

                entityPath = String.format(Locale.ROOT, SUBSCRIPTION_ENTITY_PATH_FORMAT, topicName,
                    subscriptionName);
                break;
            default:
                throw ServiceBusClientBuilder.LOGGER.logExceptionAsError(
                    new IllegalArgumentException("Unknown entity type: " + entityType));
        }

        if (subQueue == null) {
            return entityPath;
        }

        switch (subQueue) {
            case NONE:
                break;
            case TRANSFER_DEAD_LETTER_QUEUE:
                entityPath += TRANSFER_DEAD_LETTER_QUEUE_NAME_SUFFIX;
                break;
            case DEAD_LETTER_QUEUE:
                entityPath += DEAD_LETTER_QUEUE_NAME_SUFFIX;
                break;
            default:
                throw ServiceBusClientBuilder.LOGGER.logExceptionAsError(new IllegalArgumentException("Unsupported value of subqueue type: "
                    + subQueue));
        }

        return entityPath;
    }

    // Temporary type for Builders to work with the V2-Stack. Type will be removed once migration to new v2 stack is completed.
    private static final class V2StackSupport {
        private static final String NON_SESSION_ASYNC_RECEIVE_KEY = "com.azure.messaging.servicebus.nonSession.asyncReceive.v2";
        private static final ConfigurationProperty<Boolean> NON_SESSION_ASYNC_RECEIVE_PROPERTY = ConfigurationPropertyBuilder.ofBoolean(NON_SESSION_ASYNC_RECEIVE_KEY)
            .environmentVariableName(NON_SESSION_ASYNC_RECEIVE_KEY)
            .defaultValue(true) // Async[Reactor|Processor]Receiver Client is on the new v2 stack by default.
            .shared(true)
            .build();
        private final AtomicReference<Boolean> nonSessionAsyncReceiveFlag = new AtomicReference<>();

        private static final String NON_SESSION_SYNC_RECEIVE_KEY = "com.azure.messaging.servicebus.nonSession.syncReceive.v2";
        private static final ConfigurationProperty<Boolean> NON_SESSION_SYNC_RECEIVE_PROPERTY = ConfigurationPropertyBuilder.ofBoolean(NON_SESSION_SYNC_RECEIVE_KEY)
            .environmentVariableName(NON_SESSION_SYNC_RECEIVE_KEY)
            .defaultValue(false) // Sync Receiver Client is not on the new v2 stack by default.
            .shared(true)
            .build();
        private final AtomicReference<Boolean> nonSessionSyncReceiveFlag = new AtomicReference<>();

        private static final String SEND_MANAGE_RULES_KEY = "com.azure.messaging.servicebus.sendAndManageRules.v2";
        private static final ConfigurationProperty<Boolean> SEND_MANAGE_RULES_PROPERTY = ConfigurationPropertyBuilder.ofBoolean(SEND_MANAGE_RULES_KEY)
            .environmentVariableName(SEND_MANAGE_RULES_KEY)
            .defaultValue(true) // Sender and RuleManager Client is on the new v2 stack by default.
            .shared(true)
            .build();
        private final AtomicReference<Boolean> sendManageFlag = new AtomicReference<>();

        private static final String SESSION_PROCESSOR_ASYNC_RECEIVE_KEY = "com.azure.messaging.servicebus.session.processor.asyncReceive.v2";
        private static final ConfigurationProperty<Boolean> SESSION_PROCESSOR_ASYNC_RECEIVE_PROPERTY = ConfigurationPropertyBuilder.ofBoolean(SESSION_PROCESSOR_ASYNC_RECEIVE_KEY)
            .environmentVariableName(SESSION_PROCESSOR_ASYNC_RECEIVE_KEY)
            .defaultValue(false) // Async[Processor]Receiver Client is not on the new v2 stack by default
            .shared(true)
            .build();
        private final AtomicReference<Boolean> sessionProcessorAsyncReceiveFlag = new AtomicReference<>();

        private final Object connectionLock = new Object();
        private ReactorConnectionCache<ServiceBusReactorAmqpConnection> sharedConnectionCache;
        private final AtomicInteger openClients = new AtomicInteger();

        /**
         * Non-Session Async[Reactor|Processor]Client is on the new v2 stack by default, but the application
         * may opt out.
         *
          * @param configuration the client configuration.
         * @return true if the Non-Session Async[Reactor|Processor] receive should use the v2 stack.
         */
        boolean isNonSessionAsyncReceiveEnabled(Configuration configuration) {
            return !isOptedOut(configuration, NON_SESSION_ASYNC_RECEIVE_PROPERTY, nonSessionAsyncReceiveFlag);
        }

        /**
         * Non-Session SyncClient is not on the v2 stack by default, but the application may opt into the v2 stack.
         *
         * @param configuration the client configuration.
         * @return true if Sync receive should use the v2 stack.
         */
        boolean isNonSessionSyncReceiveEnabled(Configuration configuration) {
            return isOptedIn(configuration, NON_SESSION_SYNC_RECEIVE_PROPERTY, nonSessionSyncReceiveFlag);
        }

        /**
         * Sender and RuleManager Client is on the new v2 stack by default, but the application may opt out.
         *
         * @param configuration the client configuration.
         * @return true if the Sender and RuleManager Client should use the v2 stack.
         */
        boolean isSenderAndManageRulesEnabled(Configuration configuration) {
            return !isOptedOut(configuration, SEND_MANAGE_RULES_PROPERTY, sendManageFlag);
        }

        /**
         * Session ProcessorClient is not on the v2 stack by default, but the application may opt into the v2 stack.
         *
         * @param configuration the client configuration.
         * @return true if session processor receive should use the v2 stack.
         */
        boolean isSessionProcessorAsyncReceiveEnabled(Configuration configuration) {
            return isOptedIn(configuration, SESSION_PROCESSOR_ASYNC_RECEIVE_PROPERTY, sessionProcessorAsyncReceiveFlag);
        }

        // Obtain the shared connection-cache based on the V2-Stack.
        ReactorConnectionCache<ServiceBusReactorAmqpConnection> getOrCreateConnectionCache(ConnectionOptions connectionOptions,
            MessageSerializer serializer, boolean crossEntityTransactions) {
            synchronized (connectionLock) {
                if (sharedConnectionCache == null) {
                    sharedConnectionCache = createConnectionCache(connectionOptions, serializer, crossEntityTransactions);
                }
            }

            final int numberOfOpenClients = openClients.incrementAndGet();
            ServiceBusClientBuilder.LOGGER.info("# of open clients using shared connection cache: {}", numberOfOpenClients);
            return sharedConnectionCache;
        }

        // Decide when to dispose of the shared connection cache.
        void onClientClose() {
            synchronized (connectionLock) {
                final int numberOfOpenClients = openClients.decrementAndGet();
                ServiceBusClientBuilder.LOGGER.atInfo()
                    .addKeyValue("numberOfOpenClients", numberOfOpenClients)
                    .log("Closing a client using shared connection cache.");

                if (numberOfOpenClients > 0) {
                    return;
                }

                if (numberOfOpenClients < 0) {
                    ServiceBusClientBuilder.LOGGER.atWarning()
                        .addKeyValue("numberOfOpenClients", numberOfOpenClients)
                        .log("There should not be less than 0 clients.");
                }

                ServiceBusClientBuilder.LOGGER.info("No more open clients, closing shared connection cache.");

                if (sharedConnectionCache != null) {
                    sharedConnectionCache.dispose();
                    sharedConnectionCache = null;
                } else {
                    ServiceBusClientBuilder.LOGGER.warning("Shared ReactorConnectionCache was already disposed.");
                }
            }
        }

        private boolean isOptedOut(Configuration configuration, ConfigurationProperty<Boolean> configProperty,
                                   AtomicReference<Boolean> choiceFlag) {
            if (choiceFlag.get() == null) {
                if (configuration == null) {
                    choiceFlag.set(true);
                } else if (choiceFlag.compareAndSet(null, configuration.get(configProperty))) {
                    if (!choiceFlag.get()) {
                        final String logMessage = "{}=false If your application fails to work without explicitly setting this configuration to 'false', please file an urgent issue at https://github.com/Azure/azure-sdk-for-java/issues/new/choose";
                        ServiceBusClientBuilder.LOGGER.info(logMessage, configProperty.getName());
                    }
                }
            }
            final boolean isOptedOut = !choiceFlag.get();
            return isOptedOut;
        }

        private boolean isOptedIn(Configuration configuration, ConfigurationProperty<Boolean> configProperty,
                                  AtomicReference<Boolean> choiceFlag) {
            if (choiceFlag.get() == null) {
                if (configuration == null) {
                    choiceFlag.set(false);
                } else {
                    choiceFlag.compareAndSet(null, configuration.get(configProperty));
                }
            }
            final boolean isOptedIn = choiceFlag.get();
            return isOptedIn;
        }

        private static ReactorConnectionCache<ServiceBusReactorAmqpConnection> createConnectionCache(ConnectionOptions connectionOptions,
            MessageSerializer serializer, boolean crossEntityTransactions) {
            final Supplier<ServiceBusReactorAmqpConnection> connectionSupplier = () -> {
                final String connectionId = StringUtil.getRandomString("MF");
                final ReactorProvider provider = new ReactorProvider();
                final ReactorHandlerProvider handlerProvider = new ReactorHandlerProvider(provider);
                final TokenManagerProvider tokenManagerProvider = new AzureTokenManagerProvider(
                    connectionOptions.getAuthorizationType(), connectionOptions.getFullyQualifiedNamespace(),
                    connectionOptions.getAuthorizationScope());
                final ServiceBusAmqpLinkProvider linkProvider = new ServiceBusAmqpLinkProvider();

                //For the v2 stack, tell the connection to create receivers using the v2 stack.
                final boolean isV2 = true;
                return new ServiceBusReactorAmqpConnection(connectionId, connectionOptions, provider, handlerProvider,
                    linkProvider, tokenManagerProvider, serializer, crossEntityTransactions, isV2);
            };

            final String fqdn = connectionOptions.getFullyQualifiedNamespace();
            final String entityPath = "N/A";
            final AmqpRetryPolicy retryPolicy = RetryUtil.getRetryPolicy(connectionOptions.getRetry());
            final Map<String, Object> loggingContext = Collections.singletonMap(ENTITY_PATH_KEY, entityPath);

            return new ReactorConnectionCache<>(connectionSupplier, fqdn, entityPath, retryPolicy, loggingContext);
        }
    }

    /**
     * Builder for creating {@link ServiceBusSenderClient} and {@link ServiceBusSenderAsyncClient} to publish messages
     * to Service Bus.
     *
     * @see ServiceBusSenderAsyncClient
     * @see ServiceBusSenderClient
     */
    @ServiceClientBuilder(serviceClients = {ServiceBusSenderClient.class, ServiceBusSenderAsyncClient.class})
    public final class ServiceBusSenderClientBuilder {
        private String queueName;
        private String topicName;

        private ServiceBusSenderClientBuilder() {
        }

        /**
         * Sets the name of the Service Bus queue to publish messages to.
         *
         * @param queueName Name of the queue.
         *
         * @return The modified {@link ServiceBusSenderClientBuilder} object.
         */
        public ServiceBusSenderClientBuilder queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * Sets the name of the Service Bus topic to publish messages to.
         *
         * @param topicName Name of the topic.
         *
         * @return The modified {@link ServiceBusSenderClientBuilder} object.
         */
        public ServiceBusSenderClientBuilder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        /**
         * Creates an <b>asynchronous</b> {@link ServiceBusSenderAsyncClient client} for transmitting {@link
         * ServiceBusMessage} to a Service Bus queue or topic.
         *
         * @return A new {@link ServiceBusSenderAsyncClient} for transmitting to a Service queue or topic.
         * @throws IllegalStateException if {@link #queueName(String) queueName} or {@link #topicName(String)
         *     topicName} are not set or, both of these fields are set. It is also thrown if the Service Bus {@link
         *     #connectionString(String) connectionString} contains an {@code EntityPath} that does not match one set in
         *     {@link #queueName(String) queueName} or {@link #topicName(String) topicName}.
         * @throws IllegalArgumentException if the entity type is not a queue or a topic.
         */
        // Build Sender-Client.
        public ServiceBusSenderAsyncClient buildAsyncClient() {
            final ConnectionCacheWrapper connectionCacheWrapper;
            final Runnable onClientClose;
            final boolean isSenderOnV2 = v2StackSupport.isSenderAndManageRulesEnabled(configuration);
            if (isSenderOnV2) {
                // Sender Client (async|sync) on the V2-Stack.
                connectionCacheWrapper = new ConnectionCacheWrapper(getOrCreateConnectionCache(messageSerializer));
                onClientClose = ServiceBusClientBuilder.this.v2StackSupport::onClientClose;
            } else {
                connectionCacheWrapper = new ConnectionCacheWrapper(getOrCreateConnectionProcessor(messageSerializer));
                onClientClose = ServiceBusClientBuilder.this::onClientClose;
            }
            final MessagingEntityType entityType = validateEntityPaths(connectionStringEntityName, topicName,
                queueName);

            final String entityName;
            switch (entityType) {
                case QUEUE:
                    entityName = queueName;
                    break;
                case SUBSCRIPTION:
                    entityName = topicName;
                    break;
                case UNKNOWN:
                    entityName = connectionStringEntityName;
                    break;
                default:
                    throw LOGGER.logExceptionAsError(
                        new IllegalArgumentException("Unknown entity type: " + entityType));
            }

            final String clientIdentifier;
            if (clientOptions instanceof AmqpClientOptions) {
                String clientOptionIdentifier = ((AmqpClientOptions) clientOptions).getIdentifier();
                clientIdentifier = CoreUtils.isNullOrEmpty(clientOptionIdentifier) ? UUID.randomUUID().toString() : clientOptionIdentifier;
            } else {
                clientIdentifier = UUID.randomUUID().toString();
            }

            final ServiceBusSenderInstrumentation instrumentation = new ServiceBusSenderInstrumentation(
                createTracer(), createMeter(), connectionCacheWrapper.getFullyQualifiedNamespace(), entityName);

            return new ServiceBusSenderAsyncClient(entityName, entityType, connectionCacheWrapper, retryOptions,
                instrumentation, messageSerializer, onClientClose, null, clientIdentifier);
        }

        /**
         * Creates a <b>synchronous</b> {@link ServiceBusSenderClient client} for transmitting {@link ServiceBusMessage}
         * to a Service Bus queue or topic.
         *
         * @return A new {@link ServiceBusSenderAsyncClient} for transmitting to a Service queue or topic.
         * @throws IllegalStateException if {@link #queueName(String) queueName} or {@link #topicName(String)
         *     topicName} are not set or, both of these fields are set. It is also thrown if the Service Bus {@link
         *     #connectionString(String) connectionString} contains an {@code EntityPath} that does not match one set in
         *     {@link #queueName(String) queueName} or {@link #topicName(String) topicName}
         * @throws IllegalArgumentException if the entity type is not a queue or a topic.
         */
        public ServiceBusSenderClient buildClient() {
            return new ServiceBusSenderClient(buildAsyncClient(), MessageUtils.getTotalTimeout(retryOptions));
        }
    }

    /**
     * Builder for creating {@link ServiceBusProcessorClient} to consume messages from a session-based Service Bus
     * entity. {@link ServiceBusProcessorClient} processes messages and errors via {@link #processMessage(Consumer)}
     * and {@link #processError(Consumer)}. When the processor finishes processing a session, it tries to fetch the
     * next session to process.
     *
     * <p>
     * By default, the processor:
     * <ul>
     *     <li>Automatically settles messages. Disabled via {@link #disableAutoComplete()}</li>
     *     <li>Processes 1 session concurrently. Configured via {@link #maxConcurrentSessions(int)}</li>
     *     <li>Invokes 1 instance of {@link #processMessage(Consumer) processMessage consumer}. Configured via
     *     {@link #maxConcurrentCalls(int)}</li>
     * </ul>
     *
     * <p><strong>Instantiate a session-enabled processor client</strong></p>
     * <!-- src_embed com.azure.messaging.servicebus.servicebusprocessorclient#session-instantiation -->
     * <pre>
     * Consumer&lt;ServiceBusReceivedMessageContext&gt; onMessage = context -&gt; &#123;
     *     ServiceBusReceivedMessage message = context.getMessage&#40;&#41;;
     *     System.out.printf&#40;&quot;Processing message. Session: %s, Sequence #: %s. Contents: %s%n&quot;,
     *         message.getSessionId&#40;&#41;, message.getSequenceNumber&#40;&#41;, message.getBody&#40;&#41;&#41;;
     * &#125;;
     *
     * Consumer&lt;ServiceBusErrorContext&gt; onError = context -&gt; &#123;
     *     System.out.printf&#40;&quot;Error when receiving messages from namespace: '%s'. Entity: '%s'%n&quot;,
     *         context.getFullyQualifiedNamespace&#40;&#41;, context.getEntityPath&#40;&#41;&#41;;
     *
     *     if &#40;context.getException&#40;&#41; instanceof ServiceBusException&#41; &#123;
     *         ServiceBusException exception = &#40;ServiceBusException&#41; context.getException&#40;&#41;;
     *         System.out.printf&#40;&quot;Error source: %s, reason %s%n&quot;, context.getErrorSource&#40;&#41;,
     *             exception.getReason&#40;&#41;&#41;;
     *     &#125; else &#123;
     *         System.out.printf&#40;&quot;Error occurred: %s%n&quot;, context.getException&#40;&#41;&#41;;
     *     &#125;
     * &#125;;
     *
     * &#47;&#47; Retrieve 'connectionString&#47;queueName' from your configuration.
     *
     * ServiceBusProcessorClient sessionProcessor = new ServiceBusClientBuilder&#40;&#41;
     *     .connectionString&#40;connectionString&#41;
     *     .sessionProcessor&#40;&#41;
     *     .queueName&#40;queueName&#41;
     *     .maxConcurrentSessions&#40;2&#41;
     *     .processMessage&#40;onMessage&#41;
     *     .processError&#40;onError&#41;
     *     .buildProcessorClient&#40;&#41;;
     *
     * &#47;&#47; Start the processor in the background
     * sessionProcessor.start&#40;&#41;;
     * </pre>
     * <!-- end com.azure.messaging.servicebus.servicebusprocessorclient#session-instantiation -->
     *
     * @see ServiceBusProcessorClient
     */
    public final class ServiceBusSessionProcessorClientBuilder {
        private final ServiceBusProcessorClientOptions processorClientOptions;
        private final ServiceBusSessionReceiverClientBuilder sessionReceiverClientBuilder;
        private Consumer<ServiceBusReceivedMessageContext> processMessage;
        private Consumer<ServiceBusErrorContext> processError;

        private ServiceBusSessionProcessorClientBuilder() {
            sessionReceiverClientBuilder = new ServiceBusSessionReceiverClientBuilder();
            processorClientOptions = new ServiceBusProcessorClientOptions()
                .setMaxConcurrentCalls(1);
            sessionReceiverClientBuilder.maxConcurrentSessions(1);
        }

        /**
         * Sets the amount of time to continue auto-renewing the lock. Setting {@link Duration#ZERO} or {@code null}
         * disables auto-renewal. For {@link ServiceBusReceiveMode#RECEIVE_AND_DELETE RECEIVE_AND_DELETE} mode,
         * auto-renewal is disabled.
         *
         * @param maxAutoLockRenewDuration the amount of time to continue auto-renewing the lock. {@link Duration#ZERO}
         * or {@code null} indicates that auto-renewal is disabled.
         *
         * @return The updated {@link ServiceBusSessionProcessorClientBuilder} object.
         * @throws IllegalArgumentException If {code maxAutoLockRenewDuration} is negative.
         */
        public ServiceBusSessionProcessorClientBuilder maxAutoLockRenewDuration(Duration maxAutoLockRenewDuration) {
            validateAndThrow(maxAutoLockRenewDuration);
            sessionReceiverClientBuilder.maxAutoLockRenewDuration(maxAutoLockRenewDuration);
            return this;
        }

        /**
         * Sets the maximum amount of time to wait for a message to be received for the currently active session.
         * After this time has elapsed, the processor will close the session and attempt to process another session.
         * If not specified, the {@link AmqpRetryOptions#getTryTimeout()} will be used.
         *
         * @param sessionIdleTimeout Session idle timeout.
         * @return The updated {@link ServiceBusSessionProcessorClientBuilder} object.
         * @throws IllegalArgumentException If {code maxAutoLockRenewDuration} is negative.
         */
        public ServiceBusSessionProcessorClientBuilder sessionIdleTimeout(Duration sessionIdleTimeout) {
            validateAndThrow(sessionIdleTimeout);
            sessionReceiverClientBuilder.sessionIdleTimeout(sessionIdleTimeout);
            return this;
        }

        /**
         * Enables session processing roll-over by processing at most {@code maxConcurrentSessions}.
         *
         * @param maxConcurrentSessions Maximum number of concurrent sessions to process at any given time.
         *
         * @return The modified {@link ServiceBusSessionProcessorClientBuilder} object.
         * @throws IllegalArgumentException if {@code maxConcurrentSessions} is less than 1.
         */
        public ServiceBusSessionProcessorClientBuilder maxConcurrentSessions(int maxConcurrentSessions) {
            if (maxConcurrentSessions < 1) {
                throw LOGGER.logExceptionAsError(
                    new IllegalArgumentException("'maxConcurrentSessions' cannot be less than 1"));
            }
            sessionReceiverClientBuilder.maxConcurrentSessions(maxConcurrentSessions);
            return this;
        }

        /**
         * Sets the prefetch count of the processor. For both {@link ServiceBusReceiveMode#PEEK_LOCK PEEK_LOCK} and
         * {@link ServiceBusReceiveMode#RECEIVE_AND_DELETE RECEIVE_AND_DELETE} modes the default value is 0.
         *
         * Prefetch speeds up the message flow by aiming to have a message readily available for local retrieval when
         * and before the application starts the processor.
         * Setting a non-zero value will prefetch that number of messages. Setting the value to zero turns prefetch off.
         * Using a non-zero prefetch risks of losing messages even though it has better performance.
         * @see <a href="https://docs.microsoft.com/en-us/azure/service-bus-messaging/service-bus-prefetch">Service Bus Prefetch</a>
         *
         * @param prefetchCount The prefetch count.
         *
         * @return The modified {@link ServiceBusProcessorClientBuilder} object.
         */
        public ServiceBusSessionProcessorClientBuilder prefetchCount(int prefetchCount) {
            sessionReceiverClientBuilder.prefetchCount(prefetchCount);
            return this;
        }

        /**
         * Sets the name of the queue to create a processor for.
         * @param queueName Name of the queue.
         *
         * @return The modified {@link ServiceBusSessionProcessorClientBuilder} object.
         */
        public ServiceBusSessionProcessorClientBuilder queueName(String queueName) {
            sessionReceiverClientBuilder.queueName(queueName);
            return this;
        }

        /**
         * Sets the receive mode for the processor.
         * @param receiveMode Mode for receiving messages.
         *
         * @return The modified {@link ServiceBusSessionProcessorClientBuilder} object.
         */
        public ServiceBusSessionProcessorClientBuilder receiveMode(ServiceBusReceiveMode receiveMode) {
            sessionReceiverClientBuilder.receiveMode(receiveMode);
            return this;
        }

        /**
         * Sets the type of the {@link SubQueue} to connect to. Azure Service Bus queues and subscriptions provide a
         * secondary sub-queue, called a dead-letter queue (DLQ).
         *
         * @param subQueue The type of the sub queue.
         *
         * @return The modified {@link ServiceBusSessionProcessorClientBuilder} object.
         * @see #queueName A queuename or #topicName A topic name should be set as well.
         * @see SubQueue
         */
        public ServiceBusSessionProcessorClientBuilder subQueue(SubQueue subQueue) {
            this.sessionReceiverClientBuilder.subQueue(subQueue);
            return this;
        }

        /**
         * Sets the name of the subscription in the topic to listen to. <b>{@link #topicName(String)} must also be set.
         * </b>
         * @param subscriptionName Name of the subscription.
         *
         * @return The modified {@link ServiceBusSessionProcessorClientBuilder} object.
         * @see #topicName A topic name should be set as well.
         */
        public ServiceBusSessionProcessorClientBuilder subscriptionName(String subscriptionName) {
            sessionReceiverClientBuilder.subscriptionName(subscriptionName);
            return this;
        }

        /**
         * Sets the name of the topic. <b>{@link #subscriptionName(String)} must also be set.</b>
         * @param topicName Name of the topic.
         *
         * @return The modified {@link ServiceBusSessionProcessorClientBuilder} object.
         * @see #subscriptionName A subscription name should be set as well.
         */
        public ServiceBusSessionProcessorClientBuilder topicName(String topicName) {
            sessionReceiverClientBuilder.topicName(topicName);
            return this;
        }

        /**
         * The message processing callback for the processor that will be executed when a message is received.
         * @param processMessage The message processing consumer that will be executed when a message is received.
         *
         * @return The updated {@link ServiceBusProcessorClientBuilder} object.
         */
        public ServiceBusSessionProcessorClientBuilder processMessage(
            Consumer<ServiceBusReceivedMessageContext> processMessage) {
            this.processMessage = processMessage;
            return this;
        }

        /**
         * The error handler for the processor which will be invoked in the event of an error while receiving messages.
         * @param processError The error handler which will be executed when an error occurs.
         *
         * @return The updated {@link ServiceBusProcessorClientBuilder} object
         */
        public ServiceBusSessionProcessorClientBuilder processError(
            Consumer<ServiceBusErrorContext> processError) {
            this.processError = processError;
            return this;
        }

        /**
         * Max concurrent messages that this processor should process.
         *
         * @param maxConcurrentCalls max concurrent messages that this processor should process.
         *
         * @return The updated {@link ServiceBusSessionProcessorClientBuilder} object.
         * @throws IllegalArgumentException if {@code maxConcurrentCalls} is less than 1.
         */
        public ServiceBusSessionProcessorClientBuilder maxConcurrentCalls(int maxConcurrentCalls) {
            if (maxConcurrentCalls < 1) {
                throw LOGGER.logExceptionAsError(
                    new IllegalArgumentException("'maxConcurrentCalls' cannot be less than 1"));
            }
            processorClientOptions.setMaxConcurrentCalls(maxConcurrentCalls);
            return this;
        }

        /**
         * Disables auto-complete and auto-abandon of received messages. By default, a successfully processed message is
         * {@link ServiceBusReceivedMessageContext#complete() completed}. If an error happens when
         * the message is processed, it is {@link ServiceBusReceivedMessageContext#abandon()
         * abandoned}.
         *
         * @return The modified {@link ServiceBusSessionProcessorClientBuilder} object.
         */
        public ServiceBusSessionProcessorClientBuilder disableAutoComplete() {
            sessionReceiverClientBuilder.disableAutoComplete();
            processorClientOptions.setDisableAutoComplete(true);
            return this;
        }

        /**
         * Creates a <b>session-aware</b> Service Bus processor responsible for reading
         * {@link ServiceBusReceivedMessage messages} from a specific queue or subscription.
         *
         * @return An new {@link ServiceBusProcessorClient} that receives messages from a queue or subscription.
         * @throws IllegalStateException if {@link #queueName(String) queueName} or {@link #topicName(String)
         *     topicName} are not set or, both of these fields are set. It is also thrown if the Service Bus {@link
         *     #connectionString(String) connectionString} contains an {@code EntityPath} that does not match one set in
         *     {@link #queueName(String) queueName} or {@link #topicName(String) topicName}. Lastly, if a {@link
         *     #topicName(String) topicName} is set, but {@link #subscriptionName(String) subscriptionName} is not.
         * @throws IllegalArgumentException Queue or topic name are not set via {@link #queueName(String)
         *     queueName()} or {@link #topicName(String) topicName()}, respectively.
         * @throws NullPointerException if the {@link #processMessage(Consumer)} or {@link #processError(Consumer)}
         *     callbacks are not set.
         */
        public ServiceBusProcessorClient buildProcessorClient() {
            final boolean isSessionProcessorOnV2 = v2StackSupport.isSessionProcessorAsyncReceiveEnabled(configuration);
            if (isSessionProcessorOnV2) {
                processorClientOptions.setV2(true);
            }
            return new ServiceBusProcessorClient(sessionReceiverClientBuilder,
                sessionReceiverClientBuilder.queueName, sessionReceiverClientBuilder.topicName,
                sessionReceiverClientBuilder.subscriptionName,
                Objects.requireNonNull(processMessage, "'processMessage' cannot be null"),
                Objects.requireNonNull(processError, "'processError' cannot be null"), processorClientOptions);
        }
    }

    /**
     * Builder for creating {@link ServiceBusReceiverClient} and {@link ServiceBusReceiverAsyncClient} to consume
     * messages from a <b>session aware</b> Service Bus entity.
     *
     * @see ServiceBusReceiverAsyncClient
     * @see ServiceBusReceiverClient
     */
    @ServiceClientBuilder(serviceClients = {ServiceBusReceiverClient.class, ServiceBusReceiverAsyncClient.class})
    public final class ServiceBusSessionReceiverClientBuilder {
        private boolean enableAutoComplete = true;
        private Integer maxConcurrentSessions = null;
        private int prefetchCount = DEFAULT_PREFETCH_COUNT;
        private String queueName;
        private ServiceBusReceiveMode receiveMode = ServiceBusReceiveMode.PEEK_LOCK;
        private String subscriptionName;
        private String topicName;
        private Duration maxAutoLockRenewDuration = MAX_LOCK_RENEW_DEFAULT_DURATION;
        private Duration sessionIdleTimeout = null;
        private SubQueue subQueue = SubQueue.NONE;

        private ServiceBusSessionReceiverClientBuilder() {
        }

        /**
         * Disables auto-complete and auto-abandon of received messages. By default, a successfully processed message is
         * {@link ServiceBusReceiverAsyncClient#complete(ServiceBusReceivedMessage) completed}. If an error happens when
         * the message is processed, it is {@link ServiceBusReceiverAsyncClient#abandon(ServiceBusReceivedMessage)
         * abandoned}.
         *
         * @return The modified {@link ServiceBusSessionReceiverClientBuilder} object.
         */
        public ServiceBusSessionReceiverClientBuilder disableAutoComplete() {
            this.enableAutoComplete = false;
            return this;
        }

        /**
         * Sets the amount of time to continue auto-renewing the session lock. Setting {@link Duration#ZERO} or
         * {@code null} disables auto-renewal. For {@link ServiceBusReceiveMode#RECEIVE_AND_DELETE RECEIVE_AND_DELETE}
         * mode, auto-renewal is disabled.
         *
         * @param maxAutoLockRenewDuration the amount of time to continue auto-renewing the session lock.
         * {@link Duration#ZERO} or {@code null} indicates that auto-renewal is disabled.
         *
         * @return The updated {@link ServiceBusSessionReceiverClientBuilder} object.
         * @throws IllegalArgumentException If {code maxAutoLockRenewDuration} is negative.
         */
        public ServiceBusSessionReceiverClientBuilder maxAutoLockRenewDuration(Duration maxAutoLockRenewDuration) {
            validateAndThrow(maxAutoLockRenewDuration);
            this.maxAutoLockRenewDuration = maxAutoLockRenewDuration;
            return this;
        }

        /**
         * Sets the maximum amount of time to wait for a message to be received for the currently active session.
         * After this time has elapsed, the processor will close the session and attempt to process another session.
         * If not specified, the {@link AmqpRetryOptions#getTryTimeout()} will be used.
         *
         * @param sessionIdleTimeout Session idle timeout.
         * @return The updated {@link ServiceBusSessionReceiverClientBuilder} object.
         * @throws IllegalArgumentException If {code maxAutoLockRenewDuration} is negative.
         */
        ServiceBusSessionReceiverClientBuilder sessionIdleTimeout(Duration sessionIdleTimeout) {
            validateAndThrow(sessionIdleTimeout);
            this.sessionIdleTimeout = sessionIdleTimeout;
            return this;
        }

        /**
         * Enables session processing roll-over by processing at most {@code maxConcurrentSessions}.
         *
         * @param maxConcurrentSessions Maximum number of concurrent sessions to process at any given time.
         *
         * @return The modified {@link ServiceBusSessionReceiverClientBuilder} object.
         * @throws IllegalArgumentException if {@code maxConcurrentSessions} is less than 1.
         */
        ServiceBusSessionReceiverClientBuilder maxConcurrentSessions(int maxConcurrentSessions) {
            if (maxConcurrentSessions < 1) {
                throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                    "maxConcurrentSessions cannot be less than 1."));
            }

            this.maxConcurrentSessions = maxConcurrentSessions;
            return this;
        }

        /**
         * Sets the prefetch count of the receiver. For both {@link ServiceBusReceiveMode#PEEK_LOCK PEEK_LOCK} and
         * {@link ServiceBusReceiveMode#RECEIVE_AND_DELETE RECEIVE_AND_DELETE} modes the default value is 1.
         *
         * Prefetch speeds up the message flow by aiming to have a message readily available for local retrieval when
         * and before the application asks for one using {@link ServiceBusReceiverAsyncClient#receiveMessages()}.
         * Setting a non-zero value will prefetch that number of messages. Setting the value to zero turns prefetch
         * off.
         *
         * @param prefetchCount The prefetch count.
         *
         * @return The modified {@link ServiceBusSessionReceiverClientBuilder} object.
         * @throws IllegalArgumentException If {code prefetchCount} is negative.
         */
        public ServiceBusSessionReceiverClientBuilder prefetchCount(int prefetchCount) {
            validateAndThrow(prefetchCount);
            this.prefetchCount = prefetchCount;
            return this;
        }

        /**
         * Sets the name of the queue to create a receiver for.
         *
         * @param queueName Name of the queue.
         *
         * @return The modified {@link ServiceBusSessionReceiverClientBuilder} object.
         */
        public ServiceBusSessionReceiverClientBuilder queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * Sets the receive mode for the receiver.
         *
         * @param receiveMode Mode for receiving messages.
         *
         * @return The modified {@link ServiceBusSessionReceiverClientBuilder} object.
         */
        public ServiceBusSessionReceiverClientBuilder receiveMode(ServiceBusReceiveMode receiveMode) {
            this.receiveMode = receiveMode;
            return this;
        }

        /**
         * Sets the type of the {@link SubQueue} to connect to. Azure Service Bus queues and subscriptions provide a
         * secondary sub-queue, called a dead-letter queue (DLQ).
         *
         * @param subQueue The type of the sub queue.
         *
         * @return The modified {@link ServiceBusSessionReceiverClientBuilder} object.
         * @see #queueName A queuename or #topicName A topic name should be set as well.
         * @see SubQueue
         */
        public ServiceBusSessionReceiverClientBuilder subQueue(SubQueue subQueue) {
            this.subQueue = subQueue;
            return this;
        }

        /**
         * Sets the name of the subscription in the topic to listen to. <b>{@link #topicName(String)} must also be set.
         * </b>
         *
         * @param subscriptionName Name of the subscription.
         *
         * @return The modified {@link ServiceBusSessionReceiverClientBuilder} object.
         * @see #topicName A topic name should be set as well.
         */
        public ServiceBusSessionReceiverClientBuilder subscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * Sets the name of the topic. <b>{@link #subscriptionName(String)} must also be set.</b>
         *
         * @param topicName Name of the topic.
         *
         * @return The modified {@link ServiceBusSessionReceiverClientBuilder} object.
         * @see #subscriptionName A subscription name should be set as well.
         */
        public ServiceBusSessionReceiverClientBuilder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        /**
         * Creates an <b>asynchronous</b>, <b>session-aware</b> Service Bus receiver responsible for reading {@link
         * ServiceBusMessage messages} from a specific queue or subscription.
         *
         * @return An new {@link ServiceBusReceiverAsyncClient} that receives messages from a queue or subscription.
         * @throws IllegalStateException if {@link #queueName(String) queueName} or {@link #topicName(String)
         *     topicName} are not set or, both of these fields are set. It is also thrown if the Service Bus {@link
         *     #connectionString(String) connectionString} contains an {@code EntityPath} that does not match one set in
         *     {@link #queueName(String) queueName} or {@link #topicName(String) topicName}. Lastly, if a {@link
         *     #topicName(String) topicName} is set, but {@link #subscriptionName(String) subscriptionName} is not.
         * @throws IllegalArgumentException Queue or topic name are not set via {@link #queueName(String)
         *     queueName()} or {@link #topicName(String) topicName()}, respectively.
         */
        ServiceBusReceiverAsyncClient buildAsyncClientForProcessor() {
            final MessagingEntityType entityType = validateEntityPaths(connectionStringEntityName, topicName,
                queueName);
            final String entityPath = getEntityPath(entityType, queueName, topicName, subscriptionName,
                subQueue);

            if (enableAutoComplete && receiveMode == ServiceBusReceiveMode.RECEIVE_AND_DELETE) {
                LOGGER.warning("'enableAutoComplete' is not needed in for RECEIVE_AND_DELETE mode.");
                enableAutoComplete = false;
            }

            if (receiveMode == ServiceBusReceiveMode.RECEIVE_AND_DELETE) {
                maxAutoLockRenewDuration = Duration.ZERO;
            }

            final ServiceBusConnectionProcessor connectionProcessor = getOrCreateConnectionProcessor(messageSerializer);

            final ReceiverOptions receiverOptions = createUnnamedSessionOptions(receiveMode, prefetchCount,
                maxAutoLockRenewDuration, enableAutoComplete, maxConcurrentSessions, sessionIdleTimeout);

            final String clientIdentifier;
            if (clientOptions instanceof AmqpClientOptions) {
                String clientOptionIdentifier = ((AmqpClientOptions) clientOptions).getIdentifier();
                clientIdentifier = CoreUtils.isNullOrEmpty(clientOptionIdentifier) ? UUID.randomUUID().toString() : clientOptionIdentifier;
            } else {
                clientIdentifier = UUID.randomUUID().toString();
            }

            final ServiceBusReceiverInstrumentation instrumentation = new ServiceBusReceiverInstrumentation(
                createTracer(), createMeter(), connectionProcessor.getFullyQualifiedNamespace(),
                entityPath, subscriptionName, ReceiverKind.PROCESSOR);

            final ServiceBusSessionManager sessionManager = new ServiceBusSessionManager(entityPath, entityType,
                connectionProcessor, messageSerializer, receiverOptions, clientIdentifier, instrumentation.getTracer());

            return new ServiceBusReceiverAsyncClient(connectionProcessor.getFullyQualifiedNamespace(), entityPath,
                entityType, receiverOptions, connectionProcessor, ServiceBusConstants.OPERATION_TIMEOUT,
                instrumentation, messageSerializer, ServiceBusClientBuilder.this::onClientClose, sessionManager);
        }

        SessionsMessagePump buildPumpForProcessor(ClientLogger logger,
            Consumer<ServiceBusReceivedMessageContext> processMessage, Consumer<ServiceBusErrorContext> processError,
            int concurrencyPerSession) {
            if (enableAutoComplete && receiveMode == ServiceBusReceiveMode.RECEIVE_AND_DELETE) {
                LOGGER.warning("'enableAutoComplete' is not needed in for RECEIVE_AND_DELETE mode.");
                enableAutoComplete = false;
            }

            if (receiveMode == ServiceBusReceiveMode.RECEIVE_AND_DELETE) {
                maxAutoLockRenewDuration = Duration.ZERO;
            }

            final AmqpRetryPolicy retryPolicy = RetryUtil.getRetryPolicy(retryOptions);
            final MessagingEntityType entityType = validateEntityPaths(connectionStringEntityName, topicName, queueName);
            final String entityPath = getEntityPath(entityType, queueName, topicName, subscriptionName, subQueue);
            final String clientIdentifier;
            if (clientOptions instanceof AmqpClientOptions) {
                String clientOptionIdentifier = ((AmqpClientOptions) clientOptions).getIdentifier();
                clientIdentifier = CoreUtils.isNullOrEmpty(clientOptionIdentifier) ? UUID.randomUUID().toString() : clientOptionIdentifier;
            } else {
                clientIdentifier = UUID.randomUUID().toString();
            }
            final ReactorConnectionCache<ServiceBusReactorAmqpConnection> connectionCache = getOrCreateConnectionCache(messageSerializer);
            final Mono<ServiceBusManagementNode> managementNode = connectionCache.get()
                .flatMap(connection -> connection.getManagementNode(entityPath, entityType));

            final ServiceBusSessionAcquirer sessionAcquirer = new ServiceBusSessionAcquirer(logger, clientIdentifier,
                entityPath, entityType, receiveMode, retryOptions.getTryTimeout(), connectionCache);

            final ServiceBusReceiverInstrumentation instrumentation = new ServiceBusReceiverInstrumentation(
                createTracer(), createMeter(), connectionCache.getFullyQualifiedNamespace(),
                entityPath, subscriptionName, ReceiverKind.PROCESSOR);

            final Runnable onTerminate = v2StackSupport::onClientClose;

            return new SessionsMessagePump(clientIdentifier, connectionCache.getFullyQualifiedNamespace(), connectionCache.getEntityPath(),
                receiveMode, instrumentation, sessionAcquirer, maxAutoLockRenewDuration, sessionIdleTimeout, maxConcurrentSessions,
                concurrencyPerSession, prefetchCount, enableAutoComplete, managementNode, messageSerializer,
                retryPolicy, processMessage, processError, onTerminate);
        }

        /**
         * Creates an <b>asynchronous</b>, <b>session-aware</b> Service Bus receiver responsible for reading {@link
         * ServiceBusMessage messages} from a specific queue or subscription.
         *
         * @return An new {@link ServiceBusSessionReceiverAsyncClient} that receives messages from a queue or
         *      subscription.
         * @throws IllegalStateException if {@link #queueName(String) queueName} or {@link #topicName(String)
         *     topicName} are not set or, both of these fields are set. It is also thrown if the Service Bus {@link
         *     #connectionString(String) connectionString} contains an {@code EntityPath} that does not match one set in
         *     {@link #queueName(String) queueName} or {@link #topicName(String) topicName}. Lastly, if a {@link
         *     #topicName(String) topicName} is set, but {@link #subscriptionName(String) subscriptionName} is not.
         * @throws IllegalArgumentException Queue or topic name are not set via {@link #queueName(String)
         *     queueName()} or {@link #topicName(String) topicName()}, respectively.
         */
        public ServiceBusSessionReceiverAsyncClient buildAsyncClient() {
            return buildAsyncClient(true, false);
        }

        /**
         * Creates a <b>synchronous</b>, <b>session-aware</b> Service Bus receiver responsible for reading {@link
         * ServiceBusMessage messages} from a specific queue or subscription.
         *
         * @return An new {@link ServiceBusReceiverClient} that receives messages from a queue or subscription.
         * @throws IllegalStateException if {@link #queueName(String) queueName} or {@link #topicName(String)
         *     topicName} are not set or, both of these fields are set. It is also thrown if the Service Bus {@link
         *     #connectionString(String) connectionString} contains an {@code EntityPath} that does not match one set in
         *     {@link #queueName(String) queueName} or {@link #topicName(String) topicName}. Lastly, if a {@link
         *     #topicName(String) topicName} is set, but {@link #subscriptionName(String) subscriptionName} is not.
         * @throws IllegalArgumentException Queue or topic name are not set via {@link #queueName(String)
         *     queueName()} or {@link #topicName(String) topicName()}, respectively.
         */
        public ServiceBusSessionReceiverClient buildClient() {
            final boolean isPrefetchDisabled = prefetchCount == 0;
            return new ServiceBusSessionReceiverClient(buildAsyncClient(false, true),
                isPrefetchDisabled,
                MessageUtils.getTotalTimeout(retryOptions));
        }

        // Common function to build Session-Enabled Receiver-Client - For Async[Reactor|Processor]Client Or to back SyncClient.
        private ServiceBusSessionReceiverAsyncClient buildAsyncClient(boolean isAutoCompleteAllowed, boolean syncConsumer) {
            final MessagingEntityType entityType = validateEntityPaths(connectionStringEntityName, topicName,
                queueName);
            final String entityPath = getEntityPath(entityType, queueName, topicName, subscriptionName,
                SubQueue.NONE);

            if (!isAutoCompleteAllowed && enableAutoComplete) {
                LOGGER.warning(
                    "'enableAutoComplete' is not supported in synchronous client except through callback receive.");
                enableAutoComplete = false;
            } else if (enableAutoComplete && receiveMode == ServiceBusReceiveMode.RECEIVE_AND_DELETE) {
                LOGGER.warning("'enableAutoComplete' is not needed in for RECEIVE_AND_DELETE mode.");
                enableAutoComplete = false;
            }

            if (receiveMode == ServiceBusReceiveMode.RECEIVE_AND_DELETE) {
                maxAutoLockRenewDuration = Duration.ZERO;
            }

            // Note: Support for Session-Enabled Clients on the V2-Stack is not in the first phase, using ServiceBusConnectionProcessor from the V1 stack.
            final ServiceBusConnectionProcessor connectionProcessor = getOrCreateConnectionProcessor(messageSerializer);
            final ReceiverOptions receiverOptions = createUnnamedSessionOptions(receiveMode, prefetchCount,
                maxAutoLockRenewDuration, enableAutoComplete, maxConcurrentSessions, sessionIdleTimeout);

            final String clientIdentifier;
            if (clientOptions instanceof AmqpClientOptions) {
                String clientOptionIdentifier = ((AmqpClientOptions) clientOptions).getIdentifier();
                clientIdentifier = CoreUtils.isNullOrEmpty(clientOptionIdentifier) ? UUID.randomUUID().toString() : clientOptionIdentifier;
            } else {
                clientIdentifier = UUID.randomUUID().toString();
            }

            final ServiceBusReceiverInstrumentation instrumentation = new ServiceBusReceiverInstrumentation(
                createTracer(), createMeter(), connectionProcessor.getFullyQualifiedNamespace(), entityPath, subscriptionName,
                ReceiverKind.ASYNC_RECEIVER);
            return new ServiceBusSessionReceiverAsyncClient(connectionProcessor.getFullyQualifiedNamespace(),
                entityPath, entityType, receiverOptions, connectionProcessor, instrumentation, messageSerializer,
                ServiceBusClientBuilder.this::onClientClose, clientIdentifier);
        }
    }

    /**
     * Builder for creating {@link ServiceBusProcessorClient} to consume messages from a Service Bus entity.
     * {@link ServiceBusProcessorClient ServiceBusProcessorClients} provides a push-based mechanism that notifies
     * the message processing callback when a message is received or the error handle when an error is observed. To
     * create an instance, therefore, configuring the two callbacks - {@link #processMessage(Consumer)} and
     * {@link #processError(Consumer)} are necessary. By default, a {@link ServiceBusProcessorClient} is configured
     * with auto-completion and auto-lock renewal capabilities.
     *
     * <p><strong>Sample code to instantiate a processor client and receive in PeekLock mode</strong></p>
     * <!-- src_embed com.azure.messaging.servicebus.servicebusprocessorclient#receive-mode-peek-lock-instantiation -->
     * <pre>
     * Consumer&lt;ServiceBusReceivedMessageContext&gt; processMessage = context -&gt; &#123;
     *     final ServiceBusReceivedMessage message = context.getMessage&#40;&#41;;
     *     &#47;&#47; Randomly complete or abandon each message. Ideally, in real-world scenarios, if the business logic
     *     &#47;&#47; handling message reaches desired state such that it doesn't require Service Bus to redeliver
     *     &#47;&#47; the same message, then context.complete&#40;&#41; should be called otherwise context.abandon&#40;&#41;.
     *     final boolean success = Math.random&#40;&#41; &lt; 0.5;
     *     if &#40;success&#41; &#123;
     *         try &#123;
     *             context.complete&#40;&#41;;
     *         &#125; catch &#40;Exception completionError&#41; &#123;
     *             System.out.printf&#40;&quot;Completion of the message %s failed&#92;n&quot;, message.getMessageId&#40;&#41;&#41;;
     *             completionError.printStackTrace&#40;&#41;;
     *         &#125;
     *     &#125; else &#123;
     *         try &#123;
     *             context.abandon&#40;&#41;;
     *         &#125; catch &#40;Exception abandonError&#41; &#123;
     *             System.out.printf&#40;&quot;Abandoning of the message %s failed&#92;n&quot;, message.getMessageId&#40;&#41;&#41;;
     *             abandonError.printStackTrace&#40;&#41;;
     *         &#125;
     *     &#125;
     * &#125;;
     *
     * &#47;&#47; Sample code that gets called if there's an error
     * Consumer&lt;ServiceBusErrorContext&gt; processError = errorContext -&gt; &#123;
     *     System.err.println&#40;&quot;Error occurred while receiving message: &quot; + errorContext.getException&#40;&#41;&#41;;
     * &#125;;
     *
     * &#47;&#47; create the processor client via the builder and its sub-builder
     * ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder&#40;&#41;
     *     .connectionString&#40;&quot;&lt;&lt; CONNECTION STRING FOR THE SERVICE BUS NAMESPACE &gt;&gt;&quot;&#41;
     *     .processor&#40;&#41;
     *     .queueName&#40;&quot;&lt;&lt; QUEUE NAME &gt;&gt;&quot;&#41;
     *     .receiveMode&#40;ServiceBusReceiveMode.PEEK_LOCK&#41;
     *     .disableAutoComplete&#40;&#41;  &#47;&#47; Make sure to explicitly opt in to manual settlement &#40;e.g. complete, abandon&#41;.
     *     .processMessage&#40;processMessage&#41;
     *     .processError&#40;processError&#41;
     *     .disableAutoComplete&#40;&#41;
     *     .buildProcessorClient&#40;&#41;;
     *
     * &#47;&#47; Starts the processor in the background and returns immediately
     * processorClient.start&#40;&#41;;
     * </pre>
     * <!-- end com.azure.messaging.servicebus.servicebusprocessorclient#receive-mode-peek-lock-instantiation -->
     * <p><strong>Sample code to instantiate a processor client and receive in ReceiveAndDelete mode</strong></p>
     * <!-- src_embed com.azure.messaging.servicebus.servicebusprocessorclient#receive-mode-receive-and-delete-instantiation -->
     * <pre>
     * Consumer&lt;ServiceBusReceivedMessageContext&gt; processMessage = context -&gt; &#123;
     *     final ServiceBusReceivedMessage message = context.getMessage&#40;&#41;;
     *     System.out.printf&#40;&quot;Processing message. Session: %s, Sequence #: %s. Contents: %s%n&quot;,
     *         message.getSessionId&#40;&#41;, message.getSequenceNumber&#40;&#41;, message.getBody&#40;&#41;&#41;;
     * &#125;;
     *
     * &#47;&#47; Sample code that gets called if there's an error
     * Consumer&lt;ServiceBusErrorContext&gt; processError = errorContext -&gt; &#123;
     *     System.err.println&#40;&quot;Error occurred while receiving message: &quot; + errorContext.getException&#40;&#41;&#41;;
     * &#125;;
     *
     * &#47;&#47; create the processor client via the builder and its sub-builder
     * ServiceBusProcessorClient processorClient = new ServiceBusClientBuilder&#40;&#41;
     *     .connectionString&#40;&quot;&lt;&lt; CONNECTION STRING FOR THE SERVICE BUS NAMESPACE &gt;&gt;&quot;&#41;
     *     .processor&#40;&#41;
     *     .queueName&#40;&quot;&lt;&lt; QUEUE NAME &gt;&gt;&quot;&#41;
     *     .receiveMode&#40;ServiceBusReceiveMode.RECEIVE_AND_DELETE&#41;
     *     .processMessage&#40;processMessage&#41;
     *     .processError&#40;processError&#41;
     *     .disableAutoComplete&#40;&#41;
     *     .buildProcessorClient&#40;&#41;;
     *
     * &#47;&#47; Starts the processor in the background and returns immediately
     * processorClient.start&#40;&#41;;
     * </pre>
     * <!-- end com.azure.messaging.servicebus.servicebusprocessorclient#receive-mode-receive-and-delete-instantiation -->
     *
     * @see ServiceBusProcessorClient
     */
    public final class ServiceBusProcessorClientBuilder {
        private final ServiceBusReceiverClientBuilder serviceBusReceiverClientBuilder;
        private final ServiceBusProcessorClientOptions processorClientOptions;
        private Consumer<ServiceBusReceivedMessageContext> processMessage;
        private Consumer<ServiceBusErrorContext> processError;

        private ServiceBusProcessorClientBuilder() {
            serviceBusReceiverClientBuilder = new ServiceBusReceiverClientBuilder();
            processorClientOptions = new ServiceBusProcessorClientOptions()
                .setMaxConcurrentCalls(1);
        }

        /**
         * Sets the prefetch count of the processor. For both {@link ServiceBusReceiveMode#PEEK_LOCK PEEK_LOCK} and
         * {@link ServiceBusReceiveMode#RECEIVE_AND_DELETE RECEIVE_AND_DELETE} modes the default value is 0.
         *
         * Prefetch speeds up the message flow by aiming to have a message readily available for local retrieval when
         * and before the application starts the processor.
         * Setting a non-zero value will prefetch that number of messages. Setting the value to zero turns prefetch off.
         *
         * @param prefetchCount The prefetch count.
         *
         * @return The modified {@link ServiceBusProcessorClientBuilder} object.
         */
        public ServiceBusProcessorClientBuilder prefetchCount(int prefetchCount) {
            serviceBusReceiverClientBuilder.prefetchCount(prefetchCount);
            return this;
        }

        /**
         * Sets the name of the queue to create a processor for.
         * @param queueName Name of the queue.
         *
         * @return The modified {@link ServiceBusProcessorClientBuilder} object.
         */
        public ServiceBusProcessorClientBuilder queueName(String queueName) {
            serviceBusReceiverClientBuilder.queueName(queueName);
            return this;
        }

        /**
         * Sets the receive mode for the processor.
         * @param receiveMode Mode for receiving messages.
         *
         * @return The modified {@link ServiceBusProcessorClientBuilder} object.
         */
        public ServiceBusProcessorClientBuilder receiveMode(ServiceBusReceiveMode receiveMode) {
            serviceBusReceiverClientBuilder.receiveMode(receiveMode);
            return this;
        }

        /**
         * Sets the type of the {@link SubQueue} to connect to. Azure Service Bus queues and subscriptions provide a
         * secondary sub-queue, called a dead-letter queue (DLQ).
         *
         * @param subQueue The type of the sub queue.
         *
         * @return The modified {@link ServiceBusProcessorClientBuilder} object.
         * @see #queueName A queuename or #topicName A topic name should be set as well.
         * @see SubQueue
         */
        public ServiceBusProcessorClientBuilder subQueue(SubQueue subQueue) {
            serviceBusReceiverClientBuilder.subQueue(subQueue);
            return this;
        }

        /**
         * Sets the name of the subscription in the topic to listen to. <b>{@link #topicName(String)} must also be set.
         * </b>
         * @param subscriptionName Name of the subscription.
         *
         * @return The modified {@link ServiceBusProcessorClientBuilder} object.
         * @see #topicName A topic name should be set as well.
         */
        public ServiceBusProcessorClientBuilder subscriptionName(String subscriptionName) {
            serviceBusReceiverClientBuilder.subscriptionName(subscriptionName);
            return this;
        }

        /**
         * Sets the name of the topic. <b>{@link #subscriptionName(String)} must also be set.</b>
         * @param topicName Name of the topic.
         *
         * @return The modified {@link ServiceBusProcessorClientBuilder} object.
         * @see #subscriptionName A subscription name should be set as well.
         */
        public ServiceBusProcessorClientBuilder topicName(String topicName) {
            serviceBusReceiverClientBuilder.topicName(topicName);
            return this;
        }

        /**
         * The message processing callback for the processor which will be executed when a message is received.
         * @param processMessage The message processing consumer that will be executed when a message is received.
         *
         * @return The updated {@link ServiceBusProcessorClientBuilder} object.
         */
        public ServiceBusProcessorClientBuilder processMessage(
            Consumer<ServiceBusReceivedMessageContext> processMessage) {
            this.processMessage = processMessage;
            return this;
        }

        /**
         * The error handler for the processor which will be invoked in the event of an error while receiving messages.
         * @param processError The error handler which will be executed when an error occurs.
         *
         * @return The updated {@link ServiceBusProcessorClientBuilder} object
         */
        public ServiceBusProcessorClientBuilder processError(Consumer<ServiceBusErrorContext> processError) {
            this.processError = processError;
            return this;
        }

        /**
         * Sets the amount of time to continue auto-renewing the lock. Setting {@link Duration#ZERO} or {@code null}
         * disables auto-renewal. For {@link ServiceBusReceiveMode#RECEIVE_AND_DELETE RECEIVE_AND_DELETE} mode,
         * auto-renewal is disabled.
         *
         * @param maxAutoLockRenewDuration the amount of time to continue auto-renewing the lock. {@link Duration#ZERO}
         * or {@code null} indicates that auto-renewal is disabled.
         *
         * @return The updated {@link ServiceBusProcessorClientBuilder} object.
         * @throws IllegalArgumentException If {code maxAutoLockRenewDuration} is negative.
         */
        public ServiceBusProcessorClientBuilder maxAutoLockRenewDuration(Duration maxAutoLockRenewDuration) {
            validateAndThrow(maxAutoLockRenewDuration);
            serviceBusReceiverClientBuilder.maxAutoLockRenewDuration(maxAutoLockRenewDuration);
            return this;
        }

        /**
         * Max concurrent messages that this processor should process. By default, this is set to 1.
         *
         * @param maxConcurrentCalls max concurrent messages that this processor should process.
         * @return The updated {@link ServiceBusProcessorClientBuilder} object.
         * @throws IllegalArgumentException if the {@code maxConcurrentCalls} is set to a value less than 1.
         */
        public ServiceBusProcessorClientBuilder maxConcurrentCalls(int maxConcurrentCalls) {
            if (maxConcurrentCalls < 1) {
                throw LOGGER.logExceptionAsError(
                    new IllegalArgumentException("'maxConcurrentCalls' cannot be less than 1"));
            }
            processorClientOptions.setMaxConcurrentCalls(maxConcurrentCalls);
            return this;
        }

        /**
         * Disables auto-complete and auto-abandon of received messages. By default, a successfully processed message is
         * {@link ServiceBusReceivedMessageContext#complete() completed}. If an error happens when
         * the message is processed, it is {@link ServiceBusReceivedMessageContext#abandon()
         * abandoned}.
         *
         * @return The modified {@link ServiceBusProcessorClientBuilder} object.
         */
        public ServiceBusProcessorClientBuilder disableAutoComplete() {
            serviceBusReceiverClientBuilder.disableAutoComplete();
            processorClientOptions.setDisableAutoComplete(true);
            return this;
        }

        /**
         * Creates Service Bus message processor responsible for reading {@link ServiceBusReceivedMessage
         * messages} from a specific queue or subscription.
         *
         * @return An new {@link ServiceBusProcessorClient} that processes messages from a queue or subscription.
         * @throws IllegalStateException if {@link #queueName(String) queueName} or {@link #topicName(String)
         *     topicName} are not set or, both of these fields are set. It is also thrown if the Service Bus {@link
         *     #connectionString(String) connectionString} contains an {@code EntityPath} that does not match one set in
         *     {@link #queueName(String) queueName} or {@link #topicName(String) topicName}. Lastly, if a {@link
         *     #topicName(String) topicName} is set, but {@link #subscriptionName(String) subscriptionName} is not.
         * @throws IllegalArgumentException Queue or topic name are not set via {@link #queueName(String)
         *     queueName()} or {@link #topicName(String) topicName()}, respectively.
         * @throws NullPointerException if the {@link #processMessage(Consumer)} or {@link #processError(Consumer)}
         *     callbacks are not set.
         */
        public ServiceBusProcessorClient buildProcessorClient() {
            final boolean isNonSessionProcessorV2 = v2StackSupport.isNonSessionAsyncReceiveEnabled(configuration);
            if (isNonSessionProcessorV2) {
                processorClientOptions.setV2(true);
                validateReceiverClientBuilder();
            }
            // Build the Processor Client for Non-session receiving.
            return new ServiceBusProcessorClient(serviceBusReceiverClientBuilder,
                    serviceBusReceiverClientBuilder.queueName, serviceBusReceiverClientBuilder.topicName,
                    serviceBusReceiverClientBuilder.subscriptionName,
                Objects.requireNonNull(processMessage, "'processMessage' cannot be null"),
                Objects.requireNonNull(processError, "'processError' cannot be null"), processorClientOptions);
        }

        // In V1, the ServiceBusProcessorClient Constructor builds the ServiceBusReceiverAsyncClient eagerly. In V2 Processor,
        // the client will be built lazily, i.e., when the application calls start() API. This is a helper method for
        // V2 Processor build time input validations.
        private void validateReceiverClientBuilder() {
            final ServiceBusReceiverClientBuilder builder = serviceBusReceiverClientBuilder;
            final MessagingEntityType entityType = validateEntityPaths(connectionStringEntityName, builder.topicName, builder.queueName);
            getEntityPath(entityType, builder.queueName, builder.topicName, builder.subscriptionName, builder.subQueue);
            getConnectionOptions();
        }
    }

    /**
     * Builder for creating {@link ServiceBusReceiverClient} and {@link ServiceBusReceiverAsyncClient} to consume
     * messages from Service Bus.
     *
     * @see ServiceBusReceiverAsyncClient
     * @see ServiceBusReceiverClient
     */
    @ServiceClientBuilder(serviceClients = {ServiceBusReceiverClient.class, ServiceBusReceiverAsyncClient.class})
    public final class ServiceBusReceiverClientBuilder {
        private boolean enableAutoComplete = true;
        private int prefetchCount = DEFAULT_PREFETCH_COUNT;
        private String queueName;
        private SubQueue subQueue;
        private ServiceBusReceiveMode receiveMode = ServiceBusReceiveMode.PEEK_LOCK;
        private String subscriptionName;
        private String topicName;
        private Duration maxAutoLockRenewDuration = MAX_LOCK_RENEW_DEFAULT_DURATION;
        private ServiceBusReceiverClientBuilder() {
        }

        /**
         * Disables auto-complete and auto-abandon of received messages. By default, a successfully processed message is
         * {@link ServiceBusReceiverAsyncClient#complete(ServiceBusReceivedMessage) completed}. If an error happens when
         * the message is processed, it is {@link ServiceBusReceiverAsyncClient#abandon(ServiceBusReceivedMessage)
         * abandoned}.
         *
         * @return The modified {@link ServiceBusReceiverClientBuilder} object.
         */
        public ServiceBusReceiverClientBuilder disableAutoComplete() {
            this.enableAutoComplete = false;
            return this;
        }

        /**
         * Sets the amount of time to continue auto-renewing the lock. Setting {@link Duration#ZERO} or {@code null}
         * disables auto-renewal. For {@link ServiceBusReceiveMode#RECEIVE_AND_DELETE RECEIVE_AND_DELETE} mode,
         * auto-renewal is disabled.
         *
         * @param maxAutoLockRenewDuration the amount of time to continue auto-renewing the lock. {@link Duration#ZERO}
         * or {@code null} indicates that auto-renewal is disabled.
         *
         * @return The updated {@link ServiceBusReceiverClientBuilder} object.
         * @throws IllegalArgumentException If {code maxAutoLockRenewDuration} is negative.
         */
        public ServiceBusReceiverClientBuilder maxAutoLockRenewDuration(Duration maxAutoLockRenewDuration) {
            validateAndThrow(maxAutoLockRenewDuration);
            this.maxAutoLockRenewDuration = maxAutoLockRenewDuration;
            return this;
        }

        /**
         * Sets the prefetch count of the receiver. For both {@link ServiceBusReceiveMode#PEEK_LOCK PEEK_LOCK} and
         * {@link ServiceBusReceiveMode#RECEIVE_AND_DELETE RECEIVE_AND_DELETE} modes the default value is 1.
         *
         * Prefetch speeds up the message flow by aiming to have a message readily available for local retrieval when
         * and before the application asks for one using {@link ServiceBusReceiverAsyncClient#receiveMessages()}.
         * Setting a non-zero value will prefetch that number of messages. Setting the value to zero turns prefetch
         * off.
         *
         * @param prefetchCount The prefetch count.
         *
         * @return The modified {@link ServiceBusReceiverClientBuilder} object.
         * @throws IllegalArgumentException If {code prefetchCount} is negative.
         */
        public ServiceBusReceiverClientBuilder prefetchCount(int prefetchCount) {
            validateAndThrow(prefetchCount);
            this.prefetchCount = prefetchCount;
            return this;
        }

        /**
         * Sets the name of the queue to create a receiver for.
         *
         * @param queueName Name of the queue.
         *
         * @return The modified {@link ServiceBusReceiverClientBuilder} object.
         */
        public ServiceBusReceiverClientBuilder queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * Sets the receive mode for the receiver.
         *
         * @param receiveMode Mode for receiving messages.
         *
         * @return The modified {@link ServiceBusReceiverClientBuilder} object.
         */
        public ServiceBusReceiverClientBuilder receiveMode(ServiceBusReceiveMode receiveMode) {
            this.receiveMode = receiveMode;
            return this;
        }

        /**
         * Sets the type of the {@link SubQueue} to connect to.
         *
         * @param subQueue The type of the sub queue.
         *
         * @return The modified {@link ServiceBusReceiverClientBuilder} object.
         * @see #queueName A queuename or #topicName A topic name should be set as well.
         */
        public ServiceBusReceiverClientBuilder subQueue(SubQueue subQueue) {
            this.subQueue = subQueue;
            return this;
        }

        /**
         * Sets the name of the subscription in the topic to listen to. <b>{@link #topicName(String)} must also be set.
         * </b>
         *
         * @param subscriptionName Name of the subscription.
         *
         * @return The modified {@link ServiceBusReceiverClientBuilder} object.
         * @see #topicName A topic name should be set as well.
         */
        public ServiceBusReceiverClientBuilder subscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * Sets the name of the topic. <b>{@link #subscriptionName(String)} must also be set.</b>
         *
         * @param topicName Name of the topic.
         *
         * @return The modified {@link ServiceBusReceiverClientBuilder} object.
         * @see #subscriptionName A subscription name should be set as well.
         */
        public ServiceBusReceiverClientBuilder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        /**
         * Creates an <b>asynchronous</b> Service Bus receiver responsible for reading {@link ServiceBusMessage
         * messages} from a specific queue or subscription.
         *
         * @return An new {@link ServiceBusReceiverAsyncClient} that receives messages from a queue or subscription.
         * @throws IllegalStateException if {@link #queueName(String) queueName} or {@link #topicName(String)
         *     topicName} are not set or, both of these fields are set. It is also thrown if the Service Bus {@link
         *     #connectionString(String) connectionString} contains an {@code EntityPath} that does not match one set in
         *     {@link #queueName(String) queueName} or {@link #topicName(String) topicName}. Lastly, if a {@link
         *     #topicName(String) topicName} is set, but {@link #subscriptionName(String) subscriptionName} is not.
         * @throws IllegalArgumentException Queue or topic name are not set via {@link #queueName(String)
         *     queueName()} or {@link #topicName(String) topicName()}, respectively.
         */
        public ServiceBusReceiverAsyncClient buildAsyncClient() {
            return buildAsyncClient(true, ReceiverKind.ASYNC_RECEIVER);
        }

        /**
         * Creates <b>synchronous</b> Service Bus receiver responsible for reading {@link ServiceBusMessage messages}
         * from a specific queue or subscription.
         *
         * @return An new {@link ServiceBusReceiverClient} that receives messages from a queue or subscription.
         * @throws IllegalStateException if {@link #queueName(String) queueName} or {@link #topicName(String)
         *     topicName} are not set or, both of these fields are set. It is also thrown if the Service Bus {@link
         *     #connectionString(String) connectionString} contains an {@code EntityPath} that does not match one set in
         *     {@link #queueName(String) queueName} or {@link #topicName(String) topicName}. Lastly, if a {@link
         *     #topicName(String) topicName} is set, but {@link #subscriptionName(String) subscriptionName} is not.
         * @throws IllegalArgumentException Queue or topic name are not set via {@link #queueName(String)
         *     queueName()} or {@link #topicName(String) topicName()}, respectively.
         */
        public ServiceBusReceiverClient buildClient() {
            final boolean isPrefetchDisabled = prefetchCount == 0;
            return new ServiceBusReceiverClient(buildAsyncClient(false, ReceiverKind.SYNC_RECEIVER),
                isPrefetchDisabled,
                MessageUtils.getTotalTimeout(retryOptions));
        }

        ServiceBusReceiverAsyncClient buildAsyncClientForProcessor() {
            return buildAsyncClient(true, ReceiverKind.PROCESSOR);
        }

        // Common function to build "Non-Session" Receiver-Client - For Async[Reactor|Processor]Client Or to back SyncClient.
        ServiceBusReceiverAsyncClient buildAsyncClient(boolean isAutoCompleteAllowed, ReceiverKind receiverKind) {
            final MessagingEntityType entityType = validateEntityPaths(connectionStringEntityName, topicName,
                queueName);
            final String entityPath = getEntityPath(entityType, queueName, topicName, subscriptionName,
                subQueue);

            if (!isAutoCompleteAllowed && enableAutoComplete) {
                LOGGER.warning(
                    "'enableAutoComplete' is not supported in synchronous client except through callback receive.");
                enableAutoComplete = false;
            } else if (enableAutoComplete && receiveMode == ServiceBusReceiveMode.RECEIVE_AND_DELETE) {
                LOGGER.warning("'enableAutoComplete' is not needed in for RECEIVE_AND_DELETE mode.");
                enableAutoComplete = false;
            }

            if (receiveMode == ServiceBusReceiveMode.RECEIVE_AND_DELETE) {
                maxAutoLockRenewDuration = Duration.ZERO;
            }

            final ConnectionCacheWrapper connectionCacheWrapper;
            final Runnable onClientClose;
            if (receiverKind == ReceiverKind.SYNC_RECEIVER) {
                final boolean syncReceiveOnV2 = v2StackSupport.isNonSessionSyncReceiveEnabled(configuration);
                if (syncReceiveOnV2) {
                    // "Non-Session" Sync Receiver-Client on the V2-Stack.
                    connectionCacheWrapper = new ConnectionCacheWrapper(getOrCreateConnectionCache(messageSerializer));
                    onClientClose = ServiceBusClientBuilder.this.v2StackSupport::onClientClose;
                } else {
                    connectionCacheWrapper = new ConnectionCacheWrapper(getOrCreateConnectionProcessor(messageSerializer));
                    onClientClose = ServiceBusClientBuilder.this::onClientClose;
                }
            } else {
                final boolean asyncReceiveOnV2 = v2StackSupport.isNonSessionAsyncReceiveEnabled(configuration);
                if (asyncReceiveOnV2) {
                    // "Non-Session" Async[Reactor|Processor] Receiver-Client on the V2-Stack.
                    connectionCacheWrapper = new ConnectionCacheWrapper(getOrCreateConnectionCache(messageSerializer));
                    onClientClose = ServiceBusClientBuilder.this.v2StackSupport::onClientClose;
                } else {
                    connectionCacheWrapper = new ConnectionCacheWrapper(getOrCreateConnectionProcessor(messageSerializer));
                    onClientClose = ServiceBusClientBuilder.this::onClientClose;
                }
            }
            final ReceiverOptions receiverOptions = createNonSessionOptions(receiveMode, prefetchCount,
                maxAutoLockRenewDuration, enableAutoComplete);

            final String clientIdentifier;
            if (clientOptions instanceof AmqpClientOptions) {
                String clientOptionIdentifier = ((AmqpClientOptions) clientOptions).getIdentifier();
                clientIdentifier = CoreUtils.isNullOrEmpty(clientOptionIdentifier) ? UUID.randomUUID().toString() : clientOptionIdentifier;
            } else {
                clientIdentifier = UUID.randomUUID().toString();
            }

            final ServiceBusReceiverInstrumentation instrumentation = new ServiceBusReceiverInstrumentation(
                createTracer(), createMeter(), connectionCacheWrapper.getFullyQualifiedNamespace(), entityPath, subscriptionName, receiverKind);
            return new ServiceBusReceiverAsyncClient(connectionCacheWrapper.getFullyQualifiedNamespace(), entityPath,
                entityType, receiverOptions, connectionCacheWrapper, ServiceBusConstants.OPERATION_TIMEOUT,
                instrumentation, messageSerializer, onClientClose, clientIdentifier);
        }
    }

    /**
     * Builder for creating {@link ServiceBusRuleManagerAsyncClient}  to manage Service Bus subscription rules.
     *
     * @see ServiceBusRuleManagerAsyncClient
     */
    @ServiceClientBuilder(serviceClients = {ServiceBusRuleManagerAsyncClient.class, ServiceBusRuleManagerClient.class})
    public final class ServiceBusRuleManagerBuilder {
        private String subscriptionName;
        private String topicName;

        private ServiceBusRuleManagerBuilder() {
        }

        /**
         * Sets the name of the topic. <b>{@link #subscriptionName(String)} must also be set.</b>
         *
         * @param topicName Name of the topic.
         *
         * @return The modified {@link ServiceBusRuleManagerBuilder} object.
         * @see #subscriptionName A subscription name should be set as well.
         */
        public ServiceBusRuleManagerBuilder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        /**
         * Sets the name of the subscription in the topic to manage its rules. <b>{@link #topicName(String)} must also be set.
         * </b>
         * @param subscriptionName Name of the subscription.
         *
         * @return The modified {@link ServiceBusRuleManagerBuilder} object.
         * @see #topicName A topic name should be set as well.
         */
        public ServiceBusRuleManagerBuilder subscriptionName(String subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * Creates an <b>asynchronous</b> {@link ServiceBusRuleManagerAsyncClient} for managing rules of the specific subscription.
         *
         * @return A new {@link ServiceBusRuleManagerAsyncClient} that manages rules for specific subscription.
         * @throws IllegalStateException if {@code topicName} or {@code subscriptionName} is null or empty. It is also
         * thrown if the Service Bus {@link #connectionString(String) connectionString} contains an {@code EntityPath}
         * that does not match one set in {@link #topicName(String) topicName}.
         */
        // Function to build RuleManager-Client.
        public ServiceBusRuleManagerAsyncClient buildAsyncClient() {
            final MessagingEntityType entityType = validateEntityPaths(connectionStringEntityName, topicName,
                null);
            final String entityPath = getEntityPath(entityType, null, topicName, subscriptionName,
                null);
            final ConnectionCacheWrapper connectionCacheWrapper;
            final Runnable onClientClose;
            final boolean isManageRulesOnV2 = v2StackSupport.isSenderAndManageRulesEnabled(configuration);
            if (isManageRulesOnV2) {
                // RuleManager Client (async|sync) on the V2-Stack.
                connectionCacheWrapper = new ConnectionCacheWrapper(getOrCreateConnectionCache(messageSerializer));
                onClientClose = ServiceBusClientBuilder.this.v2StackSupport::onClientClose;
            } else {
                connectionCacheWrapper = new ConnectionCacheWrapper(getOrCreateConnectionProcessor(messageSerializer));
                onClientClose = ServiceBusClientBuilder.this::onClientClose;
            }

            return new ServiceBusRuleManagerAsyncClient(entityPath, entityType, connectionCacheWrapper,
                onClientClose);
        }

        /**
         * Creates a <b>synchronous</b> {@link ServiceBusRuleManagerClient} for managing rules of the specific subscription.
         *
         * @return A new {@link ServiceBusRuleManagerClient} that manages rules for specific subscription.
         * @throws IllegalStateException if {@code topicName} or {@code subscriptionName} is null or empty. It is also
         * thrown if the Service Bus {@link #connectionString(String) connectionString} contains an {@code EntityPath}
         * that does not match one set in {@link #topicName(String) topicName}.
         */
        public ServiceBusRuleManagerClient buildClient() {
            return new ServiceBusRuleManagerClient(buildAsyncClient(), MessageUtils.getTotalTimeout(retryOptions));
        }
    }

    private void validateAndThrow(int prefetchCount) {
        if (prefetchCount < 0) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "prefetchCount (%s) cannot be less than 0.", prefetchCount)));
        }
    }

    private void validateAndThrow(Duration maxLockRenewalDuration) {
        if (maxLockRenewalDuration != null && maxLockRenewalDuration.isNegative()) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "'maxLockRenewalDuration' cannot be negative."));
        }
    }

    private Meter createMeter() {
        return MeterProvider.getDefaultProvider().createMeter(LIBRARY_NAME, LIBRARY_VERSION,
                clientOptions == null ? null : clientOptions.getMetricsOptions());
    }

    private Tracer createTracer() {
        return TracerProvider.getDefaultProvider().createTracer(LIBRARY_NAME, LIBRARY_VERSION,
            AZ_TRACING_NAMESPACE_VALUE, clientOptions == null ? null : clientOptions.getTracingOptions());
    }
}
